package p000;

/* JADX INFO: renamed from: xp */
/* JADX INFO: loaded from: classes.dex */
public final class C0901xp extends AbstractC0864wp {

    /* JADX INFO: renamed from: e */
    public final C0040aq f5285e;

    /* JADX INFO: renamed from: f */
    public final C0938yp f5286f;

    /* JADX INFO: renamed from: g */
    public final C0478ma f5287g;

    /* JADX INFO: renamed from: h */
    public final Object f5288h;

    public C0901xp(C0040aq c0040aq, C0938yp c0938yp, C0478ma c0478ma, Object obj) {
        this.f5285e = c0040aq;
        this.f5286f = c0938yp;
        this.f5287g = c0478ma;
        this.f5288h = obj;
    }

    @Override // p000.InterfaceC0786um
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo26f(Object obj) {
        mo1671l((Throwable) obj);
        return C0893xh.f5258n;
    }

    @Override // p000.AbstractC0864wp
    /* JADX INFO: renamed from: l */
    public final void mo1671l(Throwable th) {
        C0478ma c0478maM436D = C0040aq.m436D(this.f5287g);
        C0040aq c0040aq = this.f5285e;
        C0938yp c0938yp = this.f5286f;
        Object obj = this.f5288h;
        if (c0478maM436D != null) {
            while (g80.m1203r(c0478maM436D.f3116e, new C0901xp(c0040aq, c0938yp, c0478maM436D, obj), 1) == C0833vw.f5012a) {
                c0478maM436D = C0040aq.m436D(c0478maM436D);
                if (c0478maM436D == null) {
                }
            }
            return;
        }
        c0040aq.mo452k(c0040aq.m460s(c0938yp, obj));
    }
}
