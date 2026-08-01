package p034G;

import p041H0.AbstractC0582a0;
import p058L.C0912N;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: G.e */
/* JADX INFO: loaded from: classes.dex */
final class C0460e extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C0912N f1363a;

    public C0460e(C0912N c0912n) {
        this.f1363a = c0912n;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C0463h(this.f1363a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0460e) {
            return this.f1363a == ((C0460e) obj).f1363a;
        }
        return false;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        ((C0463h) abstractC2206o).f1372t = this.f1363a;
    }

    public final int hashCode() {
        return this.f1363a.hashCode();
    }
}
