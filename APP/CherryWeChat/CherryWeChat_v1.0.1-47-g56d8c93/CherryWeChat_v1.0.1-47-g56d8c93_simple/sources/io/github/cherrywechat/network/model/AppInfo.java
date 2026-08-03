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
    public static final Companion Companion = null;
    private final String appName;
    private final String appSubtitle;
    private final String logoUrl;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return AppInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public AppInfo() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ AppInfo copy$default(AppInfo r0, String r1, String r2, String r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.appName;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.appSubtitle;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.logoUrl;
    L12:
        return r0.copy(r1, r2, r3);
    }

    public static final /* synthetic */ void write$Self$app_release(AppInfo r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        String r32 = r1.appName;
        r2.m1842d();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        String r33 = r1.appSubtitle;
        r2.m1842d();
    L15:
        if (r2.m1845g() == false) goto L18;
    L19:
        String r12 = r1.logoUrl;
        r2.m1842d();
        return;
    L18:
        if (AbstractC0585Nj.m1134a(r1.logoUrl, "") == false) goto L19;
        return;
    L12:
        if (AbstractC0585Nj.m1134a(r1.appSubtitle, "") == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r1.appName, "") == true) goto L9;
        goto L7
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

    public final AppInfo copy(String r2, String r3, String r4) {
        return new AppInfo(r2, r3, r4);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AppInfo) == true) goto L8;
        return false;
    L8:
        AppInfo r52 = (AppInfo) r5;
        if (AbstractC0585Nj.m1134a(this.appName, r52.appName) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.appSubtitle, r52.appSubtitle) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.logoUrl, r52.logoUrl) == true) goto L17;
        return false;
    L17:
        return true;
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
        int r0 = this.appName.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.appSubtitle, r0, 31);
        return this.logoUrl.hashCode() + r02;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("AppInfo(appName=");
        r0.append(this.appName);
        r0.append(", appSubtitle=");
        r0.append(this.appSubtitle);
        r0.append(", logoUrl=");
        return AbstractC2374ph.m4815l(r0, this.logoUrl, ')');
    }

    public /* synthetic */ AppInfo(int r2, String r3, String r4, String r5, AbstractC0298Gx r6) {
        if ((r2 & 1) != 0) goto L5;
        this.appName = "";
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.appSubtitle = "";
    L11:
        if ((r2 & 4) != 0) goto L14;
        this.logoUrl = "";
        return;
    L14:
        this.logoUrl = r5;
        return;
    L9:
        this.appSubtitle = r4;
        goto L11
    L5:
        this.appName = r3;
        goto L7
    }

    public AppInfo(String r1, String r2, String r3) {
        this.appName = r1;
        this.appSubtitle = r2;
        this.logoUrl = r3;
    }

    public /* synthetic */ AppInfo(String r2, String r3, String r4, int r5, AbstractC0621Oc r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
