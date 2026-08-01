package androidx.compose.runtime;

import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1064u0;
import p057e1.C1992t;
import p117i.C3055g0;
import p117i.C3076o0;

/* JADX INFO: renamed from: androidx.compose.runtime.y3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0627y3 implements InterfaceC0474d {

    /* JADX INFO: renamed from: d */
    public static final a f1809d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final int f1810e = 8;

    /* JADX INFO: renamed from: a */
    public final C3055g0 f1811a = new C3055g0(0, 1, null);

    /* JADX INFO: renamed from: b */
    public final C3076o0 f1812b = new C3076o0(0, 1, null);

    /* JADX INFO: renamed from: c */
    public Object f1813c;

    public C0627y3(Object obj) {
        this.f1813c = obj;
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: a */
    public Object mo1476a() {
        return this.f1813c;
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: b */
    public void mo1580b(int i10, int i11) {
        this.f1811a.m11303j(2);
        this.f1811a.m11303j(i10);
        this.f1811a.m11303j(i11);
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: c */
    public void mo1581c(int i10, Object obj) {
        this.f1811a.m11303j(5);
        this.f1811a.m11303j(i10);
        this.f1812b.m11461n(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    public void clear() {
        this.f1811a.m11303j(4);
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: d */
    public void mo1477d(Object obj) {
        this.f1811a.m11303j(1);
        this.f1812b.m11461n(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: e */
    public void mo1582e() {
        this.f1811a.m11303j(8);
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: g */
    public void mo1584g(int i10, int i11, int i12) {
        this.f1811a.m11303j(3);
        this.f1811a.m11303j(i10);
        this.f1811a.m11303j(i11);
        this.f1811a.m11303j(i12);
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: h */
    public void mo1478h() {
        this.f1811a.m11303j(0);
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: i */
    public void mo1585i(InterfaceC0188p interfaceC0188p, Object obj) {
        this.f1811a.m11303j(7);
        this.f1812b.m11461n(interfaceC0188p);
        this.f1812b.m11461n(obj);
    }

    @Override // androidx.compose.runtime.InterfaceC0474d
    /* JADX INFO: renamed from: j */
    public void mo1586j(int i10, Object obj) {
        this.f1811a.m11303j(6);
        this.f1811a.m11303j(i10);
        this.f1812b.m11461n(obj);
    }

    /* JADX INFO: renamed from: l */
    public final void m2459l() {
        this.f1811a.m11303j(9);
    }

    /* JADX INFO: renamed from: m */
    public final void m2460m(InterfaceC0474d interfaceC0474d, C1992t c1992t) {
        Exception exc;
        int i10;
        int i11;
        C3055g0 c3055g0 = this.f1811a;
        int i12 = c3055g0.f8151b;
        C3076o0 c3076o0 = this.f1812b;
        C3076o0 c3076o02 = new C3076o0(0, 1, null);
        interfaceC0474d.m1583f();
        int i13 = 0;
        int i14 = 0;
        while (i13 < i12) {
            int i15 = i13 + 1;
            try {
                try {
                    switch (c3055g0.m11417e(i13)) {
                        case 0:
                            interfaceC0474d.mo1478h();
                            i13 = i15;
                            break;
                        case 1:
                            int i16 = i14 + 1;
                            interfaceC0474d.mo1477d(c3076o0.m11586d(i14));
                            i14 = i16;
                            i13 = i15;
                            break;
                        case 2:
                            int i17 = i13 + 2;
                            i13 += 3;
                            interfaceC0474d.mo1580b(c3055g0.m11417e(i15), c3055g0.m11417e(i17));
                            break;
                        case 3:
                            int i18 = i13 + 2;
                            try {
                                i10 = i13 + 3;
                            } catch (Exception e10) {
                                exc = e10;
                                i13 = i18;
                            }
                            try {
                                i13 += 4;
                                interfaceC0474d.mo1584g(c3055g0.m11417e(i15), c3055g0.m11417e(i18), c3055g0.m11417e(i10));
                            } catch (Exception e11) {
                                exc = e11;
                                i13 = i10;
                                throw new C0551o(c3076o0, c3076o02, c3055g0, i13 - 1, exc);
                            }
                            break;
                        case 4:
                            interfaceC0474d.clear();
                            i13 = i15;
                            break;
                        case 5:
                            i13 += 2;
                            i11 = i14 + 1;
                            interfaceC0474d.mo1581c(c3055g0.m11417e(i15), c3076o0.m11586d(i14));
                            i14 = i11;
                            break;
                        case 6:
                            i13 += 2;
                            try {
                                i11 = i14 + 1;
                                interfaceC0474d.mo1586j(c3055g0.m11417e(i15), c3076o0.m11586d(i14));
                                i14 = i11;
                            } catch (Exception e12) {
                                exc = e12;
                                throw new C0551o(c3076o0, c3076o02, c3055g0, i13 - 1, exc);
                            }
                            break;
                        case 7:
                            int i19 = i14 + 1;
                            Object objM11586d = c3076o0.m11586d(i14);
                            objM11586d.getClass();
                            i14 += 2;
                            interfaceC0474d.mo1585i((InterfaceC0188p) AbstractC1064u0.m3858f(objM11586d, 2), c3076o0.m11586d(i19));
                            i13 = i15;
                            break;
                        case 8:
                            Object objMo1476a = interfaceC0474d.mo1476a();
                            if (objMo1476a instanceof InterfaceC0544n) {
                                c1992t.m7189k((InterfaceC0544n) objMo1476a);
                            }
                            c3076o02.m11461n(objMo1476a);
                            interfaceC0474d.mo1582e();
                            i13 = i15;
                            break;
                        default:
                            i13 = i15;
                            break;
                    }
                } catch (Exception e13) {
                    exc = e13;
                    i13 = i15;
                }
            } catch (Throwable th) {
                interfaceC0474d.mo1587k();
                throw th;
            }
        }
        if (!(i14 == c3076o0.m11587e())) {
            AbstractC0468c0.m1548b("Applier operation size mismatch");
        }
        c3076o0.m11468u();
        c3055g0.m11305l();
        interfaceC0474d.mo1587k();
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.y3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
