package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.BufferedChannel", m556f = "BufferedChannel.kt", m557l = {736}, m558m = "receiveCatching-JP2dKIU$suspendImpl", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class BufferedChannel$receiveCatching$1<E> extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    long J$1;
    long J$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C6022 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferedChannel$receiveCatching$1(C6022 c6022, InterfaceC5189<? super BufferedChannel$receiveCatching$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c6022;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM10779 = C6022.m10779(this.this$0, this);
        return objM10779 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM10779 : new C6034(objM10779);
    }
}
