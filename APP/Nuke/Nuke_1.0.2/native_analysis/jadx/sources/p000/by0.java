package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class by0 {

    /* JADX INFO: renamed from: a */
    public final String f1074a;

    /* JADX INFO: renamed from: b */
    public final String f1075b;

    /* JADX INFO: renamed from: c */
    public final String f1076c;

    /* JADX INFO: renamed from: d */
    public final String f1077d;

    /* JADX INFO: renamed from: e */
    public final long f1078e;

    public by0(String str, String str2, String str3, String str4, long j) {
        this.f1074a = str;
        this.f1075b = str2;
        this.f1076c = str3;
        this.f1077d = str4;
        this.f1078e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by0)) {
            return false;
        }
        by0 by0Var = (by0) obj;
        return this.f1074a.equals(by0Var.f1074a) && this.f1075b.equals(by0Var.f1075b) && t11.m5086l(this.f1076c, by0Var.f1076c) && this.f1077d.equals(by0Var.f1077d) && this.f1078e == by0Var.f1078e;
    }

    public final int hashCode() {
        int iM2207f = hk1.m2207f(this.f1075b, this.f1074a.hashCode() * 31, 31);
        String str = this.f1076c;
        return Long.hashCode(this.f1078e) + hk1.m2207f(this.f1077d, (iM2207f + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("IncomingTextMessage(talker=", this.f1074a, ", content=", this.f1075b, ", groupSender=");
        hk1.m2216o(sbM5696o, this.f1076c, ", messageKey=", this.f1077d, ", createTime=");
        sbM5696o.append(this.f1078e);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }
}
