package io.ktor.serialization;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2", f = "ContentConverter.kt", l = {51, 50}, m = "emit")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ContentConverterKt$deserialize$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4050 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentConverterKt$deserialize$$inlined$map$1$2$1(C4050 c4050, InterfaceC4357 interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c4050;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
