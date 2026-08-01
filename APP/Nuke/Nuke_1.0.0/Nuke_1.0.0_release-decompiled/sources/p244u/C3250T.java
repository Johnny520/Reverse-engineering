package p244u;

import p041H0.AbstractC0582a0;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: u.T */
/* JADX INFO: loaded from: classes.dex */
final class C3250T extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C3251U f10062a;

    public C3250T(C3251U c3251u) {
        this.f10062a = c3251u;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3252V c3252v = new C3252V();
        c3252v.f10067r = this.f10062a;
        return c3252v;
    }

    public final boolean equals(Object obj) {
        C3250T c3250t = obj instanceof C3250T ? (C3250T) obj : null;
        if (c3250t == null) {
            return false;
        }
        return AbstractC1665j.m2981a(this.f10062a, c3250t.f10062a);
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        ((C3252V) abstractC2206o).f10067r = this.f10062a;
    }

    public final int hashCode() {
        return this.f10062a.hashCode();
    }
}
