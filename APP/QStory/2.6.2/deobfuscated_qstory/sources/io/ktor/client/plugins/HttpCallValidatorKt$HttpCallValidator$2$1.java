package io.ktor.client.plugins;

import io.ktor.util.C4203;
import io.ktor.util.C4208;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p241.C8139;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1", f = "HttpCallValidator.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class HttpCallValidatorKt$HttpCallValidator$2$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ boolean $expectSuccess;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCallValidatorKt$HttpCallValidator$2$1(boolean z, InterfaceC4356<? super HttpCallValidatorKt$HttpCallValidator$2$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$expectSuccess = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        HttpCallValidatorKt$HttpCallValidator$2$1 httpCallValidatorKt$HttpCallValidator$2$1 = new HttpCallValidatorKt$HttpCallValidator$2$1(this.$expectSuccess, interfaceC4356);
        httpCallValidatorKt$HttpCallValidator$2$1.L$0 = obj;
        return httpCallValidatorKt$HttpCallValidator$2$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C8139 c8139, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((HttpCallValidatorKt$HttpCallValidator$2$1) create(c8139, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C4203 c4203 = ((C8139) this.L$0).f22457;
        C4208 c4208 = AbstractC3940.f12151;
        final boolean z = this.$expectSuccess;
        c4203.m8600(c4208, new InterfaceC6542() { // from class: io.ktor.client.plugins.飘花落叶言子楪苏世兰哲
            @Override // p052.InterfaceC6542
            public final Object invoke() {
                return Boolean.valueOf(HttpCallValidatorKt$HttpCallValidator$2$1.invokeSuspend$lambda$0(z));
            }
        });
        return C5175.f14739;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(boolean z) {
        return z;
    }
}
