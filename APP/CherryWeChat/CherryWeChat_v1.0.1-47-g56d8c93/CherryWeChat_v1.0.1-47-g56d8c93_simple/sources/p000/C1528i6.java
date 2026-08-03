package p000;

/* JADX INFO: renamed from: i6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1528i6 extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C1528i6 f5411c = null;

    static {
        f5411c = new C1528i6(C2572u6.f8919a);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object r1) {
        return ((byte[]) r1).length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va r3, int r4, Object r5) {
        C1396f6 r52 = (C1396f6) r5;
        byte r32 = r3.mo1774n(this.f7545b, r4);
        AbstractC2072iu.m4241c(r52);
        byte[] r42 = r52.f4958a;
        int r0 = r52.f4959b;
        r52.f4959b = r0 + 1;
        r42[r0] = r32;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object r2) {
        byte[] r22 = (byte[]) r2;
        C1396f6 r0 = new C1396f6();
        r0.f4958a = r22;
        r0.f4959b = r22.length;
        r0.mo40b(10);
        return r0;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new byte[0];
    }
}
