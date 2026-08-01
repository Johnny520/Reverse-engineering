package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import io.ktor.util.C5043;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.core.content.ContextKt$receiveBroadcastsAsync$2", m556f = "Context.kt", m557l = {238}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Void;"}, m152k = 3, m153mv = {2, 1, 0})
final class ContextKt$receiveBroadcastsAsync$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ String $broadcastPermission;
    final /* synthetic */ IntentFilter $filter;
    final /* synthetic */ int $flags;
    final /* synthetic */ InterfaceC7380 $onReceive;
    final /* synthetic */ Handler $scheduler;
    final /* synthetic */ Context $this_receiveBroadcastsAsync;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextKt$receiveBroadcastsAsync$2(Context context, IntentFilter intentFilter, int i, String str, Handler handler, InterfaceC7380 interfaceC7380, InterfaceC5189<? super ContextKt$receiveBroadcastsAsync$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_receiveBroadcastsAsync = context;
        this.$filter = intentFilter;
        this.$flags = i;
        this.$broadcastPermission = str;
        this.$scheduler = handler;
        this.$onReceive = interfaceC7380;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(InterfaceC6233 interfaceC6233, InterfaceC7380 interfaceC7380, BroadcastReceiver broadcastReceiver, Intent intent) {
        AbstractC6231.m11036(interfaceC6233, null, CoroutineStart.ATOMIC, new ContextKt$receiveBroadcastsAsync$2$1$1(interfaceC7380, broadcastReceiver.goAsync(), intent, null), 1);
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ContextKt$receiveBroadcastsAsync$2 contextKt$receiveBroadcastsAsync$2 = new ContextKt$receiveBroadcastsAsync$2(this.$this_receiveBroadcastsAsync, this.$filter, this.$flags, this.$broadcastPermission, this.$scheduler, this.$onReceive, interfaceC5189);
        contextKt$receiveBroadcastsAsync$2.L$0 = obj;
        return contextKt$receiveBroadcastsAsync$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<?> interfaceC5189) {
        return ((ContextKt$receiveBroadcastsAsync$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.core.content.飘花落叶言子楪世苏哲兰] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            final InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
            Context context = this.$this_receiveBroadcastsAsync;
            IntentFilter intentFilter = this.$filter;
            int i2 = this.$flags;
            String str = this.$broadcastPermission;
            Handler handler = this.$scheduler;
            final InterfaceC7380 interfaceC7380 = this.$onReceive;
            ?? r8 = new InterfaceC7383() { // from class: androidx.core.content.飘花落叶言子楪世苏哲兰
                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj2, Object obj3) {
                    return ContextKt$receiveBroadcastsAsync$2.invokeSuspend$lambda$0(interfaceC6233, interfaceC7380, (BroadcastReceiver) obj2, (Intent) obj3);
                }
            };
            this.label = 1;
            if (AbstractC3000.m4507(context, intentFilter, i2, str, handler, r8, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        C5043.m9161();
        return null;
    }
}
