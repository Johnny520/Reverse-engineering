package p265s;

import okio.C3193a;
import p088g0.C1263g;
import p136j8.C2104o;
import p174m.C2581c;
import p174m.EnumC2640p1;
import p251r.C3622g;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4418p0;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5651v;
import p356y0.AbstractC5852n;
import tf.C4174u;

/* JADX INFO: renamed from: s.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3853r extends AbstractC5852n implements InterfaceC5651v {

    /* JADX INFO: renamed from: x */
    public static final C3849p f12616x = new C3849p();

    /* JADX INFO: renamed from: u */
    public C3622g f12617u;

    /* JADX INFO: renamed from: v */
    public C2581c f12618v;

    /* JADX INFO: renamed from: w */
    public EnumC2640p1 f12619w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5651v
    /* JADX INFO: renamed from: j */
    public final InterfaceC4415o0 mo1350j(InterfaceC4418p0 interfaceC4418p0, InterfaceC4409m0 interfaceC4409m0, long j3) {
        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(j3);
        return interfaceC4418p0.mo8010z(abstractC4377b1Mo8831Q.f14593g, abstractC4377b1Mo8831Q.f14594h, C4174u.f13711g, new C1263g(abstractC4377b1Mo8831Q, 6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public final boolean m8023k1(C3843m c3843m, int i9) {
        if (i9 == 5 || i9 == 6) {
            if (this.f12619w == EnumC2640p1.f8623h) {
                return false;
            }
        } else if (i9 == 3 || i9 == 4) {
            if (this.f12619w == EnumC2640p1.f8622g) {
                return false;
            }
        } else if (i9 != 1 && i9 != 2) {
            C2104o.m5276A("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        if (m8024l1(i9)) {
            if (c3843m.f12577b >= this.f12617u.f11682a.m7623j().f11749n - 1) {
                return false;
            }
        } else if (c3843m.f12576a <= 0) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l1 */
    public final boolean m8024l1(int i9) {
        if (i9 == 1) {
            return false;
        }
        if (i9 == 2) {
            return true;
        }
        if (i9 == 5) {
            return false;
        }
        if (i9 == 6) {
            return true;
        }
        if (i9 == 3) {
            int iOrdinal = AbstractC5618k.m10167w(this).f22772F.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            C3193a.m6822k();
            return false;
        }
        if (i9 != 4) {
            C2104o.m5276A("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int iOrdinal2 = AbstractC5618k.m10167w(this).f22772F.ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        C3193a.m6822k();
        return false;
    }
}
