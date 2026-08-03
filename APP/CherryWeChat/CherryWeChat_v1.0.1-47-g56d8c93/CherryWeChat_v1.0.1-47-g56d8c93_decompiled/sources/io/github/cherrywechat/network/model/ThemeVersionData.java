package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class ThemeVersionData {
    public static final Companion Companion = new Companion(null);
    private final String createdAt;
    private final String fileExt;
    private final String fileName;
    private final long fileSize;

    /* JADX INFO: renamed from: id */
    private final String f5575id;
    private final String versionName;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ThemeVersionData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public ThemeVersionData() {
        this((String) null, (String) null, (String) null, (String) null, 0L, (String) null, 63, (AbstractC0621Oc) null);
    }

    public static /* synthetic */ ThemeVersionData copy$default(ThemeVersionData themeVersionData, String str, String str2, String str3, String str4, long j, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = themeVersionData.f5575id;
        }
        if ((i & 2) != 0) {
            str2 = themeVersionData.versionName;
        }
        if ((i & 4) != 0) {
            str3 = themeVersionData.fileName;
        }
        if ((i & 8) != 0) {
            str4 = themeVersionData.fileExt;
        }
        if ((i & 16) != 0) {
            j = themeVersionData.fileSize;
        }
        if ((i & 32) != 0) {
            str5 = themeVersionData.createdAt;
        }
        String str6 = str5;
        long j2 = j;
        return themeVersionData.copy(str, str2, str3, str4, j2, str6);
    }

    public static final /* synthetic */ void write$Self$app_release(ThemeVersionData themeVersionData, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeVersionData.f5575id, "")) {
            String str = themeVersionData.f5575id;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeVersionData.versionName, "")) {
            String str2 = themeVersionData.versionName;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeVersionData.fileName, "")) {
            String str3 = themeVersionData.fileName;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeVersionData.fileExt, "")) {
            String str4 = themeVersionData.fileExt;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || themeVersionData.fileSize != 0) {
            long j = themeVersionData.fileSize;
            interfaceC0962Wa.m1841c();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(themeVersionData.createdAt, "")) {
            return;
        }
        String str5 = themeVersionData.createdAt;
        interfaceC0962Wa.m1842d();
    }

    public final String component1() {
        return this.f5575id;
    }

    public final String component2() {
        return this.versionName;
    }

    public final String component3() {
        return this.fileName;
    }

    public final String component4() {
        return this.fileExt;
    }

    public final long component5() {
        return this.fileSize;
    }

    public final String component6() {
        return this.createdAt;
    }

    public final ThemeVersionData copy(String str, String str2, String str3, String str4, long j, String str5) {
        return new ThemeVersionData(str, str2, str3, str4, j, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeVersionData)) {
            return false;
        }
        ThemeVersionData themeVersionData = (ThemeVersionData) obj;
        return AbstractC0585Nj.m1134a(this.f5575id, themeVersionData.f5575id) && AbstractC0585Nj.m1134a(this.versionName, themeVersionData.versionName) && AbstractC0585Nj.m1134a(this.fileName, themeVersionData.fileName) && AbstractC0585Nj.m1134a(this.fileExt, themeVersionData.fileExt) && this.fileSize == themeVersionData.fileSize && AbstractC0585Nj.m1134a(this.createdAt, themeVersionData.createdAt);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getFileExt() {
        return this.fileExt;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getId() {
        return this.f5575id;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        return this.createdAt.hashCode() + ((Long.hashCode(this.fileSize) + AbstractC2374ph.m4810g(this.fileExt, AbstractC2374ph.m4810g(this.fileName, AbstractC2374ph.m4810g(this.versionName, this.f5575id.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ThemeVersionData(id=");
        sb.append(this.f5575id);
        sb.append(", versionName=");
        sb.append(this.versionName);
        sb.append(", fileName=");
        sb.append(this.fileName);
        sb.append(", fileExt=");
        sb.append(this.fileExt);
        sb.append(", fileSize=");
        sb.append(this.fileSize);
        sb.append(", createdAt=");
        return AbstractC2374ph.m4815l(sb, this.createdAt, ')');
    }

    public /* synthetic */ ThemeVersionData(int i, String str, String str2, String str3, String str4, long j, String str5, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.f5575id = "";
        } else {
            this.f5575id = str;
        }
        if ((i & 2) == 0) {
            this.versionName = "";
        } else {
            this.versionName = str2;
        }
        if ((i & 4) == 0) {
            this.fileName = "";
        } else {
            this.fileName = str3;
        }
        if ((i & 8) == 0) {
            this.fileExt = "";
        } else {
            this.fileExt = str4;
        }
        if ((i & 16) == 0) {
            this.fileSize = 0L;
        } else {
            this.fileSize = j;
        }
        if ((i & 32) == 0) {
            this.createdAt = "";
        } else {
            this.createdAt = str5;
        }
    }

    public ThemeVersionData(String str, String str2, String str3, String str4, long j, String str5) {
        this.f5575id = str;
        this.versionName = str2;
        this.fileName = str3;
        this.fileExt = str4;
        this.fileSize = j;
        this.createdAt = str5;
    }

    public /* synthetic */ ThemeVersionData(String str, String str2, String str3, String str4, long j, String str5, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? "" : str5);
    }
}
