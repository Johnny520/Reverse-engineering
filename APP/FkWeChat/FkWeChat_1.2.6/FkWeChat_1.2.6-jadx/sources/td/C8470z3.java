package td;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: td.z3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8470z3 {

    /* JADX INFO: renamed from: a */
    public final String f28276a;

    /* JADX INFO: renamed from: b */
    public final String f28277b;

    /* JADX INFO: renamed from: c */
    public final String f28278c;

    /* JADX INFO: renamed from: d */
    public final String f28279d;

    /* JADX INFO: renamed from: e */
    public final String f28280e;

    /* JADX INFO: renamed from: f */
    public final String f28281f;

    public C8470z3(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.f28276a = str;
        this.f28277b = str2;
        this.f28278c = str3;
        this.f28279d = str4;
        this.f28280e = str5;
        this.f28281f = str6;
    }

    /* JADX INFO: renamed from: a */
    public final String m32531a() {
        return this.f28276a;
    }

    /* JADX INFO: renamed from: b */
    public final String m32532b() {
        return this.f28278c;
    }

    /* JADX INFO: renamed from: c */
    public final String m32533c() {
        return this.f28279d;
    }

    /* JADX INFO: renamed from: d */
    public final String m32534d() {
        return this.f28277b;
    }

    /* JADX INFO: renamed from: e */
    public final String m32535e() {
        return this.f28281f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8470z3)) {
            return false;
        }
        C8470z3 c8470z3 = (C8470z3) obj;
        return AbstractC1061t.m3842c(this.f28276a, c8470z3.f28276a) && AbstractC1061t.m3842c(this.f28277b, c8470z3.f28277b) && AbstractC1061t.m3842c(this.f28278c, c8470z3.f28278c) && AbstractC1061t.m3842c(this.f28279d, c8470z3.f28279d) && AbstractC1061t.m3842c(this.f28280e, c8470z3.f28280e) && AbstractC1061t.m3842c(this.f28281f, c8470z3.f28281f);
    }

    /* JADX INFO: renamed from: f */
    public final String m32536f() {
        return this.f28280e;
    }

    public int hashCode() {
        return (((((((((this.f28276a.hashCode() * 31) + this.f28277b.hashCode()) * 31) + this.f28278c.hashCode()) * 31) + this.f28279d.hashCode()) * 31) + this.f28280e.hashCode()) * 31) + this.f28281f.hashCode();
    }

    public String toString() {
        return "OnlinePlugin(author=" + this.f28276a + ", name=" + this.f28277b + ", description=" + this.f28278c + ", downloadUrl=" + this.f28279d + ", version=" + this.f28280e + ", readme=" + this.f28281f + ")";
    }
}
