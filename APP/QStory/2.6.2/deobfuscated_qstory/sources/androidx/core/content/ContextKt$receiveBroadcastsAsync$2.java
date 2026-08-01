package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import io.ktor.util.C4210;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.core.content.ContextKt$receiveBroadcastsAsync$2", f = "Context.kt", l = {238}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
final class ContextKt$receiveBroadcastsAsync$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ String $broadcastPermission;
    final /* synthetic */ IntentFilter $filter;
    final /* synthetic */ int $flags;
    final /* synthetic */ InterfaceC6550 $onReceive;
    final /* synthetic */ Handler $scheduler;
    final /* synthetic */ Context $this_receiveBroadcastsAsync;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextKt$receiveBroadcastsAsync$2(Context context, IntentFilter intentFilter, int i, String str, Handler handler, InterfaceC6550 interfaceC6550, InterfaceC4356<? super ContextKt$receiveBroadcastsAsync$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_receiveBroadcastsAsync = context;
        this.$filter = intentFilter;
        this.$flags = i;
        this.$broadcastPermission = str;
        this.$scheduler = handler;
        this.$onReceive = interfaceC6550;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(InterfaceC5400 interfaceC5400, InterfaceC6550 interfaceC6550, BroadcastReceiver broadcastReceiver, Intent intent) {
        AbstractC5398.m10473(interfaceC5400, null, CoroutineStart.ATOMIC, new ContextKt$receiveBroadcastsAsync$2$1$1(interfaceC6550, broadcastReceiver.goAsync(), intent, null), 1);
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ContextKt$receiveBroadcastsAsync$2 contextKt$receiveBroadcastsAsync$2 = new ContextKt$receiveBroadcastsAsync$2(this.$this_receiveBroadcastsAsync, this.$filter, this.$flags, this.$broadcastPermission, this.$scheduler, this.$onReceive, interfaceC4356);
        contextKt$receiveBroadcastsAsync$2.L$0 = obj;
        return contextKt$receiveBroadcastsAsync$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<?> interfaceC4356) {
        return ((ContextKt$receiveBroadcastsAsync$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.core.content.飘花落叶言子楪世苏哲兰] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            final InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
            Context context = this.$this_receiveBroadcastsAsync;
            IntentFilter intentFilter = this.$filter;
            int i2 = this.$flags;
            String str = this.$broadcastPermission;
            Handler handler = this.$scheduler;
            final InterfaceC6550 interfaceC6550 = this.$onReceive;
            ?? r8 = new InterfaceC6553() { // from class: androidx.core.content.飘花落叶言子楪世苏哲兰
                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj2, Object obj3) {
                    return ContextKt$receiveBroadcastsAsync$2.invokeSuspend$lambda$0(interfaceC5400, interfaceC6550, (BroadcastReceiver) obj2, (Intent) obj3);
                }
            };
            this.label = 1;
            if (AbstractC2167.m3937(context, intentFilter, i2, str, handler, r8, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        C4210.m8612();
        return null;
    }
}
