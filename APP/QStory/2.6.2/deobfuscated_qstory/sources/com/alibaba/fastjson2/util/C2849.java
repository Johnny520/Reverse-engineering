package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import p293.AbstractC8575;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2849 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static Method f8896;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static Constructor f8897;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static Function f8898;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static Function f8899;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static ToIntFunction f8900;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static ToIntFunction f8901;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static ToIntFunction f8902;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static ToIntFunction f8903;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static ToIntFunction f8904;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static ToIntFunction f8905;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Class f8906;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static ToIntFunction f8907;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8908;

    public /* synthetic */ C2849(int i) {
        this.f8908 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f8908) {
            case 0:
                if (AbstractC2859.f8972 == null) {
                    AbstractC2859.f8972 = AbstractC2866.m5884("com.google.common.collect.ImmutableList");
                }
                if (AbstractC2859.f8972 == null) {
                    C0276.m849("class not found : com.google.common.collect.ImmutableList");
                    return null;
                }
                List list = (List) obj;
                if (list.isEmpty()) {
                    if (AbstractC2859.f8991 == null) {
                        try {
                            AbstractC2859.f8991 = AbstractC8575.m14126(AbstractC2859.f8972.getMethod("of", null));
                        } catch (NoSuchMethodException e) {
                            C0276.m842("method not found : com.google.common.collect.ImmutableList.of", e);
                            return null;
                        }
                        break;
                    }
                    return AbstractC2859.f8991.get();
                }
                if (list.size() == 1) {
                    if (AbstractC2859.f8992 == null) {
                        try {
                            AbstractC2859.f8992 = AbstractC8575.m14120(AbstractC2859.f8972.getMethod("of", Object.class));
                        } catch (NoSuchMethodException e2) {
                            C0276.m842("method not found : com.google.common.collect.ImmutableList.of", e2);
                            return null;
                        }
                        break;
                    }
                    return AbstractC2859.f8992.apply(list.get(0));
                }
                if (AbstractC2859.f8984 == null) {
                    try {
                        AbstractC2859.f8984 = AbstractC8575.m14120(AbstractC2859.f8972.getMethod("copyOf", Collection.class));
                    } catch (NoSuchMethodException e3) {
                        C0276.m842("method not found : com.google.common.collect.ImmutableList.copyOf", e3);
                        return null;
                    }
                    break;
                }
                return AbstractC2859.f8984.apply(list);
            case 1:
                if (AbstractC2859.f8971 == null) {
                    AbstractC2859.f8971 = AbstractC2866.m5884("com.google.common.collect.ImmutableSet");
                }
                if (AbstractC2859.f8971 == null) {
                    C0276.m849("class not found : com.google.common.collect.ImmutableSet");
                    return null;
                }
                List list2 = (List) obj;
                if (list2.isEmpty()) {
                    if (AbstractC2859.f8983 == null) {
                        try {
                            AbstractC2859.f8983 = AbstractC8575.m14126(AbstractC2859.f8971.getMethod("of", null));
                        } catch (NoSuchMethodException e4) {
                            C0276.m842("method not found : com.google.common.collect.ImmutableSet.of", e4);
                            return null;
                        }
                        break;
                    }
                    return AbstractC2859.f8983.get();
                }
                if (list2.size() == 1) {
                    if (AbstractC2859.f8987 == null) {
                        try {
                            AbstractC2859.f8987 = AbstractC8575.m14120(AbstractC2859.f8971.getMethod("of", Object.class));
                        } catch (NoSuchMethodException e5) {
                            C0276.m842("method not found : com.google.common.collect.ImmutableSet.of", e5);
                            return null;
                        }
                        break;
                    }
                    return AbstractC2859.f8987.apply(list2.get(0));
                }
                if (AbstractC2859.f8988 == null) {
                    try {
                        AbstractC2859.f8988 = AbstractC8575.m14120(AbstractC2859.f8971.getMethod("copyOf", Collection.class));
                    } catch (NoSuchMethodException e6) {
                        C0276.m842("method not found : com.google.common.collect.ImmutableSet.copyOf", e6);
                        return null;
                    }
                    break;
                }
                return AbstractC2859.f8988.apply(list2);
            case 2:
                if (AbstractC2859.f8973 == null) {
                    AbstractC2859.f8973 = AbstractC2866.m5884("com.google.common.collect.ImmutableMap");
                }
                if (AbstractC2859.f8973 == null) {
                    C0276.m849("class not found : com.google.common.collect.ImmutableMap");
                    return null;
                }
                Map map = (Map) obj;
                if (map.size() == 0) {
                    if (AbstractC2859.f8989 == null) {
                        try {
                            AbstractC2859.f8989 = AbstractC8575.m14126(AbstractC2859.f8973.getMethod("of", null));
                        } catch (NoSuchMethodException e7) {
                            C0276.m842("method not found : com.google.common.collect.ImmutableMap.of", e7);
                            return null;
                        }
                        break;
                    }
                    return AbstractC2859.f8989.get();
                }
                if (map.size() != 1) {
                    if (AbstractC2859.f8994 == null) {
                        try {
                            AbstractC2859.f8994 = AbstractC8575.m14120(AbstractC2859.f8973.getMethod("copyOf", Map.class));
                        } catch (NoSuchMethodException e8) {
                            C0276.m842("method not found : com.google.common.collect.ImmutableBiMap.copyOf", e8);
                            return null;
                        }
                        break;
                    }
                    return AbstractC2859.f8994.apply(map);
                }
                if (AbstractC2859.f8993 == null) {
                    try {
                        Method method = AbstractC2859.f8973.getMethod("of", Object.class, Object.class);
                        method.setAccessible(true);
                        AbstractC2859.f8993 = AbstractC8575.m14122(method);
                    } catch (NoSuchMethodException e9) {
                        C0276.m842("method not found : com.google.common.collect.ImmutableBiMap.of", e9);
                        return null;
                    }
                    break;
                }
                Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                return AbstractC2859.f8993.apply(entry.getKey(), entry.getValue());
            case 3:
                if (AbstractC2859.f8977 == null) {
                    try {
                        AbstractC2859.f8977 = AbstractC8575.m14123(AbstractC2866.m5884("com.google.common.collect.SingletonImmutableBiMap").getDeclaredConstructor(Object.class, Object.class));
                    } catch (NoSuchMethodException | SecurityException e10) {
                        C0276.m842("method not found : com.google.common.collect.SingletonImmutableBiMap(Object, Object)", e10);
                        return null;
                    }
                    break;
                }
                Map.Entry entry2 = (Map.Entry) ((Map) obj).entrySet().iterator().next();
                return AbstractC2859.f8977.apply(entry2.getKey(), entry2.getValue());
            case 4:
                try {
                    if (f8906 == null) {
                        f8906 = Class.forName("org.joda.time.DateTime");
                    }
                    if (f8907 == null) {
                        f8907 = AbstractC8575.m14125(f8906.getMethod("getYear", null));
                    }
                    if (f8901 == null) {
                        f8901 = AbstractC8575.m14125(f8906.getMethod("getMonthOfYear", null));
                    }
                    if (f8900 == null) {
                        f8900 = AbstractC8575.m14125(f8906.getMethod("getDayOfMonth", null));
                    }
                    if (f8904 == null) {
                        f8904 = AbstractC8575.m14125(f8906.getMethod("getHourOfDay", null));
                    }
                    if (f8905 == null) {
                        f8905 = AbstractC8575.m14125(f8906.getMethod("getMinuteOfHour", null));
                    }
                    if (f8902 == null) {
                        f8902 = AbstractC8575.m14125(f8906.getMethod("getSecondOfMinute", null));
                    }
                    if (f8903 == null) {
                        f8903 = AbstractC8575.m14125(f8906.getMethod("getMillisOfSecond", null));
                    }
                    if (f8899 == null) {
                        f8899 = AbstractC8575.m14120(f8906.getMethod("getZone", null));
                    }
                    if (f8898 == null) {
                        f8898 = AbstractC8575.m14120(Class.forName("org.joda.time.DateTimeZone").getMethod("getID", null));
                    }
                    return ZonedDateTime.of(f8907.applyAsInt(obj), f8901.applyAsInt(obj), f8900.applyAsInt(obj), f8904.applyAsInt(obj), f8905.applyAsInt(obj), f8902.applyAsInt(obj), f8903.applyAsInt(obj) * 1000000, ZoneId.of((String) f8898.apply(f8899.apply(obj))));
                } catch (Exception e11) {
                    C0276.m842("convert joda org.joda.time.DateTime to java.time.ZonedDateTime error", e11);
                    return null;
                }
            case 5:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                try {
                    if (f8896 == null) {
                        f8896 = Class.forName("org.joda.time.DateTimeZone").getMethod("forID", String.class);
                    }
                    if (f8897 == null) {
                        Class<?> cls = Class.forName("org.joda.time.DateTime");
                        Class cls2 = Integer.TYPE;
                        f8897 = cls.getConstructor(cls2, cls2, cls2, cls2, cls2, cls2, cls2, f8896.getDeclaringClass());
                    }
                    String id = zonedDateTime.getZone().getId();
                    if ("Z".equals(id)) {
                        id = "UTC";
                    }
                    return f8897.newInstance(Integer.valueOf(zonedDateTime.getYear()), Integer.valueOf(zonedDateTime.getMonthValue()), Integer.valueOf(zonedDateTime.getDayOfMonth()), Integer.valueOf(zonedDateTime.getHour()), Integer.valueOf(zonedDateTime.getMinute()), Integer.valueOf(zonedDateTime.getSecond()), Integer.valueOf(zonedDateTime.getNano() / 1000000), f8896.invoke(null, id));
                } catch (Exception e12) {
                    C0276.m842("build DateTime error", e12);
                    return null;
                }
            case 6:
                if (obj == null || (obj instanceof BigDecimal)) {
                    return obj;
                }
                if (obj instanceof Boolean) {
                    return ((Boolean) obj).booleanValue() ? BigDecimal.ONE : BigDecimal.ZERO;
                }
                if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof AtomicInteger) || (obj instanceof AtomicLong)) {
                    return BigDecimal.valueOf(((Number) obj).longValue());
                }
                if ((obj instanceof Float) || (obj instanceof Double)) {
                    return AbstractC2866.m5870(((Number) obj).doubleValue());
                }
                if (obj instanceof BigInteger) {
                    return new BigDecimal((BigInteger) obj);
                }
                if (obj instanceof String) {
                    return new BigDecimal((String) obj);
                }
                C0276.m849(AbstractC2442.m4571(obj, new StringBuilder("can not cast to BigDecimal ")));
                return null;
            case 7:
                if (obj == null || (obj instanceof BigInteger)) {
                    return obj;
                }
                if (obj instanceof Boolean) {
                    return ((Boolean) obj).booleanValue() ? BigInteger.ONE : BigInteger.ZERO;
                }
                if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof AtomicInteger) || (obj instanceof AtomicLong) || (obj instanceof Float) || (obj instanceof Double)) {
                    return BigInteger.valueOf(((Number) obj).longValue());
                }
                if (obj instanceof BigDecimal) {
                    return ((BigDecimal) obj).toBigInteger();
                }
                C0276.m849(AbstractC2442.m4571(obj, new StringBuilder("can not cast to BigInteger ")));
                return null;
            case 8:
                if (obj == null) {
                    return Double.valueOf(0.0d);
                }
                if (obj instanceof Boolean) {
                    return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
                }
                if (obj instanceof Number) {
                    return obj;
                }
                C0276.m849(AbstractC2442.m4571(obj, new StringBuilder("can not cast to Number ")));
                return null;
            default:
                if (obj == null) {
                    return null;
                }
                return obj.toString();
        }
    }
}
