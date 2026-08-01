package io.ktor.client.plugins.sse;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.sse.DefaultClientSSESession", m556f = "DefaultClientSSESession.kt", m557l = {47, 49, 98}, m558m = "parseEvent")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class DefaultClientSSESession$parseEvent$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4738 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultClientSSESession$parseEvent$1(C4738 c4738, InterfaceC5189<? super DefaultClientSSESession$parseEvent$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4738;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C4738.m8844(this.this$0, null, this);
    }
}
