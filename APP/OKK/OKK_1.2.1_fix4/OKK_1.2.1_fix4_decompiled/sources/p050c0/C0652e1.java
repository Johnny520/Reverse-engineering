package p050c0;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0652e1 {

    /* JADX INFO: renamed from: a */
    public final int f2024a;

    /* JADX INFO: renamed from: b */
    public final String f2025b;

    /* JADX INFO: renamed from: c */
    public final String f2026c;

    /* JADX INFO: renamed from: d */
    public final long f2027d;

    /* JADX INFO: renamed from: e */
    public final String f2028e;

    /* JADX INFO: renamed from: f */
    public final long f2029f;

    public C0652e1(int i2, String str, String str2, long j2, String str3, long j3) {
        this.f2024a = i2;
        this.f2025b = str;
        this.f2026c = str2;
        this.f2027d = j2;
        this.f2028e = str3;
        this.f2029f = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0652e1)) {
            return false;
        }
        C0652e1 c0652e1 = (C0652e1) obj;
        return this.f2024a == c0652e1.f2024a && AbstractC0307g.m699a(this.f2025b, c0652e1.f2025b) && AbstractC0307g.m699a(this.f2026c, c0652e1.f2026c) && this.f2027d == c0652e1.f2027d && AbstractC0307g.m699a(this.f2028e, c0652e1.f2028e) && this.f2029f == c0652e1.f2029f;
    }

    public final int hashCode() {
        int iHashCode = (this.f2025b.hashCode() + (Integer.hashCode(this.f2024a) * 31)) * 31;
        String str = this.f2026c;
        int iHashCode2 = (Long.hashCode(this.f2027d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f2028e;
        return Long.hashCode(this.f2029f) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OriginalMessage(type=" + this.f2024a + ", content=" + this.f2025b + ", talker=" + this.f2026c + ", createTime=" + this.f2027d + ", sender=" + this.f2028e + ", msgSvrId=" + this.f2029f + ")";
    }
}
