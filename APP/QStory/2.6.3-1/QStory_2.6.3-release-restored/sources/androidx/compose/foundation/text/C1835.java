package androidx.compose.foundation.text;

import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.jvm.internal.AbstractC5227;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.text.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1835 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC2230 f3262 = AbstractC2202.m3034(Boolean.TRUE);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Object f3263;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C2865 f3264;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC2830 f3265;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC8725 f3266;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public LayoutDirection f3267;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public long f3268;

    public C1835(LayoutDirection layoutDirection, InterfaceC8725 interfaceC8725, InterfaceC2830 interfaceC2830, C2865 c2865, Object obj) {
        this.f3267 = layoutDirection;
        this.f3266 = interfaceC8725;
        this.f3265 = interfaceC2830;
        this.f3264 = c2865;
        this.f3263 = obj;
        this.f3268 = AbstractC1834.m2476(this.f3264, this.f3266, this.f3265, AbstractC1834.f3261, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m2477(C1835 c1835, LayoutDirection layoutDirection, InterfaceC8725 interfaceC8725, C2865 c2865, int i) {
        if ((i & 1) != 0) {
            layoutDirection = c1835.f3267;
        }
        if ((i & 2) != 0) {
            interfaceC8725 = c1835.f3266;
        }
        InterfaceC2830 interfaceC2830 = c1835.f3265;
        if ((i & 8) != 0) {
            c2865 = c1835.f3264;
        }
        Object obj = c1835.f3263;
        LayoutDirection layoutDirection2 = c1835.f3267;
        InterfaceC2230 interfaceC2230 = c1835.f3262;
        if (layoutDirection == layoutDirection2 && AbstractC5227.m9466(interfaceC8725, c1835.f3266) && AbstractC5227.m9466(interfaceC2830, c1835.f3265) && AbstractC5227.m9466(c2865, c1835.f3264)) {
            if (AbstractC5227.m9466(obj, c1835.f3263)) {
                return;
            }
            c1835.f3263 = obj;
            ((AbstractC2182) interfaceC2230).setValue(Boolean.TRUE);
            return;
        }
        c1835.f3267 = layoutDirection;
        c1835.f3266 = interfaceC8725;
        c1835.f3265 = interfaceC2830;
        c1835.f3264 = c2865;
        ((AbstractC2182) interfaceC2230).setValue(Boolean.TRUE);
    }
}
