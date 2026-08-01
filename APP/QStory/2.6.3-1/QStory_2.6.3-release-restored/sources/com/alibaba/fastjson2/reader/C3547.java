package com.alibaba.fastjson2.reader;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3755;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.alibaba.fastjson2.util.C3662;
import com.alibaba.fastjson2.util.C3683;
import com.alibaba.fastjson2.util.C3690;
import com.alibaba.fastjson2.util.JSONObject1O;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.Function;
import java.util.function.Supplier;
import p309.AbstractC9396;
import p352.C9620;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3547 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C3547 f8595;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Class f8596;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Class f8597;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final Class f8598;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C3547 f8599;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final Class f8600;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Class f8601;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Class f8603;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C3551 f8605;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Function f8606;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f8607;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f8608;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f8609;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8610;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public volatile boolean f8611;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f8612;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C3533 f8604 = new C3533(9);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Class f8602 = Collections.singletonMap(1, 1).getClass();

    static {
        Map map = Collections.EMPTY_MAP;
        f8603 = map.getClass();
        f8597 = Collections.emptySortedMap().getClass();
        f8596 = Collections.emptyNavigableMap().getClass();
        f8600 = Collections.unmodifiableMap(map).getClass();
        f8601 = Collections.unmodifiableSortedMap(Collections.emptySortedMap()).getClass();
        f8598 = Collections.unmodifiableNavigableMap(Collections.emptyNavigableMap()).getClass();
        f8599 = new C3547(HashMap.class, HashMap.class, 0L, null);
        f8595 = new C3547(JSONObject.class, JSONObject.class, 0L, null);
    }

    public C3547(Class cls, Class cls2, long j, Function function) {
        this.f8610 = cls;
        this.f8609 = AbstractC3693.m6334(AbstractC3700.m6503(cls));
        this.f8608 = cls2;
        this.f8607 = j;
        this.f8606 = function;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0115  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC3621 m6068(Type type, Class cls, long j) {
        Type genericSuperclass;
        Class superclass;
        Class cls2;
        Function c3533;
        char c;
        Type type2;
        String name;
        long j2;
        C3683 c3683;
        Function c3690;
        Function function;
        Function c35332;
        Method method;
        Function function2;
        if (cls.getSimpleName().isEmpty()) {
            superclass = cls.getSuperclass();
            genericSuperclass = type == null ? cls.getGenericSuperclass() : type;
        } else {
            genericSuperclass = type;
            superclass = cls;
        }
        if (cls == Map.class || cls == AbstractMap.class || cls == f8602) {
            cls2 = HashMap.class;
        } else {
            if (cls != f8600) {
                cls2 = TreeMap.class;
                if (cls != SortedMap.class && cls != f8601 && cls != f8598) {
                    if (cls == ConcurrentMap.class) {
                        superclass = ConcurrentHashMap.class;
                    } else if (cls == ConcurrentNavigableMap.class) {
                        superclass = ConcurrentSkipListMap.class;
                    } else {
                        String typeName = cls.getTypeName();
                        typeName.getClass();
                        if (typeName.equals("java.util.Collections$SynchronizedSortedMap")) {
                            c3533 = new C3533(4);
                        } else {
                            if (typeName.equals("com.google.common.collect.SingletonImmutableBiMap")) {
                                c3533 = new C3683(3);
                            } else if (typeName.equals("java.util.Collections$SynchronizedMap")) {
                                c3533 = new C3533(2);
                            } else if (typeName.equals("java.util.Collections$SynchronizedNavigableMap")) {
                                c3533 = new C3533(3);
                            } else if (typeName.equals("com.google.common.collect.ImmutableMap") || typeName.equals("com.google.common.collect.RegularImmutableMap")) {
                                c3533 = new C3683(2);
                            }
                            cls2 = HashMap.class;
                        }
                    }
                    cls2 = superclass;
                }
                if (genericSuperclass instanceof ParameterizedType) {
                    c = 0;
                } else {
                    Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                    c = 0;
                    if (actualTypeArguments.length == 2) {
                        Type type3 = actualTypeArguments[0];
                        Type type4 = actualTypeArguments[1];
                        "org.springframework.util.LinkedMultiValueMap".equals(cls2.getName());
                        return (type3 == String.class && type4 == String.class && c3533 == null) ? new C3549(cls, cls2, j) : new C3548(cls, cls2, type3, type4, 0L, c3533);
                    }
                }
                Function function3 = c3533;
                type2 = genericSuperclass;
                Class cls3 = cls2;
                if (type2 == null && j == 0) {
                    if (cls != HashMap.class && cls3 == HashMap.class) {
                        return f8599;
                    }
                    if (cls == JSONObject.class && cls3 == JSONObject.class) {
                        return f8595;
                    }
                }
                name = cls3.getName();
                if (name.equals("com.google.common.collect.SingletonImmutableBiMap")) {
                    if (name.equals("com.alibaba.fastjson.JSONObject")) {
                        j2 = j;
                        C3551 c3551 = f8605;
                        c35332 = c3551;
                        if (c3551 == null) {
                            C3551 c35512 = new C3551(cls3);
                            f8605 = c35512;
                            c35332 = c35512;
                        }
                    } else {
                        if (name.equals("java.util.Collections$EmptyMap")) {
                            return new C3547(j, cls3, Collections.EMPTY_MAP);
                        }
                        if (name.equals("com.google.common.collect.ArrayListMultimap")) {
                            j2 = j;
                            if ("com.google.common.collect.ArrayListMultimap".equals(cls3.getName())) {
                                if (AbstractC3693.f9337 == null) {
                                    AbstractC3693.f9337 = cls3;
                                }
                                if (!AbstractC3693.f9325 && AbstractC3693.f9332 == null) {
                                    try {
                                        AbstractC3693.f9332 = AbstractC9396.m14704(AbstractC3693.f9337.getMethod("create", null));
                                    } catch (Throwable unused) {
                                        AbstractC3693.f9325 = true;
                                    }
                                }
                                if (!AbstractC3693.f9325 && AbstractC3693.f9333 == null) {
                                    try {
                                        AbstractC3693.f9333 = AbstractC3693.f9337.getMethod("putAll", Object.class, Iterable.class);
                                    } catch (Throwable unused2) {
                                        AbstractC3693.f9325 = true;
                                    }
                                }
                                Supplier supplier = AbstractC3693.f9332;
                                if (supplier != null && (method = AbstractC3693.f9333) != null) {
                                    c3690 = new C3690(supplier, method);
                                    cls3 = HashMap.class;
                                    function = c3690;
                                    return new C3547(cls, cls3, j2, function);
                                }
                            }
                            C1123.m1410(AbstractC0900.m714(cls3, "create map error : "));
                            return null;
                        }
                        if (name.equals("kotlin.collections.EmptyMap")) {
                            try {
                                Field field = cls3.getField("INSTANCE");
                                if (!field.isAccessible()) {
                                    field.setAccessible(true);
                                }
                                return new C3547(j, cls3, field.get(null));
                            } catch (IllegalAccessException e) {
                                e = e;
                                C9620.m15032(AbstractC0900.m714(cls3, "Failed to get singleton of "), e);
                                return null;
                            } catch (NoSuchFieldException e2) {
                                e = e2;
                                C9620.m15032(AbstractC0900.m714(cls3, "Failed to get singleton of "), e);
                                return null;
                            }
                        }
                        if (!name.equals("com.google.common.collect.RegularImmutableMap")) {
                            Type genericSuperclass2 = cls3.getGenericSuperclass();
                            if (cls != JSONObject.class && (genericSuperclass2 instanceof ParameterizedType)) {
                                Type[] actualTypeArguments2 = ((ParameterizedType) genericSuperclass2).getActualTypeArguments();
                                if (actualTypeArguments2.length == 2) {
                                    Type type5 = actualTypeArguments2[c];
                                    Type type6 = actualTypeArguments2[1];
                                    if (!(type5 instanceof TypeVariable) && !(type6 instanceof TypeVariable)) {
                                        return new C3548(cls, cls3, type5, type6, 0L, function3);
                                    }
                                }
                            }
                            j2 = j;
                            if (cls3 == JSONObject1O.class) {
                                Class cls4 = AbstractC3700.f9396;
                                C3551 c35513 = f8605;
                                if (c35513 == null) {
                                    c35513 = new C3551(cls4);
                                    f8605 = c35513;
                                }
                                function2 = c35513;
                            } else if (cls == f8600) {
                                c35332 = new C3533(5);
                            } else if (cls == f8601) {
                                c35332 = new C3533(6);
                            } else if (cls == f8598) {
                                c35332 = new C3533(7);
                            } else if (cls == f8602) {
                                c35332 = new C3533(8);
                            } else {
                                if (cls != EnumMap.class) {
                                    function = function3;
                                    return new C3547(cls, cls3, j2, function);
                                }
                                function2 = f8604;
                            }
                            function = function2;
                            cls3 = LinkedHashMap.class;
                            return new C3547(cls, cls3, j2, function);
                        }
                        j2 = j;
                        c3683 = new C3683(2);
                    }
                    function = c35332;
                    return new C3547(cls, cls3, j2, function);
                }
                j2 = j;
                c3683 = new C3683(3);
                c3690 = c3683;
                cls3 = HashMap.class;
                function = c3690;
                return new C3547(cls, cls3, j2, function);
            }
            cls2 = LinkedHashMap.class;
        }
        c3533 = null;
        if (genericSuperclass instanceof ParameterizedType) {
        }
        Function function32 = c3533;
        type2 = genericSuperclass;
        Class cls32 = cls2;
        if (type2 == null) {
            if (cls != HashMap.class) {
            }
            if (cls == JSONObject.class) {
                return f8595;
            }
        }
        name = cls32.getName();
        if (name.equals("com.google.common.collect.SingletonImmutableBiMap")) {
        }
        c3690 = c3683;
        cls32 = HashMap.class;
        function = c3690;
        return new C3547(cls, cls32, j2, function);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo6059(long j) {
        Class cls = this.f8608;
        if (cls == HashMap.class) {
            return new HashMap();
        }
        if (cls == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (cls == JSONObject.class) {
            return new JSONObject();
        }
        Object obj = this.f8612;
        if (obj != null) {
            return obj;
        }
        if (cls == f8597) {
            return Collections.emptySortedMap();
        }
        if (cls == f8596) {
            return Collections.emptyNavigableMap();
        }
        String name = cls.getName();
        if (name.equals("java.util.ImmutableCollections$Map1")) {
            return new HashMap();
        }
        if (name.equals("java.util.ImmutableCollections$MapN")) {
            return new LinkedHashMap();
        }
        if (name.equals("com.ali.com.google.common.collect.EmptyImmutableBiMap")) {
            try {
                return AbstractC3687.f9266.allocateInstance(cls);
            } catch (InstantiationException unused) {
                C3775.m6964(cls, "create map error : ");
                return null;
            }
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException unused2) {
            C3775.m6964(cls, "create map error : ");
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) throws IOException {
        boolean z = abstractC3732.f9544;
        C3776 c3776 = abstractC3732.f9546;
        if (z) {
            return mo6027(abstractC3732, type, obj, j);
        }
        if (abstractC3732.mo6693()) {
            return null;
        }
        c3776.getClass();
        Map map = (Map) mo6059(c3776.f9665 | j);
        if (!abstractC3732.mo6739() || abstractC3732.f9525) {
            abstractC3732.mo6680(map, j);
        } else {
            String strMo6744 = abstractC3732.mo6744();
            if (!strMo6744.isEmpty()) {
                AbstractC3732 abstractC3732M6652 = AbstractC3732.m6652(strMo6744, c3776);
                try {
                    abstractC3732M6652.mo6680(map, j);
                    abstractC3732M6652.close();
                } finally {
                }
            }
        }
        abstractC3732.mo6705();
        Function function = this.f8606;
        return function != null ? function.apply(map) : map;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo6058() {
        return this.f8610;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Function mo6063() {
        return this.f8606;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00db A[EDGE_INSN: B:103:0x00db->B:41:0x00db BREAK  A[LOOP:0: B:39:0x00d3->B:97:0x01c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        JSONException jSONException;
        Map map;
        Map map2;
        Map jSONObject;
        byte bMo6743;
        Object objMo6684;
        Object obj2;
        AbstractC3732 abstractC37322;
        Object obj3;
        Object objMo6754;
        Object objMo66842;
        InterfaceC3621 interfaceC3621Mo6724 = abstractC3732.mo6724(this.f8609, this.f8607 | j, this.f8610);
        if (interfaceC3621Mo6724 != null && interfaceC3621Mo6724 != this) {
            return interfaceC3621Mo6724.mo6027(abstractC3732, type, obj, j);
        }
        AbstractC3732 abstractC37323 = abstractC3732;
        long j2 = j;
        if (abstractC37323.mo6693()) {
            return null;
        }
        abstractC37323.mo6703((byte) -90);
        abstractC37323.f9546.getClass();
        long jM6717 = j2 | abstractC37323.m6717(j2);
        Class cls = this.f8608;
        if (cls == HashMap.class) {
            jSONObject = new HashMap();
        } else if (cls == LinkedHashMap.class) {
            jSONObject = new LinkedHashMap();
        } else if (cls == JSONObject.class) {
            jSONObject = new JSONObject();
        } else {
            if (cls != f8603) {
                if (this.f8611) {
                    jSONException = null;
                    map = null;
                } else {
                    try {
                        map = (Map) this.f8608.newInstance();
                        jSONException = null;
                    } catch (IllegalAccessException | InstantiationException unused) {
                        this.f8611 = true;
                        jSONException = new JSONException(abstractC37323.mo6730("create map error " + this.f8608));
                        map = null;
                    }
                }
                if (this.f8611 && Map.class.isAssignableFrom(this.f8608.getSuperclass())) {
                    try {
                        map = (Map) this.f8608.getSuperclass().newInstance();
                        jSONException = null;
                    } catch (IllegalAccessException | InstantiationException unused2) {
                        if (jSONException == null) {
                            jSONException = new JSONException(abstractC37323.mo6730("create map error " + this.f8608));
                        }
                    }
                }
                if (jSONException != null) {
                    throw jSONException;
                }
                map2 = map;
                while (true) {
                    bMo6743 = abstractC37323.mo6743();
                    if (bMo6743 != -91) {
                        break;
                    }
                    if (bMo6743 >= 73) {
                        objMo6684 = abstractC37323.mo6686();
                    } else if (abstractC37323.mo6703((byte) -109)) {
                        String strMo6744 = abstractC37323.mo6744();
                        C3662 c3662 = new C3662();
                        abstractC37323.m6713(map2, c3662, AbstractC3755.m6938(strMo6744));
                        obj2 = c3662;
                        if (abstractC37323.mo6740()) {
                            byte bMo67432 = abstractC37323.mo6743();
                            if (bMo67432 >= 73 && bMo67432 <= 125) {
                                objMo6754 = abstractC37323.mo6744();
                                abstractC37322 = abstractC37323;
                                obj3 = obj2;
                            } else if (bMo67432 == -110) {
                                InterfaceC3621 interfaceC3621Mo67242 = abstractC37323.mo6724(0L, this.f8607 | j2, Object.class);
                                if (interfaceC3621Mo67242 != null) {
                                    Object obj4 = obj2;
                                    objMo66842 = interfaceC3621Mo67242.mo6027(abstractC3732, null, obj4, j2);
                                    obj3 = obj4;
                                    abstractC37322 = abstractC3732;
                                } else {
                                    abstractC37322 = abstractC3732;
                                    obj3 = obj2;
                                    objMo66842 = abstractC37322.mo6684();
                                }
                                objMo6754 = objMo66842;
                            } else {
                                abstractC37322 = abstractC37323;
                                obj3 = obj2;
                                if (bMo67432 == -79) {
                                    objMo6754 = Boolean.TRUE;
                                    abstractC37322.mo6733();
                                } else if (bMo67432 == -80) {
                                    objMo6754 = Boolean.FALSE;
                                    abstractC37322.mo6733();
                                } else if (bMo67432 == -109) {
                                    String strMo6749 = abstractC37322.mo6749();
                                    if ("..".equals(strMo6749)) {
                                        objMo6754 = map2;
                                    } else {
                                        abstractC37322.m6713(map2, obj3, AbstractC3755.m6938(strMo6749));
                                        objMo6754 = null;
                                    }
                                } else {
                                    objMo6754 = bMo67432 == -90 ? abstractC37322.mo6754() : (bMo67432 < -108 || bMo67432 > -92) ? abstractC37322.mo6684() : abstractC37322.mo6685();
                                }
                            }
                            if (objMo6754 != null || (JSONReader$Feature.IgnoreNullPropertyValue.mask & jM6717) == 0) {
                                map2.put(obj3, objMo6754);
                            }
                        } else {
                            String strMo67492 = abstractC37323.mo6749();
                            if ("..".equals(strMo67492)) {
                                map2.put(obj2, map2);
                            } else {
                                abstractC37323.m6713(map2, obj2, AbstractC3755.m6938(strMo67492));
                                map2.put(obj2, null);
                            }
                            abstractC37322 = abstractC37323;
                        }
                        j2 = j;
                        abstractC37323 = abstractC37322;
                    } else {
                        objMo6684 = abstractC37323.mo6684();
                    }
                    obj2 = objMo6684;
                    if (abstractC37323.mo6740()) {
                    }
                    j2 = j;
                    abstractC37323 = abstractC37322;
                }
                abstractC37323.mo6733();
                Function function = this.f8606;
                return function == null ? function.apply(map2) : map2;
            }
            jSONObject = Collections.EMPTY_MAP;
        }
        map2 = jSONObject;
        while (true) {
            bMo6743 = abstractC37323.mo6743();
            if (bMo6743 != -91) {
            }
            j2 = j;
            abstractC37323 = abstractC37322;
        }
        abstractC37323.mo6733();
        Function function2 = this.f8606;
        if (function2 == null) {
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo6067(Map map, long j) {
        Class cls = this.f8610;
        if (cls.isInstance(map)) {
            return map;
        }
        if (cls == JSONObject.class) {
            return new JSONObject(map);
        }
        Map map2 = (Map) mo6059(j);
        map2.putAll(map);
        Function function = this.f8606;
        return function != null ? function.apply(map2) : map2;
    }

    public C3547(long j, Class cls, Object obj) {
        this(cls, cls, j, null);
        this.f8612 = obj;
    }
}
