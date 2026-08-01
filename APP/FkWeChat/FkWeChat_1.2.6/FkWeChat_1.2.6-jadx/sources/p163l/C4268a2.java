package p163l;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: l.a2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4268a2 implements InterfaceC4292f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4341o3 f12477a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4365t2 f12478b;

    /* JADX INFO: renamed from: c */
    public Object f12479c;

    /* JADX INFO: renamed from: d */
    public Object f12480d;

    /* JADX INFO: renamed from: e */
    public AbstractC4357s f12481e;

    /* JADX INFO: renamed from: f */
    public AbstractC4357s f12482f;

    /* JADX INFO: renamed from: g */
    public final AbstractC4357s f12483g;

    /* JADX INFO: renamed from: h */
    public long f12484h;

    /* JADX INFO: renamed from: i */
    public AbstractC4357s f12485i;

    public C4268a2(InterfaceC4341o3 interfaceC4341o3, InterfaceC4365t2 interfaceC4365t2, Object obj, Object obj2, AbstractC4357s abstractC4357s) {
        AbstractC4357s abstractC4357sM17119e;
        this.f12477a = interfaceC4341o3;
        this.f12478b = interfaceC4365t2;
        this.f12479c = obj2;
        this.f12480d = obj;
        this.f12481e = (AbstractC4357s) mo16773c().mo17122a().mo27m(obj);
        this.f12482f = (AbstractC4357s) mo16773c().mo17122a().mo27m(obj2);
        this.f12483g = (abstractC4357s == null || (abstractC4357sM17119e = AbstractC4362t.m17119e(abstractC4357s)) == null) ? AbstractC4362t.m17121g((AbstractC4357s) mo16773c().mo17122a().mo27m(obj)) : abstractC4357sM17119e;
        this.f12484h = -1L;
    }

    @Override // p163l.InterfaceC4292f
    /* JADX INFO: renamed from: a */
    public boolean mo16771a() {
        return this.f12477a.mo17002a();
    }

    @Override // p163l.InterfaceC4292f
    /* JADX INFO: renamed from: b */
    public long mo16772b() {
        if (this.f12484h < 0) {
            this.f12484h = this.f12477a.mo17003b(this.f12481e, this.f12482f, this.f12483g);
        }
        return this.f12484h;
    }

    @Override // p163l.InterfaceC4292f
    /* JADX INFO: renamed from: c */
    public InterfaceC4365t2 mo16773c() {
        return this.f12478b;
    }

    @Override // p163l.InterfaceC4292f
    /* JADX INFO: renamed from: d */
    public AbstractC4357s mo16774d(long j10) {
        return !m16848e(j10) ? this.f12477a.mo16780e(j10, this.f12481e, this.f12482f, this.f12483g) : m16777h();
    }

    @Override // p163l.InterfaceC4292f
    /* JADX INFO: renamed from: f */
    public Object mo16775f(long j10) {
        if (m16848e(j10)) {
            return mo16776g();
        }
        AbstractC4357s abstractC4357sMo16779d = this.f12477a.mo16779d(j10, this.f12481e, this.f12482f, this.f12483g);
        int iMo17033b = abstractC4357sMo16779d.mo17033b();
        for (int i10 = 0; i10 < iMo17033b; i10++) {
            if (Float.isNaN(abstractC4357sMo16779d.mo17032a(i10))) {
                AbstractC4294f1.m16850b("AnimationVector cannot contain a NaN. " + abstractC4357sMo16779d + ". Animation: " + this + ", playTimeNanos: " + j10);
            }
        }
        return mo16773c().mo17123b().mo27m(abstractC4357sMo16779d);
    }

    @Override // p163l.InterfaceC4292f
    /* JADX INFO: renamed from: g */
    public Object mo16776g() {
        return this.f12479c;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC4357s m16777h() {
        AbstractC4357s abstractC4357s = this.f12485i;
        if (abstractC4357s != null) {
            return abstractC4357s;
        }
        AbstractC4357s abstractC4357sMo17044c = this.f12477a.mo17044c(this.f12481e, this.f12482f, this.f12483g);
        this.f12485i = abstractC4357sMo17044c;
        return abstractC4357sMo17044c;
    }

    /* JADX INFO: renamed from: i */
    public final Object m16778i() {
        return this.f12480d;
    }

    public String toString() {
        return "TargetBasedAnimation: " + m16778i() + " -> " + mo16776g() + ",initial velocity: " + this.f12483g + ", duration: " + AbstractC4302h.m16932b(this) + " ms,animationSpec: " + this.f12477a;
    }

    public /* synthetic */ C4268a2(InterfaceC4317k interfaceC4317k, InterfaceC4365t2 interfaceC4365t2, Object obj, Object obj2, AbstractC4357s abstractC4357s, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC4317k, interfaceC4365t2, obj, obj2, (i10 & 16) != 0 ? null : abstractC4357s);
    }

    public C4268a2(InterfaceC4317k interfaceC4317k, InterfaceC4365t2 interfaceC4365t2, Object obj, Object obj2, AbstractC4357s abstractC4357s) {
        this(interfaceC4317k.mo16829a(interfaceC4365t2), interfaceC4365t2, obj, obj2, abstractC4357s);
    }
}
