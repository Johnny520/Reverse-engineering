package io.github.cherrywechat.network.model;

import java.util.List;
import p000.AbstractC0148Dc;
import p000.AbstractC0213Ey;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.C0263G4;
import p000.C0452Kf;
import p000.C1302d;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0159Dn;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class ThemeSimpleData {
    private final int themeCount;
    private final List<ThemeSimpleItem> themes;
    private final String wechat;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC0159Dn[] $childSerializers = {null, null, AbstractC0148Dc.m280n(2, new C1302d(22))};

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ThemeSimpleData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public ThemeSimpleData() {
        this((String) null, 0, (List) null, 7, (AbstractC0621Oc) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC0717Qm _childSerializers$_anonymous_() {
        return new C0263G4(ThemeSimpleItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThemeSimpleData copy$default(ThemeSimpleData themeSimpleData, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = themeSimpleData.wechat;
        }
        if ((i2 & 2) != 0) {
            i = themeSimpleData.themeCount;
        }
        if ((i2 & 4) != 0) {
            list = themeSimpleData.themes;
        }
        return themeSimpleData.copy(str, i, list);
    }

    public static final /* synthetic */ void write$Self$app_release(ThemeSimpleData themeSimpleData, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        InterfaceC0159Dn[] interfaceC0159DnArr = $childSerializers;
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeSimpleData.wechat, "")) {
            String str = themeSimpleData.wechat;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || themeSimpleData.themeCount != 0) {
            int i = themeSimpleData.themeCount;
            interfaceC0962Wa.m1843e();
        }
        if (!interfaceC0962Wa.m1845g() && AbstractC0585Nj.m1134a(themeSimpleData.themes, C0452Kf.f1484a)) {
            return;
        }
        List<ThemeSimpleItem> list = themeSimpleData.themes;
        interfaceC0962Wa.m1839a();
    }

    public final String component1() {
        return this.wechat;
    }

    public final int component2() {
        return this.themeCount;
    }

    public final List<ThemeSimpleItem> component3() {
        return this.themes;
    }

    public final ThemeSimpleData copy(String str, int i, List<ThemeSimpleItem> list) {
        return new ThemeSimpleData(str, i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeSimpleData)) {
            return false;
        }
        ThemeSimpleData themeSimpleData = (ThemeSimpleData) obj;
        return AbstractC0585Nj.m1134a(this.wechat, themeSimpleData.wechat) && this.themeCount == themeSimpleData.themeCount && AbstractC0585Nj.m1134a(this.themes, themeSimpleData.themes);
    }

    public final int getThemeCount() {
        return this.themeCount;
    }

    public final List<ThemeSimpleItem> getThemes() {
        return this.themes;
    }

    public final String getWechat() {
        return this.wechat;
    }

    public int hashCode() {
        return this.themes.hashCode() + AbstractC0213Ey.m403a(this.themeCount, this.wechat.hashCode() * 31, 31);
    }

    public String toString() {
        return "ThemeSimpleData(wechat=" + this.wechat + ", themeCount=" + this.themeCount + ", themes=" + this.themes + ')';
    }

    public /* synthetic */ ThemeSimpleData(int i, String str, int i2, List list, AbstractC0298Gx abstractC0298Gx) {
        this.wechat = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.themeCount = 0;
        } else {
            this.themeCount = i2;
        }
        if ((i & 4) == 0) {
            this.themes = C0452Kf.f1484a;
        } else {
            this.themes = list;
        }
    }

    public ThemeSimpleData(String str, int i, List<ThemeSimpleItem> list) {
        this.wechat = str;
        this.themeCount = i;
        this.themes = list;
    }

    public /* synthetic */ ThemeSimpleData(String str, int i, List list, int i2, AbstractC0621Oc abstractC0621Oc) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? C0452Kf.f1484a : list);
    }
}
