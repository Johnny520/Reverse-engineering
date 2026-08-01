package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import p082.AbstractC7699;
import p095.AbstractC7818;
import p119.InterfaceC8101;
import p352.C9620;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5241 implements InterfaceC8101 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C5241 f13326 = new C5241();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC7818 m9497(AbstractC7818 abstractC7818) {
        C5518 c5518M12660 = AbstractC7699.m12660(abstractC7818);
        String str = C5242.f13332;
        C5519 c5519M9506 = C5242.m9506(c5518M12660);
        if (c5519M9506 == null) {
            C9620.m15031(abstractC7818, "Given class ", " is not a read-only collection");
            return null;
        }
        AbstractC7818 abstractC7818M12598 = AbstractC5605.m10058(abstractC7818).m12598(c5519M9506);
        abstractC7818M12598.getClass();
        return abstractC7818M12598;
    }

    @Override // p119.InterfaceC8101
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Iterable mo4720(Object obj) {
        InterfaceC5920[] interfaceC5920Arr = C5252.f13364;
        return ((InterfaceC5312) obj).mo9561().mo9589();
    }
}
