package io.github.cherrywechat.network.model;

import p000.AbstractC0213Ey;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateInfo {
    public static final Companion Companion = null;
    private final String downloadUrl;
    private final boolean forceUpdate;
    private final boolean hasUpdate;
    private final String releaseNotes;
    private final int versionCode;
    private final String versionName;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return UpdateInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public UpdateInfo() {
        boolean r1 = false;
        String r2 = null;
        int r3 = 0;
        String r4 = null;
        String r5 = null;
        boolean r6 = false;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ UpdateInfo copy$default(UpdateInfo r0, boolean r1, String r2, int r3, String r4, String r5, boolean r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.hasUpdate;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.versionName;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.versionCode;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.releaseNotes;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.downloadUrl;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.forceUpdate;
    L20:
        String r72 = r5;
        boolean r82 = r6;
        int r52 = r3;
        String r62 = r4;
        return r0.copy(r1, r2, r52, r62, r72, r82);
    }

    public static final /* synthetic */ void write$Self$app_release(UpdateInfo r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        boolean r32 = r1.hasUpdate;
        r2.m1840b();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        String r33 = r1.versionName;
        r2.m1842d();
    L15:
        if (r2.m1845g() == false) goto L18;
    L19:
        int r34 = r1.versionCode;
        r2.m1843e();
    L21:
        if (r2.m1845g() == false) goto L24;
    L25:
        String r35 = r1.releaseNotes;
        r2.m1842d();
    L27:
        if (r2.m1845g() == false) goto L30;
    L31:
        String r36 = r1.downloadUrl;
        r2.m1842d();
    L33:
        if (r2.m1845g() == false) goto L36;
    L37:
        boolean r12 = r1.forceUpdate;
        r2.m1840b();
        return;
    L36:
        if (r1.forceUpdate == true) goto L37;
        return;
    L30:
        if (AbstractC0585Nj.m1134a(r1.downloadUrl, "") == true) goto L33;
    L24:
        if (AbstractC0585Nj.m1134a(r1.releaseNotes, "") == true) goto L27;
    L18:
        if (r1.versionCode == 0) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r1.versionName, "") == true) goto L15;
    L6:
        if (r1.hasUpdate == false) goto L9;
        goto L7
    }

    public final boolean component1() {
        return this.hasUpdate;
    }

    public final String component2() {
        return this.versionName;
    }

    public final int component3() {
        return this.versionCode;
    }

    public final String component4() {
        return this.releaseNotes;
    }

    public final String component5() {
        return this.downloadUrl;
    }

    public final boolean component6() {
        return this.forceUpdate;
    }

    public final UpdateInfo copy(boolean r8, String r9, int r10, String r11, String r12, boolean r13) {
        return new UpdateInfo(r8, r9, r10, r11, r12, r13);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UpdateInfo) == true) goto L8;
        return false;
    L8:
        UpdateInfo r52 = (UpdateInfo) r5;
        if (this.hasUpdate == r52.hasUpdate) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.versionName, r52.versionName) == true) goto L15;
        return false;
    L15:
        if (this.versionCode == r52.versionCode) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.releaseNotes, r52.releaseNotes) == true) goto L21;
        return false;
    L21:
        if (AbstractC0585Nj.m1134a(this.downloadUrl, r52.downloadUrl) == true) goto L24;
        return false;
    L24:
        if (this.forceUpdate == r52.forceUpdate) goto L26;
        return false;
    L26:
        return true;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final boolean getForceUpdate() {
        return this.forceUpdate;
    }

    public final boolean getHasUpdate() {
        return this.hasUpdate;
    }

    public final String getReleaseNotes() {
        return this.releaseNotes;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        int r0 = Boolean.hashCode(this.hasUpdate) * 31;
        int r02 = AbstractC2374ph.m4810g(this.versionName, r0, 31);
        int r03 = AbstractC0213Ey.m403a(this.versionCode, r02, 31);
        int r04 = AbstractC2374ph.m4810g(this.releaseNotes, r03, 31);
        int r05 = AbstractC2374ph.m4810g(this.downloadUrl, r04, 31);
        return Boolean.hashCode(this.forceUpdate) + r05;
    }

    public String toString() {
        return "UpdateInfo(hasUpdate=" + this.hasUpdate + ", versionName=" + this.versionName + ", versionCode=" + this.versionCode + ", releaseNotes=" + this.releaseNotes + ", downloadUrl=" + this.downloadUrl + ", forceUpdate=" + this.forceUpdate + ')';
    }

    public /* synthetic */ UpdateInfo(int r2, boolean r3, String r4, int r5, String r6, String r7, boolean r8, AbstractC0298Gx r9) {
        if ((r2 & 1) != 0) goto L5;
        this.hasUpdate = false;
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.versionName = "";
    L11:
        if ((r2 & 4) != 0) goto L13;
        this.versionCode = 0;
    L15:
        if ((r2 & 8) != 0) goto L17;
        this.releaseNotes = "";
    L19:
        if ((r2 & 16) != 0) goto L21;
        this.downloadUrl = "";
    L23:
        if ((r2 & 32) != 0) goto L26;
        this.forceUpdate = false;
        return;
    L26:
        this.forceUpdate = r8;
        return;
    L21:
        this.downloadUrl = r7;
        goto L23
    L17:
        this.releaseNotes = r6;
        goto L19
    L13:
        this.versionCode = r5;
        goto L15
    L9:
        this.versionName = r4;
        goto L11
    L5:
        this.hasUpdate = r3;
        goto L7
    }

    public UpdateInfo(boolean r1, String r2, int r3, String r4, String r5, boolean r6) {
        this.hasUpdate = r1;
        this.versionName = r2;
        this.versionCode = r3;
        this.releaseNotes = r4;
        this.downloadUrl = r5;
        this.forceUpdate = r6;
    }

    public /* synthetic */ UpdateInfo(boolean r3, String r4, int r5, String r6, String r7, boolean r8, int r9, AbstractC0621Oc r10) {
        if ((r9 & 1) == 0) goto L6;
        r3 = false;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r9 & 4) == 0) goto L12;
        r5 = 0;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r9 & 16) == 0) goto L18;
        r7 = "";
    L18:
        if ((r9 & 32) == 0) goto L21;
        boolean r92 = false;
    L20:
        String r82 = r7;
        String r72 = r6;
        int r62 = r5;
        this(r3, r4, r62, r72, r82, r92);
        return;
    L21:
        r92 = r8;
        goto L20
    }
}
