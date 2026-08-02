package p000;

/* JADX INFO: renamed from: a0 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0001a0 {

    /* JADX INFO: renamed from: a */
    public final String f0a;

    /* JADX INFO: renamed from: b */
    public final String f1b;

    /* JADX INFO: renamed from: c */
    public final String f2c;

    /* JADX INFO: renamed from: d */
    public final String f3d;

    /* JADX INFO: renamed from: e */
    public final int f4e;

    public C0001a0(int i, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f0a = str;
        this.f1b = str2;
        this.f2c = str3;
        this.f3d = str4;
        this.f4e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0001a0)) {
            return false;
        }
        C0001a0 c0001a0 = (C0001a0) obj;
        return t11.m5086l(this.f0a, c0001a0.f0a) && t11.m5086l(this.f1b, c0001a0.f1b) && t11.m5086l(this.f2c, c0001a0.f2c) && t11.m5086l(this.f3d, c0001a0.f3d) && this.f4e == c0001a0.f4e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4e) + hk1.m2207f(this.f3d, hk1.m2207f(this.f2c, hk1.m2207f(this.f1b, this.f0a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("ConversationSignature(baseUrl=", this.f0a, ", apiKey=", this.f1b, ", model=");
        hk1.m2216o(sbM5696o, this.f2c, ", systemPrompt=", this.f3d, ", contextRounds=");
        sbM5696o.append(this.f4e);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }
}
