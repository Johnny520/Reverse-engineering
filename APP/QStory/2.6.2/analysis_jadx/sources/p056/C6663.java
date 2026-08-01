package p056;

import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7072;
import p088.AbstractC7167;
import p088.AbstractC7175;
import p088.C7151;
import p089.InterfaceC7183;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6663 extends AbstractC7072 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6663 f18068 = new C6663(AbstractC4395.f12971.mo8927(InterfaceC6660.class));

    @Override // p087.AbstractC7072
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7183 mo12046(AbstractC7175 abstractC7175) {
        abstractC7175.getClass();
        C7151 c7151M12402 = AbstractC7167.m12402(abstractC7175);
        return c7151M12402.containsKey("message") ? C6673.Companion.serializer() : !c7151M12402.containsKey("method") ? C6678.Companion.serializer() : c7151M12402.containsKey("id") ? C6677.Companion.serializer() : C6659.Companion.serializer();
    }
}
