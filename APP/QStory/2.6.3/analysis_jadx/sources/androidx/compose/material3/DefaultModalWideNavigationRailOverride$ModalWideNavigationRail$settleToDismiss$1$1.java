package androidx.compose.material3;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1", f = "WideNavigationRail.kt", l = {538, 539}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(F)V"}, k = 3, mv = {2, 0, 0})
final class DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC1156 $modalState;
    final /* synthetic */ AbstractC1157 $this_ModalWideNavigationRail;
    /* synthetic */ float F$0;
    int label;

    public DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1(AbstractC1157 abstractC1157, AbstractC1156 abstractC1156, InterfaceC4357<? super DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1 defaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1 = new DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1(null, null, interfaceC4357);
        defaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1.F$0 = ((Number) obj).floatValue();
        return defaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1;
    }

    public final Object invoke(float f, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((DefaultModalWideNavigationRailOverride$ModalWideNavigationRail$settleToDismiss$1$1) create(Float.valueOf(f), interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i == 1) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        if (i == 2) {
            AbstractC5185.m10210(obj);
            return C5176.f14739;
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).floatValue(), (InterfaceC4357<? super C5176>) obj2);
    }
}
