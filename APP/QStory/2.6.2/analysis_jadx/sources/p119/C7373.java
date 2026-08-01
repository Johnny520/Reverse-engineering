package p119;

import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.font.InterfaceC1996;
import androidx.compose.ui.unit.LayoutDirection;
import p205.AbstractC7896;
import p205.C7894;
import p205.C7897;

/* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7373 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C7373 f19976;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2031 f19978;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1996 f19979;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7894 f19980;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2031 f19981;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LayoutDirection f19982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f19977 = Float.NaN;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f19983 = Float.NaN;

    public C7373(LayoutDirection layoutDirection, C2031 c2031, C7894 c7894, InterfaceC1996 interfaceC1996) {
        this.f19982 = layoutDirection;
        this.f19981 = c2031;
        this.f19980 = c7894;
        this.f19979 = interfaceC1996;
        this.f19978 = AbstractC2048.m3762(c2031, layoutDirection);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m12530(int i, long j) {
        int iM13312;
        float f = this.f19983;
        float f2 = this.f19977;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = AbstractC7372.f19975;
            long jM13296 = AbstractC7896.m13296(0, 0, 0, 0, 15);
            C2031 c2031 = this.f19978;
            C7894 c7894 = this.f19980;
            float fM3770 = AbstractC2048.m3761(str, c2031, jM13296, c7894, this.f19979, null, 1, 96).m3770();
            float fM37702 = AbstractC2048.m3761(AbstractC7372.f19974, this.f19978, AbstractC7896.m13296(0, 0, 0, 0, 15), c7894, this.f19979, null, 2, 96).m3770() - fM3770;
            this.f19983 = fM3770;
            this.f19977 = fM37702;
            f2 = fM37702;
            f = fM3770;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            iM13312 = iRound >= 0 ? iRound : 0;
            int iM13310 = C7897.m13310(j);
            if (iM13312 > iM13310) {
                iM13312 = iM13310;
            }
        } else {
            iM13312 = C7897.m13312(j);
        }
        return AbstractC7896.m13297(C7897.m13313(j), C7897.m13309(j), iM13312, C7897.m13310(j));
    }
}
