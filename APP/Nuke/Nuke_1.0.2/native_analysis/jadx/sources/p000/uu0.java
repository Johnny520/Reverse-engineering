package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uu0 {

    /* JADX INFO: renamed from: a */
    public static final Map f11505a;

    static {
        Class cls = Boolean.TYPE;
        cls.getClass();
        ow1 ow1Var = new ow1(cls, Boolean.class);
        Class cls2 = Byte.TYPE;
        cls2.getClass();
        ow1 ow1Var2 = new ow1(cls2, Byte.class);
        Class cls3 = Character.TYPE;
        cls3.getClass();
        ow1 ow1Var3 = new ow1(cls3, Character.class);
        Class cls4 = Short.TYPE;
        cls4.getClass();
        ow1 ow1Var4 = new ow1(cls4, Short.class);
        Class cls5 = Integer.TYPE;
        cls5.getClass();
        ow1 ow1Var5 = new ow1(cls5, Integer.class);
        Class cls6 = Long.TYPE;
        cls6.getClass();
        ow1 ow1Var6 = new ow1(cls6, Long.class);
        Class cls7 = Float.TYPE;
        cls7.getClass();
        ow1 ow1Var7 = new ow1(cls7, Float.class);
        Class cls8 = Double.TYPE;
        cls8.getClass();
        f11505a = we1.m5876q0(ow1Var, ow1Var2, ow1Var3, ow1Var4, ow1Var5, ow1Var6, ow1Var7, new ow1(cls8, Double.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pu0 m5582a(Class[] clsArr, ArrayList arrayList) {
        ou0 ou0Var;
        Object objValueOf;
        ou0 ou0Var2;
        Class cls;
        Object[] objArr = new Object[arrayList.size()];
        int length = clsArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            Class cls2 = clsArr[i];
            int i4 = i3 + 1;
            Object obj = arrayList.get(i3);
            if (obj == null) {
                ou0Var = cls2.isPrimitive() ? null : new ou0(8, null);
            } else {
                if (cls2.isPrimitive() && (cls = (Class) f11505a.get(cls2)) != null) {
                    cls2 = cls;
                }
                if (cls2.equals(obj.getClass())) {
                    ou0Var = new ou0(0, obj);
                } else if (obj instanceof Number) {
                    Number number = (Number) obj;
                    if (cls2.equals(Byte.class)) {
                        Long lM5584c = m5584c(number);
                        if (lM5584c != null) {
                            long jLongValue = lM5584c.longValue();
                            if (-128 > jLongValue || jLongValue >= 128) {
                                lM5584c = null;
                            }
                            objValueOf = lM5584c != null ? Byte.valueOf((byte) lM5584c.longValue()) : null;
                            ou0Var2 = objValueOf != null ? null : new ou0(2, objValueOf);
                            if (ou0Var2 == null) {
                                ou0Var = ou0Var2;
                            } else if (cls2.isAssignableFrom(obj.getClass())) {
                                ou0Var = new ou0(4, obj);
                            }
                        }
                    } else if (cls2.equals(Short.class)) {
                        Long lM5584c2 = m5584c(number);
                        if (lM5584c2 != null) {
                            long jLongValue2 = lM5584c2.longValue();
                            if (-32768 > jLongValue2 || jLongValue2 >= 32768) {
                                lM5584c2 = null;
                            }
                            if (lM5584c2 != null) {
                                objValueOf = Short.valueOf((short) lM5584c2.longValue());
                            }
                            if (objValueOf != null) {
                            }
                            if (ou0Var2 == null) {
                            }
                        }
                    } else if (cls2.equals(Integer.class)) {
                        Long lM5584c3 = m5584c(number);
                        if (lM5584c3 != null) {
                            long jLongValue3 = lM5584c3.longValue();
                            if (-2147483648L > jLongValue3 || jLongValue3 >= 2147483648L) {
                                lM5584c3 = null;
                            }
                            if (lM5584c3 != null) {
                                objValueOf = Integer.valueOf((int) lM5584c3.longValue());
                            }
                            if (objValueOf != null) {
                            }
                            if (ou0Var2 == null) {
                            }
                        }
                    } else {
                        if (cls2.equals(Long.class)) {
                            objValueOf = m5584c(number);
                        } else if (cls2.equals(Float.class)) {
                            double dDoubleValue = number.doubleValue();
                            Double dValueOf = Double.valueOf(dDoubleValue);
                            if (Math.abs(dDoubleValue) > Double.MAX_VALUE || -3.4028234663852886E38d > dDoubleValue || dDoubleValue > 3.4028234663852886E38d) {
                                dValueOf = null;
                            }
                            if (dValueOf != null) {
                                objValueOf = Float.valueOf((float) dValueOf.doubleValue());
                            }
                        } else if (cls2.equals(Double.class)) {
                            double dDoubleValue2 = number.doubleValue();
                            Double dValueOf2 = Double.valueOf(dDoubleValue2);
                            if (Math.abs(dDoubleValue2) <= Double.MAX_VALUE) {
                                objValueOf = dValueOf2;
                            }
                        }
                        if (objValueOf != null) {
                        }
                        if (ou0Var2 == null) {
                        }
                    }
                }
            }
            if (ou0Var == null) {
                return null;
            }
            objArr[i3] = ou0Var.f7846a;
            i2 += ou0Var.f7847b;
            i++;
            i3 = i4;
        }
        return new pu0(i2, objArr);
    }

    /* JADX INFO: renamed from: b */
    public static Field m5583b(Class cls, String str, boolean z) {
        while (true) {
            Field field = null;
            if (cls == null) {
                return null;
            }
            Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Field field2 = declaredFields[i];
                if (t11.m5086l(field2.getName(), str) && Modifier.isStatic(field2.getModifiers()) == z) {
                    field = field2;
                    break;
                }
                i++;
            }
            if (field != null) {
                return field;
            }
            cls = cls.getSuperclass();
        }
    }

    /* JADX INFO: renamed from: c */
    public static Long m5584c(Number number) {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return Long.valueOf(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            double dDoubleValue = number.doubleValue();
            Double dValueOf = Double.valueOf(dDoubleValue);
            if (Math.abs(dDoubleValue) > Double.MAX_VALUE || dDoubleValue % 1.0d != 0.0d || dDoubleValue < -9.223372036854776E18d || dDoubleValue > 9.223372036854776E18d) {
                dValueOf = null;
            }
            if (dValueOf != null) {
                return Long.valueOf((long) dValueOf.doubleValue());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static ru0 m5585d(Class cls, String str, ArrayList arrayList, boolean z) {
        Object next;
        ArrayList arrayList2 = new ArrayList();
        while (cls != null) {
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (t11.m5086l(method.getName(), str) && Modifier.isStatic(method.getModifiers()) == z && method.getParameterCount() == arrayList.size()) {
                    arrayList2.add(method);
                }
            }
            cls = cls.getSuperclass();
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Method method2 = (Method) it.next();
            Class<?>[] parameterTypes = method2.getParameterTypes();
            parameterTypes.getClass();
            pu0 pu0VarM5582a = m5582a(parameterTypes, arrayList);
            tu0 tu0Var = pu0VarM5582a != null ? new tu0(method2, pu0VarM5582a.f8613a, pu0VarM5582a.f8614b) : null;
            if (tu0Var != null) {
                arrayList3.add(tu0Var);
            }
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int i = ((tu0) next).f10966c;
                do {
                    Object next2 = it2.next();
                    int i2 = ((tu0) next2).f10966c;
                    if (i > i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        tu0 tu0Var2 = (tu0) next;
        if (tu0Var2 != null) {
            return new ru0(tu0Var2.f10964a, tu0Var2.f10965b);
        }
        return null;
    }
}
