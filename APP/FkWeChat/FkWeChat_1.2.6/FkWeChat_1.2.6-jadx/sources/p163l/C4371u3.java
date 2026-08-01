package p163l;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: l.u3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4371u3 implements InterfaceC4351q3 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4313j0 f12788a;

    /* JADX INFO: renamed from: b */
    public AbstractC4357s f12789b;

    /* JADX INFO: renamed from: c */
    public AbstractC4357s f12790c;

    /* JADX INFO: renamed from: d */
    public AbstractC4357s f12791d;

    /* JADX INFO: renamed from: e */
    public final float f12792e;

    public C4371u3(InterfaceC4313j0 interfaceC4313j0) {
        this.f12788a = interfaceC4313j0;
        this.f12792e = interfaceC4313j0.mo15444a();
    }

    @Override // p163l.InterfaceC4351q3
    /* JADX INFO: renamed from: a */
    public float mo17102a() {
        return this.f12792e;
    }

    @Override // p163l.InterfaceC4351q3
    /* JADX INFO: renamed from: b */
    public long mo17103b(AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2) {
        if (this.f12790c == null) {
            this.f12790c = AbstractC4362t.m17121g(abstractC4357s);
        }
        AbstractC4357s abstractC4357s3 = this.f12790c;
        if (abstractC4357s3 == null) {
            AbstractC1061t.m3851l("velocityVector");
            abstractC4357s3 = null;
        }
        int iMo17033b = abstractC4357s3.mo17033b();
        long jMax = 0;
        for (int i10 = 0; i10 < iMo17033b; i10++) {
            jMax = Math.max(jMax, this.f12788a.mo15446c(abstractC4357s.mo17032a(i10), abstractC4357s2.mo17032a(i10)));
        }
        return jMax;
    }

    @Override // p163l.InterfaceC4351q3
    /* JADX INFO: renamed from: c */
    public AbstractC4357s mo17104c(long j10, AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2) {
        AbstractC4357s abstractC4357s3;
        if (this.f12790c == null) {
            this.f12790c = AbstractC4362t.m17121g(abstractC4357s);
        }
        AbstractC4357s abstractC4357s4 = this.f12790c;
        if (abstractC4357s4 == null) {
            AbstractC1061t.m3851l("velocityVector");
            abstractC4357s4 = null;
        }
        int iMo17033b = abstractC4357s4.mo17033b();
        int i10 = 0;
        while (true) {
            abstractC4357s3 = this.f12790c;
            if (i10 >= iMo17033b) {
                break;
            }
            if (abstractC4357s3 == null) {
                AbstractC1061t.m3851l("velocityVector");
                abstractC4357s3 = null;
            }
            abstractC4357s3.mo17036e(i10, this.f12788a.mo15445b(j10, abstractC4357s.mo17032a(i10), abstractC4357s2.mo17032a(i10)));
            i10++;
        }
        if (abstractC4357s3 != null) {
            return abstractC4357s3;
        }
        AbstractC1061t.m3851l("velocityVector");
        return null;
    }

    @Override // p163l.InterfaceC4351q3
    /* JADX INFO: renamed from: d */
    public AbstractC4357s mo17105d(AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2) {
        AbstractC4357s abstractC4357s3;
        if (this.f12791d == null) {
            this.f12791d = AbstractC4362t.m17121g(abstractC4357s);
        }
        AbstractC4357s abstractC4357s4 = this.f12791d;
        if (abstractC4357s4 == null) {
            AbstractC1061t.m3851l("targetVector");
            abstractC4357s4 = null;
        }
        int iMo17033b = abstractC4357s4.mo17033b();
        int i10 = 0;
        while (true) {
            abstractC4357s3 = this.f12791d;
            if (i10 >= iMo17033b) {
                break;
            }
            if (abstractC4357s3 == null) {
                AbstractC1061t.m3851l("targetVector");
                abstractC4357s3 = null;
            }
            abstractC4357s3.mo17036e(i10, this.f12788a.mo15447d(abstractC4357s.mo17032a(i10), abstractC4357s2.mo17032a(i10)));
            i10++;
        }
        if (abstractC4357s3 != null) {
            return abstractC4357s3;
        }
        AbstractC1061t.m3851l("targetVector");
        return null;
    }

    @Override // p163l.InterfaceC4351q3
    /* JADX INFO: renamed from: e */
    public AbstractC4357s mo17106e(long j10, AbstractC4357s abstractC4357s, AbstractC4357s abstractC4357s2) {
        AbstractC4357s abstractC4357s3;
        if (this.f12789b == null) {
            this.f12789b = AbstractC4362t.m17121g(abstractC4357s);
        }
        AbstractC4357s abstractC4357s4 = this.f12789b;
        if (abstractC4357s4 == null) {
            AbstractC1061t.m3851l("valueVector");
            abstractC4357s4 = null;
        }
        int iMo17033b = abstractC4357s4.mo17033b();
        int i10 = 0;
        while (true) {
            abstractC4357s3 = this.f12789b;
            if (i10 >= iMo17033b) {
                break;
            }
            if (abstractC4357s3 == null) {
                AbstractC1061t.m3851l("valueVector");
                abstractC4357s3 = null;
            }
            abstractC4357s3.mo17036e(i10, this.f12788a.mo15448e(j10, abstractC4357s.mo17032a(i10), abstractC4357s2.mo17032a(i10)));
            i10++;
        }
        if (abstractC4357s3 != null) {
            return abstractC4357s3;
        }
        AbstractC1061t.m3851l("valueVector");
        return null;
    }
}
