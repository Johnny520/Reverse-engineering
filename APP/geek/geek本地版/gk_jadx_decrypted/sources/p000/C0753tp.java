package p000;

/* JADX INFO: renamed from: tp */
/* JADX INFO: loaded from: classes.dex */
public final class C0753tp extends AbstractC0716sp {

    /* JADX INFO: renamed from: e */
    public final C0864wp f4594e;

    /* JADX INFO: renamed from: f */
    public final C0790up f4595f;

    /* JADX INFO: renamed from: g */
    public final C0180ea f4596g;

    /* JADX INFO: renamed from: h */
    public final Object f4597h;

    public C0753tp(C0864wp c0864wp, C0790up c0790up, C0180ea c0180ea, Object obj) {
        this.f4594e = c0864wp;
        this.f4595f = c0790up;
        this.f4596g = c0180ea;
        this.f4597h = obj;
    }

    @Override // p000.InterfaceC0713sm
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo96f(Object obj) {
        mo647l((Throwable) obj);
        return C0819vh.f4855n;
    }

    @Override // p000.AbstractC0716sp
    /* JADX INFO: renamed from: l */
    public final void mo647l(Throwable th) {
        C0180ea c0180eaM2576D = C0864wp.m2576D(this.f4596g);
        C0864wp c0864wp = this.f4594e;
        C0790up c0790up = this.f4595f;
        Object obj = this.f4597h;
        if (c0180eaM2576D != null) {
            while (a80.m51p(c0180eaM2576D.f1765e, new C0753tp(c0864wp, c0790up, c0180eaM2576D, obj), 1) == C0537nw.f3454a) {
                c0180eaM2576D = C0864wp.m2576D(c0180eaM2576D);
                if (c0180eaM2576D == null) {
                }
            }
            return;
        }
        c0864wp.mo2454k(c0864wp.m2589s(c0790up, obj));
    }
}
