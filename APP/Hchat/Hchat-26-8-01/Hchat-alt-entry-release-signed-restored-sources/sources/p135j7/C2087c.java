package p135j7;

import java.util.Comparator;
import p152k7.AbstractC2331a;
import p152k7.AbstractC2332b;
import p314v7.C4489c0;
import p314v7.C4493e0;
import p314v7.C4494f;

/* JADX INFO: renamed from: j7.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2087c extends AbstractC2332b implements Comparator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: V */
    public final void mo5143V() {
        C4494f c4494f = (C4494f) ((C4489c0) m5553u(C4489c0.class)).f14849k;
        AbstractC2331a.m5534D(c4494f.f12076k, 12, this.f9926k.size());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iMo6174Z;
        int iMo6174Z2;
        C4493e0 c4493e0 = (C4493e0) obj;
        C4493e0 c4493e02 = (C4493e0) obj2;
        if (c4493e0 == c4493e02) {
            return 0;
        }
        if (c4493e0 == null) {
            return 1;
        }
        if (c4493e02 == null) {
            return -1;
        }
        if (c4493e02 == c4493e0 || (iMo6174Z = c4493e0.mo6174Z()) == (iMo6174Z2 = c4493e02.mo6174Z())) {
            return 0;
        }
        if (iMo6174Z == 0) {
            return 1;
        }
        if (iMo6174Z2 == 0) {
            return -1;
        }
        return Integer.compare(iMo6174Z, iMo6174Z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.InterfaceC2334d
    /* JADX INFO: renamed from: n */
    public final AbstractC2331a mo1892n() {
        return new C4493e0(12, 4);
    }

    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: X */
    public final void mo5141X() {
    }
}
