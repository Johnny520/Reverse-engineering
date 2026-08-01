package androidx.compose.runtime;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.InterfaceC6151;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", m556f = "SnapshotFlow.kt", m557l = {72, 73}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"R", "Landroidx/compose/runtime/飘花落叶言子苏哲世楪兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/runtime/飘花落叶言子苏哲世楪兰;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC5192 $context;
    final /* synthetic */ InterfaceC6151 $this_collectAsState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", m556f = "SnapshotFlow.kt", m557l = {73}, m558m = "invokeSuspend", m559v = 1)
    public static final class C01702 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC2223 $$this$produceState;
        final /* synthetic */ InterfaceC6151 $this_collectAsState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01702(InterfaceC6151 interfaceC6151, InterfaceC2223 interfaceC2223, InterfaceC5189<? super C01702> interfaceC5189) {
            super(2, interfaceC5189);
            this.$this_collectAsState = interfaceC6151;
            this.$$this$produceState = interfaceC2223;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C01702(this.$this_collectAsState, this.$$this$produceState, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01702) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC6151 interfaceC6151 = this.$this_collectAsState;
                C2171 c2171 = new C2171(this.$$this$produceState, 1);
                this.label = 1;
                if (interfaceC6151.mo9012(c2171, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(InterfaceC5192 interfaceC5192, InterfaceC6151 interfaceC6151, InterfaceC5189<? super SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$context = interfaceC5192;
        this.$this_collectAsState = interfaceC6151;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(this.$context, this.$this_collectAsState, interfaceC5189);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2223 interfaceC2223, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1) create(interfaceC2223, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r1.mo9012(r2, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11029(r1, r4, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC2223 interfaceC2223 = (InterfaceC2223) this.L$0;
            if (AbstractC5227.m9466(this.$context, EmptyCoroutineContext.INSTANCE)) {
                InterfaceC6151 interfaceC6151 = this.$this_collectAsState;
                C2171 c2171 = new C2171(interfaceC2223, 0);
                this.label = 1;
            } else {
                InterfaceC5192 interfaceC5192 = this.$context;
                C01702 c01702 = new C01702(this.$this_collectAsState, interfaceC2223, null);
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
