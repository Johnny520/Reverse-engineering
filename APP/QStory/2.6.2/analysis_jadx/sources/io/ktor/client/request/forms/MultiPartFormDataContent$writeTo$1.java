package io.ktor.client.request.forms;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.request.forms.MultiPartFormDataContent", f = "FormDataContent.kt", l = {119, 120, 121, 126, 130, 134, 137, 141, 141, 141}, m = "writeTo")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class MultiPartFormDataContent$writeTo$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC3941 this$0;

    public MultiPartFormDataContent$writeTo$1(AbstractC3941 abstractC3941, InterfaceC4356<? super MultiPartFormDataContent$writeTo$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
