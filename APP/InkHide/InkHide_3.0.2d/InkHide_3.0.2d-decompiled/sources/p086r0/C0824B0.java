package p086r0;

import java.lang.reflect.Method;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0824B0 {

    /* JADX INFO: renamed from: a */
    public final Object f2744a;

    /* JADX INFO: renamed from: b */
    public final Method f2745b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0824B0(Object obj, Method method) {
        AbstractC0223g.m418e(obj, "owner");
        this.f2744a = obj;
        this.f2745b = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0824B0)) {
            return false;
        }
        C0824B0 c0824b0 = (C0824B0) obj;
        return AbstractC0223g.m414a(this.f2744a, c0824b0.f2744a) && AbstractC0223g.m414a(this.f2745b, c0824b0.f2745b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2745b.hashCode() + (this.f2744a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Legacy6566RefreshCandidate(owner=" + this.f2744a + ", method=" + this.f2745b + ")";
    }
}
