package androidx.compose.material3;

import androidx.compose.runtime.InterfaceC1395;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.WideNavigationRailKt$Scrim$2$1", f = "WideNavigationRail.kt", l = {1130}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class WideNavigationRailKt$Scrim$2$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC1395 $dismiss$delegate;
    final /* synthetic */ InterfaceC6557 $onDismissRequest;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WideNavigationRailKt$Scrim$2$1(InterfaceC6557 interfaceC6557, InterfaceC1395 interfaceC1395, InterfaceC4356<? super WideNavigationRailKt$Scrim$2$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$onDismissRequest = interfaceC6557;
        this.$dismiss$delegate = interfaceC1395;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new WideNavigationRailKt$Scrim$2$1(this.$onDismissRequest, this.$dismiss$delegate, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((WideNavigationRailKt$Scrim$2$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC1395 interfaceC1395 = this.$dismiss$delegate;
            int i2 = AbstractC1163.f3322;
            if (((Boolean) interfaceC1395.getValue()).booleanValue()) {
                InterfaceC6557 interfaceC6557 = this.$onDismissRequest;
                this.label = 1;
                if (interfaceC6557.invoke(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
