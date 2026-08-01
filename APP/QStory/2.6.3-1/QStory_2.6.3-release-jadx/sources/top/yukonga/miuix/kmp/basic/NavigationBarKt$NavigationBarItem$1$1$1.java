package top.yukonga.miuix.kmp.basic;

import androidx.compose.foundation.gestures.InterfaceC1393;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.NavigationBarKt$NavigationBarItem$1$1$1", m556f = "NavigationBar.kt", m557l = {171}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/foundation/gestures/飘花落叶言子苏兰楪世哲;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class NavigationBarKt$NavigationBarItem$1$1$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC2230 $isPressed$delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$1$1$1(boolean z, InterfaceC2230 interfaceC2230, InterfaceC5189<? super NavigationBarKt$NavigationBarItem$1$1$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$enabled = z;
        this.$isPressed$delegate = interfaceC2230;
    }

    @Override // p068.InterfaceC7380
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m11926invoked4ec7I((InterfaceC1393) obj, ((C8158) obj2).f19886, (InterfaceC5189) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m11926invoked4ec7I(InterfaceC1393 interfaceC1393, long j, InterfaceC5189<? super C6008> interfaceC5189) {
        NavigationBarKt$NavigationBarItem$1$1$1 navigationBarKt$NavigationBarItem$1$1$1 = new NavigationBarKt$NavigationBarItem$1$1$1(this.$enabled, this.$isPressed$delegate, interfaceC5189);
        navigationBarKt$NavigationBarItem$1$1$1.L$0 = interfaceC1393;
        return navigationBarKt$NavigationBarItem$1$1$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC1393 interfaceC1393 = (InterfaceC1393) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            if (this.$enabled) {
                InterfaceC2230 interfaceC2230 = this.$isPressed$delegate;
                int i2 = AbstractC6847.f16784;
                interfaceC2230.setValue(Boolean.TRUE);
                this.L$0 = null;
                this.label = 1;
                if (interfaceC1393.mo1891(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return C6008.f15084;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC2230 interfaceC22302 = this.$isPressed$delegate;
        int i3 = AbstractC6847.f16784;
        interfaceC22302.setValue(Boolean.FALSE);
        return C6008.f15084;
    }
}
