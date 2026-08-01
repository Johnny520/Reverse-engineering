package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import p066.AbstractC6869;
import p079.AbstractC6988;
import p103.InterfaceC7271;
import p330.C8796;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4408 implements InterfaceC7271 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4408 f12977 = new C4408();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC6988 m8948(AbstractC6988 abstractC6988) {
        C4685 c4685M12073 = AbstractC6869.m12073(abstractC6988);
        String str = C4409.f12983;
        C4686 c4686M8957 = C4409.m8957(c4685M12073);
        if (c4686M8957 == null) {
            C8796.m14448(abstractC6988, "Given class ", " is not a read-only collection");
            return null;
        }
        AbstractC6988 abstractC6988M11996 = AbstractC4772.m9509(abstractC6988).m11996(c4686M8957);
        abstractC6988M11996.getClass();
        return abstractC6988M11996;
    }

    @Override // p103.InterfaceC7271
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public Iterable mo4150(Object obj) {
        InterfaceC5087[] interfaceC5087Arr = C4419.f13015;
        return ((InterfaceC4479) obj).mo9012().mo9040();
    }
}
