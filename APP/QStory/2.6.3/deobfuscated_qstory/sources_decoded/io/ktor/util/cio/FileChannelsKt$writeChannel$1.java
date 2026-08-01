package io.ktor.util.cio;

import io.ktor.utils.io.C4229;
import java.io.File;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.util.cio.FileChannelsKt$writeChannel$1", f = "FileChannels.kt", l = {104}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class FileChannelsKt$writeChannel$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ File $this_writeChannel;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileChannelsKt$writeChannel$1(File file, InterfaceC4357<? super FileChannelsKt$writeChannel$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_writeChannel = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        FileChannelsKt$writeChannel$1 fileChannelsKt$writeChannel$1 = new FileChannelsKt$writeChannel$1(this.$this_writeChannel, interfaceC4357);
        fileChannelsKt$writeChannel$1.L$0 = obj;
        return fileChannelsKt$writeChannel$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4229 c4229, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((FileChannelsKt$writeChannel$1) create(c4229, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L17
            java.lang.Object r0 = r6.L$1
            java.io.RandomAccessFile r0 = (java.io.RandomAccessFile) r0
            java.lang.Object r6 = r6.L$0
            java.io.Closeable r6 = (java.io.Closeable) r6
            kotlin.AbstractC5185.m10210(r7)     // Catch: java.lang.Throwable -> L15
            goto L4e
        L15:
            r7 = move-exception
            goto L61
        L17:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            r6 = 0
            return r6
        L1e:
            kotlin.AbstractC5185.m10210(r7)
            java.lang.Object r7 = r6.L$0
            io.ktor.utils.io.飘花落叶言子世楪苏兰哲 r7 = (io.ktor.utils.io.C4229) r7
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.io.File r3 = r6.$this_writeChannel
            java.lang.String r4 = "rw"
            r1.<init>(r3, r4)
            io.ktor.utils.io.飘花落叶言子楪苏兰哲世 r7 = r7.f12731     // Catch: java.lang.Throwable -> L5f
            java.nio.channels.FileChannel r3 = r1.getChannel()     // Catch: java.lang.Throwable -> L5f
            r3.getClass()     // Catch: java.lang.Throwable -> L5f
            r6.L$0 = r1     // Catch: java.lang.Throwable -> L5f
            r6.L$1 = r1     // Catch: java.lang.Throwable -> L5f
            r4 = 0
            r6.I$0 = r4     // Catch: java.lang.Throwable -> L5f
            r6.label = r2     // Catch: java.lang.Throwable -> L5f
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r7 = io.ktor.utils.io.AbstractC4244.m8682(r7, r3, r4, r6)     // Catch: java.lang.Throwable -> L5f
            if (r7 != r0) goto L4c
            return r0
        L4c:
            r6 = r1
            r0 = r6
        L4e:
            java.lang.Number r7 = (java.lang.Number) r7     // Catch: java.lang.Throwable -> L15
            long r1 = r7.longValue()     // Catch: java.lang.Throwable -> L15
            r0.setLength(r1)     // Catch: java.lang.Throwable -> L15
            if (r6 == 0) goto L5c
            r6.close()
        L5c:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        L5f:
            r7 = move-exception
            r6 = r1
        L61:
            if (r6 == 0) goto L6b
            r6.close()     // Catch: java.lang.Throwable -> L67
            goto L6b
        L67:
            r6 = move-exception
            kotlin.AbstractC5187.m10216(r7, r6)
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.FileChannelsKt$writeChannel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
