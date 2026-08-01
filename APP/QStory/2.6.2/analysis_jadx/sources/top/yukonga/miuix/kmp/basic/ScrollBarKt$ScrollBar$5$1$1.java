package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.gestures.AbstractC0503;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1621;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$5$1$1", f = "ScrollBar.kt", l = {345, 368}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 3, 0})
final class ScrollBarKt$ScrollBar$5$1$1 extends RestrictedSuspendLambda implements InterfaceC6553 {
    final /* synthetic */ float $beforeTrackPaddingPx;
    final /* synthetic */ InterfaceC1395 $hideJob$delegate;
    final /* synthetic */ InterfaceC1395 $isDragging$delegate;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ InterfaceC1397 $opacity$delegate;
    final /* synthetic */ AbstractC5988 $sliderAdapter;
    final /* synthetic */ float $touchTargetPx;
    float F$0;
    float F$1;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollBarKt$ScrollBar$5$1$1(boolean z, float f, AbstractC5988 abstractC5988, float f2, InterfaceC1395 interfaceC1395, InterfaceC1397 interfaceC1397, InterfaceC1395 interfaceC13952, InterfaceC4356<? super ScrollBarKt$ScrollBar$5$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$isVertical = z;
        this.$touchTargetPx = f;
        this.$beforeTrackPaddingPx = f2;
        this.$isDragging$delegate = interfaceC1395;
        this.$opacity$delegate = interfaceC1397;
        this.$hideJob$delegate = interfaceC13952;
    }

    private static final C5175 invokeSuspend$lambda$0(AbstractC5988 abstractC5988, C1643 c1643) {
        AbstractC1646.m3021(c1643, false);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ScrollBarKt$ScrollBar$5$1$1 scrollBarKt$ScrollBar$5$1$1 = new ScrollBarKt$ScrollBar$5$1$1(this.$isVertical, this.$touchTargetPx, null, this.$beforeTrackPaddingPx, this.$isDragging$delegate, this.$opacity$delegate, this.$hideJob$delegate, interfaceC4356);
        scrollBarKt$ScrollBar$5$1$1.L$0 = obj;
        return scrollBarKt$ScrollBar$5$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ScrollBarKt$ScrollBar$5$1$1) create(interfaceC1633, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC1633 interfaceC1633 = (InterfaceC1633) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            this.L$0 = interfaceC1633;
            this.label = 1;
            obj = AbstractC0503.m1265(interfaceC1633, null, this, 2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
                this.$isDragging$delegate.setValue(Boolean.FALSE);
                return c5175;
            }
            AbstractC5184.m10206(obj);
        }
        C1643 c1643 = (C1643) obj;
        if (this.$isVertical) {
            if (Float.intBitsToFloat((int) (c1643.f4806 >> 32)) >= ((int) (((C1621) interfaceC1633).f4740.f4752 >> 32)) - this.$touchTargetPx) {
                throw null;
            }
        } else if (Float.intBitsToFloat((int) (c1643.f4806 & 4294967295L)) >= ((int) (((C1621) interfaceC1633).f4740.f4752 & 4294967295L)) - this.$touchTargetPx) {
            throw null;
        }
        return c5175;
    }
}
