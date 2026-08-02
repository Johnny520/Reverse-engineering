package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class id2 {

    /* JADX INFO: renamed from: a */
    public final String f4573a;

    /* JADX INFO: renamed from: b */
    public final String f4574b;

    public id2(String str, String str2) {
        this.f4573a = str;
        this.f4574b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id2)) {
            return false;
        }
        id2 id2Var = (id2) obj;
        return this.f4573a.equals(id2Var.f4573a) && t11.m5086l(this.f4574b, id2Var.f4574b);
    }

    public final int hashCode() {
        int iM2207f = hk1.m2207f(this.f4573a, 1224923546, 31);
        String str = this.f4574b;
        return iM2207f + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return vi0.m5692k("ScriptAccountRef(platform=wechat, id=", this.f4573a, ", name=", this.f4574b, ")");
    }
}
