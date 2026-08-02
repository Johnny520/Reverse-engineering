package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class no2 implements oo2 {

    /* JADX INFO: renamed from: a */
    public final String f7272a;

    /* JADX INFO: renamed from: b */
    public final String f7273b;

    /* JADX INFO: renamed from: c */
    public final String f7274c;

    /* JADX INFO: renamed from: d */
    public final String f7275d;

    /* JADX INFO: renamed from: e */
    public final int f7276e;

    public no2(int i, String str, String str2, String str3, String str4) {
        str4.getClass();
        this.f7272a = str;
        this.f7273b = str2;
        this.f7274c = str3;
        this.f7275d = str4;
        this.f7276e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no2)) {
            return false;
        }
        no2 no2Var = (no2) obj;
        return this.f7272a.equals(no2Var.f7272a) && this.f7273b.equals(no2Var.f7273b) && this.f7274c.equals(no2Var.f7274c) && t11.m5086l(this.f7275d, no2Var.f7275d) && this.f7276e == no2Var.f7276e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7276e) + hk1.m2207f(this.f7275d, hk1.m2207f(this.f7274c, hk1.m2207f(this.f7273b, this.f7272a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("Voice(talker=", this.f7272a, ", voiceName=", this.f7273b, ", sourcePath=");
        hk1.m2216o(sbM5696o, this.f7274c, ", targetPath=", this.f7275d, ", durationMs=");
        sbM5696o.append(this.f7276e);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }
}
