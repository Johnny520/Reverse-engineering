package io.ktor.server.http.content;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.http.content.StaticContentKt", f = "StaticContent.kt", l = {735}, m = "respondStaticFile$checkExclude")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class StaticContentKt$respondStaticFile$checkExclude$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public StaticContentKt$respondStaticFile$checkExclude$1(InterfaceC4356<? super StaticContentKt$respondStaticFile$checkExclude$1> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4121.m8526(null, null, null, this);
    }
}
