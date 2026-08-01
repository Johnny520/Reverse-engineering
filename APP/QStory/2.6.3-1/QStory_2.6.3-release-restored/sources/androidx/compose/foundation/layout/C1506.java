package androidx.compose.foundation.layout;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.layout.InterfaceC2488;
import androidx.compose.p001ui.layout.InterfaceC2490;
import androidx.compose.p001ui.layout.InterfaceC2492;
import androidx.compose.p001ui.node.InterfaceC2608;
import kotlin.collections.AbstractC5171;
import p196.AbstractC8583;
import p221.AbstractC8726;
import p221.C8722;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1506 extends AbstractC2961 implements InterfaceC2608 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public InterfaceC1505 f2191;

    @Override // androidx.compose.p001ui.node.InterfaceC2608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC2492 mo1662(InterfaceC2488 interfaceC2488, InterfaceC2490 interfaceC2490, long j) {
        float fMo2023 = this.f2191.mo2023(interfaceC2488.getLayoutDirection());
        float fMo2021 = this.f2191.mo2021();
        float fMo2022 = this.f2191.mo2022(interfaceC2488.getLayoutDirection());
        float fMo2024 = this.f2191.mo2024();
        int i = 1;
        if (!((C8722.m13878(fMo2023, 0.0f) >= 0) & (C8722.m13878(fMo2021, 0.0f) >= 0) & (C8722.m13878(fMo2022, 0.0f) >= 0) & (C8722.m13878(fMo2024, 0.0f) >= 0))) {
            AbstractC8583.m13670("Padding must be non-negative");
        }
        int iMo1903 = interfaceC2488.mo1903(fMo2023);
        int iMo19032 = interfaceC2488.mo1903(fMo2022) + iMo1903;
        int iMo19033 = interfaceC2488.mo1903(fMo2021);
        int iMo19034 = interfaceC2488.mo1903(fMo2024) + iMo19033;
        AbstractC2559 abstractC2559Mo3615 = interfaceC2490.mo3615(AbstractC8726.m13888(-iMo19032, -iMo19034, j));
        return interfaceC2488.mo2055(AbstractC8726.m13886(abstractC2559Mo3615.f5344 + iMo19032, j), AbstractC8726.m13879(abstractC2559Mo3615.f5342 + iMo19034, j), AbstractC5171.m9335(), new C1514(abstractC2559Mo3615, iMo1903, iMo19033, i));
    }
}
