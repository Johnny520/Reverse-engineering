package io.ktor.client.utils;

import io.ktor.client.content.InterfaceC3869;
import io.ktor.utils.io.C4226;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", l = {22, 24, 26, 31}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class ByteChannelUtilsKt$observable$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Long $contentLength;
    final /* synthetic */ InterfaceC3869 $listener;
    final /* synthetic */ InterfaceC4252 $this_observable;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteChannelUtilsKt$observable$1(InterfaceC4252 interfaceC4252, InterfaceC3869 interfaceC3869, Long l, InterfaceC4357<? super ByteChannelUtilsKt$observable$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_observable = interfaceC4252;
        this.$contentLength = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ByteChannelUtilsKt$observable$1 byteChannelUtilsKt$observable$1 = new ByteChannelUtilsKt$observable$1(this.$this_observable, null, this.$contentLength, interfaceC4357);
        byteChannelUtilsKt$observable$1.L$0 = obj;
        return byteChannelUtilsKt$observable$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4226 c4226, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ByteChannelUtilsKt$observable$1) create(c4226, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Path cross not found for [B:4:0x000d, B:43:0x00c1], limit reached: 84 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:46:0x00dc, B:48:0x00e2, B:51:0x00fc, B:53:0x0104, B:57:0x012b, B:58:0x013f, B:61:0x0144, B:66:0x0154, B:67:0x0164), top: B:75:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:46:0x00dc, B:48:0x00e2, B:51:0x00fc, B:53:0x0104, B:57:0x012b, B:58:0x013f, B:61:0x0144, B:66:0x0154, B:67:0x0164), top: B:75:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0144 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:46:0x00dc, B:48:0x00e2, B:51:0x00fc, B:53:0x0104, B:57:0x012b, B:58:0x013f, B:61:0x0144, B:66:0x0154, B:67:0x0164), top: B:75:0x00dc }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc A[EXC_TOP_SPLITTER, PHI: r2 r3 r4 r10 r13 r14 r15 r16
  0x00dc: PHI (r2v9 byte[]) = (r2v3 byte[]), (r2v7 byte[]), (r2v20 byte[]) binds: [B:45:0x00d8, B:52:0x0102, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r3v3 io.ktor.utils.io.飘花落叶言子世楪兰苏哲) = (r3v1 io.ktor.utils.io.飘花落叶言子世楪兰苏哲), (r3v2 io.ktor.utils.io.飘花落叶言子世楪兰苏哲), (r3v6 io.ktor.utils.io.飘花落叶言子世楪兰苏哲) binds: [B:45:0x00d8, B:52:0x0102, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r4v3 java.lang.Object) = (r4v0 java.lang.Object), (r4v2 java.lang.Object), (r4v10 java.lang.Object) binds: [B:45:0x00d8, B:52:0x0102, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r10v4 long) = (r10v2 long), (r10v3 long), (r10v9 long) binds: [B:45:0x00d8, B:52:0x0102, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r13v2 java.lang.Long) = (r13v0 java.lang.Long), (r13v1 java.lang.Long), (r13v7 java.lang.Long) binds: [B:45:0x00d8, B:52:0x0102, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r14v2 io.ktor.utils.io.飘花落叶言子楪苏兰哲世) = (r14v0 io.ktor.utils.io.飘花落叶言子楪苏兰哲世), (r14v1 io.ktor.utils.io.飘花落叶言子楪苏兰哲世), (r14v8 io.ktor.utils.io.飘花落叶言子楪苏兰哲世) binds: [B:45:0x00d8, B:52:0x0102, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r15v4 飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲兰苏) = (r15v0 飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲兰苏), (r15v3 飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲兰苏), (r15v9 飘花落叶言世子楪哲兰苏.飘花落叶言子楪世哲兰苏) binds: [B:45:0x00d8, B:52:0x0102, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x00dc: PHI (r16v2 long) = (r16v0 long), (r16v1 long), (r16v4 long) binds: [B:45:0x00d8, B:52:0x0102, B:19:0x004b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0102 -> B:75:0x00dc). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.utils.ByteChannelUtilsKt$observable$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
