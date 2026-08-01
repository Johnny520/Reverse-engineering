package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: kb */
/* JADX INFO: loaded from: classes.dex */
public final class C0405kb implements InterfaceC0258ge, Serializable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0258ge f2808a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184ee f2809b;

    public C0405kb(InterfaceC0184ee interfaceC0184ee, InterfaceC0258ge interfaceC0258ge) {
        AbstractC0346ip.m1503o("left", interfaceC0258ge);
        this.f2808a = interfaceC0258ge;
        this.f2809b = interfaceC0184ee;
    }

    @Override // p000.InterfaceC0258ge
    /* JADX INFO: renamed from: b */
    public final InterfaceC0184ee mo1272b(InterfaceC0221fe interfaceC0221fe) {
        AbstractC0346ip.m1503o("key", interfaceC0221fe);
        C0405kb c0405kb = this;
        while (true) {
            InterfaceC0184ee interfaceC0184eeMo1272b = c0405kb.f2809b.mo1272b(interfaceC0221fe);
            if (interfaceC0184eeMo1272b != null) {
                return interfaceC0184eeMo1272b;
            }
            InterfaceC0258ge interfaceC0258ge = c0405kb.f2808a;
            if (!(interfaceC0258ge instanceof C0405kb)) {
                return interfaceC0258ge.mo1272b(interfaceC0221fe);
            }
            c0405kb = (C0405kb) interfaceC0258ge;
        }
    }

    public final boolean equals(Object obj) {
        boolean zM1497i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0405kb) {
            C0405kb c0405kb = (C0405kb) obj;
            int i = 2;
            C0405kb c0405kb2 = c0405kb;
            int i2 = 2;
            while (true) {
                InterfaceC0258ge interfaceC0258ge = c0405kb2.f2808a;
                c0405kb2 = interfaceC0258ge instanceof C0405kb ? (C0405kb) interfaceC0258ge : null;
                if (c0405kb2 == null) {
                    break;
                }
                i2++;
            }
            C0405kb c0405kb3 = this;
            while (true) {
                InterfaceC0258ge interfaceC0258ge2 = c0405kb3.f2808a;
                c0405kb3 = interfaceC0258ge2 instanceof C0405kb ? (C0405kb) interfaceC0258ge2 : null;
                if (c0405kb3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                C0405kb c0405kb4 = this;
                while (true) {
                    InterfaceC0184ee interfaceC0184ee = c0405kb4.f2809b;
                    if (!AbstractC0346ip.m1497i(c0405kb.mo1272b(interfaceC0184ee.getKey()), interfaceC0184ee)) {
                        zM1497i = false;
                        break;
                    }
                    InterfaceC0258ge interfaceC0258ge3 = c0405kb4.f2808a;
                    if (!(interfaceC0258ge3 instanceof C0405kb)) {
                        AbstractC0346ip.m1501m("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element", interfaceC0258ge3);
                        InterfaceC0184ee interfaceC0184ee2 = (InterfaceC0184ee) interfaceC0258ge3;
                        zM1497i = AbstractC0346ip.m1497i(c0405kb.mo1272b(interfaceC0184ee2.getKey()), interfaceC0184ee2);
                        break;
                    }
                    c0405kb4 = (C0405kb) interfaceC0258ge3;
                }
                if (zM1497i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0258ge
    /* JADX INFO: renamed from: g */
    public final InterfaceC0258ge mo1273g(InterfaceC0221fe interfaceC0221fe) {
        AbstractC0346ip.m1503o("key", interfaceC0221fe);
        InterfaceC0184ee interfaceC0184ee = this.f2809b;
        InterfaceC0184ee interfaceC0184eeMo1272b = interfaceC0184ee.mo1272b(interfaceC0221fe);
        InterfaceC0258ge interfaceC0258ge = this.f2808a;
        if (interfaceC0184eeMo1272b != null) {
            return interfaceC0258ge;
        }
        InterfaceC0258ge interfaceC0258geMo1273g = interfaceC0258ge.mo1273g(interfaceC0221fe);
        return interfaceC0258geMo1273g == interfaceC0258ge ? this : interfaceC0258geMo1273g == C0857wi.f4966a ? interfaceC0184ee : new C0405kb(interfaceC0184ee, interfaceC0258geMo1273g);
    }

    @Override // p000.InterfaceC0258ge
    /* JADX INFO: renamed from: h */
    public final Object mo1274h(Object obj, InterfaceC0861wm interfaceC0861wm) {
        return interfaceC0861wm.mo472e(this.f2808a.mo1274h(obj, interfaceC0861wm), this.f2809b);
    }

    public final int hashCode() {
        return this.f2809b.hashCode() + this.f2808a.hashCode();
    }

    @Override // p000.InterfaceC0258ge
    /* JADX INFO: renamed from: i */
    public final InterfaceC0258ge mo1275i(InterfaceC0258ge interfaceC0258ge) {
        return a80.m60y(this, interfaceC0258ge);
    }

    public final String toString() {
        return "[" + ((String) mo1274h("", new C0368jb(0))) + ']';
    }
}
