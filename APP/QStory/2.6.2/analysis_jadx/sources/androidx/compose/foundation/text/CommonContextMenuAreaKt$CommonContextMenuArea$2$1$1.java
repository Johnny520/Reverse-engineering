package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C0882;
import androidx.compose.runtime.InterfaceC1395;
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
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1", f = "CommonContextMenuArea.kt", l = {62}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0882 $manager;
    final /* synthetic */ InterfaceC1395 $menuItemsAvailability;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1(InterfaceC1395 interfaceC1395, C0882 c0882, InterfaceC4356<? super CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$menuItemsAvailability = interfaceC1395;
        this.$manager = c0882;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1(this.$menuItemsAvailability, this.$manager, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC1395 interfaceC1395;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC1395 interfaceC13952 = this.$menuItemsAvailability;
            C0882 c0882 = this.$manager;
            this.L$0 = interfaceC13952;
            this.label = 1;
            Object objM1894 = AbstractC0983.m1894(c0882, this);
            if (objM1894 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objM1894;
            interfaceC1395 = interfaceC13952;
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC1395 = (InterfaceC1395) this.L$0;
            AbstractC5184.m10206(obj);
        }
        interfaceC1395.setValue(obj);
        return C5175.f14739;
    }
}
