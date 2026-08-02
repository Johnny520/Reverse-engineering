package p000;

/* JADX INFO: renamed from: mz */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0479mz {

    /* JADX INFO: renamed from: a */
    public final String f6923a;

    /* JADX INFO: renamed from: b */
    public final String f6924b;

    /* JADX INFO: renamed from: c */
    public final String f6925c;

    /* JADX INFO: renamed from: d */
    public final String f6926d;

    /* JADX INFO: renamed from: e */
    public final String f6927e;

    /* JADX INFO: renamed from: f */
    public final String f6928f;

    /* JADX INFO: renamed from: g */
    public final String f6929g;

    /* JADX INFO: renamed from: h */
    public final String f6930h;

    /* JADX INFO: renamed from: i */
    public final int f6931i;

    public C0479mz(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        this.f6923a = str;
        this.f6924b = str2;
        this.f6925c = str3;
        this.f6926d = str4;
        this.f6927e = str5;
        this.f6928f = str6;
        this.f6929g = str7;
        this.f6930h = str8;
        this.f6931i = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m3219a() {
        String str = this.f6926d;
        if (pv2.m4006s0(str)) {
            str = this.f6924b;
            if (pv2.m4006s0(str)) {
                return this.f6923a;
            }
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0479mz)) {
            return false;
        }
        C0479mz c0479mz = (C0479mz) obj;
        return this.f6923a.equals(c0479mz.f6923a) && this.f6924b.equals(c0479mz.f6924b) && this.f6925c.equals(c0479mz.f6925c) && this.f6926d.equals(c0479mz.f6926d) && this.f6927e.equals(c0479mz.f6927e) && this.f6928f.equals(c0479mz.f6928f) && this.f6929g.equals(c0479mz.f6929g) && this.f6930h.equals(c0479mz.f6930h) && this.f6931i == c0479mz.f6931i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6931i) + hk1.m2207f(this.f6930h, hk1.m2207f(this.f6929g, hk1.m2207f(this.f6928f, hk1.m2207f(this.f6927e, hk1.m2207f(this.f6926d, hk1.m2207f(this.f6925c, hk1.m2207f(this.f6924b, this.f6923a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("ContactInfoBean(wxId=", this.f6923a, ", nickname=", this.f6924b, ", customWxId=");
        hk1.m2216o(sbM5696o, this.f6925c, ", remarkName=", this.f6926d, ", initialNickname=");
        hk1.m2216o(sbM5696o, this.f6927e, ", nicknamePinyin=", this.f6928f, ", avatarUrl=");
        hk1.m2216o(sbM5696o, this.f6929g, ", encryptedUsername=", this.f6930h, ", type=");
        sbM5696o.append(this.f6931i);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }
}
