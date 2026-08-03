package p000;

/* JADX INFO: renamed from: ct */
/* JADX INFO: loaded from: classes.dex */
public final class C1295ct implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0717Qm f4731a;

    /* JADX INFO: renamed from: b */
    public final C0169Dx f4732b;

    public C1295ct(InterfaceC0717Qm interfaceC0717Qm) {
        this.f4731a = interfaceC0717Qm;
        this.f4732b = new C0169Dx(interfaceC0717Qm.getDescriptor());
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc interfaceC0406Jc) {
        if (interfaceC0406Jc.mo843f()) {
            return interfaceC0406Jc.mo845h(this.f4731a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1295ct.class == obj.getClass() && AbstractC0585Nj.m1134a(this.f4731a, ((C1295ct) obj).f4731a);
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return this.f4732b;
    }

    public final int hashCode() {
        return this.f4731a.hashCode();
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of interfaceC0624Of, Object obj) {
        obj.getClass();
        throw null;
    }
}
