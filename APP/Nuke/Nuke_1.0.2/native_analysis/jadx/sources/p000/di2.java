package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class di2 {

    /* JADX INFO: renamed from: a */
    public final String f2070a;

    /* JADX INFO: renamed from: b */
    public final String f2071b;

    public di2(String str, String str2) {
        this.f2070a = str;
        this.f2071b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di2)) {
            return false;
        }
        di2 di2Var = (di2) obj;
        return this.f2070a.equals(di2Var.f2070a) && this.f2071b.equals(di2Var.f2071b);
    }

    public final int hashCode() {
        return this.f2071b.hashCode() + (this.f2070a.hashCode() * 31);
    }

    public final String toString() {
        return vi0.m5692k("ScriptMessageFileRef(area=", this.f2070a, ", path=", this.f2071b, ")");
    }
}
