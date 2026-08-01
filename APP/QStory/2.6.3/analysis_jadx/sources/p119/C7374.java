package p119;

import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.font.InterfaceC1996;
import androidx.compose.ui.unit.LayoutDirection;
import p205.AbstractC7897;
import p205.C7895;
import p205.C7898;

/* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7374 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C7374 f19971;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2031 f19973;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1996 f19974;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7895 f19975;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2031 f19976;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LayoutDirection f19977;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f19972 = Float.NaN;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f19978 = Float.NaN;

    public C7374(LayoutDirection layoutDirection, C2031 c2031, C7895 c7895, InterfaceC1996 interfaceC1996) {
        this.f19977 = layoutDirection;
        this.f19976 = c2031;
        this.f19975 = c7895;
        this.f19974 = interfaceC1996;
        this.f19973 = AbstractC2048.m3772(c2031, layoutDirection);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m12557(int i, long j) {
        int iM13340;
        float f = this.f19978;
        float f2 = this.f19972;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = AbstractC7373.f19970;
            long jM13324 = AbstractC7897.m13324(0, 0, 0, 0, 15);
            C2031 c2031 = this.f19973;
            C7895 c7895 = this.f19975;
            float fM3780 = AbstractC2048.m3771(str, c2031, jM13324, c7895, this.f19974, null, 1, 96).m3780();
            float fM37802 = AbstractC2048.m3771(AbstractC7373.f19969, this.f19973, AbstractC7897.m13324(0, 0, 0, 0, 15), c7895, this.f19974, null, 2, 96).m3780() - fM3780;
            this.f19978 = fM3780;
            this.f19972 = fM37802;
            f2 = fM37802;
            f = fM3780;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            iM13340 = iRound >= 0 ? iRound : 0;
            int iM13338 = C7898.m13338(j);
            if (iM13340 > iM13338) {
                iM13340 = iM13338;
            }
        } else {
            iM13340 = C7898.m13340(j);
        }
        return AbstractC7897.m13325(C7898.m13341(j), C7898.m13337(j), iM13340, C7898.m13338(j));
    }
}
