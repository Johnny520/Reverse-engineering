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
@InterfaceC6862(c = "androidx.compose.foundation.gestures.ScrollableNode$setScrollSemanticsActions$2", f = "Scrollable.kt", l = {610}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "offset", "<anonymous>", "(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;"}, k = 3, mv = {2, 1, 0})
final class ScrollableNode$setScrollSemanticsActions$2 extends SuspendLambda implements InterfaceC6554 {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ C0517 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$setScrollSemanticsActions$2(C0517 c0517, InterfaceC4357<? super ScrollableNode$setScrollSemanticsActions$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c0517;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ScrollableNode$setScrollSemanticsActions$2 scrollableNode$setScrollSemanticsActions$2 = new ScrollableNode$setScrollSemanticsActions$2(this.this$0, interfaceC4357);
        scrollableNode$setScrollSemanticsActions$2.J$0 = ((C7329) obj).f19541;
        return scrollableNode$setScrollSemanticsActions$2;
    }

    @Override // p052.InterfaceC6554
    public /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m1208invoke3MmeM6k(((C7329) obj).f19541, (InterfaceC4357) obj2);
    }

    /* JADX INFO: renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m1208invoke3MmeM6k(long j, InterfaceC4357<? super C7329> interfaceC4357) {
        return ((ScrollableNode$setScrollSemanticsActions$2) create(new C7329(j), interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return obj;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        long j = this.J$0;
        C0502 c0502 = this.this$0.f1523;
        this.label = 1;
        Object objM1259 = AbstractC0498.m1259(c0502, j, this);
        return objM1259 == coroutineSingletons ? coroutineSingletons : objM1259;
    }
}
