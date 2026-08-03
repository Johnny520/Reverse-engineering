package p000;

/* JADX INFO: renamed from: Ep */
/* JADX INFO: loaded from: classes.dex */
public final class C0204Ep extends C0118Cp {

    /* JADX INFO: renamed from: d */
    public C1264cg f611d;

    @Override // p000.C0118Cp
    /* JADX INFO: renamed from: b */
    public final int mo187b(Object r1) {
        InterfaceC2389pw r12 = (InterfaceC2389pw) r1;
        if (r12 != null) goto L7;
        return 1;
    L7:
        return r12.mo116b();
    }

    @Override // p000.C0118Cp
    /* JADX INFO: renamed from: c */
    public final void mo188c(Object r2, Object r3) {
        InterfaceC0802Sm r22 = (InterfaceC0802Sm) r2;
        InterfaceC2389pw r32 = (InterfaceC2389pw) r3;
        C1264cg r23 = this.f611d;
        if (r23 == null) goto L7;
        if (r32 == null) goto L8;
        r23.f4298e.m1986d(r32, true);
        return;
    L8:
        return;
    }
}
