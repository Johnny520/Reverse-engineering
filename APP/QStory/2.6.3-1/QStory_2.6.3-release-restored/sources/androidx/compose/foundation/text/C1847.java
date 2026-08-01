package androidx.compose.foundation.text;

import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C2080;
import java.util.List;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1847 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f3297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2865 f3300;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2902 f3301;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC2830 f3302;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC8725 f3303;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public LayoutDirection f3304;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f3305;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C2080 f3306;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f3299 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f3298 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f3296 = 1;

    public C1847(C2902 c2902, C2865 c2865, boolean z, InterfaceC8725 interfaceC8725, InterfaceC2830 interfaceC2830, List list) {
        this.f3301 = c2902;
        this.f3300 = c2865;
        this.f3297 = z;
        this.f3303 = interfaceC8725;
        this.f3302 = interfaceC2830;
        this.f3305 = list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2481(LayoutDirection layoutDirection) {
        C2080 c2080 = this.f3306;
        if (c2080 == null || layoutDirection != this.f3304 || c2080.mo2715()) {
            this.f3304 = layoutDirection;
            c2080 = new C2080(this.f3301, AbstractC2882.m4332(this.f3300, layoutDirection), this.f3305, this.f3303, this.f3302);
        }
        this.f3306 = c2080;
    }
}
