package p056;

import androidx.compose.foundation.C1030;
import io.ktor.util.C4211;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC4396;
import p087.AbstractC7073;
import p088.AbstractC7168;
import p088.AbstractC7176;
import p089.InterfaceC7184;
import p249.InterfaceC8160;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲子世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6791 extends AbstractC7073 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6791 f18230 = new C6791(AbstractC4396.f12975.mo8917(InterfaceC6840.class));

    @Override // p087.AbstractC7073
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7184 mo12074(AbstractC7176 abstractC7176) {
        String strMo12423;
        abstractC7176.getClass();
        Object obj = AbstractC7168.m12429(abstractC7176).get("method");
        InterfaceC7184 interfaceC7184Serializer = null;
        if (obj == null) {
            obj = null;
        }
        AbstractC7176 abstractC71762 = (AbstractC7176) obj;
        if (abstractC71762 == null || (strMo12423 = AbstractC7168.m12428(abstractC71762).mo12423()) == null) {
            AbstractC6602.f17977.mo9058(new C1030(abstractC7176, 27));
            C4211.m8592(abstractC7176, "No method in ");
            return null;
        }
        InterfaceC8160 interfaceC8160 = AbstractC6602.f17977;
        Method$Defined method$Defined = Method$Defined.Ping;
        InterfaceC7184 interfaceC7184Serializer2 = strMo12423.equals(method$Defined.getValue()) ? C6748.Companion.serializer() : strMo12423.equals(Method$Defined.Initialize.getValue()) ? C6714.Companion.serializer() : strMo12423.equals(Method$Defined.CompletionComplete.getValue()) ? C6626.Companion.serializer() : strMo12423.equals(Method$Defined.LoggingSetLevel.getValue()) ? C6803.Companion.serializer() : strMo12423.equals(Method$Defined.PromptsGet.getValue()) ? C6710.Companion.serializer() : strMo12423.equals(Method$Defined.PromptsList.getValue()) ? C6665.Companion.serializer() : strMo12423.equals(Method$Defined.ResourcesList.getValue()) ? C6640.Companion.serializer() : strMo12423.equals(Method$Defined.ResourcesTemplatesList.getValue()) ? C6651.Companion.serializer() : strMo12423.equals(Method$Defined.ResourcesRead.getValue()) ? C6832.Companion.serializer() : strMo12423.equals(Method$Defined.ResourcesSubscribe.getValue()) ? C6590.Companion.serializer() : strMo12423.equals(Method$Defined.ResourcesUnsubscribe.getValue()) ? C6594.Companion.serializer() : strMo12423.equals(Method$Defined.ToolsCall.getValue()) ? C6683.Companion.serializer() : strMo12423.equals(Method$Defined.ToolsList.getValue()) ? C6641.Companion.serializer() : null;
        if (interfaceC7184Serializer2 != null) {
            return interfaceC7184Serializer2;
        }
        if (strMo12423.equals(method$Defined.getValue())) {
            interfaceC7184Serializer = C6748.Companion.serializer();
        } else if (strMo12423.equals(Method$Defined.SamplingCreateMessage.getValue())) {
            interfaceC7184Serializer = C6619.Companion.serializer();
        } else if (strMo12423.equals(Method$Defined.RootsList.getValue())) {
            interfaceC7184Serializer = C6654.Companion.serializer();
        }
        return interfaceC7184Serializer == null ? C6608.Companion.serializer() : interfaceC7184Serializer;
    }
}
