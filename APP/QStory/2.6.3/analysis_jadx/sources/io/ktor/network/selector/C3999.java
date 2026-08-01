package io.ktor.network.selector;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p291.AbstractC8493;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3999 {
    private volatile /* synthetic */ Object _cur = new C4005(8);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12250 = AtomicReferenceFieldUpdater.newUpdater(C3999.class, Object.class, "_cur");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f12249 = AbstractC8493.f23591.objectFieldOffset(C3999.class.getDeclaredField("_cur"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m8384() {
        C3999 c3999;
        while (true) {
            C4005 c4005 = (C4005) this._cur;
            Object objM8408 = c4005.m8408();
            if (objM8408 != C4005.f12261) {
                return objM8408;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12250;
            C4005 c4005M8409 = c4005.m8409();
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC8493.f23591;
                long j = f12249;
                c3999 = this;
                if (!unsafe.compareAndSwapObject(c3999, j, c4005, c4005M8409) && unsafe.getObjectVolatile(c3999, j) == c4005) {
                    this = c3999;
                }
            }
            this = c3999;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m8385() {
        return ((C4005) this._cur).m8410();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8386() {
        C3999 c3999;
        while (true) {
            C4005 c4005 = (C4005) this._cur;
            if (c4005.m8411()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12250;
            C4005 c4005M8409 = c4005.m8409();
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC8493.f23591;
                long j = f12249;
                c3999 = this;
                if (!unsafe.compareAndSwapObject(c3999, j, c4005, c4005M8409) && unsafe.getObjectVolatile(c3999, j) == c4005) {
                    this = c3999;
                }
            }
            this = c3999;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m8387(InterfaceC4008 interfaceC4008) {
        C3999 c3999;
        interfaceC4008.getClass();
        while (true) {
            C4005 c4005 = (C4005) this._cur;
            int iM8413 = c4005.m8413(interfaceC4008);
            if (iM8413 == 0) {
                return true;
            }
            if (iM8413 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12250;
                C4005 c4005M8409 = c4005.m8409();
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe = AbstractC8493.f23591;
                    long j = f12249;
                    c3999 = this;
                    if (!unsafe.compareAndSwapObject(c3999, j, c4005, c4005M8409) && unsafe.getObjectVolatile(c3999, j) == c4005) {
                        this = c3999;
                    }
                }
            } else {
                if (iM8413 == 2) {
                    return false;
                }
                c3999 = this;
            }
            this = c3999;
        }
    }
}
