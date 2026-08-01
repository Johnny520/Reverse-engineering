package p244u;

import p041H0.AbstractC0582a0;
import p169h0.AbstractC2206o;
import p169h0.C2197f;

/* JADX INFO: renamed from: u.C */
/* JADX INFO: loaded from: classes.dex */
public final class C3234C extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C2197f f10023a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3234C(C2197f c2197f) {
        this.f10023a = c2197f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3235D c3235d = new C3235D();
        c3235d.f10024r = this.f10023a;
        return c3235d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C3234C c3234c = obj instanceof C3234C ? (C3234C) obj : null;
        if (c3234c == null) {
            return false;
        }
        return this.f10023a.equals(c3234c.f10023a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        ((C3235D) abstractC2206o).f10024r = this.f10023a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10023a.f7176a);
    }
}
