package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
enum JSONPathFilter$Operator {
    EQ,
    NE,
    GT,
    GE,
    LT,
    LE,
    LIKE,
    NOT_LIKE,
    RLIKE,
    NOT_RLIKE,
    IN,
    NOT_IN,
    BETWEEN,
    NOT_BETWEEN,
    AND,
    OR,
    REG_MATCH,
    STARTS_WITH,
    ENDS_WITH,
    CONTAINS,
    NOT_CONTAINS;

    @Override // java.lang.Enum
    public String toString() {
        switch (this) {
            case EQ:
                return "==";
            case NE:
                return "!=";
            case GT:
                return ">";
            case GE:
                return ">=";
            case LT:
                return "<";
            case LE:
                return "<=";
            case LIKE:
                return "like";
            case NOT_LIKE:
                return "not like";
            case RLIKE:
                return "rlike";
            case NOT_RLIKE:
                return "not rlike";
            case IN:
            case NOT_IN:
            case REG_MATCH:
            default:
                return name();
            case BETWEEN:
                return "between";
            case NOT_BETWEEN:
                return "not between";
            case AND:
                return "and";
            case OR:
                return "or";
            case STARTS_WITH:
                return "starts with";
            case ENDS_WITH:
                return "ends with";
            case CONTAINS:
                return "contains";
            case NOT_CONTAINS:
                return "not contains";
        }
    }
}
