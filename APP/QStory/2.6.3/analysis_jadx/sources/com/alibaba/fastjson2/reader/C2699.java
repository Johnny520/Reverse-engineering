package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.util.C2850;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2699 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8198;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8199;

    public C2699(Class cls, Class cls2) {
        this.f8199 = cls;
        this.f8198 = cls2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo5499(long j) {
        Class cls = this.f8198;
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
        if (abstractC2899.f9199) {
            return mo5467(abstractC2899, type, obj, 0L);
        }
        if (abstractC2899.mo6119()) {
            return null;
        }
        Collection hashSet = abstractC2899.mo6147() ? new HashSet() : (Collection) mo5499(j | abstractC2899.f9201.f9320);
        char c = abstractC2899.f9193;
        if (c == '[') {
            abstractC2899.mo6173();
            while (!abstractC2899.mo6142()) {
                String strMo6184 = abstractC2899.mo6184();
                if (strMo6184 != null || !(hashSet instanceof SortedSet)) {
                    hashSet.add(strMo6184);
                }
            }
        } else {
            if (c != '\"' && c != '\'' && c != '{') {
                C0276.m850(abstractC2899.mo6170(null));
                return null;
            }
            String strMo61842 = abstractC2899.mo6184();
            if (strMo61842 != null && !strMo61842.isEmpty()) {
                hashSet.add(strMo61842);
            }
        }
        abstractC2899.mo6145();
        return hashSet;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5469(Collection collection, long j) {
        if (this.f8199.isInstance(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof String)) {
                }
            }
            return collection;
        }
        Collection collection2 = (Collection) mo5499(0L);
        for (Object obj : collection) {
            if (obj == null || (obj instanceof String)) {
                collection2.add(obj);
            } else {
                collection2.add(InterfaceC2916.m6375(obj));
            }
        }
        return collection2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        return this.f8199;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        JSONArray jSONArray;
        Collection collectionM5502;
        ArrayList arrayList;
        Function c2850 = null;
        if (abstractC2899.mo6133()) {
            return null;
        }
        InterfaceC2788 interfaceC2788Mo6164 = abstractC2899.mo6164(0L, j, this.f8199);
        Class clsMo5498 = interfaceC2788Mo6164 != null ? interfaceC2788Mo6164.mo5498() : this.f8198;
        int i = 0;
        if (clsMo5498 == C2698.f8183) {
            int iMo6232 = abstractC2899.mo6232();
            String[] strArr = new String[iMo6232];
            while (i < iMo6232) {
                strArr[i] = abstractC2899.mo6184();
                i++;
            }
            return Arrays.asList(strArr);
        }
        int iMo62322 = abstractC2899.mo6232();
        if (clsMo5498 == ArrayList.class) {
            if (iMo62322 > 0) {
                collectionM5502 = arrayList;
                arrayList = new ArrayList(iMo62322);
            } else {
                collectionM5502 = arrayList;
                arrayList = new ArrayList();
            }
        } else if (clsMo5498 == JSONArray.class) {
            if (iMo62322 > 0) {
                collectionM5502 = jSONArray;
                jSONArray = new JSONArray(iMo62322);
            } else {
                collectionM5502 = jSONArray;
                jSONArray = new JSONArray();
            }
        } else if (clsMo5498 == C2698.f8184) {
            ArrayList arrayList2 = new ArrayList();
            c2850 = new C2769(13);
            collectionM5502 = arrayList2;
        } else if (clsMo5498 == C2698.f8176) {
            ArrayList arrayList3 = new ArrayList();
            c2850 = new C2769(14);
            collectionM5502 = arrayList3;
        } else if (clsMo5498 == C2698.f8175) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            c2850 = new C2769(15);
            collectionM5502 = linkedHashSet;
        } else if (clsMo5498 == C2698.f8179) {
            TreeSet treeSet = new TreeSet();
            c2850 = new C2769(16);
            collectionM5502 = treeSet;
        } else if (clsMo5498 == C2698.f8180) {
            TreeSet treeSet2 = new TreeSet();
            c2850 = new C2769(17);
            collectionM5502 = treeSet2;
        } else if (clsMo5498 == C2698.f8185) {
            ArrayList arrayList4 = new ArrayList();
            c2850 = new C2700(0);
            collectionM5502 = arrayList4;
        } else if (clsMo5498 == C2698.f8186) {
            ArrayList arrayList5 = new ArrayList();
            c2850 = new C2700(1);
            collectionM5502 = arrayList5;
        } else if (clsMo5498 == null || clsMo5498 == this.f8199) {
            collectionM5502 = (Collection) mo5499(abstractC2899.f9201.f9320 | j);
        } else {
            String typeName = clsMo5498.getTypeName();
            typeName.getClass();
            if (typeName.equals("com.google.common.collect.ImmutableList")) {
                ArrayList arrayList6 = new ArrayList();
                c2850 = new C2850(0);
                collectionM5502 = arrayList6;
            } else if (typeName.equals("kotlin.collections.EmptyList")) {
                collectionM5502 = C2698.m5502(clsMo5498);
            } else if (typeName.equals("java.util.Collections$EmptySet")) {
                collectionM5502 = Collections.EMPTY_SET;
            } else if (typeName.equals("java.util.Collections$EmptyList")) {
                collectionM5502 = Collections.EMPTY_LIST;
            } else if (typeName.equals("kotlin.collections.EmptySet")) {
                collectionM5502 = C2698.m5501(clsMo5498);
            } else if (typeName.equals("com.google.common.collect.ImmutableSet")) {
                ArrayList arrayList7 = new ArrayList();
                c2850 = new C2850(1);
                collectionM5502 = arrayList7;
            } else if (typeName.equals("com.google.common.collect.Lists$TransformingRandomAccessList")) {
                collectionM5502 = new ArrayList();
            } else if (typeName.equals("com.google.common.collect.Lists.TransformingSequentialList")) {
                collectionM5502 = new LinkedList();
            } else {
                try {
                    collectionM5502 = (Collection) clsMo5498.newInstance();
                } catch (IllegalAccessException | InstantiationException e) {
                    C0276.m843(abstractC2899.mo6170("create instance error " + clsMo5498), e);
                    return null;
                }
            }
        }
        while (i < iMo62322) {
            collectionM5502.add(abstractC2899.mo6184());
            i++;
        }
        return c2850 != null ? (Collection) c2850.apply(collectionM5502) : collectionM5502;
    }
}
