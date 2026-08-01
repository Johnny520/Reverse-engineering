package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import androidx.core.view.C3075;
import bsh.classpath.C3435;
import bsh.classpath.C3437;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3758;
import com.alibaba.fastjson2.util.AbstractC3670;
import com.alibaba.fastjson2.util.AbstractC3698;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.alibaba.fastjson2.util.C3663;
import com.alibaba.fastjson2.util.C3665;
import com.alibaba.fastjson2.util.C3667;
import com.alibaba.fastjson2.util.C3669;
import com.alibaba.fastjson2.util.C3673;
import com.alibaba.fastjson2.util.C3674;
import com.alibaba.fastjson2.util.C3681;
import com.alibaba.fastjson2.util.C3683;
import com.alibaba.fastjson2.util.C3685;
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
import p294.C9194;
import p295.InterfaceC9197;
import p309.AbstractC9396;
import p310.AbstractC9398;
import p388.C9803;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3612 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static Method f8844;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3075 f8845 = new C3075(this, 6);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3635 f8846;

    public C3612(C3635 c3635) {
        this.f8846 = c3635;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C3548 m6174(Class cls, Class cls2, Type type, Type type2) {
        return ((type == null || type == String.class) && type2 == String.class) ? new C3549(cls, cls2, 0L) : new C3548(cls, cls2, type, type2, 0L, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC3621 m6175(C3635 c3635, Type type) {
        String str;
        Class cls;
        Type type2;
        Type type3;
        Type type4;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5;
        ConcurrentHashMap concurrentHashMap = c3635.f9012;
        if (type == String.class || type == CharSequence.class) {
            return C3537.f8558;
        }
        if (type == Character.TYPE || type == Character.class) {
            return C3537.f8562;
        }
        if (type == Boolean.TYPE || type == Boolean.class) {
            return C3537.f8551;
        }
        if (type == Byte.TYPE || type == Byte.class) {
            return C3554.f8631;
        }
        if (type == Short.TYPE || type == Short.class) {
            return C3538.f8568;
        }
        Class cls6 = Integer.TYPE;
        if (type == cls6 || type == Integer.class) {
            return C3537.f8563;
        }
        if (type == Long.TYPE || type == Long.class) {
            return C3537.f8566;
        }
        if (type == Float.TYPE || type == Float.class) {
            return C3537.f8565;
        }
        if (type == Double.TYPE || type == Double.class) {
            return C3537.f8561;
        }
        if (type == BigInteger.class) {
            return C3537.f8552;
        }
        if (type == BigDecimal.class) {
            return C3566.f8685;
        }
        if (type == Number.class) {
            return C3537.f8556;
        }
        if (type == BitSet.class) {
            return C3567.f8689;
        }
        if (type == OptionalInt.class) {
            return C3537.f8560;
        }
        if (type == OptionalLong.class) {
            return C3537.f8557;
        }
        if (type == OptionalDouble.class) {
            return C3537.f8559;
        }
        if (type == Optional.class) {
            return C3539.f8569;
        }
        if (type == UUID.class) {
            return C3537.f8554;
        }
        if (type == Duration.class) {
            return new C3569(Duration.class, new C9803(1));
        }
        if (type == Period.class) {
            return new C3569(Period.class, new C3437(17));
        }
        if (type == AtomicBoolean.class) {
            return new C3569(new C3437(20));
        }
        if (type == URI.class) {
            return new C3569(URI.class, new C3437(21));
        }
        if (type == Charset.class) {
            return new C3569(Charset.class, new C3437(22));
        }
        if (type == File.class) {
            return new C3569(File.class, new C3437(23));
        }
        if (type == Path.class) {
            return new C3569(Path.class, new C3437(24));
        }
        if (type == URL.class) {
            return new C3569(URL.class, new C3437(26));
        }
        if (type == Pattern.class) {
            return new C3569(Pattern.class, new C3437(27));
        }
        if (type == Class.class) {
            return C3552.f8628;
        }
        if (type == Method.class) {
            return new C3536();
        }
        if (type == Field.class) {
            return new C3573();
        }
        if (type == Type.class) {
            return C3552.f8628;
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
                return C3547.m6068(type, (Class) type, 0L);
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
            Class clsM6489 = AbstractC3700.m6489(str);
            if (clsM6489 == null && "org.springframework.security.jackson2.SimpleGrantedAuthorityMixin".equals(str)) {
                clsM6489 = AbstractC3700.m6489("com.alibaba.fastjson2.internal.mixin.spring.SimpleGrantedAuthorityMixin");
            }
            Class cls7 = clsM6489;
            if (cls7 != null) {
                concurrentHashMap.putIfAbsent((Class) type, cls7);
            }
        }
        if (type == Map.class || type == AbstractMap.class) {
            return C3547.m6068(null, (Class) type, 0L);
        }
        if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
            return m6174((Class) type, ConcurrentHashMap.class, null, Object.class);
        }
        if (type == ConcurrentNavigableMap.class || type == ConcurrentSkipListMap.class) {
            return m6174((Class) type, ConcurrentSkipListMap.class, null, Object.class);
        }
        if (type == SortedMap.class || type == NavigableMap.class || type == TreeMap.class) {
            return m6174((Class) type, TreeMap.class, null, Object.class);
        }
        if (type == Calendar.class || "javax.xml.datatype.XMLGregorianCalendar".equals(typeName)) {
            return C3557.f8637;
        }
        if (type == Date.class) {
            return C3574.f8723;
        }
        if (type == LocalDate.class) {
            return C3528.f8515;
        }
        if (type == LocalTime.class) {
            return C3550.f8624;
        }
        if (type == LocalDateTime.class) {
            return C3529.f8516;
        }
        if (type == ZonedDateTime.class) {
            return C3626.f8980;
        }
        if (type == OffsetDateTime.class) {
            return C3534.f8546;
        }
        if (type == OffsetTime.class) {
            return C3535.f8547;
        }
        if (type == ZoneOffset.class) {
            return new C3569(ZoneOffset.class, new C3602(0));
        }
        if (type == Instant.class) {
            return C3558.f8638;
        }
        if (type == Locale.class) {
            return C3537.f8564;
        }
        if (type == Currency.class) {
            return C3553.f8630;
        }
        if (type == ZoneId.class) {
            return new C3569(ZoneId.class, new C3602(1));
        }
        if (type == TimeZone.class) {
            return new C3569(TimeZone.class, new C3602(2));
        }
        if (type == char[].class) {
            return C3556.f8635;
        }
        if (type == float[].class) {
            return C3560.f8642;
        }
        if (type == double[].class) {
            return C3571.f8717;
        }
        if (type == boolean[].class) {
            return C3555.f8633;
        }
        if (type == byte[].class) {
            return C3542.f8581;
        }
        if (type == short[].class) {
            return C3563.f8651;
        }
        if (type == int[].class) {
            return C3541.f8578;
        }
        if (type == long[].class) {
            return C3544.f8586;
        }
        if (type == Byte[].class) {
            return C3545.f8589;
        }
        if (type == Short[].class) {
            return C3559.f8640;
        }
        if (type == Integer[].class) {
            return C3562.f8649;
        }
        if (type == Long[].class) {
            return C3540.f8576;
        }
        if (type == Float[].class) {
            return C3572.f8720;
        }
        if (type == Double[].class) {
            return C3575.f8725;
        }
        if (type == Number[].class) {
            return C3537.f8555;
        }
        if (type == String[].class) {
            return C3629.f8994;
        }
        if (type == AtomicInteger.class) {
            return new C3537(new C3435(2));
        }
        if (type == AtomicLong.class) {
            return new C3537(new C3601());
        }
        if (type == AtomicIntegerArray.class) {
            return new C3541(AtomicIntegerArray.class, new C3602(3));
        }
        if (type == AtomicLongArray.class) {
            return new C3544(AtomicLongArray.class, new C3437(15));
        }
        if (type == AtomicReference.class) {
            return C3569.f8704;
        }
        if (type == StringBuffer.class || type == StringBuilder.class) {
            try {
                return new C3628(String.class, 0L, null, ((Class) type).getConstructor(String.class), null, null);
            } catch (NoSuchMethodException e) {
                C6755.m11872(e);
                return null;
            }
        }
        if (type == Iterable.class || type == Collection.class || type == List.class || type == AbstractCollection.class || type == AbstractList.class || type == ArrayList.class || type == Stack.class) {
            return C3531.m6060(null, type);
        }
        if (type == Queue.class || type == Deque.class || type == AbstractSequentialList.class || type == LinkedList.class) {
            return C3531.m6060(null, type);
        }
        if (type == Set.class || type == AbstractSet.class || type == EnumSet.class) {
            return C3531.m6060(null, type);
        }
        if (type == NavigableSet.class || type == SortedSet.class) {
            return C3531.m6060(null, type);
        }
        if (type == ConcurrentLinkedDeque.class || type == ConcurrentLinkedQueue.class || type == ConcurrentSkipListSet.class || type == LinkedHashSet.class || type == HashSet.class || type == TreeSet.class || type == CopyOnWriteArrayList.class) {
            return C3531.m6060(null, type);
        }
        if (type == C3531.f8527 || type == C3531.f8526 || type == C3531.f8530 || type == C3531.f8531 || type == C3531.f8528 || type == C3531.f8529 || type == C3531.f8521 || type == C3531.f8520 || type == C3531.f8524 || type == C3531.f8525) {
            return C3531.m6060(null, type);
        }
        if (type == AbstractC3700.f9394) {
            return C3531.m6060(null, type);
        }
        if (type == Object.class || type == Cloneable.class || type == Closeable.class || type == Serializable.class || type == Comparable.class) {
            return C3537.f8553;
        }
        if (type == Map.Entry.class) {
            return new C3546(null, null);
        }
        if (type instanceof Class) {
            Class cls8 = (Class) type;
            if (AbstractC3698.m6360(cls8)) {
                return null;
            }
            if (Map.class.isAssignableFrom(cls8)) {
                return C3547.m6068(null, cls8, 0L);
            }
            type2 = TreeMap.class;
            type3 = List.class;
            type4 = Iterable.class;
            if (Collection.class.isAssignableFrom(cls8)) {
                return C3531.m6060(cls8, cls8);
            }
            if (cls8.isArray()) {
                return cls8.getComponentType() == Object.class ? C3514.f8495 : new C3510(cls8);
            }
            if (C3758.class.isAssignableFrom(cls8)) {
                return new C3543(cls8);
            }
            C3635 c3635M6947 = AbstractC3766.m6947();
            c3635M6947.getClass();
            C3609 c3609 = (C3609) AbstractC3766.f9637.get();
            if (c3609 == null) {
                c3609 = c3635M6947.f9021;
            }
            if (cls8 == StackTraceElement.class) {
                try {
                    Constructor constructor = cls8.getConstructor(String.class, String.class, String.class, cls6);
                    cls = cls6;
                    try {
                        c3609.getClass();
                        return C3609.m6157(constructor, "className", "methodName", "fileName", "lineNumber");
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
                    return m6174((Class) rawType, HashMap.class, type5, type6);
                }
                if (rawType == ConcurrentMap.class || rawType == ConcurrentHashMap.class) {
                    return m6174((Class) rawType, ConcurrentHashMap.class, type5, type6);
                }
                if (rawType == ConcurrentNavigableMap.class || rawType == ConcurrentSkipListMap.class) {
                    return m6174((Class) rawType, ConcurrentSkipListMap.class, type5, type6);
                }
                if (rawType == LinkedHashMap.class || rawType == type2 || rawType == Hashtable.class) {
                    Class cls9 = (Class) rawType;
                    return m6174(cls9, cls9, type5, type6);
                }
                if (rawType == Map.Entry.class) {
                    return new C3546(type5, type6);
                }
                String typeName2 = rawType.getTypeName();
                typeName2.getClass();
                switch (typeName2) {
                    case "com.google.common.collect.SingletonImmutableBiMap":
                        return new C3548((Class) rawType, HashMap.class, type5, type6, 0L, new C3683(3));
                    case "org.springframework.util.LinkedMultiValueMap":
                        return C3547.m6068(type, (Class) rawType, 0L);
                    case "org.apache.commons.lang3.tuple.Pair":
                    case "org.apache.commons.lang3.tuple.ImmutablePair":
                        return new C3681((Class) rawType, type5, type6);
                    case "com.google.common.collect.ImmutableMap":
                    case "com.google.common.collect.RegularImmutableMap":
                        return new C3548((Class) rawType, HashMap.class, type5, type6, 0L, new C3683(2));
                    default:
                        return null;
                }
            }
            if (actualTypeArguments.length != 1) {
                return null;
            }
            Type type7 = actualTypeArguments[0];
            Class clsM6502 = AbstractC3700.m6502(type7);
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
                                return clsM6502 == String.class ? new C3532((Class) rawType, HashSet.class) : clsM6502 == Long.class ? new C3530((Class) rawType, HashSet.class) : C3531.m6060(null, type);
                            }
                            if (rawType == NavigableSet.class || rawType == SortedSet.class) {
                                return type7 == String.class ? new C3532((Class) rawType, TreeSet.class) : clsM6502 == Long.class ? new C3530((Class) rawType, TreeSet.class) : C3531.m6060(null, type);
                            }
                            if (rawType == ConcurrentLinkedDeque.class || rawType == ConcurrentLinkedQueue.class || rawType == ConcurrentSkipListSet.class || rawType == LinkedHashSet.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == CopyOnWriteArrayList.class) {
                                if (type7 == String.class) {
                                    Class cls10 = (Class) rawType;
                                    return new C3532(cls10, cls10);
                                }
                                if (clsM6502 != Long.class) {
                                    return C3531.m6060(null, type);
                                }
                                Class cls11 = (Class) rawType;
                                return new C3530(cls11, cls11);
                            }
                            String typeName3 = rawType.getTypeName();
                            typeName3.getClass();
                            switch (typeName3) {
                                case "com.google.common.collect.ImmutableList":
                                case "com.google.common.collect.SingletonImmutableSet":
                                case "com.google.common.collect.ImmutableSet":
                                    return C3531.m6060(null, type);
                                case "cn.hutool.core.lang.tree.Tree":
                                    return C3547.m6068(null, (Class) rawType, 0L);
                                default:
                                    if (rawType == Optional.class) {
                                        return new C3539(type, null, null);
                                    }
                                    if (rawType == AtomicReference.class) {
                                        return new C3569(type7);
                                    }
                                    if (type7 instanceof WildcardType) {
                                        return m6175(c3635, rawType);
                                    }
                                    return null;
                            }
                        }
                        cls4 = Long.class;
                    }
                    return clsM6502 == String.class ? new C3532((Class) rawType, cls5) : clsM6502 == cls4 ? new C3530((Class) rawType, cls5) : C3531.m6060(null, type);
                }
                cls2 = Long.class;
            }
            return clsM6502 == String.class ? new C3532((Class) rawType, cls3) : clsM6502 == cls2 ? new C3530((Class) rawType, cls3) : C3531.m6060(null, type);
        }
        if (type instanceof GenericArrayType) {
            return new C3561((GenericArrayType) type);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m6175(c3635, upperBounds[0]);
            }
        }
        if (type == ParameterizedType.class) {
            C3609 c36092 = C3609.f8821;
            c36092.getClass();
            return c36092.mo6089(C3663.class, C3663.class, false, AbstractC3766.m6947());
        }
        switch (typeName) {
            case "java.awt.Color":
                try {
                    Class cls12 = cls;
                    Constructor constructor2 = ((Class) type).getConstructor(cls12, cls12, cls12, cls12);
                    C3609.f8821.getClass();
                    return C3609.m6157(constructor2, "r", "g", "b", "alpha");
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
                List listAsList = Arrays.asList(AbstractC3698.m6381(cls13));
                C3614 c3614 = new C3614(0);
                C3609.f8821.getClass();
                return new C3568(cls13, listAsList, C3609.m6153(null, null, "stackTrace", StackTraceElement[].class, StackTraceElement[].class, 0, 0L, null, null, null, null, null, c3614, null));
            case "com.google.common.collect.ImmutableList":
            case "com.google.common.collect.SingletonImmutableSet":
            case "com.google.common.collect.ImmutableSet":
            case "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList":
            case "com.google.common.collect.RegularImmutableSet":
                return C3531.m6060(null, type);
            case "javax.money.NumberValue":
                if (AbstractC9398.f24261 == null) {
                    AbstractC9398.f24261 = AbstractC3700.m6489("org.javamoney.moneta.spi.DefaultNumberValue");
                }
                if (AbstractC9398.f24265 == null) {
                    try {
                        AbstractC9398.f24265 = AbstractC9398.f24261.getMethod("of", Number.class);
                    } catch (NoSuchMethodException e2) {
                        C1123.m1403("method not found : org.javamoney.moneta.spi.DefaultNumberValue.of", e2);
                        return null;
                    }
                    break;
                }
                if (AbstractC9398.f24260 == null) {
                    AbstractC9398.f24260 = AbstractC3700.m6489("javax.money.NumberValue");
                }
                return new C3628(BigDecimal.class, 0L, null, null, AbstractC9398.f24265, null);
            case "org.joda.time.LocalDate":
                int i = AbstractC3670.f9175;
                return new C3673((Class) type, 0);
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
                return AbstractC9396.m14707((Class) type);
            case "java.util.JumboEnumSet":
            case "java.util.RegularEnumSet":
                return C3531.m6060(AbstractC3700.m6504(type), type);
            case "javax.money.CurrencyUnit":
                return AbstractC9398.m14709();
            case "java.net.InetAddress":
                return new C3628(String.class, 0L, null, null, null, new C3437(16));
            case "java.nio.HeapByteBuffer":
            case "java.nio.ByteBuffer":
                return new C3542(null, new C3437(19));
            case "org.apache.commons.lang3.tuple.Pair":
            case "org.apache.commons.lang3.tuple.ImmutablePair":
                return new C3681((Class) type, Object.class, Object.class);
            case "org.joda.time.Instant":
                int i2 = AbstractC3670.f9175;
                return new C3674((Class) type);
            case "java.sql.Date":
                return new C3685(null, null);
            case "java.sql.Time":
                return new C3669(null, null);
            case "org.joda.time.DateTime":
                C3683 c3683 = new C3683(5);
                C3626 c3626 = new C3626(null, null);
                c3626.f8981 = c3683;
                return c3626;
            case "javax.money.MonetaryAmount":
            case "javax.money.Money":
                if (AbstractC9398.f24260 == null) {
                    AbstractC9398.f24260 = AbstractC3700.m6489("javax.money.NumberValue");
                }
                if (AbstractC9398.f24259 == null) {
                    AbstractC9398.f24259 = AbstractC3700.m6489("javax.money.CurrencyUnit");
                }
                try {
                    Method method = AbstractC9398.class.getMethod("飘花落叶言子楪世苏兰哲", Object.class, Object.class);
                    C3609.f8821.getClass();
                    method.setAccessible(true);
                    C3577 c3577 = new C3577(method, "currency", "number");
                    Class cls14 = AbstractC9398.f24259;
                    C3525 c3525M6160 = C3609.m6160(AbstractC9398.class, AbstractC9398.class, "currency", 0, 0L, null, null, null, cls14, cls14, "currency", null, null);
                    Class cls15 = AbstractC9398.f24261;
                    return new C3631(null, null, null, 0L, c3577, new AbstractC3595[]{c3525M6160, C3609.m6160(AbstractC9398.class, AbstractC9398.class, "number", 0, 0L, null, null, null, cls15, cls15, "number", null, null)}, null, null, null);
                } catch (NoSuchMethodException e3) {
                    C1123.m1403("createMonetaryAmountReader error", e3);
                    return null;
                }
            case "java.sql.Timestamp":
                return new C3667(null, null);
            case "org.joda.time.LocalDateTime":
                int i3 = AbstractC3670.f9175;
                return new C3673((Class) type, 1);
            case "java.text.SimpleDateFormat":
                return new C3628(String.class, 0L, null, null, null, new C3437(18));
            case "java.net.InetSocketAddress":
                return new C3624((Class) type);
            case "org.joda.time.Chronology":
                int i4 = AbstractC3670.f9175;
                return new C3665((Class) type);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m6176(C3612 c3612, C9194 c9194, Class cls, Method method) {
        if (method.getDeclaringClass() == Enum.class) {
            return;
        }
        String name = method.getName();
        if (cls.isEnum() && "values".equals(name)) {
            return;
        }
        Annotation[] annotationArrM6380 = AbstractC3698.m6380(method);
        int length = annotationArrM6380.length;
        Method declaredMethod = null;
        InterfaceC9197 interfaceC9197 = null;
        int i = 0;
        boolean z = false;
        while (i < length) {
            Annotation annotation = annotationArrM6380[i];
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            InterfaceC9197 interfaceC91972 = (InterfaceC9197) AbstractC3698.m6379(annotation, InterfaceC9197.class);
            if (interfaceC91972 != annotation) {
                String name2 = clsAnnotationType.getName();
                if (name2.equals("com.fasterxml.jackson.annotation.JsonCreator")) {
                    if (AbstractC3766.f9633) {
                        AbstractC3698.m6371(clsAnnotationType, new C3604(annotation, c9194, 1));
                        z = true;
                    }
                } else if (name2.equals("com.alibaba.fastjson.annotation.JSONCreator")) {
                    AbstractC3698.m6371(clsAnnotationType, new C3604(annotation, c9194, 0));
                    z = true;
                }
            }
            i++;
            interfaceC9197 = interfaceC91972;
        }
        if (interfaceC9197 != null) {
            String[] strArrParameterNames = interfaceC9197.parameterNames();
            if (strArrParameterNames.length != 0) {
                c9194.f23453 = strArrParameterNames;
            }
            z = true;
        }
        if (z) {
            try {
                declaredMethod = cls.getDeclaredMethod(name, method.getParameterTypes());
            } catch (NoSuchMethodException unused) {
            }
            if (declaredMethod != null) {
                c9194.f23452 = declaredMethod;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m6177(C3612 c3612, C9194 c9194, Class cls, Constructor constructor) {
        Constructor declaredConstructor;
        String name;
        if (cls.isEnum()) {
            return;
        }
        boolean z = false;
        for (Annotation annotation : AbstractC3698.m6380(constructor)) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            InterfaceC9197 interfaceC9197 = (InterfaceC9197) AbstractC3698.m6379(annotation, InterfaceC9197.class);
            if (interfaceC9197 != null) {
                String[] strArrParameterNames = interfaceC9197.parameterNames();
                if (strArrParameterNames.length != 0) {
                    c9194.f23453 = strArrParameterNames;
                }
                if (interfaceC9197 != annotation) {
                    z = true;
                    name = clsAnnotationType.getName();
                    if (name.equals("com.fasterxml.jackson.annotation.JsonCreator")) {
                        if (name.equals("com.alibaba.fastjson.annotation.JSONCreator") || name.equals("飘花落叶言楪子世兰苏哲.飘花落叶言子楪世哲苏兰")) {
                            AbstractC3698.m6371(clsAnnotationType, new C3604(annotation, c9194, 2));
                        }
                    } else if (AbstractC3766.f9633) {
                    }
                }
                z = true;
            } else {
                name = clsAnnotationType.getName();
                if (name.equals("com.fasterxml.jackson.annotation.JsonCreator")) {
                }
            }
        }
        if (z) {
            try {
                declaredConstructor = cls.getDeclaredConstructor(constructor.getParameterTypes());
            } catch (NoSuchMethodException unused) {
                declaredConstructor = null;
            }
            if (declaredConstructor != null) {
                c9194.f23454 = declaredConstructor;
            }
        }
    }
}
