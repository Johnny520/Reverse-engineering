package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.AbstractC0336;
import androidx.compose.animation.core.C0331;
import androidx.compose.animation.core.C0362;
import com.android.dx.io.Opcodes;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.TabRowKt$TabRowWithContour$1$1$1", f = "TabRow.kt", l = {Opcodes.MUL_INT_LIT16}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class TabRowKt$TabRowWithContour$1$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0331 $indicatorOffset;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ float $spacingPx;
    final /* synthetic */ float $tabWidthPx;
    float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRowWithContour$1$1$1(int i, float f, float f2, C0331 c0331, InterfaceC4356<? super TabRowKt$TabRowWithContour$1$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$selectedTabIndex = i;
        this.$tabWidthPx = f;
        this.$spacingPx = f2;
        this.$indicatorOffset = c0331;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new TabRowKt$TabRowWithContour$1$1$1(this.$selectedTabIndex, this.$tabWidthPx, this.$spacingPx, this.$indicatorOffset, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((TabRowKt$TabRowWithContour$1$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            float f = (this.$tabWidthPx + this.$spacingPx) * this.$selectedTabIndex;
            C0331 c0331 = this.$indicatorOffset;
            Float f2 = new Float(f);
            C0362 c0362M1012 = AbstractC0330.m1012(200, 2, AbstractC0336.f1141);
            this.F$0 = f;
            this.label = 1;
            if (C0331.m1028(c0331, f2, c0362M1012, null, null, this, 12) == coroutineSingletons) {
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
