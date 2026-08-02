package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vy1 {

    /* JADX INFO: renamed from: a */
    public final String f12224a;

    /* JADX INFO: renamed from: b */
    public final String f12225b;

    /* JADX INFO: renamed from: c */
    public final List f12226c;

    /* JADX INFO: renamed from: d */
    public final boolean f12227d;

    public vy1(String str, String str2, List list, boolean z) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f12224a = str;
        this.f12225b = str2;
        this.f12226c = list;
        this.f12227d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy1)) {
            return false;
        }
        vy1 vy1Var = (vy1) obj;
        return t11.m5086l(this.f12224a, vy1Var.f12224a) && t11.m5086l(this.f12225b, vy1Var.f12225b) && t11.m5086l(this.f12226c, vy1Var.f12226c) && this.f12227d == vy1Var.f12227d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12227d) + ((this.f12226c.hashCode() + hk1.m2207f(this.f12225b, this.f12224a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("PendingScriptAuthorization(scriptId=", this.f12224a, ", scriptName=", this.f12225b, ", requests=");
        sbM5696o.append(this.f12226c);
        sbM5696o.append(", enableAfterGrant=");
        sbM5696o.append(this.f12227d);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }
}
