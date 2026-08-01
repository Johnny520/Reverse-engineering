package top.yukonga.miuix.kmp.utils;

import androidx.compose.runtime.InterfaceC1395;
import androidx.profileinstaller.AbstractC2442;
import java.util.Iterator;
import java.util.List;
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
@InterfaceC6861(c = "top.yukonga.miuix.kmp.utils.MiuixPopupUtils$Companion$PopupLayout$3$1", f = "MiuixPopupUtils.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class MiuixPopupUtils$Companion$PopupLayout$3$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ List<AbstractC6069> $popupStates;
    final /* synthetic */ AbstractC6069 $state;
    final /* synthetic */ InterfaceC1395 $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiuixPopupUtils$Companion$PopupLayout$3$1(InterfaceC1395 interfaceC1395, List<AbstractC6069> list, AbstractC6069 abstractC6069, InterfaceC4356<? super MiuixPopupUtils$Companion$PopupLayout$3$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$visible = interfaceC1395;
        this.$popupStates = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new MiuixPopupUtils$Companion$PopupLayout$3$1(this.$visible, this.$popupStates, null, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((MiuixPopupUtils$Companion$PopupLayout$3$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        if (((Boolean) this.$visible.getValue()).booleanValue()) {
            List<AbstractC6069> list = this.$popupStates;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                if (it.hasNext()) {
                    throw AbstractC2442.m4568(it);
                }
            }
            this.$popupStates.add(null);
        }
        return C5175.f14739;
    }
}
