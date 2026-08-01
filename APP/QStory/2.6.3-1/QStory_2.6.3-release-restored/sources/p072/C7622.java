package p072;

import kotlin.jvm.internal.AbstractC5228;
import p103.AbstractC7902;
import p104.AbstractC7997;
import p104.AbstractC8005;
import p104.C7981;
import p105.InterfaceC8013;
import p265.InterfaceC8989;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲子兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7622 extends AbstractC7902 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7622 f18578 = new C7622(AbstractC5228.f13320.mo9476(InterfaceC7625.class));

    @Override // p103.AbstractC7902
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8013 mo12633(AbstractC8005 abstractC8005) {
        abstractC8005.getClass();
        InterfaceC8989 interfaceC8989 = AbstractC7431.f18322;
        C7981 c7981M12988 = AbstractC7997.m12988(abstractC8005);
        InterfaceC8013 interfaceC8013Serializer = null;
        InterfaceC8013 interfaceC8013Serializer2 = c7981M12988.containsKey("model") ? C7446.Companion.serializer() : c7981M12988.containsKey("roots") ? C7484.Companion.serializer() : null;
        if (interfaceC8013Serializer2 != null) {
            return interfaceC8013Serializer2;
        }
        C7981 c7981M129882 = AbstractC7997.m12988(abstractC8005);
        if (c7981M129882.containsKey("tools")) {
            interfaceC8013Serializer = C7474.Companion.serializer();
        } else if (c7981M129882.containsKey("resources")) {
            interfaceC8013Serializer = C7465.Companion.serializer();
        } else if (c7981M129882.containsKey("resourceTemplates")) {
            interfaceC8013Serializer = C7479.Companion.serializer();
        } else if (c7981M129882.containsKey("prompts")) {
            interfaceC8013Serializer = C7498.Companion.serializer();
        } else if (c7981M129882.containsKey("capabilities")) {
            interfaceC8013Serializer = C7544.Companion.serializer();
        } else if (c7981M129882.containsKey("description")) {
            interfaceC8013Serializer = C7536.Companion.serializer();
        } else if (c7981M129882.containsKey("completion")) {
            interfaceC8013Serializer = C7461.Companion.serializer();
        } else if (c7981M129882.containsKey("toolResult")) {
            interfaceC8013Serializer = C7522.Companion.serializer();
        } else if (c7981M129882.containsKey("contents")) {
            interfaceC8013Serializer = C7658.Companion.serializer();
        } else if (c7981M129882.containsKey("content")) {
            interfaceC8013Serializer = C7534.Companion.serializer();
        }
        return interfaceC8013Serializer == null ? C7440.Companion.serializer() : interfaceC8013Serializer;
    }
}
