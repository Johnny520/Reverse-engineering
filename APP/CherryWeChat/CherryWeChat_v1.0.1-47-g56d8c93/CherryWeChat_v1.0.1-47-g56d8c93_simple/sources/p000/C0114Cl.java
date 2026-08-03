package p000;

/* JADX INFO: renamed from: Cl */
/* JADX INFO: loaded from: classes.dex */
public final class C0114Cl extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C0114Cl f274c = null;

    static {
        f274c = new C0114Cl(C0329Hl.f1129a);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object r1) {
        return ((int[]) r1).length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va r3, int r4, Object r5) {
        C0028Al r52 = (C0028Al) r5;
        int r32 = r3.mo1780w(this.f7545b, r4);
        AbstractC2072iu.m4241c(r52);
        int[] r42 = r52.f61a;
        int r0 = r52.f62b;
        r52.f62b = r0 + 1;
        r42[r0] = r32;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object r2) {
        int[] r22 = (int[]) r2;
        C0028Al r0 = new C0028Al();
        r0.f61a = r22;
        r0.f62b = r22.length;
        r0.mo40b(10);
        return r0;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new int[0];
    }
}
