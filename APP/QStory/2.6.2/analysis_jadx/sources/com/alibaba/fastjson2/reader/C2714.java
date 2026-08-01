package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2921;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.alibaba.fastjson2.util.C2828;
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
import p144.C7546;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2714 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Class f8266;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Type f8267;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Type f8268;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8269;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8270;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Function f8271;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long f8272;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC2787 f8273;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public InterfaceC2787 f8274;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f8275;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Constructor f8276;

    public C2714(Class cls, Class cls2, Type type, Type type2, long j, Function function) {
        Constructor<?> constructor = null;
        type = type == Object.class ? null : type;
        this.f8270 = cls;
        this.f8269 = cls2;
        this.f8268 = type;
        this.f8267 = type2;
        this.f8266 = AbstractC2866.m5899(type2);
        this.f8272 = j;
        this.f8271 = function;
        int i = 0;
        this.f8275 = cls2 != null && "org.springframework.util.LinkedMultiValueMap".equals(cls2.getName());
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
        this.f8276 = constructor;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo5454(long j) {
        Class cls = this.f8269;
        if (cls == null || cls.isInterface()) {
            return new HashMap();
        }
        try {
            Constructor constructor = this.f8276;
            return constructor != null ? constructor.newInstance(null) : cls.newInstance();
        } catch (Exception e) {
            C0276.m842("create map error", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0257  */
    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo5418(com.alibaba.fastjson2.AbstractC2898 r19, java.lang.reflect.Type r20, java.lang.Object r21, long r22) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2714.mo5418(com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, java.lang.reflect.Type, java.lang.Object, long):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        return this.f8270;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        long j2;
        Function functionMo5458;
        InterfaceC2787 interfaceC2787Mo6118;
        Type type2;
        Object objMo6080;
        Object obj2;
        Object objMo5422;
        byte bMo6138 = abstractC2898.mo6138();
        Function function = this.f8271;
        if (bMo6138 == -110) {
            interfaceC2787Mo6118 = abstractC2898.mo6118(0L, this.f8272 | j, this.f8270);
            if (interfaceC2787Mo6118 == null || interfaceC2787Mo6118 == this) {
                j2 = j;
                functionMo5458 = function;
            } else {
                functionMo5458 = interfaceC2787Mo6118.mo5458();
                if (!(interfaceC2787Mo6118 instanceof C2713) && !(interfaceC2787Mo6118 instanceof C2714)) {
                    return interfaceC2787Mo6118.mo5422(abstractC2898, type, obj, j);
                }
                j2 = j;
            }
        } else {
            j2 = j;
            functionMo5458 = function;
            interfaceC2787Mo6118 = null;
        }
        byte bMo61382 = abstractC2898.mo6138();
        if (bMo61382 == -81) {
            abstractC2898.mo6127();
            return null;
        }
        if (bMo61382 == -90) {
            abstractC2898.mo6127();
        }
        long j3 = j2 | abstractC2898.f9199.f9318;
        Map map = interfaceC2787Mo6118 != null ? (Map) interfaceC2787Mo6118.mo5454(j3) : this.f8269 == HashMap.class ? new HashMap() : (Map) mo5454(j2);
        while (true) {
            byte bMo61383 = abstractC2898.mo6138();
            type2 = this.f8268;
            if (bMo61383 == -91) {
                break;
            }
            if (type2 == String.class || abstractC2898.mo6133()) {
                objMo6080 = abstractC2898.mo6080();
            } else if (abstractC2898.mo6134()) {
                String strMo6144 = abstractC2898.mo6144();
                objMo6080 = new C2828();
                abstractC2898.m6107(map, objMo6080, AbstractC2921.m6320(strMo6144));
            } else {
                if (this.f8274 == null && type2 != null) {
                    this.f8274 = abstractC2898.m6056(type2);
                }
                InterfaceC2787 interfaceC2787 = this.f8274;
                objMo6080 = interfaceC2787 == null ? abstractC2898.mo6078() : interfaceC2787.mo5422(abstractC2898, null, null, j2);
            }
            Object obj3 = objMo6080;
            if (abstractC2898.mo6134()) {
                String strMo61442 = abstractC2898.mo6144();
                if ("..".equals(strMo61442)) {
                    map.put(obj3, map);
                } else {
                    abstractC2898.m6107(map, obj3, AbstractC2921.m6320(strMo61442));
                    if (!(map instanceof ConcurrentMap)) {
                        map.put(obj3, null);
                    }
                }
            } else if (abstractC2898.mo6087()) {
                map.put(obj3, null);
            } else {
                Type type3 = this.f8267;
                if (type3 == Object.class) {
                    objMo5422 = abstractC2898.mo6078();
                    obj2 = obj3;
                } else {
                    InterfaceC2787 interfaceC2787Mo61182 = abstractC2898.mo6118(0L, j, this.f8266);
                    if (interfaceC2787Mo61182 == null || interfaceC2787Mo61182 == this) {
                        obj2 = obj3;
                        if (this.f8273 == null) {
                            this.f8273 = abstractC2898.m6056(type3);
                        }
                        objMo5422 = this.f8273.mo5422(abstractC2898, this.f8267, obj2, j);
                    } else {
                        obj2 = obj3;
                        objMo5422 = interfaceC2787Mo61182.mo5422(abstractC2898, this.f8267, obj2, j);
                    }
                }
                if (objMo5422 != null || (JSONReader$Feature.IgnoreNullPropertyValue.mask & j3) == 0) {
                    map.put(obj2, objMo5422);
                }
            }
            j2 = j;
        }
        abstractC2898.mo6127();
        return functionMo5458 != null ? (functionMo5458 == C2713.f8257 && map.isEmpty()) ? new EnumMap((Class) type2) : functionMo5458.apply(map) : map;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo5462(Map map, long j) {
        C2801 c2801M6329 = AbstractC2932.m6329();
        Class cls = this.f8269;
        Map map2 = (cls == Map.class || cls == HashMap.class) ? new HashMap() : (Map) mo5454(j);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Type type = this.f8268;
            Object string = (type == null || type == String.class) ? key.toString() : AbstractC2866.m5880(key, type);
            if (value != null) {
                Class<?> cls2 = value.getClass();
                Type type2 = this.f8267;
                if (type2 == Object.class) {
                    continue;
                } else if (cls2 == JSONObject.class || cls2 == AbstractC2866.f9049) {
                    if (this.f8273 == null) {
                        this.f8273 = c2801M6329.m5588(type2, false);
                    }
                    value = this.f8273.mo5462((Map) value, j);
                } else if ((cls2 == JSONArray.class || cls2 == AbstractC2866.f9048) && this.f8266 == List.class) {
                    if (this.f8273 == null) {
                        this.f8273 = c2801M6329.m5588(type2, false);
                    }
                    value = this.f8273.mo5424((List) value, j);
                } else {
                    Function functionM5586 = c2801M6329.m5586(cls2, type2);
                    if (functionM5586 != null) {
                        value = functionM5586.apply(value);
                    } else if (value instanceof Map) {
                        if (this.f8273 == null) {
                            this.f8273 = c2801M6329.m5588(type2, false);
                        }
                        value = this.f8273.mo5462((Map) value, j);
                    } else if ((value instanceof Collection) && !this.f8275) {
                        if (this.f8273 == null) {
                            this.f8273 = c2801M6329.m5588(type2, false);
                        }
                        value = this.f8273.mo5424((Collection) value, j);
                    } else if (!cls2.isInstance(value)) {
                        C7546.m12742("can not convert from ", cls2, " to ", type2);
                        return null;
                    }
                }
            }
            map2.put(string, value);
        }
        Function function = this.f8271;
        return function != null ? function.apply(map2) : map2;
    }
}
