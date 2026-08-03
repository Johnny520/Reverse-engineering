package p000;

/* JADX INFO: renamed from: VC */
/* JADX INFO: loaded from: classes.dex */
public final class C0915VC implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: b */
    public static final C0915VC f2855b = null;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1426ft f2856a;

    static {
        f2855b = new C0915VC();
    }

    public C0915VC() {
        this.f2856a = new C1426ft();
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc r2) {
        this.f2856a.deserialize(r2);
        return C0829TC.f2620a;
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return this.f2856a.getDescriptor();
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of r1, Object r2) {
        C0829TC r22 = (C0829TC) r2;
        this.f2856a.getDescriptor();
        throw null;
    }
}
