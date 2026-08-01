package p000;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class iu0 {

    /* JADX INFO: renamed from: a */
    public Set f2618a;

    /* JADX INFO: renamed from: b */
    public C0890wi f2619b;

    /* JADX INFO: renamed from: c */
    public final sh0 f2620c;

    /* JADX INFO: renamed from: d */
    public kh0 f2621d;

    /* JADX INFO: renamed from: e */
    public sh0 f2622e;

    /* JADX INFO: renamed from: f */
    public final sh0 f2623f;

    /* JADX INFO: renamed from: g */
    public final sh0 f2624g;

    /* JADX INFO: renamed from: h */
    public kh0 f2625h;

    /* JADX INFO: renamed from: i */
    public jh0 f2626i;

    /* JADX INFO: renamed from: j */
    public ArrayList f2627j;

    /* JADX INFO: renamed from: k */
    public kh0 f2628k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public iu0() {
        sh0 sh0Var = new sh0(new ku0[16]);
        this.f2620c = sh0Var;
        kh0 kh0Var = ey0.f1546a;
        this.f2621d = new kh0();
        this.f2622e = sh0Var;
        this.f2623f = new sh0(new Object[16]);
        this.f2624g = new sh0(new InterfaceC0298hw[16]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final boolean m1597f(ku0 ku0Var, sh0 sh0Var) {
        Object[] objArr = sh0Var.f5768d;
        int i = sh0Var.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            ju0 ju0Var = ((ku0) objArr[i2]).f3270a;
            if (ju0Var instanceof zp0) {
                sh0 sh0Var2 = ((zp0) ju0Var).f7979e;
                if (sh0Var2.m4080j(ku0Var) || m1597f(ku0Var, sh0Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1598a() {
        this.f2618a = null;
        this.f2619b = null;
        sh0 sh0Var = this.f2620c;
        sh0Var.m4077g();
        this.f2621d.m1891b();
        this.f2622e = sh0Var;
        this.f2623f.m4077g();
        this.f2624g.m4077g();
        this.f2625h = null;
        this.f2626i = null;
        this.f2627j = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1599b() {
        Set set = this.f2618a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ju0 ju0Var = (ju0) it.next();
                it.remove();
                ju0Var.mo785d();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:9:0x001b */
    /* JADX INFO: renamed from: c */
    public final void m1600c() {
        Set set = this.f2618a;
        if (set == null) {
            return;
        }
        this.f2628k = null;
        sh0 sh0Var = this.f2623f;
        int i = 2;
        if (sh0Var.f5770f != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                kh0 kh0Var = this.f2625h;
                int i2 = sh0Var.f5770f;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = sh0Var.f5768d[i2];
                    try {
                        if (obj instanceof ku0) {
                            ju0 ju0Var = ((ku0) obj).f3270a;
                            set.remove(ju0Var);
                            ju0Var.mo786e();
                        }
                        if (obj instanceof InterfaceC0852vh) {
                            if (kh0Var == null || !kh0Var.m1892c(obj)) {
                                ((InterfaceC0852vh) obj).mo289b();
                            } else {
                                ((InterfaceC0852vh) obj).mo287a();
                            }
                        }
                    } catch (Throwable th) {
                        C0890wi c0890wi = this.f2619b;
                        if (c0890wi != null) {
                            rd0.m3464W(th, new C0081c7(i, c0890wi, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        sh0 sh0Var2 = this.f2620c;
        if (sh0Var2.f5770f != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.f2618a;
                if (set2 != null) {
                    Object[] objArr = sh0Var2.f5768d;
                    int i3 = sh0Var2.f5770f;
                    for (int i4 = 0; i4 < i3; i4++) {
                        ku0 ku0Var = (ku0) objArr[i4];
                        ju0 ju0Var2 = ku0Var.f3270a;
                        set2.remove(ju0Var2);
                        try {
                            ju0Var2.mo784c();
                        } catch (Throwable th2) {
                            C0890wi c0890wi2 = this.f2619b;
                            if (c0890wi2 != null) {
                                rd0.m3464W(th2, new C0081c7(i, c0890wi2, ku0Var));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1601d() {
        sh0 sh0Var = this.f2624g;
        if (sh0Var.f5770f != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = sh0Var.f5768d;
                int i = sh0Var.f5770f;
                for (int i2 = 0; i2 < i; i2++) {
                    ((InterfaceC0298hw) objArr[i2]).invoke();
                }
                sh0Var.m4077g();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1602e(ku0 ku0Var) {
        if (!this.f2621d.m1892c(ku0Var)) {
            kh0 kh0Var = this.f2628k;
            if (kh0Var == null || !kh0Var.m1892c(ku0Var)) {
                this.f2623f.m4072b(ku0Var);
                return;
            }
            return;
        }
        this.f2621d.m1901l(ku0Var);
        if (!this.f2622e.m4080j(ku0Var)) {
            sh0 sh0Var = this.f2620c;
            if (!sh0Var.m4080j(ku0Var)) {
                m1597f(ku0Var, sh0Var);
            }
        }
        Set set = this.f2618a;
        if (set == null) {
            return;
        }
        set.add(ku0Var.f3270a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m1603g(Set set, C0890wi c0890wi) {
        m1598a();
        this.f2618a = set;
        this.f2619b = c0890wi;
    }
}
