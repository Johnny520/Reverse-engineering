package p076f5;

import bsh.C1259t2;
import p094g5.C2526i;
import p094g5.C2528k;
import p094g5.InterfaceC2519b;
import p094g5.InterfaceC2523f;
import p094g5.InterfaceC2527j;
import p254r5.C6492c0;
import p254r5.C6496e0;
import p254r5.C6521z;
import p254r5.InterfaceC6489b;
import p309v5.C8822d;
import p376zd.C9987e;

/* JADX INFO: renamed from: f5.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2295g {

    /* JADX INFO: renamed from: a */
    public final C2293e f6292a;

    /* JADX INFO: renamed from: b */
    public final C6496e0 f6293b;

    /* JADX INFO: renamed from: c */
    public final int f6294c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2290b f6295d;

    /* JADX INFO: renamed from: e */
    public int f6296e;

    public AbstractC2295g(C2293e c2293e, C6496e0 c6496e0, int i10, AbstractC2290b abstractC2290b) {
        if (c2293e == null) {
            C1259t2.m5095a("cf == null");
            throw null;
        }
        if (i10 < 0) {
            C9987e.m38645a("offset < 0");
            throw null;
        }
        if (abstractC2290b == null) {
            C1259t2.m5095a("attributeFactory == null");
            throw null;
        }
        this.f6292a = c2293e;
        this.f6293b = c6496e0;
        this.f6294c = i10;
        this.f6295d = abstractC2290b;
        this.f6296e = -1;
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo8385a();

    /* JADX INFO: renamed from: b */
    public final int m8389b() {
        return this.f6292a.m8364e().m33858n(this.f6294c);
    }

    /* JADX INFO: renamed from: c */
    public final C6496e0 m8390c() {
        return this.f6293b;
    }

    /* JADX INFO: renamed from: d */
    public int m8391d() {
        m8393g();
        return this.f6296e;
    }

    /* JADX INFO: renamed from: e */
    public abstract String mo8386e();

    /* JADX INFO: renamed from: f */
    public final void m8392f() {
        int iMo8385a = mo8385a();
        int iM8389b = m8389b();
        int iM8349a = this.f6294c + 2;
        C8822d c8822dM8364e = this.f6292a.m8364e();
        InterfaceC6489b interfaceC6489bM8365f = this.f6292a.m8365f();
        for (int i10 = 0; i10 < iM8389b; i10++) {
            try {
                int iM33858n = c8822dM8364e.m33858n(iM8349a);
                int iM33858n2 = c8822dM8364e.m33858n(iM8349a + 2);
                int iM33858n3 = c8822dM8364e.m33858n(iM8349a + 4);
                C6492c0 c6492c0 = (C6492c0) interfaceC6489bM8365f.get(iM33858n2);
                C6492c0 c6492c02 = (C6492c0) interfaceC6489bM8365f.get(iM33858n3);
                C2291c c2291c = new C2291c(this.f6292a, iMo8385a, iM8349a + 6, this.f6295d);
                c2291c.m8353e(null);
                iM8349a = c2291c.m8349a();
                C2528k c2528kM8350b = c2291c.m8350b();
                c2528kM8350b.mo6829t();
                mo8387h(i10, iM33858n, new C6521z(c6492c0, c6492c02), c2528kM8350b);
            } catch (C2526i e10) {
                e10.m3685a("...while parsing " + mo8386e() + "s[" + i10 + "]");
                throw e10;
            } catch (RuntimeException e11) {
                C2526i c2526i = new C2526i(e11);
                c2526i.m3685a("...while parsing " + mo8386e() + "s[" + i10 + "]");
                throw c2526i;
            }
        }
        this.f6296e = iM8349a;
    }

    /* JADX INFO: renamed from: g */
    public final void m8393g() {
        if (this.f6296e < 0) {
            m8392f();
        }
    }

    /* JADX INFO: renamed from: h */
    public abstract InterfaceC2523f mo8387h(int i10, int i11, C6521z c6521z, InterfaceC2519b interfaceC2519b);

    /* JADX INFO: renamed from: i */
    public final void m8394i(InterfaceC2527j interfaceC2527j) {
    }
}
