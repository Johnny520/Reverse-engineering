package p116i;

import gg.AbstractC1416l;
import p117i0.AbstractC1874r;
import p117i0.C1829f1;
import p117i0.C1837h1;
import p117i0.C1845j1;
import p117i0.InterfaceC1854l2;
import p322w0.C4665p;

/* JADX INFO: renamed from: i.g1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1753g1 implements InterfaceC1854l2 {

    /* JADX INFO: renamed from: g */
    public final C1771m1 f5848g;

    /* JADX INFO: renamed from: h */
    public final C1845j1 f5849h;

    /* JADX INFO: renamed from: i */
    public final C1845j1 f5850i;

    /* JADX INFO: renamed from: j */
    public final C1845j1 f5851j;

    /* JADX INFO: renamed from: k */
    public final C1845j1 f5852k;

    /* JADX INFO: renamed from: l */
    public final C1829f1 f5853l;

    /* JADX INFO: renamed from: m */
    public boolean f5854m;

    /* JADX INFO: renamed from: n */
    public final C1845j1 f5855n;

    /* JADX INFO: renamed from: o */
    public AbstractC1781q f5856o;

    /* JADX INFO: renamed from: p */
    public final C1837h1 f5857p;

    /* JADX INFO: renamed from: q */
    public boolean f5858q;

    /* JADX INFO: renamed from: r */
    public final C1785r0 f5859r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C1765k1 f5860s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
    public C1753g1(C1765k1 c1765k1, Object obj, AbstractC1781q abstractC1781q, C1771m1 c1771m1) {
        this.f5860s = c1765k1;
        this.f5848g = c1771m1;
        C1845j1 c1845j1M4639u = AbstractC1874r.m4639u(obj);
        this.f5849h = c1845j1M4639u;
        Object objInvoke = null;
        this.f5850i = AbstractC1874r.m4639u(AbstractC1742d.m4379o(0.0f, 0.0f, null, 7));
        this.f5851j = AbstractC1874r.m4639u(new C1806z0(m4403c(), c1771m1, obj, c1845j1M4639u.getValue(), abstractC1781q));
        this.f5852k = AbstractC1874r.m4639u(Boolean.TRUE);
        this.f5853l = new C1829f1(-1.0f);
        this.f5855n = AbstractC1874r.m4639u(obj);
        this.f5856o = abstractC1781q;
        this.f5857p = new C1837h1(m4402a().mo4395b());
        Float f3 = (Float) AbstractC1798v1.f6003a.get(c1771m1);
        if (f3 != null) {
            float fFloatValue = f3.floatValue();
            AbstractC1781q abstractC1781q2 = (AbstractC1781q) c1771m1.f5912a.invoke(obj);
            int iMo4424b = abstractC1781q2.mo4424b();
            for (int i9 = 0; i9 < iMo4424b; i9++) {
                abstractC1781q2.mo4427e(i9, fFloatValue);
            }
            objInvoke = this.f5848g.f5913b.invoke(abstractC1781q2);
        }
        this.f5859r = AbstractC1742d.m4379o(0.0f, 0.0f, objInvoke, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C1806z0 m4402a() {
        return (C1806z0) this.f5851j.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final InterfaceC1803y m4403c() {
        return (InterfaceC1803y) this.f5850i.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4404d() {
        if (this.f5853l.m4488g() == -1.0f) {
            this.f5858q = true;
            boolean zM3825a = AbstractC1416l.m3825a(m4402a().f6022c, m4402a().f6023d);
            C1845j1 c1845j1 = this.f5855n;
            if (zM3825a) {
                c1845j1.setValue(m4402a().f6022c);
            } else {
                c1845j1.setValue(m4402a().mo4399f(0L));
                this.f5856o = m4402a().mo4397d(0L);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4405e(Object obj, boolean z9) {
        C1765k1 c1765k1 = this.f5860s;
        C1845j1 c1845j1 = c1765k1.f5896h;
        C1845j1 c1845j12 = this.f5849h;
        boolean zM3825a = AbstractC1416l.m3825a(null, c1845j12.getValue());
        C1837h1 c1837h1 = this.f5857p;
        C1845j1 c1845j13 = this.f5851j;
        if (zM3825a) {
            c1845j13.setValue(new C1806z0(this.f5859r, this.f5848g, obj, obj, this.f5856o.mo4425c()));
            this.f5854m = true;
            c1837h1.m4565h(m4402a().mo4395b());
            return;
        }
        InterfaceC1803y interfaceC1803yM4403c = (!z9 || this.f5858q || (m4403c() instanceof C1785r0)) ? m4403c() : this.f5859r;
        long jMax = 0;
        c1845j13.setValue(new C1806z0(c1765k1.m4416e() <= 0 ? interfaceC1803yM4403c : new C1788s0(interfaceC1803yM4403c, c1765k1.m4416e()), this.f5848g, obj, c1845j12.getValue(), this.f5856o));
        c1837h1.m4565h(m4402a().mo4395b());
        this.f5854m = false;
        c1845j1.setValue(Boolean.TRUE);
        if (c1765k1.m4418g()) {
            C4665p c4665p = c1765k1.f5897i;
            int size = c4665p.size();
            for (int i9 = 0; i9 < size; i9++) {
                C1753g1 c1753g1 = (C1753g1) c4665p.get(i9);
                jMax = Math.max(jMax, c1753g1.f5857p.m4564g());
                c1753g1.m4404d();
            }
            c1845j1.setValue(Boolean.FALSE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4406f(Object obj, Object obj2, InterfaceC1803y interfaceC1803y) {
        this.f5849h.setValue(obj2);
        this.f5850i.setValue(interfaceC1803y);
        if (AbstractC1416l.m3825a(m4402a().f6023d, obj) && AbstractC1416l.m3825a(m4402a().f6022c, obj2)) {
            return;
        }
        m4405e(obj, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4407g(Object obj, InterfaceC1803y interfaceC1803y) {
        if (this.f5854m && AbstractC1416l.m3825a(obj, null)) {
            return;
        }
        C1845j1 c1845j1 = this.f5849h;
        boolean zM3825a = AbstractC1416l.m3825a(c1845j1.getValue(), obj);
        C1829f1 c1829f1 = this.f5853l;
        if (zM3825a && c1829f1.m4488g() == -1.0f) {
            return;
        }
        c1845j1.setValue(obj);
        this.f5850i.setValue(interfaceC1803y);
        float fM4488g = c1829f1.m4488g();
        C1845j1 c1845j12 = this.f5855n;
        Object value = fM4488g == -3.0f ? obj : c1845j12.getValue();
        C1845j1 c1845j13 = this.f5852k;
        m4405e(value, !((Boolean) c1845j13.getValue()).booleanValue());
        c1845j13.setValue(Boolean.valueOf(c1829f1.m4488g() == -3.0f));
        if (c1829f1.m4488g() >= 0.0f) {
            c1845j12.setValue(m4402a().mo4399f((long) (c1829f1.m4488g() * m4402a().mo4395b())));
        } else if (c1829f1.m4488g() == -3.0f) {
            c1845j12.setValue(obj);
        }
        this.f5854m = false;
        c1829f1.m4489h(-1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1854l2
    public final Object getValue() {
        return this.f5855n.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "current value: " + this.f5855n.getValue() + ", target: " + this.f5849h.getValue() + ", spec: " + m4403c();
    }
}
