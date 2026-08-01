package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2713 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C2713 f8248;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Class f8249;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Class f8250;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final Class f8251;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C2713 f8252;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final Class f8253;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Class f8254;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Class f8256;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C2717 f8258;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Function f8259;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f8260;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f8261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f8262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8263;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public volatile boolean f8264;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f8265;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C2699 f8257 = new C2699(9);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Class f8255 = Collections.singletonMap(1, 1).getClass();

    static {
        Map map = Collections.EMPTY_MAP;
        f8256 = map.getClass();
        f8250 = Collections.emptySortedMap().getClass();
        f8249 = Collections.emptyNavigableMap().getClass();
        f8253 = Collections.unmodifiableMap(map).getClass();
        f8254 = Collections.unmodifiableSortedMap(Collections.emptySortedMap()).getClass();
        f8251 = Collections.unmodifiableNavigableMap(Collections.emptyNavigableMap()).getClass();
        f8252 = new C2713(HashMap.class, HashMap.class, 0L, null);
        f8248 = new C2713(JSONObject.class, JSONObject.class, 0L, null);
    }

    public C2713(Class cls, Class cls2, long j, Function function) {
        this.f8263 = cls;
        this.f8262 = AbstractC2859.m5729(AbstractC2866.m5898(cls));
        this.f8261 = cls2;
        this.f8260 = j;
        this.f8259 = function;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0115  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.reader.InterfaceC2787 m5463(java.lang.reflect.Type r18, java.lang.Class r19, long r20) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2713.m5463(java.lang.reflect.Type, java.lang.Class, long):com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世");
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo5454(long j) {
        Class cls = this.f8261;
        if (cls == HashMap.class) {
            return new HashMap();
        }
        if (cls == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (cls == JSONObject.class) {
            return new JSONObject();
        }
        Object obj = this.f8265;
        if (obj != null) {
            return obj;
        }
        if (cls == f8250) {
            return Collections.emptySortedMap();
        }
        if (cls == f8249) {
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
                return AbstractC2853.f8919.allocateInstance(cls);
            } catch (InstantiationException unused) {
                C2941.m6346(cls, "create map error : ");
                return null;
            }
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException unused2) {
            C2941.m6346(cls, "create map error : ");
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) throws IOException {
        boolean z = abstractC2898.f9197;
        C2942 c2942 = abstractC2898.f9199;
        if (z) {
            return mo5422(abstractC2898, type, obj, j);
        }
        if (abstractC2898.mo6087()) {
            return null;
        }
        c2942.getClass();
        Map map = (Map) mo5454(c2942.f9318 | j);
        if (!abstractC2898.mo6133() || abstractC2898.f9178) {
            abstractC2898.mo6074(map, j);
        } else {
            String strMo6139 = abstractC2898.mo6139();
            if (!strMo6139.isEmpty()) {
                AbstractC2898 abstractC2898M6047 = AbstractC2898.m6047(strMo6139, c2942);
                try {
                    abstractC2898M6047.mo6074(map, j);
                    abstractC2898M6047.close();
                } finally {
                }
            }
        }
        abstractC2898.mo6099();
        Function function = this.f8259;
        return function != null ? function.apply(map) : map;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        return this.f8263;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Function mo5458() {
        return this.f8259;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00db A[EDGE_INSN: B:103:0x00db->B:41:0x00db BREAK  A[LOOP:0: B:39:0x00d3->B:97:0x01c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5422(com.alibaba.fastjson2.AbstractC2898 r17, java.lang.reflect.Type r18, java.lang.Object r19, long r20) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2713.mo5422(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5462(Map map, long j) {
        Class cls = this.f8263;
        if (cls.isInstance(map)) {
            return map;
        }
        if (cls == JSONObject.class) {
            return new JSONObject(map);
        }
        Map map2 = (Map) mo5454(j);
        map2.putAll(map);
        Function function = this.f8259;
        return function != null ? function.apply(map2) : map2;
    }

    public C2713(long j, Class cls, Object obj) {
        this(cls, cls, j, null);
        this.f8265 = obj;
    }
}
