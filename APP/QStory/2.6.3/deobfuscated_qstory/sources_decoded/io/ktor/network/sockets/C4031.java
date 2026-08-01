package io.ktor.network.sockets;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2942;
import com.materialkolor.dynamiccolor.C3807;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlinx.coroutines.channels.InterfaceC5200;
import p052.InterfaceC6558;
import p291.AbstractC8493;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4031 implements InterfaceC5200 {
    private volatile /* synthetic */ int closed;
    private volatile /* synthetic */ Object closedCause;
    private volatile /* synthetic */ Object onCloseHandler;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12299 = AtomicReferenceFieldUpdater.newUpdater(C4031.class, Object.class, "onCloseHandler");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f12298 = AbstractC8493.f23591.objectFieldOffset(C4031.class.getDeclaredField("onCloseHandler"));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12297 = AtomicIntegerFieldUpdater.newUpdater(C4031.class, "closed");

    @Override // kotlinx.coroutines.channels.InterfaceC5200
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void mo8432(InterfaceC6558 interfaceC6558) {
        String str;
        Unsafe unsafe;
        long j;
        C3807 c3807 = AbstractC4010.f12273;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12299;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe2 = AbstractC8493.f23591;
            long j2 = f12298;
            C4031 c4031 = this;
            InterfaceC6558 interfaceC65582 = interfaceC6558;
            if (unsafe2.compareAndSwapObject(c4031, j2, (Object) null, interfaceC65582)) {
                return;
            }
            if (unsafe2.getObjectVolatile(c4031, j2) != null) {
                Object obj = c4031.onCloseHandler;
                C3807 c38072 = AbstractC4010.f12274;
                if (obj != c38072) {
                    InterfaceC6558 interfaceC65583 = (InterfaceC6558) c4031.onCloseHandler;
                    if (interfaceC65583 == c3807) {
                        str = "Another handler was already registered and successfully invoked";
                    } else {
                        str = "Another handler was already registered: " + interfaceC65583;
                    }
                    C5925.m11311(str);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12299;
                do {
                    atomicReferenceFieldUpdater2.getClass();
                    unsafe = AbstractC8493.f23591;
                    j = f12298;
                    if (unsafe.compareAndSwapObject(c4031, j, c38072, c3807)) {
                        interfaceC65582.invoke(c4031.closedCause);
                        return;
                    }
                } while (unsafe.getObjectVolatile(c4031, j) == c38072);
                C5925.m11310("Failed requirement.");
                return;
            }
            this = c4031;
            interfaceC6558 = interfaceC65582;
        }
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5200
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object mo8433(Object obj, InterfaceC4357 interfaceC4357) {
        if (obj == null) {
            return m8434(interfaceC4357);
        }
        C2942.m6394();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8434(kotlin.coroutines.InterfaceC4357 r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.network.sockets.DatagramSendChannel$send$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.network.sockets.DatagramSendChannel$send$1 r0 = (io.ktor.network.sockets.DatagramSendChannel$send$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.network.sockets.DatagramSendChannel$send$1 r0 = new io.ktor.network.sockets.DatagramSendChannel$send$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L77
            r6 = 2
            if (r2 == r4) goto L37
            if (r2 != r6) goto L31
            java.lang.Object r6 = r0.L$0
            kotlinx.coroutines.sync.飘花落叶言子楪世苏哲兰 r6 = (kotlinx.coroutines.sync.InterfaceC5383) r6
            kotlin.AbstractC5185.m10210(r7)     // Catch: java.lang.Throwable -> L2f
            goto L5f
        L2f:
            r7 = move-exception
            goto L6d
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r3
        L37:
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.sync.飘花落叶言子楪世苏哲兰 r2 = (kotlinx.coroutines.sync.InterfaceC5383) r2
            java.lang.Object r4 = r0.L$1
            if (r4 != 0) goto L73
            java.lang.Object r4 = r0.L$0
            io.ktor.network.sockets.飘花落叶言子楪苏哲兰世 r4 = (io.ktor.network.sockets.C4031) r4
            kotlin.AbstractC5185.m10210(r7)
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲 r7 = kotlinx.coroutines.AbstractC5395.f15030     // Catch: java.lang.Throwable -> L6a
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世哲兰苏 r7 = p095.ExecutorC7208.f19225     // Catch: java.lang.Throwable -> L6a
            io.ktor.network.sockets.DatagramSendChannel$send$2$1 r5 = new io.ktor.network.sockets.DatagramSendChannel$send$2$1     // Catch: java.lang.Throwable -> L67
            r5.<init>(r3, r4, r3)     // Catch: java.lang.Throwable -> L67
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L67
            r0.L$1 = r3     // Catch: java.lang.Throwable -> L67
            r0.L$2 = r3     // Catch: java.lang.Throwable -> L67
            r0.label = r6     // Catch: java.lang.Throwable -> L67
            java.lang.Object r6 = kotlinx.coroutines.AbstractC5399.m10470(r7, r5, r0)     // Catch: java.lang.Throwable -> L67
            if (r6 != r1) goto L5e
            return r1
        L5e:
            r6 = r2
        L5f:
            kotlinx.coroutines.sync.飘花落叶言子楪世哲兰苏 r6 = (kotlinx.coroutines.sync.C5380) r6
            r6.m10432(r3)
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        L67:
            r7 = move-exception
        L68:
            r6 = r2
            goto L6d
        L6a:
            r6 = move-exception
            r7 = r6
            goto L68
        L6d:
            kotlinx.coroutines.sync.飘花落叶言子楪世哲兰苏 r6 = (kotlinx.coroutines.sync.C5380) r6
            r6.m10432(r3)
            throw r7
        L73:
            com.alibaba.fastjson2.C2942.m6394()
            return r3
        L77:
            kotlin.AbstractC5185.m10210(r7)
            r0.L$0 = r6
            r0.L$1 = r3
            r0.L$2 = r3
            r0.label = r4
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.C4031.m8434(kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5200
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean mo8435(Throwable th) {
        if (!f12297.compareAndSet(this, 0, 1)) {
            return false;
        }
        this.closedCause = null;
        throw null;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5200
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Object mo8436(Object obj) {
        AbstractC0053.m137(C5176.f14739);
        throw null;
    }
}
