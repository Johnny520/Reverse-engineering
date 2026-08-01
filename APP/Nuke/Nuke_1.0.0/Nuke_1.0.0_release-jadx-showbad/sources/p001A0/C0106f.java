package p001A0;

import p041H0.AbstractC0582a0;
import p169h0.AbstractC2206o;
import p170h1.AbstractC2219j;

/* JADX INFO: renamed from: A0.f */
/* JADX INFO: loaded from: classes.dex */
final class C0106f extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C0105e f474a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0106f(C0105e c0105e) {
        this.f474a = c0105e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C0110j(AbstractC2219j.f7254a, this.f474a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0106f)) {
            return false;
        }
        C0106f c0106f = (C0106f) obj;
        Object obj2 = AbstractC2219j.f7254a;
        return obj2.equals(obj2) && c0106f.f474a.equals(this.f474a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C0110j c0110j = (C0110j) abstractC2206o;
        c0110j.f484r = AbstractC2219j.f7254a;
        C0105e c0105e = c0110j.f485s;
        if (c0105e.f470a == c0110j) {
            c0105e.f470a = null;
        }
        C0105e c0105e2 = this.f474a;
        if (!c0105e2.equals(c0105e)) {
            c0110j.f485s = c0105e2;
        }
        if (c0110j.f7199q) {
            C0105e c0105e3 = c0110j.f485s;
            c0105e3.f470a = c0110j;
            c0105e3.f471b = null;
            c0110j.f486t = null;
            c0105e3.f472c = new C0102b(1, c0110j);
            c0105e3.f473d = c0110j.m4023x0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f474a.hashCode() + (AbstractC2219j.f7254a.hashCode() * 31);
    }
}
