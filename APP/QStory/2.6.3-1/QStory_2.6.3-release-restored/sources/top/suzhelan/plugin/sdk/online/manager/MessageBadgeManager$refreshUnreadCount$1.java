package top.suzhelan.plugin.sdk.online.manager;

import android.util.Log;
import androidx.compose.p001ui.platform.RunnableC2733;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.plugin.sdk.online.net.PluginClientKt;
import top.suzhelan.plugin.sdk.online.net.PluginSdkConfig;
import top.suzhelan.plugin.sdk.online.net.QSResult;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.plugin.sdk.online.manager.MessageBadgeManager$refreshUnreadCount$1", m556f = "MessageBadgeManager.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class MessageBadgeManager$refreshUnreadCount$1 extends SuspendLambda implements InterfaceC7383 {
    int label;

    public MessageBadgeManager$refreshUnreadCount$1(InterfaceC5189<? super MessageBadgeManager$refreshUnreadCount$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new MessageBadgeManager$refreshUnreadCount$1(interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MessageBadgeManager$refreshUnreadCount$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        try {
            QSResult qSResult = (QSResult) PluginClientKt.getApiService().getUnreadCount(PluginSdkConfig.getUSER_UIN()).execute().f16101;
            if (qSResult == null || qSResult.getStatus() != 200 || qSResult.getData() == null) {
                new Integer(Log.w("MessageBadgeManager", "Failed to get unread count: " + (qSResult != null ? qSResult.getMessage() : null)));
            } else {
                Object data = qSResult.getData();
                data.getClass();
                int iIntValue = ((Number) data).intValue();
                int i = AbstractC6634.f16260;
                if (iIntValue != i) {
                    Log.d("MessageBadgeManager", "Unread count updated: " + i + " -> " + iIntValue);
                    AbstractC6634.f16260 = iIntValue;
                    AbstractC6634.f16258.post(new RunnableC2733(4));
                }
            }
        } catch (Exception e) {
            new Integer(Log.e("MessageBadgeManager", "Error refreshing unread count", e));
        }
        return C6008.f15084;
    }
}
