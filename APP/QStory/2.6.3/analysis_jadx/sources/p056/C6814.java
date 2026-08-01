package p056;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.collections.AbstractC4339;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import p087.AbstractC7073;
import p088.AbstractC7168;
import p088.AbstractC7176;
import p089.InterfaceC7184;
import p249.InterfaceC8160;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6814 extends AbstractC7073 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6814 f18254 = new C6814(AbstractC4396.f12975.mo8917(InterfaceC6813.class));

    @Override // p087.AbstractC7073
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7184 mo12074(AbstractC7176 abstractC7176) {
        abstractC7176.getClass();
        InterfaceC8160 interfaceC8160 = AbstractC6602.f17977;
        String strMo12423 = AbstractC7168.m12428((AbstractC7176) AbstractC4339.m8773("method", AbstractC7168.m12429(abstractC7176))).mo12423();
        Method$Defined method$Defined = Method$Defined.NotificationsCancelled;
        InterfaceC7184 interfaceC7184Serializer = null;
        InterfaceC7184 interfaceC7184Serializer2 = AbstractC4395.m8907(strMo12423, method$Defined.getValue()) ? C6704.Companion.serializer() : AbstractC4395.m8907(strMo12423, Method$Defined.NotificationsProgress.getValue()) ? C6754.Companion.serializer() : AbstractC4395.m8907(strMo12423, Method$Defined.NotificationsInitialized.getValue()) ? C6675.Companion.serializer() : AbstractC4395.m8907(strMo12423, Method$Defined.NotificationsRootsListChanged.getValue()) ? C6770.Companion.serializer() : null;
        if (interfaceC7184Serializer2 != null) {
            return interfaceC7184Serializer2;
        }
        String strMo124232 = AbstractC7168.m12428((AbstractC7176) AbstractC4339.m8773("method", AbstractC7168.m12429(abstractC7176))).mo12423();
        if (AbstractC4395.m8907(strMo124232, method$Defined.getValue())) {
            interfaceC7184Serializer = C6704.Companion.serializer();
        } else if (AbstractC4395.m8907(strMo124232, Method$Defined.NotificationsProgress.getValue())) {
            interfaceC7184Serializer = C6754.Companion.serializer();
        } else if (AbstractC4395.m8907(strMo124232, Method$Defined.NotificationsMessage.getValue())) {
            interfaceC7184Serializer = C6822.Companion.serializer();
        } else if (AbstractC4395.m8907(strMo124232, Method$Defined.NotificationsResourcesUpdated.getValue())) {
            interfaceC7184Serializer = C6790.Companion.serializer();
        } else if (AbstractC4395.m8907(strMo124232, Method$Defined.NotificationsResourcesListChanged.getValue())) {
            interfaceC7184Serializer = C6802.Companion.serializer();
        } else if (AbstractC4395.m8907(strMo124232, Method$Defined.ToolsList.getValue())) {
            interfaceC7184Serializer = C6570.Companion.serializer();
        } else if (AbstractC4395.m8907(strMo124232, Method$Defined.PromptsList.getValue())) {
            interfaceC7184Serializer = C6741.Companion.serializer();
        }
        return interfaceC7184Serializer == null ? C6608.Companion.serializer() : interfaceC7184Serializer;
    }
}
