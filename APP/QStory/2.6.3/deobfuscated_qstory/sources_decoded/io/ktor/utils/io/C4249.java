package io.ktor.utils.io;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.io.C5477;
import kotlinx.io.InterfaceC5481;
import p291.AbstractC8493;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4249 implements InterfaceC4252, InterfaceC4247 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12757;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12758 = AtomicReferenceFieldUpdater.newUpdater(C4249.class, Object.class, "suspensionSlot");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final /* synthetic */ long f12759;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final /* synthetic */ long f12760;
    private volatile int flushBufferSize;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f12765;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5477 f12764 = new C5477();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object f12763 = new Object();
    volatile /* synthetic */ Object suspensionSlot = C4234.f12738;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5477 f12762 = new C5477();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5477 f12761 = new C5477();
    volatile /* synthetic */ Object _closedCause = null;

    static {
        Unsafe unsafe = AbstractC8493.f23591;
        f12760 = unsafe.objectFieldOffset(C4249.class.getDeclaredField("suspensionSlot"));
        f12757 = AtomicReferenceFieldUpdater.newUpdater(C4249.class, Object.class, "_closedCause");
        f12759 = unsafe.objectFieldOffset(C4249.class.getDeclaredField("_closedCause"));
    }

    public C4249(boolean z) {
        this.f12765 = z;
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m8698() {
        m8705();
        C4237 c4237 = AbstractC4241.f12745;
        while (true) {
            f12757.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f12759;
            C4249 c4249 = this;
            if (unsafe.compareAndSwapObject(c4249, j, (Object) null, c4237)) {
                c4249.m8701(null);
                return;
            } else if (unsafe.getObjectVolatile(c4249, j) != null) {
                return;
            } else {
                this = c4249;
            }
        }
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo8641() {
        if (mo8644() == null) {
            return m8703() && this.flushBufferSize == 0 && this.f12762.mo10604();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0145, code lost:
    
        if (r9.f12762.f15142 >= 1048576) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0147, code lost:
    
        r9.m8699();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0150, code lost:
    
        if (r9.f12762.f15142 < r10) goto L74;
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
    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8642(int r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C4249.mo8642(int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5481 mo8643() throws Throwable {
        Throwable thMo8644 = mo8644();
        if (thMo8644 != null) {
            throw thMo8644;
        }
        C5477 c5477 = this.f12762;
        if (c5477.mo10604()) {
            m8699();
        }
        return c5477;
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Throwable mo8644() {
        C4237 c4237 = (C4237) this._closedCause;
        if (c4237 != null) {
            return c4237.m8652();
        }
        return null;
    }

    @Override // io.ktor.utils.io.InterfaceC4252
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8645(Throwable th) {
        C4249 c4249;
        if (this._closedCause != null) {
            return;
        }
        C4237 c4237 = new C4237(th);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12757;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f12759;
            c4249 = this;
            if (unsafe.compareAndSwapObject(c4249, j, (Object) null, c4237) || unsafe.getObjectVolatile(c4249, j) != null) {
                break;
            } else {
                this = c4249;
            }
        }
        c4249.m8701(c4237.m8652());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m8699() {
        synchronized (this.f12763) {
            this.f12764.mo10600(this.f12762);
            this.flushBufferSize = 0;
        }
        InterfaceC4250 interfaceC4250 = (InterfaceC4250) this.suspensionSlot;
        if (!(interfaceC4250 instanceof C4231)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12758;
        C4234 c4234 = C4234.f12738;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f12760;
            C4249 c4249 = this;
            if (unsafe.compareAndSwapObject(c4249, j, interfaceC4250, c4234)) {
                ((InterfaceC4232) interfaceC4250).mo8649();
                return;
            } else if (unsafe.getObjectVolatile(c4249, j) != interfaceC4250) {
                return;
            } else {
                this = c4249;
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
    public final java.lang.Object m8700(kotlin.coroutines.InterfaceC4357 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C4249.m8700(kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m8701(Throwable th) {
        C4236 c4236;
        if (th != null) {
            c4236 = new C4236(th);
        } else {
            InterfaceC4250.f12766.getClass();
            c4236 = C4235.f12740;
        }
        f12758.getClass();
        InterfaceC4250 interfaceC4250 = (InterfaceC4250) AbstractC8493.f23591.getAndSetObject(this, f12760, c4236);
        if (interfaceC4250 instanceof InterfaceC4232) {
            ((InterfaceC4232) interfaceC4250).mo8650(th);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C5477 m8702() throws Throwable {
        Throwable thMo8644 = mo8644();
        if (thMo8644 != null) {
            throw thMo8644;
        }
        if (!m8703()) {
            return this.f12761;
        }
        C5925.m11307("Channel is closed for write");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m8703() {
        return this._closedCause != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8704(kotlin.coroutines.InterfaceC4357 r13) {
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
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5176.f14739
            if (r2 == 0) goto L37
            if (r2 != r4) goto L31
            java.lang.Object r12 = r0.L$0
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r12 = (io.ktor.utils.io.C4249) r12
            kotlin.AbstractC5185.m10210(r13)     // Catch: java.lang.Throwable -> L2e
            goto L45
        L2e:
            r0 = move-exception
            r13 = r0
            goto L4a
        L31:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r12)
            return r3
        L37:
            kotlin.AbstractC5185.m10210(r13)
            r0.L$0 = r12     // Catch: java.lang.Throwable -> L2e
            r0.label = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r13 = r12.m8700(r0)     // Catch: java.lang.Throwable -> L2e
            if (r13 != r1) goto L45
            return r1
        L45:
            kotlin.Result.m8745constructorimpl(r5)     // Catch: java.lang.Throwable -> L2e
        L48:
            r7 = r12
            goto L53
        L4a:
            kotlin.Result$Failure r0 = new kotlin.Result$Failure
            r0.<init>(r13)
            kotlin.Result.m8745constructorimpl(r0)
            goto L48
        L53:
            io.ktor.utils.io.飘花落叶言子楪兰世哲苏 r11 = io.ktor.utils.io.AbstractC4241.f12745
        L55:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = io.ktor.utils.io.C4249.f12757
            r12.getClass()
            if (r7 == 0) goto L78
            sun.misc.Unsafe r6 = p291.AbstractC8493.f23591
            long r8 = io.ktor.utils.io.C4249.f12759
            r10 = 0
            boolean r12 = r6.compareAndSwapObject(r7, r8, r10, r11)
            if (r12 == 0) goto L6b
            r7.m8701(r3)
            return r5
        L6b:
            if (r7 == 0) goto L74
            java.lang.Object r12 = r6.getObjectVolatile(r7, r8)
            if (r12 == 0) goto L55
            return r5
        L74:
            com.alibaba.fastjson2.C2942.m6394()
            return r3
        L78:
            com.alibaba.fastjson2.C2942.m6394()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.C4249.m8704(kotlin.coroutines.飘花落叶言子楪世哲苏兰):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m8705() {
        if (this.f12761.mo10604()) {
            return;
        }
        synchronized (this.f12763) {
            C5477 c5477 = this.f12761;
            int i = (int) c5477.f15142;
            this.f12764.m10613(c5477);
            this.flushBufferSize += i;
        }
        InterfaceC4250 interfaceC4250 = (InterfaceC4250) this.suspensionSlot;
        if (!(interfaceC4250 instanceof C4233)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12758;
        C4234 c4234 = C4234.f12738;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f12760;
            C4249 c4249 = this;
            if (unsafe.compareAndSwapObject(c4249, j, interfaceC4250, c4234)) {
                ((InterfaceC4232) interfaceC4250).mo8649();
                return;
            } else if (unsafe.getObjectVolatile(c4249, j) != interfaceC4250) {
                return;
            } else {
                this = c4249;
            }
        }
    }
}
