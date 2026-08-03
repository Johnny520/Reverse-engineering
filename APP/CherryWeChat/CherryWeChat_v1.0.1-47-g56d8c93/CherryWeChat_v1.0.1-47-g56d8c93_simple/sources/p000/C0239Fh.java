package p000;

/* JADX INFO: renamed from: Fh */
/* JADX INFO: loaded from: classes.dex */
public final class C0239Fh extends AbstractC2164ku {

    /* JADX INFO: renamed from: c */
    public static final C0239Fh f794c = null;

    static {
        f794c = new C0239Fh(C0282Gh.f908a);
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: c */
    public final int mo182c(Object r1) {
        return ((float[]) r1).length;
    }

    @Override // p000.AbstractC2410qa, p000.AbstractC2522t
    /* JADX INFO: renamed from: e */
    public final void mo183e(InterfaceC0919Va r3, int r4, Object r5) {
        C0153Dh r52 = (C0153Dh) r5;
        float r32 = r3.mo1773m(this.f7545b, r4);
        AbstractC2072iu.m4241c(r52);
        float[] r42 = r52.f410a;
        int r0 = r52.f411b;
        r52.f411b = r0 + 1;
        r42[r0] = r32;
    }

    @Override // p000.AbstractC2522t
    /* JADX INFO: renamed from: f */
    public final Object mo184f(Object r2) {
        float[] r22 = (float[]) r2;
        C0153Dh r0 = new C0153Dh();
        r0.f410a = r22;
        r0.f411b = r22.length;
        r0.mo40b(10);
        return r0;
    }

    @Override // p000.AbstractC2164ku
    /* JADX INFO: renamed from: i */
    public final Object mo185i() {
        return new float[0];
    }
}
