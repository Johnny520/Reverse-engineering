package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.core.view.C2242;
import bsh.classpath.C2602;
import bsh.classpath.C2604;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.C2925;
import com.alibaba.fastjson2.util.AbstractC2837;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.AbstractC2867;
import com.alibaba.fastjson2.util.C2830;
import com.alibaba.fastjson2.util.C2832;
import com.alibaba.fastjson2.util.C2834;
import com.alibaba.fastjson2.util.C2836;
import com.alibaba.fastjson2.util.C2840;
import com.alibaba.fastjson2.util.C2841;
import com.alibaba.fastjson2.util.C2848;
import com.alibaba.fastjson2.util.C2850;
import com.alibaba.fastjson2.util.C2852;
import java.io.Closeable;
import java.io.File;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSequentialList;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Deque;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import p278.C8365;
import p279.InterfaceC8368;
import p293.AbstractC8567;
import p294.AbstractC8569;
import p372.C8974;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2779 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Method f8499;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2242 f8500 = new C2242(this, 6);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2802 f8501;

    public C2779(C2802 c2802) {
        this.f8501 = c2802;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C2715 m5614(Class cls, Class cls2, Type type, Type type2) {
        return ((type == null || type == String.class) && type2 == String.class) ? new C2716(cls, cls2, 0L) : new C2715(cls, cls2, type, type2, 0L, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC2788 m5615(C2802 c2802, Type type) {
        String str;
        Class cls;
        Type type2;
        Type type3;
        Type type4;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5;
        ConcurrentHashMap concurrentHashMap = c2802.f8667;
        if (type == String.class || type == CharSequence.class) {
            return C2704.f8213;
        }
        if (type == Character.TYPE || type == Character.class) {
            return C2704.f8217;
        }
        if (type == Boolean.TYPE || type == Boolean.class) {
            return C2704.f8206;
        }
        if (type == Byte.TYPE || type == Byte.class) {
            return C2721.f8286;
        }
        if (type == Short.TYPE || type == Short.class) {
            return C2705.f8223;
        }
        Class cls6 = Integer.TYPE;
        if (type == cls6 || type == Integer.class) {
            return C2704.f8218;
        }
        if (type == Long.TYPE || type == Long.class) {
            return C2704.f8221;
        }
        if (type == Float.TYPE || type == Float.class) {
            return C2704.f8220;
        }
        if (type == Double.TYPE || type == Double.class) {
            return C2704.f8216;
        }
        if (type == BigInteger.class) {
            return C2704.f8207;
        }
        if (type == BigDecimal.class) {
            return C2733.f8340;
        }
        if (type == Number.class) {
            return C2704.f8211;
        }
        if (type == BitSet.class) {
            return C2734.f8344;
        }
        if (type == OptionalInt.class) {
            return C2704.f8215;
        }
        if (type == OptionalLong.class) {
            return C2704.f8212;
        }
        if (type == OptionalDouble.class) {
            return C2704.f8214;
        }
        if (type == Optional.class) {
            return C2706.f8224;
        }
        if (type == UUID.class) {
            return C2704.f8209;
        }
        if (type == Duration.class) {
            return new C2736(Duration.class, new C8974(1));
        }
        if (type == Period.class) {
            return new C2736(Period.class, new C2604(17));
        }
        if (type == AtomicBoolean.class) {
            return new C2736(new C2604(20));
        }
        if (type == URI.class) {
            return new C2736(URI.class, new C2604(21));
        }
        if (type == Charset.class) {
            return new C2736(Charset.class, new C2604(22));
        }
        if (type == File.class) {
            return new C2736(File.class, new C2604(23));
        }
        if (type == Path.class) {
            return new C2736(Path.class, new C2604(24));
        }
        if (type == URL.class) {
            return new C2736(URL.class, new C2604(26));
        }
        if (type == Pattern.class) {
            return new C2736(Pattern.class, new C2604(27));
        }
        if (type == Class.class) {
            return C2719.f8283;
        }
        if (type == Method.class) {
            return new C2703();
        }
        if (type == Field.class) {
            return new C2740();
        }
        if (type == Type.class) {
            return C2719.f8283;
        }
        String typeName = type.getTypeName();
        typeName.getClass();
        switch (typeName) {
            case "org.springframework.security.authentication.UsernamePasswordAuthenticationToken":
                str = "org.springframework.security.jackson2.UsernamePasswordAuthenticationTokenMixin";
                break;
            case "com.google.common.collect.AbstractMapBasedMultimap$WrappedSet":
                return null;
            case "org.springframework.security.web.csrf.DefaultCsrfToken":
                str = "org.springframework.security.web.jackson2.DefaultCsrfTokenMixin";
                break;
            case "org.springframework.security.core.authority.AnonymousAuthenticationToken":
                str = "org.springframework.security.jackson2.RememberMeAuthenticationTokenMixin";
                break;
            case "org.springframework.security.web.savedrequest.SavedCookie":
                str = "org.springframework.security.web.jackson2.SavedCookieMixin";
                break;
            case "org.springframework.security.web.authentication.WebAuthenticationDetails":
                str = "org.springframework.security.web.jackson2.WebAuthenticationDetailsMixin";
                break;
            case "org.springframework.util.LinkedMultiValueMap":
                return C2714.m5508(type, (Class) type, 0L);
            case "org.springframework.security.core.authority.RememberMeAuthenticationToken":
                str = "org.springframework.security.jackson2.AnonymousAuthenticationTokenMixin";
                break;
            case "org.springframework.security.authentication.BadCredentialsException":
                str = "org.springframework.security.jackson2.BadCredentialsExceptionMixin";
                break;
            case "org.springframework.security.core.userdetails.User":
                str = "org.springframework.security.jackson2.UserMixin";
                break;
            case "org.springframework.security.core.authority.SimpleGrantedAuthority":
                str = "org.springframework.security.jackson2.SimpleGrantedAuthorityMixin";
                break;
            default:
                str = null;
                break;
        }
        if (str != null && ((Class) concurrentHashMap.get(type)) == null) {
            Class clsM5929 = AbstractC2867.m5929(str);
            if (clsM5929 == null && "org.springframework.security.jackson2.SimpleGrantedAuthorityMixin".equals(str)) {
                clsM5929 = AbstractC2867.m5929("com.alibaba.fastjson2.internal.mixin.spring.SimpleGrantedAuthorityMixin");
            }
            Class cls7 = clsM5929;
            if (cls7 != null) {
                concurrentHashMap.putIfAbsent((Class) type, cls7);
            }
        }
        if (type == Map.class || type == AbstractMap.class) {
            return C2714.m5508(null, (Class) type, 0L);
        }
        if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
            return m5614((Class) type, ConcurrentHashMap.class, null, Object.class);
        }
        if (type == ConcurrentNavigableMap.class || type == ConcurrentSkipListMap.class) {
            return m5614((Class) type, ConcurrentSkipListMap.class, null, Object.class);
        }
        if (type == SortedMap.class || type == NavigableMap.class || type == TreeMap.class) {
            return m5614((Class) type, TreeMap.class, null, Object.class);
        }
        if (type == Calendar.class || "javax.xml.datatype.XMLGregorianCalendar".equals(typeName)) {
            return C2724.f8292;
        }
        if (type == Date.class) {
            return C2741.f8378;
        }
        if (type == LocalDate.class) {
            return C2695.f8170;
        }
        if (type == LocalTime.class) {
            return C2717.f8279;
        }
        if (type == LocalDateTime.class) {
            return C2696.f8171;
        }
        if (type == ZonedDateTime.class) {
            return C2793.f8635;
        }
        if (type == OffsetDateTime.class) {
            return C2701.f8201;
        }
        if (type == OffsetTime.class) {
            return C2702.f8202;
        }
        if (type == ZoneOffset.class) {
            return new C2736(ZoneOffset.class, new C2769(0));
        }
        if (type == Instant.class) {
            return C2725.f8293;
        }
        if (type == Locale.class) {
            return C2704.f8219;
        }
        if (type == Currency.class) {
            return C2720.f8285;
        }
        if (type == ZoneId.class) {
            return new C2736(ZoneId.class, new C2769(1));
        }
        if (type == TimeZone.class) {
            return new C2736(TimeZone.class, new C2769(2));
        }
        if (type == char[].class) {
            return C2723.f8290;
        }
        if (type == float[].class) {
            return C2727.f8297;
        }
        if (type == double[].class) {
            return C2738.f8372;
        }
        if (type == boolean[].class) {
            return C2722.f8288;
        }
        if (type == byte[].class) {
            return C2709.f8236;
        }
        if (type == short[].class) {
            return C2730.f8306;
        }
        if (type == int[].class) {
            return C2708.f8233;
        }
        if (type == long[].class) {
            return C2711.f8241;
        }
        if (type == Byte[].class) {
            return C2712.f8244;
        }
        if (type == Short[].class) {
            return C2726.f8295;
        }
        if (type == Integer[].class) {
            return C2729.f8304;
        }
        if (type == Long[].class) {
            return C2707.f8231;
        }
        if (type == Float[].class) {
            return C2739.f8375;
        }
        if (type == Double[].class) {
            return C2742.f8380;
        }
        if (type == Number[].class) {
            return C2704.f8210;
        }
        if (type == String[].class) {
            return C2796.f8649;
        }
        if (type == AtomicInteger.class) {
            return new C2704(new C2602(2));
        }
        if (type == AtomicLong.class) {
            return new C2704(new C2768());
        }
        if (type == AtomicIntegerArray.class) {
            return new C2708(AtomicIntegerArray.class, new C2769(3));
        }
        if (type == AtomicLongArray.class) {
            return new C2711(AtomicLongArray.class, new C2604(15));
        }
        if (type == AtomicReference.class) {
            return C2736.f8359;
        }
        if (type == StringBuffer.class || type == StringBuilder.class) {
            try {
                return new C2795(String.class, 0L, null, ((Class) type).getConstructor(String.class), null, null);
            } catch (NoSuchMethodException e) {
                C5925.m11313(e);
                return null;
            }
        }
        if (type == Iterable.class || type == Collection.class || type == List.class || type == AbstractCollection.class || type == AbstractList.class || type == ArrayList.class || type == Stack.class) {
            return C2698.m5500(null, type);
        }
        if (type == Queue.class || type == Deque.class || type == AbstractSequentialList.class || type == LinkedList.class) {
            return C2698.m5500(null, type);
        }
        if (type == Set.class || type == AbstractSet.class || type == EnumSet.class) {
            return C2698.m5500(null, type);
        }
        if (type == NavigableSet.class || type == SortedSet.class) {
            return C2698.m5500(null, type);
        }
        if (type == ConcurrentLinkedDeque.class || type == ConcurrentLinkedQueue.class || type == ConcurrentSkipListSet.class || type == LinkedHashSet.class || type == HashSet.class || type == TreeSet.class || type == CopyOnWriteArrayList.class) {
            return C2698.m5500(null, type);
        }
        if (type == C2698.f8182 || type == C2698.f8181 || type == C2698.f8185 || type == C2698.f8186 || type == C2698.f8183 || type == C2698.f8184 || type == C2698.f8176 || type == C2698.f8175 || type == C2698.f8179 || type == C2698.f8180) {
            return C2698.m5500(null, type);
        }
        if (type == AbstractC2867.f9049) {
            return C2698.m5500(null, type);
        }
        if (type == Object.class || type == Cloneable.class || type == Closeable.class || type == Serializable.class || type == Comparable.class) {
            return C2704.f8208;
        }
        if (type == Map.Entry.class) {
            return new C2713(null, null);
        }
        if (type instanceof Class) {
            Class cls8 = (Class) type;
            if (AbstractC2865.m5800(cls8)) {
                return null;
            }
            if (Map.class.isAssignableFrom(cls8)) {
                return C2714.m5508(null, cls8, 0L);
            }
            type2 = TreeMap.class;
            type3 = List.class;
            type4 = Iterable.class;
            if (Collection.class.isAssignableFrom(cls8)) {
                return C2698.m5500(cls8, cls8);
            }
            if (cls8.isArray()) {
                return cls8.getComponentType() == Object.class ? C2681.f8150 : new C2677(cls8);
            }
            if (C2925.class.isAssignableFrom(cls8)) {
                return new C2710(cls8);
            }
            C2802 c2802M6387 = AbstractC2933.m6387();
            c2802M6387.getClass();
            C2776 c2776 = (C2776) AbstractC2933.f9292.get();
            if (c2776 == null) {
                c2776 = c2802M6387.f8676;
            }
            if (cls8 == StackTraceElement.class) {
                try {
                    Constructor constructor = cls8.getConstructor(String.class, String.class, String.class, cls6);
                    cls = cls6;
                    try {
                        c2776.getClass();
                        return C2776.m5597(constructor, "className", "methodName", "fileName", "lineNumber");
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    cls = cls6;
                }
            } else {
                cls = cls6;
            }
        } else {
            cls = cls6;
            type2 = TreeMap.class;
            type3 = List.class;
            type4 = Iterable.class;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length == 2) {
                Type type5 = actualTypeArguments[0];
                Type type6 = actualTypeArguments[1];
                if (rawType == Map.class || rawType == AbstractMap.class || rawType == HashMap.class) {
                    return m5614((Class) rawType, HashMap.class, type5, type6);
                }
                if (rawType == ConcurrentMap.class || rawType == ConcurrentHashMap.class) {
                    return m5614((Class) rawType, ConcurrentHashMap.class, type5, type6);
                }
                if (rawType == ConcurrentNavigableMap.class || rawType == ConcurrentSkipListMap.class) {
                    return m5614((Class) rawType, ConcurrentSkipListMap.class, type5, type6);
                }
                if (rawType == LinkedHashMap.class || rawType == type2 || rawType == Hashtable.class) {
                    Class cls9 = (Class) rawType;
                    return m5614(cls9, cls9, type5, type6);
                }
                if (rawType == Map.Entry.class) {
                    return new C2713(type5, type6);
                }
                String typeName2 = rawType.getTypeName();
                typeName2.getClass();
                switch (typeName2) {
                    case "com.google.common.collect.SingletonImmutableBiMap":
                        return new C2715((Class) rawType, HashMap.class, type5, type6, 0L, new C2850(3));
                    case "org.springframework.util.LinkedMultiValueMap":
                        return C2714.m5508(type, (Class) rawType, 0L);
                    case "org.apache.commons.lang3.tuple.Pair":
                    case "org.apache.commons.lang3.tuple.ImmutablePair":
                        return new C2848((Class) rawType, type5, type6);
                    case "com.google.common.collect.ImmutableMap":
                    case "com.google.common.collect.RegularImmutableMap":
                        return new C2715((Class) rawType, HashMap.class, type5, type6, 0L, new C2850(2));
                    default:
                        return null;
                }
            }
            if (actualTypeArguments.length != 1) {
                return null;
            }
            Type type7 = actualTypeArguments[0];
            Class clsM5942 = AbstractC2867.m5942(type7);
            if (rawType == type4 || rawType == Collection.class || rawType == type3 || rawType == AbstractCollection.class || rawType == AbstractList.class) {
                cls2 = Long.class;
                cls3 = ArrayList.class;
            } else {
                cls3 = ArrayList.class;
                if (rawType != cls3 && rawType != Stack.class) {
                    if (rawType == Queue.class || rawType == Deque.class || rawType == AbstractSequentialList.class) {
                        cls4 = Long.class;
                        cls5 = LinkedList.class;
                    } else {
                        cls5 = LinkedList.class;
                        if (rawType != cls5) {
                            if (rawType == Set.class || rawType == AbstractSet.class || rawType == EnumSet.class) {
                                return clsM5942 == String.class ? new C2699((Class) rawType, HashSet.class) : clsM5942 == Long.class ? new C2697((Class) rawType, HashSet.class) : C2698.m5500(null, type);
                            }
                            if (rawType == NavigableSet.class || rawType == SortedSet.class) {
                                return type7 == String.class ? new C2699((Class) rawType, TreeSet.class) : clsM5942 == Long.class ? new C2697((Class) rawType, TreeSet.class) : C2698.m5500(null, type);
                            }
                            if (rawType == ConcurrentLinkedDeque.class || rawType == ConcurrentLinkedQueue.class || rawType == ConcurrentSkipListSet.class || rawType == LinkedHashSet.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == CopyOnWriteArrayList.class) {
                                if (type7 == String.class) {
                                    Class cls10 = (Class) rawType;
                                    return new C2699(cls10, cls10);
                                }
                                if (clsM5942 != Long.class) {
                                    return C2698.m5500(null, type);
                                }
                                Class cls11 = (Class) rawType;
                                return new C2697(cls11, cls11);
                            }
                            String typeName3 = rawType.getTypeName();
                            typeName3.getClass();
                            switch (typeName3) {
                                case "com.google.common.collect.ImmutableList":
                                case "com.google.common.collect.SingletonImmutableSet":
                                case "com.google.common.collect.ImmutableSet":
                                    return C2698.m5500(null, type);
                                case "cn.hutool.core.lang.tree.Tree":
                                    return C2714.m5508(null, (Class) rawType, 0L);
                                default:
                                    if (rawType == Optional.class) {
                                        return new C2706(type, null, null);
                                    }
                                    if (rawType == AtomicReference.class) {
                                        return new C2736(type7);
                                    }
                                    if (type7 instanceof WildcardType) {
                                        return m5615(c2802, rawType);
                                    }
                                    return null;
                            }
                        }
                        cls4 = Long.class;
                    }
                    return clsM5942 == String.class ? new C2699((Class) rawType, cls5) : clsM5942 == cls4 ? new C2697((Class) rawType, cls5) : C2698.m5500(null, type);
                }
                cls2 = Long.class;
            }
            return clsM5942 == String.class ? new C2699((Class) rawType, cls3) : clsM5942 == cls2 ? new C2697((Class) rawType, cls3) : C2698.m5500(null, type);
        }
        if (type instanceof GenericArrayType) {
            return new C2728((GenericArrayType) type);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m5615(c2802, upperBounds[0]);
            }
        }
        if (type == ParameterizedType.class) {
            C2776 c27762 = C2776.f8476;
            c27762.getClass();
            return c27762.mo5529(C2830.class, C2830.class, false, AbstractC2933.m6387());
        }
        switch (typeName) {
            case "java.awt.Color":
                try {
                    Class cls12 = cls;
                    Constructor constructor2 = ((Class) type).getConstructor(cls12, cls12, cls12, cls12);
                    C2776.f8476.getClass();
                    return C2776.m5597(constructor2, "r", "g", "b", "alpha");
                } catch (Throwable unused3) {
                    return null;
                }
            case "java.lang.RuntimeException":
            case "java.io.IOException":
            case "java.io.UncheckedIOException":
            case "java.lang.Exception":
            case "java.lang.IllegalStateException":
            case "java.lang.Throwable":
                Class cls13 = (Class) type;
                List listAsList = Arrays.asList(AbstractC2865.m5821(cls13));
                C2781 c2781 = new C2781(0);
                C2776.f8476.getClass();
                return new C2735(cls13, listAsList, C2776.m5593(null, null, "stackTrace", StackTraceElement[].class, StackTraceElement[].class, 0, 0L, null, null, null, null, null, c2781, null));
            case "com.google.common.collect.ImmutableList":
            case "com.google.common.collect.SingletonImmutableSet":
            case "com.google.common.collect.ImmutableSet":
            case "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList":
            case "com.google.common.collect.RegularImmutableSet":
                return C2698.m5500(null, type);
            case "javax.money.NumberValue":
                if (AbstractC8569.f23916 == null) {
                    AbstractC8569.f23916 = AbstractC2867.m5929("org.javamoney.moneta.spi.DefaultNumberValue");
                }
                if (AbstractC8569.f23920 == null) {
                    try {
                        AbstractC8569.f23920 = AbstractC8569.f23916.getMethod("of", Number.class);
                    } catch (NoSuchMethodException e2) {
                        C0276.m843("method not found : org.javamoney.moneta.spi.DefaultNumberValue.of", e2);
                        return null;
                    }
                    break;
                }
                if (AbstractC8569.f23915 == null) {
                    AbstractC8569.f23915 = AbstractC2867.m5929("javax.money.NumberValue");
                }
                return new C2795(BigDecimal.class, 0L, null, null, AbstractC8569.f23920, null);
            case "org.joda.time.LocalDate":
                int i = AbstractC2837.f8830;
                return new C2840((Class) type, 0);
            case "com.carrotsearch.hppc.LongHashSet":
            case "gnu.trove.set.hash.TShortHashSet":
            case "com.carrotsearch.hppc.CharHashSet":
            case "com.carrotsearch.hppc.CharArrayList":
            case "com.carrotsearch.hppc.IntArrayList":
            case "gnu.trove.list.array.TLongArrayList":
            case "gnu.trove.list.array.TShortArrayList":
            case "gnu.trove.set.hash.TIntHashSet":
            case "com.carrotsearch.hppc.ShortArrayList":
            case "com.carrotsearch.hppc.DoubleArrayList":
            case "com.carrotsearch.hppc.ByteArrayList":
            case "gnu.trove.set.hash.TLongHashSet":
            case "gnu.trove.list.array.TCharArrayList":
            case "gnu.trove.list.array.TFloatArrayList":
            case "com.carrotsearch.hppc.FloatArrayList":
            case "com.carrotsearch.hppc.IntHashSet":
            case "gnu.trove.list.array.TIntArrayList":
            case "gnu.trove.list.array.TByteArrayList":
            case "org.bson.types.Decimal128":
            case "gnu.trove.set.hash.TByteHashSet":
            case "com.carrotsearch.hppc.LongArrayList":
            case "gnu.trove.list.array.TDoubleArrayList":
                return AbstractC8567.m14148((Class) type);
            case "java.util.JumboEnumSet":
            case "java.util.RegularEnumSet":
                return C2698.m5500(AbstractC2867.m5944(type), type);
            case "javax.money.CurrencyUnit":
                return AbstractC8569.m14150();
            case "java.net.InetAddress":
                return new C2795(String.class, 0L, null, null, null, new C2604(16));
            case "java.nio.HeapByteBuffer":
            case "java.nio.ByteBuffer":
                return new C2709(null, new C2604(19));
            case "org.apache.commons.lang3.tuple.Pair":
            case "org.apache.commons.lang3.tuple.ImmutablePair":
                return new C2848((Class) type, Object.class, Object.class);
            case "org.joda.time.Instant":
                int i2 = AbstractC2837.f8830;
                return new C2841((Class) type);
            case "java.sql.Date":
                return new C2852(null, null);
            case "java.sql.Time":
                return new C2836(null, null);
            case "org.joda.time.DateTime":
                C2850 c2850 = new C2850(5);
                C2793 c2793 = new C2793(null, null);
                c2793.f8636 = c2850;
                return c2793;
            case "javax.money.MonetaryAmount":
            case "javax.money.Money":
                if (AbstractC8569.f23915 == null) {
                    AbstractC8569.f23915 = AbstractC2867.m5929("javax.money.NumberValue");
                }
                if (AbstractC8569.f23914 == null) {
                    AbstractC8569.f23914 = AbstractC2867.m5929("javax.money.CurrencyUnit");
                }
                try {
                    Method method = AbstractC8569.class.getMethod("飘花落叶言子楪世苏兰哲", Object.class, Object.class);
                    C2776.f8476.getClass();
                    method.setAccessible(true);
                    C2744 c2744 = new C2744(method, "currency", "number");
                    Class cls14 = AbstractC8569.f23914;
                    C2692 c2692M5600 = C2776.m5600(AbstractC8569.class, AbstractC8569.class, "currency", 0, 0L, null, null, null, cls14, cls14, "currency", null, null);
                    Class cls15 = AbstractC8569.f23916;
                    return new C2798(null, null, null, 0L, c2744, new AbstractC2762[]{c2692M5600, C2776.m5600(AbstractC8569.class, AbstractC8569.class, "number", 0, 0L, null, null, null, cls15, cls15, "number", null, null)}, null, null, null);
                } catch (NoSuchMethodException e3) {
                    C0276.m843("createMonetaryAmountReader error", e3);
                    return null;
                }
            case "java.sql.Timestamp":
                return new C2834(null, null);
            case "org.joda.time.LocalDateTime":
                int i3 = AbstractC2837.f8830;
                return new C2840((Class) type, 1);
            case "java.text.SimpleDateFormat":
                return new C2795(String.class, 0L, null, null, null, new C2604(18));
            case "java.net.InetSocketAddress":
                return new C2791((Class) type);
            case "org.joda.time.Chronology":
                int i4 = AbstractC2837.f8830;
                return new C2832((Class) type);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m5616(C2779 c2779, C8365 c8365, Class cls, Method method) {
        if (method.getDeclaringClass() == Enum.class) {
            return;
        }
        String name = method.getName();
        if (cls.isEnum() && "values".equals(name)) {
            return;
        }
        Annotation[] annotationArrM5820 = AbstractC2865.m5820(method);
        int length = annotationArrM5820.length;
        Method declaredMethod = null;
        InterfaceC8368 interfaceC8368 = null;
        int i = 0;
        boolean z = false;
        while (i < length) {
            Annotation annotation = annotationArrM5820[i];
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            InterfaceC8368 interfaceC83682 = (InterfaceC8368) AbstractC2865.m5819(annotation, InterfaceC8368.class);
            if (interfaceC83682 != annotation) {
                String name2 = clsAnnotationType.getName();
                if (name2.equals("com.fasterxml.jackson.annotation.JsonCreator")) {
                    if (AbstractC2933.f9288) {
                        AbstractC2865.m5811(clsAnnotationType, new C2771(annotation, c8365, 1));
                        z = true;
                    }
                } else if (name2.equals("com.alibaba.fastjson.annotation.JSONCreator")) {
                    AbstractC2865.m5811(clsAnnotationType, new C2771(annotation, c8365, 0));
                    z = true;
                }
            }
            i++;
            interfaceC8368 = interfaceC83682;
        }
        if (interfaceC8368 != null) {
            String[] strArrParameterNames = interfaceC8368.parameterNames();
            if (strArrParameterNames.length != 0) {
                c8365.f23108 = strArrParameterNames;
            }
            z = true;
        }
        if (z) {
            try {
                declaredMethod = cls.getDeclaredMethod(name, method.getParameterTypes());
            } catch (NoSuchMethodException unused) {
            }
            if (declaredMethod != null) {
                c8365.f23107 = declaredMethod;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5617(com.alibaba.fastjson2.reader.C2779 r8, p278.C8365 r9, java.lang.Class r10, java.lang.reflect.Constructor r11) {
        /*
            boolean r8 = r10.isEnum()
            if (r8 == 0) goto L8
            goto L70
        L8:
            java.lang.annotation.Annotation[] r8 = com.alibaba.fastjson2.util.AbstractC2865.m5820(r11)
            int r0 = r8.length
            r1 = 0
            r2 = r1
        Lf:
            if (r1 >= r0) goto L5f
            r3 = r8[r1]
            java.lang.Class r4 = r3.annotationType()
            java.lang.Class<飘花落叶言楪子世兰苏哲.飘花落叶言子楪世哲苏兰> r5 = p279.InterfaceC8368.class
            java.lang.annotation.Annotation r5 = com.alibaba.fastjson2.util.AbstractC2865.m5819(r3, r5)
            飘花落叶言楪子世兰苏哲.飘花落叶言子楪世哲苏兰 r5 = (p279.InterfaceC8368) r5
            r6 = 1
            if (r5 == 0) goto L30
            java.lang.String[] r2 = r5.parameterNames()
            int r7 = r2.length
            if (r7 == 0) goto L2b
            r9.f23108 = r2
        L2b:
            if (r5 != r3) goto L2f
        L2d:
            r2 = r6
            goto L5c
        L2f:
            r2 = r6
        L30:
            java.lang.String r5 = r4.getName()
            java.lang.String r7 = "com.fasterxml.jackson.annotation.JsonCreator"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L57
            java.lang.String r7 = "com.alibaba.fastjson.annotation.JSONCreator"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L4d
            java.lang.String r7 = "飘花落叶言楪子世兰苏哲.飘花落叶言子楪世哲苏兰"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L4d
            goto L5c
        L4d:
            com.alibaba.fastjson2.reader.飘花落叶言子苏世楪兰哲 r2 = new com.alibaba.fastjson2.reader.飘花落叶言子苏世楪兰哲
            r5 = 2
            r2.<init>(r3, r9, r5)
            com.alibaba.fastjson2.util.AbstractC2865.m5811(r4, r2)
            goto L2d
        L57:
            boolean r3 = com.alibaba.fastjson2.AbstractC2933.f9288
            if (r3 == 0) goto L5c
            goto L2d
        L5c:
            int r1 = r1 + 1
            goto Lf
        L5f:
            if (r2 != 0) goto L62
            goto L70
        L62:
            java.lang.Class[] r8 = r11.getParameterTypes()     // Catch: java.lang.NoSuchMethodException -> L6b
            java.lang.reflect.Constructor r8 = r10.getDeclaredConstructor(r8)     // Catch: java.lang.NoSuchMethodException -> L6b
            goto L6c
        L6b:
            r8 = 0
        L6c:
            if (r8 == 0) goto L70
            r9.f23109 = r8
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2779.m5617(com.alibaba.fastjson2.reader.飘花落叶言子苏哲世兰楪, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏哲兰, java.lang.Class, java.lang.reflect.Constructor):void");
    }
}
