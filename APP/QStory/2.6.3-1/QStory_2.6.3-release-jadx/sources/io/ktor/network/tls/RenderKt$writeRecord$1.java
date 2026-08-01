package io.ktor.network.tls;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.tls.RenderKt", m556f = "Render.kt", m557l = {18, 19, 20, 21, 22, 23}, m558m = "writeRecord")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final class RenderKt$writeRecord$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public RenderKt$writeRecord$1(InterfaceC5189<? super RenderKt$writeRecord$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC4867.m8996(null, null, this);
    }
}
