package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class os {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v10, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public int a(dq1 dq1Var, b7 b7Var, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        us0 us0Var = (us0) this.c;
        xs0 xs0Var = (xs0) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            er2 er2VarD = ((hh1) this.d).D(dq1Var, b7Var);
            gd1 gd1Var = (gd1) er2VarD.j;
            int iG = gd1Var.g();
            for (int i3 = 0; i3 < iG; i3++) {
                o12 o12Var = (o12) gd1Var.h(i3);
                if (!o12Var.d && !o12Var.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iG2 = gd1Var.g();
            for (int i4 = 0; i4 < iG2; i4++) {
                o12 o12Var2 = (o12) gd1Var.h(i4);
                if (objArr != false || tp0.o(o12Var2)) {
                    ((r61) this.b).z(o12Var2.c, (xs0) this.e, o12Var2.i, true);
                    if (!xs0Var.h.h()) {
                        us0Var.a(o12Var2.a, xs0Var, tp0.o(o12Var2));
                        xs0Var.clear();
                    }
                }
            }
            boolean zB = us0Var.b(er2VarD, z);
            if (er2VarD.i) {
                i = 0;
            } else {
                int iG3 = gd1Var.g();
                for (int i5 = 0; i5 < iG3; i5++) {
                    o12 o12Var3 = (o12) gd1Var.h(i5);
                    if (!rs1.b(tp0.E(o12Var3, true), 0L) && o12Var3.b()) {
                        i = 1;
                        break;
                    }
                }
                i = 0;
            }
            int iG4 = gd1Var.g();
            int i6 = 0;
            while (true) {
                if (i6 >= iG4) {
                    i2 = 0;
                    break;
                }
                if (((o12) gd1Var.h(i6)).b()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (zB ? 1 : 0) | (i << 1) | (i2 << 2);
            this.a = false;
            return i7;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(int i, int i2) {
        if (i < 0.0f) {
            nz0.a("Index should be non-negative (" + i + ')');
        }
        ((kx1) this.b).h(i);
        d81 d81Var = (d81) this.e;
        if (i != d81Var.i) {
            d81Var.i = i;
            int i3 = (i / 30) * 30;
            d81Var.h.setValue(ci0.X(Math.max(i3 - 100, 0), i3 + 130));
        }
        ((kx1) this.c).h(i2);
    }
}
