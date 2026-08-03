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
public final class ThemeSimpleItem {
    private static final InterfaceC0159Dn[] $childSerializers = null;
    public static final Companion Companion = null;
    private final String owner;
    private final String ownerId;
    private final String themeId;
    private final String themeName;
    private final List<ThemeSimpleVersion> versions;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ThemeSimpleItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
        $childSerializers = new InterfaceC0159Dn[]{null, null, null, null, AbstractC0148Dc.m280n(2, new C1302d(23))};
    }

    public ThemeSimpleItem() {
        String r1 = null;
        String r2 = null;
        String r3 = null;
        String r4 = null;
        List r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    private static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(ThemeSimpleVersion$$serializer.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0717Qm m3552a() {
        return _childSerializers$_anonymous_();
    }

    public static final /* synthetic */ InterfaceC0159Dn[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThemeSimpleItem copy$default(ThemeSimpleItem r0, String r1, String r2, String r3, String r4, List r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.themeId;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.themeName;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.ownerId;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.owner;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.versions;
    L17:
        String r62 = r4;
        List r72 = r5;
        String r52 = r3;
        String r32 = r1;
        return r0.copy(r32, r2, r52, r62, r72);
    }

    public static final /* synthetic */ void write$Self$app_release(ThemeSimpleItem r2, InterfaceC0962Wa r3, InterfaceC0126Cx r4) {
        InterfaceC0159Dn[] r42 = $childSerializers;
        if (r3.m1845g() == false) goto L6;
    L7:
        String r0 = r2.themeId;
        r3.m1842d();
    L9:
        if (r3.m1845g() == false) goto L12;
    L13:
        String r02 = r2.themeName;
        r3.m1842d();
    L15:
        if (r3.m1845g() == false) goto L18;
    L19:
        String r03 = r2.ownerId;
        r3.m1842d();
    L21:
        if (r3.m1845g() == false) goto L24;
    L25:
        String r04 = r2.owner;
        r3.m1842d();
    L27:
        if (r3.m1845g() == false) goto L30;
    L31:
        InterfaceC0717Qm r43 = (InterfaceC0717Qm) r42[4].getValue();
        List<ThemeSimpleVersion> r22 = r2.versions;
        r3.m1839a();
        return;
    L30:
        if (AbstractC0585Nj.m1134a(r2.versions, C0452Kf.f1484a) == false) goto L31;
        return;
    L24:
        if (AbstractC0585Nj.m1134a(r2.owner, "") == true) goto L27;
    L18:
        if (AbstractC0585Nj.m1134a(r2.ownerId, "") == true) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r2.themeName, "") == true) goto L15;
    L6:
        if (AbstractC0585Nj.m1134a(r2.themeId, "") == true) goto L9;
        goto L7
    }

    public final String component1() {
        return this.themeId;
    }

    public final String component2() {
        return this.themeName;
    }

    public final String component3() {
        return this.ownerId;
    }

    public final String component4() {
        return this.owner;
    }

    public final List<ThemeSimpleVersion> component5() {
        return this.versions;
    }

    public final ThemeSimpleItem copy(String r7, String r8, String r9, String r10, List<ThemeSimpleVersion> r11) {
        return new ThemeSimpleItem(r7, r8, r9, r10, r11);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ThemeSimpleItem) == true) goto L8;
        return false;
    L8:
        ThemeSimpleItem r52 = (ThemeSimpleItem) r5;
        if (AbstractC0585Nj.m1134a(this.themeId, r52.themeId) == true) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.themeName, r52.themeName) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.ownerId, r52.ownerId) == true) goto L18;
        return false;
    L18:
        if (AbstractC0585Nj.m1134a(this.owner, r52.owner) == true) goto L21;
        return false;
    L21:
        if (AbstractC0585Nj.m1134a(this.versions, r52.versions) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getThemeId() {
        return this.themeId;
    }

    public final String getThemeName() {
        return this.themeName;
    }

    public final List<ThemeSimpleVersion> getVersions() {
        return this.versions;
    }

    public int hashCode() {
        int r0 = this.themeId.hashCode() * 31;
        int r02 = AbstractC2374ph.m4810g(this.themeName, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.ownerId, r02, 31);
        int r04 = AbstractC2374ph.m4810g(this.owner, r03, 31);
        return this.versions.hashCode() + r04;
    }

    public String toString() {
        return "ThemeSimpleItem(themeId=" + this.themeId + ", themeName=" + this.themeName + ", ownerId=" + this.ownerId + ", owner=" + this.owner + ", versions=" + this.versions + ')';
    }

    public /* synthetic */ ThemeSimpleItem(int r2, String r3, String r4, String r5, String r6, List r7, AbstractC0298Gx r8) {
        if ((r2 & 1) != 0) goto L5;
        this.themeId = "";
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.themeName = "";
    L11:
        if ((r2 & 4) != 0) goto L13;
        this.ownerId = "";
    L15:
        if ((r2 & 8) != 0) goto L17;
        this.owner = "";
    L19:
        if ((r2 & 16) != 0) goto L22;
        this.versions = C0452Kf.f1484a;
        return;
    L22:
        this.versions = r7;
        return;
    L17:
        this.owner = r6;
        goto L19
    L13:
        this.ownerId = r5;
        goto L15
    L9:
        this.themeName = r4;
        goto L11
    L5:
        this.themeId = r3;
        goto L7
    }

    public ThemeSimpleItem(String r1, String r2, String r3, String r4, List<ThemeSimpleVersion> r5) {
        this.themeId = r1;
        this.themeName = r2;
        this.ownerId = r3;
        this.owner = r4;
        this.versions = r5;
    }

    public /* synthetic */ ThemeSimpleItem(String r2, String r3, String r4, String r5, List r6, int r7, AbstractC0621Oc r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = C0452Kf.f1484a;
    L17:
        List r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72);
    }
}
