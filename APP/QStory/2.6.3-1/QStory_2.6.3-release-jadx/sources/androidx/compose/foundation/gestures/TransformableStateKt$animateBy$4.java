package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1191;
import androidx.compose.animation.core.C1196;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2230;
import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TransformableStateKt$animateBy$4", m556f = "TransformableState.kt", m557l = {413}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TransformableStateKt$animateBy$4 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC1316 $animationSpec;
    final /* synthetic */ long $centroid;
    final /* synthetic */ Ref$ObjectRef<C1377> $previousState;
    final /* synthetic */ C1377 $targetState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateBy$4(Ref$ObjectRef<C1377> ref$ObjectRef, C1377 c1377, AbstractC1316 abstractC1316, long j, InterfaceC5189<? super TransformableStateKt$animateBy$4> interfaceC5189) {
        super(2, interfaceC5189);
        this.$previousState = ref$ObjectRef;
        this.$targetState = c1377;
        this.$centroid = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
    public static final C6008 invokeSuspend$lambda$0(Ref$ObjectRef ref$ObjectRef, InterfaceC1334 interfaceC1334, long j, C1191 c1191) {
        if (((C1377) ref$ObjectRef.element).f1907 != 0.0f) {
            float f = ((C1377) ((AbstractC2182) c1191.f1528).getValue()).f1907;
            float f2 = ((C1377) ref$ObjectRef.element).f1907;
        }
        InterfaceC2230 interfaceC2230 = c1191.f1528;
        float f3 = ((C1377) ((AbstractC2182) interfaceC2230).getValue()).f1905;
        float f4 = ((C1377) ref$ObjectRef.element).f1905;
        AbstractC2182 abstractC2182 = (AbstractC2182) interfaceC2230;
        C8158.m13085(((C1377) abstractC2182.getValue()).f1906, ((C1377) ref$ObjectRef.element).f1906);
        interfaceC1334.m1813();
        ref$ObjectRef.element = abstractC2182.getValue();
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TransformableStateKt$animateBy$4 transformableStateKt$animateBy$4 = new TransformableStateKt$animateBy$4(this.$previousState, this.$targetState, null, this.$centroid, interfaceC5189);
        transformableStateKt$animateBy$4.L$0 = obj;
        return transformableStateKt$animateBy$4;
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
        if (i == 0) {
            AbstractC6017.m10769(obj);
            if (this.L$0 != null) {
                C3775.m6954();
                return null;
            }
            C1196 c1196M1570 = AbstractC1176.m1570(C1381.f1911, this.$previousState.element, AbstractC1362.f1877);
            C1377 c1377 = this.$targetState;
            C1332 c1332 = new C1332(this.$previousState, this.$centroid, 0);
            this.label = 1;
            if (AbstractC1176.m1585(c1196M1570, c1377, null, false, c1332, this, 4) == coroutineSingletons) {
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
        return ((TransformableStateKt$animateBy$4) create(interfaceC1334, interfaceC5189)).invokeSuspend(C6008.f15084);
    }
}
