package p000;

/* JADX INFO: renamed from: qa */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2410qa extends AbstractC2522t {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0717Qm f8450a;

    public AbstractC2410qa(InterfaceC0717Qm interfaceC0717Qm) {
        this.f8450a = interfaceC0717Qm;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public void mo183e(InterfaceC0919Va interfaceC0919Va, int i, Object obj) {
        mo547h(i, obj, interfaceC0919Va.mo1779v(getDescriptor(), i, this.f8450a, null));
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo547h(int i, Object obj, Object obj2);

    @Override // p000.InterfaceC0717Qm
    public void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        mo182c(obj);
        getDescriptor();
        throw null;
    }
}
