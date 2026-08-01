package io.ktor.network.sockets;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.p010io.C6309;
import kotlinx.p010io.C6311;
import p068.InterfaceC7383;
import p073.InterfaceC7680;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.sockets.DatagramSendChannel$send$2$1", m556f = "DatagramSendChannel.kt", m557l = {113, 126}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DatagramSendChannel$send$2$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC4862 $element;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C4863 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatagramSendChannel$send$2$1(AbstractC4862 abstractC4862, C4863 c4863, InterfaceC5189<? super DatagramSendChannel$send$2$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$element = abstractC4862;
        this.this$0 = c4863;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new DatagramSendChannel$send$2$1(this.$element, this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DatagramSendChannel$send$2$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws EOFException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r0 = this.label;
        if (r0 == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        try {
            if (r0 == 1) {
                ByteBuffer byteBuffer = (ByteBuffer) this.L$4;
                ByteBuffer byteBuffer2 = (ByteBuffer) this.L$3;
                C6311 c6311 = (C6311) this.L$2;
                C6309 c6309 = (C6309) this.L$1;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.L$0;
                AbstractC6017.m10769(obj);
                byteBuffer.position(byteBuffer.limit());
                int iPosition = byteBuffer2.position();
                if (iPosition != 0) {
                    if (iPosition < 0) {
                        C6755.m11870("Returned negative read bytes count");
                        return null;
                    }
                    if (iPosition > c6311.m11196()) {
                        C6755.m11870("Returned too many bytes");
                        return null;
                    }
                    c6309.skip(iPosition);
                }
                if (ref$BooleanRef.element) {
                    throw null;
                }
            } else {
                if (r0 != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj2 = this.L$1;
                InterfaceC7680 interfaceC7680 = (InterfaceC7680) this.L$0;
                AbstractC6017.m10769(obj);
                interfaceC7680.mo8893(obj2);
            }
            return C6008.f15084;
        } catch (Throwable th) {
            mo8893(r0);
            throw th;
        }
    }
}
