package io.ktor.server.cio;

import androidx.compose.foundation.C1067;
import io.ktor.server.application.C4057;
import io.ktor.server.engine.AbstractC4089;
import io.ktor.server.engine.C4091;
import io.ktor.server.engine.InterfaceC4093;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5437;
import kotlinx.coroutines.C5450;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5451;
import p052.InterfaceC6542;
import p095.C7206;
import p095.ExecutorC7207;
import p230.C8048;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4080 extends AbstractC4089 {
    private volatile InterfaceC5451 serverJob;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6542 f12387;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4081 f12388;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ExecutorC7207 f12389;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ExecutorC7207 f12390;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5437 f12391;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C5450 f12392;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4080(C4091 c4091, C8048 c8048, boolean z, C4081 c4081, InterfaceC6542 interfaceC6542) {
        super(c4091, c8048, z);
        c8048.getClass();
        this.f12388 = c4081;
        this.f12387 = interfaceC6542;
        C7206 c7206 = AbstractC5394.f15030;
        ExecutorC7207 executorC7207 = ExecutorC7207.f19230;
        this.f12390 = executorC7207;
        this.f12389 = executorC7207;
        C5437 c5437M10486 = AbstractC5398.m10486();
        this.f12391 = c5437M10486;
        C5450 c5450M10484 = AbstractC5398.m10484();
        this.f12392 = c5450M10484;
        this.serverJob = AbstractC5398.m10484();
        C4091 c40912 = this.f12427;
        this.serverJob = AbstractC5398.m10473(AbstractC5398.m10485(((C4057) interfaceC6542.invoke()).f12341.plus(executorC7207)), null, CoroutineStart.LAZY, new CIOApplicationEngine$initServerJob$1(this, this.f12424, c5450M10484, c5437M10486, executorC7207, c40912, null), 1);
        this.serverJob.mo10554(new C1067(this, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8489(long r7, long r9, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof io.ktor.server.cio.CIOApplicationEngine$stopSuspend$1
            if (r0 == 0) goto L13
            r0 = r11
            io.ktor.server.cio.CIOApplicationEngine$stopSuspend$1 r0 = (io.ktor.server.cio.CIOApplicationEngine$stopSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.cio.CIOApplicationEngine$stopSuspend$1 r0 = new io.ktor.server.cio.CIOApplicationEngine$stopSuspend$1
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            kotlin.AbstractC5184.m10206(r11)
            return r11
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r5
        L31:
            long r9 = r0.J$1
            long r7 = r0.J$0
            java.lang.Object r6 = r0.L$0
            io.ktor.server.cio.飘花落叶言子楪世哲苏兰 r6 = (io.ktor.server.cio.C4080) r6
            kotlin.AbstractC5184.m10206(r11)
            goto L59
        L3d:
            kotlin.AbstractC5184.m10206(r11)
            kotlinx.coroutines.飘花落叶言子苏世哲楪兰 r11 = r6.f12392
            r11.m10551()
            io.ktor.server.cio.CIOApplicationEngine$stopSuspend$result$1 r11 = new io.ktor.server.cio.CIOApplicationEngine$stopSuspend$result$1
            r11.<init>(r6, r5)
            r0.L$0 = r6
            r0.J$0 = r7
            r0.J$1 = r9
            r0.label = r4
            java.lang.Object r11 = kotlinx.coroutines.AbstractC5398.m10469(r7, r11, r0)
            if (r11 != r1) goto L59
            goto L72
        L59:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            if (r11 != 0) goto L74
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r11 = r6.serverJob
            r11.mo10252(r5)
            long r9 = r9 - r7
            io.ktor.server.cio.CIOApplicationEngine$stopSuspend$2 r7 = new io.ktor.server.cio.CIOApplicationEngine$stopSuspend$2
            r7.<init>(r6, r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.AbstractC5398.m10469(r9, r7, r0)
            if (r6 != r1) goto L73
        L72:
            return r1
        L73:
            return r6
        L74:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.C4080.m8489(long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8490(long j, long j2) throws Throwable {
        AbstractC5398.m10481(EmptyCoroutineContext.INSTANCE, new CIOApplicationEngine$stop$1(this, j, j2, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(2:12|13)(2:14|15))(1:16))(3:17|(0)|29)|20|31|21|(2:27|(1:29))|30) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r5 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        r5.error("Some handlers have thrown an exception", r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8491(boolean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof io.ktor.server.cio.CIOApplicationEngine$startSuspend$1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.server.cio.CIOApplicationEngine$startSuspend$1 r0 = (io.ktor.server.cio.CIOApplicationEngine$startSuspend$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.cio.CIOApplicationEngine$startSuspend$1 r0 = new io.ktor.server.cio.CIOApplicationEngine$startSuspend$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            io.ktor.server.cio.飘花落叶言子楪世哲苏兰 r6 = (io.ktor.server.cio.C4080) r6
            kotlin.AbstractC5184.m10206(r8)
            return r6
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            r6 = 0
            return r6
        L35:
            boolean r7 = r0.Z$0
            java.lang.Object r6 = r0.L$0
            io.ktor.server.cio.飘花落叶言子楪世哲苏兰 r6 = (io.ktor.server.cio.C4080) r6
            kotlin.AbstractC5184.m10206(r8)
            goto L56
        L3f:
            kotlin.AbstractC5184.m10206(r8)
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r8 = r6.serverJob
            r8.start()
            kotlinx.coroutines.飘花落叶言子楪哲兰世苏 r8 = r6.f12391
            r0.L$0 = r6
            r0.Z$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.m10570(r0)
            if (r8 != r1) goto L56
            goto L7b
        L56:
            飘花落叶言楪世子苏兰哲.飘花落叶言子楪世哲兰苏 r8 = r6.f12426
            飘花落叶言楪兰世苏哲子.飘花落叶言子楪世苏哲兰 r2 = io.ktor.server.application.AbstractC4059.f12352
            io.ktor.server.engine.飘花落叶言子楪世哲苏兰 r4 = r6.f12427
            飘花落叶言苏楪子哲兰世.飘花落叶言子楪世苏兰哲 r5 = r4.f12433
            r8.getClass()
            r8.m13505(r2, r4)     // Catch: java.lang.Throwable -> L65
            goto L6d
        L65:
            r8 = move-exception
            if (r5 == 0) goto L6d
            java.lang.String r2 = "Some handlers have thrown an exception"
            r5.error(r2, r8)
        L6d:
            if (r7 == 0) goto L7c
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r7 = r6.serverJob
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r7.mo10558(r0)
            if (r7 != r1) goto L7c
        L7b:
            return r1
        L7c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.C4080.m8491(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4093 m8492(boolean z) {
        return (InterfaceC4093) AbstractC5398.m10481(EmptyCoroutineContext.INSTANCE, new CIOApplicationEngine$start$1(this, z, null));
    }
}
