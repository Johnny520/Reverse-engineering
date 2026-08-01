package p000;

/* JADX INFO: renamed from: fe */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0206fe {

    /* JADX INFO: renamed from: a */
    public boolean f1696a;

    /* JADX INFO: renamed from: b */
    public Object f1697b;

    /* JADX INFO: renamed from: c */
    public Object f1698c;

    /* JADX INFO: renamed from: d */
    public Object f1699d;

    /* JADX INFO: renamed from: e */
    public Object f1700e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v10, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: java.lang.Object[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public int m1090a(C0111d c0111d, ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        C0491my c0491my = (C0491my) this.f1698c;
        C0632py c0632py = (C0632py) this.f1700e;
        if (this.f1696a) {
            return 0;
        }
        try {
            this.f1696a = true;
            C0111d c0111dM5077q = ((C0910x1) this.f1699d).m5077q(c0111d, viewTreeObserverOnGlobalLayoutListenerC0875w3);
            ub0 ub0Var = (ub0) c0111dM5077q.f919e;
            int iM4297d = ub0Var.m4297d();
            for (int i3 = 0; i3 < iM4297d; i3++) {
                nr0 nr0Var = (nr0) ub0Var.m4298e(i3);
                if (!nr0Var.f4308d && !nr0Var.f4312h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iM4297d2 = ub0Var.m4297d();
            for (int i4 = 0; i4 < iM4297d2; i4++) {
                nr0 nr0Var2 = (nr0) ub0Var.m4298e(i4);
                if (objArr != false || w60.m4902i(nr0Var2)) {
                    ((b60) this.f1697b).m265A(nr0Var2.f4307c, (C0632py) this.f1700e, nr0Var2.f4313i, true);
                    if (!c0632py.f4984d.m704h()) {
                        c0491my.m2607a(nr0Var2.f4305a, c0632py, w60.m4902i(nr0Var2));
                        c0632py.clear();
                    }
                }
            }
            boolean zM2608b = c0491my.m2608b(c0111dM5077q, z);
            int iM4297d3 = ub0Var.m4297d();
            int i5 = 0;
            while (true) {
                if (i5 >= iM4297d3) {
                    i = 0;
                    break;
                }
                nr0 nr0Var3 = (nr0) ub0Var.m4298e(i5);
                if (!ok0.m2931b(w60.m4883E(nr0Var3, true), 0L) && nr0Var3.m2737b()) {
                    i = 1;
                    break;
                }
                i5++;
            }
            int iM4297d4 = ub0Var.m4297d();
            int i6 = 0;
            while (true) {
                if (i6 >= iM4297d4) {
                    i2 = 0;
                    break;
                }
                if (((nr0) ub0Var.m4298e(i6)).m2737b()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (zM2608b ? 1 : 0) | (i << 1) | (i2 << 2);
            this.f1696a = false;
            return i7;
        } catch (Throwable th) {
            this.f1696a = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m1091b(int i, int i2) {
        if (i < 0.0f) {
            z10.m5361a("Index should be non-negative (" + i + ')');
        }
        ((dp0) this.f1697b).m721h(i);
        ((t70) this.f1700e).m4190a(i);
        ((dp0) this.f1698c).m721h(i2);
    }
}
