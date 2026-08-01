package p105;

import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.C4885;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p069.InterfaceC6896;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子哲兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7302 extends AbstractC4869 {
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4869
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC4870 mo9738(InterfaceC4873 interfaceC4873) {
        interfaceC4873.getClass();
        InterfaceC6896 interfaceC6896 = interfaceC4873 instanceof InterfaceC6896 ? (InterfaceC6896) interfaceC4873 : null;
        if (interfaceC6896 == null) {
            return null;
        }
        if (interfaceC6896.mo9720().mo9740()) {
            return new C4885(interfaceC6896.mo9720().mo9741(), Variance.OUT_VARIANCE);
        }
        return interfaceC6896.mo9720();
    }
}
