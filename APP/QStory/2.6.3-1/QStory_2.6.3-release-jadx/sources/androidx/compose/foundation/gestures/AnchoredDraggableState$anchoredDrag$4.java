package androidx.compose.foundation.gestures;

import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7381;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", m556f = "AnchoredDraggable.kt", m557l = {1206}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, m152k = 3, m153mv = {2, 1, 0})
final class AnchoredDraggableState$anchoredDrag$4 extends SuspendLambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC7381 $block;
    final /* synthetic */ Object $targetValue;
    int label;
    final /* synthetic */ AbstractC1378 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"T", "Lkotlin/Pair;", "Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;", "<destruct>", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlin/Pair;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", m556f = "AnchoredDraggable.kt", m557l = {1208}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00352 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7381 $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractC1378 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00352(InterfaceC7381 interfaceC7381, AbstractC1378 abstractC1378, InterfaceC5189<? super C00352> interfaceC5189) {
            super(2, interfaceC5189);
            this.$block = interfaceC7381;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00352 c00352 = new C00352(this.$block, null, interfaceC5189);
            c00352.L$0 = obj;
            return c00352;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(Pair<? extends InterfaceC1302, Object> pair, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00352) create(pair, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            Pair pair = (Pair) this.L$0;
            if (pair.component1() != null) {
                C3775.m6954();
                return null;
            }
            pair.component2();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$anchoredDrag$4(AbstractC1378 abstractC1378, Object obj, InterfaceC7381 interfaceC7381, InterfaceC5189<? super AnchoredDraggableState$anchoredDrag$4> interfaceC5189) {
        super(1, interfaceC5189);
        this.$targetValue = obj;
        this.$block = interfaceC7381;
    }

    private static final Pair invokeSuspend$lambda$0(AbstractC1378 abstractC1378) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new AnchoredDraggableState$anchoredDrag$4(null, this.$targetValue, this.$block, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
        return ((AnchoredDraggableState$anchoredDrag$4) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC6017.m10769(obj);
        throw null;
    }
}
