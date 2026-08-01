package p203n;

import p095T.AbstractC1385s;
import p095T.C1330O0;
import p095T.C1358e0;
import p095T.C1362g0;
import p095T.C1366i0;
import p095T.InterfaceC1339T0;
import p117X2.AbstractC1665j;
import p158f0.AbstractC2082n;
import p158f0.C2085q;

/* JADX INFO: renamed from: n.W */
/* JADX INFO: loaded from: classes.dex */
public final class C2639W implements InterfaceC1339T0 {

    /* JADX INFO: renamed from: d */
    public final C2652e0 f8386d;

    /* JADX INFO: renamed from: e */
    public final C1366i0 f8387e;

    /* JADX INFO: renamed from: f */
    public final C1366i0 f8388f;

    /* JADX INFO: renamed from: g */
    public final C1366i0 f8389g;

    /* JADX INFO: renamed from: h */
    public final C1366i0 f8390h;

    /* JADX INFO: renamed from: i */
    public final C1358e0 f8391i;

    /* JADX INFO: renamed from: j */
    public boolean f8392j;

    /* JADX INFO: renamed from: k */
    public final C1366i0 f8393k;

    /* JADX INFO: renamed from: l */
    public AbstractC2670o f8394l;

    /* JADX INFO: renamed from: m */
    public final C1362g0 f8395m;

    /* JADX INFO: renamed from: n */
    public boolean f8396n;

    /* JADX INFO: renamed from: o */
    public final C2626I f8397o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C2642Z f8398p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
    public C2639W(C2642Z c2642z, Object obj, AbstractC2670o abstractC2670o, C2652e0 c2652e0) {
        this.f8398p = c2642z;
        this.f8386d = c2652e0;
        C1366i0 c1366i0M2629s = AbstractC1385s.m2629s(obj);
        this.f8387e = c1366i0M2629s;
        Object objMo1h = null;
        this.f8388f = AbstractC1385s.m2629s(AbstractC2649d.m4617j(0.0f, 0.0f, null, 7));
        this.f8389g = AbstractC1385s.m2629s(new C2633P(m4587b(), c2652e0, obj, c1366i0M2629s.getValue(), abstractC2670o));
        this.f8390h = AbstractC1385s.m2629s(Boolean.TRUE);
        this.f8391i = new C1358e0(-1.0f);
        this.f8393k = AbstractC1385s.m2629s(obj);
        this.f8394l = abstractC2670o;
        this.f8395m = new C1362g0(m4586a().mo4579c());
        Float f2 = (Float) AbstractC2668m0.f8504a.get(c2652e0);
        if (f2 != null) {
            float fFloatValue = f2.floatValue();
            AbstractC2670o abstractC2670o2 = (AbstractC2670o) c2652e0.f8459a.mo1h(obj);
            int iMo4625b = abstractC2670o2.mo4625b();
            for (int i5 = 0; i5 < iMo4625b; i5++) {
                abstractC2670o2.mo4628e(fFloatValue, i5);
            }
            objMo1h = this.f8386d.f8460b.mo1h(abstractC2670o2);
        }
        this.f8397o = AbstractC2649d.m4617j(0.0f, 0.0f, objMo1h, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C2633P m4586a() {
        return (C2633P) this.f8389g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final InterfaceC2677v m4587b() {
        return (InterfaceC2677v) this.f8388f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4588c() {
        if (this.f8391i.m2507g() == -1.0f) {
            this.f8396n = true;
            boolean zM2981a = AbstractC1665j.m2981a(m4586a().f8368c, m4586a().f8369d);
            C1366i0 c1366i0 = this.f8393k;
            if (zM2981a) {
                c1366i0.setValue(m4586a().f8368c);
            } else {
                c1366i0.setValue(m4586a().mo4578b(0L));
                this.f8394l = m4586a().mo4582f(0L);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4589e(Object obj, boolean z5) {
        C2642Z c2642z = this.f8398p;
        C1366i0 c1366i0 = c2642z.f8408h;
        C1366i0 c1366i02 = this.f8387e;
        boolean zM2981a = AbstractC1665j.m2981a(null, c1366i02.getValue());
        C1362g0 c1362g0 = this.f8395m;
        C1366i0 c1366i03 = this.f8389g;
        C2652e0 c2652e0 = this.f8386d;
        if (zM2981a) {
            c1366i03.setValue(new C2633P(this.f8397o, c2652e0, obj, obj, this.f8394l.mo4626c()));
            this.f8392j = true;
            c1362g0.m2511g(m4586a().mo4579c());
            return;
        }
        InterfaceC2677v interfaceC2677vM4587b = (!z5 || this.f8396n || (m4587b() instanceof C2626I)) ? m4587b() : this.f8397o;
        long jMax = 0;
        c1366i03.setValue(new C2633P(c2642z.m4595e() <= 0 ? interfaceC2677vM4587b : new C2627J(interfaceC2677vM4587b, c2642z.m4595e()), c2652e0, obj, c1366i02.getValue(), this.f8394l));
        c1362g0.m2511g(m4586a().mo4579c());
        this.f8392j = false;
        c1366i0.setValue(Boolean.TRUE);
        if (c2642z.m4597g()) {
            C2085q c2085q = c2642z.f8409i;
            int size = c2085q.size();
            for (int i5 = 0; i5 < size; i5++) {
                C2639W c2639w = (C2639W) c2085q.get(i5);
                C1362g0 c1362g02 = c2639w.f8395m;
                jMax = Math.max(jMax, ((C1330O0) AbstractC2082n.m3844t(c1362g02.f4803e, c1362g02)).f4757c);
                c2639w.m4588c();
            }
            c1366i0.setValue(Boolean.FALSE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m4590f(Object obj, Object obj2, InterfaceC2677v interfaceC2677v) {
        this.f8387e.setValue(obj2);
        this.f8388f.setValue(interfaceC2677v);
        if (AbstractC1665j.m2981a(m4586a().f8369d, obj) && AbstractC1665j.m2981a(m4586a().f8368c, obj2)) {
            return;
        }
        m4589e(obj, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p095T.InterfaceC1339T0
    public final Object getValue() {
        return this.f8393k.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "current value: " + this.f8393k.getValue() + ", target: " + this.f8387e.getValue() + ", spec: " + m4587b();
    }
}
