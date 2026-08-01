package io.ktor.network.tls;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.network.tls.RenderKt", f = "Render.kt", l = {18, 19, 20, 21, 22, 23}, m = "writeRecord")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class RenderKt$writeRecord$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public RenderKt$writeRecord$1(InterfaceC4356<? super RenderKt$writeRecord$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4034.m8447(null, null, this);
    }
}
