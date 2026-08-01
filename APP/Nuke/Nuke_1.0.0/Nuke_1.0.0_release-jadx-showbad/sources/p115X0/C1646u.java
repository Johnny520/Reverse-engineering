package p115X0;

import p011B4.AbstractC0231b;
import p092S0.AbstractC1251D;
import p092S0.C1259L;
import p092S0.C1269g;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: X0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1646u {

    /* JADX INFO: renamed from: a */
    public final C1269g f5650a;

    /* JADX INFO: renamed from: b */
    public final long f5651b;

    /* JADX INFO: renamed from: c */
    public final C1259L f5652c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1646u(C1269g c1269g, long j5, C1259L c1259l) {
        this.f5650a = c1269g;
        this.f5651b = AbstractC1251D.m2314c(j5, c1269g.f4563e.length());
        this.f5652c = c1259l != null ? new C1259L(AbstractC1251D.m2314c(c1259l.f4538a, c1269g.f4563e.length())) : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1646u m2944a(C1646u c1646u, C1269g c1269g, long j5, int i5) {
        if ((i5 & 1) != 0) {
            c1269g = c1646u.f5650a;
        }
        if ((i5 & 2) != 0) {
            j5 = c1646u.f5651b;
        }
        C1259L c1259l = (i5 & 4) != 0 ? c1646u.f5652c : null;
        c1646u.getClass();
        return new C1646u(c1269g, j5, c1259l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1646u)) {
            return false;
        }
        C1646u c1646u = (C1646u) obj;
        return C1259L.m2334b(this.f5651b, c1646u.f5651b) && AbstractC1665j.m2981a(this.f5652c, c1646u.f5652c) && AbstractC1665j.m2981a(this.f5650a, c1646u.f5650a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f5650a.hashCode() * 31;
        int i5 = C1259L.f4537c;
        int iM392c = AbstractC0231b.m392c(iHashCode, 31, this.f5651b);
        C1259L c1259l = this.f5652c;
        return iM392c + (c1259l != null ? Long.hashCode(c1259l.f4538a) : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f5650a) + "', selection=" + ((Object) C1259L.m2340h(this.f5651b)) + ", composition=" + this.f5652c + ')';
    }

    public C1646u(String str, long j5, int i5) {
        this(new C1269g((i5 & 1) != 0 ? "" : str), (i5 & 2) != 0 ? C1259L.f4536b : j5, (C1259L) null);
    }
}
