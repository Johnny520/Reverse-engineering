package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2696 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f8170;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8171;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8172;

    public C2696(Class cls, Class cls2) {
        this.f8172 = cls;
        this.f8171 = cls2;
        this.f8170 = AbstractC2859.m5729(AbstractC2866.m5898(cls2));
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Object mo5454(long j) {
        Class cls = this.f8171;
        if (cls == ArrayList.class) {
            return new ArrayList();
        }
        if (cls == LinkedList.class) {
            return new LinkedList();
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            C2941.m6346(cls, "create list error, type ");
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        boolean z = abstractC2898.f9197;
        C2942 c2942 = abstractC2898.f9199;
        if (z) {
            return mo5422(abstractC2898, type, obj, 0L);
        }
        if (abstractC2898.mo6073()) {
            return null;
        }
        if (abstractC2898.mo6133()) {
            Collection collection = (Collection) mo5454(c2942.f9318 | j);
            String strMo6139 = abstractC2898.mo6139();
            if (strMo6139.indexOf(44) != -1) {
                for (String str : strMo6139.split(",")) {
                    collection.add(Long.valueOf(Long.parseLong(str)));
                }
            } else {
                collection.add(Long.valueOf(Long.parseLong(strMo6139)));
            }
            abstractC2898.mo6099();
            return collection;
        }
        boolean zMo6101 = abstractC2898.mo6101();
        if (abstractC2898.f9191 != '[') {
            C0276.m849(abstractC2898.mo6124("format error"));
            return null;
        }
        abstractC2898.mo6127();
        Collection linkedHashSet = (zMo6101 && this.f8171 == Collection.class) ? new LinkedHashSet() : (Collection) mo5454(j | c2942.f9318);
        while (!abstractC2898.mo6119()) {
            if (abstractC2898.mo6096()) {
                abstractC2898.mo6099();
                return linkedHashSet;
            }
            linkedHashSet.add(abstractC2898.mo6165());
        }
        C0276.m849(abstractC2898.mo6124("illegal input error"));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5424(Collection collection, long j) {
        Collection collection2 = (Collection) mo5454(j);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            collection2.add(AbstractC2866.m5859(it.next()));
        }
        return collection2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        Function functionMo5458;
        if (abstractC2898.mo6087()) {
            return null;
        }
        long j2 = this.f8170;
        Class clsMo5453 = this.f8172;
        InterfaceC2787 interfaceC2787Mo6118 = abstractC2898.mo6118(j2, j, clsMo5453);
        if (interfaceC2787Mo6118 != null) {
            clsMo5453 = interfaceC2787Mo6118.mo5453();
        }
        Collection arrayList = clsMo5453 == ArrayList.class ? new ArrayList() : clsMo5453 == JSONArray.class ? new JSONArray() : (clsMo5453 == null || clsMo5453 == this.f8172) ? (Collection) mo5454(abstractC2898.f9199.f9318 | j) : (Collection) interfaceC2787Mo6118.mo5454(j);
        int iMo6187 = abstractC2898.mo6187();
        for (int i = 0; i < iMo6187; i++) {
            arrayList.add(abstractC2898.mo6165());
        }
        return (interfaceC2787Mo6118 == null || (functionMo5458 = interfaceC2787Mo6118.mo5458()) == null) ? arrayList : (Collection) functionMo5458.apply(arrayList);
    }
}
