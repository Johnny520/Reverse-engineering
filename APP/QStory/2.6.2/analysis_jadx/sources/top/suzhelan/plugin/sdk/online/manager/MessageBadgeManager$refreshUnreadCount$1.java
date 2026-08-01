package top.suzhelan.plugin.sdk.online.manager;

import android.util.Log;
import androidx.compose.ui.platform.RunnableC1898;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.plugin.sdk.online.net.PluginClientKt;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.plugin.sdk.online.manager.MessageBadgeManager$refreshUnreadCount$1", f = "MessageBadgeManager.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class MessageBadgeManager$refreshUnreadCount$1 extends SuspendLambda implements InterfaceC6553 {
    int label;

    public MessageBadgeManager$refreshUnreadCount$1(InterfaceC4356<? super MessageBadgeManager$refreshUnreadCount$1> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new MessageBadgeManager$refreshUnreadCount$1(interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((MessageBadgeManager$refreshUnreadCount$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        try {
            QSResult qSResult = (QSResult) PluginClientKt.getApiService().getUnreadCount(PluginSdkConfig.getUSER_UIN()).execute().f15756;
            if (qSResult == null || qSResult.getStatus() != 200 || qSResult.getData() == null) {
                new Integer(Log.w("MessageBadgeManager", "Failed to get unread count: " + (qSResult != null ? qSResult.getMessage() : null)));
            } else {
                Object data = qSResult.getData();
                data.getClass();
                int iIntValue = ((Number) data).intValue();
                int i = AbstractC5803.f15915;
                if (iIntValue != i) {
                    Log.d("MessageBadgeManager", "Unread count updated: " + i + " -> " + iIntValue);
                    AbstractC5803.f15915 = iIntValue;
                    AbstractC5803.f15913.post(new RunnableC1898(4));
                }
            }
        } catch (Exception e) {
            new Integer(Log.e("MessageBadgeManager", "Error refreshing unread count", e));
        }
        return C5175.f14739;
    }
}
