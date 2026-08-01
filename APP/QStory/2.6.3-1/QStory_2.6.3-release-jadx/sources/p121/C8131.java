package p121;

import kotlin.reflect.jvm.internal.impl.types.AbstractC5701;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.C5717;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p085.InterfaceC7725;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子哲兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8131 extends AbstractC5701 {
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC5701
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC5702 mo10297(InterfaceC5705 interfaceC5705) {
        interfaceC5705.getClass();
        InterfaceC7725 interfaceC7725 = interfaceC5705 instanceof InterfaceC7725 ? (InterfaceC7725) interfaceC5705 : null;
        if (interfaceC7725 == null) {
            return null;
        }
        if (interfaceC7725.mo10279().mo10299()) {
            return new C5717(interfaceC7725.mo10279().mo10300(), Variance.OUT_VARIANCE);
        }
        return interfaceC7725.mo10279();
    }
}
