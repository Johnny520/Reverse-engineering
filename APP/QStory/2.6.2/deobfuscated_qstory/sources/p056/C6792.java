package p056;

import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7072;
import p088.AbstractC7167;
import p088.AbstractC7175;
import p088.C7151;
import p089.InterfaceC7183;
import p249.InterfaceC8159;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲子兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6792 extends AbstractC7072 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6792 f18238 = new C6792(AbstractC4395.f12971.mo8927(InterfaceC6795.class));

    @Override // p087.AbstractC7072
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7183 mo12046(AbstractC7175 abstractC7175) {
        abstractC7175.getClass();
        InterfaceC8159 interfaceC8159 = AbstractC6601.f17982;
        C7151 c7151M12402 = AbstractC7167.m12402(abstractC7175);
        InterfaceC7183 interfaceC7183Serializer = null;
        InterfaceC7183 interfaceC7183Serializer2 = c7151M12402.containsKey("model") ? C6616.Companion.serializer() : c7151M12402.containsKey("roots") ? C6654.Companion.serializer() : null;
        if (interfaceC7183Serializer2 != null) {
            return interfaceC7183Serializer2;
        }
        C7151 c7151M124022 = AbstractC7167.m12402(abstractC7175);
        if (c7151M124022.containsKey("tools")) {
            interfaceC7183Serializer = C6644.Companion.serializer();
        } else if (c7151M124022.containsKey("resources")) {
            interfaceC7183Serializer = C6635.Companion.serializer();
        } else if (c7151M124022.containsKey("resourceTemplates")) {
            interfaceC7183Serializer = C6649.Companion.serializer();
        } else if (c7151M124022.containsKey("prompts")) {
            interfaceC7183Serializer = C6668.Companion.serializer();
        } else if (c7151M124022.containsKey("capabilities")) {
            interfaceC7183Serializer = C6714.Companion.serializer();
        } else if (c7151M124022.containsKey("description")) {
            interfaceC7183Serializer = C6706.Companion.serializer();
        } else if (c7151M124022.containsKey("completion")) {
            interfaceC7183Serializer = C6631.Companion.serializer();
        } else if (c7151M124022.containsKey("toolResult")) {
            interfaceC7183Serializer = C6692.Companion.serializer();
        } else if (c7151M124022.containsKey("contents")) {
            interfaceC7183Serializer = C6828.Companion.serializer();
        } else if (c7151M124022.containsKey("content")) {
            interfaceC7183Serializer = C6704.Companion.serializer();
        }
        return interfaceC7183Serializer == null ? C6610.Companion.serializer() : interfaceC7183Serializer;
    }
}
