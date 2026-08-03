package p000;

/* JADX INFO: renamed from: Zs */
/* JADX INFO: loaded from: classes.dex */
public final class C1109Zs implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public static final C1109Zs f3504a = null;

    /* JADX INFO: renamed from: b */
    public static final C1066Ys f3505b = null;

    static {
        f3504a = new C1109Zs();
        f3505b = C1066Ys.f3377a;
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc r2) {
        throw new C0341Hx("'kotlin.Nothing' does not have instances");
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return f3505b;
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of r1, Object r2) {
        Void r22 = (Void) r2;
        throw new C0341Hx("'kotlin.Nothing' cannot be serialized");
    }
}
