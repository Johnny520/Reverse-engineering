package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.C2943;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2697 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f8172;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8173;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8174;

    public C2697(Class cls, Class cls2) {
        this.f8174 = cls;
        this.f8173 = cls2;
        this.f8172 = AbstractC2860.m5774(AbstractC2867.m5943(cls2));
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Object mo5499(long j) {
        Class cls = this.f8173;
        if (cls == ArrayList.class) {
            return new ArrayList();
        }
        if (cls == LinkedList.class) {
            return new LinkedList();
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            C2942.m6404(cls, "create list error, type ");
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        boolean z = abstractC2899.f9199;
        C2943 c2943 = abstractC2899.f9201;
        if (z) {
            return mo5467(abstractC2899, type, obj, 0L);
        }
        if (abstractC2899.mo6119()) {
            return null;
        }
        if (abstractC2899.mo6179()) {
            Collection collection = (Collection) mo5499(c2943.f9320 | j);
            String strMo6184 = abstractC2899.mo6184();
            if (strMo6184.indexOf(44) != -1) {
                for (String str : strMo6184.split(",")) {
                    collection.add(Long.valueOf(Long.parseLong(str)));
                }
            } else {
                collection.add(Long.valueOf(Long.parseLong(strMo6184)));
            }
            abstractC2899.mo6145();
            return collection;
        }
        boolean zMo6147 = abstractC2899.mo6147();
        if (abstractC2899.f9193 != '[') {
            C0276.m850(abstractC2899.mo6170("format error"));
            return null;
        }
        abstractC2899.mo6173();
        Collection linkedHashSet = (zMo6147 && this.f8173 == Collection.class) ? new LinkedHashSet() : (Collection) mo5499(j | c2943.f9320);
        while (!abstractC2899.mo6165()) {
            if (abstractC2899.mo6142()) {
                abstractC2899.mo6145();
                return linkedHashSet;
            }
            linkedHashSet.add(abstractC2899.mo6210());
        }
        C0276.m850(abstractC2899.mo6170("illegal input error"));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5469(Collection collection, long j) {
        Collection collection2 = (Collection) mo5499(j);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            collection2.add(AbstractC2867.m5904(it.next()));
        }
        return collection2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Function functionMo5503;
        if (abstractC2899.mo6133()) {
            return null;
        }
        long j2 = this.f8172;
        Class clsMo5498 = this.f8174;
        InterfaceC2788 interfaceC2788Mo6164 = abstractC2899.mo6164(j2, j, clsMo5498);
        if (interfaceC2788Mo6164 != null) {
            clsMo5498 = interfaceC2788Mo6164.mo5498();
        }
        Collection arrayList = clsMo5498 == ArrayList.class ? new ArrayList() : clsMo5498 == JSONArray.class ? new JSONArray() : (clsMo5498 == null || clsMo5498 == this.f8174) ? (Collection) mo5499(abstractC2899.f9201.f9320 | j) : (Collection) interfaceC2788Mo6164.mo5499(j);
        int iMo6232 = abstractC2899.mo6232();
        for (int i = 0; i < iMo6232; i++) {
            arrayList.add(abstractC2899.mo6210());
        }
        return (interfaceC2788Mo6164 == null || (functionMo5503 = interfaceC2788Mo6164.mo5503()) == null) ? arrayList : (Collection) functionMo5503.apply(arrayList);
    }
}
