package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class me1 {

    /* JADX INFO: renamed from: a */
    public final String f6584a;

    /* JADX INFO: renamed from: b */
    public final File f6585b;

    /* JADX INFO: renamed from: c */
    public final th2 f6586c;

    /* JADX INFO: renamed from: d */
    public final rk2 f6587d;

    /* JADX INFO: renamed from: e */
    public final String f6588e;

    public me1(String str, File file, th2 th2Var, rk2 rk2Var, String str2) {
        str.getClass();
        rk2Var.getClass();
        str2.getClass();
        this.f6584a = str;
        this.f6585b = file;
        this.f6586c = th2Var;
        this.f6587d = rk2Var;
        this.f6588e = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m3066a() {
        return this.f6584a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me1)) {
            return false;
        }
        me1 me1Var = (me1) obj;
        return t11.m5086l(this.f6584a, me1Var.f6584a) && this.f6585b.equals(me1Var.f6585b) && this.f6586c.equals(me1Var.f6586c) && this.f6587d == me1Var.f6587d && t11.m5086l(this.f6588e, me1Var.f6588e);
    }

    public final int hashCode() {
        return this.f6588e.hashCode() + ((this.f6587d.hashCode() + ((this.f6586c.hashCode() + ((this.f6585b.hashCode() + (this.f6584a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManagedScriptRuntime(scriptId=");
        sb.append(this.f6584a);
        sb.append(", directory=");
        sb.append(this.f6585b);
        sb.append(", manifest=");
        sb.append(this.f6586c);
        sb.append(", state=");
        sb.append(this.f6587d);
        sb.append(", quickJsVersion=");
        return hk1.m2211j(sb, this.f6588e, ")");
    }
}
