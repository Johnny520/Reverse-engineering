package androidx.compose.material3;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.WideNavigationRailKt$ModalWideNavigationRailContent$4$1", f = "WideNavigationRail.kt", l = {1042}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;F)V"}, k = 3, mv = {2, 0, 0})
final class WideNavigationRailKt$ModalWideNavigationRailContent$4$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC6554 $settleToDismiss;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WideNavigationRailKt$ModalWideNavigationRailContent$4$1(InterfaceC6554 interfaceC6554, InterfaceC4357<? super WideNavigationRailKt$ModalWideNavigationRailContent$4$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$settleToDismiss = interfaceC6554;
    }

    public final Object invoke(InterfaceC5401 interfaceC5401, float f, InterfaceC4357<? super C5176> interfaceC4357) {
        WideNavigationRailKt$ModalWideNavigationRailContent$4$1 wideNavigationRailKt$ModalWideNavigationRailContent$4$1 = new WideNavigationRailKt$ModalWideNavigationRailContent$4$1(this.$settleToDismiss, interfaceC4357);
        wideNavigationRailKt$ModalWideNavigationRailContent$4$1.F$0 = f;
        return wideNavigationRailKt$ModalWideNavigationRailContent$4$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            float f = this.F$0;
            InterfaceC6554 interfaceC6554 = this.$settleToDismiss;
            Float f2 = new Float(f);
            this.label = 1;
            if (interfaceC6554.invoke(f2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }

    @Override // p052.InterfaceC6551
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC5401) obj, ((Number) obj2).floatValue(), (InterfaceC4357<? super C5176>) obj3);
    }
}
