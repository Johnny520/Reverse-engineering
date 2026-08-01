package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.AbstractC2922;
import com.alibaba.fastjson2.AbstractC2933;
import com.alibaba.fastjson2.C2900;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2677 extends AbstractC2797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final long f8110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f8111;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Class f8112;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8113;

    public C2677(Class cls) {
        super(cls);
        Class<?> componentType = cls.getComponentType();
        this.f8113 = componentType;
        String strM5943 = AbstractC2867.m5943(componentType);
        this.f8111 = AbstractC2860.m5774(strM5943);
        this.f8110 = AbstractC2860.m5774("[".concat(strM5943));
        this.f8112 = AbstractC2867.m5944(componentType);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (abstractC2899.f9199) {
            return mo5467(abstractC2899, type, obj, 0L);
        }
        if (!abstractC2899.mo6119()) {
            if (!abstractC2899.mo6141()) {
                if (abstractC2899.f9193 == '{') {
                    abstractC2899.mo6173();
                    if (abstractC2899.mo6129() == InterfaceC2788.f8586) {
                        abstractC2899.mo6184();
                    }
                }
                if (abstractC2899.mo6179()) {
                    String strMo6184 = abstractC2899.mo6184();
                    if (strMo6184 != null && !strMo6184.isEmpty()) {
                        if ("@value".equals(strMo6184)) {
                            abstractC2899.mo6173();
                            Object objMo5463 = mo5463(abstractC2899, type, obj, j);
                            abstractC2899.mo6152();
                            return objMo5463;
                        }
                    }
                }
                C0276.m850(abstractC2899.mo6170("TODO"));
                return null;
            }
            Class cls = this.f8113;
            Object[] objArrCopyOf = (Object[]) Array.newInstance((Class<?>) cls, 16);
            int i = 0;
            while (!abstractC2899.mo6142()) {
                int i2 = i + 1;
                if (i2 - objArrCopyOf.length > 0) {
                    int length = objArrCopyOf.length;
                    int i3 = length + (length >> 1);
                    if (i3 - i2 < 0) {
                        i3 = i2;
                    }
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                }
                objArrCopyOf[i] = abstractC2899.mo6140(cls);
                abstractC2899.mo6145();
                i = i2;
            }
            abstractC2899.mo6144(',');
            return Arrays.copyOf(objArrCopyOf, i);
        }
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object mo5469(Collection collection, long j) {
        Class<?> cls;
        Function functionM5631;
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f8112, collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            Class<?> cls2 = this.f8113;
            if (next != null && (cls = next.getClass()) != cls2 && (functionM5631 = AbstractC2933.m6387().m5631(cls, cls2)) != null) {
                next = functionM5631.apply(next);
            }
            if (!cls2.isInstance(next)) {
                InterfaceC2788 interfaceC2788M5633 = AbstractC2933.m6387().m5633(cls2, false);
                if (next instanceof Map) {
                    next = interfaceC2788M5633.m5619((Map) next, new JSONReader$Feature[0]);
                } else if (next instanceof Collection) {
                    next = interfaceC2788M5633.mo5469((Collection) next, j);
                } else if (next instanceof Object[]) {
                    next = interfaceC2788M5633.mo5469(JSONArray.of((Object[]) next), j);
                } else if (next != null) {
                    Class<?> cls3 = next.getClass();
                    if (!cls3.isArray()) {
                        C2942.m6397("component type not match, expect ", cls2.getName(), ", but ", cls3);
                        return null;
                    }
                    int length = Array.getLength(next);
                    JSONArray jSONArray = new JSONArray(length);
                    for (int i2 = 0; i2 < length; i2++) {
                        jSONArray.add(Array.get(next, i2));
                    }
                    next = interfaceC2788M5633.mo5469(jSONArray, j);
                } else {
                    continue;
                }
            }
            objArr[i] = next;
            i++;
        }
        return objArr;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Object objMo6140;
        if (abstractC2899.mo6183() == -110) {
            abstractC2899.mo6173();
            long jMo6239 = abstractC2899.mo6239();
            if (jMo6239 != C2681.f8149 && jMo6239 != this.f8110) {
                if (!abstractC2899.m6175(j)) {
                    C0276.m850(abstractC2899.mo6170("not support autotype : " + abstractC2899.mo6100()));
                    return null;
                }
                InterfaceC2788 interfaceC2788M6101 = abstractC2899.m6101(jMo6239, j, this.f8650);
                if (interfaceC2788M6101 != null) {
                    return interfaceC2788M6101.mo5463(abstractC2899, type, obj, j);
                }
                C0276.m850(abstractC2899.mo6170("autoType not support : " + abstractC2899.mo6100()));
                return null;
            }
        }
        AbstractC2899 abstractC28992 = abstractC2899;
        long j2 = j;
        int iMo6232 = abstractC28992.mo6232();
        if (iMo6232 == -1) {
            return null;
        }
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.f8112, iMo6232);
        for (int i = 0; i < iMo6232; i++) {
            if (abstractC28992.mo6180()) {
                String strMo6189 = abstractC28992.mo6189();
                if ("..".equals(strMo6189)) {
                    objMo6140 = objArr;
                } else {
                    AbstractC2922 abstractC2922M6378 = AbstractC2922.m6378(strMo6189);
                    if (abstractC28992.f9200 == null) {
                        abstractC28992.f9200 = new ArrayList();
                    }
                    abstractC28992.f9200.add(new C2900(null, objArr, Integer.valueOf(i), abstractC2922M6378));
                    objMo6140 = null;
                }
            } else {
                InterfaceC2788 interfaceC2788Mo6164 = abstractC28992.mo6164(this.f8111, j2, this.f8112);
                if (interfaceC2788Mo6164 != null) {
                    long j3 = j2;
                    AbstractC2899 abstractC28993 = abstractC28992;
                    objMo6140 = interfaceC2788Mo6164.mo5467(abstractC28993, null, null, j3);
                    abstractC28992 = abstractC28993;
                    j2 = j3;
                } else {
                    objMo6140 = abstractC28992.mo6140(this.f8113);
                }
            }
            objArr[i] = objMo6140;
        }
        return objArr;
    }
}
