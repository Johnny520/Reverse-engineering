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
    public static final Companion Companion = new Companion(null);
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

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public UpdateInfo() {
        this(false, (String) null, 0, (String) null, (String) null, false, 63, (AbstractC0621Oc) null);
    }

    public static /* synthetic */ UpdateInfo copy$default(UpdateInfo updateInfo, boolean z, String str, int i, String str2, String str3, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = updateInfo.hasUpdate;
        }
        if ((i2 & 2) != 0) {
            str = updateInfo.versionName;
        }
        if ((i2 & 4) != 0) {
            i = updateInfo.versionCode;
        }
        if ((i2 & 8) != 0) {
            str2 = updateInfo.releaseNotes;
        }
        if ((i2 & 16) != 0) {
            str3 = updateInfo.downloadUrl;
        }
        if ((i2 & 32) != 0) {
            z2 = updateInfo.forceUpdate;
        }
        String str4 = str3;
        boolean z3 = z2;
        return updateInfo.copy(z, str, i, str2, str4, z3);
    }

    public static final /* synthetic */ void write$Self$app_release(UpdateInfo updateInfo, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || updateInfo.hasUpdate) {
            boolean z = updateInfo.hasUpdate;
            interfaceC0962Wa.m1840b();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(updateInfo.versionName, "")) {
            String str = updateInfo.versionName;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || updateInfo.versionCode != 0) {
            int i = updateInfo.versionCode;
            interfaceC0962Wa.m1843e();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(updateInfo.releaseNotes, "")) {
            String str2 = updateInfo.releaseNotes;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(updateInfo.downloadUrl, "")) {
            String str3 = updateInfo.downloadUrl;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || updateInfo.forceUpdate) {
            boolean z2 = updateInfo.forceUpdate;
            interfaceC0962Wa.m1840b();
        }
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

    public final UpdateInfo copy(boolean z, String str, int i, String str2, String str3, boolean z2) {
        return new UpdateInfo(z, str, i, str2, str3, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateInfo)) {
            return false;
        }
        UpdateInfo updateInfo = (UpdateInfo) obj;
        return this.hasUpdate == updateInfo.hasUpdate && AbstractC0585Nj.m1134a(this.versionName, updateInfo.versionName) && this.versionCode == updateInfo.versionCode && AbstractC0585Nj.m1134a(this.releaseNotes, updateInfo.releaseNotes) && AbstractC0585Nj.m1134a(this.downloadUrl, updateInfo.downloadUrl) && this.forceUpdate == updateInfo.forceUpdate;
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
        return Boolean.hashCode(this.forceUpdate) + AbstractC2374ph.m4810g(this.downloadUrl, AbstractC2374ph.m4810g(this.releaseNotes, AbstractC0213Ey.m403a(this.versionCode, AbstractC2374ph.m4810g(this.versionName, Boolean.hashCode(this.hasUpdate) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        return "UpdateInfo(hasUpdate=" + this.hasUpdate + ", versionName=" + this.versionName + ", versionCode=" + this.versionCode + ", releaseNotes=" + this.releaseNotes + ", downloadUrl=" + this.downloadUrl + ", forceUpdate=" + this.forceUpdate + ')';
    }

    public /* synthetic */ UpdateInfo(int i, boolean z, String str, int i2, String str2, String str3, boolean z2, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.hasUpdate = false;
        } else {
            this.hasUpdate = z;
        }
        if ((i & 2) == 0) {
            this.versionName = "";
        } else {
            this.versionName = str;
        }
        if ((i & 4) == 0) {
            this.versionCode = 0;
        } else {
            this.versionCode = i2;
        }
        if ((i & 8) == 0) {
            this.releaseNotes = "";
        } else {
            this.releaseNotes = str2;
        }
        if ((i & 16) == 0) {
            this.downloadUrl = "";
        } else {
            this.downloadUrl = str3;
        }
        if ((i & 32) == 0) {
            this.forceUpdate = false;
        } else {
            this.forceUpdate = z2;
        }
    }

    public UpdateInfo(boolean z, String str, int i, String str2, String str3, boolean z2) {
        this.hasUpdate = z;
        this.versionName = str;
        this.versionCode = i;
        this.releaseNotes = str2;
        this.downloadUrl = str3;
        this.forceUpdate = z2;
    }

    public /* synthetic */ UpdateInfo(boolean z, String str, int i, String str2, String str3, boolean z2, int i2, AbstractC0621Oc abstractC0621Oc) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? false : z2);
    }
}
