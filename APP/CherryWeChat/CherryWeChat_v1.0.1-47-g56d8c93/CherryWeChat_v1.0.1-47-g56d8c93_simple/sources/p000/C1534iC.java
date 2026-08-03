package p000;

/* JADX INFO: renamed from: iC */
/* JADX INFO: loaded from: classes.dex */
public final class C1534iC extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C1534iC f5417c = null;

    static {
        f5417c = new C1534iC(C2091jC.f7362a);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object r1) {
        return ((C1446gC) r1).f5055a.length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va r3, int r4, Object r5) {
        C1490hC r52 = (C1490hC) r5;
        int r32 = r3.mo1768b(this.f7545b, r4).mo846p();
        AbstractC2072iu.m4241c(r52);
        int[] r42 = r52.f5261a;
        int r0 = r52.f5262b;
        r52.f5262b = r0 + 1;
        r42[r0] = r32;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object r2) {
        int[] r22 = ((C1446gC) r2).f5055a;
        C1490hC r0 = new C1490hC();
        r0.f5261a = r22;
        r0.f5262b = r22.length;
        r0.mo40b(10);
        return r0;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new C1446gC(new int[0]);
    }
}
