package io.ktor.client.request.forms;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.request.forms.MultiPartFormDataContent", f = "FormDataContent.kt", l = {119, 120, 121, 126, 130, 134, 137, 141, 141, 141}, m = "writeTo")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class MultiPartFormDataContent$writeTo$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC3942 this$0;

    public MultiPartFormDataContent$writeTo$1(AbstractC3942 abstractC3942, InterfaceC4357<? super MultiPartFormDataContent$writeTo$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
