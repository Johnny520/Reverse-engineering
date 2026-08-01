package p135;

import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import androidx.compose.p001ui.unit.LayoutDirection;
import p221.AbstractC8726;
import p221.C8724;
import p221.C8727;

/* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8203 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C8203 f20316;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2865 f20318;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC2830 f20319;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8724 f20320;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2865 f20321;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LayoutDirection f20322;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public float f20317 = Float.NaN;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public float f20323 = Float.NaN;

    public C8203(LayoutDirection layoutDirection, C2865 c2865, C8724 c8724, InterfaceC2830 interfaceC2830) {
        this.f20322 = layoutDirection;
        this.f20321 = c2865;
        this.f20320 = c8724;
        this.f20319 = interfaceC2830;
        this.f20318 = AbstractC2882.m4332(c2865, layoutDirection);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long m13116(int i, long j) {
        int iM13899;
        float f = this.f20323;
        float f2 = this.f20317;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = AbstractC8202.f20315;
            long jM13883 = AbstractC8726.m13883(0, 0, 0, 0, 15);
            C2865 c2865 = this.f20318;
            C8724 c8724 = this.f20320;
            float fM4340 = AbstractC2882.m4331(str, c2865, jM13883, c8724, this.f20319, null, 1, 96).m4340();
            float fM43402 = AbstractC2882.m4331(AbstractC8202.f20314, this.f20318, AbstractC8726.m13883(0, 0, 0, 0, 15), c8724, this.f20319, null, 2, 96).m4340() - fM4340;
            this.f20323 = fM4340;
            this.f20317 = fM43402;
            f2 = fM43402;
            f = fM4340;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            iM13899 = iRound >= 0 ? iRound : 0;
            int iM13897 = C8727.m13897(j);
            if (iM13899 > iM13897) {
                iM13899 = iM13897;
            }
        } else {
            iM13899 = C8727.m13899(j);
        }
        return AbstractC8726.m13884(C8727.m13900(j), C8727.m13896(j), iM13899, C8727.m13897(j));
    }
}
