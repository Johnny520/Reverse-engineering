package p244u;

import p041H0.AbstractC0582a0;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: u.j */
/* JADX INFO: loaded from: classes.dex */
final class C3275j extends AbstractC0582a0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3277k c3277k = new C3277k();
        c3277k.f10117r = 1.0f;
        return c3277k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3275j ? (C3275j) obj : null) == null) {
            return false;
        }
        ((C3275j) obj).getClass();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        ((C3277k) abstractC2206o).f10117r = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(1.0f) * 31);
    }
}
