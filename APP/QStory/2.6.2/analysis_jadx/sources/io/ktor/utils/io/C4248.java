package io.ktor.utils.io;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.io.C5476;
import kotlinx.io.InterfaceC5480;
import p291.AbstractC8501;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4248 implements InterfaceC4251, InterfaceC4246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12753;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12754 = AtomicReferenceFieldUpdater.newUpdater(C4248.class, Object.class, "suspensionSlot");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final /* synthetic */ long f12755;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final /* synthetic */ long f12756;
    private volatile int flushBufferSize;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f12761;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5476 f12760 = new C5476();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f12759 = new Object();
    volatile /* synthetic */ Object suspensionSlot = C4233.f12734;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5476 f12758 = new C5476();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5476 f12757 = new C5476();
    volatile /* synthetic */ Object _closedCause = null;

    static {
        Unsafe unsafe = AbstractC8501.f23600;
        f12756 = unsafe.objectFieldOffset(C4248.class.getDeclaredField("suspensionSlot"));
        f12753 = AtomicReferenceFieldUpdater.newUpdater(C4248.class, Object.class, "_closedCause");
        f12755 = unsafe.objectFieldOffset(C4248.class.getDeclaredField("_closedCause"));
    }

    public C4248(boolean z) {
        this.f12761 = z;
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m8708() {
        m8715();
        C4236 c4236 = AbstractC4240.f12741;
        while (true) {
            f12753.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f12755;
            C4248 c4248 = this;
            if (unsafe.compareAndSwapObject(c4248, j, (Object) null, c4236)) {
                c4248.m8711(null);
                return;
            } else if (unsafe.getObjectVolatile(c4248, j) != null) {
                return;
            } else {
                this = c4248;
            }
        }
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo8651() {
        if (mo8654() == null) {
            return m8713() && this.flushBufferSize == 0 && this.f12758.mo10601();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0145, code lost:
    
        if (r9.f12758.f15142 >= 1048576) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0147, code lost:
    
        r9.m8709();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0150, code lost:
    
        if (r9.f12758.f15142 < r10) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0153, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0158, code lost:
    
        return java.lang.Boolean.valueOf(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa A[EDGE_INSN: B:33:0x00a7->B:34:0x00aa BREAK  A[LOOP:1: B:28:0x008f->B:35:0x00b0], PHI: r11
  0x00aa: PHI (r11v6 io.ktor.utils.io.飘花落叶言子楪苏世兰哲) = 
  (r11v1 io.ktor.utils.io.飘花落叶言子楪苏世兰哲)
  (r11v1 io.ktor.utils.io.飘花落叶言子楪苏世兰哲)
  (r11v1 io.ktor.utils.io.飘花落叶言子楪苏世兰哲)
  (r11v9 io.ktor.utils.io.飘花落叶言子楪苏世兰哲)
 binds: [B:44:0x00d8, B:53:0x00fe, B:50:0x00f4, B:33:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132 A[LOOP:0: B:21:0x005a->B:65:0x0132, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0131 A[SYNTHETIC] */
    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8652(int r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C4248.mo8652(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5480 mo8653() throws Throwable {
        Throwable thMo8654 = mo8654();
        if (thMo8654 != null) {
            throw thMo8654;
        }
        C5476 c5476 = this.f12758;
        if (c5476.mo10601()) {
            m8709();
        }
        return c5476;
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Throwable mo8654() {
        C4236 c4236 = (C4236) this._closedCause;
        if (c4236 != null) {
            return c4236.m8662();
        }
        return null;
    }

    @Override // io.ktor.utils.io.InterfaceC4251
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8655(Throwable th) {
        C4248 c4248;
        if (this._closedCause != null) {
            return;
        }
        C4236 c4236 = new C4236(th);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12753;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f12755;
            c4248 = this;
            if (unsafe.compareAndSwapObject(c4248, j, (Object) null, c4236) || unsafe.getObjectVolatile(c4248, j) != null) {
                break;
            } else {
                this = c4248;
            }
        }
        c4248.m8711(c4236.m8662());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m8709() {
        synchronized (this.f12759) {
            this.f12760.mo10597(this.f12758);
            this.flushBufferSize = 0;
        }
        InterfaceC4249 interfaceC4249 = (InterfaceC4249) this.suspensionSlot;
        if (!(interfaceC4249 instanceof C4230)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12754;
        C4233 c4233 = C4233.f12734;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f12756;
            C4248 c4248 = this;
            if (unsafe.compareAndSwapObject(c4248, j, interfaceC4249, c4233)) {
                ((InterfaceC4231) interfaceC4249).mo8659();
                return;
            } else if (unsafe.getObjectVolatile(c4248, j) != interfaceC4249) {
                return;
            } else {
                this = c4248;
            }
        }
    }

    /* JADX WARN: Path cross not found for [B:51:0x0101, B:61:0x012f], limit reached: 71 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x013b -> B:66:0x013c). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8710(kotlin.coroutines.InterfaceC4356 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C4248.m8710(kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m8711(Throwable th) {
        C4235 c4235;
        if (th != null) {
            c4235 = new C4235(th);
        } else {
            InterfaceC4249.f12762.getClass();
            c4235 = C4234.f12736;
        }
        f12754.getClass();
        InterfaceC4249 interfaceC4249 = (InterfaceC4249) AbstractC8501.f23600.getAndSetObject(this, f12756, c4235);
        if (interfaceC4249 instanceof InterfaceC4231) {
            ((InterfaceC4231) interfaceC4249).mo8660(th);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C5476 m8712() throws Throwable {
        Throwable thMo8654 = mo8654();
        if (thMo8654 != null) {
            throw thMo8654;
        }
        if (!m8713()) {
            return this.f12757;
        }
        C5919.m11246("Channel is closed for write");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m8713() {
        return this._closedCause != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8714(kotlin.coroutines.InterfaceC4356 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof io.ktor.utils.io.ByteChannel$flushAndClose$1
            if (r0 == 0) goto L13
            r0 = r13
            io.ktor.utils.io.ByteChannel$flushAndClose$1 r0 = (io.ktor.utils.io.ByteChannel$flushAndClose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.utils.io.ByteChannel$flushAndClose$1 r0 = new io.ktor.utils.io.ByteChannel$flushAndClose$1
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
            if (r2 == 0) goto L37
            if (r2 != r4) goto L31
            java.lang.Object r12 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r12 = (io.ktor.utils.io.C4248) r12
            kotlin.AbstractC5184.m10206(r13)     // Catch: java.lang.Throwable -> L2e
            goto L45
        L2e:
            r0 = move-exception
            r13 = r0
            goto L4a
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r12)
            return r3
        L37:
            kotlin.AbstractC5184.m10206(r13)
            r0.L$0 = r12     // Catch: java.lang.Throwable -> L2e
            r0.label = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r13 = r12.m8710(r0)     // Catch: java.lang.Throwable -> L2e
            if (r13 != r1) goto L45
            return r1
        L45:
            kotlin.Result.m8755constructorimpl(r5)     // Catch: java.lang.Throwable -> L2e
        L48:
            r7 = r12
            goto L53
        L4a:
            kotlin.Result$Failure r0 = new kotlin.Result$Failure
            r0.<init>(r13)
            kotlin.Result.m8755constructorimpl(r0)
            goto L48
        L53:
            io.ktor.utils.io.飘花落叶言子楪兰世哲苏 r11 = io.ktor.utils.io.AbstractC4240.f12741
        L55:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = io.ktor.utils.io.C4248.f12753
            r12.getClass()
            if (r7 == 0) goto L78
            sun.misc.Unsafe r6 = p291.AbstractC8501.f23600
            long r8 = io.ktor.utils.io.C4248.f12755
            r10 = 0
            boolean r12 = r6.compareAndSwapObject(r7, r8, r10, r11)
            if (r12 == 0) goto L6b
            r7.m8711(r3)
            return r5
        L6b:
            if (r7 == 0) goto L74
            java.lang.Object r12 = r6.getObjectVolatile(r7, r8)
            if (r12 == 0) goto L55
            return r5
        L74:
            com.alibaba.fastjson2.C2941.m6336()
            return r3
        L78:
            com.alibaba.fastjson2.C2941.m6336()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C4248.m8714(kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m8715() {
        if (this.f12757.mo10601()) {
            return;
        }
        synchronized (this.f12759) {
            C5476 c5476 = this.f12757;
            int i = (int) c5476.f15142;
            this.f12760.m10609(c5476);
            this.flushBufferSize += i;
        }
        InterfaceC4249 interfaceC4249 = (InterfaceC4249) this.suspensionSlot;
        if (!(interfaceC4249 instanceof C4232)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12754;
        C4233 c4233 = C4233.f12734;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f12756;
            C4248 c4248 = this;
            if (unsafe.compareAndSwapObject(c4248, j, interfaceC4249, c4233)) {
                ((InterfaceC4231) interfaceC4249).mo8659();
                return;
            } else if (unsafe.getObjectVolatile(c4248, j) != interfaceC4249) {
                return;
            } else {
                this = c4248;
            }
        }
    }
}
