package p244u;

import p041H0.AbstractC0582a0;
import p169h0.AbstractC2206o;
import p169h0.C2199h;

/* JADX INFO: renamed from: u.l */
/* JADX INFO: loaded from: classes.dex */
final class C3279l extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C2199h f10140a;

    /* JADX INFO: renamed from: b */
    public final boolean f10141b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3279l(C2199h c2199h, boolean z5) {
        this.f10140a = c2199h;
        this.f10141b = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3280m c3280m = new C3280m();
        c3280m.f10142r = this.f10140a;
        c3280m.f10143s = this.f10141b;
        return c3280m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C3279l c3279l = obj instanceof C3279l ? (C3279l) obj : null;
        return c3279l != null && this.f10140a.equals(c3279l.f10140a) && this.f10141b == c3279l.f10141b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C3280m c3280m = (C3280m) abstractC2206o;
        c3280m.f10142r = this.f10140a;
        c3280m.f10143s = this.f10141b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f10141b) + (this.f10140a.hashCode() * 31);
    }
}
