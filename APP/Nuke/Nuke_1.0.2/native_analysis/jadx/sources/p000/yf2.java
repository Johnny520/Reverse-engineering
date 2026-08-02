package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yf2 {

    /* JADX INFO: renamed from: a */
    public final String f13438a;

    /* JADX INFO: renamed from: b */
    public final String f13439b;

    /* JADX INFO: renamed from: c */
    public final String f13440c;

    /* JADX INFO: renamed from: d */
    public final String f13441d;

    /* JADX INFO: renamed from: e */
    public final String f13442e;

    public yf2(String str, String str2, String str3, String str4, String str5) {
        this.f13438a = str;
        this.f13439b = str2;
        this.f13440c = str3;
        this.f13441d = str4;
        this.f13442e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf2)) {
            return false;
        }
        yf2 yf2Var = (yf2) obj;
        return this.f13438a.equals(yf2Var.f13438a) && this.f13439b.equals(yf2Var.f13439b) && this.f13440c.equals(yf2Var.f13440c) && this.f13441d.equals(yf2Var.f13441d) && t11.m5086l(this.f13442e, yf2Var.f13442e);
    }

    public final int hashCode() {
        int iM2207f = hk1.m2207f(this.f13441d, hk1.m2207f(this.f13440c, hk1.m2207f(this.f13439b, this.f13438a.hashCode() * 31, 31), 31), 31);
        String str = this.f13442e;
        return iM2207f + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("ScriptConversationRef(platform=", this.f13438a, ", accountId=", this.f13439b, ", id=");
        hk1.m2216o(sbM5696o, this.f13440c, ", type=", this.f13441d, ", name=");
        return hk1.m2211j(sbM5696o, this.f13442e, ")");
    }
}
