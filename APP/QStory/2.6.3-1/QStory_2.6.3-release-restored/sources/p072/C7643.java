package p072;

import io.modelcontextprotocol.kotlin.sdk.Method$Defined;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import p103.AbstractC7902;
import p104.AbstractC7997;
import p104.AbstractC8005;
import p105.InterfaceC8013;
import p265.InterfaceC8989;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7643 extends AbstractC7902 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7643 f18599 = new C7643(AbstractC5228.f13320.mo9476(InterfaceC7642.class));

    @Override // p103.AbstractC7902
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8013 mo12633(AbstractC8005 abstractC8005) {
        abstractC8005.getClass();
        InterfaceC8989 interfaceC8989 = AbstractC7431.f18322;
        String strMo12982 = AbstractC7997.m12987((AbstractC8005) AbstractC5171.m9332("method", AbstractC7997.m12988(abstractC8005))).mo12982();
        Method$Defined method$Defined = Method$Defined.NotificationsCancelled;
        InterfaceC8013 interfaceC8013Serializer = null;
        InterfaceC8013 interfaceC8013Serializer2 = AbstractC5227.m9466(strMo12982, method$Defined.getValue()) ? C7533.Companion.serializer() : AbstractC5227.m9466(strMo12982, Method$Defined.NotificationsProgress.getValue()) ? C7583.Companion.serializer() : AbstractC5227.m9466(strMo12982, Method$Defined.NotificationsInitialized.getValue()) ? C7504.Companion.serializer() : AbstractC5227.m9466(strMo12982, Method$Defined.NotificationsRootsListChanged.getValue()) ? C7599.Companion.serializer() : null;
        if (interfaceC8013Serializer2 != null) {
            return interfaceC8013Serializer2;
        }
        String strMo129822 = AbstractC7997.m12987((AbstractC8005) AbstractC5171.m9332("method", AbstractC7997.m12988(abstractC8005))).mo12982();
        if (AbstractC5227.m9466(strMo129822, method$Defined.getValue())) {
            interfaceC8013Serializer = C7533.Companion.serializer();
        } else if (AbstractC5227.m9466(strMo129822, Method$Defined.NotificationsProgress.getValue())) {
            interfaceC8013Serializer = C7583.Companion.serializer();
        } else if (AbstractC5227.m9466(strMo129822, Method$Defined.NotificationsMessage.getValue())) {
            interfaceC8013Serializer = C7651.Companion.serializer();
        } else if (AbstractC5227.m9466(strMo129822, Method$Defined.NotificationsResourcesUpdated.getValue())) {
            interfaceC8013Serializer = C7619.Companion.serializer();
        } else if (AbstractC5227.m9466(strMo129822, Method$Defined.NotificationsResourcesListChanged.getValue())) {
            interfaceC8013Serializer = C7631.Companion.serializer();
        } else if (AbstractC5227.m9466(strMo129822, Method$Defined.ToolsList.getValue())) {
            interfaceC8013Serializer = C7399.Companion.serializer();
        } else if (AbstractC5227.m9466(strMo129822, Method$Defined.PromptsList.getValue())) {
            interfaceC8013Serializer = C7570.Companion.serializer();
        }
        return interfaceC8013Serializer == null ? C7437.Companion.serializer() : interfaceC8013Serializer;
    }
}
