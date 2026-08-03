package p000;

/* JADX INFO: renamed from: iy */
/* JADX INFO: loaded from: classes.dex */
public final class C2076iy extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C2076iy f7331c = null;

    static {
        f7331c = new C2076iy(C2120jy.f7449a);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object r1) {
        return ((short[]) r1).length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va r3, int r4, Object r5) {
        C1519hy r52 = (C1519hy) r5;
        short r32 = r3.mo1776q(this.f7545b, r4);
        AbstractC2072iu.m4241c(r52);
        short[] r42 = r52.f5375a;
        int r0 = r52.f5376b;
        r52.f5376b = r0 + 1;
        r42[r0] = r32;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object r2) {
        short[] r22 = (short[]) r2;
        C1519hy r0 = new C1519hy();
        r0.f5375a = r22;
        r0.f5376b = r22.length;
        r0.mo40b(10);
        return r0;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new short[0];
    }
}
