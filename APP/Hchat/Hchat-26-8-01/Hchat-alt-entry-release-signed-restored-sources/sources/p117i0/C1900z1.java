package p117i0;

import gg.AbstractC1428x;
import p020b5.C0190i;
import p069f.C0933f0;
import p069f.C0964v;
import p085fg.InterfaceC1235p;
import p131j0.C2046b;
import p339x1.C5604f2;

/* JADX INFO: renamed from: i0.z1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1900z1 implements InterfaceC1807a {

    /* JADX INFO: renamed from: g */
    public final C0964v f6333g = new C0964v();

    /* JADX INFO: renamed from: h */
    public final C0933f0 f6334h = new C0933f0();

    /* JADX INFO: renamed from: i */
    public final Object f6335i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1900z1(Object obj) {
        this.f6335i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4672a(C5604f2 c5604f2, C0190i c0190i) {
        Exception exc;
        C0964v c0964v = this.f6333g;
        int i9 = c0964v.f3036b;
        C0933f0 c0933f0 = new C0933f0();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            C0933f0 c0933f02 = this.f6334h;
            if (i10 >= i9) {
                if (i11 != c0933f02.f2924b) {
                    AbstractC1855m.m4573a("Applier operation size mismatch");
                }
                c0933f02.m2289d();
                c0964v.f3036b = 0;
                c5604f2.mo4451q();
                return;
            }
            int i12 = i10 + 1;
            try {
                try {
                    switch (c0964v.m2371c(i10)) {
                        case 0:
                            c5604f2.mo4447k();
                            i10 = i12;
                            break;
                        case 1:
                            int i13 = i11 + 1;
                            c5604f2.mo4443d(c0933f02.m2291f(i11));
                            i11 = i13;
                            i10 = i12;
                            break;
                        case 2:
                            int i14 = i10 + 2;
                            i10 += 3;
                            c5604f2.mo4446i(c0964v.m2371c(i12), c0964v.m2371c(i14));
                            break;
                        case 3:
                            int i15 = i10 + 2;
                            try {
                                int i16 = i10 + 3;
                                try {
                                    i10 += 4;
                                    c5604f2.mo4445h(c0964v.m2371c(i12), c0964v.m2371c(i15), c0964v.m2371c(i16));
                                } catch (Exception e6) {
                                    exc = e6;
                                    i10 = i16;
                                }
                            } catch (Exception e7) {
                                exc = e7;
                                i10 = i15;
                            }
                            break;
                        case 4:
                            c5604f2.m10055a();
                            i10 = i12;
                            break;
                        case 5:
                            i10 += 2;
                            int i17 = i11 + 1;
                            c5604f2.mo4442c(c0964v.m2371c(i12), c0933f02.m2291f(i11));
                            i11 = i17;
                            break;
                        case 6:
                            i10 += 2;
                            try {
                                c0964v.m2371c(i12);
                                int i18 = i11 + 1;
                                i11 = i18;
                            } catch (Exception e10) {
                                exc = e10;
                            }
                            break;
                        case 7:
                            int i19 = i11 + 1;
                            Object objM2291f = c0933f02.m2291f(i11);
                            objM2291f.getClass();
                            AbstractC1428x.m3838c(2, objM2291f);
                            i11 += 2;
                            c5604f2.mo4450t((InterfaceC1235p) objM2291f, c0933f02.m2291f(i19));
                            i10 = i12;
                            break;
                        case 8:
                            Object obj = c5604f2.f22814i;
                            if (obj instanceof InterfaceC1835h) {
                                InterfaceC1835h interfaceC1835h = (InterfaceC1835h) obj;
                                if (((C2046b) c0190i.f481g).m5064j(interfaceC1835h)) {
                                    interfaceC1835h.mo4497b();
                                }
                            }
                            c0933f0.m2286a(obj);
                            c5604f2.mo4444f();
                            i10 = i12;
                            break;
                        default:
                            i10 = i12;
                            break;
                    }
                } catch (Exception e11) {
                    exc = e11;
                    i10 = i12;
                }
            } catch (Throwable th2) {
                c5604f2.mo4451q();
                throw th2;
            }
            exc = e10;
            throw new C1843j(c0933f02, c0933f0, c0964v, i10 - 1, exc);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: c */
    public final void mo4442c(int i9, Object obj) {
        C0964v c0964v = this.f6333g;
        c0964v.m2369a(5);
        c0964v.m2369a(i9);
        this.f6334h.m2286a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: d */
    public final void mo4443d(Object obj) {
        this.f6333g.m2369a(1);
        this.f6334h.m2286a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: f */
    public final void mo4444f() {
        this.f6333g.m2369a(8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: h */
    public final void mo4445h(int i9, int i10, int i11) {
        C0964v c0964v = this.f6333g;
        c0964v.m2369a(3);
        c0964v.m2369a(i9);
        c0964v.m2369a(i10);
        c0964v.m2369a(i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: i */
    public final void mo4446i(int i9, int i10) {
        C0964v c0964v = this.f6333g;
        c0964v.m2369a(2);
        c0964v.m2369a(i9);
        c0964v.m2369a(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: k */
    public final void mo4447k() {
        this.f6333g.m2369a(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: p */
    public final void mo4448p(int i9, Object obj) {
        C0964v c0964v = this.f6333g;
        c0964v.m2369a(6);
        c0964v.m2369a(i9);
        this.f6334h.m2286a(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: r */
    public final Object mo4449r() {
        return this.f6335i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1807a
    /* JADX INFO: renamed from: t */
    public final void mo4450t(InterfaceC1235p interfaceC1235p, Object obj) {
        this.f6333g.m2369a(7);
        C0933f0 c0933f0 = this.f6334h;
        c0933f0.m2286a(interfaceC1235p);
        c0933f0.m2286a(obj);
    }
}
