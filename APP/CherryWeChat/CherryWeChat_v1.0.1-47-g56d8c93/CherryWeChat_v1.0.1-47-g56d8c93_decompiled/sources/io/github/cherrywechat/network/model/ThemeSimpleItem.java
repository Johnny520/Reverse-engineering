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
    private final String owner;
    private final String ownerId;
    private final String themeId;
    private final String themeName;
    private final List<ThemeSimpleVersion> versions;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0159Dn[] $childSerializers = {null, null, null, null, AbstractC0148Dc.m280n(2, new C1302d(23))};

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ThemeSimpleItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public ThemeSimpleItem() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, 31, (AbstractC0621Oc) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(ThemeSimpleVersion$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThemeSimpleItem copy$default(ThemeSimpleItem themeSimpleItem, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = themeSimpleItem.themeId;
        }
        if ((i & 2) != 0) {
            str2 = themeSimpleItem.themeName;
        }
        if ((i & 4) != 0) {
            str3 = themeSimpleItem.ownerId;
        }
        if ((i & 8) != 0) {
            str4 = themeSimpleItem.owner;
        }
        if ((i & 16) != 0) {
            list = themeSimpleItem.versions;
        }
        List list2 = list;
        String str5 = str3;
        return themeSimpleItem.copy(str, str2, str5, str4, list2);
    }

    public static final /* synthetic */ void write$Self$app_release(ThemeSimpleItem themeSimpleItem, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        InterfaceC0159Dn[] interfaceC0159DnArr = $childSerializers;
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeSimpleItem.themeId, "")) {
            String str = themeSimpleItem.themeId;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeSimpleItem.themeName, "")) {
            String str2 = themeSimpleItem.themeName;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeSimpleItem.ownerId, "")) {
            String str3 = themeSimpleItem.ownerId;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeSimpleItem.owner, "")) {
            String str4 = themeSimpleItem.owner;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(themeSimpleItem.versions, C0452Kf.f1484a)) {
            return;
        }
        List<ThemeSimpleVersion> list = themeSimpleItem.versions;
        interfaceC0962Wa.m1839a();
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

    public final ThemeSimpleItem copy(String str, String str2, String str3, String str4, List<ThemeSimpleVersion> list) {
        return new ThemeSimpleItem(str, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeSimpleItem)) {
            return false;
        }
        ThemeSimpleItem themeSimpleItem = (ThemeSimpleItem) obj;
        return AbstractC0585Nj.m1134a(this.themeId, themeSimpleItem.themeId) && AbstractC0585Nj.m1134a(this.themeName, themeSimpleItem.themeName) && AbstractC0585Nj.m1134a(this.ownerId, themeSimpleItem.ownerId) && AbstractC0585Nj.m1134a(this.owner, themeSimpleItem.owner) && AbstractC0585Nj.m1134a(this.versions, themeSimpleItem.versions);
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
        return this.versions.hashCode() + AbstractC2374ph.m4810g(this.owner, AbstractC2374ph.m4810g(this.ownerId, AbstractC2374ph.m4810g(this.themeName, this.themeId.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        return "ThemeSimpleItem(themeId=" + this.themeId + ", themeName=" + this.themeName + ", ownerId=" + this.ownerId + ", owner=" + this.owner + ", versions=" + this.versions + ')';
    }

    public /* synthetic */ ThemeSimpleItem(int i, String str, String str2, String str3, String str4, List list, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.themeId = "";
        } else {
            this.themeId = str;
        }
        if ((i & 2) == 0) {
            this.themeName = "";
        } else {
            this.themeName = str2;
        }
        if ((i & 4) == 0) {
            this.ownerId = "";
        } else {
            this.ownerId = str3;
        }
        if ((i & 8) == 0) {
            this.owner = "";
        } else {
            this.owner = str4;
        }
        if ((i & 16) == 0) {
            this.versions = C0452Kf.f1484a;
        } else {
            this.versions = list;
        }
    }

    public ThemeSimpleItem(String str, String str2, String str3, String str4, List<ThemeSimpleVersion> list) {
        this.themeId = str;
        this.themeName = str2;
        this.ownerId = str3;
        this.owner = str4;
        this.versions = list;
    }

    public /* synthetic */ ThemeSimpleItem(String str, String str2, String str3, String str4, List list, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? C0452Kf.f1484a : list);
    }
}
