package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.util.C2849;
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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2698 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8196;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8197;

    public C2698(Class cls, Class cls2) {
        this.f8197 = cls;
        this.f8196 = cls2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo5454(long j) {
        Class cls = this.f8196;
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
        if (abstractC2898.f9197) {
            return mo5422(abstractC2898, type, obj, 0L);
        }
        if (abstractC2898.mo6073()) {
            return null;
        }
        Collection hashSet = abstractC2898.mo6101() ? new HashSet() : (Collection) mo5454(j | abstractC2898.f9199.f9318);
        char c = abstractC2898.f9191;
        if (c == '[') {
            abstractC2898.mo6127();
            while (!abstractC2898.mo6096()) {
                String strMo6139 = abstractC2898.mo6139();
                if (strMo6139 != null || !(hashSet instanceof SortedSet)) {
                    hashSet.add(strMo6139);
                }
            }
        } else {
            if (c != '\"' && c != '\'' && c != '{') {
                C0276.m849(abstractC2898.mo6124(null));
                return null;
            }
            String strMo61392 = abstractC2898.mo6139();
            if (strMo61392 != null && !strMo61392.isEmpty()) {
                hashSet.add(strMo61392);
            }
        }
        abstractC2898.mo6099();
        return hashSet;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo5424(Collection collection, long j) {
        if (this.f8197.isInstance(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof String)) {
                }
            }
            return collection;
        }
        Collection collection2 = (Collection) mo5454(0L);
        for (Object obj : collection) {
            if (obj == null || (obj instanceof String)) {
                collection2.add(obj);
            } else {
                collection2.add(InterfaceC2915.m6317(obj));
            }
        }
        return collection2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        return this.f8197;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        JSONArray jSONArray;
        Collection collectionM5457;
        ArrayList arrayList;
        Function c2849 = null;
        if (abstractC2898.mo6087()) {
            return null;
        }
        InterfaceC2787 interfaceC2787Mo6118 = abstractC2898.mo6118(0L, j, this.f8197);
        Class clsMo5453 = interfaceC2787Mo6118 != null ? interfaceC2787Mo6118.mo5453() : this.f8196;
        int i = 0;
        if (clsMo5453 == C2697.f8181) {
            int iMo6187 = abstractC2898.mo6187();
            String[] strArr = new String[iMo6187];
            while (i < iMo6187) {
                strArr[i] = abstractC2898.mo6139();
                i++;
            }
            return Arrays.asList(strArr);
        }
        int iMo61872 = abstractC2898.mo6187();
        if (clsMo5453 == ArrayList.class) {
            if (iMo61872 > 0) {
                collectionM5457 = arrayList;
                arrayList = new ArrayList(iMo61872);
            } else {
                collectionM5457 = arrayList;
                arrayList = new ArrayList();
            }
        } else if (clsMo5453 == JSONArray.class) {
            if (iMo61872 > 0) {
                collectionM5457 = jSONArray;
                jSONArray = new JSONArray(iMo61872);
            } else {
                collectionM5457 = jSONArray;
                jSONArray = new JSONArray();
            }
        } else if (clsMo5453 == C2697.f8182) {
            ArrayList arrayList2 = new ArrayList();
            c2849 = new C2768(13);
            collectionM5457 = arrayList2;
        } else if (clsMo5453 == C2697.f8174) {
            ArrayList arrayList3 = new ArrayList();
            c2849 = new C2768(14);
            collectionM5457 = arrayList3;
        } else if (clsMo5453 == C2697.f8173) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            c2849 = new C2768(15);
            collectionM5457 = linkedHashSet;
        } else if (clsMo5453 == C2697.f8177) {
            TreeSet treeSet = new TreeSet();
            c2849 = new C2768(16);
            collectionM5457 = treeSet;
        } else if (clsMo5453 == C2697.f8178) {
            TreeSet treeSet2 = new TreeSet();
            c2849 = new C2768(17);
            collectionM5457 = treeSet2;
        } else if (clsMo5453 == C2697.f8183) {
            ArrayList arrayList4 = new ArrayList();
            c2849 = new C2699(0);
            collectionM5457 = arrayList4;
        } else if (clsMo5453 == C2697.f8184) {
            ArrayList arrayList5 = new ArrayList();
            c2849 = new C2699(1);
            collectionM5457 = arrayList5;
        } else if (clsMo5453 == null || clsMo5453 == this.f8197) {
            collectionM5457 = (Collection) mo5454(abstractC2898.f9199.f9318 | j);
        } else {
            String typeName = clsMo5453.getTypeName();
            typeName.getClass();
            if (typeName.equals("com.google.common.collect.ImmutableList")) {
                ArrayList arrayList6 = new ArrayList();
                c2849 = new C2849(0);
                collectionM5457 = arrayList6;
            } else if (typeName.equals("kotlin.collections.EmptyList")) {
                collectionM5457 = C2697.m5457(clsMo5453);
            } else if (typeName.equals("java.util.Collections$EmptySet")) {
                collectionM5457 = Collections.EMPTY_SET;
            } else if (typeName.equals("java.util.Collections$EmptyList")) {
                collectionM5457 = Collections.EMPTY_LIST;
            } else if (typeName.equals("kotlin.collections.EmptySet")) {
                collectionM5457 = C2697.m5456(clsMo5453);
            } else if (typeName.equals("com.google.common.collect.ImmutableSet")) {
                ArrayList arrayList7 = new ArrayList();
                c2849 = new C2849(1);
                collectionM5457 = arrayList7;
            } else if (typeName.equals("com.google.common.collect.Lists$TransformingRandomAccessList")) {
                collectionM5457 = new ArrayList();
            } else if (typeName.equals("com.google.common.collect.Lists.TransformingSequentialList")) {
                collectionM5457 = new LinkedList();
            } else {
                try {
                    collectionM5457 = (Collection) clsMo5453.newInstance();
                } catch (IllegalAccessException | InstantiationException e) {
                    C0276.m842(abstractC2898.mo6124("create instance error " + clsMo5453), e);
                    return null;
                }
            }
        }
        while (i < iMo61872) {
            collectionM5457.add(abstractC2898.mo6139());
            i++;
        }
        return c2849 != null ? (Collection) c2849.apply(collectionM5457) : collectionM5457;
    }
}
