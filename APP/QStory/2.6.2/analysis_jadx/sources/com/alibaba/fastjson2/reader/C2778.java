package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.core.view.C2242;
import bsh.classpath.C2601;
import bsh.classpath.C2603;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.C2924;
import com.alibaba.fastjson2.util.AbstractC2836;
import com.alibaba.fastjson2.util.AbstractC2864;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.alibaba.fastjson2.util.C2829;
import com.alibaba.fastjson2.util.C2831;
import com.alibaba.fastjson2.util.C2833;
import com.alibaba.fastjson2.util.C2835;
import com.alibaba.fastjson2.util.C2839;
import com.alibaba.fastjson2.util.C2840;
import com.alibaba.fastjson2.util.C2847;
import com.alibaba.fastjson2.util.C2849;
import com.alibaba.fastjson2.util.C2851;
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
import p278.C8364;
import p279.InterfaceC8367;
import p293.AbstractC8575;
import p294.AbstractC8577;
import p374.C8975;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2778 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Method f8497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2242 f8498 = new C2242(this, 6);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2801 f8499;

    public C2778(C2801 c2801) {
        this.f8499 = c2801;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C2714 m5569(Class cls, Class cls2, Type type, Type type2) {
        return ((type == null || type == String.class) && type2 == String.class) ? new C2715(cls, cls2, 0L) : new C2714(cls, cls2, type, type2, 0L, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC2787 m5570(C2801 c2801, Type type) {
        String str;
        Class cls;
        Type type2;
        Type type3;
        Type type4;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5;
        ConcurrentHashMap concurrentHashMap = c2801.f8665;
        if (type == String.class || type == CharSequence.class) {
            return C2703.f8211;
        }
        if (type == Character.TYPE || type == Character.class) {
            return C2703.f8215;
        }
        if (type == Boolean.TYPE || type == Boolean.class) {
            return C2703.f8204;
        }
        if (type == Byte.TYPE || type == Byte.class) {
            return C2720.f8284;
        }
        if (type == Short.TYPE || type == Short.class) {
            return C2704.f8221;
        }
        Class cls6 = Integer.TYPE;
        if (type == cls6 || type == Integer.class) {
            return C2703.f8216;
        }
        if (type == Long.TYPE || type == Long.class) {
            return C2703.f8219;
        }
        if (type == Float.TYPE || type == Float.class) {
            return C2703.f8218;
        }
        if (type == Double.TYPE || type == Double.class) {
            return C2703.f8214;
        }
        if (type == BigInteger.class) {
            return C2703.f8205;
        }
        if (type == BigDecimal.class) {
            return C2732.f8338;
        }
        if (type == Number.class) {
            return C2703.f8209;
        }
        if (type == BitSet.class) {
            return C2733.f8342;
        }
        if (type == OptionalInt.class) {
            return C2703.f8213;
        }
        if (type == OptionalLong.class) {
            return C2703.f8210;
        }
        if (type == OptionalDouble.class) {
            return C2703.f8212;
        }
        if (type == Optional.class) {
            return C2705.f8222;
        }
        if (type == UUID.class) {
            return C2703.f8207;
        }
        if (type == Duration.class) {
            return new C2735(Duration.class, new C8975(1));
        }
        if (type == Period.class) {
            return new C2735(Period.class, new C2603(17));
        }
        if (type == AtomicBoolean.class) {
            return new C2735(new C2603(20));
        }
        if (type == URI.class) {
            return new C2735(URI.class, new C2603(21));
        }
        if (type == Charset.class) {
            return new C2735(Charset.class, new C2603(22));
        }
        if (type == File.class) {
            return new C2735(File.class, new C2603(23));
        }
        if (type == Path.class) {
            return new C2735(Path.class, new C2603(24));
        }
        if (type == URL.class) {
            return new C2735(URL.class, new C2603(26));
        }
        if (type == Pattern.class) {
            return new C2735(Pattern.class, new C2603(27));
        }
        if (type == Class.class) {
            return C2718.f8281;
        }
        if (type == Method.class) {
            return new C2702();
        }
        if (type == Field.class) {
            return new C2739();
        }
        if (type == Type.class) {
            return C2718.f8281;
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
                return C2713.m5463(type, (Class) type, 0L);
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
            Class clsM5884 = AbstractC2866.m5884(str);
            if (clsM5884 == null && "org.springframework.security.jackson2.SimpleGrantedAuthorityMixin".equals(str)) {
                clsM5884 = AbstractC2866.m5884("com.alibaba.fastjson2.internal.mixin.spring.SimpleGrantedAuthorityMixin");
            }
            Class cls7 = clsM5884;
            if (cls7 != null) {
                concurrentHashMap.putIfAbsent((Class) type, cls7);
            }
        }
        if (type == Map.class || type == AbstractMap.class) {
            return C2713.m5463(null, (Class) type, 0L);
        }
        if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
            return m5569((Class) type, ConcurrentHashMap.class, null, Object.class);
        }
        if (type == ConcurrentNavigableMap.class || type == ConcurrentSkipListMap.class) {
            return m5569((Class) type, ConcurrentSkipListMap.class, null, Object.class);
        }
        if (type == SortedMap.class || type == NavigableMap.class || type == TreeMap.class) {
            return m5569((Class) type, TreeMap.class, null, Object.class);
        }
        if (type == Calendar.class || "javax.xml.datatype.XMLGregorianCalendar".equals(typeName)) {
            return C2723.f8290;
        }
        if (type == Date.class) {
            return C2740.f8376;
        }
        if (type == LocalDate.class) {
            return C2694.f8168;
        }
        if (type == LocalTime.class) {
            return C2716.f8277;
        }
        if (type == LocalDateTime.class) {
            return C2695.f8169;
        }
        if (type == ZonedDateTime.class) {
            return C2792.f8633;
        }
        if (type == OffsetDateTime.class) {
            return C2700.f8199;
        }
        if (type == OffsetTime.class) {
            return C2701.f8200;
        }
        if (type == ZoneOffset.class) {
            return new C2735(ZoneOffset.class, new C2768(0));
        }
        if (type == Instant.class) {
            return C2724.f8291;
        }
        if (type == Locale.class) {
            return C2703.f8217;
        }
        if (type == Currency.class) {
            return C2719.f8283;
        }
        if (type == ZoneId.class) {
            return new C2735(ZoneId.class, new C2768(1));
        }
        if (type == TimeZone.class) {
            return new C2735(TimeZone.class, new C2768(2));
        }
        if (type == char[].class) {
            return C2722.f8288;
        }
        if (type == float[].class) {
            return C2726.f8295;
        }
        if (type == double[].class) {
            return C2737.f8370;
        }
        if (type == boolean[].class) {
            return C2721.f8286;
        }
        if (type == byte[].class) {
            return C2708.f8234;
        }
        if (type == short[].class) {
            return C2729.f8304;
        }
        if (type == int[].class) {
            return C2707.f8231;
        }
        if (type == long[].class) {
            return C2710.f8239;
        }
        if (type == Byte[].class) {
            return C2711.f8242;
        }
        if (type == Short[].class) {
            return C2725.f8293;
        }
        if (type == Integer[].class) {
            return C2728.f8302;
        }
        if (type == Long[].class) {
            return C2706.f8229;
        }
        if (type == Float[].class) {
            return C2738.f8373;
        }
        if (type == Double[].class) {
            return C2741.f8378;
        }
        if (type == Number[].class) {
            return C2703.f8208;
        }
        if (type == String[].class) {
            return C2795.f8647;
        }
        if (type == AtomicInteger.class) {
            return new C2703(new C2601(2));
        }
        if (type == AtomicLong.class) {
            return new C2703(new C2767());
        }
        if (type == AtomicIntegerArray.class) {
            return new C2707(AtomicIntegerArray.class, new C2768(3));
        }
        if (type == AtomicLongArray.class) {
            return new C2710(AtomicLongArray.class, new C2603(15));
        }
        if (type == AtomicReference.class) {
            return C2735.f8357;
        }
        if (type == StringBuffer.class || type == StringBuilder.class) {
            try {
                return new C2794(String.class, 0L, null, ((Class) type).getConstructor(String.class), null, null);
            } catch (NoSuchMethodException e) {
                C5919.m11252(e);
                return null;
            }
        }
        if (type == Iterable.class || type == Collection.class || type == List.class || type == AbstractCollection.class || type == AbstractList.class || type == ArrayList.class || type == Stack.class) {
            return C2697.m5455(null, type);
        }
        if (type == Queue.class || type == Deque.class || type == AbstractSequentialList.class || type == LinkedList.class) {
            return C2697.m5455(null, type);
        }
        if (type == Set.class || type == AbstractSet.class || type == EnumSet.class) {
            return C2697.m5455(null, type);
        }
        if (type == NavigableSet.class || type == SortedSet.class) {
            return C2697.m5455(null, type);
        }
        if (type == ConcurrentLinkedDeque.class || type == ConcurrentLinkedQueue.class || type == ConcurrentSkipListSet.class || type == LinkedHashSet.class || type == HashSet.class || type == TreeSet.class || type == CopyOnWriteArrayList.class) {
            return C2697.m5455(null, type);
        }
        if (type == C2697.f8180 || type == C2697.f8179 || type == C2697.f8183 || type == C2697.f8184 || type == C2697.f8181 || type == C2697.f8182 || type == C2697.f8174 || type == C2697.f8173 || type == C2697.f8177 || type == C2697.f8178) {
            return C2697.m5455(null, type);
        }
        if (type == AbstractC2866.f9047) {
            return C2697.m5455(null, type);
        }
        if (type == Object.class || type == Cloneable.class || type == Closeable.class || type == Serializable.class || type == Comparable.class) {
            return C2703.f8206;
        }
        if (type == Map.Entry.class) {
            return new C2712(null, null);
        }
        if (type instanceof Class) {
            Class cls8 = (Class) type;
            if (AbstractC2864.m5755(cls8)) {
                return null;
            }
            if (Map.class.isAssignableFrom(cls8)) {
                return C2713.m5463(null, cls8, 0L);
            }
            type2 = TreeMap.class;
            type3 = List.class;
            type4 = Iterable.class;
            if (Collection.class.isAssignableFrom(cls8)) {
                return C2697.m5455(cls8, cls8);
            }
            if (cls8.isArray()) {
                return cls8.getComponentType() == Object.class ? C2680.f8148 : new C2676(cls8);
            }
            if (C2924.class.isAssignableFrom(cls8)) {
                return new C2709(cls8);
            }
            C2801 c2801M6329 = AbstractC2932.m6329();
            c2801M6329.getClass();
            C2775 c2775 = (C2775) AbstractC2932.f9290.get();
            if (c2775 == null) {
                c2775 = c2801M6329.f8674;
            }
            if (cls8 == StackTraceElement.class) {
                try {
                    Constructor constructor = cls8.getConstructor(String.class, String.class, String.class, cls6);
                    cls = cls6;
                    try {
                        c2775.getClass();
                        return C2775.m5552(constructor, "className", "methodName", "fileName", "lineNumber");
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
                    return m5569((Class) rawType, HashMap.class, type5, type6);
                }
                if (rawType == ConcurrentMap.class || rawType == ConcurrentHashMap.class) {
                    return m5569((Class) rawType, ConcurrentHashMap.class, type5, type6);
                }
                if (rawType == ConcurrentNavigableMap.class || rawType == ConcurrentSkipListMap.class) {
                    return m5569((Class) rawType, ConcurrentSkipListMap.class, type5, type6);
                }
                if (rawType == LinkedHashMap.class || rawType == type2 || rawType == Hashtable.class) {
                    Class cls9 = (Class) rawType;
                    return m5569(cls9, cls9, type5, type6);
                }
                if (rawType == Map.Entry.class) {
                    return new C2712(type5, type6);
                }
                String typeName2 = rawType.getTypeName();
                typeName2.getClass();
                switch (typeName2) {
                    case "com.google.common.collect.SingletonImmutableBiMap":
                        return new C2714((Class) rawType, HashMap.class, type5, type6, 0L, new C2849(3));
                    case "org.springframework.util.LinkedMultiValueMap":
                        return C2713.m5463(type, (Class) rawType, 0L);
                    case "org.apache.commons.lang3.tuple.Pair":
                    case "org.apache.commons.lang3.tuple.ImmutablePair":
                        return new C2847((Class) rawType, type5, type6);
                    case "com.google.common.collect.ImmutableMap":
                    case "com.google.common.collect.RegularImmutableMap":
                        return new C2714((Class) rawType, HashMap.class, type5, type6, 0L, new C2849(2));
                    default:
                        return null;
                }
            }
            if (actualTypeArguments.length != 1) {
                return null;
            }
            Type type7 = actualTypeArguments[0];
            Class clsM5897 = AbstractC2866.m5897(type7);
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
                                return clsM5897 == String.class ? new C2698((Class) rawType, HashSet.class) : clsM5897 == Long.class ? new C2696((Class) rawType, HashSet.class) : C2697.m5455(null, type);
                            }
                            if (rawType == NavigableSet.class || rawType == SortedSet.class) {
                                return type7 == String.class ? new C2698((Class) rawType, TreeSet.class) : clsM5897 == Long.class ? new C2696((Class) rawType, TreeSet.class) : C2697.m5455(null, type);
                            }
                            if (rawType == ConcurrentLinkedDeque.class || rawType == ConcurrentLinkedQueue.class || rawType == ConcurrentSkipListSet.class || rawType == LinkedHashSet.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == CopyOnWriteArrayList.class) {
                                if (type7 == String.class) {
                                    Class cls10 = (Class) rawType;
                                    return new C2698(cls10, cls10);
                                }
                                if (clsM5897 != Long.class) {
                                    return C2697.m5455(null, type);
                                }
                                Class cls11 = (Class) rawType;
                                return new C2696(cls11, cls11);
                            }
                            String typeName3 = rawType.getTypeName();
                            typeName3.getClass();
                            switch (typeName3) {
                                case "com.google.common.collect.ImmutableList":
                                case "com.google.common.collect.SingletonImmutableSet":
                                case "com.google.common.collect.ImmutableSet":
                                    return C2697.m5455(null, type);
                                case "cn.hutool.core.lang.tree.Tree":
                                    return C2713.m5463(null, (Class) rawType, 0L);
                                default:
                                    if (rawType == Optional.class) {
                                        return new C2705(type, null, null);
                                    }
                                    if (rawType == AtomicReference.class) {
                                        return new C2735(type7);
                                    }
                                    if (type7 instanceof WildcardType) {
                                        return m5570(c2801, rawType);
                                    }
                                    return null;
                            }
                        }
                        cls4 = Long.class;
                    }
                    return clsM5897 == String.class ? new C2698((Class) rawType, cls5) : clsM5897 == cls4 ? new C2696((Class) rawType, cls5) : C2697.m5455(null, type);
                }
                cls2 = Long.class;
            }
            return clsM5897 == String.class ? new C2698((Class) rawType, cls3) : clsM5897 == cls2 ? new C2696((Class) rawType, cls3) : C2697.m5455(null, type);
        }
        if (type instanceof GenericArrayType) {
            return new C2727((GenericArrayType) type);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m5570(c2801, upperBounds[0]);
            }
        }
        if (type == ParameterizedType.class) {
            C2775 c27752 = C2775.f8474;
            c27752.getClass();
            return c27752.mo5484(C2829.class, C2829.class, false, AbstractC2932.m6329());
        }
        switch (typeName) {
            case "java.awt.Color":
                try {
                    Class cls12 = cls;
                    Constructor constructor2 = ((Class) type).getConstructor(cls12, cls12, cls12, cls12);
                    C2775.f8474.getClass();
                    return C2775.m5552(constructor2, "r", "g", "b", "alpha");
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
                List listAsList = Arrays.asList(AbstractC2864.m5776(cls13));
                C2780 c2780 = new C2780(0);
                C2775.f8474.getClass();
                return new C2734(cls13, listAsList, C2775.m5548(null, null, "stackTrace", StackTraceElement[].class, StackTraceElement[].class, 0, 0L, null, null, null, null, null, c2780, null));
            case "com.google.common.collect.ImmutableList":
            case "com.google.common.collect.SingletonImmutableSet":
            case "com.google.common.collect.ImmutableSet":
            case "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList":
            case "com.google.common.collect.RegularImmutableSet":
                return C2697.m5455(null, type);
            case "javax.money.NumberValue":
                if (AbstractC8577.f23925 == null) {
                    AbstractC8577.f23925 = AbstractC2866.m5884("org.javamoney.moneta.spi.DefaultNumberValue");
                }
                if (AbstractC8577.f23929 == null) {
                    try {
                        AbstractC8577.f23929 = AbstractC8577.f23925.getMethod("of", Number.class);
                    } catch (NoSuchMethodException e2) {
                        C0276.m842("method not found : org.javamoney.moneta.spi.DefaultNumberValue.of", e2);
                        return null;
                    }
                    break;
                }
                if (AbstractC8577.f23924 == null) {
                    AbstractC8577.f23924 = AbstractC2866.m5884("javax.money.NumberValue");
                }
                return new C2794(BigDecimal.class, 0L, null, null, AbstractC8577.f23929, null);
            case "org.joda.time.LocalDate":
                int i = AbstractC2836.f8828;
                return new C2839((Class) type, 0);
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
                return AbstractC8575.m14129((Class) type);
            case "java.util.JumboEnumSet":
            case "java.util.RegularEnumSet":
                return C2697.m5455(AbstractC2866.m5899(type), type);
            case "javax.money.CurrencyUnit":
                return AbstractC8577.m14131();
            case "java.net.InetAddress":
                return new C2794(String.class, 0L, null, null, null, new C2603(16));
            case "java.nio.HeapByteBuffer":
            case "java.nio.ByteBuffer":
                return new C2708(null, new C2603(19));
            case "org.apache.commons.lang3.tuple.Pair":
            case "org.apache.commons.lang3.tuple.ImmutablePair":
                return new C2847((Class) type, Object.class, Object.class);
            case "org.joda.time.Instant":
                int i2 = AbstractC2836.f8828;
                return new C2840((Class) type);
            case "java.sql.Date":
                return new C2851(null, null);
            case "java.sql.Time":
                return new C2835(null, null);
            case "org.joda.time.DateTime":
                C2849 c2849 = new C2849(5);
                C2792 c2792 = new C2792(null, null);
                c2792.f8634 = c2849;
                return c2792;
            case "javax.money.MonetaryAmount":
            case "javax.money.Money":
                if (AbstractC8577.f23924 == null) {
                    AbstractC8577.f23924 = AbstractC2866.m5884("javax.money.NumberValue");
                }
                if (AbstractC8577.f23923 == null) {
                    AbstractC8577.f23923 = AbstractC2866.m5884("javax.money.CurrencyUnit");
                }
                try {
                    Method method = AbstractC8577.class.getMethod("飘花落叶言子楪世苏兰哲", Object.class, Object.class);
                    C2775.f8474.getClass();
                    method.setAccessible(true);
                    C2743 c2743 = new C2743(method, "currency", "number");
                    Class cls14 = AbstractC8577.f23923;
                    C2691 c2691M5555 = C2775.m5555(AbstractC8577.class, AbstractC8577.class, "currency", 0, 0L, null, null, null, cls14, cls14, "currency", null, null);
                    Class cls15 = AbstractC8577.f23925;
                    return new C2797(null, null, null, 0L, c2743, new AbstractC2761[]{c2691M5555, C2775.m5555(AbstractC8577.class, AbstractC8577.class, "number", 0, 0L, null, null, null, cls15, cls15, "number", null, null)}, null, null, null);
                } catch (NoSuchMethodException e3) {
                    C0276.m842("createMonetaryAmountReader error", e3);
                    return null;
                }
            case "java.sql.Timestamp":
                return new C2833(null, null);
            case "org.joda.time.LocalDateTime":
                int i3 = AbstractC2836.f8828;
                return new C2839((Class) type, 1);
            case "java.text.SimpleDateFormat":
                return new C2794(String.class, 0L, null, null, null, new C2603(18));
            case "java.net.InetSocketAddress":
                return new C2790((Class) type);
            case "org.joda.time.Chronology":
                int i4 = AbstractC2836.f8828;
                return new C2831((Class) type);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m5571(C2778 c2778, C8364 c8364, Class cls, Method method) {
        if (method.getDeclaringClass() == Enum.class) {
            return;
        }
        String name = method.getName();
        if (cls.isEnum() && "values".equals(name)) {
            return;
        }
        Annotation[] annotationArrM5775 = AbstractC2864.m5775(method);
        int length = annotationArrM5775.length;
        Method declaredMethod = null;
        InterfaceC8367 interfaceC8367 = null;
        int i = 0;
        boolean z = false;
        while (i < length) {
            Annotation annotation = annotationArrM5775[i];
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            InterfaceC8367 interfaceC83672 = (InterfaceC8367) AbstractC2864.m5774(annotation, InterfaceC8367.class);
            if (interfaceC83672 != annotation) {
                String name2 = clsAnnotationType.getName();
                if (name2.equals("com.fasterxml.jackson.annotation.JsonCreator")) {
                    if (AbstractC2932.f9286) {
                        AbstractC2864.m5766(clsAnnotationType, new C2770(annotation, c8364, 1));
                        z = true;
                    }
                } else if (name2.equals("com.alibaba.fastjson.annotation.JSONCreator")) {
                    AbstractC2864.m5766(clsAnnotationType, new C2770(annotation, c8364, 0));
                    z = true;
                }
            }
            i++;
            interfaceC8367 = interfaceC83672;
        }
        if (interfaceC8367 != null) {
            String[] strArrParameterNames = interfaceC8367.parameterNames();
            if (strArrParameterNames.length != 0) {
                c8364.f23109 = strArrParameterNames;
            }
            z = true;
        }
        if (z) {
            try {
                declaredMethod = cls.getDeclaredMethod(name, method.getParameterTypes());
            } catch (NoSuchMethodException unused) {
            }
            if (declaredMethod != null) {
                c8364.f23108 = declaredMethod;
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
    public static void m5572(com.alibaba.fastjson2.reader.C2778 r8, p278.C8364 r9, java.lang.Class r10, java.lang.reflect.Constructor r11) {
        /*
            boolean r8 = r10.isEnum()
            if (r8 == 0) goto L8
            goto L70
        L8:
            java.lang.annotation.Annotation[] r8 = com.alibaba.fastjson2.util.AbstractC2864.m5775(r11)
            int r0 = r8.length
            r1 = 0
            r2 = r1
        Lf:
            if (r1 >= r0) goto L5f
            r3 = r8[r1]
            java.lang.Class r4 = r3.annotationType()
            java.lang.Class<飘花落叶言楪子世兰苏哲.飘花落叶言子楪世哲苏兰> r5 = p279.InterfaceC8367.class
            java.lang.annotation.Annotation r5 = com.alibaba.fastjson2.util.AbstractC2864.m5774(r3, r5)
            飘花落叶言楪子世兰苏哲.飘花落叶言子楪世哲苏兰 r5 = (p279.InterfaceC8367) r5
            r6 = 1
            if (r5 == 0) goto L30
            java.lang.String[] r2 = r5.parameterNames()
            int r7 = r2.length
            if (r7 == 0) goto L2b
            r9.f23109 = r2
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
            com.alibaba.fastjson2.util.AbstractC2864.m5766(r4, r2)
            goto L2d
        L57:
            boolean r3 = com.alibaba.fastjson2.AbstractC2932.f9286
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
            r9.f23110 = r8
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2778.m5572(com.alibaba.fastjson2.reader.飘花落叶言子苏哲世兰楪, 飘花落叶言楪子世兰哲苏.飘花落叶言子楪世苏哲兰, java.lang.Class, java.lang.reflect.Constructor):void");
    }
}
