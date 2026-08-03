package p000;

/* JADX INFO: renamed from: sC */
/* JADX INFO: loaded from: classes.dex */
public final class C2492sC extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C2492sC f8755c = null;

    static {
        f8755c = new C2492sC(C2535tC.f8840a);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object r1) {
        return ((C2406qC) r1).f8440a.length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va r3, int r4, Object r5) {
        C2449rC r52 = (C2449rC) r5;
        short r32 = r3.mo1768b(this.f7545b, r4).mo849x();
        AbstractC2072iu.m4241c(r52);
        short[] r42 = r52.f8576a;
        int r0 = r52.f8577b;
        r52.f8577b = r0 + 1;
        r42[r0] = r32;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object r2) {
        short[] r22 = ((C2406qC) r2).f8440a;
        C2449rC r0 = new C2449rC();
        r0.f8576a = r22;
        r0.f8577b = r22.length;
        r0.mo40b(10);
        return r0;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new C2406qC(new short[0]);
    }
}
