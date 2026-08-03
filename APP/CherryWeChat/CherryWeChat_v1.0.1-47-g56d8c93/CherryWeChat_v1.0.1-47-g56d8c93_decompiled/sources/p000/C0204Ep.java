package p000;

/* JADX INFO: renamed from: Ep */
/* JADX INFO: loaded from: classes.dex */
public final class C0204Ep extends C0118Cp {

    /* JADX INFO: renamed from: d */
    public C1264cg f611d;

    @Override // p000.C0118Cp
    /* JADX INFO: renamed from: b */
    public final int mo187b(Object obj) {
        InterfaceC2389pw interfaceC2389pw = (InterfaceC2389pw) obj;
        if (interfaceC2389pw == null) {
            return 1;
        }
        return interfaceC2389pw.mo116b();
    }

    @Override // p000.C0118Cp
    /* JADX INFO: renamed from: c */
    public final void mo188c(Object obj, Object obj2) {
        InterfaceC2389pw interfaceC2389pw = (InterfaceC2389pw) obj2;
        C1264cg c1264cg = this.f611d;
        if (c1264cg == null || interfaceC2389pw == null) {
            return;
        }
        c1264cg.f4298e.m1986d(interfaceC2389pw, true);
    }
}
