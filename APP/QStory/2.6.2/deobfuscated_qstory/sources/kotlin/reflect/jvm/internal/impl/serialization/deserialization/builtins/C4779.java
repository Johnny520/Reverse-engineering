package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.protobuf.C4724;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.text.AbstractC5138;
import net.bytebuddy.pool.TypePool;
import p074.AbstractC6944;
import p099.AbstractC7241;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4779 extends AbstractC7241 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C4779 f13918;

    static {
        C4725 c4725 = new C4725();
        AbstractC6944.m12209(c4725);
        C4724 c4724 = AbstractC6944.f18536;
        c4724.getClass();
        C4724 c47242 = AbstractC6944.f18534;
        c47242.getClass();
        C4724 c47243 = AbstractC6944.f18535;
        c47243.getClass();
        C4724 c47244 = AbstractC6944.f18533;
        c47244.getClass();
        C4724 c47245 = AbstractC6944.f18532;
        c47245.getClass();
        C4724 c47246 = AbstractC6944.f18531;
        c47246.getClass();
        C4724 c47247 = AbstractC6944.f18538;
        c47247.getClass();
        C4724 c47248 = AbstractC6944.f18541;
        c47248.getClass();
        C4724 c47249 = AbstractC6944.f18537;
        c47249.getClass();
        C4724 c472410 = AbstractC6944.f18542;
        c472410.getClass();
        C4724 c472411 = AbstractC6944.f18539;
        c472411.getClass();
        C4724 c472412 = AbstractC6944.f18540;
        c472412.getClass();
        f13918 = new C4779(c4725, c4724, c47242, c47243, c47244, c47245, c47246, c47247, c47248, c47249, c472410, c472411, c472412);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m9521(C4686 c4686) {
        String strM9345;
        c4686.getClass();
        StringBuilder sb = new StringBuilder();
        C4685 c4685 = c4686.f13692;
        sb.append(AbstractC5138.m10129(c4685.f13689, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'));
        sb.append('/');
        if (c4685.m9324()) {
            strM9345 = "default-package";
        } else {
            strM9345 = c4685.m9328().m9345();
            strM9345.getClass();
        }
        sb.append(strM9345.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
