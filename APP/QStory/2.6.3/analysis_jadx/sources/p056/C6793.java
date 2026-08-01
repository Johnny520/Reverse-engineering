package p056;

import kotlin.jvm.internal.AbstractC4396;
import p087.AbstractC7073;
import p088.AbstractC7168;
import p088.AbstractC7176;
import p088.C7152;
import p089.InterfaceC7184;
import p249.InterfaceC8160;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲子兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6793 extends AbstractC7073 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6793 f18233 = new C6793(AbstractC4396.f12975.mo8917(InterfaceC6796.class));

    @Override // p087.AbstractC7073
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7184 mo12074(AbstractC7176 abstractC7176) {
        abstractC7176.getClass();
        InterfaceC8160 interfaceC8160 = AbstractC6602.f17977;
        C7152 c7152M12429 = AbstractC7168.m12429(abstractC7176);
        InterfaceC7184 interfaceC7184Serializer = null;
        InterfaceC7184 interfaceC7184Serializer2 = c7152M12429.containsKey("model") ? C6617.Companion.serializer() : c7152M12429.containsKey("roots") ? C6655.Companion.serializer() : null;
        if (interfaceC7184Serializer2 != null) {
            return interfaceC7184Serializer2;
        }
        C7152 c7152M124292 = AbstractC7168.m12429(abstractC7176);
        if (c7152M124292.containsKey("tools")) {
            interfaceC7184Serializer = C6645.Companion.serializer();
        } else if (c7152M124292.containsKey("resources")) {
            interfaceC7184Serializer = C6636.Companion.serializer();
        } else if (c7152M124292.containsKey("resourceTemplates")) {
            interfaceC7184Serializer = C6650.Companion.serializer();
        } else if (c7152M124292.containsKey("prompts")) {
            interfaceC7184Serializer = C6669.Companion.serializer();
        } else if (c7152M124292.containsKey("capabilities")) {
            interfaceC7184Serializer = C6715.Companion.serializer();
        } else if (c7152M124292.containsKey("description")) {
            interfaceC7184Serializer = C6707.Companion.serializer();
        } else if (c7152M124292.containsKey("completion")) {
            interfaceC7184Serializer = C6632.Companion.serializer();
        } else if (c7152M124292.containsKey("toolResult")) {
            interfaceC7184Serializer = C6693.Companion.serializer();
        } else if (c7152M124292.containsKey("contents")) {
            interfaceC7184Serializer = C6829.Companion.serializer();
        } else if (c7152M124292.containsKey("content")) {
            interfaceC7184Serializer = C6705.Companion.serializer();
        }
        return interfaceC7184Serializer == null ? C6611.Companion.serializer() : interfaceC7184Serializer;
    }
}
