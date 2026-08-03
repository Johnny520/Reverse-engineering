package p000;

/* JADX INFO: renamed from: tj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2548tj implements InterfaceC0464Kr, Cloneable {

    /* JADX INFO: renamed from: a */
    public final AbstractC2634vj f8870a;

    /* JADX INFO: renamed from: b */
    public AbstractC2634vj f8871b;

    public AbstractC2548tj(AbstractC2634vj r2) {
        this.f8870a = r2;
        if (r2.m5154n() == true) goto L7;
        this.f8871b = r2.m5157q();
        return;
    L7:
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* JADX INFO: renamed from: f */
    public static void m5034f(Object r2, Object r3) {
        C0338Hu r0 = C0338Hu.f1144c;
        r0.getClass();
        r0.m725a(r2.getClass()).mo1073c(r2, r3);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC2634vj m5035b() {
        AbstractC2634vj r0 = m5036c();
        r0.getClass();
        if (AbstractC2634vj.m5148m(r0, true) == false) goto L6;
        return r0;
    L6:
        throw new C0743RC();
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC2634vj m5036c() {
        if (this.f8871b.m5154n() == false) goto L5;
        AbstractC2634vj r0 = this.f8871b;
        r0.getClass();
        C0338Hu r1 = C0338Hu.f1144c;
        r1.getClass();
        r1.m725a(r0.getClass()).mo1074d(r0);
        r0.m5155o();
        return this.f8871b;
    L5:
        return this.f8871b;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC2548tj m5037d() {
        AbstractC2548tj r0 = this.f8870a.m5156p();
        r0.f8871b = m5036c();
        return r0;
    }

    /* JADX INFO: renamed from: e */
    public final void m5038e() {
        if (this.f8871b.m5154n() == true) goto L6;
        AbstractC2634vj r0 = this.f8870a.m5157q();
        m5034f(r0, this.f8871b);
        this.f8871b = r0;
        return;
    }
}
