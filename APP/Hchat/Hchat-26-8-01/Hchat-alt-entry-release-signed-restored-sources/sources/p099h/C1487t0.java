package p099h;

import gg.AbstractC1416l;
import p116i.InterfaceC1803y;

/* JADX INFO: renamed from: h.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1487t0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1803y f4938a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1487t0(InterfaceC1803y interfaceC1803y) {
        this.f4938a = interfaceC1803y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1487t0) {
            return Float.compare(0.0f, 0.0f) == 0 && AbstractC1416l.m3825a(this.f4938a, ((C1487t0) obj).f4938a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4938a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f4938a + ')';
    }
}
