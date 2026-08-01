package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4897 extends AbstractC4915 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f14215;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4869[] f14216;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4462[] f14217;

    public C4897(InterfaceC4462[] interfaceC4462Arr, AbstractC4869[] abstractC4869Arr, boolean z) {
        interfaceC4462Arr.getClass();
        abstractC4869Arr.getClass();
        this.f14217 = interfaceC4462Arr;
        this.f14216 = abstractC4869Arr;
        this.f14215 = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo9744() {
        return this.f14216.length == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC4869 mo9742(AbstractC4881 abstractC4881) {
        InterfaceC4476 interfaceC4476Mo9221 = abstractC4881.mo9732().mo9221();
        InterfaceC4462 interfaceC4462 = interfaceC4476Mo9221 instanceof InterfaceC4462 ? (InterfaceC4462) interfaceC4476Mo9221 : null;
        if (interfaceC4462 != null) {
            int index = interfaceC4462.getIndex();
            InterfaceC4462[] interfaceC4462Arr = this.f14217;
            if (index < interfaceC4462Arr.length && AbstractC4394.m8917(interfaceC4462Arr[index].mo9011(), interfaceC4462.mo9011())) {
                return this.f14216[index];
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4915
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo9746() {
        return this.f14215;
    }
}
