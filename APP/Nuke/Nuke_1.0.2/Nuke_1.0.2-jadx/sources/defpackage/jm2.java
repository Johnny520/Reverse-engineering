package defpackage;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jm2 {
    public final String a;
    public final z70 b;
    public final int c;
    public int d;
    public boolean e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jm2(String str, z70 z70Var, int i) {
        if (z70Var == null) {
            um2.f("file == null");
            throw null;
        }
        if (i <= 0 || ((i - 1) & i) != 0) {
            s.j("invalid alignment");
            throw null;
        }
        this.a = str;
        this.b = z70Var;
        this.c = i;
        this.d = -1;
        this.e = false;
    }

    public abstract int a(f21 f21Var);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        int i = this.d;
        if (i >= 0) {
            return i;
        }
        c80.j("fileOffset not set");
        return 0;
    }

    public abstract Collection c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        g();
        e();
        this.e = true;
    }

    public abstract void e();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        if (this.e) {
            return;
        }
        c80.j("not prepared");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        if (this.e) {
            c80.j("already prepared");
        }
    }

    public abstract int h();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(yn ynVar) {
        f();
        ynVar.a(this.c);
        int i = ynVar.c;
        int i2 = this.d;
        if (i2 < 0) {
            this.d = i;
        } else if (i2 != i) {
            StringBuilder sb = new StringBuilder("alignment mismatch: for ");
            sb.append(this);
            int i3 = this.d;
            sb.append(", at ");
            sb.append(i);
            sb.append(", but expected ");
            sb.append(i3);
            throw new RuntimeException(sb.toString());
        }
        if (ynVar.d()) {
            String str = this.a;
            if (str != null) {
                ynVar.c("\n" + str + ":", 0);
            } else if (i != 0) {
                ynVar.c("\n", 0);
            }
        }
        j(ynVar);
    }

    public abstract void j(yn ynVar);
}
