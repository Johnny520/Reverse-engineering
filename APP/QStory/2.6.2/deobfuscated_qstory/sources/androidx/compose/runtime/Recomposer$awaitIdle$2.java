package androidx.compose.runtime;

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
@InterfaceC6861(c = "androidx.compose.runtime.Recomposer$awaitIdle$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {2, 1, 0}, xi = 48)
final class Recomposer$awaitIdle$2 extends SuspendLambda implements InterfaceC6553 {
    /* synthetic */ Object L$0;
    int label;

    public Recomposer$awaitIdle$2(InterfaceC4356<? super Recomposer$awaitIdle$2> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        Recomposer$awaitIdle$2 recomposer$awaitIdle$2 = new Recomposer$awaitIdle$2(interfaceC4356);
        recomposer$awaitIdle$2.L$0 = obj;
        return recomposer$awaitIdle$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Recomposer$State recomposer$State, InterfaceC4356<? super Boolean> interfaceC4356) {
        return ((Recomposer$awaitIdle$2) create(recomposer$State, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            AbstractC5184.m10206(obj);
            return Boolean.valueOf(((Recomposer$State) this.L$0).compareTo(Recomposer$State.Idle) > 0);
        }
        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
