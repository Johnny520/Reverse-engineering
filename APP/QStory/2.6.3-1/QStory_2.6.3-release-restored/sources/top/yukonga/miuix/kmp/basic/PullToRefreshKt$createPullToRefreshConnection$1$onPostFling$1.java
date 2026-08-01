package top.yukonga.miuix.kmp.basic;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.PullToRefreshKt$createPullToRefreshConnection$1", m556f = "PullToRefresh.kt", m557l = {524, 530}, m558m = "onPostFling-RZ2iAVY", m559v = 2)
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
final class PullToRefreshKt$createPullToRefreshConnection$1$onPostFling$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC6851 this$0;

    public PullToRefreshKt$createPullToRefreshConnection$1$onPostFling$1(AbstractC6851 abstractC6851, InterfaceC5189<? super PullToRefreshKt$createPullToRefreshConnection$1$onPostFling$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
