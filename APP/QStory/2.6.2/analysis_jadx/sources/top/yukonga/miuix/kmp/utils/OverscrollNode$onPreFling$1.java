package top.yukonga.miuix.kmp.utils;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.utils.OverscrollNode", f = "Overscroll.kt", l = {365, 371}, m = "onPreFling-QWom1Mo", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final class OverscrollNode$onPreFling$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C6064 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverscrollNode$onPreFling$1(C6064 c6064, InterfaceC4356<? super OverscrollNode$onPreFling$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c6064;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo2979(0L, this);
    }
}
