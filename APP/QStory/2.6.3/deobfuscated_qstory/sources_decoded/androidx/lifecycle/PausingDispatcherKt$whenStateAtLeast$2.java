package androidx.lifecycle;

import com.android.dx.io.Opcodes;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {Opcodes.AND_INT_LIT16}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6554 $block;
    final /* synthetic */ Lifecycle$State $minState;
    final /* synthetic */ AbstractC2402 $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(AbstractC2402 abstractC2402, Lifecycle$State lifecycle$State, InterfaceC6554 interfaceC6554, InterfaceC4357<? super PausingDispatcherKt$whenStateAtLeast$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_whenStateAtLeast = abstractC2402;
        this.$minState = lifecycle$State;
        this.$block = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, interfaceC4357);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<Object> interfaceC4357) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2400 c2400;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c2400 = (C2400) this.L$0;
            try {
                AbstractC5185.m10210(obj);
                c2400.m4513();
                return obj;
            } catch (Throwable th) {
                th = th;
                c2400.m4513();
                throw th;
            }
        }
        AbstractC5185.m10210(obj);
        InterfaceC5452 interfaceC5452 = (InterfaceC5452) ((InterfaceC5401) this.L$0).mo2430().get(C5453.f15105);
        if (interfaceC5452 == null) {
            C5925.m11311("when[State] methods should have a parent job");
            return null;
        }
        C2372 c2372 = new C2372();
        C2400 c24002 = new C2400(this.$this_whenStateAtLeast, this.$minState, c2372.f6997, interfaceC5452);
        try {
            InterfaceC6554 interfaceC6554 = this.$block;
            this.L$0 = c24002;
            this.label = 1;
            obj = AbstractC5399.m10470(c2372, interfaceC6554, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            c2400 = c24002;
            c2400.m4513();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            c2400 = c24002;
            c2400.m4513();
            throw th;
        }
    }
}
