package p197m;

import p011B4.AbstractC0231b;
import p203n.C2650d0;
import p211o0.C2741P;

/* JADX INFO: renamed from: m.U */
/* JADX INFO: loaded from: classes.dex */
public final class C2535U {

    /* JADX INFO: renamed from: a */
    public final float f8100a;

    /* JADX INFO: renamed from: b */
    public final long f8101b;

    /* JADX INFO: renamed from: c */
    public final C2650d0 f8102c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2535U(float f2, long j5, C2650d0 c2650d0) {
        this.f8100a = f2;
        this.f8101b = j5;
        this.f8102c = c2650d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2535U)) {
            return false;
        }
        C2535U c2535u = (C2535U) obj;
        return Float.compare(this.f8100a, c2535u.f8100a) == 0 && C2741P.m4806a(this.f8101b, c2535u.f8101b) && this.f8102c.equals(c2535u.f8102c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f8100a) * 31;
        int i5 = C2741P.f8721c;
        return this.f8102c.hashCode() + AbstractC0231b.m392c(iHashCode, 31, this.f8101b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Scale(scale=" + this.f8100a + ", transformOrigin=" + ((Object) C2741P.m4809d(this.f8101b)) + ", animationSpec=" + this.f8102c + ')';
    }
}
