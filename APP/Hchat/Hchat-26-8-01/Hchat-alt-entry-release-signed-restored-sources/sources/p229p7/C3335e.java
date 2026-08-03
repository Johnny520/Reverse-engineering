package p229p7;

import p257r7.C3716f;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: p7.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3335e extends C3331a {

    /* JADX INFO: renamed from: r */
    public final C3716f f10729r;

    /* JADX INFO: renamed from: s */
    public final C3716f f10730s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3335e() {
        super((short) 517);
        C3716f c3716f = new C3716f(false);
        this.f10729r = c3716f;
        C3716f c3716f2 = new C3716f(false);
        this.f10730s = c3716f2;
        m6539P(c3716f);
        m6539P(c3716f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p229p7.C3331a
    public final String toString() {
        if (m7051Q() != 17) {
            return super.toString();
        }
        return C3335e.class.getSimpleName() + " {flags=" + AbstractC5999a.m10748k(this.f10729r.f12083n, 8) + ", entryCount=" + this.f10730s + '}';
    }
}
