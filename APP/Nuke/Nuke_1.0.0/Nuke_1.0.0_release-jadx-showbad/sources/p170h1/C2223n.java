package p170h1;

import p007B0.C0175H;
import p041H0.AbstractC0582a0;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: h1.n */
/* JADX INFO: loaded from: classes.dex */
final class C2223n extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C0175H f7274a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2223n(C0175H c0175h) {
        this.f7274a = c0175h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C2224o(this.f7274a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2223n) {
            return this.f7274a == ((C2223n) obj).f7274a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C2224o c2224o = (C2224o) abstractC2206o;
        C0175H c0175h = this.f7274a;
        c2224o.f7275r = c0175h;
        if (c2224o.f7199q) {
            c0175h.mo1h(c2224o.f7276s);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f7274a.hashCode();
    }
}
