package io.ktor.client.plugins;

import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p257.InterfaceC8970;
import p267.AbstractC9004;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$4", m556f = "HttpCallValidator.kt", m557l = {125}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏哲兰;", "request", "", "cause", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏哲兰;Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, m152k = 3, m153mv = {2, 0, 0})
final class HttpCallValidatorKt$HttpCallValidator$2$4 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ List<Object> $callExceptionHandlers;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCallValidatorKt$HttpCallValidator$2$4(List<Object> list, InterfaceC5189<? super HttpCallValidatorKt$HttpCallValidator$2$4> interfaceC5189) {
        super(3, interfaceC5189);
        this.$callExceptionHandlers = list;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(InterfaceC8970 interfaceC8970, Throwable th, InterfaceC5189<? super Throwable> interfaceC5189) {
        HttpCallValidatorKt$HttpCallValidator$2$4 httpCallValidatorKt$HttpCallValidator$2$4 = new HttpCallValidatorKt$HttpCallValidator$2$4(this.$callExceptionHandlers, interfaceC5189);
        httpCallValidatorKt$HttpCallValidator$2$4.L$0 = interfaceC8970;
        httpCallValidatorKt$HttpCallValidator$2$4.L$1 = th;
        return httpCallValidatorKt$HttpCallValidator$2$4.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th = (Throwable) this.L$0;
            AbstractC6017.m10769(obj);
            return th;
        }
        AbstractC6017.m10769(obj);
        InterfaceC8970 interfaceC8970 = (InterfaceC8970) this.L$0;
        Throwable thM14184 = AbstractC9004.m14184((Throwable) this.L$1);
        List<Object> list = this.$callExceptionHandlers;
        this.L$0 = thM14184;
        this.label = 1;
        AbstractC4773.m8885(list, thM14184, interfaceC8970, this);
        return C6008.f15084 == coroutineSingletons ? coroutineSingletons : thM14184;
    }
}
