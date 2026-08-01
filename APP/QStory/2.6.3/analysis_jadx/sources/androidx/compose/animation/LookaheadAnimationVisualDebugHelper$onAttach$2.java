package androidx.compose.animation;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.AbstractC0336;
import androidx.compose.animation.core.C0306;
import androidx.compose.animation.core.C0331;
import androidx.compose.animation.core.RepeatMode;
import com.google.protobuf.DescriptorProtos$Edition;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.animation.LookaheadAnimationVisualDebugHelper$onAttach$2", f = "LookaheadAnimationVisualDebugHelper.kt", l = {114, 115}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class LookaheadAnimationVisualDebugHelper$onAttach$2 extends SuspendLambda implements InterfaceC6554 {
    int label;
    final /* synthetic */ AbstractC0378 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LookaheadAnimationVisualDebugHelper$onAttach$2(AbstractC0378 abstractC0378, InterfaceC4357<? super LookaheadAnimationVisualDebugHelper$onAttach$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = abstractC0378;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new LookaheadAnimationVisualDebugHelper$onAttach$2(this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((LookaheadAnimationVisualDebugHelper$onAttach$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            this.this$0.getClass();
            new Float(0.0f);
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            AbstractC5185.m10210(obj);
            this.this$0.getClass();
            Float f = new Float(1.0f);
            C0306 c0306M1019 = AbstractC0330.m1019(AbstractC0330.m1013(DescriptorProtos$Edition.EDITION_2023_VALUE, 2, AbstractC0336.f1141), RepeatMode.Restart, 0L, 4);
            this.label = 2;
            if (C0331.m1029(null, f, c0306M1019, null, null, this, 12) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
