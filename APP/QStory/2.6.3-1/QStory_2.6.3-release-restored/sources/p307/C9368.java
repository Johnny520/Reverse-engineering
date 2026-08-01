package p307;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3755;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3758;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.reader.C3533;
import com.alibaba.fastjson2.reader.C3607;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3698;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.alibaba.fastjson2.util.C3680;
import com.alibaba.fastjson2.util.C3691;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
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
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import p246.C8878;
import p294.C9192;
import p294.C9194;
import p306.InterfaceC9245;
import p309.AbstractC9396;
import p310.AbstractC9398;
import p310.C9399;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9368 implements InterfaceC9245 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final int[] f24123;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final int[] f24124;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f24125;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f24126;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9308 f24127;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f24131;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f24132;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean f24133;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f24134;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f24135;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f24130 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f24129 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ConcurrentHashMap f24128 = new ConcurrentHashMap();

    static {
        Class[] clsArr = {Boolean.TYPE, Boolean.class, Character.class, Character.TYPE, Byte.class, Byte.TYPE, Short.class, Short.TYPE, Integer.class, Integer.TYPE, Long.class, Long.TYPE, Float.class, Float.TYPE, Double.class, Double.TYPE, BigInteger.class, BigDecimal.class, String.class, Currency.class, Date.class, Calendar.class, UUID.class, Locale.class, LocalTime.class, LocalDate.class, LocalDateTime.class, Instant.class, ZoneId.class, ZonedDateTime.class, OffsetDateTime.class, OffsetTime.class, AtomicInteger.class, AtomicLong.class, String.class, StackTraceElement.class, Collections.EMPTY_LIST.getClass(), Collections.EMPTY_MAP.getClass(), Collections.EMPTY_SET.getClass()};
        int[] iArr = new int[39];
        for (int i = 0; i < 39; i++) {
            iArr[i] = System.identityHashCode(clsArr[i]);
        }
        Arrays.sort(iArr);
        f24124 = iArr;
        int[] iArrCopyOf = Arrays.copyOf(iArr, 42);
        iArrCopyOf[iArrCopyOf.length - 1] = System.identityHashCode(Class.class);
        iArrCopyOf[iArrCopyOf.length - 2] = System.identityHashCode(int[].class);
        iArrCopyOf[iArrCopyOf.length - 3] = System.identityHashCode(long[].class);
        Arrays.sort(iArrCopyOf);
        f24123 = iArrCopyOf;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9368() {
        C9308 c9308;
        ArrayList arrayList = new ArrayList();
        this.f24126 = arrayList;
        this.f24125 = AbstractC3766.f9629;
        this.f24132 = AbstractC3766.f9648;
        this.f24131 = AbstractC3766.f9647;
        this.f24134 = AbstractC3766.f9651;
        this.f24135 = AbstractC3766.f9630;
        this.f24133 = AbstractC3766.f9631;
        arrayList.add(new C9350(this));
        String str = AbstractC3766.f9634;
        int iHashCode = str.hashCode();
        if (iHashCode != -1110092857) {
            if (iHashCode == 96891) {
                str.equals("asm");
            } else if (iHashCode == 1085265597 && str.equals("reflect")) {
                c9308 = C9308.f23875;
            }
            c9308 = null;
            try {
                if (!AbstractC3687.f9274 && !AbstractC3687.f9273) {
                    c9308 = C9298.f23814;
                }
            } catch (Throwable unused) {
            }
            if (c9308 == null) {
                c9308 = C9308.f23875;
            }
        } else if (!str.equals("lambda")) {
            c9308 = null;
            if (!AbstractC3687.f9274) {
                c9308 = C9298.f23814;
            }
            if (c9308 == null) {
            }
        }
        this.f24127 = c9308;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m14663(Class cls) {
        if (Arrays.binarySearch(f24124, System.identityHashCode(cls)) < 0) {
            return (cls.getModifiers() & 16384) != 0 && cls.getSuperclass() == Enum.class;
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m14664(Class cls) {
        if (Arrays.binarySearch(f24123, System.identityHashCode(cls)) < 0) {
            return (cls.getModifiers() & 16384) != 0 && cls.getSuperclass() == Enum.class;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:215:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0a01 A[LOOP:1: B:68:0x00f1->B:585:0x0a01, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0a8f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x09e9 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC9352 m14665(Type type, Class cls, boolean z) {
        boolean z2;
        Class clsM6502;
        C9277 c9277;
        int i;
        Class cls2;
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        String str;
        Type type2;
        InterfaceC9352 interfaceC9352;
        InterfaceC9352 interfaceC93522;
        InterfaceC9352 interfaceC9352M14653;
        InterfaceC9352 c9353;
        InterfaceC9352 c9287;
        InterfaceC9352 c9293;
        InterfaceC9352 interfaceC9352M14705;
        InterfaceC9352 interfaceC93523;
        InterfaceC9352 interfaceC93524;
        Class cls3;
        InterfaceC9352 c3691;
        C9368 c9368;
        C9308 c9308;
        C9368 c93682 = this;
        Type type3 = type;
        boolean z3 = z;
        ConcurrentHashMap concurrentHashMap3 = c93682.f24130;
        ConcurrentHashMap concurrentHashMap4 = c93682.f24129;
        InterfaceC9352 interfaceC93525 = z3 ? (InterfaceC9352) concurrentHashMap4.get(type3) : (InterfaceC9352) concurrentHashMap3.get(type3);
        if (interfaceC93525 != null) {
            return interfaceC93525;
        }
        Class superclass = cls.getSuperclass();
        if (!cls.isEnum() && superclass != null && superclass.isEnum()) {
            return c93682.m14665(superclass, superclass, z3);
        }
        String name = cls.getName();
        if (z3) {
            if ((superclass != null && superclass != Object.class && "com.google.protobuf.GeneratedMessageV3".equals(superclass.getName())) || name.equals("cn.hutool.core.map.CaseInsensitiveLinkedMap") || name.equals("cn.hutool.json.JSONObject") || name.equals("cn.hutool.core.map.CaseInsensitiveMap") || name.equals("springfox.documentation.spring.web.json.Json") || name.equals("cn.hutool.json.JSONArray")) {
                z3 = false;
            }
        } else if (name.equals("org.springframework.core.ResolvableType")) {
            z3 = true;
        }
        InterfaceC9352 c9315 = z3 ? (InterfaceC9352) concurrentHashMap4.get(type3) : (InterfaceC9352) concurrentHashMap3.get(type3);
        if (c9315 != null) {
            return c9315;
        }
        if (AbstractC3700.m6497(cls)) {
            if (superclass == Object.class) {
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Class<?> cls4 = interfaces[i2];
                    if (!AbstractC3700.m6497(cls4)) {
                        superclass = cls4;
                        break;
                    }
                    i2++;
                }
            }
            if (cls == type3) {
                type3 = superclass;
            }
            if (z3) {
                c9315 = (InterfaceC9352) concurrentHashMap4.get(type3);
                z3 = false;
            } else {
                c9315 = (InterfaceC9352) concurrentHashMap3.get(type3);
            }
            if (c9315 != null) {
                return c9315;
            }
        } else {
            superclass = cls;
        }
        C9277 c92772 = C9277.f23731;
        if (z3 && Iterable.class.isAssignableFrom(superclass) && !Collection.class.isAssignableFrom(superclass)) {
            boolean z4 = z3;
            ConcurrentHashMap concurrentHashMap5 = concurrentHashMap3;
            ConcurrentHashMap concurrentHashMap6 = concurrentHashMap4;
            Class cls5 = superclass;
            String str2 = name;
            C9277 c92773 = c92772;
            if (str2.equals("android.net.Uri$HierarchicalUri")) {
                cls3 = cls5;
                c3691 = c92773;
                if (c3691 != null && !z4 && Map.class.isAssignableFrom(cls3) && AbstractC3698.m6360(cls3)) {
                    return C9291.m14582(cls3);
                }
                if (c3691 != null) {
                    return c3691;
                }
                C9308 c93082 = (C9308) AbstractC3766.f9628.get();
                if (c93082 != null) {
                    c9308 = c93082;
                    c9368 = this;
                } else {
                    c9368 = this;
                    c9308 = c9368.f24127;
                }
                InterfaceC9352 interfaceC9352Mo14613 = c9308.mo14613(cls3, z4 ? JSONWriter$Feature.FieldBased.mask : 0L, c9368);
                interfaceC93524 = z4 ? (InterfaceC9352) concurrentHashMap6.putIfAbsent(type3, interfaceC9352Mo14613) : (InterfaceC9352) concurrentHashMap5.putIfAbsent(type3, interfaceC9352Mo14613);
                if (interfaceC93524 == null) {
                    return interfaceC9352Mo14613;
                }
            } else if (str2.equals("com.google.common.collect.HashMultimap")) {
                cls3 = cls5;
                c3691 = new C3691(cls3);
                if (c3691 != null) {
                }
                if (c3691 != null) {
                }
            } else if (!str2.equals("android.net.Uri$StringUri")) {
                if (str2.equals("com.clickhouse.data.value.UnsignedLong")) {
                    c3691 = new C9277(true);
                } else if (str2.equals("com.alibaba.fastjson.JSONObject")) {
                    c3691 = C9291.m14582(cls5);
                } else {
                    if (!str2.equals("com.google.common.collect.LinkedListMultimap") && !str2.equals("com.google.common.collect.TreeMultimap") && !str2.equals("com.google.common.collect.ArrayListMultimap") && !str2.equals("com.google.common.collect.LinkedHashMultimap")) {
                        if (str2.equals("com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList")) {
                            c3691 = C9271.f23702;
                        } else {
                            if (!str2.equals("android.net.Uri$OpaqueUri")) {
                                c3691 = c9315;
                            }
                            cls3 = cls5;
                            c3691 = c92773;
                            if (c3691 != null) {
                            }
                            if (c3691 != null) {
                            }
                        }
                    }
                    cls3 = cls5;
                    c3691 = new C3691(cls3);
                    if (c3691 != null) {
                    }
                    if (c3691 != null) {
                    }
                }
                cls3 = cls5;
                if (c3691 != null) {
                }
                if (c3691 != null) {
                }
            }
        } else {
            int i3 = 0;
            while (true) {
                ArrayList arrayList = c93682.f24126;
                if (i3 >= arrayList.size()) {
                    break;
                }
                C9350 c9350 = (C9350) arrayList.get(i3);
                C8878 c8878 = c9350.f24051;
                C9368 c93683 = c9350.f24052;
                if (type3 == String.class) {
                    z2 = z3;
                    concurrentHashMap = concurrentHashMap3;
                    concurrentHashMap2 = concurrentHashMap4;
                    cls2 = superclass;
                    str = name;
                    c9315 = C9317.f23918;
                    c9277 = c92772;
                    i = i3;
                } else {
                    if (superclass == null) {
                        clsM6502 = type3 instanceof Class ? (Class) type3 : AbstractC3700.m6502(type3);
                        z2 = z3;
                    } else {
                        z2 = z3;
                        clsM6502 = superclass;
                    }
                    String name2 = clsM6502.getName();
                    InterfaceC9352 interfaceC9352M146532 = C9350.m14653(clsM6502, name2);
                    if (interfaceC9352M146532 != null) {
                        concurrentHashMap = concurrentHashMap3;
                        concurrentHashMap2 = concurrentHashMap4;
                        cls2 = superclass;
                        str = name;
                        c9277 = c92772;
                        i = i3;
                    } else {
                        c9277 = c92772;
                        Object obj = null;
                        i = i3;
                        if (name2.equals("java.awt.Color")) {
                            cls2 = superclass;
                            try {
                                str = name;
                                try {
                                    concurrentHashMap = concurrentHashMap3;
                                    try {
                                        concurrentHashMap2 = concurrentHashMap4;
                                        try {
                                            Class cls6 = clsM6502;
                                            try {
                                                interfaceC9352M146532 = new C9358(cls6, null, null, 0L, Arrays.asList(AbstractC9366.m14661(clsM6502.getMethod("getRed", null), "r"), AbstractC9366.m14661(clsM6502.getMethod("getGreen", null), "g"), AbstractC9366.m14661(clsM6502.getMethod("getBlue", null), "b"), AbstractC9366.m14661(clsM6502.getMethod("getAlpha", null), "alpha")));
                                            } catch (NoSuchMethodException unused) {
                                                clsM6502 = cls6;
                                                if (type3 instanceof ParameterizedType) {
                                                }
                                                if (type2 != LinkedList.class) {
                                                }
                                                c9315 = interfaceC9352M14653;
                                            }
                                        } catch (NoSuchMethodException unused2) {
                                        }
                                    } catch (NoSuchMethodException unused3) {
                                        concurrentHashMap2 = concurrentHashMap4;
                                    }
                                } catch (NoSuchMethodException unused4) {
                                    concurrentHashMap = concurrentHashMap3;
                                }
                            } catch (NoSuchMethodException unused5) {
                                concurrentHashMap = concurrentHashMap3;
                                concurrentHashMap2 = concurrentHashMap4;
                                str = name;
                            }
                        } else if (name2.equals("java.util.regex.Pattern")) {
                            interfaceC9352M14705 = C9351.f24053;
                            c9315 = interfaceC9352M14705;
                            concurrentHashMap = concurrentHashMap3;
                            concurrentHashMap2 = concurrentHashMap4;
                            cls2 = superclass;
                            str = name;
                        } else {
                            if (!name2.equals("com.google.common.collect.AbstractMapBasedMultimap$WrappedSet")) {
                                if (name2.equals("com.carrotsearch.hppc.LongHashSet") || name2.equals("gnu.trove.set.hash.TShortHashSet") || name2.equals("com.carrotsearch.hppc.CharHashSet")) {
                                    interfaceC9352M14705 = AbstractC9396.m14705(clsM6502);
                                    c9315 = interfaceC9352M14705;
                                    concurrentHashMap = concurrentHashMap3;
                                    concurrentHashMap2 = concurrentHashMap4;
                                    cls2 = superclass;
                                    str = name;
                                } else if (name2.equals("java.nio.DirectByteBuffer")) {
                                    interfaceC9352M14705 = new C9270(new C3533(16));
                                    c9315 = interfaceC9352M14705;
                                    concurrentHashMap = concurrentHashMap3;
                                    concurrentHashMap2 = concurrentHashMap4;
                                    cls2 = superclass;
                                    str = name;
                                } else {
                                    if (name2.equals("com.fasterxml.jackson.databind.node.ObjectNode")) {
                                        interfaceC9352M14705 = C9277.f23730;
                                    } else if (name2.equals("org.javamoney.moneta.internal.JDKCurrencyAdapter")) {
                                        c9315 = c9277;
                                        concurrentHashMap = concurrentHashMap3;
                                        concurrentHashMap2 = concurrentHashMap4;
                                        cls2 = superclass;
                                        str = name;
                                    } else if (!name2.equals("com.carrotsearch.hppc.CharArrayList") && !name2.equals("com.carrotsearch.hppc.IntArrayList") && !name2.equals("gnu.trove.list.array.TLongArrayList") && !name2.equals("com.carrotsearch.hppc.BitSet")) {
                                        if (!name2.equals("java.nio.HeapByteBuffer")) {
                                            if (!name2.equals("gnu.trove.list.array.TShortArrayList") && !name2.equals("gnu.trove.set.hash.TIntHashSet")) {
                                                if (!name2.equals("org.apache.commons.lang3.tuple.MutablePair")) {
                                                    if (!name2.equals("com.carrotsearch.hppc.ShortArrayList")) {
                                                        if (name2.equals("org.javamoney.moneta.Money")) {
                                                            if (AbstractC9398.f24264 == null) {
                                                                AbstractC9398.f24264 = AbstractC3700.m6489("javax.money.Monetary");
                                                            }
                                                            if (AbstractC9398.f24263 == null) {
                                                                AbstractC9398.f24263 = AbstractC3700.m6489("javax.money.MonetaryAmount");
                                                            }
                                                            if (AbstractC9398.f24260 == null) {
                                                                AbstractC9398.f24260 = AbstractC3700.m6489("javax.money.NumberValue");
                                                            }
                                                            if (AbstractC9398.f24259 == null) {
                                                                AbstractC9398.f24259 = AbstractC3700.m6489("javax.money.CurrencyUnit");
                                                            }
                                                            try {
                                                                try {
                                                                    Function functionM14698 = AbstractC9396.m14698(AbstractC9398.f24263.getMethod("getCurrency", null));
                                                                    try {
                                                                        Function functionM146982 = AbstractC9396.m14698(AbstractC9398.f24263.getMethod("getNumber", null));
                                                                        C9308 c93083 = C9308.f23875;
                                                                        Class cls7 = AbstractC9398.f24259;
                                                                        c93083.getClass();
                                                                        AbstractC9323 abstractC9323M14625 = C9308.m14625(null, "currency", 0, 0L, null, null, cls7, cls7, null, null, functionM14698, null);
                                                                        Class cls8 = AbstractC9398.f24260;
                                                                        interfaceC9352M146532 = new C9353(AbstractC9398.f24263, null, null, 0L, Arrays.asList(abstractC9323M14625, C9308.m14625(null, "number", 0, 0L, null, null, cls8, cls8, null, null, functionM146982, null)));
                                                                        concurrentHashMap = concurrentHashMap3;
                                                                        concurrentHashMap2 = concurrentHashMap4;
                                                                        cls2 = superclass;
                                                                        str = name;
                                                                    } catch (Throwable th) {
                                                                        C1123.m1403("method not found : javax.money.Monetary.getNumber", th);
                                                                        return null;
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    interfaceC93523 = null;
                                                                    C1123.m1403("method not found : javax.money.Monetary.getCurrency", th);
                                                                    return interfaceC93523;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                interfaceC93523 = null;
                                                            }
                                                        } else if (!name2.equals("org.apache.commons.lang3.tuple.Pair")) {
                                                            if (!name2.equals("com.carrotsearch.hppc.DoubleArrayList") && !name2.equals("com.carrotsearch.hppc.ByteArrayList") && !name2.equals("gnu.trove.set.hash.TLongHashSet")) {
                                                                if (!name2.equals("net.sf.json.JSONNull")) {
                                                                    if (name2.equals("org.javamoney.moneta.spi.DefaultNumberValue")) {
                                                                        if (AbstractC9398.f24260 == null) {
                                                                            AbstractC9398.f24260 = AbstractC3700.m6489("javax.money.NumberValue");
                                                                        }
                                                                        if (AbstractC9398.f24269 == null) {
                                                                            try {
                                                                                AbstractC9398.f24269 = new C9399(AbstractC9396.m14700(AbstractC9398.f24260.getMethod("numberValue", Class.class)), 0);
                                                                            } catch (Throwable th4) {
                                                                                C1123.m1403("method not found : javax.money.NumberValue.numberValue", th4);
                                                                                return null;
                                                                            }
                                                                        }
                                                                        C9399 c9399 = AbstractC9398.f24269;
                                                                        C9308 c93084 = AbstractC9366.f24121;
                                                                        c9315 = new C9315(obj, 0, c9399);
                                                                        concurrentHashMap = concurrentHashMap3;
                                                                        concurrentHashMap2 = concurrentHashMap4;
                                                                        cls2 = superclass;
                                                                        str = name;
                                                                        if (c9315 == null) {
                                                                        }
                                                                    } else if (!name2.equals("java.net.Inet6Address") && !name2.equals("com.fasterxml.jackson.databind.node.ArrayNode")) {
                                                                        if (!name2.equals("gnu.trove.list.array.TCharArrayList")) {
                                                                            if (!name2.equals("org.apache.commons.lang3.tuple.ImmutablePair")) {
                                                                                if (!name2.equals("gnu.trove.list.array.TFloatArrayList") && !name2.equals("gnu.trove.stack.array.TByteArrayStack")) {
                                                                                    if (!name2.equals("java.net.Inet4Address")) {
                                                                                        if (!name2.equals("com.carrotsearch.hppc.FloatArrayList") && !name2.equals("com.carrotsearch.hppc.IntHashSet")) {
                                                                                            if (!name2.equals("com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList")) {
                                                                                                if (!name2.equals("java.text.SimpleDateFormat")) {
                                                                                                    if (!name2.equals("gnu.trove.list.array.TIntArrayList")) {
                                                                                                        if (!name2.equals("java.net.InetSocketAddress")) {
                                                                                                            if (!name2.equals("gnu.trove.list.array.TByteArrayList") && !name2.equals("org.bson.types.Decimal128") && !name2.equals("gnu.trove.set.hash.TByteHashSet") && !name2.equals("com.carrotsearch.hppc.LongArrayList") && !name2.equals("gnu.trove.list.array.TDoubleArrayList")) {
                                                                                                                concurrentHashMap = concurrentHashMap3;
                                                                                                                concurrentHashMap2 = concurrentHashMap4;
                                                                                                                cls2 = superclass;
                                                                                                                str = name;
                                                                                                                if (type3 instanceof ParameterizedType) {
                                                                                                                    type2 = type3;
                                                                                                                } else {
                                                                                                                    ParameterizedType parameterizedType = (ParameterizedType) type3;
                                                                                                                    Type rawType = parameterizedType.getRawType();
                                                                                                                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                                                                                                                    if (rawType != List.class && rawType != ArrayList.class) {
                                                                                                                        type2 = type3;
                                                                                                                    } else if (actualTypeArguments.length == 1 && actualTypeArguments[0] == String.class) {
                                                                                                                        interfaceC9352M14653 = C9317.f23924;
                                                                                                                        c9315 = interfaceC9352M14653;
                                                                                                                    } else {
                                                                                                                        type2 = rawType;
                                                                                                                    }
                                                                                                                    if (Map.class.isAssignableFrom(clsM6502)) {
                                                                                                                        interfaceC9352M14653 = C9291.m14581(type2, null, clsM6502);
                                                                                                                    } else if (clsM6502 == Optional.class && actualTypeArguments.length == 1) {
                                                                                                                        interfaceC9352M14653 = new C9279(actualTypeArguments[0]);
                                                                                                                    }
                                                                                                                    c9315 = interfaceC9352M14653;
                                                                                                                }
                                                                                                                if (type2 != LinkedList.class) {
                                                                                                                    interfaceC9352M14653 = C9271.f23702;
                                                                                                                } else {
                                                                                                                    if (type2 == ArrayList.class || type2 == List.class || List.class.isAssignableFrom(clsM6502)) {
                                                                                                                        interfaceC9352 = C9271.f23702;
                                                                                                                    } else if (Collection.class.isAssignableFrom(clsM6502)) {
                                                                                                                        interfaceC9352M14653 = C9300.f23846;
                                                                                                                    } else if (AbstractC3698.m6360(clsM6502)) {
                                                                                                                        c9315 = null;
                                                                                                                    } else if (Map.class.isAssignableFrom(clsM6502)) {
                                                                                                                        interfaceC9352M14653 = C9291.m14582(clsM6502);
                                                                                                                    } else if (Map.Entry.class.isAssignableFrom(clsM6502)) {
                                                                                                                        interfaceC9352M14653 = C9317.f23922;
                                                                                                                    } else if (Path.class.isAssignableFrom(clsM6502)) {
                                                                                                                        c9315 = c9277;
                                                                                                                    } else if (type2 == Integer.class) {
                                                                                                                        interfaceC9352M14653 = C9317.f23929;
                                                                                                                    } else if (type2 == AtomicInteger.class) {
                                                                                                                        interfaceC9352M14653 = C9313.f23901;
                                                                                                                    } else if (type2 == Byte.class) {
                                                                                                                        interfaceC9352M14653 = C9317.f23920;
                                                                                                                    } else if (type2 == Short.class) {
                                                                                                                        interfaceC9352M14653 = C9317.f23928;
                                                                                                                    } else if (type2 == Long.class) {
                                                                                                                        interfaceC9352M14653 = C9317.f23921;
                                                                                                                    } else if (type2 == AtomicLong.class) {
                                                                                                                        interfaceC9352M14653 = C9312.f23899;
                                                                                                                    } else if (type2 == AtomicReference.class) {
                                                                                                                        interfaceC9352M14653 = C9317.f23911;
                                                                                                                    } else if (type2 == Float.class) {
                                                                                                                        interfaceC9352M14653 = C9304.f23856;
                                                                                                                    } else if (type2 == Double.class) {
                                                                                                                        interfaceC9352M14653 = C9304.f23857;
                                                                                                                    } else if (type2 == BigInteger.class) {
                                                                                                                        interfaceC9352M14653 = C9307.f23873;
                                                                                                                    } else if (type2 == BigDecimal.class) {
                                                                                                                        interfaceC9352M14653 = C9315.f23905;
                                                                                                                    } else if (type2 == BitSet.class) {
                                                                                                                        interfaceC9352M14653 = C9317.f23927;
                                                                                                                    } else if (type2 == OptionalInt.class) {
                                                                                                                        interfaceC9352M14653 = C9317.f23916;
                                                                                                                    } else if (type2 == OptionalLong.class) {
                                                                                                                        interfaceC9352M14653 = C9317.f23915;
                                                                                                                    } else if (type2 == OptionalDouble.class) {
                                                                                                                        interfaceC9352M14653 = C9317.f23923;
                                                                                                                    } else if (type2 == Optional.class) {
                                                                                                                        interfaceC9352M14653 = C9279.f23734;
                                                                                                                    } else if (type2 == Boolean.class) {
                                                                                                                        interfaceC9352M14653 = C9317.f23926;
                                                                                                                    } else if (type2 == AtomicBoolean.class) {
                                                                                                                        interfaceC9352M14653 = C9317.f23914;
                                                                                                                    } else if (type2 == AtomicIntegerArray.class) {
                                                                                                                        interfaceC9352M14653 = C9317.f23913;
                                                                                                                    } else if (type2 == AtomicLongArray.class) {
                                                                                                                        interfaceC9352M14653 = C9317.f23912;
                                                                                                                    } else if (type2 == Character.class) {
                                                                                                                        interfaceC9352M14653 = C9317.f23930;
                                                                                                                    } else {
                                                                                                                        if (type2 instanceof Class) {
                                                                                                                            Class cls9 = (Class) type2;
                                                                                                                            if (TimeUnit.class.isAssignableFrom(cls9)) {
                                                                                                                                c9287 = new C9282(TimeUnit.class, null, null);
                                                                                                                            } else {
                                                                                                                                if (Enum.class.isAssignableFrom(cls9)) {
                                                                                                                                    if (!cls9.isEnum()) {
                                                                                                                                        Class superclass2 = cls9.getSuperclass();
                                                                                                                                        if (!superclass2.isEnum()) {
                                                                                                                                            superclass2 = cls9;
                                                                                                                                        }
                                                                                                                                        Member memberM6377 = AbstractC3698.m6377(superclass2, c93683);
                                                                                                                                        if (memberM6377 == null) {
                                                                                                                                            Member memberM63772 = AbstractC3698.m6377((Class) c93683.f24128.get(superclass2), c93683);
                                                                                                                                            if (memberM63772 instanceof Field) {
                                                                                                                                                try {
                                                                                                                                                    memberM6377 = superclass2.getField(((Field) memberM63772).getName());
                                                                                                                                                } catch (NoSuchFieldException | NoSuchMethodException unused6) {
                                                                                                                                                }
                                                                                                                                            } else if (memberM63772 instanceof Method) {
                                                                                                                                                memberM6377 = superclass2.getMethod(((Method) memberM63772).getName(), null);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        C9194 c9194 = new C9194(c93683);
                                                                                                                                        for (Class<?> cls10 : superclass2.getInterfaces()) {
                                                                                                                                            c8878.m14098(cls10, c9194);
                                                                                                                                        }
                                                                                                                                        c8878.m14098(superclass2, c9194);
                                                                                                                                        C9282 c9282 = c9194.f23448 ? null : new C9282(superclass2, memberM6377, AbstractC3698.m6376(superclass2));
                                                                                                                                        if (c9282 != null) {
                                                                                                                                            c9315 = c9282;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (!AbstractC3755.class.isAssignableFrom(cls9)) {
                                                                                                                                    if (cls9 == boolean[].class) {
                                                                                                                                        interfaceC9352M14653 = C9314.f23904;
                                                                                                                                    } else if (cls9 == char[].class) {
                                                                                                                                        interfaceC9352M14653 = C9303.f23854;
                                                                                                                                    } else if (cls9 == StringBuffer.class || cls9 == StringBuilder.class) {
                                                                                                                                        c9315 = c9277;
                                                                                                                                        if (c9315 == null) {
                                                                                                                                            interfaceC93524 = z2 ? (InterfaceC9352) concurrentHashMap2.putIfAbsent(type3, c9315) : (InterfaceC9352) concurrentHashMap.putIfAbsent(type3, c9315);
                                                                                                                                            if (interfaceC93524 == null) {
                                                                                                                                                return c9315;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i3 = i + 1;
                                                                                                                                            c92772 = c9277;
                                                                                                                                            concurrentHashMap4 = concurrentHashMap2;
                                                                                                                                            concurrentHashMap3 = concurrentHashMap;
                                                                                                                                            superclass = cls2;
                                                                                                                                            name = str;
                                                                                                                                            c93682 = this;
                                                                                                                                            z3 = z2;
                                                                                                                                        }
                                                                                                                                    } else if (cls9 == byte[].class) {
                                                                                                                                        interfaceC9352M14653 = C9270.f23699;
                                                                                                                                    } else if (cls9 == short[].class) {
                                                                                                                                        interfaceC9352M14653 = C9284.f23756;
                                                                                                                                    } else if (cls9 == int[].class) {
                                                                                                                                        interfaceC9352M14653 = C9273.f23718;
                                                                                                                                    } else if (cls9 == long[].class) {
                                                                                                                                        interfaceC9352M14653 = C9275.f23725;
                                                                                                                                    } else if (cls9 == float[].class) {
                                                                                                                                        interfaceC9352M14653 = C9286.f23763;
                                                                                                                                    } else if (cls9 == double[].class) {
                                                                                                                                        interfaceC9352M14653 = C9283.f23751;
                                                                                                                                    } else if (cls9 == Byte[].class) {
                                                                                                                                        interfaceC9352M14653 = C9274.f23722;
                                                                                                                                    } else if (cls9 == Integer[].class) {
                                                                                                                                        interfaceC9352M14653 = C9285.f23760;
                                                                                                                                    } else if (cls9 == Long[].class) {
                                                                                                                                        interfaceC9352M14653 = C9272.f23715;
                                                                                                                                    } else if (String[].class == cls9) {
                                                                                                                                        interfaceC9352M14653 = C9276.f23727;
                                                                                                                                    } else if (BigDecimal[].class == cls9) {
                                                                                                                                        interfaceC9352M14653 = C9316.f23910;
                                                                                                                                    } else if (Object[].class.isAssignableFrom(cls9)) {
                                                                                                                                        if (cls9 == Object[].class) {
                                                                                                                                            interfaceC9352M14653 = C9349.f24044;
                                                                                                                                        } else {
                                                                                                                                            Class<?> componentType = cls9.getComponentType();
                                                                                                                                            c9287 = Modifier.isFinal(componentType.getModifiers()) ? new C9348(componentType, null) : new C9349(componentType);
                                                                                                                                        }
                                                                                                                                    } else if (cls9 == UUID.class) {
                                                                                                                                        interfaceC9352M14653 = C9317.f23917;
                                                                                                                                    } else if (cls9 == Locale.class) {
                                                                                                                                        interfaceC9352M14653 = C9317.f23925;
                                                                                                                                    } else if (cls9 == Currency.class) {
                                                                                                                                        interfaceC9352M14653 = C9301.f23850;
                                                                                                                                    } else if (TimeZone.class.isAssignableFrom(cls9)) {
                                                                                                                                        interfaceC9352M14653 = C9317.f23919;
                                                                                                                                    } else {
                                                                                                                                        int i4 = 21;
                                                                                                                                        if (C3758.class.isAssignableFrom(cls9)) {
                                                                                                                                            interfaceC9352M14653 = new C9317(i4);
                                                                                                                                        } else if (cls9 != URI.class && cls9 != URL.class && cls9 != File.class && !ZoneId.class.isAssignableFrom(cls9) && !Charset.class.isAssignableFrom(cls9)) {
                                                                                                                                            interfaceC9352M14653 = C9350.m14653(cls9, cls9.getName());
                                                                                                                                            if (interfaceC9352M14653 == null) {
                                                                                                                                                C9194 c91942 = new C9194(c93683);
                                                                                                                                                Class clsMo6186 = c93683.mo6186(cls9);
                                                                                                                                                if (clsMo6186 != null) {
                                                                                                                                                    c8878.m14098(clsMo6186, c91942);
                                                                                                                                                }
                                                                                                                                                if (Date.class.isAssignableFrom(cls9)) {
                                                                                                                                                    if (c91942.f23431 == null && c91942.f23430 == null) {
                                                                                                                                                        interfaceC9352M14653 = C9305.f23863;
                                                                                                                                                    } else {
                                                                                                                                                        c9287 = new C9305(c91942.f23431, c91942.f23430);
                                                                                                                                                    }
                                                                                                                                                } else if (Calendar.class.isAssignableFrom(cls9)) {
                                                                                                                                                    if (c91942.f23431 == null && c91942.f23430 == null) {
                                                                                                                                                        interfaceC9352M14653 = C9302.f23851;
                                                                                                                                                    } else {
                                                                                                                                                        c9287 = new C9302(c91942.f23431, c91942.f23430);
                                                                                                                                                    }
                                                                                                                                                } else if (ZonedDateTime.class != cls9) {
                                                                                                                                                    interfaceC93522 = null;
                                                                                                                                                    if (OffsetDateTime.class == cls9) {
                                                                                                                                                        String str3 = c91942.f23431;
                                                                                                                                                        Locale locale = c91942.f23430;
                                                                                                                                                        if (str3 == null) {
                                                                                                                                                            interfaceC9352M14653 = C9290.f23769;
                                                                                                                                                        } else {
                                                                                                                                                            c9293 = new C9290(str3, locale);
                                                                                                                                                            interfaceC9352M14653 = c9293;
                                                                                                                                                        }
                                                                                                                                                    } else if (LocalDateTime.class == cls9) {
                                                                                                                                                        if (c91942.f23431 == null && c91942.f23430 == null) {
                                                                                                                                                            interfaceC9352M14653 = C9289.f23768;
                                                                                                                                                        } else {
                                                                                                                                                            c9287 = new C9289(c91942.f23431, c91942.f23430);
                                                                                                                                                        }
                                                                                                                                                    } else if (LocalDate.class == cls9) {
                                                                                                                                                        String str4 = c91942.f23431;
                                                                                                                                                        Locale locale2 = c91942.f23430;
                                                                                                                                                        if (str4 == null) {
                                                                                                                                                            interfaceC9352M14653 = C9293.f23792;
                                                                                                                                                        } else {
                                                                                                                                                            c9293 = new C9293(str4, locale2);
                                                                                                                                                            interfaceC9352M14653 = c9293;
                                                                                                                                                        }
                                                                                                                                                    } else if (LocalTime.class == cls9) {
                                                                                                                                                        if (c91942.f23431 == null && c91942.f23430 == null) {
                                                                                                                                                            interfaceC9352M14653 = C9288.f23767;
                                                                                                                                                        } else {
                                                                                                                                                            c9287 = new C9288(c91942.f23431, c91942.f23430);
                                                                                                                                                        }
                                                                                                                                                    } else if (OffsetTime.class == cls9) {
                                                                                                                                                        if (c91942.f23431 == null && c91942.f23430 == null) {
                                                                                                                                                            interfaceC9352M14653 = C9278.f23733;
                                                                                                                                                        } else {
                                                                                                                                                            c9287 = new C9278(c91942.f23431, c91942.f23430);
                                                                                                                                                        }
                                                                                                                                                    } else if (Instant.class != cls9) {
                                                                                                                                                        if (Duration.class != cls9 && Period.class != cls9) {
                                                                                                                                                            if (StackTraceElement.class == cls9) {
                                                                                                                                                                if (C9350.f24050 == null) {
                                                                                                                                                                    C9308 c93085 = (C9308) AbstractC3766.f9628.get();
                                                                                                                                                                    if (c93085 == null) {
                                                                                                                                                                        c93085 = c93683.f24127;
                                                                                                                                                                    }
                                                                                                                                                                    Field fieldM6373 = AbstractC3698.m6373(StackTraceElement.class, "fileName");
                                                                                                                                                                    Method methodM6358 = AbstractC3698.m6358(StackTraceElement.class, "getFileName");
                                                                                                                                                                    C3533 c3533 = new C3533(23);
                                                                                                                                                                    c93085.getClass();
                                                                                                                                                                    C9350.f24050 = new C9353(StackTraceElement.class, null, null, 0L, Arrays.asList(C9308.m14625(null, "fileName", 0, 0L, null, null, String.class, String.class, fieldM6373, methodM6358, c3533, null), new C9261("lineNumber", 0, 0L, (String) null, (String) null, AbstractC3698.m6373(StackTraceElement.class, "lineNumber"), AbstractC3698.m6358(StackTraceElement.class, "getLineNumber"), new C3607(1)), C9308.m14625(null, "className", 0, 0L, null, null, String.class, String.class, AbstractC3698.m6373(StackTraceElement.class, "declaringClass"), AbstractC3698.m6358(StackTraceElement.class, "getClassName"), new C3533(24), null), C9308.m14625(null, "methodName", 0, 0L, null, null, String.class, String.class, AbstractC3698.m6373(StackTraceElement.class, "methodName"), AbstractC3698.m6358(StackTraceElement.class, "getMethodName"), new C3533(25), null)));
                                                                                                                                                                }
                                                                                                                                                                interfaceC9352 = C9350.f24050;
                                                                                                                                                            } else if (Class.class == cls9) {
                                                                                                                                                                interfaceC9352 = C9317.f23931;
                                                                                                                                                            } else {
                                                                                                                                                                if (Method.class == cls9) {
                                                                                                                                                                    c9353 = new C9353(Method.class, null, null, 0L, Arrays.asList(AbstractC9366.m14662("declaringClass", Class.class, new C3533(26)), AbstractC9366.m14662("name", String.class, new C3533(27)), AbstractC9366.m14662("parameterTypes", Class[].class, new C3533(17))));
                                                                                                                                                                } else if (Field.class == cls9) {
                                                                                                                                                                    c9353 = new C9353(Method.class, null, null, 0L, Arrays.asList(AbstractC9366.m14662("declaringClass", Class.class, new C3533(18)), AbstractC9366.m14662("name", String.class, new C3533(19))));
                                                                                                                                                                } else if (ParameterizedType.class.isAssignableFrom(cls9)) {
                                                                                                                                                                    AbstractC9323[] abstractC9323Arr = {AbstractC9366.m14662("actualTypeArguments", Type[].class, new C3533(20)), AbstractC9366.m14662("ownerType", Type.class, new C3533(i4)), AbstractC9366.m14662("rawType", Type.class, new C3533(22))};
                                                                                                                                                                    AbstractC9366.f24121.getClass();
                                                                                                                                                                    String name3 = ParameterizedType.class.getName();
                                                                                                                                                                    c9353 = ("com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList".equals(name3) || "com.google.common.collect.AbstractMapBasedMultimap$WrappedSet".equals(name3)) ? new C9353(ParameterizedType.class, null, null, 0L, Arrays.asList(abstractC9323Arr)) : new C9342(ParameterizedType.class, null, null, 0L, Arrays.asList(abstractC9323Arr));
                                                                                                                                                                }
                                                                                                                                                                c9315 = c9353;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (c9315 == null) {
                                                                                                                                                        }
                                                                                                                                                    } else if (c91942.f23431 == null && c91942.f23430 == null) {
                                                                                                                                                        interfaceC9352M14653 = C9287.f23766;
                                                                                                                                                    } else {
                                                                                                                                                        c9287 = new C9287(c91942.f23431, c91942.f23430);
                                                                                                                                                    }
                                                                                                                                                } else if (c91942.f23431 == null && c91942.f23430 == null) {
                                                                                                                                                    interfaceC9352M14653 = C9281.f23738;
                                                                                                                                                } else {
                                                                                                                                                    c9287 = new C9281(c91942.f23431, c91942.f23430, null);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                c9315 = c9277;
                                                                                                                            }
                                                                                                                            c9315 = c9287;
                                                                                                                        } else {
                                                                                                                            interfaceC93522 = null;
                                                                                                                        }
                                                                                                                        c9315 = interfaceC93522;
                                                                                                                        if (c9315 == null) {
                                                                                                                        }
                                                                                                                    }
                                                                                                                    c9315 = interfaceC9352;
                                                                                                                    if (c9315 == null) {
                                                                                                                    }
                                                                                                                }
                                                                                                                c9315 = interfaceC9352M14653;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                interfaceC9352M14705 = C9351.f24053;
                                                            }
                                                        }
                                                    }
                                                    interfaceC9352M14705 = AbstractC9396.m14705(clsM6502);
                                                }
                                                interfaceC9352M14705 = new C3680(clsM6502);
                                            }
                                        }
                                    }
                                    c9315 = interfaceC9352M14705;
                                    concurrentHashMap = concurrentHashMap3;
                                    concurrentHashMap2 = concurrentHashMap4;
                                    cls2 = superclass;
                                    str = name;
                                }
                            }
                            concurrentHashMap = concurrentHashMap3;
                            concurrentHashMap2 = concurrentHashMap4;
                            cls2 = superclass;
                            str = name;
                            c9315 = null;
                        }
                    }
                    c9315 = interfaceC9352M146532;
                }
                if (c9315 == null) {
                }
            }
        }
        return interfaceC93524;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14666(C9194 c9194, C9192 c9192, Class cls, Method method) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f24126;
            if (i >= arrayList.size()) {
                return;
            }
            ((C9350) arrayList.get(i)).f24051.m14094(c9194, c9192, cls, method);
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14667(Class cls, C9194 c9194) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f24126;
            if (i >= arrayList.size()) {
                return;
            }
            ((C9350) arrayList.get(i)).f24051.m14098(cls, c9194);
            i++;
        }
    }

    @Override // p306.InterfaceC9245
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6186(Class cls) {
        return (Class) this.f24128.get(cls);
    }
}
