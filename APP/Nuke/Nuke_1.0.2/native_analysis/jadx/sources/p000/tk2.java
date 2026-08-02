package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tk2 {

    /* JADX INFO: renamed from: a */
    public final String f10817a;

    /* JADX INFO: renamed from: b */
    public final boolean f10818b;

    /* JADX INFO: renamed from: c */
    public final Throwable f10819c;

    public tk2(String str, boolean z, Throwable th) {
        str.getClass();
        this.f10817a = str;
        this.f10818b = z;
        this.f10819c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk2)) {
            return false;
        }
        tk2 tk2Var = (tk2) obj;
        return t11.m5086l(this.f10817a, tk2Var.f10817a) && this.f10818b == tk2Var.f10818b && t11.m5086l(this.f10819c, tk2Var.f10819c);
    }

    public final int hashCode() {
        int iM2205d = hk1.m2205d(this.f10817a.hashCode() * 31, 31, this.f10818b);
        Throwable th = this.f10819c;
        return iM2205d + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "ScriptStopResult(scriptId=" + this.f10817a + ", stopped=" + this.f10818b + ", failure=" + this.f10819c + ")";
    }
}
