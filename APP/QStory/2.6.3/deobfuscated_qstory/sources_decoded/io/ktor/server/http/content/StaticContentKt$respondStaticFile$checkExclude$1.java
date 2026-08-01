package io.ktor.server.http.content;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.http.content.StaticContentKt", f = "StaticContent.kt", l = {735}, m = "respondStaticFile$checkExclude")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class StaticContentKt$respondStaticFile$checkExclude$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public StaticContentKt$respondStaticFile$checkExclude$1(InterfaceC4357<? super StaticContentKt$respondStaticFile$checkExclude$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4122.m8516(null, null, null, this);
    }
}
