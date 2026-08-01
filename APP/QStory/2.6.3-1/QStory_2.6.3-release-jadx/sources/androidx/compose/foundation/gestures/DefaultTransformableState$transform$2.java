package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.MutatePriority;
import com.alibaba.fastjson2.C3775;
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
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", m556f = "TransformableState.kt", m557l = {691}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class DefaultTransformableState$transform$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $block;
    final /* synthetic */ MutatePriority $transformPriority;
    int label;
    final /* synthetic */ AbstractC1317 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransformableState$transform$2(AbstractC1317 abstractC1317, MutatePriority mutatePriority, InterfaceC7383 interfaceC7383, InterfaceC5189<? super DefaultTransformableState$transform$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$transformPriority = mutatePriority;
        this.$block = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new DefaultTransformableState$transform$2(null, this.$transformPriority, this.$block, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DefaultTransformableState$transform$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", m556f = "TransformableState.kt", m557l = {694}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00391 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7383 $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AbstractC1317 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00391(AbstractC1317 abstractC1317, InterfaceC7383 interfaceC7383, InterfaceC5189<? super C00391> interfaceC5189) {
            super(2, interfaceC5189);
            this.$block = interfaceC7383;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00391 c00391 = new C00391(null, this.$block, interfaceC5189);
            c00391.L$0 = obj;
            return c00391;
        }

        @Override // p068.InterfaceC7383
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            if (obj == null) {
                return invoke((InterfaceC1334) null, (InterfaceC5189<? super C6008>) obj2);
            }
            C3775.m6954();
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
        
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
                throw AbstractC0900.m719(this.L$0);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC6017.m10769(obj);
            throw null;
        }

        public final Object invoke(InterfaceC1334 interfaceC1334, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00391) create(interfaceC1334, interfaceC5189)).invokeSuspend(C6008.f15084);
        }
    }
}
