package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.AbstractC1182;
import androidx.compose.animation.core.C1152;
import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.RepeatMode;
import com.google.protobuf.DescriptorProtos$Edition;
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
@InterfaceC7691(m555c = "androidx.compose.animation.LookaheadAnimationVisualDebugHelper$onAttach$2", m556f = "LookaheadAnimationVisualDebugHelper.kt", m557l = {114, 115}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class LookaheadAnimationVisualDebugHelper$onAttach$2 extends SuspendLambda implements InterfaceC7383 {
    int label;
    final /* synthetic */ AbstractC1224 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookaheadAnimationVisualDebugHelper$onAttach$2(AbstractC1224 abstractC1224, InterfaceC5189<? super LookaheadAnimationVisualDebugHelper$onAttach$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = abstractC1224;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new LookaheadAnimationVisualDebugHelper$onAttach$2(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((LookaheadAnimationVisualDebugHelper$onAttach$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            this.this$0.getClass();
            new Float(0.0f);
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            this.this$0.getClass();
            Float f = new Float(1.0f);
            C1152 c1152M1579 = AbstractC1176.m1579(AbstractC1176.m1573(DescriptorProtos$Edition.EDITION_2023_VALUE, 2, AbstractC1182.f1486), RepeatMode.Restart, 0L, 4);
            this.label = 2;
            if (C1177.m1589(null, f, c1152M1579, null, null, this, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
