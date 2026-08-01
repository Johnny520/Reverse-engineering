package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1367;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.PullToRefreshState$animateToSpring$2", f = "PullToRefresh.kt", l = {284}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class PullToRefreshState$animateToSpring$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ float $targetValue;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC5997 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshState$animateToSpring$2(AbstractC5997 abstractC5997, float f, InterfaceC4356<? super PullToRefreshState$animateToSpring$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$targetValue = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, AbstractC5997 abstractC5997, long j) {
        if (ref$LongRef.element == -1) {
            ref$LongRef.element = j;
            return false;
        }
        ref$LongRef.element = j;
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        PullToRefreshState$animateToSpring$2 pullToRefreshState$animateToSpring$2 = new PullToRefreshState$animateToSpring$2(null, this.$targetValue, interfaceC4356);
        pullToRefreshState$animateToSpring$2.L$0 = obj;
        return pullToRefreshState$animateToSpring$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((PullToRefreshState$animateToSpring$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ?? BooleanValue = this.I$0;
        Ref$LongRef ref$LongRef = (Ref$LongRef) this.L$1;
        try {
            AbstractC5184.m10206(obj);
            do {
                BooleanValue = ((Boolean) obj).booleanValue();
                if (BooleanValue == 0 && AbstractC5398.m10491(interfaceC5400)) {
                    C6013 c6013 = new C6013(ref$LongRef, 0);
                    this.L$0 = interfaceC5400;
                    this.L$1 = ref$LongRef;
                    this.I$0 = BooleanValue;
                    this.label = 1;
                    obj = AbstractC1367.m2482(getContext()).mo2295(c6013, this);
                }
                if (BooleanValue == 0) {
                    return C5175.f14739;
                }
                throw null;
            } while (obj != coroutineSingletons);
            return coroutineSingletons;
        } catch (Throwable th) {
            if (BooleanValue != 0) {
                throw null;
            }
            throw th;
        }
    }
}
