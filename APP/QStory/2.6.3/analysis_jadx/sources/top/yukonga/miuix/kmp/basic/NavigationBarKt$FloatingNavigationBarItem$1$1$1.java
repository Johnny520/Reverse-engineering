package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.gestures.InterfaceC0552;
import androidx.compose.runtime.InterfaceC1395;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.NavigationBarKt$FloatingNavigationBarItem$1$1$1", f = "NavigationBar.kt", l = {411}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 3, 0})
final class NavigationBarKt$FloatingNavigationBarItem$1$1$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC1395 $isPressed$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$FloatingNavigationBarItem$1$1$1(boolean z, InterfaceC1395 interfaceC1395, InterfaceC4357<? super NavigationBarKt$FloatingNavigationBarItem$1$1$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$enabled = z;
        this.$isPressed$delegate = interfaceC1395;
    }

    @Override // p052.InterfaceC6551
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m11366invoked4ec7I((InterfaceC0552) obj, ((C7329) obj2).f19541, (InterfaceC4357) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m11366invoked4ec7I(InterfaceC0552 interfaceC0552, long j, InterfaceC4357<? super C5176> interfaceC4357) {
        NavigationBarKt$FloatingNavigationBarItem$1$1$1 navigationBarKt$FloatingNavigationBarItem$1$1$1 = new NavigationBarKt$FloatingNavigationBarItem$1$1$1(this.$enabled, this.$isPressed$delegate, interfaceC4357);
        navigationBarKt$FloatingNavigationBarItem$1$1$1.L$0 = interfaceC0552;
        return navigationBarKt$FloatingNavigationBarItem$1$1$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC0552 interfaceC0552 = (InterfaceC0552) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            if (this.$enabled) {
                InterfaceC1395 interfaceC1395 = this.$isPressed$delegate;
                int i2 = AbstractC6017.f16439;
                interfaceC1395.setValue(Boolean.TRUE);
                this.L$0 = null;
                this.label = 1;
                if (interfaceC0552.mo1331(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return C5176.f14739;
        }
        if (i != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        InterfaceC1395 interfaceC13952 = this.$isPressed$delegate;
        int i3 = AbstractC6017.f16439;
        interfaceC13952.setValue(Boolean.FALSE);
        return C5176.f14739;
    }
}
