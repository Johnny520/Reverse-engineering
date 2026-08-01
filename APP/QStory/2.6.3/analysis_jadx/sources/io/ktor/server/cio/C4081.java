package io.ktor.server.cio;

import androidx.compose.foundation.C1067;
import io.ktor.server.application.C4058;
import io.ktor.server.engine.AbstractC4090;
import io.ktor.server.engine.C4092;
import io.ktor.server.engine.InterfaceC4094;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5438;
import kotlinx.coroutines.C5451;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6543;
import p095.C7207;
import p095.ExecutorC7208;
import p230.C8049;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4081 extends AbstractC4090 {
    private volatile InterfaceC5452 serverJob;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6543 f12391;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4082 f12392;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ExecutorC7208 f12393;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ExecutorC7208 f12394;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5438 f12395;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C5451 f12396;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4081(C4092 c4092, C8049 c8049, boolean z, C4082 c4082, InterfaceC6543 interfaceC6543) {
        super(c4092, c8049, z);
        c8049.getClass();
        this.f12392 = c4082;
        this.f12391 = interfaceC6543;
        C7207 c7207 = AbstractC5395.f15030;
        ExecutorC7208 executorC7208 = ExecutorC7208.f19225;
        this.f12394 = executorC7208;
        this.f12393 = executorC7208;
        C5438 c5438M10490 = AbstractC5399.m10490();
        this.f12395 = c5438M10490;
        C5451 c5451M10488 = AbstractC5399.m10488();
        this.f12396 = c5451M10488;
        this.serverJob = AbstractC5399.m10488();
        C4092 c40922 = this.f12431;
        this.serverJob = AbstractC5399.m10477(AbstractC5399.m10489(((C4058) interfaceC6543.invoke()).f12345.plus(executorC7208)), null, CoroutineStart.LAZY, new CIOApplicationEngine$initServerJob$1(this, this.f12428, c5451M10488, c5438M10490, executorC7208, c40922, null), 1);
        this.serverJob.mo10559(new C1067(this, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8479(long r7, long r9, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
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
            kotlin.AbstractC5185.m10210(r11)
            return r11
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r5
        L31:
            long r9 = r0.J$1
            long r7 = r0.J$0
            java.lang.Object r6 = r0.L$0
            io.ktor.server.cio.飘花落叶言子楪世哲苏兰 r6 = (io.ktor.server.cio.C4081) r6
            kotlin.AbstractC5185.m10210(r11)
            goto L59
        L3d:
            kotlin.AbstractC5185.m10210(r11)
            kotlinx.coroutines.飘花落叶言子苏世哲楪兰 r11 = r6.f12396
            r11.m10555()
            io.ktor.server.cio.CIOApplicationEngine$stopSuspend$result$1 r11 = new io.ktor.server.cio.CIOApplicationEngine$stopSuspend$result$1
            r11.<init>(r6, r5)
            r0.L$0 = r6
            r0.J$0 = r7
            r0.J$1 = r9
            r0.label = r4
            java.lang.Object r11 = kotlinx.coroutines.AbstractC5399.m10473(r7, r11, r0)
            if (r11 != r1) goto L59
            goto L72
        L59:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            if (r11 != 0) goto L74
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r11 = r6.serverJob
            r11.mo10256(r5)
            long r9 = r9 - r7
            io.ktor.server.cio.CIOApplicationEngine$stopSuspend$2 r7 = new io.ktor.server.cio.CIOApplicationEngine$stopSuspend$2
            r7.<init>(r6, r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.AbstractC5399.m10473(r9, r7, r0)
            if (r6 != r1) goto L73
        L72:
            return r1
        L73:
            return r6
        L74:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.C4081.m8479(long, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m8480(long j, long j2) throws Throwable {
        AbstractC5399.m10485(EmptyCoroutineContext.INSTANCE, new CIOApplicationEngine$stop$1(this, j, j2, null));
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
    public final java.lang.Object m8481(boolean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
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
            io.ktor.server.cio.飘花落叶言子楪世哲苏兰 r6 = (io.ktor.server.cio.C4081) r6
            kotlin.AbstractC5185.m10210(r8)
            return r6
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            r6 = 0
            return r6
        L35:
            boolean r7 = r0.Z$0
            java.lang.Object r6 = r0.L$0
            io.ktor.server.cio.飘花落叶言子楪世哲苏兰 r6 = (io.ktor.server.cio.C4081) r6
            kotlin.AbstractC5185.m10210(r8)
            goto L56
        L3f:
            kotlin.AbstractC5185.m10210(r8)
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r8 = r6.serverJob
            r8.start()
            kotlinx.coroutines.飘花落叶言子楪哲兰世苏 r8 = r6.f12395
            r0.L$0 = r6
            r0.Z$0 = r7
            r0.label = r4
            java.lang.Object r8 = r8.m10573(r0)
            if (r8 != r1) goto L56
            goto L7b
        L56:
            飘花落叶言楪世子苏兰哲.飘花落叶言子楪世哲兰苏 r8 = r6.f12430
            飘花落叶言楪兰世苏哲子.飘花落叶言子楪世苏哲兰 r2 = io.ktor.server.application.AbstractC4060.f12356
            io.ktor.server.engine.飘花落叶言子楪世哲苏兰 r4 = r6.f12431
            飘花落叶言苏楪子哲世兰.飘花落叶言子楪世苏兰哲 r5 = r4.f12437
            r8.getClass()
            r8.m13532(r2, r4)     // Catch: java.lang.Throwable -> L65
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
            java.lang.Object r7 = r7.mo10564(r0)
            if (r7 != r1) goto L7c
        L7b:
            return r1
        L7c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.C4081.m8481(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4094 m8482(boolean z) {
        return (InterfaceC4094) AbstractC5399.m10485(EmptyCoroutineContext.INSTANCE, new CIOApplicationEngine$start$1(this, z, null));
    }
}
