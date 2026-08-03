package p086fh;

import p094g6.C1354b;
import p343x6.AbstractC5700d;

/* JADX INFO: renamed from: fh.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1255m extends AbstractC5700d {

    /* JADX INFO: renamed from: g */
    public C1243a f4112g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public static void m3378k0(C1255m c1255m, String str) {
        C1243a c1243a = new C1243a();
        c1243a.m3360m0(5, str);
        c1255m.f4112g = c1243a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p343x6.AbstractC5700d
    /* JADX INFO: renamed from: G */
    public final int mo1577G(C1354b c1354b) {
        C1243a c1243a = this.f4112g;
        int iMo1577G = c1243a != null ? c1243a.mo1577G(c1354b) : 0;
        c1354b.m3642n(2);
        c1354b.m3631c(1, iMo1577G);
        c1354b.m3631c(0, 0);
        int iM3635g = c1354b.m3635g();
        c1354b.m3637i(iM3635g);
        return iM3635g;
    }
}
