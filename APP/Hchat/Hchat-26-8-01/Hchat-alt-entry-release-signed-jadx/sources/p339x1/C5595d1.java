package p339x1;

import p071f1.C1020o0;
import p072f2.AbstractC1057t;
import p072f2.C1050m;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: x1.d1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5595d1 implements InterfaceC5599e1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final int m9991g(int i9, long j3) {
        int i10 = AbstractC5592c2.f22729b;
        return ((int) (j3 >> (i9 * 15))) & 32767;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static long m9992h(int i9, int i10, int i11, int i12) {
        return (((long) (i10 & 32767)) << 15) | ((long) (i9 & 32767)) | (((long) (i11 & 32767)) << 30) | (((long) (i12 & 32767)) << 45) | Long.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5599e1
    /* JADX INFO: renamed from: a */
    public int mo9986a() {
        return 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5599e1
    /* JADX INFO: renamed from: b */
    public boolean mo9993b(AbstractC5852n abstractC5852n) {
        return AbstractC1057t.m2677h(AbstractC1057t.m2670a(AbstractC5618k.m10167w(abstractC5852n), false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5599e1
    /* JADX INFO: renamed from: c */
    public boolean mo9987c(C5602f0 c5602f0) {
        C1050m c1050mM10051w = c5602f0.m10051w();
        boolean z9 = false;
        if (c1050mM10051w != null && c1050mM10051w.f3344j) {
            z9 = true;
        }
        return !z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5599e1
    /* JADX INFO: renamed from: d */
    public boolean mo9988d(C5633p c5633p, C5602f0 c5602f0) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5599e1
    /* JADX INFO: renamed from: e */
    public void mo9989e(C5602f0 c5602f0, long j3, C5633p c5633p, int i9, boolean z9) {
        C5587b1 c5587b1 = c5602f0.f22778L;
        AbstractC5614i1 abstractC5614i1 = c5587b1.f22717d;
        C1020o0 c1020o0 = AbstractC5614i1.f22844T;
        c5587b1.f22717d.m10111w1(AbstractC5614i1.f22848X, abstractC5614i1.m10103o1(j3), c5633p, 1, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5599e1
    /* JADX INFO: renamed from: f */
    public boolean mo9990f(AbstractC5852n abstractC5852n) {
        return false;
    }
}
