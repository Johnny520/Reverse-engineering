package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2232;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$5$1$1", m556f = "ScrollBar.kt", m557l = {345, 368}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class ScrollBarKt$ScrollBar$5$1$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ float $beforeTrackPaddingPx;
    final /* synthetic */ InterfaceC2230 $hideJob$delegate;
    final /* synthetic */ InterfaceC2230 $isDragging$delegate;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ InterfaceC2232 $opacity$delegate;
    final /* synthetic */ AbstractC6824 $sliderAdapter;
    final /* synthetic */ float $touchTargetPx;
    float F$0;
    float F$1;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollBarKt$ScrollBar$5$1$1(boolean z, float f, AbstractC6824 abstractC6824, float f2, InterfaceC2230 interfaceC2230, InterfaceC2232 interfaceC2232, InterfaceC2230 interfaceC22302, InterfaceC5189<? super ScrollBarKt$ScrollBar$5$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$isVertical = z;
        this.$touchTargetPx = f;
        this.$beforeTrackPaddingPx = f2;
        this.$isDragging$delegate = interfaceC2230;
        this.$opacity$delegate = interfaceC2232;
        this.$hideJob$delegate = interfaceC22302;
    }

    private static final C6008 invokeSuspend$lambda$0(AbstractC6824 abstractC6824, C2478 c2478) {
        AbstractC2481.m3591(c2478, false);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ScrollBarKt$ScrollBar$5$1$1 scrollBarKt$ScrollBar$5$1$1 = new ScrollBarKt$ScrollBar$5$1$1(this.$isVertical, this.$touchTargetPx, null, this.$beforeTrackPaddingPx, this.$isDragging$delegate, this.$opacity$delegate, this.$hideJob$delegate, interfaceC5189);
        scrollBarKt$ScrollBar$5$1$1.L$0 = obj;
        return scrollBarKt$ScrollBar$5$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ScrollBarKt$ScrollBar$5$1$1) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC2468 interfaceC2468 = (InterfaceC2468) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            this.L$0 = interfaceC2468;
            this.label = 1;
            obj = AbstractC1344.m1835(interfaceC2468, null, this, 2);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                this.$isDragging$delegate.setValue(Boolean.FALSE);
                return c6008;
            }
            AbstractC6017.m10769(obj);
        }
        C2478 c2478 = (C2478) obj;
        if (this.$isVertical) {
            if (Float.intBitsToFloat((int) (c2478.f5152 >> 32)) >= ((int) (((C2456) interfaceC2468).f5086.f5098 >> 32)) - this.$touchTargetPx) {
                throw null;
            }
        } else if (Float.intBitsToFloat((int) (c2478.f5152 & 4294967295L)) >= ((int) (((C2456) interfaceC2468).f5086.f5098 & 4294967295L)) - this.$touchTargetPx) {
            throw null;
        }
        return c6008;
    }
}
