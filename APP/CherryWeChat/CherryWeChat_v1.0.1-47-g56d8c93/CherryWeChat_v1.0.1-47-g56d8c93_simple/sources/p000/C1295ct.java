package p000;

/* JADX INFO: renamed from: ct */
/* JADX INFO: loaded from: classes.dex */
public final class C1295ct implements InterfaceC0717Qm {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0717Qm f4731a;

    /* JADX INFO: renamed from: b */
    public final C0169Dx f4732b;

    public C1295ct(InterfaceC0717Qm r2) {
        this.f4731a = r2;
        this.f4732b = new C0169Dx(r2.getDescriptor());
    }

    @Override // p000.InterfaceC0717Qm
    public final Object deserialize(InterfaceC0406Jc r2) {
        if (r2.mo843f() == true) goto L5;
        return null;
    L5:
        return r2.mo845h(this.f4731a);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L14:
        return false;
    L8:
        if (C1295ct.class != r5.getClass()) goto L14;
        if (AbstractC0585Nj.m1134a(this.f4731a, ((C1295ct) r5).f4731a) == true) goto L13;
        return false;
    L13:
        return true;
    }

    @Override // p000.InterfaceC0717Qm
    public final InterfaceC0126Cx getDescriptor() {
        return this.f4732b;
    }

    public final int hashCode() {
        return this.f4731a.hashCode();
    }

    @Override // p000.InterfaceC0717Qm
    public final void serialize(InterfaceC0624Of r1, Object r2) {
        r2.getClass();
        throw null;
    }
}
