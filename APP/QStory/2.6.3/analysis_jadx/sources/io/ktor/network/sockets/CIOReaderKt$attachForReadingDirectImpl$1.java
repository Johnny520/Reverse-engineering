package io.ktor.network.sockets;

import io.ktor.network.selector.InterfaceC4006;
import io.ktor.network.selector.InterfaceC4008;
import io.ktor.utils.io.C4226;
import io.ktor.utils.io.C4249;
import java.nio.channels.ReadableByteChannel;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1", f = "CIOReader.kt", l = {97, 106, 109, 110, 97, 106, 109, 110}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class CIOReaderKt$attachForReadingDirectImpl$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C4249 $channel;
    final /* synthetic */ ReadableByteChannel $nioChannel;
    final /* synthetic */ InterfaceC4008 $selectable;
    final /* synthetic */ InterfaceC4006 $selector;
    final /* synthetic */ AbstractC4018 $socketOptions;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOReaderKt$attachForReadingDirectImpl$1(InterfaceC4008 interfaceC4008, AbstractC4018 abstractC4018, C4249 c4249, ReadableByteChannel readableByteChannel, InterfaceC4006 interfaceC4006, InterfaceC4357<? super CIOReaderKt$attachForReadingDirectImpl$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$selectable = interfaceC4008;
        this.$channel = c4249;
        this.$nioChannel = readableByteChannel;
        this.$selector = interfaceC4006;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        CIOReaderKt$attachForReadingDirectImpl$1 cIOReaderKt$attachForReadingDirectImpl$1 = new CIOReaderKt$attachForReadingDirectImpl$1(this.$selectable, null, this.$channel, this.$nioChannel, this.$selector, interfaceC4357);
        cIOReaderKt$attachForReadingDirectImpl$1.L$0 = obj;
        return cIOReaderKt$attachForReadingDirectImpl$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4226 c4226, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((CIOReaderKt$attachForReadingDirectImpl$1) create(c4226, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ee, code lost:
    
        if (((java.lang.Number) r13).intValue() != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f0, code lost:
    
        if (r13 != r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f9, code lost:
    
        if (((java.lang.Number) r13).intValue() != 0) goto L79;
     */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00f8: INVOKE (r9 I:io.ktor.network.util.飘花落叶言子楪世苏兰哲) VIRTUAL call: io.ktor.network.util.飘花落叶言子楪世苏兰哲.飘花落叶言子楪世苏哲兰():void A[Catch: all -> 0x00f5, MD:():void (m)] (LINE:249), block:B:39:0x00f8 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0 A[Catch: all -> 0x002f, PHI: r1 r6 r7 r8 r9 r10
  0x00d0: PHI (r1v22 io.ktor.network.selector.飘花落叶言子楪苏兰世哲) = (r1v15 io.ktor.network.selector.飘花落叶言子楪苏兰世哲), (r1v23 io.ktor.network.selector.飘花落叶言子楪苏兰世哲) binds: [B:12:0x004a, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r6v20 io.ktor.network.selector.飘花落叶言子楪苏哲世兰) = (r6v14 io.ktor.network.selector.飘花落叶言子楪苏哲世兰), (r6v21 io.ktor.network.selector.飘花落叶言子楪苏哲世兰) binds: [B:12:0x004a, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r7v20 java.nio.channels.ReadableByteChannel) = (r7v13 java.nio.channels.ReadableByteChannel), (r7v21 java.nio.channels.ReadableByteChannel) binds: [B:12:0x004a, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r8v20 io.ktor.utils.io.飘花落叶言子楪苏世兰哲) = (r8v13 io.ktor.utils.io.飘花落叶言子楪苏世兰哲), (r8v21 io.ktor.utils.io.飘花落叶言子楪苏世兰哲) binds: [B:12:0x004a, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r9v24 io.ktor.network.util.飘花落叶言子楪世苏兰哲) = (r9v14 io.ktor.network.util.飘花落叶言子楪世苏兰哲), (r9v25 io.ktor.network.util.飘花落叶言子楪世苏兰哲) binds: [B:12:0x004a, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00d0: PHI (r10v13 io.ktor.network.util.飘花落叶言子楪世苏兰哲) = (r10v6 io.ktor.network.util.飘花落叶言子楪世苏兰哲), (r10v14 io.ktor.network.util.飘花落叶言子楪世苏兰哲) binds: [B:12:0x004a, B:29:0x00cc] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {all -> 0x002f, blocks: (B:7:0x002a, B:34:0x00e8, B:25:0x00ab, B:31:0x00d0, B:12:0x004a, B:15:0x0067, B:18:0x0083, B:20:0x008e, B:22:0x0094), top: B:100:0x0009, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0177 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:36:0x00f0, B:55:0x016f, B:57:0x0177, B:61:0x019b, B:63:0x01a3, B:65:0x01a9, B:68:0x01bd, B:74:0x01df, B:77:0x01f3, B:80:0x01fe, B:82:0x0206, B:90:0x0225, B:39:0x00f8, B:40:0x00fb, B:42:0x0110, B:45:0x0129, B:48:0x0142, B:51:0x015b, B:54:0x0166, B:7:0x002a, B:34:0x00e8, B:25:0x00ab, B:31:0x00d0, B:12:0x004a, B:15:0x0067, B:18:0x0083, B:20:0x008e, B:22:0x0094), top: B:100:0x0009, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a3 A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:36:0x00f0, B:55:0x016f, B:57:0x0177, B:61:0x019b, B:63:0x01a3, B:65:0x01a9, B:68:0x01bd, B:74:0x01df, B:77:0x01f3, B:80:0x01fe, B:82:0x0206, B:90:0x0225, B:39:0x00f8, B:40:0x00fb, B:42:0x0110, B:45:0x0129, B:48:0x0142, B:51:0x015b, B:54:0x0166, B:7:0x002a, B:34:0x00e8, B:25:0x00ab, B:31:0x00d0, B:12:0x004a, B:15:0x0067, B:18:0x0083, B:20:0x008e, B:22:0x0094), top: B:100:0x0009, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01df A[Catch: all -> 0x00f5, PHI: r1 r6 r7 r8 r9
  0x01df: PHI (r1v17 io.ktor.network.selector.飘花落叶言子楪苏兰世哲) = (r1v7 io.ktor.network.selector.飘花落叶言子楪苏兰世哲), (r1v18 io.ktor.network.selector.飘花落叶言子楪苏兰世哲) binds: [B:45:0x0129, B:72:0x01dc] A[DONT_GENERATE, DONT_INLINE]
  0x01df: PHI (r6v16 io.ktor.network.selector.飘花落叶言子楪苏哲世兰) = (r6v6 io.ktor.network.selector.飘花落叶言子楪苏哲世兰), (r6v17 io.ktor.network.selector.飘花落叶言子楪苏哲世兰) binds: [B:45:0x0129, B:72:0x01dc] A[DONT_GENERATE, DONT_INLINE]
  0x01df: PHI (r7v15 java.nio.channels.ReadableByteChannel) = (r7v5 java.nio.channels.ReadableByteChannel), (r7v16 java.nio.channels.ReadableByteChannel) binds: [B:45:0x0129, B:72:0x01dc] A[DONT_GENERATE, DONT_INLINE]
  0x01df: PHI (r8v15 io.ktor.utils.io.飘花落叶言子楪苏世兰哲) = (r8v5 io.ktor.utils.io.飘花落叶言子楪苏世兰哲), (r8v16 io.ktor.utils.io.飘花落叶言子楪苏世兰哲) binds: [B:45:0x0129, B:72:0x01dc] A[DONT_GENERATE, DONT_INLINE]
  0x01df: PHI (r9v16 io.ktor.network.util.飘花落叶言子楪世苏兰哲) = (r9v6 io.ktor.network.util.飘花落叶言子楪世苏兰哲), (r9v17 io.ktor.network.util.飘花落叶言子楪世苏兰哲) binds: [B:45:0x0129, B:72:0x01dc] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00f5, blocks: (B:36:0x00f0, B:55:0x016f, B:57:0x0177, B:61:0x019b, B:63:0x01a3, B:65:0x01a9, B:68:0x01bd, B:74:0x01df, B:77:0x01f3, B:80:0x01fe, B:82:0x0206, B:90:0x0225, B:39:0x00f8, B:40:0x00fb, B:42:0x0110, B:45:0x0129, B:48:0x0142, B:51:0x015b, B:54:0x0166, B:7:0x002a, B:34:0x00e8, B:25:0x00ab, B:31:0x00d0, B:12:0x004a, B:15:0x0067, B:18:0x0083, B:20:0x008e, B:22:0x0094), top: B:100:0x0009, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fe A[Catch: all -> 0x00f5, TryCatch #0 {all -> 0x00f5, blocks: (B:36:0x00f0, B:55:0x016f, B:57:0x0177, B:61:0x019b, B:63:0x01a3, B:65:0x01a9, B:68:0x01bd, B:74:0x01df, B:77:0x01f3, B:80:0x01fe, B:82:0x0206, B:90:0x0225, B:39:0x00f8, B:40:0x00fb, B:42:0x0110, B:45:0x0129, B:48:0x0142, B:51:0x015b, B:54:0x0166, B:7:0x002a, B:34:0x00e8, B:25:0x00ab, B:31:0x00d0, B:12:0x004a, B:15:0x0067, B:18:0x0083, B:20:0x008e, B:22:0x0094), top: B:100:0x0009, inners: #3 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e4 -> B:34:0x00e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01f9 -> B:68:0x01bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01fb -> B:55:0x016f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.CIOReaderKt$attachForReadingDirectImpl$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
