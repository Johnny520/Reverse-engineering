package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2922;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2867;
import com.alibaba.fastjson2.util.C2829;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import p144.C7547;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2715 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Class f8268;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Type f8269;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Type f8270;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8271;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8272;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Function f8273;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f8274;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC2788 f8275;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public InterfaceC2788 f8276;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f8277;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Constructor f8278;

    public C2715(Class cls, Class cls2, Type type, Type type2, long j, Function function) {
        Constructor<?> constructor = null;
        type = type == Object.class ? null : type;
        this.f8272 = cls;
        this.f8271 = cls2;
        this.f8270 = type;
        this.f8269 = type2;
        this.f8268 = AbstractC2867.m5944(type2);
        this.f8274 = j;
        this.f8273 = function;
        int i = 0;
        this.f8277 = cls2 != null && "org.springframework.util.LinkedMultiValueMap".equals(cls2.getName());
        Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
        int length = declaredConstructors.length;
        while (true) {
            if (i >= length) {
                break;
            }
            Constructor<?> constructor2 = declaredConstructors[i];
            if (constructor2.getParameterCount() == 0 && !Modifier.isPublic(constructor2.getModifiers())) {
                constructor2.setAccessible(true);
                constructor = constructor2;
                break;
            }
            i++;
        }
        this.f8278 = constructor;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo5499(long j) {
        Class cls = this.f8271;
        if (cls == null || cls.isInterface()) {
            return new HashMap();
        }
        try {
            Constructor constructor = this.f8278;
            return constructor != null ? constructor.newInstance(null) : cls.newInstance();
        } catch (Exception e) {
            C0276.m843("create map error", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0257  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo5463(com.alibaba.fastjson2.AbstractC2899 r19, java.lang.reflect.Type r20, java.lang.Object r21, long r22) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2715.mo5463(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        return this.f8272;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        long j2;
        Function functionMo5503;
        InterfaceC2788 interfaceC2788Mo6164;
        Type type2;
        Object objMo6126;
        Object obj2;
        Object objMo5467;
        byte bMo6183 = abstractC2899.mo6183();
        Function function = this.f8273;
        if (bMo6183 == -110) {
            interfaceC2788Mo6164 = abstractC2899.mo6164(0L, this.f8274 | j, this.f8272);
            if (interfaceC2788Mo6164 == null || interfaceC2788Mo6164 == this) {
                j2 = j;
                functionMo5503 = function;
            } else {
                functionMo5503 = interfaceC2788Mo6164.mo5503();
                if (!(interfaceC2788Mo6164 instanceof C2714) && !(interfaceC2788Mo6164 instanceof C2715)) {
                    return interfaceC2788Mo6164.mo5467(abstractC2899, type, obj, j);
                }
                j2 = j;
            }
        } else {
            j2 = j;
            functionMo5503 = function;
            interfaceC2788Mo6164 = null;
        }
        byte bMo61832 = abstractC2899.mo6183();
        if (bMo61832 == -81) {
            abstractC2899.mo6173();
            return null;
        }
        if (bMo61832 == -90) {
            abstractC2899.mo6173();
        }
        long j3 = j2 | abstractC2899.f9201.f9320;
        Map map = interfaceC2788Mo6164 != null ? (Map) interfaceC2788Mo6164.mo5499(j3) : this.f8271 == HashMap.class ? new HashMap() : (Map) mo5499(j2);
        while (true) {
            byte bMo61833 = abstractC2899.mo6183();
            type2 = this.f8270;
            if (bMo61833 == -91) {
                break;
            }
            if (type2 == String.class || abstractC2899.mo6179()) {
                objMo6126 = abstractC2899.mo6126();
            } else if (abstractC2899.mo6180()) {
                String strMo6189 = abstractC2899.mo6189();
                objMo6126 = new C2829();
                abstractC2899.m6153(map, objMo6126, AbstractC2922.m6378(strMo6189));
            } else {
                if (this.f8276 == null && type2 != null) {
                    this.f8276 = abstractC2899.m6102(type2);
                }
                InterfaceC2788 interfaceC2788 = this.f8276;
                objMo6126 = interfaceC2788 == null ? abstractC2899.mo6124() : interfaceC2788.mo5467(abstractC2899, null, null, j2);
            }
            Object obj3 = objMo6126;
            if (abstractC2899.mo6180()) {
                String strMo61892 = abstractC2899.mo6189();
                if ("..".equals(strMo61892)) {
                    map.put(obj3, map);
                } else {
                    abstractC2899.m6153(map, obj3, AbstractC2922.m6378(strMo61892));
                    if (!(map instanceof ConcurrentMap)) {
                        map.put(obj3, null);
                    }
                }
            } else if (abstractC2899.mo6133()) {
                map.put(obj3, null);
            } else {
                Type type3 = this.f8269;
                if (type3 == Object.class) {
                    objMo5467 = abstractC2899.mo6124();
                    obj2 = obj3;
                } else {
                    InterfaceC2788 interfaceC2788Mo61642 = abstractC2899.mo6164(0L, j, this.f8268);
                    if (interfaceC2788Mo61642 == null || interfaceC2788Mo61642 == this) {
                        obj2 = obj3;
                        if (this.f8275 == null) {
                            this.f8275 = abstractC2899.m6102(type3);
                        }
                        objMo5467 = this.f8275.mo5467(abstractC2899, this.f8269, obj2, j);
                    } else {
                        obj2 = obj3;
                        objMo5467 = interfaceC2788Mo61642.mo5467(abstractC2899, this.f8269, obj2, j);
                    }
                }
                if (objMo5467 != null || (JSONReader$Feature.IgnoreNullPropertyValue.mask & j3) == 0) {
                    map.put(obj2, objMo5467);
                }
            }
            j2 = j;
        }
        abstractC2899.mo6173();
        return functionMo5503 != null ? (functionMo5503 == C2714.f8259 && map.isEmpty()) ? new EnumMap((Class) type2) : functionMo5503.apply(map) : map;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5507(Map map, long j) {
        C2802 c2802M6387 = AbstractC2933.m6387();
        Class cls = this.f8271;
        Map map2 = (cls == Map.class || cls == HashMap.class) ? new HashMap() : (Map) mo5499(j);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Type type = this.f8270;
            Object string = (type == null || type == String.class) ? key.toString() : AbstractC2867.m5925(key, type);
            if (value != null) {
                Class<?> cls2 = value.getClass();
                Type type2 = this.f8269;
                if (type2 == Object.class) {
                    continue;
                } else if (cls2 == JSONObject.class || cls2 == AbstractC2867.f9051) {
                    if (this.f8275 == null) {
                        this.f8275 = c2802M6387.m5633(type2, false);
                    }
                    value = this.f8275.mo5507((Map) value, j);
                } else if ((cls2 == JSONArray.class || cls2 == AbstractC2867.f9050) && this.f8268 == List.class) {
                    if (this.f8275 == null) {
                        this.f8275 = c2802M6387.m5633(type2, false);
                    }
                    value = this.f8275.mo5469((List) value, j);
                } else {
                    Function functionM5631 = c2802M6387.m5631(cls2, type2);
                    if (functionM5631 != null) {
                        value = functionM5631.apply(value);
                    } else if (value instanceof Map) {
                        if (this.f8275 == null) {
                            this.f8275 = c2802M6387.m5633(type2, false);
                        }
                        value = this.f8275.mo5507((Map) value, j);
                    } else if ((value instanceof Collection) && !this.f8277) {
                        if (this.f8275 == null) {
                            this.f8275 = c2802M6387.m5633(type2, false);
                        }
                        value = this.f8275.mo5469((Collection) value, j);
                    } else if (!cls2.isInstance(value)) {
                        C7547.m12771("can not convert from ", cls2, " to ", type2);
                        return null;
                    }
                }
            }
            map2.put(string, value);
        }
        Function function = this.f8273;
        return function != null ? function.apply(map2) : map2;
    }
}
