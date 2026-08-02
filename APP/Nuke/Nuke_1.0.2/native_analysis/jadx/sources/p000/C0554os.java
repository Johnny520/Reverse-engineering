package p000;

/* JADX INFO: renamed from: os */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0554os {

    /* JADX INFO: renamed from: a */
    public boolean f7820a;

    /* JADX INFO: renamed from: b */
    public Object f7821b;

    /* JADX INFO: renamed from: c */
    public Object f7822c;

    /* JADX INFO: renamed from: d */
    public Object f7823d;

    /* JADX INFO: renamed from: e */
    public Object f7824e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public int m3630a(dq1 dq1Var, ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        us0 us0Var = (us0) this.f7822c;
        xs0 xs0Var = (xs0) this.f7824e;
        if (this.f7820a) {
            return 0;
        }
        try {
            this.f7820a = true;
            er2 er2VarM2181D = ((hh1) this.f7823d).m2181D(dq1Var, viewTreeObserverOnGlobalLayoutListenerC0045b7);
            gd1 gd1Var = (gd1) er2VarM2181D.f2577j;
            int iM1833g = gd1Var.m1833g();
            for (int i3 = 0; i3 < iM1833g; i3++) {
                o12 o12Var = (o12) gd1Var.m1834h(i3);
                if (!o12Var.f7423d && !o12Var.f7427h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iM1833g2 = gd1Var.m1833g();
            for (int i4 = 0; i4 < iM1833g2; i4++) {
                o12 o12Var2 = (o12) gd1Var.m1834h(i4);
                if (objArr != false || tp0.m5367o(o12Var2)) {
                    ((r61) this.f7821b).m4394z(o12Var2.f7422c, (xs0) this.f7824e, o12Var2.f7428i, true);
                    if (!xs0Var.f13155h.m2932h()) {
                        us0Var.m5574a(o12Var2.f7420a, xs0Var, tp0.m5367o(o12Var2));
                        xs0Var.clear();
                    }
                }
            }
            boolean zM5575b = us0Var.m5575b(er2VarM2181D, z);
            if (er2VarM2181D.f2576i) {
                i = 0;
            } else {
                int iM1833g3 = gd1Var.m1833g();
                for (int i5 = 0; i5 < iM1833g3; i5++) {
                    o12 o12Var3 = (o12) gd1Var.m1834h(i5);
                    if (!rs1.m4609b(tp0.m5343E(o12Var3, true), 0L) && o12Var3.m3464b()) {
                        i = 1;
                        break;
                    }
                }
                i = 0;
            }
            int iM1833g4 = gd1Var.m1833g();
            int i6 = 0;
            while (true) {
                if (i6 >= iM1833g4) {
                    i2 = 0;
                    break;
                }
                if (((o12) gd1Var.m1834h(i6)).m3464b()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (zM5575b ? 1 : 0) | (i << 1) | (i2 << 2);
            this.f7820a = false;
            return i7;
        } catch (Throwable th) {
            this.f7820a = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3631b(int i, int i2) {
        if (i < 0.0f) {
            nz0.m3456a("Index should be non-negative (" + i + ')');
        }
        ((kx1) this.f7821b).m2760h(i);
        d81 d81Var = (d81) this.f7824e;
        if (i != d81Var.f1910i) {
            d81Var.f1910i = i;
            int i3 = (i / 30) * 30;
            d81Var.f1909h.setValue(ci0.m799X(Math.max(i3 - 100, 0), i3 + 130));
        }
        ((kx1) this.f7822c).m2760h(i2);
    }
}
