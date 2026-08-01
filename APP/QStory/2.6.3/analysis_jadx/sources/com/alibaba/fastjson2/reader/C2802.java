package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import androidx.core.view.C2242;
import com.alibaba.fastjson2.AbstractC2930;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.AbstractC2867;
import com.alibaba.fastjson2.util.InterfaceC2846;
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
import p009.AbstractC6183;
import p278.C8363;
import p290.InterfaceC8416;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2802 implements InterfaceC8416 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final Consumer f8661;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String[] f8662;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static C2801 f8663;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final ClassLoader f8664 = InterfaceC2916.class.getClassLoader();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final boolean f8665;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ObjectReaderProvider$LRUAutoTypeCache f8666;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final long[] f8674;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2776 f8676;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f8671 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f8670 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ConcurrentHashMap f8669 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ConcurrentHashMap f8668 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ConcurrentHashMap f8667 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ConcurrentHashMap f8677 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final CopyOnWriteArrayList f8680 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f8681 = AbstractC2933.f9284;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean f8678 = AbstractC2933.f9303;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f8679 = AbstractC2933.f9302;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean f8673 = AbstractC2933.f9306;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean f8672 = AbstractC2933.f9307;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Consumer f8675 = f8661;

    static {
        Class clsM5929;
        Class clsM59292;
        String property = System.getProperty("fastjson2.parser.deny");
        if (property == null) {
            property = AbstractC2930.f9279.getProperty("fastjson2.parser.deny");
        }
        if (property != null && property.length() > 0) {
            property.split(",");
        }
        String property2 = System.getProperty("fastjson2.autoTypeAccept");
        if (property2 == null) {
            property2 = AbstractC2930.f9279.getProperty("fastjson2.autoTypeAccept");
        }
        if (property2 == null || property2.length() <= 0) {
            f8662 = new String[0];
        } else {
            f8662 = property2.split(",");
        }
        String property3 = System.getProperty("fastjson2.autoTypeBeforeHandler");
        if (property3 == null || property3.isEmpty()) {
            property3 = AbstractC2930.f9279.getProperty("fastjson2.autoTypeBeforeHandler");
        }
        if (property3 != null) {
            property3 = property3.trim();
        }
        if (property3 != null && !property3.isEmpty() && (clsM59292 = AbstractC2867.m5929(property3)) != null) {
            try {
                if (clsM59292.newInstance() != null) {
                    throw new ClassCastException();
                }
            } catch (Exception unused) {
            }
        }
        String property4 = System.getProperty("fastjson2.autoTypeHandler");
        if (property4 == null || property4.isEmpty()) {
            property4 = AbstractC2930.f9279.getProperty("fastjson2.autoTypeHandler");
        }
        if (property4 != null) {
            property4 = property4.trim();
        }
        if (property4 != null && !property4.isEmpty() && (clsM5929 = AbstractC2867.m5929(property4)) != null) {
            try {
                f8661 = (Consumer) clsM5929.newInstance();
            } catch (Exception unused2) {
            }
        }
        String property5 = System.getProperty("fastjson.parser.safeMode");
        if (property5 == null || property5.isEmpty()) {
            property5 = AbstractC2930.f9279.getProperty("fastjson.parser.safeMode");
        }
        if (property5 == null || property5.isEmpty()) {
            property5 = System.getProperty("fastjson2.parser.safeMode");
        }
        if (property5 == null || property5.isEmpty()) {
            property5 = AbstractC2930.f9279.getProperty("fastjson2.parser.safeMode");
        }
        if (property5 != null) {
            property5 = property5.trim();
        }
        f8665 = "true".equals(property5);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.alibaba.fastjson2.reader.ObjectReaderProvider$LRUAutoTypeCache] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2802() {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2802.<init>():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m5621(C8363 c8363, Class cls, Method method) {
        int i = 0;
        while (true) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f8680;
            if (i >= copyOnWriteArrayList.size()) {
                break;
            }
            ((C2779) copyOnWriteArrayList.get(i)).f8500.m4150(c8363, cls, method);
            i++;
        }
        if (c8363.f23049 == null && c8363.f23061 == null) {
            String name = method.getName();
            if (name.startsWith("set")) {
                String strSubstring = name.substring(3);
                if (AbstractC2865.m5813(cls, strSubstring) != null) {
                    c8363.f23061 = new String[]{strSubstring};
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m5622(C8363 c8363, Class cls, Field field) {
        int i = 0;
        while (true) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f8680;
            if (i >= copyOnWriteArrayList.size()) {
                return;
            }
            ((C2779) copyOnWriteArrayList.get(i)).f8500.m4148(c8363, cls, field);
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m5623(C8363 c8363, Class cls, Constructor constructor, int i, Parameter parameter) {
        Class cls2;
        Constructor declaredConstructor;
        int i2 = 0;
        while (true) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f8680;
            if (i2 >= copyOnWriteArrayList.size()) {
                return;
            }
            C2242 c2242 = ((C2779) copyOnWriteArrayList.get(i2)).f8500;
            Annotation[] annotationArrM5820 = null;
            if (cls != null && (cls2 = (Class) ((C2779) c2242.f6537).f8501.f8667.get(cls)) != null && cls2 != cls) {
                try {
                    declaredConstructor = cls2.getDeclaredConstructor(constructor.getParameterTypes());
                } catch (NoSuchMethodException unused) {
                    declaredConstructor = null;
                }
                if (declaredConstructor != null) {
                    c2242.m4145(c8363, AbstractC2865.m5820(declaredConstructor.getParameters()[i]));
                }
            }
            if (Modifier.isStatic(constructor.getDeclaringClass().getModifiers())) {
                try {
                    annotationArrM5820 = AbstractC2865.m5820(parameter);
                } catch (ArrayIndexOutOfBoundsException unused2) {
                }
            } else {
                Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                int i3 = parameterAnnotations.length == constructor.getParameterCount() ? i : i - 1;
                if (i3 >= 0 && i3 < parameterAnnotations.length) {
                    annotationArrM5820 = parameterAnnotations[i3];
                }
            }
            if (annotationArrM5820 != null && annotationArrM5820.length > 0) {
                c2242.m4145(c8363, annotationArrM5820);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class m5624(String str, Class cls, long j) {
        Class cls2;
        Class cls3;
        Class<?> clsM5929;
        if (str == null || str.isEmpty() || f8665) {
            return null;
        }
        int length = str.length();
        if (length >= 192) {
            C0276.m850("autoType is not support. ".concat(str));
            return null;
        }
        if (str.charAt(0) == '[') {
            m5624(str.substring(1), null, j);
        }
        if (cls != null && cls.getName().equals(str)) {
            m5625(cls, str);
            return cls;
        }
        boolean z = (JSONReader$Feature.SupportAutoType.mask & j) != 0;
        long[] jArr = this.f8674;
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
                if (Arrays.binarySearch(jArr, j4) >= 0 && (clsM5929 = AbstractC2867.m5929(str)) != null) {
                    if (cls == null || cls.isAssignableFrom(clsM5929)) {
                        m5625(clsM5929, str);
                        return clsM5929;
                    }
                    C0276.m850(AbstractC6183.m11589(cls, AbstractC6183.m11585("type not match. ", str, " -> ")));
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
                    Class<?> clsM59292 = AbstractC2867.m5929(str);
                    if (clsM59292 == null || cls == null || cls.isAssignableFrom(clsM59292)) {
                        m5625(clsM59292, str);
                        return clsM59292;
                    }
                    C0276.m850(AbstractC6183.m11589(cls, AbstractC6183.m11585("type not match. ", str, " -> ")));
                    return null;
                }
                i2++;
                j2 = j5;
            }
        }
        if (!z) {
            return null;
        }
        Class<?> cls4 = (Class) AbstractC2867.f9033.get(str);
        if (cls4 != null) {
            if (cls == null || cls == Object.class || cls4 == HashMap.class || cls.isAssignableFrom(cls4)) {
                m5625(cls4, str);
                return cls4;
            }
            C0276.m850(AbstractC6183.m11589(cls, AbstractC6183.m11585("type not match. ", str, " -> ")));
            return null;
        }
        Class<?> clsM59293 = AbstractC2867.m5929(str);
        if (clsM59293 != null) {
            if (ClassLoader.class.isAssignableFrom(clsM59293) || (((cls2 = AbstractC2854.f8936) != null && cls2.isAssignableFrom(clsM59293)) || ((cls3 = AbstractC2854.f8937) != null && cls3.isAssignableFrom(clsM59293)))) {
                C0276.m850("autoType is not support. ".concat(str));
                return null;
            }
            if (cls != null) {
                if (cls.isAssignableFrom(clsM59293)) {
                    m5625(clsM59293, str);
                    return clsM59293;
                }
                if ((j & JSONReader$Feature.IgnoreAutoTypeNotMatch.mask) != 0) {
                    return cls;
                }
                C0276.m850(AbstractC6183.m11589(cls, AbstractC6183.m11585("type not match. ", str, " -> ")));
                return null;
            }
        }
        m5625(clsM59293, str);
        return clsM59293;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5625(Class cls, String str) {
        Consumer consumer = this.f8675;
        if (consumer != null) {
            consumer.accept(cls);
        }
        synchronized (this.f8666) {
            putIfAbsent(str, new Date());
        }
    }

    @Override // p290.InterfaceC8416
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class mo5626(Class cls) {
        return (Class) this.f8667.get(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m5627(Class cls, Class cls2, Function function) {
        ConcurrentHashMap concurrentHashMap = this.f8677;
        Map map = (Map) concurrentHashMap.get(cls);
        if (map == null) {
            concurrentHashMap.putIfAbsent(cls, new ConcurrentHashMap());
            map = (Map) concurrentHashMap.get(cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m5628(long j, InterfaceC2788 interfaceC2788) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null && contextClassLoader != InterfaceC2916.class.getClassLoader()) {
            int iIdentityHashCode = System.identityHashCode(contextClassLoader);
            Integer numValueOf = Integer.valueOf(iIdentityHashCode);
            ConcurrentHashMap concurrentHashMap = this.f8669;
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(numValueOf);
            if (concurrentHashMap2 == null) {
                concurrentHashMap.putIfAbsent(Integer.valueOf(iIdentityHashCode), new ConcurrentHashMap());
                concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(Integer.valueOf(iIdentityHashCode));
            }
            concurrentHashMap2.putIfAbsent(Long.valueOf(j), interfaceC2788);
        }
        this.f8668.putIfAbsent(Long.valueOf(j), interfaceC2788);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC2788 m5629(String str, Class cls, long j) {
        Class clsM5624 = m5624(str, cls, j);
        if (clsM5624 == null) {
            return null;
        }
        InterfaceC2788 interfaceC2788M5633 = m5633(clsM5624, (j & JSONReader$Feature.FieldBased.mask) != 0);
        if (clsM5624 != cls) {
            m5628(AbstractC2860.m5774(str), interfaceC2788M5633);
        }
        return interfaceC2788M5633;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC2788 m5630(long j) {
        C2801 c2801 = f8663;
        InterfaceC2788 interfaceC2788 = null;
        if (c2801 != null) {
            if (c2801.f8660 == j) {
                return c2801.f8659;
            }
            int i = c2801.f8658;
            c2801.f8658 = i + 1;
            if (i > 16) {
                f8663 = null;
            }
        }
        Long lValueOf = Long.valueOf(j);
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != null && contextClassLoader != f8664) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f8669.get(Integer.valueOf(System.identityHashCode(contextClassLoader)));
            if (concurrentHashMap != null) {
                interfaceC2788 = (InterfaceC2788) concurrentHashMap.get(lValueOf);
            }
        }
        if (interfaceC2788 == null) {
            interfaceC2788 = (InterfaceC2788) this.f8668.get(lValueOf);
        }
        if (interfaceC2788 != null && f8663 == null) {
            f8663 = new C2801(j, interfaceC2788);
        }
        return interfaceC2788;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Function m5631(Class cls, Type type) {
        Map map = (Map) this.f8677.get(cls);
        if (map == null) {
            return null;
        }
        return (Function) map.get(type);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m5632(Class cls) {
        this.f8667.put(cls, InterfaceC2846.class);
        this.f8671.remove(cls);
        this.f8670.remove(cls);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC2788 m5633(Type type, boolean z) {
        InterfaceC2788 interfaceC2788M5633;
        InterfaceC2788 interfaceC2788M56332;
        if (type == null) {
            type = Object.class;
        }
        ConcurrentHashMap concurrentHashMap = this.f8671;
        ConcurrentHashMap concurrentHashMap2 = this.f8670;
        InterfaceC2788 interfaceC2788 = z ? (InterfaceC2788) concurrentHashMap2.get(type) : (InterfaceC2788) concurrentHashMap.get(type);
        boolean z2 = false;
        if (interfaceC2788 == null && (type instanceof WildcardType)) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                Type type2 = upperBounds[0];
                interfaceC2788 = (InterfaceC2788) (z ? concurrentHashMap2.get(type2) : concurrentHashMap.get(type2));
            }
        }
        if (interfaceC2788 != null) {
            return interfaceC2788;
        }
        Iterator it = this.f8680.iterator();
        InterfaceC2788 interfaceC2788Mo5529 = null;
        while (it.hasNext()) {
            ((C2779) it.next()).getClass();
            interfaceC2788Mo5529 = C2779.m5615(this, type);
            if (interfaceC2788Mo5529 != null) {
                InterfaceC2788 interfaceC27882 = z ? (InterfaceC2788) concurrentHashMap2.putIfAbsent(type, interfaceC2788Mo5529) : (InterfaceC2788) concurrentHashMap.putIfAbsent(type, interfaceC2788Mo5529);
                return interfaceC27882 != null ? interfaceC27882 : interfaceC2788Mo5529;
            }
        }
        if (type instanceof TypeVariable) {
            Type[] bounds = ((TypeVariable) type).getBounds();
            if (bounds.length > 0) {
                Type type3 = bounds[0];
                if ((type3 instanceof Class) && (interfaceC2788M56332 = m5633(type3, z)) != null) {
                    InterfaceC2788 interfaceC2788M5634 = m5634(z, type, interfaceC2788M56332);
                    return interfaceC2788M5634 != null ? interfaceC2788M5634 : interfaceC2788M56332;
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
                if ((actualTypeArguments.length == 0 || !z2) && (interfaceC2788M5633 = m5633(cls, z)) != null) {
                    InterfaceC2788 interfaceC2788M56342 = m5634(z, type, interfaceC2788M5633);
                    return interfaceC2788M56342 != null ? interfaceC2788M56342 : interfaceC2788M5633;
                }
                if (actualTypeArguments.length == 1 && ArrayList.class.isAssignableFrom(cls)) {
                    return C2698.m5500(cls, type);
                }
                if (actualTypeArguments.length == 2 && Map.class.isAssignableFrom(cls)) {
                    return C2714.m5508(type, cls, 0L);
                }
            }
        }
        Class clsM5942 = AbstractC2867.m5942(type);
        String name = clsM5942.getName();
        if (!z && "com.google.common.collect.ArrayListMultimap".equals(name)) {
            interfaceC2788Mo5529 = C2714.m5508(null, clsM5942, 0L);
        }
        if (interfaceC2788Mo5529 == null) {
            C2776 c2776 = (C2776) AbstractC2933.f9292.get();
            if (c2776 == null) {
                c2776 = this.f8676;
            }
            interfaceC2788Mo5529 = c2776.mo5529(clsM5942, type, z, this);
        }
        InterfaceC2788 interfaceC2788M56343 = m5634(z, type, interfaceC2788Mo5529);
        return interfaceC2788M56343 != null ? interfaceC2788M56343 : interfaceC2788Mo5529;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC2788 m5634(boolean z, Type type, InterfaceC2788 interfaceC2788) {
        return z ? (InterfaceC2788) this.f8670.putIfAbsent(type, interfaceC2788) : (InterfaceC2788) this.f8671.putIfAbsent(type, interfaceC2788);
    }
}
