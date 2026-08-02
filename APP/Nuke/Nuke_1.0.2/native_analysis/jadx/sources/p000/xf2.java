package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xf2 {

    /* JADX INFO: renamed from: a */
    public final String f13010a;

    /* JADX INFO: renamed from: b */
    public final String f13011b;

    /* JADX INFO: renamed from: c */
    public final String f13012c;

    /* JADX INFO: renamed from: d */
    public final String f13013d;

    public xf2(String str, String str2, String str3, String str4) {
        this.f13010a = str;
        this.f13011b = str2;
        this.f13012c = str3;
        this.f13013d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf2)) {
            return false;
        }
        xf2 xf2Var = (xf2) obj;
        return t11.m5086l(this.f13010a, xf2Var.f13010a) && this.f13011b.equals(xf2Var.f13011b) && this.f13012c.equals(xf2Var.f13012c) && this.f13013d.equals(xf2Var.f13013d);
    }

    public final int hashCode() {
        String str = this.f13010a;
        return this.f13013d.hashCode() + hk1.m2207f(this.f13012c, hk1.m2207f(this.f13011b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("ScriptConfirmRequest(title=", this.f13010a, ", message=", this.f13011b, ", confirmText=");
        sbM5696o.append(this.f13012c);
        sbM5696o.append(", cancelText=");
        sbM5696o.append(this.f13013d);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }
}
