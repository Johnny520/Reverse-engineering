package kotlinx.coroutines.flow;

import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", m556f = "Merge.kt", m557l = {Opcodes.AND_INT_LIT16, Opcodes.AND_INT_LIT16}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m151d2 = {"R", "T", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, m152k = 3, m153mv = {2, 2, 0})
final class FlowKt__MergeKt$mapLatest$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC7383 $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MergeKt$mapLatest$1(InterfaceC7383 interfaceC7383, InterfaceC5189<? super FlowKt__MergeKt$mapLatest$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$transform = interfaceC7383;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(InterfaceC6150 interfaceC6150, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.$transform, interfaceC5189);
        flowKt__MergeKt$mapLatest$1.L$0 = interfaceC6150;
        flowKt__MergeKt$mapLatest$1.L$1 = obj;
        return flowKt__MergeKt$mapLatest$1.invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r0.emit(r8, r7) == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6150 interfaceC6150 = (InterfaceC6150) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC7383 interfaceC7383 = this.$transform;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = interfaceC6150;
            this.label = 1;
            obj = interfaceC7383.invoke(obj2, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC6150 = (InterfaceC6150) this.L$2;
        AbstractC6017.m10769(obj);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
