package p000;

/* JADX INFO: renamed from: hi */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0278hi {

    /* JADX INFO: renamed from: a */
    public final String f4023a;

    /* JADX INFO: renamed from: b */
    public final String f4024b;

    /* JADX INFO: renamed from: c */
    public final String f4025c;

    /* JADX INFO: renamed from: d */
    public final String f4026d;

    /* JADX INFO: renamed from: e */
    public final int f4027e;

    /* JADX INFO: renamed from: f */
    public final String f4028f;

    /* JADX INFO: renamed from: g */
    public final String f4029g;

    public C0278hi(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        str3.getClass();
        this.f4023a = str;
        this.f4024b = str2;
        this.f4025c = str3;
        this.f4026d = str4;
        this.f4027e = i;
        this.f4028f = str5;
        this.f4029g = str6;
    }

    /* JADX INFO: renamed from: a */
    public final String m2192a() {
        return this.f4023a + ":" + this.f4024b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0278hi)) {
            return false;
        }
        C0278hi c0278hi = (C0278hi) obj;
        return this.f4023a.equals(c0278hi.f4023a) && this.f4024b.equals(c0278hi.f4024b) && t11.m5086l(this.f4025c, c0278hi.f4025c) && this.f4026d.equals(c0278hi.f4026d) && this.f4027e == c0278hi.f4027e && this.f4028f.equals(c0278hi.f4028f) && this.f4029g.equals(c0278hi.f4029g);
    }

    public final int hashCode() {
        return this.f4029g.hashCode() + hk1.m2207f(this.f4028f, vi0.m5685d(this.f4027e, hk1.m2207f(this.f4026d, hk1.m2207f(this.f4025c, hk1.m2207f(this.f4024b, this.f4023a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("TransferInfo(transactionId=", this.f4023a, ", transferId=", this.f4024b, ", payerUsername=");
        hk1.m2216o(sbM5696o, this.f4025c, ", receiverUsername=", this.f4026d, ", invalidTime=");
        sbM5696o.append(this.f4027e);
        sbM5696o.append(", amountDescription=");
        sbM5696o.append(this.f4028f);
        sbM5696o.append(", talker=");
        return hk1.m2211j(sbM5696o, this.f4029g, ")");
    }
}
