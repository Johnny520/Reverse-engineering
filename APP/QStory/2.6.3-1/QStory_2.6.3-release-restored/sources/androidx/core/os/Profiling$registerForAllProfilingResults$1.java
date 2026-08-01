package androidx.core.os;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import java.util.function.Consumer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.AbstractC6043;
import kotlinx.coroutines.channels.InterfaceC6028;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", m556f = "Profiling.kt", m557l = {79}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Landroid/os/ProfilingResult;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class Profiling$registerForAllProfilingResults$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Context $context;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Profiling$registerForAllProfilingResults$1(Context context, InterfaceC5189<? super Profiling$registerForAllProfilingResults$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$0(InterfaceC6028 interfaceC6028, ProfilingResult profilingResult) {
        profilingResult.getClass();
        ((AbstractC6043) interfaceC6028).mo8995(profilingResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$2(ProfilingManager profilingManager, Consumer consumer) {
        profilingManager.unregisterForAllProfilingResults(consumer);
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        Profiling$registerForAllProfilingResults$1 profiling$registerForAllProfilingResults$1 = new Profiling$registerForAllProfilingResults$1(this.$context, interfaceC5189);
        profiling$registerForAllProfilingResults$1.L$0 = obj;
        return profiling$registerForAllProfilingResults$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((Profiling$registerForAllProfilingResults$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.core.os.飘花落叶言子楪苏兰世哲] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            final InterfaceC6028 interfaceC6028 = (InterfaceC6028) this.L$0;
            final ?? r1 = new Consumer() { // from class: androidx.core.os.飘花落叶言子楪苏兰世哲
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    Profiling$registerForAllProfilingResults$1.invokeSuspend$lambda$0(interfaceC6028, (ProfilingResult) obj2);
                }
            };
            final ProfilingManager profilingManagerM4546 = AbstractC3016.m4546(this.$context.getSystemService(AbstractC3016.m4545()));
            profilingManagerM4546.registerForAllProfilingResults(new ExecutorC3014(), r1);
            InterfaceC7372 interfaceC7372 = new InterfaceC7372() { // from class: androidx.core.os.飘花落叶言子楪哲世苏兰
                @Override // p068.InterfaceC7372
                public final Object invoke() {
                    return Profiling$registerForAllProfilingResults$1.invokeSuspend$lambda$2(profilingManagerM4546, r1);
                }
            };
            this.label = 1;
            if (AbstractC6037.m10838(interfaceC6028, interfaceC7372, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
