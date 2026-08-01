package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1191;
import androidx.compose.animation.core.C1196;
import androidx.compose.animation.core.InterfaceC1195;
import androidx.compose.runtime.AbstractC2182;
import com.alibaba.fastjson2.C3775;
import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$4", m556f = "TransformableState.kt", m557l = {Opcodes.INVOKE_CUSTOM}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TransformableStateKt$animateZoomBy$4 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1195 $animationSpec;
    final /* synthetic */ long $centroid;
    final /* synthetic */ Ref$FloatRef $previous;
    final /* synthetic */ float $zoomFactor;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateZoomBy$4(Ref$FloatRef ref$FloatRef, float f, InterfaceC1195 interfaceC1195, long j, InterfaceC5189<? super TransformableStateKt$animateZoomBy$4> interfaceC5189) {
        super(2, interfaceC5189);
        this.$previous = ref$FloatRef;
        this.$zoomFactor = f;
        this.$animationSpec = interfaceC1195;
        this.$centroid = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(Ref$FloatRef ref$FloatRef, InterfaceC1334 interfaceC1334, long j, C1191 c1191) {
        if (ref$FloatRef.element != 0.0f) {
            ((Number) ((AbstractC2182) c1191.f1528).getValue()).floatValue();
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TransformableStateKt$animateZoomBy$4 transformableStateKt$animateZoomBy$4 = new TransformableStateKt$animateZoomBy$4(this.$previous, this.$zoomFactor, this.$animationSpec, this.$centroid, interfaceC5189);
        transformableStateKt$animateZoomBy$4.L$0 = obj;
        return transformableStateKt$animateZoomBy$4;
    }

    @Override // p068.InterfaceC7383
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (obj == null) {
            return invoke((InterfaceC1334) null, (InterfaceC5189<? super C6008>) obj2);
        }
        C3775.m6954();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            if (this.L$0 != null) {
                C3775.m6954();
                return null;
            }
            C1196 c1196M1571 = AbstractC1176.m1571(this.$previous.element, 0.0f, 30);
            Float f = new Float(this.$zoomFactor);
            InterfaceC1195 interfaceC1195 = this.$animationSpec;
            C1327 c1327 = new C1327(this.$previous, this.$centroid, i2);
            this.label = 1;
            if (AbstractC1176.m1585(c1196M1571, f, interfaceC1195, false, c1327, this, 4) == coroutineSingletons) {
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

    public final Object invoke(InterfaceC1334 interfaceC1334, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TransformableStateKt$animateZoomBy$4) create(interfaceC1334, interfaceC5189)).invokeSuspend(C6008.f15084);
    }
}
