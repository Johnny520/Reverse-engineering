package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.font.InterfaceC1996;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1009 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f2952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2031 f2955;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2068 f2956;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC1996 f2957;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC7896 f2958;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public LayoutDirection f2959;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List f2960;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C1245 f2961;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f2954 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f2953 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f2951 = 1;

    public C1009(C2068 c2068, C2031 c2031, boolean z, InterfaceC7896 interfaceC7896, InterfaceC1996 interfaceC1996, List list) {
        this.f2956 = c2068;
        this.f2955 = c2031;
        this.f2952 = z;
        this.f2958 = interfaceC7896;
        this.f2957 = interfaceC1996;
        this.f2960 = list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1921(LayoutDirection layoutDirection) {
        C1245 c1245 = this.f2961;
        if (c1245 == null || layoutDirection != this.f2959 || c1245.mo2155()) {
            this.f2959 = layoutDirection;
            c1245 = new C1245(this.f2956, AbstractC2048.m3772(this.f2955, layoutDirection), this.f2960, this.f2958, this.f2957);
        }
        this.f2961 = c1245;
    }
}
