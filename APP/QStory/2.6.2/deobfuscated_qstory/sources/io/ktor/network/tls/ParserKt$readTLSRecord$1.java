package io.ktor.network.tls;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.network.tls.ParserKt", f = "Parser.kt", l = {19, 20, 22, 25}, m = "readTLSRecord")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ParserKt$readTLSRecord$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ParserKt$readTLSRecord$1(InterfaceC4356<? super ParserKt$readTLSRecord$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4034.m8449(null, this);
    }
}
