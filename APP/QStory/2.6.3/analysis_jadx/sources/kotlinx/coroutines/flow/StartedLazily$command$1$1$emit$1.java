package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", l = {155}, m = "emit", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
final class StartedLazily$command$1$1$emit$1 extends ContinuationImpl {
    int I$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C5271 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedLazily$command$1$1$emit$1(C5271 c5271, InterfaceC4357<? super StartedLazily$command$1$1$emit$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c5271;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m10314(0, this);
    }
}
