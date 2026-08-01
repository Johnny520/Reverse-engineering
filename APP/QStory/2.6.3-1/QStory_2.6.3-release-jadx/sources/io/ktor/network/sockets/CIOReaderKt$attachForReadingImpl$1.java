package io.ktor.network.sockets;

import io.ktor.network.selector.InterfaceC4838;
import io.ktor.network.selector.InterfaceC4840;
import io.ktor.utils.p007io.C5058;
import io.ktor.utils.p007io.C5081;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p073.InterfaceC7680;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1", m556f = "CIOReader.kt", m557l = {42, 44, 42, 44, 55}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class CIOReaderKt$attachForReadingImpl$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ ByteBuffer $buffer;
    final /* synthetic */ C5081 $channel;
    final /* synthetic */ ReadableByteChannel $nioChannel;
    final /* synthetic */ InterfaceC7680 $pool;
    final /* synthetic */ InterfaceC4840 $selectable;
    final /* synthetic */ InterfaceC4838 $selector;
    final /* synthetic */ AbstractC4850 $socketOptions;
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
    public CIOReaderKt$attachForReadingImpl$1(AbstractC4850 abstractC4850, C5081 c5081, InterfaceC4840 interfaceC4840, ByteBuffer byteBuffer, InterfaceC7680 interfaceC7680, ReadableByteChannel readableByteChannel, InterfaceC4838 interfaceC4838, InterfaceC5189<? super CIOReaderKt$attachForReadingImpl$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$channel = c5081;
        this.$selectable = interfaceC4840;
        this.$buffer = byteBuffer;
        this.$pool = interfaceC7680;
        this.$nioChannel = readableByteChannel;
        this.$selector = interfaceC4838;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        CIOReaderKt$attachForReadingImpl$1 cIOReaderKt$attachForReadingImpl$1 = new CIOReaderKt$attachForReadingImpl$1(null, this.$channel, this.$selectable, this.$buffer, this.$pool, this.$nioChannel, this.$selector, interfaceC5189);
        cIOReaderKt$attachForReadingImpl$1.L$0 = obj;
        return cIOReaderKt$attachForReadingImpl$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5058 c5058, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CIOReaderKt$attachForReadingImpl$1) create(c5058, interfaceC5189)).invokeSuspend(C6008.f15084);
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
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.CIOReaderKt$attachForReadingImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
