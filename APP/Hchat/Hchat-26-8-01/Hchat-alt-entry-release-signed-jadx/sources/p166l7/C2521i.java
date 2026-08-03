package p166l7;

import p257r7.C3716f;
import p285t7.C4135b;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: l7.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2521i extends C3716f {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C2521i) && this.f12083n == ((C2521i) obj).f12083n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f12083n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.C3716f
    public final String toString() {
        C2518f c2518f = (C2518f) m5554v(C2518f.class);
        C4135b c4135bM5917W = c2518f != null ? c2518f.m5917W(this.f12083n) : null;
        return c4135bM5917W != null ? c4135bM5917W.m8321a((C2518f) m5554v(C2518f.class), null) : AbstractC5999a.m10748k(this.f12083n, 8);
    }
}
