package sd;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: sd.va */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7707va {

    /* JADX INFO: renamed from: a */
    public final String f25738a;

    /* JADX INFO: renamed from: b */
    public final String f25739b;

    /* JADX INFO: renamed from: c */
    public final String f25740c;

    /* JADX INFO: renamed from: d */
    public final String f25741d;

    public C7707va(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f25738a = str;
        this.f25739b = str2;
        this.f25740c = str3;
        this.f25741d = str4;
    }

    /* JADX INFO: renamed from: a */
    public final String m29963a() {
        return this.f25741d;
    }

    /* JADX INFO: renamed from: b */
    public final String m29964b() {
        return this.f25738a;
    }

    /* JADX INFO: renamed from: c */
    public final String m29965c() {
        return this.f25739b;
    }

    /* JADX INFO: renamed from: d */
    public final String m29966d() {
        return this.f25740c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7707va)) {
            return false;
        }
        C7707va c7707va = (C7707va) obj;
        return AbstractC1061t.m3842c(this.f25738a, c7707va.f25738a) && AbstractC1061t.m3842c(this.f25739b, c7707va.f25739b) && AbstractC1061t.m3842c(this.f25740c, c7707va.f25740c) && AbstractC1061t.m3842c(this.f25741d, c7707va.f25741d);
    }

    public int hashCode() {
        return (((((this.f25738a.hashCode() * 31) + this.f25739b.hashCode()) * 31) + this.f25740c.hashCode()) * 31) + this.f25741d.hashCode();
    }

    public String toString() {
        return "CustomSkill(id=" + this.f25738a + ", name=" + this.f25739b + ", prompt=" + this.f25740c + ", desc=" + this.f25741d + ")";
    }
}
