package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class AppInfo {
    public static final Companion Companion = new Companion(null);
    private final String appName;
    private final String appSubtitle;
    private final String logoUrl;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return AppInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public AppInfo() {
        this((String) null, (String) null, (String) null, 7, (AbstractC0621Oc) null);
    }

    public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appInfo.appName;
        }
        if ((i & 2) != 0) {
            str2 = appInfo.appSubtitle;
        }
        if ((i & 4) != 0) {
            str3 = appInfo.logoUrl;
        }
        return appInfo.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app_release(AppInfo appInfo, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(appInfo.appName, "")) {
            String str = appInfo.appName;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(appInfo.appSubtitle, "")) {
            String str2 = appInfo.appSubtitle;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(appInfo.logoUrl, "")) {
            return;
        }
        String str3 = appInfo.logoUrl;
        interfaceC0962Wa.m1842d();
    }

    public final String component1() {
        return this.appName;
    }

    public final String component2() {
        return this.appSubtitle;
    }

    public final String component3() {
        return this.logoUrl;
    }

    public final AppInfo copy(String str, String str2, String str3) {
        return new AppInfo(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) obj;
        return AbstractC0585Nj.m1134a(this.appName, appInfo.appName) && AbstractC0585Nj.m1134a(this.appSubtitle, appInfo.appSubtitle) && AbstractC0585Nj.m1134a(this.logoUrl, appInfo.logoUrl);
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppSubtitle() {
        return this.appSubtitle;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public int hashCode() {
        return this.logoUrl.hashCode() + AbstractC2374ph.m4810g(this.appSubtitle, this.appName.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppInfo(appName=");
        sb.append(this.appName);
        sb.append(", appSubtitle=");
        sb.append(this.appSubtitle);
        sb.append(", logoUrl=");
        return AbstractC2374ph.m4815l(sb, this.logoUrl, ')');
    }

    public /* synthetic */ AppInfo(int i, String str, String str2, String str3, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.appName = "";
        } else {
            this.appName = str;
        }
        if ((i & 2) == 0) {
            this.appSubtitle = "";
        } else {
            this.appSubtitle = str2;
        }
        if ((i & 4) == 0) {
            this.logoUrl = "";
        } else {
            this.logoUrl = str3;
        }
    }

    public AppInfo(String str, String str2, String str3) {
        this.appName = str;
        this.appSubtitle = str2;
        this.logoUrl = str3;
    }

    public /* synthetic */ AppInfo(String str, String str2, String str3, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
