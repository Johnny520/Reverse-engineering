package androidx.compose.material3;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1", f = "WideNavigationRail.kt", l = {538, 539}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(F)V"}, k = 3, mv = {2, 0, 0})
final class DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ AbstractC1156 $modalState;
    final /* synthetic */ AbstractC1157 $this_ModalWideNavigationRail;
    /* synthetic */ float F$0;
    int label;

    public DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1(AbstractC1157 abstractC1157, AbstractC1156 abstractC1156, InterfaceC4356<? super DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1 defaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1 = new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1(null, null, interfaceC4356);
        defaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1.F$0 = ((Number) obj).floatValue();
        return defaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1;
    }

    public final Object invoke(float f, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1) create(Float.valueOf(f), interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        if (i == 2) {
            AbstractC5184.m10206(obj);
            return C5175.f14739;
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).floatValue(), (InterfaceC4356<? super C5175>) obj2);
    }
}
