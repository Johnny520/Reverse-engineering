package top.yukonga.miuix.kmp.utils;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.utils.MiuixOverscrollEffect", f = "OverscrollFactory.kt", l = {323}, m = "applyToFling-BMRW4eQ", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final class MiuixOverscrollEffect$applyToFling$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C6078 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiuixOverscrollEffect$applyToFling$1(C6078 c6078, InterfaceC4357<? super MiuixOverscrollEffect$applyToFling$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c6078;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo1958(0L, null, this);
    }
}
