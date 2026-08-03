package p072f2;

import p085fg.InterfaceC1231l;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: f2.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1040c extends AbstractC5658x0 implements InterfaceC1051n {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1231l f3273a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1040c(InterfaceC1231l interfaceC1231l) {
        this.f3273a = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p072f2.InterfaceC1051n
    /* JADX INFO: renamed from: e */
    public final C1050m mo2642e() {
        C1050m c1050m = new C1050m();
        c1050m.f3343i = false;
        c1050m.f3344j = true;
        this.f3273a.invoke(c1050m);
        return c1050m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1040c) {
            return this.f3273a == ((C1040c) obj).f3273a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C1042e(false, true, this.f3273a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        ((C1042e) abstractC5852n).f3278w = this.f3273a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f3273a.hashCode();
    }
}
