package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lh2 {

    /* JADX INFO: renamed from: a */
    public final String f6121a;

    /* JADX INFO: renamed from: b */
    public final String f6122b;

    public lh2(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f6121a = str;
        this.f6122b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh2)) {
            return false;
        }
        lh2 lh2Var = (lh2) obj;
        return t11.m5086l(this.f6121a, lh2Var.f6121a) && t11.m5086l(this.f6122b, lh2Var.f6122b);
    }

    public final int hashCode() {
        return this.f6122b.hashCode() + (this.f6121a.hashCode() * 31);
    }

    public final String toString() {
        return vi0.m5692k("ScriptHostRuntimeContext(scriptId=", this.f6121a, ", scriptName=", this.f6122b, ")");
    }
}
