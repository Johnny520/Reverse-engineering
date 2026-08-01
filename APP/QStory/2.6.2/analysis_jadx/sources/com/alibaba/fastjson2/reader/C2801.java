package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.core.view.C2242;
import com.alibaba.fastjson2.AbstractC2929;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2864;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.alibaba.fastjson2.util.InterfaceC2845;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import net.bytebuddy.pool.TypePool;
import p007.AbstractC6136;
import p278.C8362;
import p290.InterfaceC8424;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2801 implements InterfaceC8424 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final Consumer f8659;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String[] f8660;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static C2800 f8661;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final ClassLoader f8662 = InterfaceC2915.class.getClassLoader();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final boolean f8663;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ObjectReaderProvider$LRUAutoTypeCache f8664;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final long[] f8672;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2775 f8674;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f8669 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f8668 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ConcurrentHashMap f8667 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ConcurrentHashMap f8666 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ConcurrentHashMap f8665 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f8675 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final CopyOnWriteArrayList f8678 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f8679 = AbstractC2932.f9282;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean f8676 = AbstractC2932.f9301;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f8677 = AbstractC2932.f9300;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean f8671 = AbstractC2932.f9304;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean f8670 = AbstractC2932.f9305;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Consumer f8673 = f8659;

    static {
        Class clsM5884;
        Class clsM58842;
        String property = System.getProperty("fastjson2.parser.deny");
        if (property == null) {
            property = AbstractC2929.f9277.getProperty("fastjson2.parser.deny");
        }
        if (property != null && property.length() > 0) {
            property.split(",");
        }
        String property2 = System.getProperty("fastjson2.autoTypeAccept");
        if (property2 == null) {
            property2 = AbstractC2929.f9277.getProperty("fastjson2.autoTypeAccept");
        }
        if (property2 == null || property2.length() <= 0) {
            f8660 = new String[0];
        } else {
            f8660 = property2.split(",");
        }
        String property3 = System.getProperty("fastjson2.autoTypeBeforeHandler");
        if (property3 == null || property3.isEmpty()) {
            property3 = AbstractC2929.f9277.getProperty("fastjson2.autoTypeBeforeHandler");
        }
        if (property3 != null) {
            property3 = property3.trim();
        }
        if (property3 != null && !property3.isEmpty() && (clsM58842 = AbstractC2866.m5884(property3)) != null) {
            try {
                if (clsM58842.newInstance() != null) {
                    throw new ClassCastException();
                }
            } catch (Exception unused) {
            }
        }
        String property4 = System.getProperty("fastjson2.autoTypeHandler");
        if (property4 == null || property4.isEmpty()) {
            property4 = AbstractC2929.f9277.getProperty("fastjson2.autoTypeHandler");
        }
        if (property4 != null) {
            property4 = property4.trim();
        }
        if (property4 != null && !property4.isEmpty() && (clsM5884 = AbstractC2866.m5884(property4)) != null) {
            try {
                f8659 = (Consumer) clsM5884.newInstance();
            } catch (Exception unused2) {
            }
        }
        String property5 = System.getProperty("fastjson.parser.safeMode");
        if (property5 == null || property5.isEmpty()) {
            property5 = AbstractC2929.f9277.getProperty("fastjson.parser.safeMode");
        }
        if (property5 == null || property5.isEmpty()) {
            property5 = System.getProperty("fastjson2.parser.safeMode");
        }
        if (property5 == null || property5.isEmpty()) {
            property5 = AbstractC2929.f9277.getProperty("fastjson2.parser.safeMode");
        }
        if (property5 != null) {
            property5 = property5.trim();
        }
        f8663 = "true".equals(property5);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.alibaba.fastjson2.reader.ObjectReaderProvider$LRUAutoTypeCache] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2801() {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2801.<init>():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m5576(C8362 c8362, Class cls, Method method) {
        int i = 0;
        while (true) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f8678;
            if (i >= copyOnWriteArrayList.size()) {
                break;
            }
            ((C2778) copyOnWriteArrayList.get(i)).f8498.m4140(c8362, cls, method);
            i++;
        }
        if (c8362.f23050 == null && c8362.f23062 == null) {
            String name = method.getName();
            if (name.startsWith("set")) {
                String strSubstring = name.substring(3);
                if (AbstractC2864.m5768(cls, strSubstring) != null) {
                    c8362.f23062 = new String[]{strSubstring};
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m5577(C8362 c8362, Class cls, Field field) {
        int i = 0;
        while (true) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f8678;
            if (i >= copyOnWriteArrayList.size()) {
                return;
            }
            ((C2778) copyOnWriteArrayList.get(i)).f8498.m4138(c8362, cls, field);
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m5578(C8362 c8362, Class cls, Constructor constructor, int i, Parameter parameter) {
        Class cls2;
        Constructor declaredConstructor;
        int i2 = 0;
        while (true) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f8678;
            if (i2 >= copyOnWriteArrayList.size()) {
                return;
            }
            C2242 c2242 = ((C2778) copyOnWriteArrayList.get(i2)).f8498;
            Annotation[] annotationArrM5775 = null;
            if (cls != null && (cls2 = (Class) ((C2778) c2242.f6536).f8499.f8665.get(cls)) != null && cls2 != cls) {
                try {
                    declaredConstructor = cls2.getDeclaredConstructor(constructor.getParameterTypes());
                } catch (NoSuchMethodException unused) {
                    declaredConstructor = null;
                }
                if (declaredConstructor != null) {
                    c2242.m4135(c8362, AbstractC2864.m5775(declaredConstructor.getParameters()[i]));
                }
            }
            if (Modifier.isStatic(constructor.getDeclaringClass().getModifiers())) {
                try {
                    annotationArrM5775 = AbstractC2864.m5775(parameter);
                } catch (ArrayIndexOutOfBoundsException unused2) {
                }
            } else {
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                int i3 = parameterAnnotations.length == constructor.getParameterCount() ? i : i - 1;
                if (i3 >= 0 && i3 < parameterAnnotations.length) {
                    annotationArrM5775 = parameterAnnotations[i3];
                }
            }
            if (annotationArrM5775 != null && annotationArrM5775.length > 0) {
                c2242.m4135(c8362, annotationArrM5775);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class m5579(String str, Class cls, long j) {
        Class cls2;
        Class cls3;
        Class<?> clsM5884;
        if (str == null || str.isEmpty() || f8663) {
            return null;
        }
        int length = str.length();
        if (length >= 192) {
            C0276.m849("autoType is not support. ".concat(str));
            return null;
        }
        if (str.charAt(0) == '[') {
            m5579(str.substring(1), null, j);
        }
        if (cls != null && cls.getName().equals(str)) {
            m5580(cls, str);
            return cls;
        }
        boolean z = (JSONReader$Feature.SupportAutoType.mask & j) != 0;
        long[] jArr = this.f8672;
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
                if (Arrays.binarySearch(jArr, j4) >= 0 && (clsM5884 = AbstractC2866.m5884(str)) != null) {
                    if (cls == null || cls.isAssignableFrom(clsM5884)) {
                        m5580(clsM5884, str);
                        return clsM5884;
                    }
                    C0276.m849(AbstractC6136.m11549(cls, AbstractC6136.m11550("type not match. ", str, " -> ")));
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
                    Class<?> clsM58842 = AbstractC2866.m5884(str);
                    if (clsM58842 == null || cls == null || cls.isAssignableFrom(clsM58842)) {
                        m5580(clsM58842, str);
                        return clsM58842;
                    }
                    C0276.m849(AbstractC6136.m11549(cls, AbstractC6136.m11550("type not match. ", str, " -> ")));
                    return null;
                }
                i2++;
                j2 = j5;
            }
        }
        if (!z) {
            return null;
        }
        Class<?> cls4 = (Class) AbstractC2866.f9031.get(str);
        if (cls4 != null) {
            if (cls == null || cls == Object.class || cls4 == HashMap.class || cls.isAssignableFrom(cls4)) {
                m5580(cls4, str);
                return cls4;
            }
            C0276.m849(AbstractC6136.m11549(cls, AbstractC6136.m11550("type not match. ", str, " -> ")));
            return null;
        }
        Class<?> clsM58843 = AbstractC2866.m5884(str);
        if (clsM58843 != null) {
            if (ClassLoader.class.isAssignableFrom(clsM58843) || (((cls2 = AbstractC2853.f8934) != null && cls2.isAssignableFrom(clsM58843)) || ((cls3 = AbstractC2853.f8935) != null && cls3.isAssignableFrom(clsM58843)))) {
                C0276.m849("autoType is not support. ".concat(str));
                return null;
            }
            if (cls != null) {
                if (cls.isAssignableFrom(clsM58843)) {
                    m5580(clsM58843, str);
                    return clsM58843;
                }
                if ((j & JSONReader$Feature.IgnoreAutoTypeNotMatch.mask) != 0) {
                    return cls;
                }
                C0276.m849(AbstractC6136.m11549(cls, AbstractC6136.m11550("type not match. ", str, " -> ")));
                return null;
            }
        }
        m5580(clsM58843, str);
        return clsM58843;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5580(Class cls, String str) {
        Consumer consumer = this.f8673;
        if (consumer != null) {
            consumer.accept(cls);
        }
        synchronized (this.f8664) {
            putIfAbsent(str, new Date());
        }
    }

    @Override // p290.InterfaceC8424
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class mo5581(Class cls) {
        return (Class) this.f8665.get(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m5582(Class cls, Class cls2, Function function) {
        ConcurrentHashMap concurrentHashMap = this.f8675;
        Map map = (Map) concurrentHashMap.get(cls);
        if (map == null) {
            concurrentHashMap.putIfAbsent(cls, new ConcurrentHashMap());
            map = (Map) concurrentHashMap.get(cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m5583(long j, InterfaceC2787 interfaceC2787) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null && contextClassLoader != InterfaceC2915.class.getClassLoader()) {
            int iIdentityHashCode = System.identityHashCode(contextClassLoader);
            Integer numValueOf = Integer.valueOf(iIdentityHashCode);
            ConcurrentHashMap concurrentHashMap = this.f8667;
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(numValueOf);
            if (concurrentHashMap2 == null) {
                concurrentHashMap.putIfAbsent(Integer.valueOf(iIdentityHashCode), new ConcurrentHashMap());
                concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(Integer.valueOf(iIdentityHashCode));
            }
            concurrentHashMap2.putIfAbsent(Long.valueOf(j), interfaceC2787);
        }
        this.f8666.putIfAbsent(Long.valueOf(j), interfaceC2787);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC2787 m5584(String str, Class cls, long j) {
        Class clsM5579 = m5579(str, cls, j);
        if (clsM5579 == null) {
            return null;
        }
        InterfaceC2787 interfaceC2787M5588 = m5588(clsM5579, (j & JSONReader$Feature.FieldBased.mask) != 0);
        if (clsM5579 != cls) {
            m5583(AbstractC2859.m5729(str), interfaceC2787M5588);
        }
        return interfaceC2787M5588;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC2787 m5585(long j) {
        C2800 c2800 = f8661;
        InterfaceC2787 interfaceC2787 = null;
        if (c2800 != null) {
            if (c2800.f8658 == j) {
                return c2800.f8657;
            }
            int i = c2800.f8656;
            c2800.f8656 = i + 1;
            if (i > 16) {
                f8661 = null;
            }
        }
        Long lValueOf = Long.valueOf(j);
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null && contextClassLoader != f8662) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f8667.get(Integer.valueOf(System.identityHashCode(contextClassLoader)));
            if (concurrentHashMap != null) {
                interfaceC2787 = (InterfaceC2787) concurrentHashMap.get(lValueOf);
            }
        }
        if (interfaceC2787 == null) {
            interfaceC2787 = (InterfaceC2787) this.f8666.get(lValueOf);
        }
        if (interfaceC2787 != null && f8661 == null) {
            f8661 = new C2800(j, interfaceC2787);
        }
        return interfaceC2787;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Function m5586(Class cls, Type type) {
        Map map = (Map) this.f8675.get(cls);
        if (map == null) {
            return null;
        }
        return (Function) map.get(type);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m5587(Class cls) {
        this.f8665.put(cls, InterfaceC2845.class);
        this.f8669.remove(cls);
        this.f8668.remove(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC2787 m5588(Type type, boolean z) {
        InterfaceC2787 interfaceC2787M5588;
        InterfaceC2787 interfaceC2787M55882;
        if (type == null) {
            type = Object.class;
        }
        ConcurrentHashMap concurrentHashMap = this.f8669;
        ConcurrentHashMap concurrentHashMap2 = this.f8668;
        InterfaceC2787 interfaceC2787 = z ? (InterfaceC2787) concurrentHashMap2.get(type) : (InterfaceC2787) concurrentHashMap.get(type);
        boolean z2 = false;
        if (interfaceC2787 == null && (type instanceof WildcardType)) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                Type type2 = upperBounds[0];
                interfaceC2787 = (InterfaceC2787) (z ? concurrentHashMap2.get(type2) : concurrentHashMap.get(type2));
            }
        }
        if (interfaceC2787 != null) {
            return interfaceC2787;
        }
        Iterator it = this.f8678.iterator();
        InterfaceC2787 interfaceC2787Mo5484 = null;
        while (it.hasNext()) {
            ((C2778) it.next()).getClass();
            interfaceC2787Mo5484 = C2778.m5570(this, type);
            if (interfaceC2787Mo5484 != null) {
                InterfaceC2787 interfaceC27872 = z ? (InterfaceC2787) concurrentHashMap2.putIfAbsent(type, interfaceC2787Mo5484) : (InterfaceC2787) concurrentHashMap.putIfAbsent(type, interfaceC2787Mo5484);
                return interfaceC27872 != null ? interfaceC27872 : interfaceC2787Mo5484;
            }
        }
        if (type instanceof TypeVariable) {
            Type[] bounds = ((TypeVariable) type).getBounds();
            if (bounds.length > 0) {
                Type type3 = bounds[0];
                if ((type3 instanceof Class) && (interfaceC2787M55882 = m5588(type3, z)) != null) {
                    InterfaceC2787 interfaceC2787M5589 = m5589(z, type, interfaceC2787M55882);
                    return interfaceC2787M5589 != null ? interfaceC2787M5589 : interfaceC2787M55882;
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
                if ((actualTypeArguments.length == 0 || !z2) && (interfaceC2787M5588 = m5588(cls, z)) != null) {
                    InterfaceC2787 interfaceC2787M55892 = m5589(z, type, interfaceC2787M5588);
                    return interfaceC2787M55892 != null ? interfaceC2787M55892 : interfaceC2787M5588;
                }
                if (actualTypeArguments.length == 1 && ArrayList.class.isAssignableFrom(cls)) {
                    return C2697.m5455(cls, type);
                }
                if (actualTypeArguments.length == 2 && Map.class.isAssignableFrom(cls)) {
                    return C2713.m5463(type, cls, 0L);
                }
            }
        }
        Class clsM5897 = AbstractC2866.m5897(type);
        String name = clsM5897.getName();
        if (!z && "com.google.common.collect.ArrayListMultimap".equals(name)) {
            interfaceC2787Mo5484 = C2713.m5463(null, clsM5897, 0L);
        }
        if (interfaceC2787Mo5484 == null) {
            C2775 c2775 = (C2775) AbstractC2932.f9290.get();
            if (c2775 == null) {
                c2775 = this.f8674;
            }
            interfaceC2787Mo5484 = c2775.mo5484(clsM5897, type, z, this);
        }
        InterfaceC2787 interfaceC2787M55893 = m5589(z, type, interfaceC2787Mo5484);
        return interfaceC2787M55893 != null ? interfaceC2787M55893 : interfaceC2787Mo5484;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC2787 m5589(boolean z, Type type, InterfaceC2787 interfaceC2787) {
        return z ? (InterfaceC2787) this.f8668.putIfAbsent(type, interfaceC2787) : (InterfaceC2787) this.f8669.putIfAbsent(type, interfaceC2787);
    }
}
