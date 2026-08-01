package p095T;

import java.util.Iterator;
import p061L2.C0958A;
import p122Y2.InterfaceC1766a;
import p163g0.InterfaceC2171c;

/* JADX INFO: renamed from: T.S0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1337S0 implements InterfaceC2171c, Iterable, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final C1318I0 f4772d;

    /* JADX INFO: renamed from: e */
    public final int f4773e;

    /* JADX INFO: renamed from: f */
    public final C1304B0 f4774f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1337S0(C1318I0 c1318i0, int i5, AbstractC1327N abstractC1327N, C1304B0 c1304b0) {
        this.f4772d = c1318i0;
        this.f4773e = i5;
        this.f4774f = c1304b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1337S0)) {
            return false;
        }
        C1337S0 c1337s0 = (C1337S0) obj;
        return c1337s0.f4773e == this.f4773e && c1337s0.f4772d.equals(this.f4772d) && c1337s0.f4774f.equals(this.f4774f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4774f.hashCode() + ((this.f4772d.hashCode() + (this.f4773e * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0958A(this.f4772d, this.f4773e, null, this.f4774f);
    }
}
