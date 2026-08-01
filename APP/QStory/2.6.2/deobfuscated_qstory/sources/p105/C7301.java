package p105;

import kotlin.reflect.jvm.internal.impl.types.AbstractC4868;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.C4884;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p069.InterfaceC6895;

/* JADX INFO: renamed from: 飘花落叶言世苏楪子哲兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7301 extends AbstractC4868 {
    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC4868
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final AbstractC4869 mo9748(InterfaceC4872 interfaceC4872) {
        interfaceC4872.getClass();
        InterfaceC6895 interfaceC6895 = interfaceC4872 instanceof InterfaceC6895 ? (InterfaceC6895) interfaceC4872 : null;
        if (interfaceC6895 == null) {
            return null;
        }
        if (interfaceC6895.mo9730().mo9750()) {
            return new C4884(interfaceC6895.mo9730().mo9751(), Variance.OUT_VARIANCE);
        }
        return interfaceC6895.mo9730();
    }
}
