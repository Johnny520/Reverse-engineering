package androidx.lifecycle;

import com.android.dx.io.Opcodes;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {Opcodes.AND_INT_LIT16}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $block;
    final /* synthetic */ Lifecycle$State $minState;
    final /* synthetic */ AbstractC2402 $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(AbstractC2402 abstractC2402, Lifecycle$State lifecycle$State, InterfaceC6553 interfaceC6553, InterfaceC4356<? super PausingDispatcherKt$whenStateAtLeast$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_whenStateAtLeast = abstractC2402;
        this.$minState = lifecycle$State;
        this.$block = interfaceC6553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, interfaceC4356);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<Object> interfaceC4356) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2400 c2400;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c2400 = (C2400) this.L$0;
            try {
                AbstractC5184.m10206(obj);
                c2400.m4503();
                return obj;
            } catch (Throwable th) {
                th = th;
                c2400.m4503();
                throw th;
            }
        }
        AbstractC5184.m10206(obj);
        InterfaceC5451 interfaceC5451 = (InterfaceC5451) ((InterfaceC5400) this.L$0).mo2420().get(C5452.f15105);
        if (interfaceC5451 == null) {
            C5919.m11250("when[State] methods should have a parent job");
            return null;
        }
        C2372 c2372 = new C2372();
        C2400 c24002 = new C2400(this.$this_whenStateAtLeast, this.$minState, c2372.f6996, interfaceC5451);
        try {
            InterfaceC6553 interfaceC6553 = this.$block;
            this.L$0 = c24002;
            this.label = 1;
            obj = AbstractC5398.m10466(c2372, interfaceC6553, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            c2400 = c24002;
            c2400.m4503();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            c2400 = c24002;
            c2400.m4503();
            throw th;
        }
    }
}
