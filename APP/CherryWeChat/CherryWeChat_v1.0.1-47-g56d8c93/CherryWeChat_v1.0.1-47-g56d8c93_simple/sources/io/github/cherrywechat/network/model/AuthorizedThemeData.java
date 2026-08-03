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
    private static final InterfaceC0159Dn[] $childSerializers = null;
    public static final Companion Companion = null;
    private final String authType;
    private final String author;
    private final String baiduSkinDownloadUrl;
    private final String createdAt;

    /* JADX INFO: renamed from: id */
    private final String f5565id;
    private final String name;
    private final List<ThemeVersionData> versions;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return AuthorizedThemeData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
        $childSerializers = new InterfaceC0159Dn[]{null, null, null, null, null, null, AbstractC0148Dc.m280n(2, new C1302d(5))};
    }

    public AuthorizedThemeData() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        List r7 = null;
        this(r1, r2, r3, r4, r5, r6, r7, 127, null);
    }

    private static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(ThemeVersionData$$serializer.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0717Qm m3542a() {
        return _childSerializers$_anonymous_();
    }

    public static final /* synthetic */ InterfaceC0159Dn[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthorizedThemeData copy$default(AuthorizedThemeData r0, String r1, String r2, String r3, String r4, String r5, String r6, List r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r0.f5565id;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r0.name;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r0.author;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r0.baiduSkinDownloadUrl;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r0.authType;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r0.createdAt;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r0.versions;
    L23:
        String r82 = r6;
        List r92 = r7;
        String r62 = r4;
        String r72 = r5;
        String r52 = r3;
        String r32 = r1;
        return r0.copy(r32, r2, r52, r62, r72, r82, r92);
    }

    public static final /* synthetic */ void write$Self$app_release(AuthorizedThemeData r2, InterfaceC0962Wa r3, InterfaceC0126Cx r4) {
        InterfaceC0159Dn[] r42 = $childSerializers;
        if (r3.m1845g() == false) goto L6;
    L7:
        String r0 = r2.f5565id;
        r3.m1842d();
    L9:
        if (r3.m1845g() == false) goto L12;
    L13:
        String r02 = r2.name;
        r3.m1842d();
    L15:
        if (r3.m1845g() == false) goto L18;
    L19:
        String r03 = r2.author;
        r3.m1842d();
    L21:
        if (r3.m1845g() == false) goto L24;
    L25:
        String r04 = r2.baiduSkinDownloadUrl;
        r3.m1842d();
    L27:
        if (r3.m1845g() == false) goto L30;
    L31:
        String r05 = r2.authType;
        r3.m1842d();
    L33:
        if (r3.m1845g() == false) goto L36;
    L37:
        String r06 = r2.createdAt;
        r3.m1842d();
    L39:
        if (r3.m1845g() == false) goto L42;
    L43:
        InterfaceC0717Qm r43 = (InterfaceC0717Qm) r42[6].getValue();
        List<ThemeVersionData> r22 = r2.versions;
        r3.m1839a();
        return;
    L42:
        if (AbstractC0585Nj.m1134a(r2.versions, C0452Kf.f1484a) == false) goto L43;
        return;
    L36:
        if (AbstractC0585Nj.m1134a(r2.createdAt, "") == true) goto L39;
    L30:
        if (AbstractC0585Nj.m1134a(r2.authType, "") == true) goto L33;
    L24:
        if (AbstractC0585Nj.m1134a(r2.baiduSkinDownloadUrl, "") == true) goto L27;
    L18:
        if (AbstractC0585Nj.m1134a(r2.author, "") == true) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r2.name, "") == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r2.f5565id, "") == true) goto L9;
        goto L7
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

    public final AuthorizedThemeData copy(String r9, String r10, String r11, String r12, String r13, String r14, List<ThemeVersionData> r15) {
        return new AuthorizedThemeData(r9, r10, r11, r12, r13, r14, r15);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof AuthorizedThemeData) == true) goto L8;
        return false;
    L8:
        AuthorizedThemeData r52 = (AuthorizedThemeData) r5;
        if (AbstractC0585Nj.m1134a(this.f5565id, r52.f5565id) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.name, r52.name) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.author, r52.author) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.baiduSkinDownloadUrl, r52.baiduSkinDownloadUrl) == true) goto L21;
        return false;
    L21:
        if (AbstractC0585Nj.m1134a(this.authType, r52.authType) == true) goto L24;
        return false;
    L24:
        if (AbstractC0585Nj.m1134a(this.createdAt, r52.createdAt) == true) goto L27;
        return false;
    L27:
        if (AbstractC0585Nj.m1134a(this.versions, r52.versions) == true) goto L29;
        return false;
    L29:
        return true;
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
        int r0 = this.f5565id.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.name, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.author, r02, 31);
        int r04 = AbstractC2374ph.m4810g(this.baiduSkinDownloadUrl, r03, 31);
        int r05 = AbstractC2374ph.m4810g(this.authType, r04, 31);
        int r06 = AbstractC2374ph.m4810g(this.createdAt, r05, 31);
        return this.versions.hashCode() + r06;
    }

    public String toString() {
        return "AuthorizedThemeData(id=" + this.f5565id + ", name=" + this.name + ", author=" + this.author + ", baiduSkinDownloadUrl=" + this.baiduSkinDownloadUrl + ", authType=" + this.authType + ", createdAt=" + this.createdAt + ", versions=" + this.versions + ')';
    }

    public /* synthetic */ AuthorizedThemeData(int r2, String r3, String r4, String r5, String r6, String r7, String r8, List r9, AbstractC0298Gx r10) {
        if ((r2 & 1) != 0) goto L5;
        this.f5565id = "";
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.name = "";
    L11:
        if ((r2 & 4) != 0) goto L13;
        this.author = "";
    L15:
        if ((r2 & 8) != 0) goto L17;
        this.baiduSkinDownloadUrl = "";
    L19:
        if ((r2 & 16) != 0) goto L21;
        this.authType = "";
    L23:
        if ((r2 & 32) != 0) goto L25;
        this.createdAt = "";
    L27:
        if ((r2 & 64) != 0) goto L30;
        this.versions = C0452Kf.f1484a;
        return;
    L30:
        this.versions = r9;
        return;
    L25:
        this.createdAt = r8;
        goto L27
    L21:
        this.authType = r7;
        goto L23
    L17:
        this.baiduSkinDownloadUrl = r6;
        goto L19
    L13:
        this.author = r5;
        goto L15
    L9:
        this.name = r4;
        goto L11
    L5:
        this.f5565id = r3;
        goto L7
    }

    public AuthorizedThemeData(String r1, String r2, String r3, String r4, String r5, String r6, List<ThemeVersionData> r7) {
        this.f5565id = r1;
        this.name = r2;
        this.author = r3;
        this.baiduSkinDownloadUrl = r4;
        this.authType = r5;
        this.createdAt = r6;
        this.versions = r7;
    }

    public /* synthetic */ AuthorizedThemeData(String r2, String r3, String r4, String r5, String r6, String r7, List r8, int r9, AbstractC0621Oc r10) {
        if ((r9 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r9 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r9 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r9 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r9 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r9 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r9 & 64) == 0) goto L23;
        r8 = C0452Kf.f1484a;
    L23:
        List r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92);
    }
}
