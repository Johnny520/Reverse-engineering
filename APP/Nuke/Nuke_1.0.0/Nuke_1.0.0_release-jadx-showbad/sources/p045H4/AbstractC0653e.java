package p045H4;

import com.bumptech.glide.AbstractC1925g;
import p000A.C0065i;
import p028F.C0352m;
import p056K2.C0891q;
import p095T.AbstractC1385s;
import p095T.C1341U0;
import p095T.C1383r;
import p095T.C1388t0;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p136b0.AbstractC1848j;
import p136b0.C1843e;
import p216p.AbstractC2856m;

/* JADX INFO: renamed from: H4.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0653e {

    /* JADX INFO: renamed from: a */
    public static final C1341U0 f2072a = new C1341U0(new C0065i(10));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m1125a(C0650b c0650b, C1843e c1843e, InterfaceC1373m interfaceC1373m, int i5) {
        AbstractC1665j.m2985e(c0650b, "colors");
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(1775237228);
        int i6 = (c1383r.m2582f(c0650b) ? 4 : 2) | i5;
        if (c1383r.m2560O(i6 & 1, (i6 & 19) != 18)) {
            AbstractC1385s.m2611a(f2072a.mo2399a(c0650b), AbstractC1848j.m3314c(-2105181268, new C0651c(c1843e, 1, (byte) 0), c1383r), c1383r, 56);
        } else {
            c1383r.m2563R();
        }
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new C0352m(i5, 3, c0650b, c1843e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m1126b(boolean z5, long j5, final C1843e c1843e, InterfaceC1373m interfaceC1373m, final int i5) {
        C1383r c1383r = (C1383r) interfaceC1373m;
        c1383r.m2569X(1787818654);
        int i6 = i5 | 50;
        if (c1383r.m2560O(i6 & 1, (i6 & 147) != 146)) {
            c1383r.m2565T();
            if ((i5 & 1) == 0 || c1383r.m2606y()) {
                z5 = AbstractC2856m.m5056j(c1383r);
                j5 = AbstractC0649a.f2059a;
            } else {
                c1383r.m2563R();
            }
            c1383r.m2598q();
            AbstractC1385s.m2611a(f2072a.mo2399a(z5 ? AbstractC1925g.m3535l(j5) : AbstractC1925g.m3548y(j5)), AbstractC1848j.m3314c(-714823842, new C0651c(c1843e, 0, (byte) 0), c1383r), c1383r, 56);
        } else {
            c1383r.m2563R();
        }
        final boolean z6 = z5;
        final long j6 = j5;
        C1388t0 c1388t0M2599r = c1383r.m2599r();
        if (c1388t0M2599r != null) {
            c1388t0M2599r.f4928d = new InterfaceC1603e(z6, j6, c1843e, i5) { // from class: H4.d

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f2069d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ long f2070e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ C1843e f2071f;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p112W2.InterfaceC1603e
                /* JADX INFO: renamed from: g */
                public final Object mo0g(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM2609A = AbstractC1385s.m2609A(385);
                    AbstractC0653e.m1126b(this.f2069d, this.f2070e, this.f2071f, (InterfaceC1373m) obj, iM2609A);
                    return C0891q.f2780a;
                }
            };
        }
    }
}
