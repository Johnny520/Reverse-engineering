package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.util.C3683;
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
public final class C3532 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8543;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f8544;

    public C3532(Class cls, Class cls2) {
        this.f8544 = cls;
        this.f8543 = cls2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final Object mo6059(long j) {
        Class cls = this.f8543;
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
        if (abstractC3732.f9544) {
            return mo6027(abstractC3732, type, obj, 0L);
        }
        if (abstractC3732.mo6679()) {
            return null;
        }
        Collection hashSet = abstractC3732.mo6707() ? new HashSet() : (Collection) mo6059(j | abstractC3732.f9546.f9665);
        char c = abstractC3732.f9538;
        if (c == '[') {
            abstractC3732.mo6733();
            while (!abstractC3732.mo6702()) {
                String strMo6744 = abstractC3732.mo6744();
                if (strMo6744 != null || !(hashSet instanceof SortedSet)) {
                    hashSet.add(strMo6744);
                }
            }
        } else {
            if (c != '\"' && c != '\'' && c != '{') {
                C1123.m1410(abstractC3732.mo6730(null));
                return null;
            }
            String strMo67442 = abstractC3732.mo6744();
            if (strMo67442 != null && !strMo67442.isEmpty()) {
                hashSet.add(strMo67442);
            }
        }
        abstractC3732.mo6705();
        return hashSet;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Object mo6029(Collection collection, long j) {
        if (this.f8544.isInstance(collection)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof String)) {
                }
            }
            return collection;
        }
        Collection collection2 = (Collection) mo6059(0L);
        for (Object obj : collection) {
            if (obj == null || (obj instanceof String)) {
                collection2.add(obj);
            } else {
                collection2.add(InterfaceC3749.m6935(obj));
            }
        }
        return collection2;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo6058() {
        return this.f8544;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        JSONArray jSONArray;
        Collection collectionM6062;
        ArrayList arrayList;
        Function c3683 = null;
        if (abstractC3732.mo6693()) {
            return null;
        }
        InterfaceC3621 interfaceC3621Mo6724 = abstractC3732.mo6724(0L, j, this.f8544);
        Class clsMo6058 = interfaceC3621Mo6724 != null ? interfaceC3621Mo6724.mo6058() : this.f8543;
        int i = 0;
        if (clsMo6058 == C3531.f8528) {
            int iMo6792 = abstractC3732.mo6792();
            String[] strArr = new String[iMo6792];
            while (i < iMo6792) {
                strArr[i] = abstractC3732.mo6744();
                i++;
            }
            return Arrays.asList(strArr);
        }
        int iMo67922 = abstractC3732.mo6792();
        if (clsMo6058 == ArrayList.class) {
            if (iMo67922 > 0) {
                collectionM6062 = arrayList;
                arrayList = new ArrayList(iMo67922);
            } else {
                collectionM6062 = arrayList;
                arrayList = new ArrayList();
            }
        } else if (clsMo6058 == JSONArray.class) {
            if (iMo67922 > 0) {
                collectionM6062 = jSONArray;
                jSONArray = new JSONArray(iMo67922);
            } else {
                collectionM6062 = jSONArray;
                jSONArray = new JSONArray();
            }
        } else if (clsMo6058 == C3531.f8529) {
            ArrayList arrayList2 = new ArrayList();
            c3683 = new C3602(13);
            collectionM6062 = arrayList2;
        } else if (clsMo6058 == C3531.f8521) {
            ArrayList arrayList3 = new ArrayList();
            c3683 = new C3602(14);
            collectionM6062 = arrayList3;
        } else if (clsMo6058 == C3531.f8520) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            c3683 = new C3602(15);
            collectionM6062 = linkedHashSet;
        } else if (clsMo6058 == C3531.f8524) {
            TreeSet treeSet = new TreeSet();
            c3683 = new C3602(16);
            collectionM6062 = treeSet;
        } else if (clsMo6058 == C3531.f8525) {
            TreeSet treeSet2 = new TreeSet();
            c3683 = new C3602(17);
            collectionM6062 = treeSet2;
        } else if (clsMo6058 == C3531.f8530) {
            ArrayList arrayList4 = new ArrayList();
            c3683 = new C3533(0);
            collectionM6062 = arrayList4;
        } else if (clsMo6058 == C3531.f8531) {
            ArrayList arrayList5 = new ArrayList();
            c3683 = new C3533(1);
            collectionM6062 = arrayList5;
        } else if (clsMo6058 == null || clsMo6058 == this.f8544) {
            collectionM6062 = (Collection) mo6059(abstractC3732.f9546.f9665 | j);
        } else {
            String typeName = clsMo6058.getTypeName();
            typeName.getClass();
            if (typeName.equals("com.google.common.collect.ImmutableList")) {
                ArrayList arrayList6 = new ArrayList();
                c3683 = new C3683(0);
                collectionM6062 = arrayList6;
            } else if (typeName.equals("kotlin.collections.EmptyList")) {
                collectionM6062 = C3531.m6062(clsMo6058);
            } else if (typeName.equals("java.util.Collections$EmptySet")) {
                collectionM6062 = Collections.EMPTY_SET;
            } else if (typeName.equals("java.util.Collections$EmptyList")) {
                collectionM6062 = Collections.EMPTY_LIST;
            } else if (typeName.equals("kotlin.collections.EmptySet")) {
                collectionM6062 = C3531.m6061(clsMo6058);
            } else if (typeName.equals("com.google.common.collect.ImmutableSet")) {
                ArrayList arrayList7 = new ArrayList();
                c3683 = new C3683(1);
                collectionM6062 = arrayList7;
            } else if (typeName.equals("com.google.common.collect.Lists$TransformingRandomAccessList")) {
                collectionM6062 = new ArrayList();
            } else if (typeName.equals("com.google.common.collect.Lists.TransformingSequentialList")) {
                collectionM6062 = new LinkedList();
            } else {
                try {
                    collectionM6062 = (Collection) clsMo6058.newInstance();
                } catch (IllegalAccessException | InstantiationException e) {
                    C1123.m1403(abstractC3732.mo6730("create instance error " + clsMo6058), e);
                    return null;
                }
            }
        }
        while (i < iMo67922) {
            collectionM6062.add(abstractC3732.mo6744());
            i++;
        }
        return c3683 != null ? (Collection) c3683.apply(collectionM6062) : collectionM6062;
    }
}
