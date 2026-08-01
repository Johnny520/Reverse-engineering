package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC0330;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.ScrollableKt$semanticsScrollBy$2", f = "Scrollable.kt", l = {1150}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏哲兰楪世;)V"}, k = 3, mv = {2, 1, 0})
final class ScrollableKt$semanticsScrollBy$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref$FloatRef $previousValue;
    final /* synthetic */ C0502 $this_semanticsScrollBy;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$semanticsScrollBy$2(C0502 c0502, long j, Ref$FloatRef ref$FloatRef, InterfaceC4357<? super ScrollableKt$semanticsScrollBy$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_semanticsScrollBy = c0502;
        this.$offset = j;
        this.$previousValue = ref$FloatRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0(Ref$FloatRef ref$FloatRef, C0502 c0502, InterfaceC0557 interfaceC0557, float f, float f2) {
        long jM1268 = c0502.m1268(c0502.m1264(f - ref$FloatRef.element));
        C0502 c05022 = ((C0515) interfaceC0557).f1514;
        ref$FloatRef.element += c0502.m1264(c0502.m1269(c05022.m1265(c05022.f1496, jM1268, 1)));
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ScrollableKt$semanticsScrollBy$2 scrollableKt$semanticsScrollBy$2 = new ScrollableKt$semanticsScrollBy$2(this.$this_semanticsScrollBy, this.$offset, this.$previousValue, interfaceC4357);
        scrollableKt$semanticsScrollBy$2.L$0 = obj;
        return scrollableKt$semanticsScrollBy$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC0557 interfaceC0557, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ScrollableKt$semanticsScrollBy$2) create(interfaceC0557, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            final InterfaceC0557 interfaceC0557 = (InterfaceC0557) this.L$0;
            float fM1269 = this.$this_semanticsScrollBy.m1269(this.$offset);
            final Ref$FloatRef ref$FloatRef = this.$previousValue;
            final C0502 c0502 = this.$this_semanticsScrollBy;
            InterfaceC6554 interfaceC6554 = new InterfaceC6554() { // from class: androidx.compose.foundation.gestures.飘花落叶言子哲世苏楪兰
                @Override // p052.InterfaceC6554
                public final Object invoke(Object obj2, Object obj3) {
                    return ScrollableKt$semanticsScrollBy$2.invokeSuspend$lambda$0(ref$FloatRef, c0502, interfaceC0557, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                }
            };
            this.label = 1;
            if (AbstractC0330.m1024(0.0f, fM1269, null, interfaceC6554, this, 12) == coroutineSingletons) {
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
