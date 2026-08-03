package p000a;

/* JADX INFO: renamed from: a.j6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0647j6 {

    /* JADX INFO: renamed from: a */
    public final String f2388a;

    /* JADX INFO: renamed from: b */
    public final String f2389b;

    /* JADX INFO: renamed from: c */
    public final String f2390c;

    /* JADX INFO: renamed from: d */
    public final String f2391d;

    /* JADX INFO: renamed from: e */
    public final long f2392e;

    public C0647j6(String str, String str2, String str3, String str4, long j) {
        C0631i9.m1482e(str2, "matcherInfo");
        C0631i9.m1482e(str3, "reason");
        this.f2388a = str;
        this.f2389b = str2;
        this.f2390c = str3;
        this.f2391d = str4;
        this.f2392e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0647j6)) {
            return false;
        }
        C0647j6 c0647j6 = (C0647j6) obj;
        return C0631i9.m1478a(this.f2388a, c0647j6.f2388a) && C0631i9.m1478a(this.f2389b, c0647j6.f2389b) && C0631i9.m1478a(this.f2390c, c0647j6.f2390c) && C0631i9.m1478a(this.f2391d, c0647j6.f2391d) && this.f2392e == c0647j6.f2392e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2392e) + C0944z.m2222b(this.f2391d, C0944z.m2222b(this.f2390c, C0944z.m2222b(this.f2389b, this.f2388a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "FailureReason(type=" + this.f2388a + ", matcherInfo=" + this.f2389b + ", reason=" + this.f2390c + ", stackTrace=" + this.f2391d + ", timestamp=" + this.f2392e + ")";
    }
}
