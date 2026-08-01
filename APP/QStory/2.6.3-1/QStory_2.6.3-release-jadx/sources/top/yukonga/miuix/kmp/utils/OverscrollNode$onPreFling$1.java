package top.yukonga.miuix.kmp.utils;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.utils.OverscrollNode", m556f = "Overscroll.kt", m557l = {365, 371}, m558m = "onPreFling-QWom1Mo", m559v = 2)
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
final class OverscrollNode$onPreFling$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C6899 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverscrollNode$onPreFling$1(C6899 c6899, InterfaceC5189<? super OverscrollNode$onPreFling$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c6899;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo3549(0L, this);
    }
}
