package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {22}, m = "readObject", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final class JsonTreeReader$readObject$2 extends ContinuationImpl {
    byte B$0;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5494 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readObject$2(C5494 c5494, InterfaceC4357<? super JsonTreeReader$readObject$2> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c5494;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C5494.m10701(this.this$0, null, this);
    }
}
