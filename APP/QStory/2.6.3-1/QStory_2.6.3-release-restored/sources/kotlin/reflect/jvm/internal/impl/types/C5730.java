package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5730 extends AbstractC5748 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f14564;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC5702[] f14565;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5295[] f14566;

    public C5730(InterfaceC5295[] interfaceC5295Arr, AbstractC5702[] abstractC5702Arr, boolean z) {
        interfaceC5295Arr.getClass();
        abstractC5702Arr.getClass();
        this.f14566 = interfaceC5295Arr;
        this.f14565 = abstractC5702Arr;
        this.f14564 = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo10293() {
        return this.f14565.length == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC5702 mo10291(AbstractC5714 abstractC5714) {
        InterfaceC5309 interfaceC5309Mo9770 = abstractC5714.mo10281().mo9770();
        InterfaceC5295 interfaceC5295 = interfaceC5309Mo9770 instanceof InterfaceC5295 ? (InterfaceC5295) interfaceC5309Mo9770 : null;
        if (interfaceC5295 != null) {
            int index = interfaceC5295.getIndex();
            InterfaceC5295[] interfaceC5295Arr = this.f14566;
            if (index < interfaceC5295Arr.length && AbstractC5227.m9466(interfaceC5295Arr[index].mo9560(), interfaceC5295.mo9560())) {
                return this.f14565[index];
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5748
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo10295() {
        return this.f14564;
    }
}
