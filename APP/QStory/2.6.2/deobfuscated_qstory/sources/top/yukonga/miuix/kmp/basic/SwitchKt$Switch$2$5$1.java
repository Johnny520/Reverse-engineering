package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.interaction.C0570;
import androidx.compose.foundation.interaction.C0573;
import androidx.compose.foundation.interaction.InterfaceC0580;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import p112.C7328;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.SwitchKt$Switch$2$5$1", f = "Switch.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "<unused var>", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 3, 0})
final class SwitchKt$Switch$2$5$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ InterfaceC1395 $currentDragInteraction$delegate;
    final /* synthetic */ InterfaceC1395 $hasVibrated$delegate;
    final /* synthetic */ InterfaceC1395 $hasVibratedOnce$delegate;
    final /* synthetic */ InterfaceC0580 $interactionSource;
    final /* synthetic */ InterfaceC1397 $rawDragOffset$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$Switch$2$5$1(InterfaceC0580 interfaceC0580, InterfaceC1395 interfaceC1395, InterfaceC1395 interfaceC13952, InterfaceC1395 interfaceC13953, InterfaceC1397 interfaceC1397, InterfaceC4356<? super SwitchKt$Switch$2$5$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$interactionSource = interfaceC0580;
        this.$currentDragInteraction$delegate = interfaceC1395;
        this.$hasVibrated$delegate = interfaceC13952;
        this.$hasVibratedOnce$delegate = interfaceC13953;
        this.$rawDragOffset$delegate = interfaceC1397;
    }

    @Override // p052.InterfaceC6550
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m11319invoked4ec7I((InterfaceC5400) obj, ((C7328) obj2).f19546, (InterfaceC4356) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m11319invoked4ec7I(InterfaceC5400 interfaceC5400, long j, InterfaceC4356<? super C5175> interfaceC4356) {
        return new SwitchKt$Switch$2$5$1(this.$interactionSource, this.$currentDragInteraction$delegate, this.$hasVibrated$delegate, this.$hasVibratedOnce$delegate, this.$rawDragOffset$delegate, interfaceC4356).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        InterfaceC1395 interfaceC1395 = this.$currentDragInteraction$delegate;
        C0570 c0570 = new C0570();
        ((C0573) this.$interactionSource).m1343(c0570);
        interfaceC1395.setValue(c0570);
        this.$hasVibrated$delegate.setValue(Boolean.TRUE);
        this.$hasVibratedOnce$delegate.setValue(Boolean.FALSE);
        ((AbstractC1349) this.$rawDragOffset$delegate).m2425(0.0f);
        return C5175.f14739;
    }
}
