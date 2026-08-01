package io.ktor.client.content;

import io.ktor.http.content.AbstractC3987;
import io.ktor.http.content.AbstractC3995;
import io.ktor.utils.io.C4226;
import io.ktor.utils.io.InterfaceC4247;
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
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.client.content.ObservableContent$getContent$1", f = "ObservableContent.kt", l = {44}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class ObservableContent$getContent$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC3987 $delegate;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObservableContent$getContent$1(AbstractC3987 abstractC3987, InterfaceC4357<? super ObservableContent$getContent$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$delegate = abstractC3987;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ObservableContent$getContent$1 observableContent$getContent$1 = new ObservableContent$getContent$1(this.$delegate, interfaceC4357);
        observableContent$getContent$1.L$0 = obj;
        return observableContent$getContent$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4226 c4226, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ObservableContent$getContent$1) create(c4226, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C4226 c4226 = (C4226) this.L$0;
            AbstractC3995 abstractC3995 = (AbstractC3995) this.$delegate;
            InterfaceC4247 interfaceC4247 = c4226.f12726;
            this.label = 1;
            if (abstractC3995.mo8382(interfaceC4247, this) == coroutineSingletons) {
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
}
