package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vj {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final boolean c = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vj(boolean z) {
        this.a = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean b() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean c() {
        return false;
    }

    public abstract String d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean e() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean f() {
        String str = up0.n;
        if (str == null) {
            t11.S("hostPkgName");
            throw null;
        }
        String str2 = up0.m;
        if (str2 != null) {
            return str2.equals(str);
        }
        t11.S("hostProcess");
        throw null;
    }

    public void g() {
    }

    public void i() {
    }

    public void h(vb1 vb1Var) {
    }
}
