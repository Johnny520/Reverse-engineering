package sd;

import java.util.UUID;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: sd.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7298a {

    /* JADX INFO: renamed from: a */
    public final String f24220a;

    /* JADX INFO: renamed from: b */
    public final String f24221b;

    /* JADX INFO: renamed from: c */
    public final String f24222c;

    /* JADX INFO: renamed from: d */
    public final String f24223d;

    /* JADX INFO: renamed from: e */
    public final String f24224e;

    /* JADX INFO: renamed from: f */
    public final String f24225f;

    /* JADX INFO: renamed from: g */
    public final String f24226g;

    public C7298a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        this.f24220a = str;
        this.f24221b = str2;
        this.f24222c = str3;
        this.f24223d = str4;
        this.f24224e = str5;
        this.f24225f = str6;
        this.f24226g = str7;
    }

    /* JADX INFO: renamed from: a */
    public final String m28926a() {
        return this.f24225f;
    }

    /* JADX INFO: renamed from: b */
    public final String m28927b() {
        return this.f24223d;
    }

    /* JADX INFO: renamed from: c */
    public final String m28928c() {
        return this.f24220a;
    }

    /* JADX INFO: renamed from: d */
    public final String m28929d() {
        return this.f24226g;
    }

    /* JADX INFO: renamed from: e */
    public final String m28930e() {
        return this.f24221b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7298a)) {
            return false;
        }
        C7298a c7298a = (C7298a) obj;
        return AbstractC1061t.m3842c(this.f24220a, c7298a.f24220a) && AbstractC1061t.m3842c(this.f24221b, c7298a.f24221b) && AbstractC1061t.m3842c(this.f24222c, c7298a.f24222c) && AbstractC1061t.m3842c(this.f24223d, c7298a.f24223d) && AbstractC1061t.m3842c(this.f24224e, c7298a.f24224e) && AbstractC1061t.m3842c(this.f24225f, c7298a.f24225f) && AbstractC1061t.m3842c(this.f24226g, c7298a.f24226g);
    }

    /* JADX INFO: renamed from: f */
    public final String m28931f() {
        return this.f24224e;
    }

    /* JADX INFO: renamed from: g */
    public final String m28932g() {
        return this.f24222c;
    }

    public int hashCode() {
        return (((((((((((this.f24220a.hashCode() * 31) + this.f24221b.hashCode()) * 31) + this.f24222c.hashCode()) * 31) + this.f24223d.hashCode()) * 31) + this.f24224e.hashCode()) * 31) + this.f24225f.hashCode()) * 31) + this.f24226g.hashCode();
    }

    public String toString() {
        return "AiProfile(id=" + this.f24220a + ", name=" + this.f24221b + ", provider=" + this.f24222c + ", baseUrl=" + this.f24223d + ", path=" + this.f24224e + ", apiKey=" + this.f24225f + ", model=" + this.f24226g + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C7298a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, AbstractC1043k abstractC1043k) {
        if ((i10 & 1) != 0) {
            str = UUID.randomUUID().toString();
            str.getClass();
        }
        this(str, str2, (i10 & 4) != 0 ? "自定义" : str3, str4, str5, str6, str7);
    }
}
