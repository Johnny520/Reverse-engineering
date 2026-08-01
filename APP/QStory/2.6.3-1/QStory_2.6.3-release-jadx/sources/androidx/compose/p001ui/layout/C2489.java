package androidx.compose.p001ui.layout;

import net.bytebuddy.asm.Advice;
import p221.C8727;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2489 implements InterfaceC2490 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Enum f5198;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC2533 f5199;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Enum f5200;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5201;

    public /* synthetic */ C2489(InterfaceC2533 interfaceC2533, Enum r2, Enum r3, int i) {
        this.f5201 = i;
        this.f5199 = interfaceC2533;
        this.f5200 = r2;
        this.f5198 = r3;
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final int mo3614(int i) {
        switch (this.f5201) {
        }
        return this.f5199.mo3614(i);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2490
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final AbstractC2559 mo3615(long j) {
        switch (this.f5201) {
            case 0:
                MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight = (MeasuringIntrinsics$IntrinsicWidthHeight) this.f5198;
                MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight2 = MeasuringIntrinsics$IntrinsicWidthHeight.Width;
                MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax = (MeasuringIntrinsics$IntrinsicMinMax) this.f5200;
                int iM13896 = Advice.MethodSizeHandler.UNDEFINED_SIZE;
                InterfaceC2533 interfaceC2533 = this.f5199;
                if (measuringIntrinsics$IntrinsicWidthHeight == measuringIntrinsics$IntrinsicWidthHeight2) {
                    int iMo3618 = measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.Max ? interfaceC2533.mo3618(C8727.m13897(j)) : interfaceC2533.mo3619(C8727.m13897(j));
                    if (C8727.m13893(j)) {
                        iM13896 = C8727.m13897(j);
                    }
                    return new C2540(iMo3618, iM13896, 1);
                }
                int iMo3617 = measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.Max ? interfaceC2533.mo3617(C8727.m13896(j)) : interfaceC2533.mo3614(C8727.m13896(j));
                if (C8727.m13892(j)) {
                    iM13896 = C8727.m13896(j);
                }
                return new C2540(iM13896, iMo3617, 1);
            default:
                IntrinsicWidthHeight intrinsicWidthHeight = (IntrinsicWidthHeight) this.f5198;
                IntrinsicWidthHeight intrinsicWidthHeight2 = IntrinsicWidthHeight.Width;
                IntrinsicMinMax intrinsicMinMax = (IntrinsicMinMax) this.f5200;
                int iM138962 = Advice.MethodSizeHandler.UNDEFINED_SIZE;
                InterfaceC2533 interfaceC25332 = this.f5199;
                if (intrinsicWidthHeight == intrinsicWidthHeight2) {
                    int iMo36182 = intrinsicMinMax == IntrinsicMinMax.Max ? interfaceC25332.mo3618(C8727.m13897(j)) : interfaceC25332.mo3619(C8727.m13897(j));
                    if (C8727.m13893(j)) {
                        iM138962 = C8727.m13897(j);
                    }
                    return new C2540(iMo36182, iM138962, 0);
                }
                int iMo36172 = intrinsicMinMax == IntrinsicMinMax.Max ? interfaceC25332.mo3617(C8727.m13896(j)) : interfaceC25332.mo3614(C8727.m13896(j));
                if (C8727.m13892(j)) {
                    iM138962 = C8727.m13896(j);
                }
                return new C2540(iM138962, iMo36172, 0);
        }
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final Object mo3616() {
        switch (this.f5201) {
        }
        return this.f5199.mo3616();
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo3617(int i) {
        switch (this.f5201) {
        }
        return this.f5199.mo3617(i);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int mo3618(int i) {
        switch (this.f5201) {
        }
        return this.f5199.mo3618(i);
    }

    @Override // androidx.compose.p001ui.layout.InterfaceC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int mo3619(int i) {
        switch (this.f5201) {
        }
        return this.f5199.mo3619(i);
    }
}
