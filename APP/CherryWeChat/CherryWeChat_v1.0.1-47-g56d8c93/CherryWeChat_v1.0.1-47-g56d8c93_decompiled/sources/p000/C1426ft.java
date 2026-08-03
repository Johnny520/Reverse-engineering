package p000;

/* JADX INFO: renamed from: ft */
/* JADX INFO: loaded from: classes.dex */
public final class C1426ft implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public final Object f5029a = AbstractC0148Dc.m280n(2, new C1302d(this));

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        InterfaceC0126Cx descriptor = getDescriptor();
        InterfaceC0919Va interfaceC0919VaMo839B = interfaceC0406Jc.mo839B(descriptor);
        int iMo1770j = interfaceC0919VaMo839B.mo1770j(getDescriptor());
        if (iMo1770j != -1) {
            throw new C0341Hx(AbstractC2374ph.m4812i(iMo1770j, "Unexpected index "));
        }
        interfaceC0919VaMo839B.mo1777r(descriptor);
        return C0829TC.f2620a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Dn, java.lang.Object] */
    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return (InterfaceC0126Cx) this.f5029a.getValue();
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        getDescriptor();
        throw null;
    }
}
