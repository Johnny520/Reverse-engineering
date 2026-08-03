package p174m;

import p000a.AbstractC0000a;
import p012ah.C0086a;
import p249qg.AbstractC3597s;
import p249qg.C3564g;
import p277t.C4074f;

/* JADX INFO: renamed from: m.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2610i {

    /* JADX INFO: renamed from: a */
    public final C4074f f8467a;

    /* JADX INFO: renamed from: b */
    public final C3564g f8468b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2610i(C4074f c4074f, C3564g c3564g) {
        this.f8467a = c4074f;
        this.f8468b = c3564g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C3564g c3564g = this.f8468b;
        if (c3564g.f11567k.mo2062s(AbstractC3597s.f11610h) != null) {
            C0086a.m445d();
            return null;
        }
        StringBuilder sb2 = new StringBuilder("Request@");
        int iHashCode = hashCode();
        AbstractC0000a.m96w(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb2.append(string);
        sb2.append("(currentBounds()=");
        sb2.append(this.f8467a.invoke());
        sb2.append(", continuation=");
        sb2.append(c3564g);
        sb2.append(')');
        return sb2.toString();
    }
}
