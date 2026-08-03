package p000;

/* JADX INFO: renamed from: qa */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2410qa extends AbstractC2522t {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0717Qm f8450a;

    public AbstractC2410qa(InterfaceC0717Qm r1) {
        this.f8450a = r1;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public void mo183e(InterfaceC0919Va r4, int r5, Object r6) {
        mo547h(r5, r6, r4.mo1779v(getDescriptor(), r5, this.f8450a, null));
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo547h(int r1, Object r2, Object r3);

    @Override // p000.InterfaceC0717Qm
    public void serialize(InterfaceC0624Of r1, Object r2) {
        mo182c(r2);
        getDescriptor();
        throw null;
    }
}
