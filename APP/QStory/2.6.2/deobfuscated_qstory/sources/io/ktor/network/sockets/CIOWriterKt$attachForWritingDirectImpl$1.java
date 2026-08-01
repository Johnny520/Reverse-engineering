package io.ktor.network.sockets;

import io.ktor.network.selector.InterfaceC4005;
import io.ktor.network.selector.InterfaceC4007;
import io.ktor.network.util.AbstractC4046;
import io.ktor.utils.io.C4228;
import io.ktor.utils.io.C4248;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1", f = "CIOWriter.kt", l = {33, 79, 50}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class CIOWriterKt$attachForWritingDirectImpl$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C4248 $channel;
    final /* synthetic */ WritableByteChannel $nioChannel;
    final /* synthetic */ InterfaceC4007 $selectable;
    final /* synthetic */ InterfaceC4005 $selector;
    final /* synthetic */ AbstractC4017 $socketOptions;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOWriterKt$attachForWritingDirectImpl$1(InterfaceC4007 interfaceC4007, AbstractC4017 abstractC4017, C4248 c4248, InterfaceC4005 interfaceC4005, WritableByteChannel writableByteChannel, InterfaceC4356<? super CIOWriterKt$attachForWritingDirectImpl$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$selectable = interfaceC4007;
        this.$channel = c4248;
        this.$selector = interfaceC4005;
        this.$nioChannel = writableByteChannel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$1(AbstractC4046 abstractC4046, Ref$IntRef ref$IntRef, WritableByteChannel writableByteChannel, ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining()) {
            do {
                ref$IntRef.element = writableByteChannel.write(byteBuffer);
                if (byteBuffer.hasRemaining()) {
                }
            } while (ref$IntRef.element > 0);
        }
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        CIOWriterKt$attachForWritingDirectImpl$1 cIOWriterKt$attachForWritingDirectImpl$1 = new CIOWriterKt$attachForWritingDirectImpl$1(this.$selectable, null, this.$channel, this.$selector, this.$nioChannel, interfaceC4356);
        cIOWriterKt$attachForWritingDirectImpl$1.L$0 = obj;
        return cIOWriterKt$attachForWritingDirectImpl$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4228 c4228, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CIOWriterKt$attachForWritingDirectImpl$1) create(c4228, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Path cross not found for [B:47:0x00eb, B:78:?], limit reached: 77 */
    /* JADX WARN: Path cross not found for [B:78:?, B:47:0x00eb], limit reached: 77 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[Catch: all -> 0x0019, TryCatch #2 {all -> 0x0019, blocks: (B:8:0x0015, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:27:0x0073, B:29:0x0087, B:31:0x008d, B:45:0x00e7, B:47:0x00eb, B:32:0x0095, B:36:0x00a9, B:40:0x00b2, B:41:0x00d9, B:42:0x00da, B:44:0x00e0, B:15:0x0034), top: B:73:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[Catch: all -> 0x0019, TryCatch #2 {all -> 0x0019, blocks: (B:8:0x0015, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:27:0x0073, B:29:0x0087, B:31:0x008d, B:45:0x00e7, B:47:0x00eb, B:32:0x0095, B:36:0x00a9, B:40:0x00b2, B:41:0x00d9, B:42:0x00da, B:44:0x00e0, B:15:0x0034), top: B:73:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00eb A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #2 {all -> 0x0019, blocks: (B:8:0x0015, B:20:0x004f, B:22:0x0057, B:24:0x005f, B:27:0x0073, B:29:0x0087, B:31:0x008d, B:45:0x00e7, B:47:0x00eb, B:32:0x0095, B:36:0x00a9, B:40:0x00b2, B:41:0x00d9, B:42:0x00da, B:44:0x00e0, B:15:0x0034), top: B:73:0x0009 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00e9 -> B:20:0x004f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0106 -> B:20:0x004f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
