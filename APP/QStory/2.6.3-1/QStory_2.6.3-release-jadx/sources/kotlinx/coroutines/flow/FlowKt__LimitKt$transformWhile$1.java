package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", m556f = "Limit.kt", m557l = {152}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"R", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class FlowKt__LimitKt$transformWhile$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6151 $this_transformWhile;
    final /* synthetic */ InterfaceC7380 $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$transformWhile$1(InterfaceC6151 interfaceC6151, InterfaceC7380 interfaceC7380, InterfaceC5189<? super FlowKt__LimitKt$transformWhile$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_transformWhile = interfaceC6151;
        this.$transform = interfaceC7380;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1(this.$this_transformWhile, this.$transform, interfaceC5189);
        flowKt__LimitKt$transformWhile$1.L$0 = obj;
        return flowKt__LimitKt$transformWhile$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6150 interfaceC6150, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FlowKt__LimitKt$transformWhile$1) create(interfaceC6150, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C6175 c6175;
        InterfaceC6150 interfaceC6150 = (InterfaceC6150) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6151 interfaceC6151 = this.$this_transformWhile;
            C6175 c61752 = new C6175(this.$transform, interfaceC6150);
            try {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = c61752;
                this.I$0 = 0;
                this.label = 1;
                if (interfaceC6151.mo9012(c61752, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (AbortFlowException e) {
                e = e;
                c6175 = c61752;
                if (e.owner == c6175) {
                    throw e;
                }
                AbstractC6231.m11061(this.getContext());
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c6175 = (C6175) this.L$2;
            try {
                AbstractC6017.m10769(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                if (e.owner == c6175) {
                }
            }
        }
        return C6008.f15084;
    }
}
