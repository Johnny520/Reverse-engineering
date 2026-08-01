package top.yukonga.miuix.kmp.basic;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", m556f = "TopAppBar.kt", m557l = {489, 491}, m558m = "onPostFling-RZ2iAVY", m559v = 2)
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
final class C0817x78ae0263 extends ContinuationImpl {
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C6852 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0817x78ae0263(C6852 c6852, InterfaceC5189<? super C0817x78ae0263> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c6852;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo1815(0L, 0L, this);
    }
}
