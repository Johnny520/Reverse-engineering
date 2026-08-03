package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0148Dc;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.C0263G4;
import p000.C0452Kf;
import p000.C1302d;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class AuthorizedThemeData {
    private final String authType;
    private final String author;
    private final String baiduSkinDownloadUrl;
    private final String createdAt;

    /* JADX INFO: renamed from: id */
    private final String f5565id;
    private final String name;
    private final List<ThemeVersionData> versions;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0159Dn[] $childSerializers = {null, null, null, null, null, null, AbstractC0148Dc.m280n(2, new C1302d(5))};

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return AuthorizedThemeData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public AuthorizedThemeData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 127, (AbstractC0621Oc) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(ThemeVersionData$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthorizedThemeData copy$default(AuthorizedThemeData authorizedThemeData, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authorizedThemeData.f5565id;
        }
        if ((i & 2) != 0) {
            str2 = authorizedThemeData.name;
        }
        if ((i & 4) != 0) {
            str3 = authorizedThemeData.author;
        }
        if ((i & 8) != 0) {
            str4 = authorizedThemeData.baiduSkinDownloadUrl;
        }
        if ((i & 16) != 0) {
            str5 = authorizedThemeData.authType;
        }
        if ((i & 32) != 0) {
            str6 = authorizedThemeData.createdAt;
        }
        if ((i & 64) != 0) {
            list = authorizedThemeData.versions;
        }
        String str7 = str6;
        List list2 = list;
        String str8 = str5;
        String str9 = str3;
        return authorizedThemeData.copy(str, str2, str9, str4, str8, str7, list2);
    }

    public static final /* synthetic */ void write$Self$app_release(AuthorizedThemeData authorizedThemeData, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        InterfaceC0159Dn[] interfaceC0159DnArr = $childSerializers;
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(authorizedThemeData.f5565id, "")) {
            String str = authorizedThemeData.f5565id;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(authorizedThemeData.name, "")) {
            String str2 = authorizedThemeData.name;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(authorizedThemeData.author, "")) {
            String str3 = authorizedThemeData.author;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(authorizedThemeData.baiduSkinDownloadUrl, "")) {
            String str4 = authorizedThemeData.baiduSkinDownloadUrl;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(authorizedThemeData.authType, "")) {
            String str5 = authorizedThemeData.authType;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(authorizedThemeData.createdAt, "")) {
            String str6 = authorizedThemeData.createdAt;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(authorizedThemeData.versions, C0452Kf.f1484a)) {
            return;
        }
        List<ThemeVersionData> list = authorizedThemeData.versions;
        interfaceC0962Wa.m1839a();
    }

    public final String component1() {
        return this.f5565id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.author;
    }

    public final String component4() {
        return this.baiduSkinDownloadUrl;
    }

    public final String component5() {
        return this.authType;
    }

    public final String component6() {
        return this.createdAt;
    }

    public final List<ThemeVersionData> component7() {
        return this.versions;
    }

    public final AuthorizedThemeData copy(String str, String str2, String str3, String str4, String str5, String str6, List<ThemeVersionData> list) {
        return new AuthorizedThemeData(str, str2, str3, str4, str5, str6, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorizedThemeData)) {
            return false;
        }
        AuthorizedThemeData authorizedThemeData = (AuthorizedThemeData) obj;
        return AbstractC0585Nj.m1134a(this.f5565id, authorizedThemeData.f5565id) && AbstractC0585Nj.m1134a(this.name, authorizedThemeData.name) && AbstractC0585Nj.m1134a(this.author, authorizedThemeData.author) && AbstractC0585Nj.m1134a(this.baiduSkinDownloadUrl, authorizedThemeData.baiduSkinDownloadUrl) && AbstractC0585Nj.m1134a(this.authType, authorizedThemeData.authType) && AbstractC0585Nj.m1134a(this.createdAt, authorizedThemeData.createdAt) && AbstractC0585Nj.m1134a(this.versions, authorizedThemeData.versions);
    }

    public final String getAuthType() {
        return this.authType;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getBaiduSkinDownloadUrl() {
        return this.baiduSkinDownloadUrl;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f5565id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<ThemeVersionData> getVersions() {
        return this.versions;
    }

    public int hashCode() {
        return this.versions.hashCode() + AbstractC2374ph.m4810g(this.createdAt, AbstractC2374ph.m4810g(this.authType, AbstractC2374ph.m4810g(this.baiduSkinDownloadUrl, AbstractC2374ph.m4810g(this.author, AbstractC2374ph.m4810g(this.name, this.f5565id.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public String toString() {
        return "AuthorizedThemeData(id=" + this.f5565id + ", name=" + this.name + ", author=" + this.author + ", baiduSkinDownloadUrl=" + this.baiduSkinDownloadUrl + ", authType=" + this.authType + ", createdAt=" + this.createdAt + ", versions=" + this.versions + ')';
    }

    public /* synthetic */ AuthorizedThemeData(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.f5565id = "";
        } else {
            this.f5565id = str;
        }
        if ((i & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.author = "";
        } else {
            this.author = str3;
        }
        if ((i & 8) == 0) {
            this.baiduSkinDownloadUrl = "";
        } else {
            this.baiduSkinDownloadUrl = str4;
        }
        if ((i & 16) == 0) {
            this.authType = "";
        } else {
            this.authType = str5;
        }
        if ((i & 32) == 0) {
            this.createdAt = "";
        } else {
            this.createdAt = str6;
        }
        if ((i & 64) == 0) {
            this.versions = C0452Kf.f1484a;
        } else {
            this.versions = list;
        }
    }

    public AuthorizedThemeData(String str, String str2, String str3, String str4, String str5, String str6, List<ThemeVersionData> list) {
        this.f5565id = str;
        this.name = str2;
        this.author = str3;
        this.baiduSkinDownloadUrl = str4;
        this.authType = str5;
        this.createdAt = str6;
        this.versions = list;
    }

    public /* synthetic */ AuthorizedThemeData(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? C0452Kf.f1484a : list);
    }
}
