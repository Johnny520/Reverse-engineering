package io.ktor.client.plugins;

import androidx.activity.AbstractC0900;
import io.ktor.client.call.C4700;
import io.ktor.client.statement.AbstractC4778;
import io.ktor.utils.p007io.charsets.MalformedInputException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", m556f = "DefaultResponseValidation.kt", m557l = {40, 46}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;", "response", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/client/statement/飘花落叶言子楪世苏哲兰;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DefaultResponseValidationKt$addDefaultResponseValidation$1$1 extends SuspendLambda implements InterfaceC7383 {
    int I$0;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    public DefaultResponseValidationKt$addDefaultResponseValidation$1$1(InterfaceC5189<? super DefaultResponseValidationKt$addDefaultResponseValidation$1$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DefaultResponseValidationKt$addDefaultResponseValidation$1$1 defaultResponseValidationKt$addDefaultResponseValidation$1$1 = new DefaultResponseValidationKt$addDefaultResponseValidation$1$1(interfaceC5189);
        defaultResponseValidationKt$addDefaultResponseValidation$1$1.L$0 = obj;
        return defaultResponseValidationKt$addDefaultResponseValidation$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(AbstractC4778 abstractC4778, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DefaultResponseValidationKt$addDefaultResponseValidation$1$1) create(abstractC4778, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw AbstractC0900.m719(this.L$0);
        }
        if (i == 1) {
            if (this.L$0 != null) {
                throw new ClassCastException();
            }
            AbstractC6017.m10769(obj);
            ((C4700) obj).m8810();
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
            AbstractC6017.m10769(obj);
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
        int i3 = AbstractC4753.f12480;
        throw null;
    }
}
