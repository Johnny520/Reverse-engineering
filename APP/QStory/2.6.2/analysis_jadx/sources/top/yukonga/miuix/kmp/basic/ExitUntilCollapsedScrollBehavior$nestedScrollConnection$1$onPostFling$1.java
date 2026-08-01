package top.yukonga.miuix.kmp.basic;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.basic.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", f = "TopAppBar.kt", l = {489, 491}, m = "onPostFling-RZ2iAVY", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C6016 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1(C6016 c6016, InterfaceC4356<? super ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c6016;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo1245(0L, 0L, this);
    }
}
