package androidx.compose.ui.layout;

import net.bytebuddy.asm.Advice;
import p205.C7897;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1654 implements InterfaceC1655 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Enum f4852;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1698 f4853;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Enum f4854;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4855;

    public /* synthetic */ C1654(InterfaceC1698 interfaceC1698, Enum r2, Enum r3, int i) {
        this.f4855 = i;
        this.f4853 = interfaceC1698;
        this.f4854 = r2;
        this.f4852 = r3;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final int mo3044(int i) {
        switch (this.f4855) {
        }
        return this.f4853.mo3044(i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1655
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC1724 mo3045(long j) {
        switch (this.f4855) {
            case 0:
                MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight = (MeasuringIntrinsics$IntrinsicWidthHeight) this.f4852;
                MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight2 = MeasuringIntrinsics$IntrinsicWidthHeight.Width;
                MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax = (MeasuringIntrinsics$IntrinsicMinMax) this.f4854;
                int iM13309 = Advice.MethodSizeHandler.UNDEFINED_SIZE;
                InterfaceC1698 interfaceC1698 = this.f4853;
                if (measuringIntrinsics$IntrinsicWidthHeight == measuringIntrinsics$IntrinsicWidthHeight2) {
                    int iMo3048 = measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.Max ? interfaceC1698.mo3048(C7897.m13310(j)) : interfaceC1698.mo3049(C7897.m13310(j));
                    if (C7897.m13306(j)) {
                        iM13309 = C7897.m13310(j);
                    }
                    return new C1705(iMo3048, iM13309, 1);
                }
                int iMo3047 = measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.Max ? interfaceC1698.mo3047(C7897.m13309(j)) : interfaceC1698.mo3044(C7897.m13309(j));
                if (C7897.m13305(j)) {
                    iM13309 = C7897.m13309(j);
                }
                return new C1705(iM13309, iMo3047, 1);
            default:
                IntrinsicWidthHeight intrinsicWidthHeight = (IntrinsicWidthHeight) this.f4852;
                IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.Width;
                IntrinsicMinMax intrinsicMinMax = (IntrinsicMinMax) this.f4854;
                int iM133092 = Advice.MethodSizeHandler.UNDEFINED_SIZE;
                InterfaceC1698 interfaceC16982 = this.f4853;
                if (intrinsicWidthHeight == intrinsicWidthHeight2) {
                    int iMo30482 = intrinsicMinMax == IntrinsicMinMax.Max ? interfaceC16982.mo3048(C7897.m13310(j)) : interfaceC16982.mo3049(C7897.m13310(j));
                    if (C7897.m13306(j)) {
                        iM133092 = C7897.m13310(j);
                    }
                    return new C1705(iMo30482, iM133092, 0);
                }
                int iMo30472 = intrinsicMinMax == IntrinsicMinMax.Max ? interfaceC16982.mo3047(C7897.m13309(j)) : interfaceC16982.mo3044(C7897.m13309(j));
                if (C7897.m13305(j)) {
                    iM133092 = C7897.m13309(j);
                }
                return new C1705(iM133092, iMo30472, 0);
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final Object mo3046() {
        switch (this.f4855) {
        }
        return this.f4853.mo3046();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo3047(int i) {
        switch (this.f4855) {
        }
        return this.f4853.mo3047(i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int mo3048(int i) {
        switch (this.f4855) {
        }
        return this.f4853.mo3048(i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int mo3049(int i) {
        switch (this.f4855) {
        }
        return this.f4853.mo3049(i);
    }
}
