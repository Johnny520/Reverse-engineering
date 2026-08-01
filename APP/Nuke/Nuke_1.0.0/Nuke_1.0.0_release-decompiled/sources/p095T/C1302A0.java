package p095T;

import me.dartcv.nuke.BuildConfig;
import p041H0.C0560F0;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1678w;
import p136b0.C1849k;
import p186k.C2404A;
import p186k.C2438t;

/* JADX INFO: renamed from: T.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1302A0 implements InterfaceC1353c {

    /* JADX INFO: renamed from: d */
    public final C2438t f4663d = new C2438t();

    /* JADX INFO: renamed from: e */
    public final C2404A f4664e = new C2404A();

    /* JADX INFO: renamed from: f */
    public final Object f4665f;

    public C1302A0(Object obj) {
        this.f4665f = obj;
    }

    /* JADX INFO: renamed from: a */
    public final void m2397a(C0560F0 c0560f0, C1849k c1849k) {
        Exception exc;
        C2438t c2438t = this.f4663d;
        int i5 = c2438t.f7878b;
        C2404A c2404a = new C2404A();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            C2404A c2404a2 = this.f4664e;
            if (i6 >= i5) {
                if (i7 != c2404a2.f7767b) {
                    AbstractC1387t.m2638a("Applier operation size mismatch");
                }
                c2404a2.m4246d();
                c2438t.f7878b = 0;
                c0560f0.mo784g();
                return;
            }
            int i8 = i6 + 1;
            try {
                try {
                    switch (c2438t.m4336c(i6)) {
                        case 0:
                            c0560f0.mo788n();
                            i6 = i8;
                            break;
                        case BuildConfig.VERSION_CODE /* 1 */:
                            int i9 = i7 + 1;
                            c0560f0.mo781d(c2404a2.m4248f(i7));
                            i7 = i9;
                            i6 = i8;
                            break;
                        case 2:
                            int i10 = i6 + 2;
                            i6 += 3;
                            c0560f0.mo787j(c2438t.m4336c(i8), c2438t.m4336c(i10));
                            break;
                        case 3:
                            int i11 = i6 + 2;
                            try {
                                int i12 = i6 + 3;
                                try {
                                    i6 += 4;
                                    c0560f0.mo785h(c2438t.m4336c(i8), c2438t.m4336c(i11), c2438t.m4336c(i12));
                                } catch (Exception e5) {
                                    exc = e5;
                                    i6 = i12;
                                }
                            } catch (Exception e6) {
                                exc = e6;
                                i6 = i11;
                            }
                            break;
                        case 4:
                            c0560f0.m779a();
                            i6 = i8;
                            break;
                        case 5:
                            i6 += 2;
                            int i13 = i7 + 1;
                            c0560f0.mo780c(c2438t.m4336c(i8), c2404a2.m4248f(i7));
                            i7 = i13;
                            break;
                        case 6:
                            i6 += 2;
                            try {
                                c2438t.m4336c(i8);
                                int i14 = i7 + 1;
                                i7 = i14;
                            } catch (Exception e7) {
                                exc = e7;
                            }
                            break;
                        case 7:
                            int i15 = i7 + 1;
                            Object objM4248f = c2404a2.m4248f(i7);
                            AbstractC1665j.m2983c(objM4248f, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                            AbstractC1678w.m2998b(2, objM4248f);
                            i7 += 2;
                            c0560f0.mo2398l((InterfaceC1603e) objM4248f, c2404a2.m4248f(i15));
                            i6 = i8;
                            break;
                        case 8:
                            Object obj = c0560f0.f1681f;
                            if (obj instanceof InterfaceC1363h) {
                                InterfaceC1363h interfaceC1363h = (InterfaceC1363h) obj;
                                if (c1849k.f6263f.m2761j(interfaceC1363h)) {
                                    interfaceC1363h.mo619c();
                                }
                            }
                            c2404a.m4243a(obj);
                            c0560f0.mo782e();
                            i6 = i8;
                            break;
                        default:
                            i6 = i8;
                            break;
                    }
                } catch (Throwable th) {
                    c0560f0.mo784g();
                    throw th;
                }
            } catch (Exception e8) {
                exc = e8;
                i6 = i8;
            }
            exc = e7;
            throw new C1367j(c2404a2, c2404a, c2438t, i6 - 1, exc);
        }
    }

    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: c */
    public final void mo780c(int i5, Object obj) {
        C2438t c2438t = this.f4663d;
        c2438t.m4334a(5);
        c2438t.m4334a(i5);
        this.f4664e.m4243a(obj);
    }

    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: d */
    public final void mo781d(Object obj) {
        this.f4663d.m4334a(1);
        this.f4664e.m4243a(obj);
    }

    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: e */
    public final void mo782e() {
        this.f4663d.m4334a(8);
    }

    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: f */
    public final void mo783f(int i5, Object obj) {
        C2438t c2438t = this.f4663d;
        c2438t.m4334a(6);
        c2438t.m4334a(i5);
        this.f4664e.m4243a(obj);
    }

    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: h */
    public final void mo785h(int i5, int i6, int i7) {
        C2438t c2438t = this.f4663d;
        c2438t.m4334a(3);
        c2438t.m4334a(i5);
        c2438t.m4334a(i6);
        c2438t.m4334a(i7);
    }

    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: i */
    public final Object mo786i() {
        return this.f4665f;
    }

    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: j */
    public final void mo787j(int i5, int i6) {
        C2438t c2438t = this.f4663d;
        c2438t.m4334a(2);
        c2438t.m4334a(i5);
        c2438t.m4334a(i6);
    }

    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: l */
    public final void mo2398l(InterfaceC1603e interfaceC1603e, Object obj) {
        this.f4663d.m4334a(7);
        C2404A c2404a = this.f4664e;
        c2404a.m4243a(interfaceC1603e);
        c2404a.m4243a(obj);
    }

    @Override // p095T.InterfaceC1353c
    /* JADX INFO: renamed from: n */
    public final void mo788n() {
        this.f4663d.m4334a(0);
    }
}
