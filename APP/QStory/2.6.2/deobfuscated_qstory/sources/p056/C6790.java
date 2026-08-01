package p056;

import androidx.compose.foundation.C1030;
import io.ktor.util.C4210;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7072;
import p088.AbstractC7167;
import p088.AbstractC7175;
import p089.InterfaceC7183;
import p249.InterfaceC8159;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲子世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6790 extends AbstractC7072 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6790 f18235 = new C6790(AbstractC4395.f12971.mo8927(InterfaceC6839.class));

    @Override // p087.AbstractC7072
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7183 mo12046(AbstractC7175 abstractC7175) {
        String strMo12396;
        abstractC7175.getClass();
        Object obj = AbstractC7167.m12402(abstractC7175).get("method");
        InterfaceC7183 interfaceC7183Serializer = null;
        if (obj == null) {
            obj = null;
        }
        AbstractC7175 abstractC71752 = (AbstractC7175) obj;
        if (abstractC71752 == null || (strMo12396 = AbstractC7167.m12401(abstractC71752).mo12396()) == null) {
            AbstractC6601.f17982.mo9068(new C1030(abstractC7175, 27));
            C4210.m8602(abstractC7175, "No method in ");
            return null;
        }
        InterfaceC8159 interfaceC8159 = AbstractC6601.f17982;
        Method$Defined method$Defined = Method$Defined.Ping;
        InterfaceC7183 interfaceC7183Serializer2 = strMo12396.equals(method$Defined.getValue()) ? C6747.Companion.serializer() : strMo12396.equals(Method$Defined.Initialize.getValue()) ? C6713.Companion.serializer() : strMo12396.equals(Method$Defined.CompletionComplete.getValue()) ? C6625.Companion.serializer() : strMo12396.equals(Method$Defined.LoggingSetLevel.getValue()) ? C6802.Companion.serializer() : strMo12396.equals(Method$Defined.PromptsGet.getValue()) ? C6709.Companion.serializer() : strMo12396.equals(Method$Defined.PromptsList.getValue()) ? C6664.Companion.serializer() : strMo12396.equals(Method$Defined.ResourcesList.getValue()) ? C6639.Companion.serializer() : strMo12396.equals(Method$Defined.ResourcesTemplatesList.getValue()) ? C6650.Companion.serializer() : strMo12396.equals(Method$Defined.ResourcesRead.getValue()) ? C6831.Companion.serializer() : strMo12396.equals(Method$Defined.ResourcesSubscribe.getValue()) ? C6589.Companion.serializer() : strMo12396.equals(Method$Defined.ResourcesUnsubscribe.getValue()) ? C6593.Companion.serializer() : strMo12396.equals(Method$Defined.ToolsCall.getValue()) ? C6682.Companion.serializer() : strMo12396.equals(Method$Defined.ToolsList.getValue()) ? C6640.Companion.serializer() : null;
        if (interfaceC7183Serializer2 != null) {
            return interfaceC7183Serializer2;
        }
        if (strMo12396.equals(method$Defined.getValue())) {
            interfaceC7183Serializer = C6747.Companion.serializer();
        } else if (strMo12396.equals(Method$Defined.SamplingCreateMessage.getValue())) {
            interfaceC7183Serializer = C6618.Companion.serializer();
        } else if (strMo12396.equals(Method$Defined.RootsList.getValue())) {
            interfaceC7183Serializer = C6653.Companion.serializer();
        }
        return interfaceC7183Serializer == null ? C6607.Companion.serializer() : interfaceC7183Serializer;
    }
}
