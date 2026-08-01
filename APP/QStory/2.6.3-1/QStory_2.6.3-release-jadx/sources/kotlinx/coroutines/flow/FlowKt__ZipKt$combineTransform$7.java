package kotlinx.coroutines.flow;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", m556f = "Zip.kt", m557l = {304}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"R", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
public final class FlowKt__ZipKt$combineTransform$7 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6151[] $flowArray;
    final /* synthetic */ InterfaceC7380 $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$7(InterfaceC6151[] interfaceC6151Arr, InterfaceC7380 interfaceC7380, InterfaceC5189<? super FlowKt__ZipKt$combineTransform$7> interfaceC5189) {
        super(2, interfaceC5189);
        this.$flowArray = interfaceC6151Arr;
        this.$transform = interfaceC7380;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        FlowKt__ZipKt$combineTransform$7 flowKt__ZipKt$combineTransform$7 = new FlowKt__ZipKt$combineTransform$7(this.$flowArray, this.$transform, interfaceC5189);
        flowKt__ZipKt$combineTransform$7.L$0 = obj;
        return flowKt__ZipKt$combineTransform$7;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6150 interfaceC6150, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FlowKt__ZipKt$combineTransform$7) create(interfaceC6150, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5227.m9468();
            throw null;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        AbstractC5227.m9468();
        throw null;
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m151d2 = {"R", "T", "Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;Lkotlin/Array;)V"}, m152k = 3, m153mv = {2, 2, 0})
    @InterfaceC7691(m555c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", m556f = "Zip.kt", m557l = {304}, m558m = "invokeSuspend", m559v = 1)
    public static final class C04032 extends SuspendLambda implements InterfaceC7380 {
        final /* synthetic */ InterfaceC7380 $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04032(InterfaceC7380 interfaceC7380, InterfaceC5189<? super C04032> interfaceC5189) {
            super(3, interfaceC5189);
            this.$transform = interfaceC7380;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            InterfaceC6150 interfaceC6150 = (InterfaceC6150) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC7380 interfaceC7380 = this.$transform;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (interfaceC7380.invoke(interfaceC6150, objArr, this) == coroutineSingletons) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            this.$transform.invoke((InterfaceC6150) this.L$0, (Object[]) this.L$1, this);
            return C6008.f15084;
        }

        @Override // p068.InterfaceC7380
        public final Object invoke(InterfaceC6150 interfaceC6150, Object[] objArr, InterfaceC5189<? super C6008> interfaceC5189) {
            AbstractC5227.m9468();
            throw null;
        }
    }
}
