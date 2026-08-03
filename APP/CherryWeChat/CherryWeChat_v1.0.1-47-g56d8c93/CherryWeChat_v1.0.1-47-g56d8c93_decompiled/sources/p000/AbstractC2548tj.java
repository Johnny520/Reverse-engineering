package p000;

/* JADX INFO: renamed from: tj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2548tj implements InterfaceC0464Kr, Cloneable {

    /* JADX INFO: renamed from: a */
    public final AbstractC2634vj f8870a;

    /* JADX INFO: renamed from: b */
    public AbstractC2634vj f8871b;

    public AbstractC2548tj(AbstractC2634vj abstractC2634vj) {
        this.f8870a = abstractC2634vj;
        if (abstractC2634vj.m5154n()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f8871b = abstractC2634vj.m5157q();
    }

    /* JADX INFO: renamed from: f */
    public static void m5034f(Object obj, Object obj2) {
        C0338Hu c0338Hu = C0338Hu.f1144c;
        c0338Hu.getClass();
        c0338Hu.m725a(obj.getClass()).mo1073c(obj, obj2);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC2634vj m5035b() {
        AbstractC2634vj abstractC2634vjM5036c = m5036c();
        abstractC2634vjM5036c.getClass();
        if (AbstractC2634vj.m5148m(abstractC2634vjM5036c, true)) {
            return abstractC2634vjM5036c;
        }
        throw new C0743RC();
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC2634vj m5036c() {
        if (!this.f8871b.m5154n()) {
            return this.f8871b;
        }
        AbstractC2634vj abstractC2634vj = this.f8871b;
        abstractC2634vj.getClass();
        C0338Hu c0338Hu = C0338Hu.f1144c;
        c0338Hu.getClass();
        c0338Hu.m725a(abstractC2634vj.getClass()).mo1074d(abstractC2634vj);
        abstractC2634vj.m5155o();
        return this.f8871b;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC2548tj m5037d() {
        AbstractC2548tj abstractC2548tjM5156p = this.f8870a.mo65d();
        abstractC2548tjM5156p.f8871b = m5036c();
        return abstractC2548tjM5156p;
    }

    /* JADX INFO: renamed from: e */
    public final void m5038e() {
        if (this.f8871b.m5154n()) {
            return;
        }
        AbstractC2634vj abstractC2634vjM5157q = this.f8870a.m5157q();
        m5034f(abstractC2634vjM5157q, this.f8871b);
        this.f8871b = abstractC2634vjM5157q;
    }
}
