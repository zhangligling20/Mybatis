package com.oracle.web.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MonsterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonsterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andMonsteridIsNull() {
            addCriterion("MONSTERID is null");
            return (Criteria) this;
        }

        public Criteria andMonsteridIsNotNull() {
            addCriterion("MONSTERID is not null");
            return (Criteria) this;
        }

        public Criteria andMonsteridEqualTo(Integer value) {
            addCriterion("MONSTERID =", value, "monsterid");
            return (Criteria) this;
        }

        public Criteria andMonsteridNotEqualTo(Integer value) {
            addCriterion("MONSTERID <>", value, "monsterid");
            return (Criteria) this;
        }

        public Criteria andMonsteridGreaterThan(Integer value) {
            addCriterion("MONSTERID >", value, "monsterid");
            return (Criteria) this;
        }

        public Criteria andMonsteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONSTERID >=", value, "monsterid");
            return (Criteria) this;
        }

        public Criteria andMonsteridLessThan(Integer value) {
            addCriterion("MONSTERID <", value, "monsterid");
            return (Criteria) this;
        }

        public Criteria andMonsteridLessThanOrEqualTo(Integer value) {
            addCriterion("MONSTERID <=", value, "monsterid");
            return (Criteria) this;
        }

        public Criteria andMonsteridIn(List<Integer> values) {
            addCriterion("MONSTERID in", values, "monsterid");
            return (Criteria) this;
        }

        public Criteria andMonsteridNotIn(List<Integer> values) {
            addCriterion("MONSTERID not in", values, "monsterid");
            return (Criteria) this;
        }

        public Criteria andMonsteridBetween(Integer value1, Integer value2) {
            addCriterion("MONSTERID between", value1, value2, "monsterid");
            return (Criteria) this;
        }

        public Criteria andMonsteridNotBetween(Integer value1, Integer value2) {
            addCriterion("MONSTERID not between", value1, value2, "monsterid");
            return (Criteria) this;
        }

        public Criteria andMosternameIsNull() {
            addCriterion("MOSTERNAME is null");
            return (Criteria) this;
        }

        public Criteria andMosternameIsNotNull() {
            addCriterion("MOSTERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMosternameEqualTo(String value) {
            addCriterion("MOSTERNAME =", value, "mostername");
            return (Criteria) this;
        }

        public Criteria andMosternameNotEqualTo(String value) {
            addCriterion("MOSTERNAME <>", value, "mostername");
            return (Criteria) this;
        }

        public Criteria andMosternameGreaterThan(String value) {
            addCriterion("MOSTERNAME >", value, "mostername");
            return (Criteria) this;
        }

        public Criteria andMosternameGreaterThanOrEqualTo(String value) {
            addCriterion("MOSTERNAME >=", value, "mostername");
            return (Criteria) this;
        }

        public Criteria andMosternameLessThan(String value) {
            addCriterion("MOSTERNAME <", value, "mostername");
            return (Criteria) this;
        }

        public Criteria andMosternameLessThanOrEqualTo(String value) {
            addCriterion("MOSTERNAME <=", value, "mostername");
            return (Criteria) this;
        }

        public Criteria andMosternameLike(String value) {
            addCriterion("MOSTERNAME like", value, "mostername");
            return (Criteria) this;
        }

        public Criteria andMosternameNotLike(String value) {
            addCriterion("MOSTERNAME not like", value, "mostername");
            return (Criteria) this;
        }

        public Criteria andMosternameIn(List<String> values) {
            addCriterion("MOSTERNAME in", values, "mostername");
            return (Criteria) this;
        }

        public Criteria andMosternameNotIn(List<String> values) {
            addCriterion("MOSTERNAME not in", values, "mostername");
            return (Criteria) this;
        }

        public Criteria andMosternameBetween(String value1, String value2) {
            addCriterion("MOSTERNAME between", value1, value2, "mostername");
            return (Criteria) this;
        }

        public Criteria andMosternameNotBetween(String value1, String value2) {
            addCriterion("MOSTERNAME not between", value1, value2, "mostername");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andEntryIsNull() {
            addCriterion("ENTRY is null");
            return (Criteria) this;
        }

        public Criteria andEntryIsNotNull() {
            addCriterion("ENTRY is not null");
            return (Criteria) this;
        }

        public Criteria andEntryEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRY =", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRY <>", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryGreaterThan(Date value) {
            addCriterionForJDBCDate("ENTRY >", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRY >=", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryLessThan(Date value) {
            addCriterionForJDBCDate("ENTRY <", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRY <=", value, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryIn(List<Date> values) {
            addCriterionForJDBCDate("ENTRY in", values, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENTRY not in", values, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENTRY between", value1, value2, "entry");
            return (Criteria) this;
        }

        public Criteria andEntryNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENTRY not between", value1, value2, "entry");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(Integer value) {
            addCriterion("SCHOOL =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(Integer value) {
            addCriterion("SCHOOL <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(Integer value) {
            addCriterion("SCHOOL >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCHOOL >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(Integer value) {
            addCriterion("SCHOOL <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(Integer value) {
            addCriterion("SCHOOL <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<Integer> values) {
            addCriterion("SCHOOL in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<Integer> values) {
            addCriterion("SCHOOL not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(Integer value1, Integer value2) {
            addCriterion("SCHOOL between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(Integer value1, Integer value2) {
            addCriterion("SCHOOL not between", value1, value2, "school");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}