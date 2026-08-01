package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: sb */
/* JADX INFO: loaded from: classes.dex */
public final class C0701sb implements InterfaceC0295he, Serializable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0295he f4289a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0221fe f4290b;

    public C0701sb(InterfaceC0221fe interfaceC0221fe, InterfaceC0295he interfaceC0295he) {
        AbstractC0493mp.m1857g("left", interfaceC0295he);
        this.f4289a = interfaceC0295he;
        this.f4290b = interfaceC0221fe;
    }

    @Override // p000.InterfaceC0295he
    /* JADX INFO: renamed from: b */
    public final InterfaceC0221fe mo447b(InterfaceC0258ge interfaceC0258ge) {
        AbstractC0493mp.m1857g("key", interfaceC0258ge);
        C0701sb c0701sb = this;
        while (true) {
            InterfaceC0221fe interfaceC0221feMo447b = c0701sb.f4290b.mo447b(interfaceC0258ge);
            if (interfaceC0221feMo447b != null) {
                return interfaceC0221feMo447b;
            }
            InterfaceC0295he interfaceC0295he = c0701sb.f4289a;
            if (!(interfaceC0295he instanceof C0701sb)) {
                return interfaceC0295he.mo447b(interfaceC0258ge);
            }
            c0701sb = (C0701sb) interfaceC0295he;
        }
    }

    public final boolean equals(Object obj) {
        boolean zM1853c;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0701sb) {
            C0701sb c0701sb = (C0701sb) obj;
            int i = 2;
            C0701sb c0701sb2 = c0701sb;
            int i2 = 2;
            while (true) {
                InterfaceC0295he interfaceC0295he = c0701sb2.f4289a;
                c0701sb2 = interfaceC0295he instanceof C0701sb ? (C0701sb) interfaceC0295he : null;
                if (c0701sb2 == null) {
                    break;
                }
                i2++;
            }
            C0701sb c0701sb3 = this;
            while (true) {
                InterfaceC0295he interfaceC0295he2 = c0701sb3.f4289a;
                c0701sb3 = interfaceC0295he2 instanceof C0701sb ? (C0701sb) interfaceC0295he2 : null;
                if (c0701sb3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                C0701sb c0701sb4 = this;
                while (true) {
                    InterfaceC0221fe interfaceC0221fe = c0701sb4.f4290b;
                    if (!AbstractC0493mp.m1853c(c0701sb.mo447b(interfaceC0221fe.getKey()), interfaceC0221fe)) {
                        zM1853c = false;
                        break;
                    }
                    InterfaceC0295he interfaceC0295he3 = c0701sb4.f4289a;
                    if (!(interfaceC0295he3 instanceof C0701sb)) {
                        AbstractC0493mp.m1855e("null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element", interfaceC0295he3);
                        InterfaceC0221fe interfaceC0221fe2 = (InterfaceC0221fe) interfaceC0295he3;
                        zM1853c = AbstractC0493mp.m1853c(c0701sb.mo447b(interfaceC0221fe2.getKey()), interfaceC0221fe2);
                        break;
                    }
                    c0701sb4 = (C0701sb) interfaceC0295he3;
                }
                if (zM1853c) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0295he
    /* JADX INFO: renamed from: g */
    public final InterfaceC0295he mo448g(InterfaceC0258ge interfaceC0258ge) {
        AbstractC0493mp.m1857g("key", interfaceC0258ge);
        InterfaceC0221fe interfaceC0221fe = this.f4290b;
        InterfaceC0221fe interfaceC0221feMo447b = interfaceC0221fe.mo447b(interfaceC0258ge);
        InterfaceC0295he interfaceC0295he = this.f4289a;
        if (interfaceC0221feMo447b != null) {
            return interfaceC0295he;
        }
        InterfaceC0295he interfaceC0295heMo448g = interfaceC0295he.mo448g(interfaceC0258ge);
        return interfaceC0295heMo448g == interfaceC0295he ? this : interfaceC0295heMo448g == C0931yi.f5432a ? interfaceC0221fe : new C0701sb(interfaceC0221fe, interfaceC0295heMo448g);
    }

    @Override // p000.InterfaceC0295he
    /* JADX INFO: renamed from: h */
    public final Object mo449h(Object obj, InterfaceC0935ym interfaceC0935ym) {
        return interfaceC0935ym.mo36e(this.f4289a.mo449h(obj, interfaceC0935ym), this.f4290b);
    }

    public final int hashCode() {
        return this.f4290b.hashCode() + this.f4289a.hashCode();
    }

    @Override // p000.InterfaceC0295he
    /* JADX INFO: renamed from: i */
    public final InterfaceC0295he mo450i(InterfaceC0295he interfaceC0295he) {
        return AbstractC0493mp.m1827A(this, interfaceC0295he);
    }

    public final String toString() {
        return "[" + ((String) mo449h("", new C0664rb(0))) + ']';
    }
}
