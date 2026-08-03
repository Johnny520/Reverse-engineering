package p229p7;

import p152k7.AbstractC2331a;
import p257r7.C3711a;
import p257r7.C3713c;
import p257r7.C3716f;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: p7.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3337g extends C3331a {

    /* JADX INFO: renamed from: r */
    public final C3713c f10739r;

    /* JADX INFO: renamed from: s */
    public final C3716f f10740s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3337g() {
        super((short) 514);
        C3713c c3713c = new C3713c(1, 1);
        this.f10739r = c3713c;
        AbstractC2331a c3713c2 = new C3713c(1, 1);
        AbstractC2331a c3711a = new C3711a(1, false);
        C3716f c3716f = new C3716f(false);
        this.f10740s = c3716f;
        m6539P(c3713c);
        m6539P(c3713c2);
        m6539P(c3711a);
        m6539P(c3716f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229p7.C3331a
    public final String toString() {
        if (m7051Q() != 14) {
            return super.toString();
        }
        return C3337g.class.getSimpleName() + " {id=" + AbstractC5999a.m10751n(this.f10739r.f12076k[0]) + ", entryCount=" + this.f10740s + '}';
    }
}
