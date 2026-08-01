package io.ktor.network.sockets;

import io.ktor.network.selector.InterfaceC4005;
import io.ktor.network.selector.InterfaceC4007;
import io.ktor.utils.io.C4225;
import io.ktor.utils.io.C4248;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p057.InterfaceC6850;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1", f = "CIOReader.kt", l = {42, 44, 42, 44, 55}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class CIOReaderKt$attachForReadingImpl$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ ByteBuffer $buffer;
    final /* synthetic */ C4248 $channel;
    final /* synthetic */ ReadableByteChannel $nioChannel;
    final /* synthetic */ InterfaceC6850 $pool;
    final /* synthetic */ InterfaceC4007 $selectable;
    final /* synthetic */ InterfaceC4005 $selector;
    final /* synthetic */ AbstractC4017 $socketOptions;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOReaderKt$attachForReadingImpl$1(AbstractC4017 abstractC4017, C4248 c4248, InterfaceC4007 interfaceC4007, ByteBuffer byteBuffer, InterfaceC6850 interfaceC6850, ReadableByteChannel readableByteChannel, InterfaceC4005 interfaceC4005, InterfaceC4356<? super CIOReaderKt$attachForReadingImpl$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$channel = c4248;
        this.$selectable = interfaceC4007;
        this.$buffer = byteBuffer;
        this.$pool = interfaceC6850;
        this.$nioChannel = readableByteChannel;
        this.$selector = interfaceC4005;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        CIOReaderKt$attachForReadingImpl$1 cIOReaderKt$attachForReadingImpl$1 = new CIOReaderKt$attachForReadingImpl$1(null, this.$channel, this.$selectable, this.$buffer, this.$pool, this.$nioChannel, this.$selector, interfaceC4356);
        cIOReaderKt$attachForReadingImpl$1.L$0 = obj;
        return cIOReaderKt$attachForReadingImpl$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4225 c4225, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CIOReaderKt$attachForReadingImpl$1) create(c4225, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0125 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:11:0x001c, B:73:0x01d7, B:45:0x010e, B:46:0x011d, B:48:0x0125, B:52:0x014c, B:56:0x017a, B:59:0x017f, B:61:0x0184, B:70:0x01ac, B:29:0x0099, B:36:0x00c1, B:37:0x00c4, B:39:0x00e1, B:42:0x0102, B:18:0x004b, B:27:0x0095, B:31:0x009f, B:33:0x00a7, B:24:0x0074, B:23:0x0071), top: B:84:0x000a, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0091 -> B:27:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x017c -> B:46:0x011d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01d4 -> B:73:0x01d7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
