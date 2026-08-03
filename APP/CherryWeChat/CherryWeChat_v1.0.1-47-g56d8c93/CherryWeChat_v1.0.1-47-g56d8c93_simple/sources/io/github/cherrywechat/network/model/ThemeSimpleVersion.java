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
    public static final Companion Companion = null;
    private final String downloadUrl;
    private final String versionName;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ThemeSimpleVersion$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThemeSimpleVersion() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ThemeSimpleVersion copy$default(ThemeSimpleVersion r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.versionName;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.downloadUrl;
    L9:
        return r0.copy(r1, r2);
    }

    public static final /* synthetic */ void write$Self$app_release(ThemeSimpleVersion r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        String r32 = r1.versionName;
        r2.m1842d();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        String r12 = r1.downloadUrl;
        r2.m1842d();
        return;
    L12:
        if (AbstractC0585Nj.m1134a(r1.downloadUrl, "") == false) goto L13;
        return;
    L6:
        if (AbstractC0585Nj.m1134a(r1.versionName, "") == true) goto L9;
        goto L7
    }

    public final String component1() {
        return this.versionName;
    }

    public final String component2() {
        return this.downloadUrl;
    }

    public final ThemeSimpleVersion copy(String r2, String r3) {
        return new ThemeSimpleVersion(r2, r3);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ThemeSimpleVersion) == true) goto L8;
        return false;
    L8:
        ThemeSimpleVersion r52 = (ThemeSimpleVersion) r5;
        if (AbstractC0585Nj.m1134a(this.versionName, r52.versionName) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.downloadUrl, r52.downloadUrl) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        int r0 = this.versionName.hashCode() * 31;
        return this.downloadUrl.hashCode() + r0;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("ThemeSimpleVersion(versionName=");
        r0.append(this.versionName);
        r0.append(", downloadUrl=");
        return AbstractC2374ph.m4815l(r0, this.downloadUrl, ')');
    }

    public /* synthetic */ ThemeSimpleVersion(int r2, String r3, String r4, AbstractC0298Gx r5) {
        if ((r2 & 1) != 0) goto L5;
        this.versionName = "";
    L7:
        if ((r2 & 2) != 0) goto L10;
        this.downloadUrl = "";
        return;
    L10:
        this.downloadUrl = r4;
        return;
    L5:
        this.versionName = r3;
        goto L7
    }

    public ThemeSimpleVersion(String r1, String r2) {
        this.versionName = r1;
        this.downloadUrl = r2;
    }

    public /* synthetic */ ThemeSimpleVersion(String r2, String r3, int r4, AbstractC0621Oc r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
