package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.protobuf.C5557;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.text.AbstractC5971;
import net.bytebuddy.pool.TypePool;
import p090.AbstractC7774;
import p115.AbstractC8071;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5612 extends AbstractC8071 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C5612 f14267;

    static {
        C5558 c5558 = new C5558();
        AbstractC7774.m12796(c5558);
        C5557 c5557 = AbstractC7774.f18876;
        c5557.getClass();
        C5557 c55572 = AbstractC7774.f18874;
        c55572.getClass();
        C5557 c55573 = AbstractC7774.f18875;
        c55573.getClass();
        C5557 c55574 = AbstractC7774.f18873;
        c55574.getClass();
        C5557 c55575 = AbstractC7774.f18872;
        c55575.getClass();
        C5557 c55576 = AbstractC7774.f18871;
        c55576.getClass();
        C5557 c55577 = AbstractC7774.f18878;
        c55577.getClass();
        C5557 c55578 = AbstractC7774.f18881;
        c55578.getClass();
        C5557 c55579 = AbstractC7774.f18877;
        c55579.getClass();
        C5557 c555710 = AbstractC7774.f18882;
        c555710.getClass();
        C5557 c555711 = AbstractC7774.f18879;
        c555711.getClass();
        C5557 c555712 = AbstractC7774.f18880;
        c555712.getClass();
        f14267 = new C5612(c5558, c5557, c55572, c55573, c55574, c55575, c55576, c55577, c55578, c55579, c555710, c555711, c555712);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m10070(C5519 c5519) {
        String strM9894;
        c5519.getClass();
        StringBuilder sb = new StringBuilder();
        C5518 c5518 = c5519.f14041;
        sb.append(AbstractC5971.m10688(c5518.f14038, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'));
        sb.append('/');
        if (c5518.m9873()) {
            strM9894 = "default-package";
        } else {
            strM9894 = c5518.m9877().m9894();
            strM9894.getClass();
        }
        sb.append(strM9894.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
