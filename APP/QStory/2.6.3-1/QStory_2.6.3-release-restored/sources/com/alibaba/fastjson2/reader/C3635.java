package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import androidx.core.view.C3075;
import bsh.classpath.C3437;
import com.alibaba.fastjson2.AbstractC3763;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3698;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.alibaba.fastjson2.util.C3683;
import com.alibaba.fastjson2.util.C3690;
import com.alibaba.fastjson2.util.InterfaceC3679;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Function;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import p294.C9192;
import p306.InterfaceC9245;
import p309.C9394;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3635 implements InterfaceC9245 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final Consumer f9006;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String[] f9007;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static C3634 f9008;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final ClassLoader f9009 = InterfaceC3749.class.getClassLoader();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final boolean f9010;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ObjectReaderProvider$LRUAutoTypeCache f9011;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final long[] f9019;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C3609 f9021;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f9016 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f9015 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ConcurrentHashMap f9014 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ConcurrentHashMap f9013 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ConcurrentHashMap f9012 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f9022 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final CopyOnWriteArrayList f9025 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f9026 = AbstractC3766.f9629;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean f9023 = AbstractC3766.f9648;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f9024 = AbstractC3766.f9647;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean f9018 = AbstractC3766.f9651;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean f9017 = AbstractC3766.f9652;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Consumer f9020 = f9006;

    static {
        Class clsM6489;
        Class clsM64892;
        String property = System.getProperty("fastjson2.parser.deny");
        if (property == null) {
            property = AbstractC3763.f9624.getProperty("fastjson2.parser.deny");
        }
        if (property != null && property.length() > 0) {
            property.split(",");
        }
        String property2 = System.getProperty("fastjson2.autoTypeAccept");
        if (property2 == null) {
            property2 = AbstractC3763.f9624.getProperty("fastjson2.autoTypeAccept");
        }
        if (property2 == null || property2.length() <= 0) {
            f9007 = new String[0];
        } else {
            f9007 = property2.split(",");
        }
        String property3 = System.getProperty("fastjson2.autoTypeBeforeHandler");
        if (property3 == null || property3.isEmpty()) {
            property3 = AbstractC3763.f9624.getProperty("fastjson2.autoTypeBeforeHandler");
        }
        if (property3 != null) {
            property3 = property3.trim();
        }
        if (property3 != null && !property3.isEmpty() && (clsM64892 = AbstractC3700.m6489(property3)) != null) {
            try {
                if (clsM64892.newInstance() != null) {
                    throw new ClassCastException();
                }
            } catch (Exception unused) {
            }
        }
        String property4 = System.getProperty("fastjson2.autoTypeHandler");
        if (property4 == null || property4.isEmpty()) {
            property4 = AbstractC3763.f9624.getProperty("fastjson2.autoTypeHandler");
        }
        if (property4 != null) {
            property4 = property4.trim();
        }
        if (property4 != null && !property4.isEmpty() && (clsM6489 = AbstractC3700.m6489(property4)) != null) {
            try {
                f9006 = (Consumer) clsM6489.newInstance();
            } catch (Exception unused2) {
            }
        }
        String property5 = System.getProperty("fastjson.parser.safeMode");
        if (property5 == null || property5.isEmpty()) {
            property5 = AbstractC3763.f9624.getProperty("fastjson.parser.safeMode");
        }
        if (property5 == null || property5.isEmpty()) {
            property5 = System.getProperty("fastjson2.parser.safeMode");
        }
        if (property5 == null || property5.isEmpty()) {
            property5 = AbstractC3763.f9624.getProperty("fastjson2.parser.safeMode");
        }
        if (property5 != null) {
            property5 = property5.trim();
        }
        f9010 = "true".equals(property5);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.alibaba.fastjson2.reader.ObjectReaderProvider$LRUAutoTypeCache] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3635() {
        long[] jArr;
        C3609 c3609;
        Class<Boolean> cls;
        int i;
        Class cls2;
        Iterator it;
        Class<BigDecimal> cls3;
        Class[] clsArr;
        Class<BigInteger> cls4;
        Class<BigDecimal> cls5;
        Class<Byte> cls6;
        Class<BigInteger> cls7;
        Class cls8;
        Class<Byte> cls9;
        Class<Short> cls10;
        Class<Boolean> cls11;
        Class cls12;
        Class<Short> cls13;
        Class<Integer> cls14;
        Class<Character> cls15;
        Class cls16;
        Class<Integer> cls17;
        Class<Long> cls18;
        Class cls19;
        Class cls20;
        Class<Long> cls21;
        Class<Float> cls22;
        Long l;
        Class cls23;
        Class<Float> cls24;
        Class<Double> cls25;
        Class cls26;
        Class cls27;
        Class<Double> cls28;
        Integer num;
        final int i2 = 1024;
        this.f9011 = new LinkedHashMap<String, Date>(i2) { // from class: com.alibaba.fastjson2.reader.ObjectReaderProvider$LRUAutoTypeCache
            private final int maxSize;

            {
                super(16, 0.75f, false);
                this.maxSize = i2;
            }

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, Date> entry) {
                return size() > this.maxSize;
            }
        };
        byte b = 0;
        int i3 = 1;
        String[] strArr = f9007;
        if (strArr == null) {
            jArr = new long[1];
        } else {
            long[] jArr2 = new long[strArr.length + 1];
            for (int i4 = 0; i4 < strArr.length; i4++) {
                jArr2[i4] = AbstractC3693.m6334(strArr[i4]);
            }
            jArr = jArr2;
        }
        jArr[jArr.length - 1] = -6293031534589903644L;
        Arrays.sort(jArr);
        this.f9019 = jArr;
        this.f9013.put(Long.valueOf(C3514.f8494), C3514.f8495);
        this.f9013.put(-4834614249632438472L, C3537.f8558);
        this.f9013.put(Long.valueOf(AbstractC3693.m6334(AbstractC3700.m6503(HashMap.class))), C3547.f8599);
        String str = AbstractC3766.f9634;
        int iHashCode = str.hashCode();
        Object obj = null;
        if (iHashCode != -1110092857) {
            if (iHashCode == 96891) {
                str.equals("asm");
            } else if (iHashCode == 1085265597 && str.equals("reflect")) {
                c3609 = C3609.f8821;
            }
            c3609 = (!AbstractC3687.f9274 || AbstractC3687.f9273) ? null : C3564.f8653;
            if (c3609 == null) {
                c3609 = C3609.f8821;
            }
        } else if (!str.equals("lambda")) {
            if (AbstractC3687.f9274) {
                if (c3609 == null) {
                }
            }
        }
        this.f9021 = c3609;
        this.f9025.add(new C3612(this));
        Float fValueOf = Float.valueOf(0.0f);
        Iterator it2 = this.f9025.iterator();
        while (it2.hasNext()) {
            ((C3612) it2.next()).getClass();
            Long l2 = 0L;
            Double dValueOf = Double.valueOf(0.0d);
            C3437 c3437 = new C3437(14);
            Class<Character> cls29 = Character.class;
            Class cls30 = Character.TYPE;
            m6187(cls29, cls30, c3437);
            Class[] clsArr2 = {Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Number.class, Float.class, Double.class, BigInteger.class, BigDecimal.class, AtomicInteger.class, AtomicLong.class};
            C9394 c9394 = new C9394(obj, i3);
            Integer numValueOf = Integer.valueOf(b);
            Short shValueOf = Short.valueOf(b);
            Byte bValueOf = Byte.valueOf(b);
            int i5 = b;
            while (true) {
                cls = Boolean.class;
                i = 12;
                if (i5 >= 12) {
                    break;
                }
                m6187(clsArr2[i5], cls, c9394);
                i5++;
            }
            C9394 c93942 = new C9394(Boolean.FALSE, i3);
            int i6 = 0;
            while (true) {
                cls2 = Boolean.TYPE;
                if (i6 >= i) {
                    break;
                }
                m6187(clsArr2[i6], cls2, c93942);
                i6++;
                i = 12;
            }
            C3683 c3683 = new C3683(9);
            int i7 = 0;
            while (true) {
                it = it2;
                if (i7 >= 12) {
                    break;
                }
                m6187(clsArr2[i7], String.class, c3683);
                i7++;
                it2 = it;
            }
            C3683 c36832 = new C3683(6);
            int i8 = 0;
            while (true) {
                cls3 = BigDecimal.class;
                clsArr = clsArr2;
                if (i8 >= 12) {
                    break;
                }
                m6187(clsArr[i8], cls3, c36832);
                i8++;
                clsArr2 = clsArr;
            }
            C3683 c36833 = new C3683(7);
            int i9 = 0;
            while (true) {
                cls4 = BigInteger.class;
                cls5 = cls3;
                if (i9 >= 12) {
                    break;
                }
                m6187(clsArr[i9], cls4, c36833);
                i9++;
                cls3 = cls5;
            }
            C9394 c93943 = new C9394(null, 2);
            int i10 = 0;
            while (true) {
                cls6 = Byte.class;
                cls7 = cls4;
                if (i10 >= 12) {
                    break;
                }
                m6187(clsArr[i10], cls6, c93943);
                i10++;
                cls4 = cls7;
            }
            C9394 c93944 = new C9394(bValueOf, 2);
            int i11 = 0;
            while (true) {
                cls8 = Byte.TYPE;
                cls9 = cls6;
                if (i11 >= 12) {
                    break;
                }
                m6187(clsArr[i11], cls8, c93944);
                i11++;
                cls6 = cls9;
            }
            C9394 c93945 = new C9394(null, 7);
            int i12 = 0;
            while (true) {
                cls10 = Short.class;
                cls11 = cls;
                if (i12 >= 12) {
                    break;
                }
                m6187(clsArr[i12], cls10, c93945);
                i12++;
                cls = cls11;
            }
            C9394 c93946 = new C9394(shValueOf, 7);
            int i13 = 0;
            while (true) {
                cls12 = Short.TYPE;
                cls13 = cls10;
                if (i13 >= 12) {
                    break;
                }
                m6187(clsArr[i13], cls12, c93946);
                i13++;
                cls10 = cls13;
            }
            C9394 c93947 = new C9394(null, 5);
            int i14 = 0;
            while (true) {
                cls14 = Integer.class;
                cls15 = cls29;
                if (i14 >= 12) {
                    break;
                }
                m6187(clsArr[i14], cls14, c93947);
                i14++;
                cls29 = cls15;
            }
            C9394 c93948 = new C9394(numValueOf, 5);
            int i15 = 0;
            while (true) {
                cls16 = Integer.TYPE;
                cls17 = cls14;
                if (i15 >= 12) {
                    break;
                }
                m6187(clsArr[i15], cls16, c93948);
                i15++;
                cls14 = cls17;
            }
            C9394 c93949 = new C9394(null, 6);
            int i16 = 0;
            while (true) {
                cls18 = Long.class;
                cls19 = cls16;
                if (i16 >= 12) {
                    break;
                }
                m6187(clsArr[i16], cls18, c93949);
                i16++;
                cls16 = cls19;
            }
            C9394 c939410 = new C9394(l2, 6);
            int i17 = 0;
            while (true) {
                cls20 = Long.TYPE;
                cls21 = cls18;
                if (i17 >= 12) {
                    break;
                }
                m6187(clsArr[i17], cls20, c939410);
                i17++;
                cls18 = cls21;
            }
            C9394 c939411 = new C9394(null, 4);
            int i18 = 0;
            while (true) {
                cls22 = Float.class;
                l = l2;
                if (i18 >= 12) {
                    break;
                }
                m6187(clsArr[i18], cls22, c939411);
                i18++;
                l2 = l;
            }
            C9394 c939412 = new C9394(fValueOf, 4);
            int i19 = 0;
            while (true) {
                cls23 = Float.TYPE;
                cls24 = cls22;
                if (i19 >= 12) {
                    break;
                }
                m6187(clsArr[i19], cls23, c939412);
                i19++;
                cls22 = cls24;
            }
            C9394 c939413 = new C9394(null, 3);
            int i20 = 0;
            while (true) {
                cls25 = Double.class;
                cls26 = cls20;
                if (i20 >= 12) {
                    break;
                }
                m6187(clsArr[i20], cls25, c939413);
                i20++;
                cls20 = cls26;
            }
            C9394 c939414 = new C9394(dValueOf, 3);
            int i21 = 0;
            while (true) {
                cls27 = Double.TYPE;
                cls28 = cls25;
                if (i21 >= 12) {
                    break;
                }
                m6187(clsArr[i21], cls27, c939414);
                i21++;
                cls25 = cls28;
            }
            C3683 c36834 = new C3683(8);
            int i22 = 0;
            while (true) {
                num = numValueOf;
                if (i22 < 12) {
                    m6187(clsArr[i22], Number.class, c36834);
                    i22++;
                    numValueOf = num;
                }
            }
            m6187(String.class, cls30, new C3690(cls30, (Object) '0'));
            m6187(String.class, cls2, new C3690(cls2, Boolean.FALSE));
            m6187(String.class, cls23, new C3690(cls23, fValueOf));
            m6187(String.class, cls27, new C3690(cls27, dValueOf));
            m6187(String.class, cls8, new C3690(cls8, bValueOf));
            m6187(String.class, cls12, new C3690(cls12, shValueOf));
            m6187(String.class, cls19, new C3690(cls19, num));
            m6187(String.class, cls26, new C3690(cls26, l));
            obj = null;
            m6187(String.class, cls15, new C3690(cls15, (Object) null));
            m6187(String.class, cls11, new C3690(cls11, (Object) null));
            m6187(String.class, cls28, new C3690(cls28, (Object) null));
            m6187(String.class, cls24, new C3690(cls24, (Object) null));
            m6187(String.class, cls9, new C3690(cls9, (Object) null));
            m6187(String.class, cls13, new C3690(cls13, (Object) null));
            m6187(String.class, cls17, new C3690(cls17, (Object) null));
            m6187(String.class, cls21, new C3690(cls21, (Object) null));
            m6187(String.class, cls5, new C3690(cls5, (Object) null));
            m6187(String.class, cls7, new C3690(cls7, (Object) null));
            m6187(String.class, Number.class, new C3690(cls5, (Object) null));
            m6187(String.class, Collection.class, new C3690(Collection.class, (Object) null));
            m6187(String.class, List.class, new C3690(List.class, (Object) null));
            m6187(String.class, JSONArray.class, new C3690(JSONArray.class, (Object) null));
            m6187(cls11, cls2, new C3437(14));
            m6187(cls21, LocalDateTime.class, new C3437(25));
            m6187(String.class, UUID.class, new C3437(28));
            it2 = it;
            b = 0;
            i3 = 1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m6181(C9192 c9192, Class cls, Method method) {
        int i = 0;
        while (true) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f9025;
            if (i >= copyOnWriteArrayList.size()) {
                break;
            }
            ((C3612) copyOnWriteArrayList.get(i)).f8845.m4710(c9192, cls, method);
            i++;
        }
        if (c9192.f23394 == null && c9192.f23406 == null) {
            String name = method.getName();
            if (name.startsWith("set")) {
                String strSubstring = name.substring(3);
                if (AbstractC3698.m6373(cls, strSubstring) != null) {
                    c9192.f23406 = new String[]{strSubstring};
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m6182(C9192 c9192, Class cls, Field field) {
        int i = 0;
        while (true) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f9025;
            if (i >= copyOnWriteArrayList.size()) {
                return;
            }
            ((C3612) copyOnWriteArrayList.get(i)).f8845.m4708(c9192, cls, field);
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m6183(C9192 c9192, Class cls, Constructor constructor, int i, Parameter parameter) {
        Class cls2;
        Constructor declaredConstructor;
        int i2 = 0;
        while (true) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f9025;
            if (i2 >= copyOnWriteArrayList.size()) {
                return;
            }
            C3075 c3075 = ((C3612) copyOnWriteArrayList.get(i2)).f8845;
            Annotation[] annotationArrM6380 = null;
            if (cls != null && (cls2 = (Class) ((C3612) c3075.f6882).f8846.f9012.get(cls)) != null && cls2 != cls) {
                try {
                    declaredConstructor = cls2.getDeclaredConstructor(constructor.getParameterTypes());
                } catch (NoSuchMethodException unused) {
                    declaredConstructor = null;
                }
                if (declaredConstructor != null) {
                    c3075.m4705(c9192, AbstractC3698.m6380(declaredConstructor.getParameters()[i]));
                }
            }
            if (Modifier.isStatic(constructor.getDeclaringClass().getModifiers())) {
                try {
                    annotationArrM6380 = AbstractC3698.m6380(parameter);
                } catch (ArrayIndexOutOfBoundsException unused2) {
                }
            } else {
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                int i3 = parameterAnnotations.length == constructor.getParameterCount() ? i : i - 1;
                if (i3 >= 0 && i3 < parameterAnnotations.length) {
                    annotationArrM6380 = parameterAnnotations[i3];
                }
            }
            if (annotationArrM6380 != null && annotationArrM6380.length > 0) {
                c3075.m4705(c9192, annotationArrM6380);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class m6184(String str, Class cls, long j) {
        Class cls2;
        Class cls3;
        Class<?> clsM6489;
        if (str == null || str.isEmpty() || f9010) {
            return null;
        }
        int length = str.length();
        if (length >= 192) {
            C1123.m1410("autoType is not support. ".concat(str));
            return null;
        }
        if (str.charAt(0) == '[') {
            m6184(str.substring(1), null, j);
        }
        if (cls != null && cls.getName().equals(str)) {
            m6185(cls, str);
            return cls;
        }
        boolean z = (JSONReader$Feature.SupportAutoType.mask & j) != 0;
        long[] jArr = this.f9019;
        long j2 = -3750763034362895579L;
        if (z) {
            long j3 = -3750763034362895579L;
            int i = 0;
            while (i < length) {
                char cCharAt = str.charAt(i);
                if (cCharAt == '$') {
                    cCharAt = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
                }
                long j4 = (j3 ^ ((long) cCharAt)) * 1099511628211L;
                if (Arrays.binarySearch(jArr, j4) >= 0 && (clsM6489 = AbstractC3700.m6489(str)) != null) {
                    if (cls == null || cls.isAssignableFrom(clsM6489)) {
                        m6185(clsM6489, str);
                        return clsM6489;
                    }
                    C1123.m1410(AbstractC7012.m12148(cls, AbstractC7012.m12144("type not match. ", str, " -> ")));
                    return null;
                }
                i++;
                j3 = j4;
            }
        }
        if (!z) {
            int i2 = 0;
            while (i2 < length) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 == '$') {
                    cCharAt2 = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
                }
                long j5 = (j2 ^ ((long) cCharAt2)) * 1099511628211L;
                if (Arrays.binarySearch(jArr, j5) >= 0) {
                    Class<?> clsM64892 = AbstractC3700.m6489(str);
                    if (clsM64892 == null || cls == null || cls.isAssignableFrom(clsM64892)) {
                        m6185(clsM64892, str);
                        return clsM64892;
                    }
                    C1123.m1410(AbstractC7012.m12148(cls, AbstractC7012.m12144("type not match. ", str, " -> ")));
                    return null;
                }
                i2++;
                j2 = j5;
            }
        }
        if (!z) {
            return null;
        }
        Class<?> cls4 = (Class) AbstractC3700.f9378.get(str);
        if (cls4 != null) {
            if (cls == null || cls == Object.class || cls4 == HashMap.class || cls.isAssignableFrom(cls4)) {
                m6185(cls4, str);
                return cls4;
            }
            C1123.m1410(AbstractC7012.m12148(cls, AbstractC7012.m12144("type not match. ", str, " -> ")));
            return null;
        }
        Class<?> clsM64893 = AbstractC3700.m6489(str);
        if (clsM64893 != null) {
            if (ClassLoader.class.isAssignableFrom(clsM64893) || (((cls2 = AbstractC3687.f9281) != null && cls2.isAssignableFrom(clsM64893)) || ((cls3 = AbstractC3687.f9282) != null && cls3.isAssignableFrom(clsM64893)))) {
                C1123.m1410("autoType is not support. ".concat(str));
                return null;
            }
            if (cls != null) {
                if (cls.isAssignableFrom(clsM64893)) {
                    m6185(clsM64893, str);
                    return clsM64893;
                }
                if ((j & JSONReader$Feature.IgnoreAutoTypeNotMatch.mask) != 0) {
                    return cls;
                }
                C1123.m1410(AbstractC7012.m12148(cls, AbstractC7012.m12144("type not match. ", str, " -> ")));
                return null;
            }
        }
        m6185(clsM64893, str);
        return clsM64893;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m6185(Class cls, String str) {
        Consumer consumer = this.f9020;
        if (consumer != null) {
            consumer.accept(cls);
        }
        synchronized (this.f9011) {
            putIfAbsent(str, new Date());
        }
    }

    @Override // p306.InterfaceC9245
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class mo6186(Class cls) {
        return (Class) this.f9012.get(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m6187(Class cls, Class cls2, Function function) {
        ConcurrentHashMap concurrentHashMap = this.f9022;
        Map map = (Map) concurrentHashMap.get(cls);
        if (map == null) {
            concurrentHashMap.putIfAbsent(cls, new ConcurrentHashMap());
            map = (Map) concurrentHashMap.get(cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m6188(long j, InterfaceC3621 interfaceC3621) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null && contextClassLoader != InterfaceC3749.class.getClassLoader()) {
            int iIdentityHashCode = System.identityHashCode(contextClassLoader);
            Integer numValueOf = Integer.valueOf(iIdentityHashCode);
            ConcurrentHashMap concurrentHashMap = this.f9014;
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(numValueOf);
            if (concurrentHashMap2 == null) {
                concurrentHashMap.putIfAbsent(Integer.valueOf(iIdentityHashCode), new ConcurrentHashMap());
                concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(Integer.valueOf(iIdentityHashCode));
            }
            concurrentHashMap2.putIfAbsent(Long.valueOf(j), interfaceC3621);
        }
        this.f9013.putIfAbsent(Long.valueOf(j), interfaceC3621);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC3621 m6189(String str, Class cls, long j) {
        Class clsM6184 = m6184(str, cls, j);
        if (clsM6184 == null) {
            return null;
        }
        InterfaceC3621 interfaceC3621M6193 = m6193(clsM6184, (j & JSONReader$Feature.FieldBased.mask) != 0);
        if (clsM6184 != cls) {
            m6188(AbstractC3693.m6334(str), interfaceC3621M6193);
        }
        return interfaceC3621M6193;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC3621 m6190(long j) {
        C3634 c3634 = f9008;
        InterfaceC3621 interfaceC3621 = null;
        if (c3634 != null) {
            if (c3634.f9005 == j) {
                return c3634.f9004;
            }
            int i = c3634.f9003;
            c3634.f9003 = i + 1;
            if (i > 16) {
                f9008 = null;
            }
        }
        Long lValueOf = Long.valueOf(j);
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null && contextClassLoader != f9009) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f9014.get(Integer.valueOf(System.identityHashCode(contextClassLoader)));
            if (concurrentHashMap != null) {
                interfaceC3621 = (InterfaceC3621) concurrentHashMap.get(lValueOf);
            }
        }
        if (interfaceC3621 == null) {
            interfaceC3621 = (InterfaceC3621) this.f9013.get(lValueOf);
        }
        if (interfaceC3621 != null && f9008 == null) {
            f9008 = new C3634(j, interfaceC3621);
        }
        return interfaceC3621;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Function m6191(Class cls, Type type) {
        Map map = (Map) this.f9022.get(cls);
        if (map == null) {
            return null;
        }
        return (Function) map.get(type);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m6192(Class cls) {
        this.f9012.put(cls, InterfaceC3679.class);
        this.f9016.remove(cls);
        this.f9015.remove(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC3621 m6193(Type type, boolean z) {
        InterfaceC3621 interfaceC3621M6193;
        InterfaceC3621 interfaceC3621M61932;
        if (type == null) {
            type = Object.class;
        }
        ConcurrentHashMap concurrentHashMap = this.f9016;
        ConcurrentHashMap concurrentHashMap2 = this.f9015;
        InterfaceC3621 interfaceC3621 = z ? (InterfaceC3621) concurrentHashMap2.get(type) : (InterfaceC3621) concurrentHashMap.get(type);
        boolean z2 = false;
        if (interfaceC3621 == null && (type instanceof WildcardType)) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                Type type2 = upperBounds[0];
                interfaceC3621 = (InterfaceC3621) (z ? concurrentHashMap2.get(type2) : concurrentHashMap.get(type2));
            }
        }
        if (interfaceC3621 != null) {
            return interfaceC3621;
        }
        Iterator it = this.f9025.iterator();
        InterfaceC3621 interfaceC3621Mo6089 = null;
        while (it.hasNext()) {
            ((C3612) it.next()).getClass();
            interfaceC3621Mo6089 = C3612.m6175(this, type);
            if (interfaceC3621Mo6089 != null) {
                InterfaceC3621 interfaceC36212 = z ? (InterfaceC3621) concurrentHashMap2.putIfAbsent(type, interfaceC3621Mo6089) : (InterfaceC3621) concurrentHashMap.putIfAbsent(type, interfaceC3621Mo6089);
                return interfaceC36212 != null ? interfaceC36212 : interfaceC3621Mo6089;
            }
        }
        if (type instanceof TypeVariable) {
            Type[] bounds = ((TypeVariable) type).getBounds();
            if (bounds.length > 0) {
                Type type3 = bounds[0];
                if ((type3 instanceof Class) && (interfaceC3621M61932 = m6193(type3, z)) != null) {
                    InterfaceC3621 interfaceC3621M6194 = m6194(z, type, interfaceC3621M61932);
                    return interfaceC3621M6194 != null ? interfaceC3621M6194 : interfaceC3621M61932;
                }
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (rawType instanceof Class) {
                Class cls = (Class) rawType;
                Class superclass = cls;
                while (true) {
                    if (superclass == Object.class) {
                        break;
                    }
                    if (superclass.getTypeParameters().length > 0) {
                        z2 = true;
                        break;
                    }
                    superclass = superclass.getSuperclass();
                }
                if ((actualTypeArguments.length == 0 || !z2) && (interfaceC3621M6193 = m6193(cls, z)) != null) {
                    InterfaceC3621 interfaceC3621M61942 = m6194(z, type, interfaceC3621M6193);
                    return interfaceC3621M61942 != null ? interfaceC3621M61942 : interfaceC3621M6193;
                }
                if (actualTypeArguments.length == 1 && ArrayList.class.isAssignableFrom(cls)) {
                    return C3531.m6060(cls, type);
                }
                if (actualTypeArguments.length == 2 && Map.class.isAssignableFrom(cls)) {
                    return C3547.m6068(type, cls, 0L);
                }
            }
        }
        Class clsM6502 = AbstractC3700.m6502(type);
        String name = clsM6502.getName();
        if (!z && "com.google.common.collect.ArrayListMultimap".equals(name)) {
            interfaceC3621Mo6089 = C3547.m6068(null, clsM6502, 0L);
        }
        if (interfaceC3621Mo6089 == null) {
            C3609 c3609 = (C3609) AbstractC3766.f9637.get();
            if (c3609 == null) {
                c3609 = this.f9021;
            }
            interfaceC3621Mo6089 = c3609.mo6089(clsM6502, type, z, this);
        }
        InterfaceC3621 interfaceC3621M61943 = m6194(z, type, interfaceC3621Mo6089);
        return interfaceC3621M61943 != null ? interfaceC3621M61943 : interfaceC3621Mo6089;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC3621 m6194(boolean z, Type type, InterfaceC3621 interfaceC3621) {
        return z ? (InterfaceC3621) this.f9015.putIfAbsent(type, interfaceC3621) : (InterfaceC3621) this.f9016.putIfAbsent(type, interfaceC3621);
    }
}
