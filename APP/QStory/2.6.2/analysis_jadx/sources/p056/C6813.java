package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.collections.AbstractC4338;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import p087.AbstractC7072;
import p088.AbstractC7167;
import p088.AbstractC7175;
import p089.InterfaceC7183;
import p249.InterfaceC8159;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6813 extends AbstractC7072 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6813 f18259 = new C6813(AbstractC4395.f12971.mo8927(InterfaceC6812.class));

    @Override // p087.AbstractC7072
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7183 mo12046(AbstractC7175 abstractC7175) {
        abstractC7175.getClass();
        InterfaceC8159 interfaceC8159 = AbstractC6601.f17982;
        String strMo12396 = AbstractC7167.m12401((AbstractC7175) AbstractC4338.m8780("method", AbstractC7167.m12402(abstractC7175))).mo12396();
        Method$Defined method$Defined = Method$Defined.NotificationsCancelled;
        InterfaceC7183 interfaceC7183Serializer = null;
        InterfaceC7183 interfaceC7183Serializer2 = AbstractC4394.m8917(strMo12396, method$Defined.getValue()) ? C6703.Companion.serializer() : AbstractC4394.m8917(strMo12396, Method$Defined.NotificationsProgress.getValue()) ? C6753.Companion.serializer() : AbstractC4394.m8917(strMo12396, Method$Defined.NotificationsInitialized.getValue()) ? C6674.Companion.serializer() : AbstractC4394.m8917(strMo12396, Method$Defined.NotificationsRootsListChanged.getValue()) ? C6769.Companion.serializer() : null;
        if (interfaceC7183Serializer2 != null) {
            return interfaceC7183Serializer2;
        }
        String strMo123962 = AbstractC7167.m12401((AbstractC7175) AbstractC4338.m8780("method", AbstractC7167.m12402(abstractC7175))).mo12396();
        if (AbstractC4394.m8917(strMo123962, method$Defined.getValue())) {
            interfaceC7183Serializer = C6703.Companion.serializer();
        } else if (AbstractC4394.m8917(strMo123962, Method$Defined.NotificationsProgress.getValue())) {
            interfaceC7183Serializer = C6753.Companion.serializer();
        } else if (AbstractC4394.m8917(strMo123962, Method$Defined.NotificationsMessage.getValue())) {
            interfaceC7183Serializer = C6821.Companion.serializer();
        } else if (AbstractC4394.m8917(strMo123962, Method$Defined.NotificationsResourcesUpdated.getValue())) {
            interfaceC7183Serializer = C6789.Companion.serializer();
        } else if (AbstractC4394.m8917(strMo123962, Method$Defined.NotificationsResourcesListChanged.getValue())) {
            interfaceC7183Serializer = C6801.Companion.serializer();
        } else if (AbstractC4394.m8917(strMo123962, Method$Defined.ToolsList.getValue())) {
            interfaceC7183Serializer = C6569.Companion.serializer();
        } else if (AbstractC4394.m8917(strMo123962, Method$Defined.PromptsList.getValue())) {
            interfaceC7183Serializer = C6740.Companion.serializer();
        }
        return interfaceC7183Serializer == null ? C6607.Companion.serializer() : interfaceC7183Serializer;
    }
}
