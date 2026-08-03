package p000;

/* JADX INFO: renamed from: t7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2530t7 extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C2530t7 f8829c = null;

    static {
        f8829c = new C2530t7(C2616v7.f9071a);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object r1) {
        return ((char[]) r1).length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va r3, int r4, Object r5) {
        C2487s7 r52 = (C2487s7) r5;
        char r32 = r3.mo1772l(this.f7545b, r4);
        AbstractC2072iu.m4241c(r52);
        char[] r42 = r52.f8747a;
        int r0 = r52.f8748b;
        r52.f8748b = r0 + 1;
        r42[r0] = r32;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object r2) {
        char[] r22 = (char[]) r2;
        C2487s7 r0 = new C2487s7();
        r0.f8747a = r22;
        r0.f8748b = r22.length;
        r0.mo40b(10);
        return r0;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new char[0];
    }
}
