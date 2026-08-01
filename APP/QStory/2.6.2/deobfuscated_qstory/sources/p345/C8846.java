package p345;

import androidx.compose.ui.graphics.C1599;
import top.yukonga.miuix.kmp.theme.ThemeColorSpec;
import top.yukonga.miuix.kmp.theme.ThemePaletteStyle;

/* JADX INFO: renamed from: 飘花落叶言苏哲兰楪子世.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8846 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ThemeColorSpec f24935;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ThemePaletteStyle f24936;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f24937;

    public C8846(long j, ThemePaletteStyle themePaletteStyle, ThemeColorSpec themeColorSpec) {
        themePaletteStyle.getClass();
        themeColorSpec.getClass();
        this.f24937 = j;
        this.f24936 = themePaletteStyle;
        this.f24935 = themeColorSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8846)) {
            return false;
        }
        C8846 c8846 = (C8846) obj;
        return C1599.m2939(this.f24937, c8846.f24937) && this.f24936 == c8846.f24936 && this.f24935 == c8846.f24935;
    }

    public final int hashCode() {
        int i = C1599.f4698;
        return this.f24935.hashCode() + ((this.f24936.hashCode() + (Long.hashCode(this.f24937) * 31)) * 31);
    }

    public final String toString() {
        return "SystemPaletteInfo(seedColor=" + C1599.m2944(this.f24937) + ", paletteStyle=" + this.f24936 + ", colorSpec=" + this.f24935 + ")";
    }
}
