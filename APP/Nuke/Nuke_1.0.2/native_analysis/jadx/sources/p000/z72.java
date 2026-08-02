package p000;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z72 {

    /* JADX INFO: renamed from: a */
    public Set f13768a;

    /* JADX INFO: renamed from: b */
    public C0110cy f13769b;

    /* JADX INFO: renamed from: c */
    public final zk1 f13770c;

    /* JADX INFO: renamed from: d */
    public sk1 f13771d;

    /* JADX INFO: renamed from: e */
    public zk1 f13772e;

    /* JADX INFO: renamed from: f */
    public final zk1 f13773f;

    /* JADX INFO: renamed from: g */
    public final zk1 f13774g;

    /* JADX INFO: renamed from: h */
    public sk1 f13775h;

    /* JADX INFO: renamed from: i */
    public rk1 f13776i;

    /* JADX INFO: renamed from: j */
    public ArrayList f13777j;

    /* JADX INFO: renamed from: k */
    public sk1 f13778k;

    public z72() {
        zk1 zk1Var = new zk1(new lo0[16]);
        this.f13770c = zk1Var;
        sk1 sk1Var = fd2.f2911a;
        this.f13771d = new sk1();
        this.f13772e = zk1Var;
        this.f13773f = new zk1(new Object[16]);
        this.f13774g = new zk1(new xm0[16]);
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m6389f(lo0 lo0Var, zk1 zk1Var) {
        Object[] objArr = zk1Var.f13934h;
        int i = zk1Var.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            a82 a82Var = ((lo0) objArr[i2]).f6226a;
            if (a82Var instanceof ty1) {
                zk1 zk1Var2 = ((ty1) a82Var).f11002i;
                if (zk1Var2.m6431j(lo0Var) || m6389f(lo0Var, zk1Var2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m6390a() {
        this.f13768a = null;
        this.f13769b = null;
        zk1 zk1Var = this.f13770c;
        zk1Var.m6428g();
        this.f13771d.m4883b();
        this.f13772e = zk1Var;
        this.f13773f.m6428g();
        this.f13774g.m6428g();
        this.f13775h = null;
        this.f13776i = null;
        this.f13777j = null;
    }

    /* JADX INFO: renamed from: b */
    public final void m6391b() {
        Set set = this.f13768a;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                a82 a82Var = (a82) it.next();
                it.remove();
                a82Var.mo110d();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6392c() {
        Set set = this.f13768a;
        if (set == null) {
            return;
        }
        this.f13778k = null;
        zk1 zk1Var = this.f13773f;
        int i = 12;
        if (zk1Var.f13936j != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                sk1 sk1Var = this.f13775h;
                int i2 = zk1Var.f13936j;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = zk1Var.f13934h[i2];
                    try {
                        if (obj instanceof lo0) {
                            a82 a82Var = ((lo0) obj).f6226a;
                            set.remove(a82Var);
                            a82Var.mo111f();
                        }
                        if (obj instanceof InterfaceC0788uw) {
                            if (sk1Var == null || !sk1Var.m4884c(obj)) {
                                ((InterfaceC0788uw) obj).mo1538c();
                            } else {
                                ((InterfaceC0788uw) obj).mo1537a();
                            }
                        }
                    } catch (Throwable th) {
                        C0110cy c0110cy = this.f13769b;
                        if (c0110cy != null) {
                            AbstractC0691se.m4829R(th, new C0640r1(i, c0110cy, obj));
                        }
                        throw th;
                    }
                }
            } finally {
            }
        }
        zk1 zk1Var2 = this.f13770c;
        if (zk1Var2.f13936j != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = this.f13768a;
                if (set2 != null) {
                    Object[] objArr = zk1Var2.f13934h;
                    int i3 = zk1Var2.f13936j;
                    for (int i4 = 0; i4 < i3; i4++) {
                        lo0 lo0Var = (lo0) objArr[i4];
                        a82 a82Var2 = lo0Var.f6226a;
                        set2.remove(a82Var2);
                        try {
                            a82Var2.mo109a();
                        } catch (Throwable th2) {
                            C0110cy c0110cy2 = this.f13769b;
                            if (c0110cy2 != null) {
                                AbstractC0691se.m4829R(th2, new C0640r1(i, c0110cy2, lo0Var));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6393d() {
        zk1 zk1Var = this.f13774g;
        if (zk1Var.f13936j != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = zk1Var.f13934h;
                int i = zk1Var.f13936j;
                for (int i2 = 0; i2 < i; i2++) {
                    ((xm0) objArr[i2]).mo6a();
                }
                zk1Var.m6428g();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m6394e(lo0 lo0Var) {
        if (!this.f13771d.m4884c(lo0Var)) {
            sk1 sk1Var = this.f13778k;
            if (sk1Var == null || !sk1Var.m4884c(lo0Var)) {
                this.f13773f.m6423b(lo0Var);
                return;
            }
            return;
        }
        this.f13771d.m4893l(lo0Var);
        if (!this.f13772e.m6431j(lo0Var)) {
            zk1 zk1Var = this.f13770c;
            if (!zk1Var.m6431j(lo0Var)) {
                m6389f(lo0Var, zk1Var);
            }
        }
        Set set = this.f13768a;
        if (set == null) {
            return;
        }
        set.add(lo0Var.f6226a);
    }

    /* JADX INFO: renamed from: g */
    public final void m6395g(Set set, C0110cy c0110cy) {
        m6390a();
        this.f13768a = set;
        this.f13769b = c0110cy;
    }
}
