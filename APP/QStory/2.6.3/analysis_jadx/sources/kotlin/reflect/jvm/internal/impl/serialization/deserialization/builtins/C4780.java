package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.C4726;
import kotlin.text.AbstractC5139;
import net.bytebuddy.pool.TypePool;
import p074.AbstractC6945;
import p099.AbstractC7242;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4780 extends AbstractC7242 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C4780 f13922;

    static {
        C4726 c4726 = new C4726();
        AbstractC6945.m12237(c4726);
        C4725 c4725 = AbstractC6945.f18531;
        c4725.getClass();
        C4725 c47252 = AbstractC6945.f18529;
        c47252.getClass();
        C4725 c47253 = AbstractC6945.f18530;
        c47253.getClass();
        C4725 c47254 = AbstractC6945.f18528;
        c47254.getClass();
        C4725 c47255 = AbstractC6945.f18527;
        c47255.getClass();
        C4725 c47256 = AbstractC6945.f18526;
        c47256.getClass();
        C4725 c47257 = AbstractC6945.f18533;
        c47257.getClass();
        C4725 c47258 = AbstractC6945.f18536;
        c47258.getClass();
        C4725 c47259 = AbstractC6945.f18532;
        c47259.getClass();
        C4725 c472510 = AbstractC6945.f18537;
        c472510.getClass();
        C4725 c472511 = AbstractC6945.f18534;
        c472511.getClass();
        C4725 c472512 = AbstractC6945.f18535;
        c472512.getClass();
        f13922 = new C4780(c4726, c4725, c47252, c47253, c47254, c47255, c47256, c47257, c47258, c47259, c472510, c472511, c472512);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m9511(C4687 c4687) {
        String strM9335;
        c4687.getClass();
        StringBuilder sb = new StringBuilder();
        C4686 c4686 = c4687.f13696;
        sb.append(AbstractC5139.m10129(c4686.f13693, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'));
        sb.append('/');
        if (c4686.m9314()) {
            strM9335 = "default-package";
        } else {
            strM9335 = c4686.m9318().m9335();
            strM9335.getClass();
        }
        sb.append(strM9335.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
