package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z72 {
    public Set a;
    public cy b;
    public final zk1 c;
    public sk1 d;
    public zk1 e;
    public final zk1 f;
    public final zk1 g;
    public sk1 h;
    public rk1 i;
    public ArrayList j;
    public sk1 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z72() {
        zk1 zk1Var = new zk1(new lo0[16]);
        this.c = zk1Var;
        sk1 sk1Var = fd2.a;
        this.d = new sk1();
        this.e = zk1Var;
        this.f = new zk1(new Object[16]);
        this.g = new zk1(new xm0[16]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean f(lo0 lo0Var, zk1 zk1Var) {
        Object[] objArr = zk1Var.h;
        int i = zk1Var.j;
        for (int i2 = 0; i2 < i; i2++) {
            a82 a82Var = ((lo0) objArr[i2]).a;
            if (a82Var instanceof ty1) {
                zk1 zk1Var2 = ((ty1) a82Var).i;
                if (zk1Var2.j(lo0Var) || f(lo0Var, zk1Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        this.a = null;
        this.b = null;
        zk1 zk1Var = this.c;
        zk1Var.g();
        this.d.b();
        this.e = zk1Var;
        this.f.g();
        this.g.g();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        Set set = this.a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a82 a82Var = (a82) it.next();
                it.remove();
                a82Var.d();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:9:0x001c */
    public final void c() {
        Set set = this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        zk1 zk1Var = this.f;
        int i = 12;
        if (zk1Var.j != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                sk1 sk1Var = this.h;
                int i2 = zk1Var.j;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = zk1Var.h[i2];
                    try {
                        if (obj instanceof lo0) {
                            a82 a82Var = ((lo0) obj).a;
                            set.remove(a82Var);
                            a82Var.f();
                        }
                        if (obj instanceof uw) {
                            if (sk1Var == null || !sk1Var.c(obj)) {
                                ((uw) obj).c();
                            } else {
                                ((uw) obj).a();
                            }
                        }
                    } catch (Throwable th) {
                        cy cyVar = this.b;
                        if (cyVar != null) {
                            se.R(th, new r1(i, cyVar, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        zk1 zk1Var2 = this.c;
        if (zk1Var2.j != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.a;
                if (set2 != null) {
                    Object[] objArr = zk1Var2.h;
                    int i3 = zk1Var2.j;
                    for (int i4 = 0; i4 < i3; i4++) {
                        lo0 lo0Var = (lo0) objArr[i4];
                        a82 a82Var2 = lo0Var.a;
                        set2.remove(a82Var2);
                        try {
                            a82Var2.a();
                        } catch (Throwable th2) {
                            cy cyVar2 = this.b;
                            if (cyVar2 != null) {
                                se.R(th2, new r1(i, cyVar2, lo0Var));
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
    public final void d() {
        zk1 zk1Var = this.g;
        if (zk1Var.j != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = zk1Var.h;
                int i = zk1Var.j;
                for (int i2 = 0; i2 < i; i2++) {
                    ((xm0) objArr[i2]).a();
                }
                zk1Var.g();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(lo0 lo0Var) {
        if (!this.d.c(lo0Var)) {
            sk1 sk1Var = this.k;
            if (sk1Var == null || !sk1Var.c(lo0Var)) {
                this.f.b(lo0Var);
                return;
            }
            return;
        }
        this.d.l(lo0Var);
        if (!this.e.j(lo0Var)) {
            zk1 zk1Var = this.c;
            if (!zk1Var.j(lo0Var)) {
                f(lo0Var, zk1Var);
            }
        }
        Set set = this.a;
        if (set == null) {
            return;
        }
        set.add(lo0Var.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(Set set, cy cyVar) {
        a();
        this.a = set;
        this.b = cyVar;
    }
}
