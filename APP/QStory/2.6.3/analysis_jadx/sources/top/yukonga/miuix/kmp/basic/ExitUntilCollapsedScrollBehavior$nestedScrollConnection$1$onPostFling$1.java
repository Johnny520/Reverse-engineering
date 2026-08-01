package top.yukonga.miuix.kmp.basic;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", f = "TopAppBar.kt", l = {489, 491}, m = "onPostFling-RZ2iAVY", v = 2)
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C6022 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1(C6022 c6022, InterfaceC4357<? super ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c6022;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo1255(0L, 0L, this);
    }
}
