package p056;

import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7072;
import p088.AbstractC7167;
import p088.AbstractC7175;
import p088.C7151;
import p089.InterfaceC7183;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲世兰子苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6778 extends AbstractC7072 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6778 f18220 = new C6778(AbstractC4395.f12971.mo8927(InterfaceC6782.class));

    @Override // p087.AbstractC7072
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7183 mo12046(AbstractC7175 abstractC7175) {
        abstractC7175.getClass();
        C7151 c7151M12402 = AbstractC7167.m12402(abstractC7175);
        return c7151M12402.containsKey("text") ? C6579.Companion.serializer() : c7151M12402.containsKey("blob") ? C6685.Companion.serializer() : C6597.Companion.serializer();
    }
}
