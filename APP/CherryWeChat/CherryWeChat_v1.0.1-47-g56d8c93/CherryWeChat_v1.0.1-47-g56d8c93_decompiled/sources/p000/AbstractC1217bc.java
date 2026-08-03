package p000;

/* JADX INFO: renamed from: bc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1217bc extends AbstractC2608v implements InterfaceC1049Yb {
    public AbstractC1217bc() {
        super(C1456gf.f5158b);
    }

    @Override // p000.AbstractC2608v, p000.InterfaceC1137ac
    /* JADX INFO: renamed from: m */
    public final InterfaceC1049Yb mo24m(InterfaceC1092Zb interfaceC1092Zb) {
        if (!(interfaceC1092Zb instanceof AbstractC2651w)) {
            if (C1456gf.f5158b == interfaceC1092Zb) {
                return this;
            }
            return null;
        }
        if (this.f8994a != ((AbstractC2651w) interfaceC1092Zb)) {
            return null;
        }
        throw null;
    }

    @Override // p000.AbstractC2608v, p000.InterfaceC1137ac
    /* JADX INFO: renamed from: s */
    public final InterfaceC1137ac mo26s(InterfaceC1092Zb interfaceC1092Zb) {
        if (!(interfaceC1092Zb instanceof AbstractC2651w)) {
            return C1456gf.f5158b == interfaceC1092Zb ? C0366If.f1247a : this;
        }
        if (this.f8994a != ((AbstractC2651w) interfaceC1092Zb)) {
            return this;
        }
        throw null;
    }

    /* JADX INFO: renamed from: t */
    public abstract void mo1781t(InterfaceC1137ac interfaceC1137ac, Runnable runnable);

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0148Dc.m278l(this);
    }

    /* JADX INFO: renamed from: u */
    public boolean mo2333u(InterfaceC1137ac interfaceC1137ac) {
        return !(this instanceof AbstractC2578uC);
    }

    /* JADX INFO: renamed from: v */
    public AbstractC1217bc mo2018v(int i) {
        AbstractC0628Oj.m1240i(i);
        return new C1377eo(this, i);
    }
}
