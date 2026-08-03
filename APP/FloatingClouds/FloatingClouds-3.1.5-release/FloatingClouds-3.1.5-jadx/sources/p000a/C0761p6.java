package p000a;

/* JADX INFO: renamed from: a.p6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0761p6 {

    /* JADX INFO: renamed from: a */
    public final String f2991a;

    /* JADX INFO: renamed from: b */
    public final EnumC0780q6 f2992b;

    /* JADX INFO: renamed from: c */
    public final long f2993c;

    /* JADX INFO: renamed from: d */
    public final long f2994d;

    /* JADX INFO: renamed from: e */
    public final int f2995e;

    /* JADX INFO: renamed from: f */
    public final int f2996f;

    /* JADX INFO: renamed from: g */
    public final String f2997g;

    /* JADX INFO: renamed from: h */
    public final String f2998h;

    /* JADX INFO: renamed from: i */
    public final long f2999i;

    public C0761p6(String str, EnumC0780q6 enumC0780q6, long j, long j2, int i, int i2, String str2, String str3, long j3) {
        C0631i9.m1482e(enumC0780q6, "state");
        this.f2991a = str;
        this.f2992b = enumC0780q6;
        this.f2993c = j;
        this.f2994d = j2;
        this.f2995e = i;
        this.f2996f = i2;
        this.f2997g = str2;
        this.f2998h = str3;
        this.f2999i = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0761p6)) {
            return false;
        }
        C0761p6 c0761p6 = (C0761p6) obj;
        return C0631i9.m1478a(this.f2991a, c0761p6.f2991a) && this.f2992b == c0761p6.f2992b && this.f2993c == c0761p6.f2993c && this.f2994d == c0761p6.f2994d && this.f2995e == c0761p6.f2995e && this.f2996f == c0761p6.f2996f && C0631i9.m1478a(this.f2997g, c0761p6.f2997g) && C0631i9.m1478a(this.f2998h, c0761p6.f2998h) && this.f2999i == c0761p6.f2999i;
    }

    public final int hashCode() {
        int iHashCode = (Integer.hashCode(this.f2996f) + ((Integer.hashCode(this.f2995e) + ((Long.hashCode(this.f2994d) + ((Long.hashCode(this.f2993c) + ((this.f2992b.hashCode() + (this.f2991a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f2997g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2998h;
        return Long.hashCode(this.f2999i) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FeatureGuardStatus(featureId=" + this.f2991a + ", state=" + this.f2992b + ", totalInvocations=" + this.f2993c + ", totalErrors=" + this.f2994d + ", consecutiveFailures=" + this.f2995e + ", sessionFailureCount=" + this.f2996f + ", lastErrorType=" + this.f2997g + ", lastErrorMessage=" + this.f2998h + ", lastErrorAt=" + this.f2999i + ")";
    }
}
