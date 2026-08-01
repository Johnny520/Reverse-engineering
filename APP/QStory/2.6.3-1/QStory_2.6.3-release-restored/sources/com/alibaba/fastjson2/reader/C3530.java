package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
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
public final class C3530 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f8517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8519;

    public C3530(Class cls, Class cls2) {
        this.f8519 = cls;
        this.f8518 = cls2;
        this.f8517 = AbstractC3693.m6334(AbstractC3700.m6503(cls2));
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Object mo6059(long j) {
        Class cls = this.f8518;
        if (cls == ArrayList.class) {
            return new ArrayList();
        }
        if (cls == LinkedList.class) {
            return new LinkedList();
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException unused) {
            C3775.m6964(cls, "create list error, type ");
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        boolean z = abstractC3732.f9544;
        C3776 c3776 = abstractC3732.f9546;
        if (z) {
            return mo6027(abstractC3732, type, obj, 0L);
        }
        if (abstractC3732.mo6679()) {
            return null;
        }
        if (abstractC3732.mo6739()) {
            Collection collection = (Collection) mo6059(c3776.f9665 | j);
            String strMo6744 = abstractC3732.mo6744();
            if (strMo6744.indexOf(44) != -1) {
                for (String str : strMo6744.split(",")) {
                    collection.add(Long.valueOf(Long.parseLong(str)));
                }
            } else {
                collection.add(Long.valueOf(Long.parseLong(strMo6744)));
            }
            abstractC3732.mo6705();
            return collection;
        }
        boolean zMo6707 = abstractC3732.mo6707();
        if (abstractC3732.f9538 != '[') {
            C1123.m1410(abstractC3732.mo6730("format error"));
            return null;
        }
        abstractC3732.mo6733();
        Collection linkedHashSet = (zMo6707 && this.f8518 == Collection.class) ? new LinkedHashSet() : (Collection) mo6059(j | c3776.f9665);
        while (!abstractC3732.mo6725()) {
            if (abstractC3732.mo6702()) {
                abstractC3732.mo6705();
                return linkedHashSet;
            }
            linkedHashSet.add(abstractC3732.mo6770());
        }
        C1123.m1410(abstractC3732.mo6730("illegal input error"));
        return null;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo6029(Collection collection, long j) {
        Collection collection2 = (Collection) mo6059(j);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            collection2.add(AbstractC3700.m6464(it.next()));
        }
        return collection2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Function functionMo6063;
        if (abstractC3732.mo6693()) {
            return null;
        }
        long j2 = this.f8517;
        Class clsMo6058 = this.f8519;
        InterfaceC3621 interfaceC3621Mo6724 = abstractC3732.mo6724(j2, j, clsMo6058);
        if (interfaceC3621Mo6724 != null) {
            clsMo6058 = interfaceC3621Mo6724.mo6058();
        }
        Collection arrayList = clsMo6058 == ArrayList.class ? new ArrayList() : clsMo6058 == JSONArray.class ? new JSONArray() : (clsMo6058 == null || clsMo6058 == this.f8519) ? (Collection) mo6059(abstractC3732.f9546.f9665 | j) : (Collection) interfaceC3621Mo6724.mo6059(j);
        int iMo6792 = abstractC3732.mo6792();
        for (int i = 0; i < iMo6792; i++) {
            arrayList.add(abstractC3732.mo6770());
        }
        return (interfaceC3621Mo6724 == null || (functionMo6063 = interfaceC3621Mo6724.mo6063()) == null) ? arrayList : (Collection) functionMo6063.apply(arrayList);
    }
}
