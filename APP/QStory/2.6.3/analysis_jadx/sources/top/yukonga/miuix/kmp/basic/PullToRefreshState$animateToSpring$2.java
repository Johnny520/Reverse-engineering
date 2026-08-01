package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC1367;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.PullToRefreshState$animateToSpring$2", f = "PullToRefresh.kt", l = {284}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class PullToRefreshState$animateToSpring$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ float $targetValue;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC6003 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshState$animateToSpring$2(AbstractC6003 abstractC6003, float f, InterfaceC4357<? super PullToRefreshState$animateToSpring$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$targetValue = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, AbstractC6003 abstractC6003, long j) {
        if (ref$LongRef.element == -1) {
            ref$LongRef.element = j;
            return false;
        }
        ref$LongRef.element = j;
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        PullToRefreshState$animateToSpring$2 pullToRefreshState$animateToSpring$2 = new PullToRefreshState$animateToSpring$2(null, this.$targetValue, interfaceC4357);
        pullToRefreshState$animateToSpring$2.L$0 = obj;
        return pullToRefreshState$animateToSpring$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((PullToRefreshState$animateToSpring$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ?? BooleanValue = this.I$0;
        Ref$LongRef ref$LongRef = (Ref$LongRef) this.L$1;
        try {
            AbstractC5185.m10210(obj);
            do {
                BooleanValue = ((Boolean) obj).booleanValue();
                if (BooleanValue == 0 && AbstractC5399.m10495(interfaceC5401)) {
                    C6019 c6019 = new C6019(ref$LongRef, 0);
                    this.L$0 = interfaceC5401;
                    this.L$1 = ref$LongRef;
                    this.I$0 = BooleanValue;
                    this.label = 1;
                    obj = AbstractC1367.m2492(getContext()).mo2305(c6019, this);
                }
                if (BooleanValue == 0) {
                    return C5176.f14739;
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
