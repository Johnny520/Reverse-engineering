package p076f5;

import bsh.C1259t2;
import p094g5.C2526i;
import p094g5.C2528k;
import p094g5.InterfaceC2518a;
import p094g5.InterfaceC2527j;

/* JADX INFO: renamed from: f5.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2291c {

    /* JADX INFO: renamed from: a */
    public final C2293e f6269a;

    /* JADX INFO: renamed from: b */
    public final int f6270b;

    /* JADX INFO: renamed from: c */
    public final int f6271c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2290b f6272d;

    /* JADX INFO: renamed from: e */
    public final C2528k f6273e;

    /* JADX INFO: renamed from: f */
    public int f6274f;

    public C2291c(C2293e c2293e, int i10, int i11, AbstractC2290b abstractC2290b) {
        if (c2293e == null) {
            C1259t2.m5095a("cf == null");
            throw null;
        }
        if (abstractC2290b == null) {
            C1259t2.m5095a("attributeFactory == null");
            throw null;
        }
        int iM33858n = c2293e.m8364e().m33858n(i11);
        this.f6269a = c2293e;
        this.f6270b = i10;
        this.f6271c = i11;
        this.f6272d = abstractC2290b;
        this.f6273e = new C2528k(iM33858n);
        this.f6274f = -1;
    }

    /* JADX INFO: renamed from: a */
    public int m8349a() {
        m8352d();
        return this.f6274f;
    }

    /* JADX INFO: renamed from: b */
    public C2528k m8350b() {
        m8352d();
        return this.f6273e;
    }

    /* JADX INFO: renamed from: c */
    public final void m8351c() {
        int size = this.f6273e.size();
        int iMo5336a = this.f6271c + 2;
        this.f6269a.m8364e();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                InterfaceC2518a interfaceC2518aM8347a = this.f6272d.m8347a(this.f6269a, this.f6270b, iMo5336a, null);
                iMo5336a += interfaceC2518aM8347a.mo5336a();
                this.f6273e.m9034F(i10, interfaceC2518aM8347a);
            } catch (C2526i e10) {
                e10.m3685a("...while parsing attributes[" + i10 + "]");
                throw e10;
            } catch (RuntimeException e11) {
                C2526i c2526i = new C2526i(e11);
                c2526i.m3685a("...while parsing attributes[" + i10 + "]");
                throw c2526i;
            }
        }
        this.f6274f = iMo5336a;
    }

    /* JADX INFO: renamed from: d */
    public final void m8352d() {
        if (this.f6274f < 0) {
            m8351c();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m8353e(InterfaceC2527j interfaceC2527j) {
    }
}
