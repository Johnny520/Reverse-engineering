package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2714 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C2714 f8250;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Class f8251;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Class f8252;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final Class f8253;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C2714 f8254;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final Class f8255;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Class f8256;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Class f8258;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C2718 f8260;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Function f8261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f8262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f8263;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f8264;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8265;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public volatile boolean f8266;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f8267;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C2700 f8259 = new C2700(9);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Class f8257 = Collections.singletonMap(1, 1).getClass();

    static {
        Map map = Collections.EMPTY_MAP;
        f8258 = map.getClass();
        f8252 = Collections.emptySortedMap().getClass();
        f8251 = Collections.emptyNavigableMap().getClass();
        f8255 = Collections.unmodifiableMap(map).getClass();
        f8256 = Collections.unmodifiableSortedMap(Collections.emptySortedMap()).getClass();
        f8253 = Collections.unmodifiableNavigableMap(Collections.emptyNavigableMap()).getClass();
        f8254 = new C2714(HashMap.class, HashMap.class, 0L, null);
        f8250 = new C2714(JSONObject.class, JSONObject.class, 0L, null);
    }

    public C2714(Class cls, Class cls2, long j, Function function) {
        this.f8265 = cls;
        this.f8264 = AbstractC2860.m5774(AbstractC2867.m5943(cls));
        this.f8263 = cls2;
        this.f8262 = j;
        this.f8261 = function;
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
    public static com.alibaba.fastjson2.reader.InterfaceC2788 m5508(java.lang.reflect.Type r18, java.lang.Class r19, long r20) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2714.m5508(java.lang.reflect.Type, java.lang.Class, long):com.alibaba.fastjson2.reader.飘花落叶言子苏楪兰哲世");
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo5499(long j) {
        Class cls = this.f8263;
        if (cls == HashMap.class) {
            return new HashMap();
        }
        if (cls == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (cls == JSONObject.class) {
            return new JSONObject();
        }
        Object obj = this.f8267;
        if (obj != null) {
            return obj;
        }
        if (cls == f8252) {
            return Collections.emptySortedMap();
        }
        if (cls == f8251) {
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
                return AbstractC2854.f8921.allocateInstance(cls);
            } catch (InstantiationException unused) {
                C2942.m6404(cls, "create map error : ");
                return null;
            }
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException unused2) {
            C2942.m6404(cls, "create map error : ");
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) throws IOException {
        boolean z = abstractC2899.f9199;
        C2943 c2943 = abstractC2899.f9201;
        if (z) {
            return mo5467(abstractC2899, type, obj, j);
        }
        if (abstractC2899.mo6133()) {
            return null;
        }
        c2943.getClass();
        Map map = (Map) mo5499(c2943.f9320 | j);
        if (!abstractC2899.mo6179() || abstractC2899.f9180) {
            abstractC2899.mo6120(map, j);
        } else {
            String strMo6184 = abstractC2899.mo6184();
            if (!strMo6184.isEmpty()) {
                AbstractC2899 abstractC2899M6092 = AbstractC2899.m6092(strMo6184, c2943);
                try {
                    abstractC2899M6092.mo6120(map, j);
                    abstractC2899M6092.close();
                } finally {
                }
            }
        }
        abstractC2899.mo6145();
        Function function = this.f8261;
        return function != null ? function.apply(map) : map;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        return this.f8265;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final Function mo5503() {
        return this.f8261;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00db A[EDGE_INSN: B:103:0x00db->B:41:0x00db BREAK  A[LOOP:0: B:39:0x00d3->B:97:0x01c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5467(com.alibaba.fastjson2.AbstractC2899 r17, java.lang.reflect.Type r18, java.lang.Object r19, long r20) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2714.mo5467(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5507(Map map, long j) {
        Class cls = this.f8265;
        if (cls.isInstance(map)) {
            return map;
        }
        if (cls == JSONObject.class) {
            return new JSONObject(map);
        }
        Map map2 = (Map) mo5499(j);
        map2.putAll(map);
        Function function = this.f8261;
        return function != null ? function.apply(map2) : map2;
    }

    public C2714(long j, Class cls, Object obj) {
        this(cls, cls, j, null);
        this.f8267 = obj;
    }
}
