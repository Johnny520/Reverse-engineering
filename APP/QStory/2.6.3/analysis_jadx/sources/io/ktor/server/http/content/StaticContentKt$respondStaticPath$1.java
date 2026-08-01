package io.ktor.server.http.content;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.http.content.StaticContentKt", f = "StaticContent.kt", l = {629, 631, 633, 637, 638, 645}, m = "respondStaticPath")
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

    public StaticContentKt$respondStaticPath$1(InterfaceC4357<? super StaticContentKt$respondStaticPath$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4122.m8518(null, null, null, null, null, null, null, null, null, null, this);
    }
}
