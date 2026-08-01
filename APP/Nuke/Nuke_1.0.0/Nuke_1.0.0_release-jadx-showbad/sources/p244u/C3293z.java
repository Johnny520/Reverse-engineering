package p244u;

import p041H0.AbstractC0582a0;
import p169h0.AbstractC2206o;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: u.z */
/* JADX INFO: loaded from: classes.dex */
public final class C3293z extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final EnumC3292y f10179a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3293z(EnumC3292y enumC3292y) {
        this.f10179a = enumC3292y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3232A c3232a = new C3232A();
        c3232a.f10021r = this.f10179a;
        c3232a.f10022s = 1.0f;
        return c3232a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3293z) {
            return this.f10179a == ((C3293z) obj).f10179a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C3232A c3232a = (C3232A) abstractC2206o;
        c3232a.f10021r = this.f10179a;
        c3232a.f10022s = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(1.0f) + (this.f10179a.hashCode() * 31);
    }
}
