package io.ktor.client.plugins;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.HttpCallValidatorKt", f = "HttpCallValidator.kt", l = {94}, m = "HttpCallValidator$lambda$2$validateResponse")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1(InterfaceC4357<? super HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC3941.m8325(this);
    }
}
