package io.ktor.client.plugins;

import java.util.List;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p241.InterfaceC8141;
import p251.AbstractC8175;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$4", f = "HttpCallValidator.kt", l = {125}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏哲兰;", "request", "", "cause", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {2, 0, 0})
final class HttpCallValidatorKt$HttpCallValidator$2$4 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ List<Object> $callExceptionHandlers;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCallValidatorKt$HttpCallValidator$2$4(List<Object> list, InterfaceC4357<? super HttpCallValidatorKt$HttpCallValidator$2$4> interfaceC4357) {
        super(3, interfaceC4357);
        this.$callExceptionHandlers = list;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(InterfaceC8141 interfaceC8141, Throwable th, InterfaceC4357<? super Throwable> interfaceC4357) {
        HttpCallValidatorKt$HttpCallValidator$2$4 httpCallValidatorKt$HttpCallValidator$2$4 = new HttpCallValidatorKt$HttpCallValidator$2$4(this.$callExceptionHandlers, interfaceC4357);
        httpCallValidatorKt$HttpCallValidator$2$4.L$0 = interfaceC8141;
        httpCallValidatorKt$HttpCallValidator$2$4.L$1 = th;
        return httpCallValidatorKt$HttpCallValidator$2$4.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th = (Throwable) this.L$0;
            AbstractC5185.m10210(obj);
            return th;
        }
        AbstractC5185.m10210(obj);
        InterfaceC8141 interfaceC8141 = (InterfaceC8141) this.L$0;
        Throwable thM13625 = AbstractC8175.m13625((Throwable) this.L$1);
        List<Object> list = this.$callExceptionHandlers;
        this.L$0 = thM13625;
        this.label = 1;
        AbstractC3941.m8326(list, thM13625, interfaceC8141, this);
        return C5176.f14739 == coroutineSingletons ? coroutineSingletons : thM13625;
    }
}
