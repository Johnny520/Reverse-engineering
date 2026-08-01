package p344;

import androidx.compose.ui.graphics.C1599;
import top.yukonga.miuix.kmp.theme.ThemeColorSpec;
import top.yukonga.miuix.kmp.theme.ThemePaletteStyle;

/* JADX INFO: renamed from: 飘花落叶言苏哲兰子世楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8832 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ThemeColorSpec f24918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ThemePaletteStyle f24919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f24920;

    public C8832(long j, ThemePaletteStyle themePaletteStyle, ThemeColorSpec themeColorSpec) {
        themePaletteStyle.getClass();
        themeColorSpec.getClass();
        this.f24920 = j;
        this.f24919 = themePaletteStyle;
        this.f24918 = themeColorSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8832)) {
            return false;
        }
        C8832 c8832 = (C8832) obj;
        return C1599.m2949(this.f24920, c8832.f24920) && this.f24919 == c8832.f24919 && this.f24918 == c8832.f24918;
    }

    public final int hashCode() {
        int i = C1599.f4699;
        return this.f24918.hashCode() + ((this.f24919.hashCode() + (Long.hashCode(this.f24920) * 31)) * 31);
    }

    public final String toString() {
        return "SystemPaletteInfo(seedColor=" + C1599.m2954(this.f24920) + ", paletteStyle=" + this.f24919 + ", colorSpec=" + this.f24918 + ")";
    }
}
