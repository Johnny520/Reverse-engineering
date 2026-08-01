package p117i;

import p132j.AbstractC3489a;

/* JADX INFO: renamed from: i.j1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3065j1 {

    /* JADX INFO: renamed from: a */
    public static final Object f8135a = new Object();

    /* JADX INFO: renamed from: c */
    public static final Object m11378c(C3062i1 c3062i1, int i10) {
        Object obj;
        c3062i1.getClass();
        int iM13004a = AbstractC3489a.m13004a(c3062i1.f8126r, c3062i1.f8128t, i10);
        if (iM13004a < 0 || (obj = c3062i1.f8127s[iM13004a]) == f8135a) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: d */
    public static final void m11379d(C3062i1 c3062i1) {
        int i10 = c3062i1.f8128t;
        int[] iArr = c3062i1.f8126r;
        Object[] objArr = c3062i1.f8127s;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f8135a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        c3062i1.f8125q = false;
        c3062i1.f8128t = i11;
    }
}
