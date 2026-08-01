package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.C1582;
import androidx.compose.foundation.lazy.C1584;
import com.android.p002dx.p005io.Opcodes;
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
@InterfaceC7691(m555c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", m556f = "LazyLayoutSemantics.kt", m557l = {Opcodes.AND_INT_LIT16}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ int $index;
    int label;
    final /* synthetic */ C1521 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(C1521 c1521, int i, InterfaceC5189<? super LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1521;
        this.$index = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(this.this$0, this.$index, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C1584 c1584 = this.this$0.f2249;
        int i2 = this.$index;
        this.label = 1;
        Object objM2109 = C1582.m2109(c1584.f2474, i2, this);
        if (objM2109 != coroutineSingletons) {
            objM2109 = c6008;
        }
        return objM2109 == coroutineSingletons ? coroutineSingletons : c6008;
    }
}
