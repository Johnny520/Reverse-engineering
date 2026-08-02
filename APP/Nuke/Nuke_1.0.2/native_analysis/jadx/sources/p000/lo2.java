package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lo2 {

    /* JADX INFO: renamed from: a */
    public final String f6229a;

    /* JADX INFO: renamed from: b */
    public final String f6230b;

    /* JADX INFO: renamed from: c */
    public final long f6231c;

    /* JADX INFO: renamed from: d */
    public final long f6232d;

    public lo2(String str, String str2, long j, long j2) {
        this.f6229a = str;
        this.f6230b = str2;
        this.f6231c = j;
        this.f6232d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo2)) {
            return false;
        }
        lo2 lo2Var = (lo2) obj;
        return this.f6229a.equals(lo2Var.f6229a) && this.f6230b.equals(lo2Var.f6230b) && this.f6231c == lo2Var.f6231c && this.f6232d == lo2Var.f6232d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6232d) + hk1.m2204c(hk1.m2207f(this.f6230b, this.f6229a.hashCode() * 31, 31), 31, this.f6231c);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("SystemMsgInfo(talker=", this.f6229a, ", content=", this.f6230b, ", createTime=");
        sbM5696o.append(this.f6231c);
        sbM5696o.append(", localMessageId=");
        sbM5696o.append(this.f6232d);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }
}
