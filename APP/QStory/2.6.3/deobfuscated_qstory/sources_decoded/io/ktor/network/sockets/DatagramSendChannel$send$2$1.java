package io.ktor.network.sockets;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.io.C5477;
import kotlinx.io.C5479;
import p052.InterfaceC6554;
import p057.InterfaceC6851;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.network.sockets.DatagramSendChannel$send$2$1", f = "DatagramSendChannel.kt", l = {113, 126}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class DatagramSendChannel$send$2$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC4030 $element;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C4031 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatagramSendChannel$send$2$1(AbstractC4030 abstractC4030, C4031 c4031, InterfaceC4357<? super DatagramSendChannel$send$2$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$element = abstractC4030;
        this.this$0 = c4031;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new DatagramSendChannel$send$2$1(this.$element, this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((DatagramSendChannel$send$2$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws EOFException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r0 = this.label;
        if (r0 == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        try {
            if (r0 == 1) {
                ByteBuffer byteBuffer = (ByteBuffer) this.L$4;
                ByteBuffer byteBuffer2 = (ByteBuffer) this.L$3;
                C5479 c5479 = (C5479) this.L$2;
                C5477 c5477 = (C5477) this.L$1;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.L$0;
                AbstractC5185.m10210(obj);
                byteBuffer.position(byteBuffer.limit());
                int iPosition = byteBuffer2.position();
                if (iPosition != 0) {
                    if (iPosition < 0) {
                        C5925.m11311("Returned negative read bytes count");
                        return null;
                    }
                    if (iPosition > c5479.m10637()) {
                        C5925.m11311("Returned too many bytes");
                        return null;
                    }
                    c5477.skip(iPosition);
                }
                if (ref$BooleanRef.element) {
                    throw null;
                }
            } else {
                if (r0 != 2) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj2 = this.L$1;
                InterfaceC6851 interfaceC6851 = (InterfaceC6851) this.L$0;
                AbstractC5185.m10210(obj);
                interfaceC6851.mo8334(obj2);
            }
            return C5176.f14739;
        } catch (Throwable th) {
            mo8334(r0);
            throw th;
        }
    }
}
