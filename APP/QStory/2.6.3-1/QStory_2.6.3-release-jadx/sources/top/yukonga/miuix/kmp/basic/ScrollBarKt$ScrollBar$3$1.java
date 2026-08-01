package top.yukonga.miuix.kmp.basic;

import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2232;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.C6077;
import kotlinx.coroutines.flow.C6116;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.ScrollBarKt$ScrollBar$3$1", m556f = "ScrollBar.kt", m557l = {303}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class ScrollBarKt$ScrollBar$3$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6836 $adapter;
    final /* synthetic */ InterfaceC6233 $coroutineScope;
    final /* synthetic */ InterfaceC2230 $hideJob$delegate;
    final /* synthetic */ boolean $isHighlighted;
    final /* synthetic */ InterfaceC2232 $opacity$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollBarKt$ScrollBar$3$1(InterfaceC6836 interfaceC6836, boolean z, InterfaceC6233 interfaceC6233, InterfaceC2232 interfaceC2232, InterfaceC2230 interfaceC2230, InterfaceC5189<? super ScrollBarKt$ScrollBar$3$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$isHighlighted = z;
        this.$coroutineScope = interfaceC6233;
        this.$opacity$delegate = interfaceC2232;
        this.$hideJob$delegate = interfaceC2230;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ScrollBarKt$ScrollBar$3$1(null, this.$isHighlighted, this.$coroutineScope, this.$opacity$delegate, this.$hideJob$delegate, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ScrollBarKt$ScrollBar$3$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C6116 c6116M3030 = AbstractC2202.m3030(new C6834(0));
            C6825 c6825 = new C6825(this.$isHighlighted, this.$coroutineScope, this.$opacity$delegate, this.$hideJob$delegate);
            this.label = 1;
            Object objMo9012 = c6116M3030.mo9012(new C6077(new Ref$IntRef(), c6825), this);
            if (objMo9012 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objMo9012 = c6008;
            }
            if (objMo9012 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return c6008;
    }
}
