package p081Q;

import p041H0.AbstractC0582a0;
import p041H0.AbstractC0601k;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: Q.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1162e extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C1160c f3806a;

    public C1162e(C1160c c1160c) {
        this.f3806a = c1160c;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C1161d c1161d = new C1161d();
        c1161d.f3805r = this.f3806a;
        return c1161d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1162e) {
            return this.f3806a == ((C1162e) obj).f3806a;
        }
        return false;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C1161d c1161d = (C1161d) abstractC2206o;
        c1161d.f3805r = this.f3806a;
        AbstractC0601k.m1036l(c1161d);
    }

    public final int hashCode() {
        return this.f3806a.hashCode();
    }
}
