package io.ktor.network.sockets;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2941;
import com.materialkolor.dynamiccolor.C3806;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlinx.coroutines.channels.InterfaceC5199;
import p052.InterfaceC6557;
import p291.AbstractC8501;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.network.sockets.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4030 implements InterfaceC5199 {
    private volatile /* synthetic */ int closed;
    private volatile /* synthetic */ Object closedCause;
    private volatile /* synthetic */ Object onCloseHandler;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12295 = AtomicReferenceFieldUpdater.newUpdater(C4030.class, Object.class, "onCloseHandler");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f12294 = AbstractC8501.f23600.objectFieldOffset(C4030.class.getDeclaredField("onCloseHandler"));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12293 = AtomicIntegerFieldUpdater.newUpdater(C4030.class, "closed");

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void mo8442(InterfaceC6557 interfaceC6557) {
        String str;
        Unsafe unsafe;
        long j;
        C3806 c3806 = AbstractC4009.f12269;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12295;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe2 = AbstractC8501.f23600;
            long j2 = f12294;
            C4030 c4030 = this;
            InterfaceC6557 interfaceC65572 = interfaceC6557;
            if (unsafe2.compareAndSwapObject(c4030, j2, (Object) null, interfaceC65572)) {
                return;
            }
            if (unsafe2.getObjectVolatile(c4030, j2) != null) {
                Object obj = c4030.onCloseHandler;
                C3806 c38062 = AbstractC4009.f12270;
                if (obj != c38062) {
                    InterfaceC6557 interfaceC65573 = (InterfaceC6557) c4030.onCloseHandler;
                    if (interfaceC65573 == c3806) {
                        str = "Another handler was already registered and successfully invoked";
                    } else {
                        str = "Another handler was already registered: " + interfaceC65573;
                    }
                    C5919.m11250(str);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f12295;
                do {
                    atomicReferenceFieldUpdater2.getClass();
                    unsafe = AbstractC8501.f23600;
                    j = f12294;
                    if (unsafe.compareAndSwapObject(c4030, j, c38062, c3806)) {
                        interfaceC65572.invoke(c4030.closedCause);
                        return;
                    }
                } while (unsafe.getObjectVolatile(c4030, j) == c38062);
                C5919.m11249("Failed requirement.");
                return;
            }
            this = c4030;
            interfaceC6557 = interfaceC65572;
        }
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ Object mo8443(Object obj, InterfaceC4356 interfaceC4356) {
        if (obj == null) {
            return m8444(interfaceC4356);
        }
        C2941.m6336();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8444(kotlin.coroutines.InterfaceC4356 r7) throws java.lang.Throwable {
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
            kotlinx.coroutines.sync.飘花落叶言子楪世苏哲兰 r6 = (kotlinx.coroutines.sync.InterfaceC5382) r6
            kotlin.AbstractC5184.m10206(r7)     // Catch: java.lang.Throwable -> L2f
            goto L5f
        L2f:
            r7 = move-exception
            goto L6d
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r3
        L37:
            java.lang.Object r2 = r0.L$2
            kotlinx.coroutines.sync.飘花落叶言子楪世苏哲兰 r2 = (kotlinx.coroutines.sync.InterfaceC5382) r2
            java.lang.Object r4 = r0.L$1
            if (r4 != 0) goto L73
            java.lang.Object r4 = r0.L$0
            io.ktor.network.sockets.飘花落叶言子楪苏哲兰世 r4 = (io.ktor.network.sockets.C4030) r4
            kotlin.AbstractC5184.m10206(r7)
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰苏哲 r7 = kotlinx.coroutines.AbstractC5394.f15030     // Catch: java.lang.Throwable -> L6a
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世哲兰苏 r7 = p095.ExecutorC7207.f19230     // Catch: java.lang.Throwable -> L6a
            io.ktor.network.sockets.DatagramSendChannel$send$2$1 r5 = new io.ktor.network.sockets.DatagramSendChannel$send$2$1     // Catch: java.lang.Throwable -> L67
            r5.<init>(r3, r4, r3)     // Catch: java.lang.Throwable -> L67
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L67
            r0.L$1 = r3     // Catch: java.lang.Throwable -> L67
            r0.L$2 = r3     // Catch: java.lang.Throwable -> L67
            r0.label = r6     // Catch: java.lang.Throwable -> L67
            java.lang.Object r6 = kotlinx.coroutines.AbstractC5398.m10466(r7, r5, r0)     // Catch: java.lang.Throwable -> L67
            if (r6 != r1) goto L5e
            return r1
        L5e:
            r6 = r2
        L5f:
            kotlinx.coroutines.sync.飘花落叶言子楪世哲兰苏 r6 = (kotlinx.coroutines.sync.C5379) r6
            r6.m10428(r3)
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
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
            kotlinx.coroutines.sync.飘花落叶言子楪世哲兰苏 r6 = (kotlinx.coroutines.sync.C5379) r6
            r6.m10428(r3)
            throw r7
        L73:
            com.alibaba.fastjson2.C2941.m6336()
            return r3
        L77:
            kotlin.AbstractC5184.m10206(r7)
            r0.L$0 = r6
            r0.L$1 = r3
            r0.L$2 = r3
            r0.label = r4
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.network.sockets.C4030.m8444(kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Object mo8445(Object obj) {
        AbstractC0053.m137(C5175.f14739);
        throw null;
    }

    @Override // kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean mo8446(Throwable th) {
        if (!f12293.compareAndSet(this, 0, 1)) {
            return false;
        }
        this.closedCause = null;
        throw null;
    }
}
