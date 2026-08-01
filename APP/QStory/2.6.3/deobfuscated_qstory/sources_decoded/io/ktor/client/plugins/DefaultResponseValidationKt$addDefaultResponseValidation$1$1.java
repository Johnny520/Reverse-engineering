package io.ktor.client.plugins;

import androidx.activity.AbstractC0053;
import io.ktor.client.call.C3868;
import io.ktor.client.statement.AbstractC3946;
import io.ktor.utils.io.charsets.MalformedInputException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", f = "DefaultResponseValidation.kt", l = {40, 46}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "response", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;)V"}, k = 3, mv = {2, 0, 0})
final class DefaultResponseValidationKt$addDefaultResponseValidation$1$1 extends SuspendLambda implements InterfaceC6554 {
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    public DefaultResponseValidationKt$addDefaultResponseValidation$1$1(InterfaceC4357<? super DefaultResponseValidationKt$addDefaultResponseValidation$1$1> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        DefaultResponseValidationKt$addDefaultResponseValidation$1$1 defaultResponseValidationKt$addDefaultResponseValidation$1$1 = new DefaultResponseValidationKt$addDefaultResponseValidation$1$1(interfaceC4357);
        defaultResponseValidationKt$addDefaultResponseValidation$1$1.L$0 = obj;
        return defaultResponseValidationKt$addDefaultResponseValidation$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(AbstractC3946 abstractC3946, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((DefaultResponseValidationKt$addDefaultResponseValidation$1$1) create(abstractC3946, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw AbstractC0053.m159(this.L$0);
        }
        if (i == 1) {
            if (this.L$0 != null) {
                throw new ClassCastException();
            }
            AbstractC5185.m10210(obj);
            ((C3868) obj).m8251();
            throw null;
        }
        if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i2 = this.I$0;
        if (this.L$1 != null) {
            throw new ClassCastException();
        }
        if (this.L$0 != null) {
            throw new ClassCastException();
        }
        try {
            AbstractC5185.m10210(obj);
            str = (String) obj;
        } catch (MalformedInputException unused) {
            str = "<body failed decoding>";
        }
        if (300 <= i2 && i2 < 400) {
            new RedirectResponseException(null, str);
        } else if (400 <= i2 && i2 < 500) {
            new ClientRequestException(null, str);
        } else if (500 > i2 || i2 >= 600) {
            new ResponseException(null, str);
        } else {
            new ServerResponseException(null, str);
        }
        int i3 = AbstractC3921.f12135;
        throw null;
    }
}
