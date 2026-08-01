package io.ktor.network.tls;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.network.tls.RenderKt", f = "Render.kt", l = {18, 19, 20, 21, 22, 23}, m = "writeRecord")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class RenderKt$writeRecord$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public RenderKt$writeRecord$1(InterfaceC4357<? super RenderKt$writeRecord$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4035.m8437(null, null, this);
    }
}
