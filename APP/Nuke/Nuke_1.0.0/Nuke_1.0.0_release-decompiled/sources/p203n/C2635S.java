package p203n;

import p095T.C1358e0;
import p095T.C1366i0;
import p095T.InterfaceC1339T0;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: n.S */
/* JADX INFO: loaded from: classes.dex */
public final class C2635S implements InterfaceC1339T0 {

    /* JADX INFO: renamed from: d */
    public final C2639W f8377d;

    /* JADX INFO: renamed from: e */
    public InterfaceC1601c f8378e;

    /* JADX INFO: renamed from: f */
    public AbstractC1666k f8379f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2636T f8380g;

    /* JADX WARN: Multi-variable type inference failed */
    public C2635S(C2636T c2636t, C2639W c2639w, InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2) {
        this.f8380g = c2636t;
        this.f8377d = c2639w;
        this.f8378e = interfaceC1601c;
        this.f8379f = (AbstractC1666k) interfaceC1601c2;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [W2.c, X2.k] */
    /* JADX WARN: Type inference failed for: r5v0, types: [W2.c, X2.k] */
    /* JADX INFO: renamed from: a */
    public final void m4583a(InterfaceC2637U interfaceC2637U) {
        C2639W c2639w = this.f8377d;
        C1366i0 c1366i0 = c2639w.f8390h;
        C1366i0 c1366i02 = c2639w.f8387e;
        C1366i0 c1366i03 = c2639w.f8393k;
        C1358e0 c1358e0 = c2639w.f8391i;
        Object objMo1h = this.f8379f.mo1h(interfaceC2637U.mo4477c());
        if (this.f8380g.f8383c.m4597g()) {
            c2639w.m4590f(this.f8379f.mo1h(interfaceC2637U.mo4476a()), objMo1h, (InterfaceC2677v) this.f8378e.mo1h(interfaceC2637U));
            return;
        }
        InterfaceC2677v interfaceC2677v = (InterfaceC2677v) this.f8378e.mo1h(interfaceC2637U);
        if (c2639w.f8392j && AbstractC1665j.m2981a(objMo1h, null)) {
            return;
        }
        if (AbstractC1665j.m2981a(c1366i02.getValue(), objMo1h) && c1358e0.m2507g() == -1.0f) {
            return;
        }
        c1366i02.setValue(objMo1h);
        c2639w.f8388f.setValue(interfaceC2677v);
        c2639w.m4589e(c1358e0.m2507g() == -3.0f ? objMo1h : c1366i03.getValue(), !((Boolean) c1366i0.getValue()).booleanValue());
        c1366i0.setValue(Boolean.valueOf(c1358e0.m2507g() == -3.0f));
        if (c1358e0.m2507g() >= 0.0f) {
            c1366i03.setValue(c2639w.m4586a().mo4578b((long) (c1358e0.m2507g() * c2639w.m4586a().mo4579c())));
        } else if (c1358e0.m2507g() == -3.0f) {
            c1366i03.setValue(objMo1h);
        }
        c2639w.f8392j = false;
        c1358e0.m2508h(-1.0f);
    }

    @Override // p095T.InterfaceC1339T0
    public final Object getValue() {
        m4583a(this.f8380g.f8383c.m4596f());
        return this.f8377d.f8393k.getValue();
    }
}
