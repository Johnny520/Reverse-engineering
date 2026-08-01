package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.HttpSend$DefaultSender", m556f = "HttpSend.kt", m557l = {118}, m558m = "execute")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class HttpSend$DefaultSender$execute$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC4760 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpSend$DefaultSender$execute$1(AbstractC4760 abstractC4760, InterfaceC5189<? super HttpSend$DefaultSender$execute$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = abstractC4760;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
