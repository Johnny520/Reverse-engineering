package io.ktor.client.engine.cio;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.engine.cio.UtilsKt", f = "utils.kt", l = {91, 92, 95}, m = "writeHeaders")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class UtilsKt$writeHeaders$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public UtilsKt$writeHeaders$1(InterfaceC4357<? super UtilsKt$writeHeaders$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC3870.m8253(null, null, false, false, this);
    }
}
