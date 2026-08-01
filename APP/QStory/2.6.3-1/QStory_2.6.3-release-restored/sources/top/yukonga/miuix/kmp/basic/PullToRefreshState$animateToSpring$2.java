package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC2202;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.PullToRefreshState$animateToSpring$2", m556f = "PullToRefresh.kt", m557l = {284}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class PullToRefreshState$animateToSpring$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ float $targetValue;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC6833 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullToRefreshState$animateToSpring$2(AbstractC6833 abstractC6833, float f, InterfaceC5189<? super PullToRefreshState$animateToSpring$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$targetValue = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, AbstractC6833 abstractC6833, long j) {
        if (ref$LongRef.element == -1) {
            ref$LongRef.element = j;
            return false;
        }
        ref$LongRef.element = j;
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        PullToRefreshState$animateToSpring$2 pullToRefreshState$animateToSpring$2 = new PullToRefreshState$animateToSpring$2(null, this.$targetValue, interfaceC5189);
        pullToRefreshState$animateToSpring$2.L$0 = obj;
        return pullToRefreshState$animateToSpring$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((PullToRefreshState$animateToSpring$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ?? BooleanValue = this.I$0;
        Ref$LongRef ref$LongRef = (Ref$LongRef) this.L$1;
        try {
            AbstractC6017.m10769(obj);
            do {
                BooleanValue = ((Boolean) obj).booleanValue();
                if (BooleanValue == 0 && AbstractC6231.m11054(interfaceC6233)) {
                    C6849 c6849 = new C6849(ref$LongRef, 0);
                    this.L$0 = interfaceC6233;
                    this.L$1 = ref$LongRef;
                    this.I$0 = BooleanValue;
                    this.label = 1;
                    obj = AbstractC2202.m3052(getContext()).mo2865(c6849, this);
                }
                if (BooleanValue == 0) {
                    return C6008.f15084;
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
