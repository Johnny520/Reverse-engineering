package p015b0;

import p010a9.InterfaceC0184l;
import p018b3.C0975s;
import p024b9.AbstractC1061t;
import p179m2.InterfaceC4939z2;
import p235q1.C6203g;
import p235q1.InterfaceC6217n;
import p376zd.C10010p0;

/* JADX INFO: renamed from: b0.h2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0775h2 implements InterfaceC0782i2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4939z2 f2314a;

    /* JADX INFO: renamed from: b */
    public C0789j2 f2315b;

    /* JADX INFO: renamed from: c */
    public InterfaceC6217n f2316c;

    public C0775h2(InterfaceC4939z2 interfaceC4939z2) {
        this.f2314a = interfaceC4939z2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2895a(int i10) {
        InterfaceC4939z2 interfaceC4939z2;
        C0975s.a aVar = C0975s.f2976b;
        if (C0975s.m3554m(i10, aVar.m3561d())) {
            m2896b().mo24455s(C6203g.f19254b.m24382e());
            return true;
        }
        if (C0975s.m3554m(i10, aVar.m3563f())) {
            m2896b().mo24455s(C6203g.f19254b.m24383f());
            return true;
        }
        if (!C0975s.m3554m(i10, aVar.m3559b()) || (interfaceC4939z2 = this.f2314a) == null) {
            return false;
        }
        interfaceC4939z2.mo19521a();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC6217n m2896b() {
        InterfaceC6217n interfaceC6217n = this.f2316c;
        if (interfaceC6217n != null) {
            return interfaceC6217n;
        }
        AbstractC1061t.m3851l("focusManager");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C0789j2 m2897c() {
        C0789j2 c0789j2 = this.f2315b;
        if (c0789j2 != null) {
            return c0789j2;
        }
        AbstractC1061t.m3851l("keyboardActions");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2898d(int i10) {
        InterfaceC0184l interfaceC0184lM2961g;
        C0975s.a aVar = C0975s.f2976b;
        if (C0975s.m3554m(i10, aVar.m3559b())) {
            interfaceC0184lM2961g = m2897c().m2956b();
        } else if (C0975s.m3554m(i10, aVar.m3560c())) {
            interfaceC0184lM2961g = m2897c().m2957c();
        } else if (C0975s.m3554m(i10, aVar.m3561d())) {
            interfaceC0184lM2961g = m2897c().m2958d();
        } else if (C0975s.m3554m(i10, aVar.m3563f())) {
            interfaceC0184lM2961g = m2897c().m2959e();
        } else if (C0975s.m3554m(i10, aVar.m3564g())) {
            interfaceC0184lM2961g = m2897c().m2960f();
        } else if (C0975s.m3554m(i10, aVar.m3565h())) {
            interfaceC0184lM2961g = m2897c().m2961g();
        } else {
            if (!C0975s.m3554m(i10, aVar.m3558a()) && !C0975s.m3554m(i10, aVar.m3562e())) {
                C10010p0.m38820a("invalid ImeAction");
                return false;
            }
            interfaceC0184lM2961g = null;
        }
        if (interfaceC0184lM2961g == null) {
            return m2895a(i10);
        }
        interfaceC0184lM2961g.mo27m(this);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m2899e(InterfaceC6217n interfaceC6217n) {
        this.f2316c = interfaceC6217n;
    }

    /* JADX INFO: renamed from: f */
    public final void m2900f(C0789j2 c0789j2) {
        this.f2315b = c0789j2;
    }
}
