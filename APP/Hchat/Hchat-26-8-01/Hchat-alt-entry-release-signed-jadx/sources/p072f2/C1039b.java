package p072f2;

import p085fg.InterfaceC1231l;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: f2.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1039b extends AbstractC5658x0 implements InterfaceC1051n {

    /* JADX INFO: renamed from: a */
    public final boolean f3271a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1231l f3272b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1039b(boolean z9, InterfaceC1231l interfaceC1231l) {
        this.f3271a = z9;
        this.f3272b = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p072f2.InterfaceC1051n
    /* JADX INFO: renamed from: e */
    public final C1050m mo2642e() {
        C1050m c1050m = new C1050m();
        c1050m.f3343i = this.f3271a;
        this.f3272b.invoke(c1050m);
        return c1050m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1039b)) {
            return false;
        }
        C1039b c1039b = (C1039b) obj;
        return this.f3271a == c1039b.f3271a && this.f3272b == c1039b.f3272b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C1042e(this.f3271a, false, this.f3272b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C1042e c1042e = (C1042e) abstractC5852n;
        c1042e.f3276u = this.f3271a;
        c1042e.f3278w = this.f3272b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3272b.hashCode() + (Boolean.hashCode(this.f3271a) * 31);
    }
}
