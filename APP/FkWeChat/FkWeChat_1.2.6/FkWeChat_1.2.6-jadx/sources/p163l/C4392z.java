package p163l;

import p080f9.AbstractC2368o;

/* JADX INFO: renamed from: l.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4392z implements InterfaceC4292f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4351q3 f12858a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4365t2 f12859b;

    /* JADX INFO: renamed from: c */
    public final Object f12860c;

    /* JADX INFO: renamed from: d */
    public final AbstractC4357s f12861d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4357s f12862e;

    /* JADX INFO: renamed from: f */
    public final AbstractC4357s f12863f;

    /* JADX INFO: renamed from: g */
    public final Object f12864g;

    /* JADX INFO: renamed from: h */
    public final long f12865h;

    /* JADX INFO: renamed from: i */
    public final boolean f12866i;

    public C4392z(InterfaceC4351q3 interfaceC4351q3, InterfaceC4365t2 interfaceC4365t2, Object obj, AbstractC4357s abstractC4357s) {
        this.f12858a = interfaceC4351q3;
        this.f12859b = interfaceC4365t2;
        this.f12860c = obj;
        AbstractC4357s abstractC4357s2 = (AbstractC4357s) mo16773c().mo17122a().mo27m(obj);
        this.f12861d = abstractC4357s2;
        this.f12862e = AbstractC4362t.m17119e(abstractC4357s);
        this.f12864g = mo16773c().mo17123b().mo27m(interfaceC4351q3.mo17105d(abstractC4357s2, abstractC4357s));
        this.f12865h = interfaceC4351q3.mo17103b(abstractC4357s2, abstractC4357s);
        AbstractC4357s abstractC4357sM17119e = AbstractC4362t.m17119e(interfaceC4351q3.mo17104c(mo16772b(), abstractC4357s2, abstractC4357s));
        this.f12863f = abstractC4357sM17119e;
        int iMo17033b = abstractC4357sM17119e.mo17033b();
        for (int i10 = 0; i10 < iMo17033b; i10++) {
            AbstractC4357s abstractC4357s3 = this.f12863f;
            abstractC4357s3.mo17036e(i10, AbstractC2368o.m8585l(abstractC4357s3.mo17032a(i10), -this.f12858a.mo17102a(), this.f12858a.mo17102a()));
        }
    }

    @Override // p163l.InterfaceC4292f
    /* JADX INFO: renamed from: a */
    public boolean mo16771a() {
        return this.f12866i;
    }

    @Override // p163l.InterfaceC4292f
    /* JADX INFO: renamed from: b */
    public long mo16772b() {
        return this.f12865h;
    }

    @Override // p163l.InterfaceC4292f
    /* JADX INFO: renamed from: c */
    public InterfaceC4365t2 mo16773c() {
        return this.f12859b;
    }

    @Override // p163l.InterfaceC4292f
    /* JADX INFO: renamed from: d */
    public AbstractC4357s mo16774d(long j10) {
        return !m16848e(j10) ? this.f12858a.mo17104c(j10, this.f12861d, this.f12862e) : this.f12863f;
    }

    @Override // p163l.InterfaceC4292f
    /* JADX INFO: renamed from: f */
    public Object mo16775f(long j10) {
        return !m16848e(j10) ? mo16773c().mo17123b().mo27m(this.f12858a.mo17106e(j10, this.f12861d, this.f12862e)) : mo16776g();
    }

    @Override // p163l.InterfaceC4292f
    /* JADX INFO: renamed from: g */
    public Object mo16776g() {
        return this.f12864g;
    }

    public C4392z(InterfaceC4266a0 interfaceC4266a0, InterfaceC4365t2 interfaceC4365t2, Object obj, AbstractC4357s abstractC4357s) {
        this(interfaceC4266a0.mo16764a(interfaceC4365t2), interfaceC4365t2, obj, abstractC4357s);
    }
}
