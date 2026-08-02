package p000;

/* JADX INFO: renamed from: mt */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0473mt {
    public static final int $stable = 0;
    private final int currentVersionCode;
    private final String downloadUrl;
    private final boolean forceUpdate;
    private final boolean hasUpdate;
    private final int latestVersionCode;
    private final String latestVersionName;

    @fp2("server_time")
    private final long serverTime;
    private final String updateContent;

    public C0473mt(boolean z, int i, int i2, String str, boolean z2, String str2, String str3, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.hasUpdate = z;
        this.currentVersionCode = i;
        this.latestVersionCode = i2;
        this.latestVersionName = str;
        this.forceUpdate = z2;
        this.downloadUrl = str2;
        this.updateContent = str3;
        this.serverTime = j;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ C0473mt m3191j(C0473mt c0473mt, boolean z, int i, int i2, String str, boolean z2, String str2, String str3, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = c0473mt.hasUpdate;
        }
        if ((i3 & 2) != 0) {
            i = c0473mt.currentVersionCode;
        }
        if ((i3 & 4) != 0) {
            i2 = c0473mt.latestVersionCode;
        }
        if ((i3 & 8) != 0) {
            str = c0473mt.latestVersionName;
        }
        if ((i3 & 16) != 0) {
            z2 = c0473mt.forceUpdate;
        }
        if ((i3 & 32) != 0) {
            str2 = c0473mt.downloadUrl;
        }
        if ((i3 & 64) != 0) {
            str3 = c0473mt.updateContent;
        }
        if ((i3 & 128) != 0) {
            j = c0473mt.serverTime;
        }
        long j2 = j;
        String str4 = str2;
        String str5 = str3;
        boolean z3 = z2;
        int i4 = i2;
        return c0473mt.m3200i(z, i, i4, str, z3, str4, str5, j2);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3192a() {
        return this.hasUpdate;
    }

    /* JADX INFO: renamed from: b */
    public final int m3193b() {
        return this.currentVersionCode;
    }

    /* JADX INFO: renamed from: c */
    public final int m3194c() {
        return this.latestVersionCode;
    }

    /* JADX INFO: renamed from: d */
    public final String m3195d() {
        return this.latestVersionName;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3196e() {
        return this.forceUpdate;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0473mt)) {
            return false;
        }
        C0473mt c0473mt = (C0473mt) obj;
        return this.hasUpdate == c0473mt.hasUpdate && this.currentVersionCode == c0473mt.currentVersionCode && this.latestVersionCode == c0473mt.latestVersionCode && t11.m5086l(this.latestVersionName, c0473mt.latestVersionName) && this.forceUpdate == c0473mt.forceUpdate && t11.m5086l(this.downloadUrl, c0473mt.downloadUrl) && t11.m5086l(this.updateContent, c0473mt.updateContent) && this.serverTime == c0473mt.serverTime;
    }

    /* JADX INFO: renamed from: f */
    public final String m3197f() {
        return this.downloadUrl;
    }

    /* JADX INFO: renamed from: g */
    public final String m3198g() {
        return this.updateContent;
    }

    /* JADX INFO: renamed from: h */
    public final long m3199h() {
        return this.serverTime;
    }

    public int hashCode() {
        return Long.hashCode(this.serverTime) + hk1.m2207f(this.updateContent, hk1.m2207f(this.downloadUrl, hk1.m2205d(hk1.m2207f(this.latestVersionName, vi0.m5685d(this.latestVersionCode, vi0.m5685d(this.currentVersionCode, Boolean.hashCode(this.hasUpdate) * 31, 31), 31), 31), 31, this.forceUpdate), 31), 31);
    }

    /* JADX INFO: renamed from: i */
    public final C0473mt m3200i(boolean z, int i, int i2, String str, boolean z2, String str2, String str3, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new C0473mt(z, i, i2, str, z2, str2, str3, j);
    }

    /* JADX INFO: renamed from: k */
    public final int m3201k() {
        return this.currentVersionCode;
    }

    /* JADX INFO: renamed from: l */
    public final String m3202l() {
        return this.downloadUrl;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m3203m() {
        return this.forceUpdate;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m3204n() {
        return this.hasUpdate;
    }

    /* JADX INFO: renamed from: o */
    public final int m3205o() {
        return this.latestVersionCode;
    }

    /* JADX INFO: renamed from: p */
    public final String m3206p() {
        return this.latestVersionName;
    }

    /* JADX INFO: renamed from: q */
    public final long m3207q() {
        return this.serverTime;
    }

    /* JADX INFO: renamed from: r */
    public final String m3208r() {
        return this.updateContent;
    }

    public String toString() {
        return "ClientAppUpdateResponse(hasUpdate=" + this.hasUpdate + ", currentVersionCode=" + this.currentVersionCode + ", latestVersionCode=" + this.latestVersionCode + ", latestVersionName=" + this.latestVersionName + ", forceUpdate=" + this.forceUpdate + ", downloadUrl=" + this.downloadUrl + ", updateContent=" + this.updateContent + ", serverTime=" + this.serverTime + ")";
    }
}
