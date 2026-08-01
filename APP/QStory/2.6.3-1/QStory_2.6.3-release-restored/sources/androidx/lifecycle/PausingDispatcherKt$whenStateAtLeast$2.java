package androidx.lifecycle;

import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m556f = "PausingDispatcher.jvm.kt", m557l = {Opcodes.AND_INT_LIT16}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m151d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, m152k = 3, m153mv = {2, 0, 0})
final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $block;
    final /* synthetic */ Lifecycle$State $minState;
    final /* synthetic */ AbstractC3235 $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(AbstractC3235 abstractC3235, Lifecycle$State lifecycle$State, InterfaceC7383 interfaceC7383, InterfaceC5189<? super PausingDispatcherKt$whenStateAtLeast$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_whenStateAtLeast = abstractC3235;
        this.$minState = lifecycle$State;
        this.$block = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, interfaceC5189);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<Object> interfaceC5189) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C3233 c3233;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c3233 = (C3233) this.L$0;
            try {
                AbstractC6017.m10769(obj);
                c3233.m5073();
                return obj;
            } catch (Throwable th) {
                th = th;
                c3233.m5073();
                throw th;
            }
        }
        AbstractC6017.m10769(obj);
        InterfaceC6284 interfaceC6284 = (InterfaceC6284) ((InterfaceC6233) this.L$0).mo2990().get(C6285.f15450);
        if (interfaceC6284 == null) {
            C6755.m11870("when[State] methods should have a parent job");
            return null;
        }
        C3205 c3205 = new C3205();
        C3233 c32332 = new C3233(this.$this_whenStateAtLeast, this.$minState, c3205.f7342, interfaceC6284);
        try {
            InterfaceC7383 interfaceC7383 = this.$block;
            this.L$0 = c32332;
            this.label = 1;
            obj = AbstractC6231.m11029(c3205, interfaceC7383, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            c3233 = c32332;
            c3233.m5073();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            c3233 = c32332;
            c3233.m5073();
            throw th;
        }
    }
}
