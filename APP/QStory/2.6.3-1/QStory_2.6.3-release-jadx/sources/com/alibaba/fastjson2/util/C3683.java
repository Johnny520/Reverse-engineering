package com.alibaba.fastjson2.util;

import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
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
import p309.AbstractC9396;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3683 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static Method f9243;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static Constructor f9244;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static Function f9245;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static Function f9246;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static ToIntFunction f9247;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static ToIntFunction f9248;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static ToIntFunction f9249;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static ToIntFunction f9250;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static ToIntFunction f9251;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static ToIntFunction f9252;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Class f9253;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static ToIntFunction f9254;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9255;

    public /* synthetic */ C3683(int i) {
        this.f9255 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f9255) {
            case 0:
                if (AbstractC3693.f9319 == null) {
                    AbstractC3693.f9319 = AbstractC3700.m6489("com.google.common.collect.ImmutableList");
                }
                if (AbstractC3693.f9319 == null) {
                    C1123.m1410("class not found : com.google.common.collect.ImmutableList");
                    return null;
                }
                List list = (List) obj;
                if (list.isEmpty()) {
                    if (AbstractC3693.f9338 == null) {
                        try {
                            AbstractC3693.f9338 = AbstractC9396.m14704(AbstractC3693.f9319.getMethod("of", null));
                        } catch (NoSuchMethodException e) {
                            C1123.m1403("method not found : com.google.common.collect.ImmutableList.of", e);
                            return null;
                        }
                        break;
                    }
                    return AbstractC3693.f9338.get();
                }
                if (list.size() == 1) {
                    if (AbstractC3693.f9339 == null) {
                        try {
                            AbstractC3693.f9339 = AbstractC9396.m14698(AbstractC3693.f9319.getMethod("of", Object.class));
                        } catch (NoSuchMethodException e2) {
                            C1123.m1403("method not found : com.google.common.collect.ImmutableList.of", e2);
                            return null;
                        }
                        break;
                    }
                    return AbstractC3693.f9339.apply(list.get(0));
                }
                if (AbstractC3693.f9331 == null) {
                    try {
                        AbstractC3693.f9331 = AbstractC9396.m14698(AbstractC3693.f9319.getMethod("copyOf", Collection.class));
                    } catch (NoSuchMethodException e3) {
                        C1123.m1403("method not found : com.google.common.collect.ImmutableList.copyOf", e3);
                        return null;
                    }
                    break;
                }
                return AbstractC3693.f9331.apply(list);
            case 1:
                if (AbstractC3693.f9318 == null) {
                    AbstractC3693.f9318 = AbstractC3700.m6489("com.google.common.collect.ImmutableSet");
                }
                if (AbstractC3693.f9318 == null) {
                    C1123.m1410("class not found : com.google.common.collect.ImmutableSet");
                    return null;
                }
                List list2 = (List) obj;
                if (list2.isEmpty()) {
                    if (AbstractC3693.f9330 == null) {
                        try {
                            AbstractC3693.f9330 = AbstractC9396.m14704(AbstractC3693.f9318.getMethod("of", null));
                        } catch (NoSuchMethodException e4) {
                            C1123.m1403("method not found : com.google.common.collect.ImmutableSet.of", e4);
                            return null;
                        }
                        break;
                    }
                    return AbstractC3693.f9330.get();
                }
                if (list2.size() == 1) {
                    if (AbstractC3693.f9334 == null) {
                        try {
                            AbstractC3693.f9334 = AbstractC9396.m14698(AbstractC3693.f9318.getMethod("of", Object.class));
                        } catch (NoSuchMethodException e5) {
                            C1123.m1403("method not found : com.google.common.collect.ImmutableSet.of", e5);
                            return null;
                        }
                        break;
                    }
                    return AbstractC3693.f9334.apply(list2.get(0));
                }
                if (AbstractC3693.f9335 == null) {
                    try {
                        AbstractC3693.f9335 = AbstractC9396.m14698(AbstractC3693.f9318.getMethod("copyOf", Collection.class));
                    } catch (NoSuchMethodException e6) {
                        C1123.m1403("method not found : com.google.common.collect.ImmutableSet.copyOf", e6);
                        return null;
                    }
                    break;
                }
                return AbstractC3693.f9335.apply(list2);
            case 2:
                if (AbstractC3693.f9320 == null) {
                    AbstractC3693.f9320 = AbstractC3700.m6489("com.google.common.collect.ImmutableMap");
                }
                if (AbstractC3693.f9320 == null) {
                    C1123.m1410("class not found : com.google.common.collect.ImmutableMap");
                    return null;
                }
                Map map = (Map) obj;
                if (map.size() == 0) {
                    if (AbstractC3693.f9336 == null) {
                        try {
                            AbstractC3693.f9336 = AbstractC9396.m14704(AbstractC3693.f9320.getMethod("of", null));
                        } catch (NoSuchMethodException e7) {
                            C1123.m1403("method not found : com.google.common.collect.ImmutableMap.of", e7);
                            return null;
                        }
                        break;
                    }
                    return AbstractC3693.f9336.get();
                }
                if (map.size() != 1) {
                    if (AbstractC3693.f9341 == null) {
                        try {
                            AbstractC3693.f9341 = AbstractC9396.m14698(AbstractC3693.f9320.getMethod("copyOf", Map.class));
                        } catch (NoSuchMethodException e8) {
                            C1123.m1403("method not found : com.google.common.collect.ImmutableBiMap.copyOf", e8);
                            return null;
                        }
                        break;
                    }
                    return AbstractC3693.f9341.apply(map);
                }
                if (AbstractC3693.f9340 == null) {
                    try {
                        Method method = AbstractC3693.f9320.getMethod("of", Object.class, Object.class);
                        method.setAccessible(true);
                        AbstractC3693.f9340 = AbstractC9396.m14700(method);
                    } catch (NoSuchMethodException e9) {
                        C1123.m1403("method not found : com.google.common.collect.ImmutableBiMap.of", e9);
                        return null;
                    }
                    break;
                }
                Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                return AbstractC3693.f9340.apply(entry.getKey(), entry.getValue());
            case 3:
                if (AbstractC3693.f9324 == null) {
                    try {
                        AbstractC3693.f9324 = AbstractC9396.m14701(AbstractC3700.m6489("com.google.common.collect.SingletonImmutableBiMap").getDeclaredConstructor(Object.class, Object.class));
                    } catch (NoSuchMethodException | SecurityException e10) {
                        C1123.m1403("method not found : com.google.common.collect.SingletonImmutableBiMap(Object, Object)", e10);
                        return null;
                    }
                    break;
                }
                Map.Entry entry2 = (Map.Entry) ((Map) obj).entrySet().iterator().next();
                return AbstractC3693.f9324.apply(entry2.getKey(), entry2.getValue());
            case 4:
                try {
                    if (f9253 == null) {
                        f9253 = Class.forName("org.joda.time.DateTime");
                    }
                    if (f9254 == null) {
                        f9254 = AbstractC9396.m14703(f9253.getMethod("getYear", null));
                    }
                    if (f9248 == null) {
                        f9248 = AbstractC9396.m14703(f9253.getMethod("getMonthOfYear", null));
                    }
                    if (f9247 == null) {
                        f9247 = AbstractC9396.m14703(f9253.getMethod("getDayOfMonth", null));
                    }
                    if (f9251 == null) {
                        f9251 = AbstractC9396.m14703(f9253.getMethod("getHourOfDay", null));
                    }
                    if (f9252 == null) {
                        f9252 = AbstractC9396.m14703(f9253.getMethod("getMinuteOfHour", null));
                    }
                    if (f9249 == null) {
                        f9249 = AbstractC9396.m14703(f9253.getMethod("getSecondOfMinute", null));
                    }
                    if (f9250 == null) {
                        f9250 = AbstractC9396.m14703(f9253.getMethod("getMillisOfSecond", null));
                    }
                    if (f9246 == null) {
                        f9246 = AbstractC9396.m14698(f9253.getMethod("getZone", null));
                    }
                    if (f9245 == null) {
                        f9245 = AbstractC9396.m14698(Class.forName("org.joda.time.DateTimeZone").getMethod("getID", null));
                    }
                    return ZonedDateTime.of(f9254.applyAsInt(obj), f9248.applyAsInt(obj), f9247.applyAsInt(obj), f9251.applyAsInt(obj), f9252.applyAsInt(obj), f9249.applyAsInt(obj), f9250.applyAsInt(obj) * 1000000, ZoneId.of((String) f9245.apply(f9246.apply(obj))));
                } catch (Exception e11) {
                    C1123.m1403("convert joda org.joda.time.DateTime to java.time.ZonedDateTime error", e11);
                    return null;
                }
            case 5:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                try {
                    if (f9243 == null) {
                        f9243 = Class.forName("org.joda.time.DateTimeZone").getMethod("forID", String.class);
                    }
                    if (f9244 == null) {
                        Class<?> cls = Class.forName("org.joda.time.DateTime");
                        Class cls2 = Integer.TYPE;
                        f9244 = cls.getConstructor(cls2, cls2, cls2, cls2, cls2, cls2, cls2, f9243.getDeclaringClass());
                    }
                    String id = zonedDateTime.getZone().getId();
                    if ("Z".equals(id)) {
                        id = "UTC";
                    }
                    return f9244.newInstance(Integer.valueOf(zonedDateTime.getYear()), Integer.valueOf(zonedDateTime.getMonthValue()), Integer.valueOf(zonedDateTime.getDayOfMonth()), Integer.valueOf(zonedDateTime.getHour()), Integer.valueOf(zonedDateTime.getMinute()), Integer.valueOf(zonedDateTime.getSecond()), Integer.valueOf(zonedDateTime.getNano() / 1000000), f9243.invoke(null, id));
                } catch (Exception e12) {
                    C1123.m1403("build DateTime error", e12);
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
                    return AbstractC3700.m6475(((Number) obj).doubleValue());
                }
                if (obj instanceof BigInteger) {
                    return new BigDecimal((BigInteger) obj);
                }
                if (obj instanceof String) {
                    return new BigDecimal((String) obj);
                }
                C1123.m1410(AbstractC3275.m5141(obj, new StringBuilder("can not cast to BigDecimal ")));
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
                C1123.m1410(AbstractC3275.m5141(obj, new StringBuilder("can not cast to BigInteger ")));
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
                C1123.m1410(AbstractC3275.m5141(obj, new StringBuilder("can not cast to Number ")));
                return null;
            default:
                if (obj == null) {
                    return null;
                }
                return obj.toString();
        }
    }
}
