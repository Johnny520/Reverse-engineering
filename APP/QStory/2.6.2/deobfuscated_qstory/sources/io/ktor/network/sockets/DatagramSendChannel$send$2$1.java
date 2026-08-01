package io.ktor.network.sockets;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.io.C5476;
import kotlinx.io.C5478;
import p052.InterfaceC6553;
import p057.InterfaceC6850;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.network.sockets.DatagramSendChannel$send$2$1", f = "DatagramSendChannel.kt", l = {113, 126}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class DatagramSendChannel$send$2$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ AbstractC4029 $element;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C4030 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatagramSendChannel$send$2$1(AbstractC4029 abstractC4029, C4030 c4030, InterfaceC4356<? super DatagramSendChannel$send$2$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$element = abstractC4029;
        this.this$0 = c4030;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new DatagramSendChannel$send$2$1(this.$element, this.this$0, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DatagramSendChannel$send$2$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws EOFException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r0 = this.label;
        if (r0 == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        try {
            if (r0 == 1) {
                ByteBuffer byteBuffer = (ByteBuffer) this.L$4;
                ByteBuffer byteBuffer2 = (ByteBuffer) this.L$3;
                C5478 c5478 = (C5478) this.L$2;
                C5476 c5476 = (C5476) this.L$1;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.L$0;
                AbstractC5184.m10206(obj);
                byteBuffer.position(byteBuffer.limit());
                int iPosition = byteBuffer2.position();
                if (iPosition != 0) {
                    if (iPosition < 0) {
                        C5919.m11250("Returned negative read bytes count");
                        return null;
                    }
                    if (iPosition > c5478.m10633()) {
                        C5919.m11250("Returned too many bytes");
                        return null;
                    }
                    c5476.skip(iPosition);
                }
                if (ref$BooleanRef.element) {
                    throw null;
                }
            } else {
                if (r0 != 2) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj2 = this.L$1;
                InterfaceC6850 interfaceC6850 = (InterfaceC6850) this.L$0;
                AbstractC5184.m10206(obj);
                interfaceC6850.mo8344(obj2);
            }
            return C5175.f14739;
        } catch (Throwable th) {
            mo8344(r0);
            throw th;
        }
    }
}
