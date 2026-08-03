package com.alibaba.fastjson2.function.impl;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.util.TypeUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ToAny implements Function {
    private Object defaultValue;
    private final Class targetClass;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ToAny(Class cls, Object obj) {
        this.targetClass = cls;
        this.defaultValue = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:289:? */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v14, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v15, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v16, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v17, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v18, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v19, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v20, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v21, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v22, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v23, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v24, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v25, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v26, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v27, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v28, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v29, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v30, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v31, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v32, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v33, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v34, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v35, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v36, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v37, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v38, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v41, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: char */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: char */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    public Object apply(Object obj) {
        if (obj == null) {
            return this.defaultValue;
        }
        if (this.targetClass.isInstance(obj)) {
            return obj;
        }
        Class cls = this.targetClass;
        if (cls == String.class) {
            return obj.toString();
        }
        if (cls == BigDecimal.class) {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? BigDecimal.ONE : BigDecimal.ZERO;
            }
            if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof AtomicInteger) || (obj instanceof AtomicLong)) {
                return BigDecimal.valueOf(((Number) obj).longValue());
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                return TypeUtils.toBigDecimal(((Number) obj).doubleValue());
            }
            if (obj instanceof BigInteger) {
                return new BigDecimal((BigInteger) obj);
            }
            if (obj instanceof String) {
                return new BigDecimal((String) obj);
            }
        } else if (cls != BigInteger.class) {
            if (cls == Boolean.class) {
                if (obj instanceof Number) {
                    return Boolean.valueOf(((Number) obj).intValue() == 1);
                }
                if (obj instanceof String) {
                    switch ((String) obj) {
                        case "F":
                        case "N":
                        case "NO":
                        case "No":
                        case "no":
                        case "FALSE":
                        case "False":
                        case "false":
                            return Boolean.FALSE;
                        case "T":
                        case "Y":
                        case "YES":
                        case "Yes":
                        case "yes":
                        case "TRUE":
                        case "True":
                        case "true":
                            return Boolean.TRUE;
                        case "null":
                            return this.defaultValue;
                    }
                }
            } else if (cls == Byte.class) {
                if (obj instanceof Boolean) {
                    return Byte.valueOf(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                }
                if (obj instanceof Number) {
                    return Byte.valueOf(((Number) obj).byteValue());
                }
            } else if (cls == Double.class) {
                if (obj instanceof Number) {
                    return Double.valueOf(((Number) obj).doubleValue());
                }
                if (obj instanceof String) {
                    String str = (String) obj;
                    return str.isEmpty() ? this.defaultValue : Double.valueOf(Double.parseDouble(str));
                }
                if (obj instanceof List) {
                    List list = (List) obj;
                    JSONArray jSONArray = new JSONArray(list.size());
                    for (int i9 = 0; i9 < list.size(); i9++) {
                        jSONArray.add(apply(list.get(i9)));
                    }
                    return jSONArray;
                }
                if (obj instanceof Boolean) {
                    return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
                }
            } else if (cls == Float.class) {
                if (obj instanceof Boolean) {
                    return Float.valueOf(((Boolean) obj).booleanValue() ? 1.0f : 0.0f);
                }
                if (obj instanceof Number) {
                    return Float.valueOf(((Number) obj).floatValue());
                }
            } else if (cls == Integer.class) {
                if (obj instanceof Boolean) {
                    return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                if (obj instanceof Number) {
                    return Integer.valueOf(((Number) obj).intValue());
                }
            } else if (cls == Long.class) {
                if (obj instanceof Boolean) {
                    return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
                }
                if (obj instanceof Number) {
                    return Long.valueOf(((Number) obj).longValue());
                }
            } else if (cls == Short.class) {
                if (obj instanceof Boolean) {
                    return Short.valueOf(((Boolean) obj).booleanValue() ? (short) 1 : (short) 0);
                }
                if (obj instanceof Number) {
                    return Short.valueOf(((Number) obj).shortValue());
                }
            } else if (cls == Number.class) {
                if (obj instanceof Boolean) {
                    return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                if (obj instanceof Number) {
                    return obj;
                }
            }
        } else {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue() ? BigInteger.ONE : BigInteger.ZERO;
            }
            if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof AtomicInteger) || (obj instanceof AtomicLong) || (obj instanceof Float) || (obj instanceof Double)) {
                return BigInteger.valueOf(((Number) obj).longValue());
            }
            if (obj instanceof BigDecimal) {
                return ((BigDecimal) obj).toBigInteger();
            }
        }
        C0086a.m454m("can not cast to ", this.targetClass.getName(), " ", obj.getClass());
        return null;
    }

    public ToAny(Class cls) {
        this(cls, null);
    }
}
