package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0357;
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
@InterfaceC6862(c = "androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2", f = "Scrollable2D.kt", l = {515}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, k = 3, mv = {2, 1, 0})
final class Scrollable2DKt$semanticsScrollBy$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref$LongRef $previousValue;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scrollable2DKt$semanticsScrollBy$2(long j, Ref$LongRef ref$LongRef, InterfaceC4357<? super Scrollable2DKt$semanticsScrollBy$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$offset = j;
        this.$previousValue = ref$LongRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, InterfaceC0557 interfaceC0557, C7329 c7329, C7329 c73292) {
        long jM12526 = C7329.m12526(c7329.f19541, ref$LongRef.element);
        C0502 c0502 = ((C0515) interfaceC0557).f1514;
        ref$LongRef.element = C7329.m12525(ref$LongRef.element, c0502.m1265(c0502.f1496, jM12526, 1));
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        Scrollable2DKt$semanticsScrollBy$2 scrollable2DKt$semanticsScrollBy$2 = new Scrollable2DKt$semanticsScrollBy$2(this.$offset, this.$previousValue, interfaceC4357);
        scrollable2DKt$semanticsScrollBy$2.L$0 = obj;
        return scrollable2DKt$semanticsScrollBy$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC0557 interfaceC0557, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((Scrollable2DKt$semanticsScrollBy$2) create(interfaceC0557, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC0557 interfaceC0557 = (InterfaceC0557) this.L$0;
            C0357 c0357 = AbstractC0330.f1116;
            C7329 c7329 = new C7329(0L);
            C7329 c73292 = new C7329(this.$offset);
            C0551 c0551 = new C0551(this.$previousValue, interfaceC0557, i2);
            this.label = 1;
            if (AbstractC0330.m1007(c0357, c7329, c73292, null, AbstractC0330.m1014(0.0f, 0.0f, null, 7), c0551, this) == coroutineSingletons) {
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
}
