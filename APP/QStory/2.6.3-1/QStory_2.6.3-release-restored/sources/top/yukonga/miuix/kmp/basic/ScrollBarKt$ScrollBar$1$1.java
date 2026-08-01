package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.InterfaceC2233;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p069.AbstractC7390;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$1$1", m556f = "ScrollBar.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class ScrollBarKt$ScrollBar$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2233 $containerSize$delegate;
    final /* synthetic */ AbstractC6824 $sliderAdapter;
    final /* synthetic */ float $totalTrackPaddingPx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollBarKt$ScrollBar$1$1(AbstractC6824 abstractC6824, float f, InterfaceC2233 interfaceC2233, InterfaceC5189<? super ScrollBarKt$ScrollBar$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$totalTrackPaddingPx = f;
        this.$containerSize$delegate = interfaceC2233;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ScrollBarKt$ScrollBar$1$1(null, this.$totalTrackPaddingPx, this.$containerSize$delegate, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ScrollBarKt$ScrollBar$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC6017.m10769(obj);
        ((AbstractC2181) this.$containerSize$delegate).m2992();
        AbstractC7390.m12617(this.$totalTrackPaddingPx);
        throw null;
    }
}
