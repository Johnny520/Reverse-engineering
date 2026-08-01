package androidx.compose.ui.layout;

import net.bytebuddy.asm.Advice;
import p205.C7898;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1654 implements InterfaceC1655 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Enum f4853;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC1698 f4854;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Enum f4855;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4856;

    public /* synthetic */ C1654(InterfaceC1698 interfaceC1698, Enum r2, Enum r3, int i) {
        this.f4856 = i;
        this.f4854 = interfaceC1698;
        this.f4855 = r2;
        this.f4853 = r3;
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final int mo3054(int i) {
        switch (this.f4856) {
        }
        return this.f4854.mo3054(i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1655
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC1724 mo3055(long j) {
        switch (this.f4856) {
            case 0:
                MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight = (MeasuringIntrinsics$IntrinsicWidthHeight) this.f4853;
                MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight2 = MeasuringIntrinsics$IntrinsicWidthHeight.Width;
                MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax = (MeasuringIntrinsics$IntrinsicMinMax) this.f4855;
                int iM13337 = Advice.MethodSizeHandler.UNDEFINED_SIZE;
                InterfaceC1698 interfaceC1698 = this.f4854;
                if (measuringIntrinsics$IntrinsicWidthHeight == measuringIntrinsics$IntrinsicWidthHeight2) {
                    int iMo3058 = measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.Max ? interfaceC1698.mo3058(C7898.m13338(j)) : interfaceC1698.mo3059(C7898.m13338(j));
                    if (C7898.m13334(j)) {
                        iM13337 = C7898.m13338(j);
                    }
                    return new C1705(iMo3058, iM13337, 1);
                }
                int iMo3057 = measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.Max ? interfaceC1698.mo3057(C7898.m13337(j)) : interfaceC1698.mo3054(C7898.m13337(j));
                if (C7898.m13333(j)) {
                    iM13337 = C7898.m13337(j);
                }
                return new C1705(iM13337, iMo3057, 1);
            default:
                IntrinsicWidthHeight intrinsicWidthHeight = (IntrinsicWidthHeight) this.f4853;
                IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.Width;
                IntrinsicMinMax intrinsicMinMax = (IntrinsicMinMax) this.f4855;
                int iM133372 = Advice.MethodSizeHandler.UNDEFINED_SIZE;
                InterfaceC1698 interfaceC16982 = this.f4854;
                if (intrinsicWidthHeight == intrinsicWidthHeight2) {
                    int iMo30582 = intrinsicMinMax == IntrinsicMinMax.Max ? interfaceC16982.mo3058(C7898.m13338(j)) : interfaceC16982.mo3059(C7898.m13338(j));
                    if (C7898.m13334(j)) {
                        iM133372 = C7898.m13338(j);
                    }
                    return new C1705(iMo30582, iM133372, 0);
                }
                int iMo30572 = intrinsicMinMax == IntrinsicMinMax.Max ? interfaceC16982.mo3057(C7898.m13337(j)) : interfaceC16982.mo3054(C7898.m13337(j));
                if (C7898.m13333(j)) {
                    iM133372 = C7898.m13337(j);
                }
                return new C1705(iM133372, iMo30572, 0);
        }
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final Object mo3056() {
        switch (this.f4856) {
        }
        return this.f4854.mo3056();
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo3057(int i) {
        switch (this.f4856) {
        }
        return this.f4854.mo3057(i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int mo3058(int i) {
        switch (this.f4856) {
        }
        return this.f4854.mo3058(i);
    }

    @Override // androidx.compose.ui.layout.InterfaceC1698
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int mo3059(int i) {
        switch (this.f4856) {
        }
        return this.f4854.mo3059(i);
    }
}
