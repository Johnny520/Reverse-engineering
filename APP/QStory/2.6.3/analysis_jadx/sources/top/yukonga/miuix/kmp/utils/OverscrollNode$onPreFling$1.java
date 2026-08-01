package top.yukonga.miuix.kmp.utils;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.utils.OverscrollNode", f = "Overscroll.kt", l = {365, 371}, m = "onPreFling-QWom1Mo", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final class OverscrollNode$onPreFling$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C6070 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverscrollNode$onPreFling$1(C6070 c6070, InterfaceC4357<? super OverscrollNode$onPreFling$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c6070;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo2989(0L, this);
    }
}
