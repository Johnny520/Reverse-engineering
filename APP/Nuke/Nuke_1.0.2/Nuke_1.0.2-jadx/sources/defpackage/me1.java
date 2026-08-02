package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class me1 {
    public final String a;
    public final File b;
    public final th2 c;
    public final rk2 d;
    public final String e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public me1(String str, File file, th2 th2Var, rk2 rk2Var, String str2) {
        str.getClass();
        rk2Var.getClass();
        str2.getClass();
        this.a = str;
        this.b = file;
        this.c = th2Var;
        this.d = rk2Var;
        this.e = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        return this.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me1)) {
            return false;
        }
        me1 me1Var = (me1) obj;
        return t11.l(this.a, me1Var.a) && this.b.equals(me1Var.b) && this.c.equals(me1Var.c) && this.d == me1Var.d && t11.l(this.e, me1Var.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagedScriptRuntime(scriptId=");
        sb.append(this.a);
        sb.append(", directory=");
        sb.append(this.b);
        sb.append(", manifest=");
        sb.append(this.c);
        sb.append(", state=");
        sb.append(this.d);
        sb.append(", quickJsVersion=");
        return hk1.j(sb, this.e, ")");
    }
}
