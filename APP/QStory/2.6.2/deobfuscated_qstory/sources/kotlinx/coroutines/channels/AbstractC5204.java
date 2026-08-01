package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5401;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5204 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C5203 m10273(InterfaceC5400 interfaceC5400, C5401 c5401, int i, InterfaceC6553 interfaceC6553, int i2) {
        InterfaceC4359 interfaceC4359 = c5401;
        if ((i2 & 1) != 0) {
            interfaceC4359 = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        C5203 c5203 = new C5203(AbstractC5398.m10472(interfaceC5400, interfaceC4359), m10278(i, 4, bufferOverflow), true, true);
        coroutineStart.invoke(interfaceC6553, c5203, c5203);
        return c5203;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final void m10274(InterfaceC5198 interfaceC5198, Throwable th) {
        CancellationException cancellationExceptionM10487 = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationExceptionM10487 == null) {
            cancellationExceptionM10487 = AbstractC5398.m10487("Channel was consumed, consumer had failed", th);
        }
        interfaceC5198.mo10252(cancellationExceptionM10487);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10275(kotlinx.coroutines.channels.InterfaceC5195 r5, p052.InterfaceC6542 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = (kotlinx.coroutines.channels.ProduceKt$awaitClose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.ProduceKt$awaitClose$1 r0 = new kotlinx.coroutines.channels.ProduceKt$awaitClose$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L33
            java.lang.Object r5 = r0.L$1
            r6 = r5
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r6 = (p052.InterfaceC6542) r6
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰世苏哲 r5 = (kotlinx.coroutines.channels.InterfaceC5195) r5
            kotlin.AbstractC5184.m10206(r7)     // Catch: java.lang.Throwable -> L31
            goto L70
        L31:
            r5 = move-exception
            goto L76
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        L39:
            kotlin.AbstractC5184.m10206(r7)
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r7 = r0.getContext()
            kotlinx.coroutines.飘花落叶言子苏世楪哲兰 r2 = kotlinx.coroutines.C5452.f15105
            kotlin.coroutines.飘花落叶言子楪世兰哲苏 r7 = r7.get(r2)
            if (r7 != r5) goto L7a
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L31
            r0.L$1 = r6     // Catch: java.lang.Throwable -> L31
            r7 = 0
            r0.I$0 = r7     // Catch: java.lang.Throwable -> L31
            r0.label = r4     // Catch: java.lang.Throwable -> L31
            kotlinx.coroutines.飘花落叶言子楪苏兰世哲 r7 = new kotlinx.coroutines.飘花落叶言子楪苏兰世哲     // Catch: java.lang.Throwable -> L31
            kotlin.coroutines.飘花落叶言子楪世哲苏兰 r0 = com.bumptech.glide.AbstractC3054.m6602(r0)     // Catch: java.lang.Throwable -> L31
            r7.<init>(r4, r0)     // Catch: java.lang.Throwable -> L31
            r7.m10539()     // Catch: java.lang.Throwable -> L31
            androidx.compose.foundation.text.飘花落叶言子苏楪兰哲世 r0 = new androidx.compose.foundation.text.飘花落叶言子苏楪兰哲世     // Catch: java.lang.Throwable -> L31
            r2 = 19
            r0.<init>(r7, r2)     // Catch: java.lang.Throwable -> L31
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲世兰 r5 = (kotlinx.coroutines.channels.AbstractC5210) r5     // Catch: java.lang.Throwable -> L31
            r5.mo8442(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r7.m10536()     // Catch: java.lang.Throwable -> L31
            if (r5 != r1) goto L70
            return r1
        L70:
            r6.invoke()
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
            return r5
        L76:
            r6.invoke()
            throw r5
        L7a:
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractC5204.m10275(kotlinx.coroutines.channels.飘花落叶言子楪兰世苏哲, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x014e -> B:48:0x0153). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons m10276(long r23, long r25, kotlinx.coroutines.channels.InterfaceC5199 r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractC5204.m10276(long, long, kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
    
        if (kotlinx.coroutines.AbstractC5398.m10495(r10, r0) != r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0089 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.coroutines.intrinsics.CoroutineSingletons m10277(long r8, long r10, kotlinx.coroutines.channels.InterfaceC5199 r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            boolean r0 = r13 instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            if (r0 == 0) goto L13
            r0 = r13
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L57
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L38
            long r8 = r0.J$1
            long r10 = r0.J$0
            java.lang.Object r12 = r0.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世 r12 = (kotlinx.coroutines.channels.InterfaceC5199) r12
            kotlin.AbstractC5184.m10206(r13)
        L34:
            r6 = r10
            r10 = r8
            r8 = r6
            goto L69
        L38:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            r8 = 0
            return r8
        L3f:
            long r8 = r0.J$1
            long r10 = r0.J$0
            java.lang.Object r12 = r0.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世 r12 = (kotlinx.coroutines.channels.InterfaceC5199) r12
            kotlin.AbstractC5184.m10206(r13)
            goto L7d
        L4b:
            long r10 = r0.J$1
            long r8 = r0.J$0
            java.lang.Object r12 = r0.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世 r12 = (kotlinx.coroutines.channels.InterfaceC5199) r12
            kotlin.AbstractC5184.m10206(r13)
            goto L69
        L57:
            kotlin.AbstractC5184.m10206(r13)
            r0.L$0 = r12
            r0.J$0 = r8
            r0.J$1 = r10
            r0.label = r5
            java.lang.Object r13 = kotlinx.coroutines.AbstractC5398.m10495(r10, r0)
            if (r13 != r1) goto L69
            goto L8b
        L69:
            r0.L$0 = r12
            r0.J$0 = r8
            r0.J$1 = r10
            r0.label = r4
            kotlin.飘花落叶言子楪兰苏哲世 r13 = kotlin.C5175.f14739
            java.lang.Object r13 = r12.mo8443(r13, r0)
            if (r13 != r1) goto L7a
            goto L8b
        L7a:
            r6 = r10
            r10 = r8
            r8 = r6
        L7d:
            r0.L$0 = r12
            r0.J$0 = r10
            r0.J$1 = r8
            r0.label = r3
            java.lang.Object r13 = kotlinx.coroutines.AbstractC5398.m10495(r10, r0)
            if (r13 != r1) goto L34
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractC5204.m10277(long, long, kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C5189 m10278(int i, int i2, BufferOverflow bufferOverflow) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if (i == -2) {
            if (bufferOverflow != BufferOverflow.SUSPEND) {
                return new C5205(1, bufferOverflow);
            }
            InterfaceC5206.f14794.getClass();
            return new C5189(C5207.f14795);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.SUSPEND ? new C5189(i) : new C5205(i, bufferOverflow) : new C5189(Integer.MAX_VALUE) : bufferOverflow == BufferOverflow.SUSPEND ? new C5189(0) : new C5205(1, bufferOverflow);
        }
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            return new C5205(1, BufferOverflow.DROP_OLDEST);
        }
        C5919.m11249("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6 A[Catch: all -> 0x00dd, TRY_LEAVE, TryCatch #2 {all -> 0x00dd, blocks: (B:25:0x0088, B:29:0x00ae, B:31:0x00b6, B:24:0x0081), top: B:45:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10279(kotlinx.coroutines.channels.InterfaceC5198 r12, kotlinx.coroutines.channels.InterfaceC5199 r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractC5204.m10279(kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲, kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
