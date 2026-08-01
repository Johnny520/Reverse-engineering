package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2921;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.C2899;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2676 extends AbstractC2796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f8108;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f8109;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f8110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8111;

    public C2676(Class cls) {
        super(cls);
        Class<?> componentType = cls.getComponentType();
        this.f8111 = componentType;
        String strM5898 = AbstractC2866.m5898(componentType);
        this.f8109 = AbstractC2859.m5729(strM5898);
        this.f8108 = AbstractC2859.m5729("[".concat(strM5898));
        this.f8110 = AbstractC2866.m5899(componentType);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (abstractC2898.f9197) {
            return mo5422(abstractC2898, type, obj, 0L);
        }
        if (!abstractC2898.mo6073()) {
            if (!abstractC2898.mo6095()) {
                if (abstractC2898.f9191 == '{') {
                    abstractC2898.mo6127();
                    if (abstractC2898.mo6083() == InterfaceC2787.f8584) {
                        abstractC2898.mo6139();
                    }
                }
                if (abstractC2898.mo6133()) {
                    String strMo6139 = abstractC2898.mo6139();
                    if (strMo6139 != null && !strMo6139.isEmpty()) {
                        if ("@value".equals(strMo6139)) {
                            abstractC2898.mo6127();
                            Object objMo5418 = mo5418(abstractC2898, type, obj, j);
                            abstractC2898.mo6106();
                            return objMo5418;
                        }
                    }
                }
                C0276.m849(abstractC2898.mo6124("TODO"));
                return null;
            }
            Class cls = this.f8111;
            Object[] objArrCopyOf = (Object[]) Array.newInstance((Class<?>) cls, 16);
            int i = 0;
            while (!abstractC2898.mo6096()) {
                int i2 = i + 1;
                if (i2 - objArrCopyOf.length > 0) {
                    int length = objArrCopyOf.length;
                    int i3 = length + (length >> 1);
                    if (i3 - i2 < 0) {
                        i3 = i2;
                    }
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                }
                objArrCopyOf[i] = abstractC2898.mo6094(cls);
                abstractC2898.mo6099();
                i = i2;
            }
            abstractC2898.mo6098(',');
            return Arrays.copyOf(objArrCopyOf, i);
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object mo5424(Collection collection, long j) {
        Class<?> cls;
        Function functionM5586;
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f8110, collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            Class<?> cls2 = this.f8111;
            if (next != null && (cls = next.getClass()) != cls2 && (functionM5586 = AbstractC2932.m6329().m5586(cls, cls2)) != null) {
                next = functionM5586.apply(next);
            }
            if (!cls2.isInstance(next)) {
                InterfaceC2787 interfaceC2787M5588 = AbstractC2932.m6329().m5588(cls2, false);
                if (next instanceof Map) {
                    next = interfaceC2787M5588.m5574((Map) next, new JSONReader$Feature[0]);
                } else if (next instanceof Collection) {
                    next = interfaceC2787M5588.mo5424((Collection) next, j);
                } else if (next instanceof Object[]) {
                    next = interfaceC2787M5588.mo5424(JSONArray.of((Object[]) next), j);
                } else if (next != null) {
                    Class<?> cls3 = next.getClass();
                    if (!cls3.isArray()) {
                        C2941.m6339("component type not match, expect ", cls2.getName(), ", but ", cls3);
                        return null;
                    }
                    int length = Array.getLength(next);
                    JSONArray jSONArray = new JSONArray(length);
                    for (int i2 = 0; i2 < length; i2++) {
                        jSONArray.add(Array.get(next, i2));
                    }
                    next = interfaceC2787M5588.mo5424(jSONArray, j);
                } else {
                    continue;
                }
            }
            objArr[i] = next;
            i++;
        }
        return objArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        Object objMo6094;
        if (abstractC2898.mo6138() == -110) {
            abstractC2898.mo6127();
            long jMo6194 = abstractC2898.mo6194();
            if (jMo6194 != C2680.f8147 && jMo6194 != this.f8108) {
                if (!abstractC2898.m6129(j)) {
                    C0276.m849(abstractC2898.mo6124("not support autotype : " + abstractC2898.mo6055()));
                    return null;
                }
                InterfaceC2787 interfaceC2787M6054 = abstractC2898.m6054(jMo6194, j, this.f8648);
                if (interfaceC2787M6054 != null) {
                    return interfaceC2787M6054.mo5418(abstractC2898, type, obj, j);
                }
                C0276.m849(abstractC2898.mo6124("autoType not support : " + abstractC2898.mo6055()));
                return null;
            }
        }
        AbstractC2898 abstractC28982 = abstractC2898;
        long j2 = j;
        int iMo6187 = abstractC28982.mo6187();
        if (iMo6187 == -1) {
            return null;
        }
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f8110, iMo6187);
        for (int i = 0; i < iMo6187; i++) {
            if (abstractC28982.mo6134()) {
                String strMo6144 = abstractC28982.mo6144();
                if ("..".equals(strMo6144)) {
                    objMo6094 = objArr;
                } else {
                    AbstractC2921 abstractC2921M6320 = AbstractC2921.m6320(strMo6144);
                    if (abstractC28982.f9198 == null) {
                        abstractC28982.f9198 = new ArrayList();
                    }
                    abstractC28982.f9198.add(new C2899(null, objArr, Integer.valueOf(i), abstractC2921M6320));
                    objMo6094 = null;
                }
            } else {
                InterfaceC2787 interfaceC2787Mo6118 = abstractC28982.mo6118(this.f8109, j2, this.f8110);
                if (interfaceC2787Mo6118 != null) {
                    long j3 = j2;
                    AbstractC2898 abstractC28983 = abstractC28982;
                    objMo6094 = interfaceC2787Mo6118.mo5422(abstractC28983, null, null, j3);
                    abstractC28982 = abstractC28983;
                    j2 = j3;
                } else {
                    objMo6094 = abstractC28982.mo6094(this.f8111);
                }
            }
            objArr[i] = objMo6094;
        }
        return objArr;
    }
}
