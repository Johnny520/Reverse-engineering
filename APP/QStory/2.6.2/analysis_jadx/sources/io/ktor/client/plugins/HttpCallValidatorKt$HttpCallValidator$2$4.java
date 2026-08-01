package io.ktor.client.plugins;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import p241.InterfaceC8140;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$4", f = "HttpCallValidator.kt", l = {125}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏哲兰;", "request", "", "cause", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {2, 0, 0})
final class HttpCallValidatorKt$HttpCallValidator$2$4 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ List<Object> $callExceptionHandlers;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCallValidatorKt$HttpCallValidator$2$4(List<Object> list, InterfaceC4356<? super HttpCallValidatorKt$HttpCallValidator$2$4> interfaceC4356) {
        super(3, interfaceC4356);
        this.$callExceptionHandlers = list;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(InterfaceC8140 interfaceC8140, Throwable th, InterfaceC4356<? super Throwable> interfaceC4356) {
        HttpCallValidatorKt$HttpCallValidator$2$4 httpCallValidatorKt$HttpCallValidator$2$4 = new HttpCallValidatorKt$HttpCallValidator$2$4(this.$callExceptionHandlers, interfaceC4356);
        httpCallValidatorKt$HttpCallValidator$2$4.L$0 = interfaceC8140;
        httpCallValidatorKt$HttpCallValidator$2$4.L$1 = th;
        return httpCallValidatorKt$HttpCallValidator$2$4.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th = (Throwable) this.L$0;
            AbstractC5184.m10206(obj);
            return th;
        }
        AbstractC5184.m10206(obj);
        InterfaceC8140 interfaceC8140 = (InterfaceC8140) this.L$0;
        Throwable thM1139 = AbstractC0455.m1139((Throwable) this.L$1);
        List<Object> list = this.$callExceptionHandlers;
        this.L$0 = thM1139;
        this.label = 1;
        AbstractC3940.m8336(list, thM1139, interfaceC8140, this);
        return C5175.f14739 == coroutineSingletons ? coroutineSingletons : thM1139;
    }
}
