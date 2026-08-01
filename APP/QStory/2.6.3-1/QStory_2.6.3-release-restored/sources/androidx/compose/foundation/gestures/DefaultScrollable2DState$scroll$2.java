package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DefaultScrollable2DState$scroll$2", m556f = "Scrollable2DState.kt", m557l = {146}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class DefaultScrollable2DState$scroll$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $block;
    final /* synthetic */ MutatePriority $scrollPriority;
    int label;
    final /* synthetic */ AbstractC1368 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultScrollable2DState$scroll$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世楪哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰世楪哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DefaultScrollable2DState$scroll$2$1", m556f = "Scrollable2DState.kt", m557l = {149}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00371 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7383 $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractC1368 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00371(AbstractC1368 abstractC1368, InterfaceC7383 interfaceC7383, InterfaceC5189<? super C00371> interfaceC5189) {
            super(2, interfaceC5189);
            this.$block = interfaceC7383;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00371 c00371 = new C00371(null, this.$block, interfaceC5189);
            c00371.L$0 = obj;
            return c00371;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC1390 interfaceC1390, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00371) create(interfaceC1390, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        
            throw null;
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
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC6017.m10769(obj);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultScrollable2DState$scroll$2(AbstractC1368 abstractC1368, MutatePriority mutatePriority, InterfaceC7383 interfaceC7383, InterfaceC5189<? super DefaultScrollable2DState$scroll$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$scrollPriority = mutatePriority;
        this.$block = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new DefaultScrollable2DState$scroll$2(null, this.$scrollPriority, this.$block, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DefaultScrollable2DState$scroll$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            return C6008.f15084;
        }
        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
