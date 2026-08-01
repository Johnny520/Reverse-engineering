package p000;

/* JADX INFO: renamed from: h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0280h implements InterfaceC0221fe {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0258ge f2067a;

    public AbstractC0280h(InterfaceC0258ge interfaceC0258ge) {
        this.f2067a = interfaceC0258ge;
    }

    @Override // p000.InterfaceC0295he
    /* JADX INFO: renamed from: b */
    public InterfaceC0221fe mo447b(InterfaceC0258ge interfaceC0258ge) {
        AbstractC0493mp.m1857g("key", interfaceC0258ge);
        if (AbstractC0493mp.m1853c(getKey(), interfaceC0258ge)) {
            return this;
        }
        return null;
    }

    @Override // p000.InterfaceC0295he
    /* JADX INFO: renamed from: g */
    public InterfaceC0295he mo448g(InterfaceC0258ge interfaceC0258ge) {
        return g80.m1211z(this, interfaceC0258ge);
    }

    @Override // p000.InterfaceC0221fe
    public final InterfaceC0258ge getKey() {
        return this.f2067a;
    }

    @Override // p000.InterfaceC0295he
    /* JADX INFO: renamed from: h */
    public final Object mo449h(Object obj, InterfaceC0935ym interfaceC0935ym) {
        return interfaceC0935ym.mo36e(obj, this);
    }

    @Override // p000.InterfaceC0295he
    /* JADX INFO: renamed from: i */
    public final InterfaceC0295he mo450i(InterfaceC0295he interfaceC0295he) {
        return g80.m1172C(this, interfaceC0295he);
    }
}
