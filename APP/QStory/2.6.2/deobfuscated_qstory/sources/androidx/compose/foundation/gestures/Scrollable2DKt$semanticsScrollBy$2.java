package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0357;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2", f = "Scrollable2D.kt", l = {515}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, k = 3, mv = {2, 1, 0})
final class Scrollable2DKt$semanticsScrollBy$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref$LongRef $previousValue;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scrollable2DKt$semanticsScrollBy$2(long j, Ref$LongRef ref$LongRef, InterfaceC4356<? super Scrollable2DKt$semanticsScrollBy$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$offset = j;
        this.$previousValue = ref$LongRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(Ref$LongRef ref$LongRef, InterfaceC0557 interfaceC0557, C7328 c7328, C7328 c73282) {
        long jM12499 = C7328.m12499(c7328.f19546, ref$LongRef.element);
        C0502 c0502 = ((C0515) interfaceC0557).f1513;
        ref$LongRef.element = C7328.m12498(ref$LongRef.element, c0502.m1255(c0502.f1495, jM12499, 1));
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        Scrollable2DKt$semanticsScrollBy$2 scrollable2DKt$semanticsScrollBy$2 = new Scrollable2DKt$semanticsScrollBy$2(this.$offset, this.$previousValue, interfaceC4356);
        scrollable2DKt$semanticsScrollBy$2.L$0 = obj;
        return scrollable2DKt$semanticsScrollBy$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC0557 interfaceC0557, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((Scrollable2DKt$semanticsScrollBy$2) create(interfaceC0557, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC0557 interfaceC0557 = (InterfaceC0557) this.L$0;
            C0357 c0357 = AbstractC0330.f1116;
            C7328 c7328 = new C7328(0L);
            C7328 c73282 = new C7328(this.$offset);
            C0551 c0551 = new C0551(this.$previousValue, interfaceC0557, i2);
            this.label = 1;
            if (AbstractC0330.m1006(c0357, c7328, c73282, null, AbstractC0330.m1013(0.0f, 0.0f, null, 7), c0551, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
