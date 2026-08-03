package p000;

/* JADX INFO: renamed from: T5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0822T5 extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C0822T5 f2594c = null;

    static {
        f2594c = new C0822T5(C0865U5.f2734a);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object r1) {
        return ((boolean[]) r1).length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va r3, int r4, Object r5) {
        C0736R5 r52 = (C0736R5) r5;
        boolean r32 = r3.mo1778s(this.f7545b, r4);
        AbstractC2072iu.m4241c(r52);
        boolean[] r42 = r52.f2348a;
        int r0 = r52.f2349b;
        r52.f2349b = r0 + 1;
        r42[r0] = r32;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object r2) {
        boolean[] r22 = (boolean[]) r2;
        C0736R5 r0 = new C0736R5();
        r0.f2348a = r22;
        r0.f2349b = r22.length;
        r0.mo40b(10);
        return r0;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new boolean[0];
    }
}
