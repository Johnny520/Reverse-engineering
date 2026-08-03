package p000;

/* JADX INFO: renamed from: ft */
/* JADX INFO: loaded from: classes.dex */
public final class C1426ft implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public final Object f5029a;

    public C1426ft() {
        this.f5029a = AbstractC0148Dc.m280n(2, new C1302d(this));
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc r4) {
        InterfaceC0126Cx r0 = getDescriptor();
        InterfaceC0919Va r42 = r4.mo839B(r0);
        int r1 = r42.mo1770j(getDescriptor());
        if (r1 != (-1)) goto L7;
        r42.mo1777r(r0);
        return C0829TC.f2620a;
    L7:
        throw new C0341Hx(AbstractC2374ph.m4812i(r1, "Unexpected index "));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Dn, java.lang.Object] */
    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return (InterfaceC0126Cx) this.f5029a.getValue();
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of r1, Object r2) {
        getDescriptor();
        throw null;
    }
}
