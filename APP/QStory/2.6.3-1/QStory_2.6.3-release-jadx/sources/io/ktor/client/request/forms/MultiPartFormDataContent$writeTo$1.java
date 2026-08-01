package io.ktor.client.request.forms;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.request.forms.MultiPartFormDataContent", m556f = "FormDataContent.kt", m557l = {119, 120, 121, 126, 130, 134, 137, 141, 141, 141}, m558m = "writeTo")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class MultiPartFormDataContent$writeTo$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4774 this$0;

    public MultiPartFormDataContent$writeTo$1(AbstractC4774 abstractC4774, InterfaceC5189<? super MultiPartFormDataContent$writeTo$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
