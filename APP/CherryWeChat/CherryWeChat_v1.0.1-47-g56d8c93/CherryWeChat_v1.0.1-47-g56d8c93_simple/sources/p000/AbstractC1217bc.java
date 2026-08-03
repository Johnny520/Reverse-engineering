package p000;

/* JADX INFO: renamed from: bc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1217bc extends AbstractC2608v implements InterfaceC1049Yb {
    public AbstractC1217bc() {
        super(C1456gf.f5158b);
    }

    @Override // p000.AbstractC2608v, p000.InterfaceC1137ac
    /* JADX INFO: renamed from: m */
    public final InterfaceC1049Yb mo24m(InterfaceC1092Zb r3) {
        if ((r3 instanceof AbstractC2651w) == false) goto L10;
        AbstractC2651w r32 = (AbstractC2651w) r3;
        if (this.f8994a == r32) goto L8;
        return null;
    L8:
        throw null;
    L10:
        if (C1456gf.f5158b != r3) goto L12;
        return this;
    L12:
        return null;
    }

    @Override // p000.AbstractC2608v, p000.InterfaceC1137ac
    /* JADX INFO: renamed from: s */
    public final InterfaceC1137ac mo26s(InterfaceC1092Zb r2) {
        if ((r2 instanceof AbstractC2651w) == false) goto L10;
        AbstractC2651w r22 = (AbstractC2651w) r2;
        if (this.f8994a == r22) goto L8;
        return this;
    L8:
        throw null;
    L10:
        if (C1456gf.f5158b == r2) goto L12;
        return this;
    L12:
        return C0366If.f1247a;
    }

    /* JADX INFO: renamed from: t */
    public abstract void mo1781t(InterfaceC1137ac r1, Runnable r2);

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0148Dc.m278l(this);
    }

    /* JADX INFO: renamed from: u */
    public boolean mo2333u(InterfaceC1137ac r1) {
        return !(this instanceof AbstractC2578uC);
    }

    /* JADX INFO: renamed from: v */
    public AbstractC1217bc mo2018v(int r2) {
        AbstractC0628Oj.m1240i(r2);
        return new C1377eo(this, r2);
    }
}
