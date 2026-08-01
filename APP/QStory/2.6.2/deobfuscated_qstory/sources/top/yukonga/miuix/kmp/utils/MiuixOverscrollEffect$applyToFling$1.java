package top.yukonga.miuix.kmp.utils;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.utils.MiuixOverscrollEffect", f = "OverscrollFactory.kt", l = {323}, m = "applyToFling-BMRW4eQ", v = 2)
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
    final /* synthetic */ C6072 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiuixOverscrollEffect$applyToFling$1(C6072 c6072, InterfaceC4356<? super MiuixOverscrollEffect$applyToFling$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c6072;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo1948(0L, null, this);
    }
}
