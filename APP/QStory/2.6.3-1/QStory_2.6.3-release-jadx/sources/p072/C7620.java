package p072;

import androidx.compose.foundation.C1868;
import io.ktor.util.C5043;
import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.jvm.internal.AbstractC5228;
import p103.AbstractC7902;
import p104.AbstractC7997;
import p104.AbstractC8005;
import p105.InterfaceC8013;
import p265.InterfaceC8989;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪哲子世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7620 extends AbstractC7902 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7620 f18575 = new C7620(AbstractC5228.f13320.mo9476(InterfaceC7669.class));

    @Override // p103.AbstractC7902
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8013 mo12633(AbstractC8005 abstractC8005) {
        String strMo12982;
        abstractC8005.getClass();
        Object obj = AbstractC7997.m12988(abstractC8005).get("method");
        InterfaceC8013 interfaceC8013Serializer = null;
        if (obj == null) {
            obj = null;
        }
        AbstractC8005 abstractC80052 = (AbstractC8005) obj;
        if (abstractC80052 == null || (strMo12982 = AbstractC7997.m12987(abstractC80052).mo12982()) == null) {
            AbstractC7431.f18322.mo9617(new C1868(abstractC8005, 27));
            C5043.m9151(abstractC8005, "No method in ");
            return null;
        }
        InterfaceC8989 interfaceC8989 = AbstractC7431.f18322;
        Method$Defined method$Defined = Method$Defined.Ping;
        InterfaceC8013 interfaceC8013Serializer2 = strMo12982.equals(method$Defined.getValue()) ? C7577.Companion.serializer() : strMo12982.equals(Method$Defined.Initialize.getValue()) ? C7543.Companion.serializer() : strMo12982.equals(Method$Defined.CompletionComplete.getValue()) ? C7455.Companion.serializer() : strMo12982.equals(Method$Defined.LoggingSetLevel.getValue()) ? C7632.Companion.serializer() : strMo12982.equals(Method$Defined.PromptsGet.getValue()) ? C7539.Companion.serializer() : strMo12982.equals(Method$Defined.PromptsList.getValue()) ? C7494.Companion.serializer() : strMo12982.equals(Method$Defined.ResourcesList.getValue()) ? C7469.Companion.serializer() : strMo12982.equals(Method$Defined.ResourcesTemplatesList.getValue()) ? C7480.Companion.serializer() : strMo12982.equals(Method$Defined.ResourcesRead.getValue()) ? C7661.Companion.serializer() : strMo12982.equals(Method$Defined.ResourcesSubscribe.getValue()) ? C7419.Companion.serializer() : strMo12982.equals(Method$Defined.ResourcesUnsubscribe.getValue()) ? C7423.Companion.serializer() : strMo12982.equals(Method$Defined.ToolsCall.getValue()) ? C7512.Companion.serializer() : strMo12982.equals(Method$Defined.ToolsList.getValue()) ? C7470.Companion.serializer() : null;
        if (interfaceC8013Serializer2 != null) {
            return interfaceC8013Serializer2;
        }
        if (strMo12982.equals(method$Defined.getValue())) {
            interfaceC8013Serializer = C7577.Companion.serializer();
        } else if (strMo12982.equals(Method$Defined.SamplingCreateMessage.getValue())) {
            interfaceC8013Serializer = C7448.Companion.serializer();
        } else if (strMo12982.equals(Method$Defined.RootsList.getValue())) {
            interfaceC8013Serializer = C7483.Companion.serializer();
        }
        return interfaceC8013Serializer == null ? C7437.Companion.serializer() : interfaceC8013Serializer;
    }
}
