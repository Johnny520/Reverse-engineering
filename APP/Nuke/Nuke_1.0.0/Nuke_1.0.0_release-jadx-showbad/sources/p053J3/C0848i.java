package p053J3;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: J3.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0848i {
    public static final int $stable = 0;
    private final String platform;
    private final String userId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0848i(String str, String str2) {
        AbstractC1665j.m2985e(str, "userId");
        AbstractC1665j.m2985e(str2, "platform");
        this.userId = str;
        this.platform = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C0848i m1701d(C0848i c0848i, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0848i.userId;
        }
        if ((i5 & 2) != 0) {
            str2 = c0848i.platform;
        }
        return c0848i.m1704c(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m1702a() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m1703b() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0848i m1704c(String str, String str2) {
        AbstractC1665j.m2985e(str, "userId");
        AbstractC1665j.m2985e(str2, "platform");
        return new C0848i(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m1705e() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0848i)) {
            return false;
        }
        C0848i c0848i = (C0848i) obj;
        return AbstractC1665j.m2981a(this.userId, c0848i.userId) && AbstractC1665j.m2981a(this.platform, c0848i.platform);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m1706f() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.platform.hashCode() + (this.userId.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "ClientIdentityRequest(userId=" + this.userId + ", platform=" + this.platform + ")";
    }
}
