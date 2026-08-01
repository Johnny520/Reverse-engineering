package io.ktor.util.cio;

import io.ktor.utils.io.C4225;
import kotlin.C5175;
import kotlin.InterfaceC5183;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.util.cio.FileChannelsKt$readChannel$writer$1", f = "FileChannels.kt", l = {42}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class FileChannelsKt$readChannel$writer$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ long $endInclusive;
    final /* synthetic */ long $fileLength;
    final /* synthetic */ InterfaceC5183 $randomAccessFile$delegate;
    final /* synthetic */ long $start;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileChannelsKt$readChannel$writer$1(long j, long j2, long j3, InterfaceC5183 interfaceC5183, InterfaceC4356<? super FileChannelsKt$readChannel$writer$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$start = j;
        this.$endInclusive = j2;
        this.$fileLength = j3;
        this.$randomAccessFile$delegate = interfaceC5183;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        FileChannelsKt$readChannel$writer$1 fileChannelsKt$readChannel$writer$1 = new FileChannelsKt$readChannel$writer$1(this.$start, this.$endInclusive, this.$fileLength, this.$randomAccessFile$delegate, interfaceC4356);
        fileChannelsKt$readChannel$writer$1.L$0 = obj;
        return fileChannelsKt$readChannel$writer$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4225 c4225, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((FileChannelsKt$readChannel$writer$1) create(c4225, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 != r3) goto L15
            java.lang.Object r12 = r12.L$0
            java.io.Closeable r12 = (java.io.Closeable) r12
            kotlin.AbstractC5184.m10206(r13)     // Catch: java.lang.Throwable -> L12
            goto L5a
        L12:
            r0 = move-exception
            r13 = r0
            goto L67
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r12)
            return r2
        L1b:
            kotlin.AbstractC5184.m10206(r13)
            java.lang.Object r13 = r12.L$0
            r5 = r13
            io.ktor.utils.io.飘花落叶言子世楪兰苏哲 r5 = (io.ktor.utils.io.C4225) r5
            long r6 = r12.$start
            r8 = 0
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r13 < 0) goto L93
            long r1 = r12.$endInclusive
            long r6 = r12.$fileLength
            r8 = 1
            long r8 = r6 - r8
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 > 0) goto L73
            kotlin.飘花落叶言子楪苏世哲兰 r13 = r12.$randomAccessFile$delegate
            java.lang.Object r13 = r13.getValue()
            java.io.RandomAccessFile r13 = (java.io.RandomAccessFile) r13
            long r6 = r12.$start
            long r8 = r12.$endInclusive
            java.nio.channels.FileChannel r4 = r13.getChannel()     // Catch: java.lang.Throwable -> L62
            r4.getClass()     // Catch: java.lang.Throwable -> L62
            r12.L$0 = r13     // Catch: java.lang.Throwable -> L62
            r1 = 0
            r12.I$0 = r1     // Catch: java.lang.Throwable -> L62
            r12.label = r3     // Catch: java.lang.Throwable -> L62
            r10 = r12
            java.lang.Object r12 = io.ktor.util.cio.AbstractC4184.m8560(r4, r5, r6, r8, r10)     // Catch: java.lang.Throwable -> L62
            if (r12 != r0) goto L59
            return r0
        L59:
            r12 = r13
        L5a:
            if (r12 == 0) goto L5f
            r12.close()
        L5f:
            kotlin.飘花落叶言子楪兰苏哲世 r12 = kotlin.C5175.f14739
            return r12
        L62:
            r0 = move-exception
            r12 = r0
            r11 = r13
            r13 = r12
            r12 = r11
        L67:
            if (r12 == 0) goto L72
            r12.close()     // Catch: java.lang.Throwable -> L6d
            goto L72
        L6d:
            r0 = move-exception
            r12 = r0
            kotlin.AbstractC5186.m10212(r13, r12)
        L72:
            throw r13
        L73:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "endInclusive points to the position out of the file: file size = "
            r12.<init>(r13)
            r12.append(r6)
            java.lang.String r13 = ", endInclusive = "
            r12.append(r13)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        L93:
            java.lang.String r12 = "start position shouldn't be negative but it is "
            java.lang.String r12 = androidx.profileinstaller.AbstractC2442.m4572(r6, r12)
            top.suzhelan.qstory.hook.item.C5919.m11253(r12)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.FileChannelsKt$readChannel$writer$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
