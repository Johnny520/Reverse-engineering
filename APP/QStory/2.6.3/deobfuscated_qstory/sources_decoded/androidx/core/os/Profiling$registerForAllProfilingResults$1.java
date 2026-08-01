package androidx.core.os;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import java.util.function.Consumer;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.AbstractC5211;
import kotlinx.coroutines.channels.InterfaceC5196;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", f = "Profiling.kt", l = {79}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Landroid/os/ProfilingResult;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 1, 0})
final class Profiling$registerForAllProfilingResults$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Profiling$registerForAllProfilingResults$1(Context context, InterfaceC4357<? super Profiling$registerForAllProfilingResults$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$0(InterfaceC5196 interfaceC5196, ProfilingResult profilingResult) {
        profilingResult.getClass();
        ((AbstractC5211) interfaceC5196).mo8436(profilingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$2(ProfilingManager profilingManager, Consumer consumer) {
        profilingManager.unregisterForAllProfilingResults(consumer);
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        Profiling$registerForAllProfilingResults$1 profiling$registerForAllProfilingResults$1 = new Profiling$registerForAllProfilingResults$1(this.$context, interfaceC4357);
        profiling$registerForAllProfilingResults$1.L$0 = obj;
        return profiling$registerForAllProfilingResults$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((Profiling$registerForAllProfilingResults$1) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.core.os.飘花落叶言子楪苏兰世哲] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            final InterfaceC5196 interfaceC5196 = (InterfaceC5196) this.L$0;
            final ?? r1 = new Consumer() { // from class: androidx.core.os.飘花落叶言子楪苏兰世哲
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    Profiling$registerForAllProfilingResults$1.invokeSuspend$lambda$0(interfaceC5196, (ProfilingResult) obj2);
                }
            };
            final ProfilingManager profilingManagerM3986 = AbstractC2183.m3986(this.$context.getSystemService(AbstractC2183.m3985()));
            profilingManagerM3986.registerForAllProfilingResults(new ExecutorC2181(), r1);
            InterfaceC6543 interfaceC6543 = new InterfaceC6543() { // from class: androidx.core.os.飘花落叶言子楪哲世苏兰
                @Override // p052.InterfaceC6543
                public final Object invoke() {
                    return Profiling$registerForAllProfilingResults$1.invokeSuspend$lambda$2(profilingManagerM3986, r1);
                }
            };
            this.label = 1;
            if (AbstractC5205.m10279(interfaceC5196, interfaceC6543, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
