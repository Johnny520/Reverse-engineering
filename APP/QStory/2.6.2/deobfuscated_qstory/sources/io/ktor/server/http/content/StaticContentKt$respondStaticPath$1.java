package io.ktor.server.http.content;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.http.content.StaticContentKt", f = "StaticContent.kt", l = {629, 631, 633, 637, 638, 645}, m = "respondStaticPath")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class StaticContentKt$respondStaticPath$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;

    public StaticContentKt$respondStaticPath$1(InterfaceC4356<? super StaticContentKt$respondStaticPath$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4121.m8528(null, null, null, null, null, null, null, null, null, null, this);
    }
}
