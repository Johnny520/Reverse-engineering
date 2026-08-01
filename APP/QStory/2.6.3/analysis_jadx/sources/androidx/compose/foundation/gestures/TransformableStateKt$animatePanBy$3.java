package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0345;
import androidx.compose.animation.core.C0350;
import androidx.compose.animation.core.InterfaceC0349;
import androidx.compose.runtime.AbstractC1347;
import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$3", f = "TransformableState.kt", l = {324}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子兰楪苏哲世;)V"}, k = 3, mv = {2, 1, 0})
final class TransformableStateKt$animatePanBy$3 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC0349 $animationSpec;
    final /* synthetic */ long $centroid;
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref$LongRef $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animatePanBy$3(Ref$LongRef ref$LongRef, long j, InterfaceC0349 interfaceC0349, long j2, InterfaceC4357<? super TransformableStateKt$animatePanBy$3> interfaceC4357) {
        super(2, interfaceC4357);
        this.$previous = ref$LongRef;
        this.$offset = j;
        this.$animationSpec = interfaceC0349;
        this.$centroid = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, InterfaceC0493 interfaceC0493, long j, C0345 c0345) {
        C7329.m12526(((C7329) ((AbstractC1347) c0345.f1183).getValue()).f19541, ref$LongRef.element);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TransformableStateKt$animatePanBy$3 transformableStateKt$animatePanBy$3 = new TransformableStateKt$animatePanBy$3(this.$previous, this.$offset, this.$animationSpec, this.$centroid, interfaceC4357);
        transformableStateKt$animatePanBy$3.L$0 = obj;
        return transformableStateKt$animatePanBy$3;
    }

    @Override // p052.InterfaceC6554
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (obj == null) {
            return invoke((InterfaceC0493) null, (InterfaceC4357<? super C5176>) obj2);
        }
        C2942.m6394();
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            if (this.L$0 != null) {
                C2942.m6394();
                return null;
            }
            C0350 c0350 = new C0350(AbstractC0330.f1116, new C7329(this.$previous.element), null, 60);
            C7329 c7329 = new C7329(this.$offset);
            InterfaceC0349 interfaceC0349 = this.$animationSpec;
            C0491 c0491 = new C0491(this.$previous, this.$centroid, i2);
            this.label = 1;
            if (AbstractC0330.m1025(c0350, c7329, interfaceC0349, false, c0491, this, 4) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }

    public final Object invoke(InterfaceC0493 interfaceC0493, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TransformableStateKt$animatePanBy$3) create(interfaceC0493, interfaceC4357)).invokeSuspend(C5176.f14739);
    }
}
