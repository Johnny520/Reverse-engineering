package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1191;
import androidx.compose.animation.core.C1196;
import androidx.compose.animation.core.InterfaceC1195;
import androidx.compose.runtime.AbstractC2182;
import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$3", m556f = "TransformableState.kt", m557l = {324}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TransformableStateKt$animatePanBy$3 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1195 $animationSpec;
    final /* synthetic */ long $centroid;
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref$LongRef $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animatePanBy$3(Ref$LongRef ref$LongRef, long j, InterfaceC1195 interfaceC1195, long j2, InterfaceC5189<? super TransformableStateKt$animatePanBy$3> interfaceC5189) {
        super(2, interfaceC5189);
        this.$previous = ref$LongRef;
        this.$offset = j;
        this.$animationSpec = interfaceC1195;
        this.$centroid = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, InterfaceC1334 interfaceC1334, long j, C1191 c1191) {
        C8158.m13085(((C8158) ((AbstractC2182) c1191.f1528).getValue()).f19886, ref$LongRef.element);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TransformableStateKt$animatePanBy$3 transformableStateKt$animatePanBy$3 = new TransformableStateKt$animatePanBy$3(this.$previous, this.$offset, this.$animationSpec, this.$centroid, interfaceC5189);
        transformableStateKt$animatePanBy$3.L$0 = obj;
        return transformableStateKt$animatePanBy$3;
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
            C1196 c1196 = new C1196(AbstractC1176.f1461, new C8158(this.$previous.element), null, 60);
            C8158 c8158 = new C8158(this.$offset);
            InterfaceC1195 interfaceC1195 = this.$animationSpec;
            C1332 c1332 = new C1332(this.$previous, this.$centroid, i2);
            this.label = 1;
            if (AbstractC1176.m1585(c1196, c8158, interfaceC1195, false, c1332, this, 4) == coroutineSingletons) {
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
        return ((TransformableStateKt$animatePanBy$3) create(interfaceC1334, interfaceC5189)).invokeSuspend(C6008.f15084);
    }
}
