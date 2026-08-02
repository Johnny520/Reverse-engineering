package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yp2 {

    /* JADX INFO: renamed from: a */
    public final int f13555a;

    /* JADX INFO: renamed from: b */
    public final sx0 f13556b;

    /* JADX INFO: renamed from: c */
    public final String f13557c;

    /* JADX INFO: renamed from: d */
    public final String f13558d;

    /* JADX INFO: renamed from: e */
    public final boolean f13559e;

    public yp2(int i, sx0 sx0Var, String str, String str2, boolean z) {
        this.f13555a = i;
        this.f13556b = sx0Var;
        this.f13557c = str;
        this.f13558d = str2;
        this.f13559e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yp2)) {
            return false;
        }
        yp2 yp2Var = (yp2) obj;
        return this.f13555a == yp2Var.f13555a && t11.m5086l(this.f13556b, yp2Var.f13556b) && t11.m5086l(this.f13557c, yp2Var.f13557c) && t11.m5086l(this.f13558d, yp2Var.f13558d) && this.f13559e == yp2Var.f13559e;
    }

    public final int hashCode() {
        int iHashCode = (this.f13556b.hashCode() + (Integer.hashCode(this.f13555a) * 31)) * 31;
        String str = this.f13557c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f13558d;
        return Boolean.hashCode(this.f13559e) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsPreference(titleRes=");
        sb.append(this.f13555a);
        sb.append(", icon=");
        sb.append(this.f13556b);
        sb.append(", route=");
        hk1.m2216o(sb, this.f13557c, ", badge=", this.f13558d, ", badgeWarning=");
        sb.append(this.f13559e);
        sb.append(")");
        return sb.toString();
    }
}
