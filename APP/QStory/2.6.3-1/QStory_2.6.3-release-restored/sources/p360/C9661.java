package p360;

import androidx.compose.p001ui.graphics.C2434;
import top.yukonga.miuix.kmp.theme.ThemeColorSpec;
import top.yukonga.miuix.kmp.theme.ThemePaletteStyle;

/* JADX INFO: renamed from: 飘花落叶言苏哲兰子世楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9661 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ThemeColorSpec f25263;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ThemePaletteStyle f25264;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f25265;

    public C9661(long j, ThemePaletteStyle themePaletteStyle, ThemeColorSpec themeColorSpec) {
        themePaletteStyle.getClass();
        themeColorSpec.getClass();
        this.f25265 = j;
        this.f25264 = themePaletteStyle;
        this.f25263 = themeColorSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9661)) {
            return false;
        }
        C9661 c9661 = (C9661) obj;
        return C2434.m3509(this.f25265, c9661.f25265) && this.f25264 == c9661.f25264 && this.f25263 == c9661.f25263;
    }

    public final int hashCode() {
        int i = C2434.f5044;
        return this.f25263.hashCode() + ((this.f25264.hashCode() + (Long.hashCode(this.f25265) * 31)) * 31);
    }

    public final String toString() {
        return "SystemPaletteInfo(seedColor=" + C2434.m3514(this.f25265) + ", paletteStyle=" + this.f25264 + ", colorSpec=" + this.f25263 + ")";
    }
}
