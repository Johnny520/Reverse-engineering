package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mt {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mt(boolean z, int i, int i2, String str, boolean z2, String str2, String str3, long j) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ mt j(mt mtVar, boolean z, int i, int i2, String str, boolean z2, String str2, String str3, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = mtVar.hasUpdate;
        }
        if ((i3 & 2) != 0) {
            i = mtVar.currentVersionCode;
        }
        if ((i3 & 4) != 0) {
            i2 = mtVar.latestVersionCode;
        }
        if ((i3 & 8) != 0) {
            str = mtVar.latestVersionName;
        }
        if ((i3 & 16) != 0) {
            z2 = mtVar.forceUpdate;
        }
        if ((i3 & 32) != 0) {
            str2 = mtVar.downloadUrl;
        }
        if ((i3 & 64) != 0) {
            str3 = mtVar.updateContent;
        }
        if ((i3 & 128) != 0) {
            j = mtVar.serverTime;
        }
        long j2 = j;
        String str4 = str2;
        String str5 = str3;
        boolean z3 = z2;
        int i4 = i2;
        return mtVar.i(z, i, i4, str, z3, str4, str5, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a() {
        return this.hasUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        return this.currentVersionCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c() {
        return this.latestVersionCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String d() {
        return this.latestVersionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e() {
        return this.forceUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt)) {
            return false;
        }
        mt mtVar = (mt) obj;
        return this.hasUpdate == mtVar.hasUpdate && this.currentVersionCode == mtVar.currentVersionCode && this.latestVersionCode == mtVar.latestVersionCode && t11.l(this.latestVersionName, mtVar.latestVersionName) && this.forceUpdate == mtVar.forceUpdate && t11.l(this.downloadUrl, mtVar.downloadUrl) && t11.l(this.updateContent, mtVar.updateContent) && this.serverTime == mtVar.serverTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String f() {
        return this.downloadUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String g() {
        return this.updateContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long h() {
        return this.serverTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return Long.hashCode(this.serverTime) + hk1.f(this.updateContent, hk1.f(this.downloadUrl, hk1.d(hk1.f(this.latestVersionName, vi0.d(this.latestVersionCode, vi0.d(this.currentVersionCode, Boolean.hashCode(this.hasUpdate) * 31, 31), 31), 31), 31, this.forceUpdate), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final mt i(boolean z, int i, int i2, String str, boolean z2, String str2, String str3, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new mt(z, i, i2, str, z2, str2, str3, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int k() {
        return this.currentVersionCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String l() {
        return this.downloadUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean m() {
        return this.forceUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean n() {
        return this.hasUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int o() {
        return this.latestVersionCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String p() {
        return this.latestVersionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long q() {
        return this.serverTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String r() {
        return this.updateContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "ClientAppUpdateResponse(hasUpdate=" + this.hasUpdate + ", currentVersionCode=" + this.currentVersionCode + ", latestVersionCode=" + this.latestVersionCode + ", latestVersionName=" + this.latestVersionName + ", forceUpdate=" + this.forceUpdate + ", downloadUrl=" + this.downloadUrl + ", updateContent=" + this.updateContent + ", serverTime=" + this.serverTime + ")";
    }
}
