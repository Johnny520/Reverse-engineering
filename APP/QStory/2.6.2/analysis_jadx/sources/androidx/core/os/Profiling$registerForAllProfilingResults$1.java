package androidx.core.os;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import java.util.function.Consumer;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.AbstractC5210;
import kotlinx.coroutines.channels.InterfaceC5195;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", f = "Profiling.kt", l = {79}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Landroid/os/ProfilingResult;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 1, 0})
final class Profiling$registerForAllProfilingResults$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Profiling$registerForAllProfilingResults$1(Context context, InterfaceC4356<? super Profiling$registerForAllProfilingResults$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$0(InterfaceC5195 interfaceC5195, ProfilingResult profilingResult) {
        profilingResult.getClass();
        ((AbstractC5210) interfaceC5195).mo8445(profilingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$2(ProfilingManager profilingManager, Consumer consumer) {
        profilingManager.unregisterForAllProfilingResults(consumer);
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        Profiling$registerForAllProfilingResults$1 profiling$registerForAllProfilingResults$1 = new Profiling$registerForAllProfilingResults$1(this.$context, interfaceC4356);
        profiling$registerForAllProfilingResults$1.L$0 = obj;
        return profiling$registerForAllProfilingResults$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5195 interfaceC5195, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((Profiling$registerForAllProfilingResults$1) create(interfaceC5195, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.core.os.飘花落叶言子楪苏兰世哲] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            final InterfaceC5195 interfaceC5195 = (InterfaceC5195) this.L$0;
            final ?? r1 = new Consumer() { // from class: androidx.core.os.飘花落叶言子楪苏兰世哲
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    Profiling$registerForAllProfilingResults$1.invokeSuspend$lambda$0(interfaceC5195, (ProfilingResult) obj2);
                }
            };
            final ProfilingManager profilingManagerM3976 = AbstractC2183.m3976(this.$context.getSystemService(AbstractC2183.m3975()));
            profilingManagerM3976.registerForAllProfilingResults(new ExecutorC2181(), r1);
            InterfaceC6542 interfaceC6542 = new InterfaceC6542() { // from class: androidx.core.os.飘花落叶言子楪哲世苏兰
                @Override // p052.InterfaceC6542
                public final Object invoke() {
                    return Profiling$registerForAllProfilingResults$1.invokeSuspend$lambda$2(profilingManagerM3976, r1);
                }
            };
            this.label = 1;
            if (AbstractC5204.m10275(interfaceC5195, interfaceC6542, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
