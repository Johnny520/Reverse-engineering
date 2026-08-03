package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class ThemeSimpleVersion {
    public static final Companion Companion = new Companion(null);
    private final String downloadUrl;
    private final String versionName;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ThemeSimpleVersion$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThemeSimpleVersion() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (AbstractC0621Oc) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ ThemeSimpleVersion copy$default(ThemeSimpleVersion themeSimpleVersion, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = themeSimpleVersion.versionName;
        }
        if ((i & 2) != 0) {
            str2 = themeSimpleVersion.downloadUrl;
        }
        return themeSimpleVersion.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$app_release(ThemeSimpleVersion themeSimpleVersion, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeSimpleVersion.versionName, "")) {
            String str = themeSimpleVersion.versionName;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(themeSimpleVersion.downloadUrl, "")) {
            return;
        }
        String str2 = themeSimpleVersion.downloadUrl;
        interfaceC0962Wa.m1842d();
    }

    public final String component1() {
        return this.versionName;
    }

    public final String component2() {
        return this.downloadUrl;
    }

    public final ThemeSimpleVersion copy(String str, String str2) {
        return new ThemeSimpleVersion(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeSimpleVersion)) {
            return false;
        }
        ThemeSimpleVersion themeSimpleVersion = (ThemeSimpleVersion) obj;
        return AbstractC0585Nj.m1134a(this.versionName, themeSimpleVersion.versionName) && AbstractC0585Nj.m1134a(this.downloadUrl, themeSimpleVersion.downloadUrl);
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return this.downloadUrl.hashCode() + (this.versionName.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ThemeSimpleVersion(versionName=");
        sb.append(this.versionName);
        sb.append(", downloadUrl=");
        return AbstractC2374ph.m4815l(sb, this.downloadUrl, ')');
    }

    public /* synthetic */ ThemeSimpleVersion(int i, String str, String str2, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.versionName = "";
        } else {
            this.versionName = str;
        }
        if ((i & 2) == 0) {
            this.downloadUrl = "";
        } else {
            this.downloadUrl = str2;
        }
    }

    public ThemeSimpleVersion(String str, String str2) {
        this.versionName = str;
        this.downloadUrl = str2;
    }

    public /* synthetic */ ThemeSimpleVersion(String str, String str2, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
