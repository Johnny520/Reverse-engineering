package io.ktor.network.tls;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.tls.TLSSocket", m556f = "TLSClientSessionJvm.kt", m557l = {97, 57, 58, 65, 65, 65}, m558m = "appDataInputLoop")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class TLSSocket$appDataInputLoop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4870 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TLSSocket$appDataInputLoop$1(C4870 c4870, InterfaceC5189<? super TLSSocket$appDataInputLoop$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4870;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C4870.m9002(this.this$0, null, this);
    }
}
