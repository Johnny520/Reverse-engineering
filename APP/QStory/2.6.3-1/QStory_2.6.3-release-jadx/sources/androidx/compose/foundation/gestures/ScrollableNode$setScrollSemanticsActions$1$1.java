package androidx.compose.foundation.gestures;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$1$1", m556f = "Scrollable.kt", m557l = {606}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class ScrollableNode$setScrollSemanticsActions$1$1 extends SuspendLambda implements InterfaceC7383 {

    /* JADX INFO: renamed from: $x */
    final /* synthetic */ float f6$x;

    /* JADX INFO: renamed from: $y */
    final /* synthetic */ float f7$y;
    int label;
    final /* synthetic */ C1358 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$setScrollSemanticsActions$1$1(C1358 c1358, float f, float f2, InterfaceC5189<? super ScrollableNode$setScrollSemanticsActions$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1358;
        this.f6$x = f;
        this.f7$y = f2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new ScrollableNode$setScrollSemanticsActions$1$1(this.this$0, this.f6$x, this.f7$y, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ScrollableNode$setScrollSemanticsActions$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C1343 c1343 = this.this$0.f1868;
            float f = this.f6$x;
            float f2 = this.f7$y;
            long jFloatToRawIntBits = Float.floatToRawIntBits(f);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
            this.label = 1;
            if (AbstractC1339.m1819(c1343, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), this) == coroutineSingletons) {
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
}
