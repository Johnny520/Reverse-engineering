package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC0330;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1150}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, k = 3, mv = {2, 1, 0})
final class ScrollableKt$semanticsScrollBy$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref$FloatRef $previousValue;
    final /* synthetic */ C0502 $this_semanticsScrollBy;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$semanticsScrollBy$2(C0502 c0502, long j, Ref$FloatRef ref$FloatRef, InterfaceC4356<? super ScrollableKt$semanticsScrollBy$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_semanticsScrollBy = c0502;
        this.$offset = j;
        this.$previousValue = ref$FloatRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(Ref$FloatRef ref$FloatRef, C0502 c0502, InterfaceC0557 interfaceC0557, float f, float f2) {
        long jM1258 = c0502.m1258(c0502.m1254(f - ref$FloatRef.element));
        C0502 c05022 = ((C0515) interfaceC0557).f1513;
        ref$FloatRef.element += c0502.m1254(c0502.m1259(c05022.m1255(c05022.f1495, jM1258, 1)));
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.$this_semanticsScrollBy, this.$offset, this.$previousValue, interfaceC4356);
        scrollableKt$semanticsScrollBy$2.L$0 = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC0557 interfaceC0557, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ScrollableKt$semanticsScrollBy$2) create(interfaceC0557, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            final InterfaceC0557 interfaceC0557 = (InterfaceC0557) this.L$0;
            float fM1259 = this.$this_semanticsScrollBy.m1259(this.$offset);
            final Ref$FloatRef ref$FloatRef = this.$previousValue;
            final C0502 c0502 = this.$this_semanticsScrollBy;
            InterfaceC6553 interfaceC6553 = new InterfaceC6553() { // from class: androidx.compose.foundation.gestures.飘花落叶言子哲世苏楪兰
                @Override // p052.InterfaceC6553
                public final Object invoke(Object obj2, Object obj3) {
                    return ScrollableKt$semanticsScrollBy$2.invokeSuspend$lambda$0(ref$FloatRef, c0502, interfaceC0557, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                }
            };
            this.label = 1;
            if (AbstractC0330.m1023(0.0f, fM1259, null, interfaceC6553, this, 12) == coroutineSingletons) {
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
