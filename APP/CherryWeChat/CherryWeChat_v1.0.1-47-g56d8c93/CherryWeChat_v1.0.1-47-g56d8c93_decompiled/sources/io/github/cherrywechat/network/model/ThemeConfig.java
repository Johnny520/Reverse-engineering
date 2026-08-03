package io.github.cherrywechat.network.model;

import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class ThemeConfig {
    public static final Companion Companion = new Companion(null);
    private final String author;
    private final boolean autoDarkTheme;
    private final String description;
    private final boolean isFullBg;
    private final String name;
    private final String version;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return ThemeConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public ThemeConfig() {
        this((String) null, (String) null, (String) null, (String) null, false, false, 63, (AbstractC0621Oc) null);
    }

    public static /* synthetic */ ThemeConfig copy$default(ThemeConfig themeConfig, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = themeConfig.name;
        }
        if ((i & 2) != 0) {
            str2 = themeConfig.author;
        }
        if ((i & 4) != 0) {
            str3 = themeConfig.version;
        }
        if ((i & 8) != 0) {
            str4 = themeConfig.description;
        }
        if ((i & 16) != 0) {
            z = themeConfig.isFullBg;
        }
        if ((i & 32) != 0) {
            z2 = themeConfig.autoDarkTheme;
        }
        boolean z3 = z;
        boolean z4 = z2;
        return themeConfig.copy(str, str2, str3, str4, z3, z4);
    }

    public static final /* synthetic */ void write$Self$app_release(ThemeConfig themeConfig, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeConfig.name, "未知主题")) {
            String str = themeConfig.name;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeConfig.author, "未知作者")) {
            String str2 = themeConfig.author;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeConfig.version, "1.0")) {
            String str3 = themeConfig.version;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(themeConfig.description, "")) {
            String str4 = themeConfig.description;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || themeConfig.isFullBg) {
            boolean z = themeConfig.isFullBg;
            interfaceC0962Wa.m1840b();
        }
        if (!interfaceC0962Wa.m1845g() && themeConfig.autoDarkTheme) {
            return;
        }
        boolean z2 = themeConfig.autoDarkTheme;
        interfaceC0962Wa.m1840b();
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.author;
    }

    public final String component3() {
        return this.version;
    }

    public final String component4() {
        return this.description;
    }

    public final boolean component5() {
        return this.isFullBg;
    }

    public final boolean component6() {
        return this.autoDarkTheme;
    }

    public final ThemeConfig copy(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        return new ThemeConfig(str, str2, str3, str4, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeConfig)) {
            return false;
        }
        ThemeConfig themeConfig = (ThemeConfig) obj;
        return AbstractC0585Nj.m1134a(this.name, themeConfig.name) && AbstractC0585Nj.m1134a(this.author, themeConfig.author) && AbstractC0585Nj.m1134a(this.version, themeConfig.version) && AbstractC0585Nj.m1134a(this.description, themeConfig.description) && this.isFullBg == themeConfig.isFullBg && this.autoDarkTheme == themeConfig.autoDarkTheme;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final boolean getAutoDarkTheme() {
        return this.autoDarkTheme;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Boolean.hashCode(this.autoDarkTheme) + ((Boolean.hashCode(this.isFullBg) + AbstractC2374ph.m4810g(this.description, AbstractC2374ph.m4810g(this.version, AbstractC2374ph.m4810g(this.author, this.name.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final boolean isFullBg() {
        return this.isFullBg;
    }

    public String toString() {
        return "ThemeConfig(name=" + this.name + ", author=" + this.author + ", version=" + this.version + ", description=" + this.description + ", isFullBg=" + this.isFullBg + ", autoDarkTheme=" + this.autoDarkTheme + ')';
    }

    public /* synthetic */ ThemeConfig(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, AbstractC0298Gx abstractC0298Gx) {
        this.name = (i & 1) == 0 ? "未知主题" : str;
        if ((i & 2) == 0) {
            this.author = "未知作者";
        } else {
            this.author = str2;
        }
        if ((i & 4) == 0) {
            this.version = "1.0";
        } else {
            this.version = str3;
        }
        if ((i & 8) == 0) {
            this.description = "";
        } else {
            this.description = str4;
        }
        if ((i & 16) == 0) {
            this.isFullBg = false;
        } else {
            this.isFullBg = z;
        }
        if ((i & 32) == 0) {
            this.autoDarkTheme = true;
        } else {
            this.autoDarkTheme = z2;
        }
    }

    public ThemeConfig(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.name = str;
        this.author = str2;
        this.version = str3;
        this.description = str4;
        this.isFullBg = z;
        this.autoDarkTheme = z2;
    }

    public /* synthetic */ ThemeConfig(String str, String str2, String str3, String str4, boolean z, boolean z2, int i, AbstractC0621Oc abstractC0621Oc) {
        this((i & 1) != 0 ? "未知主题" : str, (i & 2) != 0 ? "未知作者" : str2, (i & 4) != 0 ? "1.0" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? true : z2);
    }
}
