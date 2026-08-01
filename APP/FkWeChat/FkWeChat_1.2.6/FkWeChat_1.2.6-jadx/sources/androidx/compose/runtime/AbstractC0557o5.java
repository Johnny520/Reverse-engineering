package androidx.compose.runtime;

import java.util.ArrayList;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: androidx.compose.runtime.o5 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0557o5 {
    /* JADX INFO: renamed from: a */
    public static final void m2110a(ArrayList arrayList) {
        arrayList.clear();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ ArrayList m2112c(ArrayList arrayList, int i10, AbstractC1043k abstractC1043k) {
        if ((i10 & 1) != 0) {
            arrayList = new ArrayList();
        }
        return m2111b(arrayList);
    }

    /* JADX INFO: renamed from: d */
    public static final int m2113d(ArrayList arrayList) {
        return arrayList.size();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m2114e(ArrayList arrayList) {
        return arrayList.isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m2115f(ArrayList arrayList) {
        return !m2114e(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public static final Object m2116g(ArrayList arrayList) {
        return arrayList.get(m2113d(arrayList) - 1);
    }

    /* JADX INFO: renamed from: h */
    public static final Object m2117h(ArrayList arrayList, int i10) {
        return arrayList.get(i10);
    }

    /* JADX INFO: renamed from: i */
    public static final Object m2118i(ArrayList arrayList) {
        return arrayList.remove(m2113d(arrayList) - 1);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m2119j(ArrayList arrayList, Object obj) {
        return arrayList.add(obj);
    }

    /* JADX INFO: renamed from: k */
    public static final Object[] m2120k(ArrayList arrayList) {
        int size = arrayList.size();
        Object[] objArr = new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i10] = arrayList.get(i10);
        }
        return objArr;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList m2111b(ArrayList arrayList) {
        return arrayList;
    }
}
