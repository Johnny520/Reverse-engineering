package p260x;

import p041H0.AbstractC0582a0;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: x.p */
/* JADX INFO: loaded from: classes.dex */
final class C3433p extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C3436s f10722a;

    public C3433p(C3436s c3436s) {
        this.f10722a = c3436s;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3434q c3434q = new C3434q();
        c3434q.f10723r = this.f10722a;
        return c3434q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3433p) && AbstractC1665j.m2981a(this.f10722a, ((C3433p) obj).f10722a);
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C3434q c3434q = (C3434q) abstractC2206o;
        C3436s c3436s = c3434q.f10723r;
        C3436s c3436s2 = this.f10722a;
        if (AbstractC1665j.m2981a(c3436s, c3436s2) || !c3434q.f7186d.f7199q) {
            return;
        }
        C3436s c3436s3 = c3434q.f10723r;
        c3436s3.m5701c();
        c3436s3.f10727b = null;
        c3434q.f10723r = c3436s2;
    }

    public final int hashCode() {
        return this.f10722a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.f10722a + ')';
    }
}
