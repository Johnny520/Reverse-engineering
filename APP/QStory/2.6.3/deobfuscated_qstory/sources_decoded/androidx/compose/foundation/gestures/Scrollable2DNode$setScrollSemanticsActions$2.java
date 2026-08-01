package androidx.compose.foundation.gestures;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.Scrollable2DNode$setScrollSemanticsActions$2", f = "Scrollable2D.kt", l = {294}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "<anonymous>", "(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;"}, k = 3, mv = {2, 1, 0})
final class Scrollable2DNode$setScrollSemanticsActions$2 extends SuspendLambda implements InterfaceC6554 {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ AbstractC0511 this$0;

    public Scrollable2DNode$setScrollSemanticsActions$2(AbstractC0511 abstractC0511, InterfaceC4357<? super Scrollable2DNode$setScrollSemanticsActions$2> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        Scrollable2DNode$setScrollSemanticsActions$2 scrollable2DNode$setScrollSemanticsActions$2 = new Scrollable2DNode$setScrollSemanticsActions$2(null, interfaceC4357);
        scrollable2DNode$setScrollSemanticsActions$2.J$0 = ((C7329) obj).f19541;
        return scrollable2DNode$setScrollSemanticsActions$2;
    }

    @Override // p052.InterfaceC6554
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1203invoke3MmeM6k(((C7329) obj).f19541, (InterfaceC4357) obj2);
    }

    /* JADX INFO: renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m1203invoke3MmeM6k(long j, InterfaceC4357<? super C7329> interfaceC4357) {
        return ((Scrollable2DNode$setScrollSemanticsActions$2) create(new C7329(j), interfaceC4357)).invokeSuspend(C5176.f14739);
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
            return obj;
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
