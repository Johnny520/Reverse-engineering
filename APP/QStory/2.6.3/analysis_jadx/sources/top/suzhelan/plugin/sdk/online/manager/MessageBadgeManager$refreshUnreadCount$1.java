package top.suzhelan.plugin.sdk.online.manager;

import android.util.Log;
import androidx.compose.ui.platform.RunnableC1898;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.plugin.sdk.online.net.PluginClientKt;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.suzhelan.plugin.sdk.online.manager.MessageBadgeManager$refreshUnreadCount$1", f = "MessageBadgeManager.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class MessageBadgeManager$refreshUnreadCount$1 extends SuspendLambda implements InterfaceC6554 {
    int label;

    public MessageBadgeManager$refreshUnreadCount$1(InterfaceC4357<? super MessageBadgeManager$refreshUnreadCount$1> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new MessageBadgeManager$refreshUnreadCount$1(interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((MessageBadgeManager$refreshUnreadCount$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        try {
            QSResult qSResult = (QSResult) PluginClientKt.getApiService().getUnreadCount(PluginSdkConfig.getUSER_UIN()).execute().f15756;
            if (qSResult == null || qSResult.getStatus() != 200 || qSResult.getData() == null) {
                new Integer(Log.w("MessageBadgeManager", "Failed to get unread count: " + (qSResult != null ? qSResult.getMessage() : null)));
            } else {
                Object data = qSResult.getData();
                data.getClass();
                int iIntValue = ((Number) data).intValue();
                int i = AbstractC5804.f15915;
                if (iIntValue != i) {
                    Log.d("MessageBadgeManager", "Unread count updated: " + i + " -> " + iIntValue);
                    AbstractC5804.f15915 = iIntValue;
                    AbstractC5804.f15913.post(new RunnableC1898(4));
                }
            }
        } catch (Exception e) {
            new Integer(Log.e("MessageBadgeManager", "Error refreshing unread count", e));
        }
        return C5176.f14739;
    }
}
