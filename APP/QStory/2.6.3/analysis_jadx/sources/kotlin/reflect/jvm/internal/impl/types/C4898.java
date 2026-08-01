package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4898 extends AbstractC4916 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f14219;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4870[] f14220;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4463[] f14221;

    public C4898(InterfaceC4463[] interfaceC4463Arr, AbstractC4870[] abstractC4870Arr, boolean z) {
        interfaceC4463Arr.getClass();
        abstractC4870Arr.getClass();
        this.f14221 = interfaceC4463Arr;
        this.f14220 = abstractC4870Arr;
        this.f14219 = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo9734() {
        return this.f14220.length == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC4870 mo9732(AbstractC4882 abstractC4882) {
        InterfaceC4477 interfaceC4477Mo9211 = abstractC4882.mo9722().mo9211();
        InterfaceC4463 interfaceC4463 = interfaceC4477Mo9211 instanceof InterfaceC4463 ? (InterfaceC4463) interfaceC4477Mo9211 : null;
        if (interfaceC4463 != null) {
            int index = interfaceC4463.getIndex();
            InterfaceC4463[] interfaceC4463Arr = this.f14221;
            if (index < interfaceC4463Arr.length && AbstractC4395.m8907(interfaceC4463Arr[index].mo9001(), interfaceC4463.mo9001())) {
                return this.f14220[index];
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4916
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo9736() {
        return this.f14219;
    }
}
