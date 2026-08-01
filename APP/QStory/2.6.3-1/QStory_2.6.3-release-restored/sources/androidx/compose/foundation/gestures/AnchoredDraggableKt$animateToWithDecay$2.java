package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0900;
import androidx.compose.animation.core.C1191;
import androidx.compose.animation.core.InterfaceC1180;
import androidx.compose.animation.core.InterfaceC1195;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2230;
import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p068.InterfaceC7381;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", m556f = "AnchoredDraggable.kt", m557l = {1425, 1443, 1467}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, m151d2 = {"T", "Landroidx/compose/foundation/gestures/飘花落叶言子楪世苏哲兰;", "Landroidx/compose/foundation/gestures/飘花落叶言子世兰哲楪苏;", "anchors", "latestTarget", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class AnchoredDraggableKt$animateToWithDecay$2 extends SuspendLambda implements InterfaceC7381 {
    final /* synthetic */ InterfaceC1180 $decayAnimationSpec;
    final /* synthetic */ Ref$FloatRef $remainingVelocity;
    final /* synthetic */ InterfaceC1195 $snapAnimationSpec;
    final /* synthetic */ AbstractC1378 $this_animateToWithDecay;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateToWithDecay$2(AbstractC1378 abstractC1378, float f, InterfaceC1195 interfaceC1195, Ref$FloatRef ref$FloatRef, InterfaceC1180 interfaceC1180, InterfaceC5189<? super AnchoredDraggableKt$animateToWithDecay$2> interfaceC5189) {
        super(4, interfaceC5189);
        this.$velocity = f;
        this.$snapAnimationSpec = interfaceC1195;
        this.$remainingVelocity = ref$FloatRef;
        this.$decayAnimationSpec = interfaceC1180;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final C6008 invokeSuspend$lambda$2(float f, Ref$FloatRef ref$FloatRef, InterfaceC1364 interfaceC1364, Ref$FloatRef ref$FloatRef2, C1191 c1191) {
        InterfaceC2230 interfaceC2230 = c1191.f1528;
        if (((Number) ((AbstractC2182) interfaceC2230).getValue()).floatValue() >= f || ref$FloatRef.element <= f) {
            AbstractC2182 abstractC2182 = (AbstractC2182) interfaceC2230;
            if (((Number) abstractC2182.getValue()).floatValue() <= f || ref$FloatRef.element >= f) {
                ((Number) abstractC2182.getValue()).floatValue();
                ((Number) c1191.m1605()).floatValue();
                interfaceC1364.m1875();
                ref$FloatRef2.element = ((Number) c1191.m1605()).floatValue();
                ref$FloatRef.element = ((Number) abstractC2182.getValue()).floatValue();
            } else {
                float fFloatValue = ((Number) ((AbstractC2182) interfaceC2230).getValue()).floatValue();
                if (f == 0.0f) {
                    f = 0.0f;
                } else if (f <= 0.0f ? fFloatValue >= f : fFloatValue <= f) {
                    f = fFloatValue;
                }
                ((Number) c1191.m1605()).floatValue();
                interfaceC1364.m1875();
                ref$FloatRef2.element = Float.isNaN(((Number) c1191.m1605()).floatValue()) ? 0.0f : ((Number) c1191.m1605()).floatValue();
                ref$FloatRef.element = f;
                c1191.m1606();
            }
        }
        return C6008.f15084;
    }

    public final Object invoke(InterfaceC1364 interfaceC1364, InterfaceC1302 interfaceC1302, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(null, this.$velocity, this.$snapAnimationSpec, this.$remainingVelocity, this.$decayAnimationSpec, interfaceC5189);
        anchoredDraggableKt$animateToWithDecay$2.L$0 = interfaceC1364;
        anchoredDraggableKt$animateToWithDecay$2.L$1 = interfaceC1302;
        anchoredDraggableKt$animateToWithDecay$2.L$2 = obj;
        return anchoredDraggableKt$animateToWithDecay$2.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            if (this.L$0 == null) {
                throw AbstractC0900.m719(this.L$1);
            }
            C3775.m6954();
            return null;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            this.$remainingVelocity.element = 0.0f;
        } else if (i == 2) {
            AbstractC6017.m10769(obj);
        } else {
            if (i != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$remainingVelocity.element = 0.0f;
        }
        return C6008.f15084;
    }

    @Override // p068.InterfaceC7381
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        if (obj != null) {
            C3775.m6954();
            return null;
        }
        if (obj2 == null) {
            return invoke((InterfaceC1364) null, (InterfaceC1302) null, obj3, (InterfaceC5189<? super C6008>) obj4);
        }
        C3775.m6954();
        return null;
    }
}
