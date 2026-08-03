package p000;

/* JADX INFO: renamed from: ku */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2164ku extends AbstractC2410qa {

    /* JADX INFO: renamed from: b */
    public final C2116ju f7545b;

    public AbstractC2164ku(InterfaceC0717Qm interfaceC0717Qm) {
        super(interfaceC0717Qm);
        this.f7545b = new C2116ju(interfaceC0717Qm.getDescriptor());
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: a */
    public final Object mo544a() {
        return (AbstractC2072iu) mo184f(mo185i());
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: b */
    public final int mo545b(Object obj) {
        return ((AbstractC2072iu) obj).mo41d();
    }

    @Override // p000.AbstractC2522t, p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        return m5004d(interfaceC0406Jc);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: g */
    public final Object mo546g(Object obj) {
        return ((AbstractC2072iu) obj).mo39a();
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return this.f7545b;
    }

    @Override // p000.AbstractC2410qa
    /* JADX INFO: renamed from: h */
    public final void mo547h(int i, Object obj, Object obj2) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo185i();

    @Override // p000.AbstractC2410qa, p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        mo182c(obj);
        throw null;
    }
}
