package p163l;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: l.t3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4366t3 implements InterfaceC4361s3 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4367u f12777a;

    /* JADX INFO: renamed from: b */
    public AbstractC4357s f12778b;

    /* JADX INFO: renamed from: c */
    public AbstractC4357s f12779c;

    /* JADX INFO: renamed from: d */
    public AbstractC4357s f12780d;

    /* JADX INFO: renamed from: l.t3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC4367u {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC4308i0 f12781a;

        public a(InterfaceC4308i0 interfaceC4308i0) {
            this.f12781a = interfaceC4308i0;
        }

        @Override // p163l.InterfaceC4367u
        public InterfaceC4308i0 get(int i10) {
            return this.f12781a;
        }
    }

    public C4366t3(InterfaceC4308i0 interfaceC4308i0) {
        this(new a(interfaceC4308i0));
    }

    @Override // p163l.InterfaceC4341o3
    /* JADX INFO: renamed from: b */
    public long mo17003b(AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        int iMo17033b = abstractC4357s.mo17033b();
        long jMax = 0;
        for (int i10 = 0; i10 < iMo17033b; i10++) {
            jMax = Math.max(jMax, this.f12777a.get(i10).mo16936c(abstractC4357s.mo17032a(i10), abstractC4357s2.mo17032a(i10), abstractC4357s3.mo17032a(i10)));
        }
        return jMax;
    }

    @Override // p163l.InterfaceC4341o3
    /* JADX INFO: renamed from: c */
    public AbstractC4357s mo17044c(AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        AbstractC4357s abstractC4357s4;
        if (this.f12780d == null) {
            this.f12780d = AbstractC4362t.m17121g(abstractC4357s3);
        }
        AbstractC4357s abstractC4357s5 = this.f12780d;
        if (abstractC4357s5 == null) {
            AbstractC1061t.m3851l("endVelocityVector");
            abstractC4357s5 = null;
        }
        int iMo17033b = abstractC4357s5.mo17033b();
        int i10 = 0;
        while (true) {
            abstractC4357s4 = this.f12780d;
            if (i10 >= iMo17033b) {
                break;
            }
            if (abstractC4357s4 == null) {
                AbstractC1061t.m3851l("endVelocityVector");
                abstractC4357s4 = null;
            }
            abstractC4357s4.mo17036e(i10, this.f12777a.get(i10).mo16937d(abstractC4357s.mo17032a(i10), abstractC4357s2.mo17032a(i10), abstractC4357s3.mo17032a(i10)));
            i10++;
        }
        if (abstractC4357s4 != null) {
            return abstractC4357s4;
        }
        AbstractC1061t.m3851l("endVelocityVector");
        return null;
    }

    @Override // p163l.InterfaceC4341o3
    /* JADX INFO: renamed from: d */
    public AbstractC4357s mo16779d(long j10, AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        AbstractC4357s abstractC4357s4;
        if (this.f12778b == null) {
            this.f12778b = AbstractC4362t.m17121g(abstractC4357s);
        }
        AbstractC4357s abstractC4357s5 = this.f12778b;
        if (abstractC4357s5 == null) {
            AbstractC1061t.m3851l("valueVector");
            abstractC4357s5 = null;
        }
        int iMo17033b = abstractC4357s5.mo17033b();
        int i10 = 0;
        while (true) {
            abstractC4357s4 = this.f12778b;
            if (i10 >= iMo17033b) {
                break;
            }
            if (abstractC4357s4 == null) {
                AbstractC1061t.m3851l("valueVector");
                abstractC4357s4 = null;
            }
            abstractC4357s4.mo17036e(i10, this.f12777a.get(i10).mo16938e(j10, abstractC4357s.mo17032a(i10), abstractC4357s2.mo17032a(i10), abstractC4357s3.mo17032a(i10)));
            i10++;
        }
        if (abstractC4357s4 != null) {
            return abstractC4357s4;
        }
        AbstractC1061t.m3851l("valueVector");
        return null;
    }

    @Override // p163l.InterfaceC4341o3
    /* JADX INFO: renamed from: e */
    public AbstractC4357s mo16780e(long j10, AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2, AbstractC4357s abstractC4357s3) {
        AbstractC4357s abstractC4357s4;
        if (this.f12779c == null) {
            this.f12779c = AbstractC4362t.m17121g(abstractC4357s3);
        }
        AbstractC4357s abstractC4357s5 = this.f12779c;
        if (abstractC4357s5 == null) {
            AbstractC1061t.m3851l("velocityVector");
            abstractC4357s5 = null;
        }
        int iMo17033b = abstractC4357s5.mo17033b();
        int i10 = 0;
        while (true) {
            abstractC4357s4 = this.f12779c;
            if (i10 >= iMo17033b) {
                break;
            }
            if (abstractC4357s4 == null) {
                AbstractC1061t.m3851l("velocityVector");
                abstractC4357s4 = null;
            }
            abstractC4357s4.mo17036e(i10, this.f12777a.get(i10).mo16935b(j10, abstractC4357s.mo17032a(i10), abstractC4357s2.mo17032a(i10), abstractC4357s3.mo17032a(i10)));
            i10++;
        }
        if (abstractC4357s4 != null) {
            return abstractC4357s4;
        }
        AbstractC1061t.m3851l("velocityVector");
        return null;
    }

    public C4366t3(InterfaceC4367u interfaceC4367u) {
        this.f12777a = interfaceC4367u;
    }
}
