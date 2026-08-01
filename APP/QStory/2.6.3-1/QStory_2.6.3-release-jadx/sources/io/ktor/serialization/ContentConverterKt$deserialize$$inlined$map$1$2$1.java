package io.ktor.serialization;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.serialization.ContentConverterKt$deserialize$$inlined$map$1$2", m556f = "ContentConverter.kt", m557l = {51, 50}, m558m = "emit")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
public final class ContentConverterKt$deserialize$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C4882 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentConverterKt$deserialize$$inlined$map$1$2$1(C4882 c4882, InterfaceC5189 interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c4882;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
