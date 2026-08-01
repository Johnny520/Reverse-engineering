package io.ktor.client.plugins;

import io.ktor.util.C4204;
import io.ktor.util.C4209;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p241.C8140;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1", f = "HttpCallValidator.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class HttpCallValidatorKt$HttpCallValidator$2$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ boolean $expectSuccess;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCallValidatorKt$HttpCallValidator$2$1(boolean z, InterfaceC4357<? super HttpCallValidatorKt$HttpCallValidator$2$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$expectSuccess = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        HttpCallValidatorKt$HttpCallValidator$2$1 httpCallValidatorKt$HttpCallValidator$2$1 = new HttpCallValidatorKt$HttpCallValidator$2$1(this.$expectSuccess, interfaceC4357);
        httpCallValidatorKt$HttpCallValidator$2$1.L$0 = obj;
        return httpCallValidatorKt$HttpCallValidator$2$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C8140 c8140, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((HttpCallValidatorKt$HttpCallValidator$2$1) create(c8140, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C4204 c4204 = ((C8140) this.L$0).f22455;
        C4209 c4209 = AbstractC3941.f12155;
        final boolean z = this.$expectSuccess;
        c4204.m8590(c4209, new InterfaceC6543() { // from class: io.ktor.client.plugins.飘花落叶言子楪苏世兰哲
            @Override // p052.InterfaceC6543
            public final Object invoke() {
                return Boolean.valueOf(HttpCallValidatorKt$HttpCallValidator$2$1.invokeSuspend$lambda$0(z));
            }
        });
        return C5176.f14739;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(boolean z) {
        return z;
    }
}
