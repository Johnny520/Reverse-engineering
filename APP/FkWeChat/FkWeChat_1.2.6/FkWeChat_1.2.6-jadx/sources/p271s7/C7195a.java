package p271s7;

import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: s7.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7195a {

    /* JADX INFO: renamed from: a */
    public final String f23871a;

    /* JADX INFO: renamed from: b */
    public final String f23872b;

    /* JADX INFO: renamed from: c */
    public final String f23873c;

    /* JADX INFO: renamed from: d */
    public final Long f23874d;

    /* JADX INFO: renamed from: e */
    public final String f23875e;

    public C7195a(String str, String str2, String str3, Long l10, String str4) {
        this.f23871a = str;
        this.f23872b = str2;
        this.f23873c = str3;
        this.f23874d = l10;
        this.f23875e = str4;
    }

    /* JADX INFO: renamed from: a */
    public String m28429a() {
        return this.f23875e;
    }

    /* JADX INFO: renamed from: b */
    public String m28430b() {
        return this.f23871a;
    }

    /* JADX INFO: renamed from: c */
    public String m28431c() {
        return this.f23872b;
    }

    /* JADX INFO: renamed from: d */
    public String m28432d() {
        return this.f23873c;
    }

    /* JADX INFO: renamed from: e */
    public Long m28433e() {
        return this.f23874d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7195a)) {
            return false;
        }
        C7195a c7195a = (C7195a) obj;
        return AbstractC1061t.m3842c(this.f23871a, c7195a.f23871a) && AbstractC1061t.m3842c(this.f23872b, c7195a.f23872b) && AbstractC1061t.m3842c(this.f23873c, c7195a.f23873c) && AbstractC1061t.m3842c(this.f23874d, c7195a.f23874d) && AbstractC1061t.m3842c(this.f23875e, c7195a.f23875e);
    }

    public int hashCode() {
        String str = this.f23871a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f23872b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f23873c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.f23874d;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str4 = this.f23875e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return AbstractC7196b.m28436c(m28430b(), m28431c(), m28432d(), m28433e(), m28429a());
    }
}
