package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import p066.AbstractC6870;
import p079.AbstractC6989;
import p103.InterfaceC7272;
import p336.C8791;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4409 implements InterfaceC7272 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4409 f12981 = new C4409();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC6989 m8938(AbstractC6989 abstractC6989) {
        C4686 c4686M12101 = AbstractC6870.m12101(abstractC6989);
        String str = C4410.f12987;
        C4687 c4687M8947 = C4410.m8947(c4686M12101);
        if (c4687M8947 == null) {
            C8791.m14472(abstractC6989, "Given class ", " is not a read-only collection");
            return null;
        }
        AbstractC6989 abstractC6989M12039 = AbstractC4773.m9499(abstractC6989).m12039(c4687M8947);
        abstractC6989M12039.getClass();
        return abstractC6989M12039;
    }

    @Override // p103.InterfaceC7272
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Iterable mo4160(Object obj) {
        InterfaceC5088[] interfaceC5088Arr = C4420.f13019;
        return ((InterfaceC4480) obj).mo9002().mo9030();
    }
}
