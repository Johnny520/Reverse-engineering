package androidx.compose.runtime;

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
@InterfaceC6862(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {2, 1, 0}, xi = 48)
final class Recomposer$join$2 extends SuspendLambda implements InterfaceC6554 {
    /* synthetic */ Object L$0;
    int label;

    public Recomposer$join$2(InterfaceC4357<? super Recomposer$join$2> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(interfaceC4357);
        recomposer$join$2.L$0 = obj;
        return recomposer$join$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Recomposer$State recomposer$State, InterfaceC4357<? super Boolean> interfaceC4357) {
        return ((Recomposer$join$2) create(recomposer$State, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            AbstractC5185.m10210(obj);
            return Boolean.valueOf(((Recomposer$State) this.L$0) == Recomposer$State.ShutDown);
        }
        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
