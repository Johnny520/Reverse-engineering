package top.yukonga.miuix.kmp.utils;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.utils.MiuixOverscrollEffect", m556f = "OverscrollFactory.kt", m557l = {323}, m558m = "applyToFling-BMRW4eQ", m559v = 2)
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
final class MiuixOverscrollEffect$applyToFling$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C6907 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiuixOverscrollEffect$applyToFling$1(C6907 c6907, InterfaceC5189<? super MiuixOverscrollEffect$applyToFling$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c6907;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo2518(0L, null, this);
    }
}
