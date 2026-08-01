package androidx.core.content;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.core.content.ContextKt", f = "Context.kt", l = {279}, m = "receiveBroadcasts", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class ContextKt$receiveBroadcasts$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;

    public ContextKt$receiveBroadcasts$1(InterfaceC4357<? super ContextKt$receiveBroadcasts$1> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC2167.m3947(null, null, 0, null, null, null, this);
    }
}
