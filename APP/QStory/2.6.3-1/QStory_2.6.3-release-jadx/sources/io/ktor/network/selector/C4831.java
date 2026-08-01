package io.ktor.network.selector;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p307.AbstractC9322;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4831 {
    private volatile /* synthetic */ Object _cur = new C4837(8);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12595 = AtomicReferenceFieldUpdater.newUpdater(C4831.class, Object.class, "_cur");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f12594 = AbstractC9322.f23936.objectFieldOffset(C4831.class.getDeclaredField("_cur"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m8943() {
        C4831 c4831;
        while (true) {
            C4837 c4837 = (C4837) this._cur;
            Object objM8967 = c4837.m8967();
            if (objM8967 != C4837.f12606) {
                return objM8967;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12595;
            C4837 c4837M8968 = c4837.m8968();
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC9322.f23936;
                long j = f12594;
                c4831 = this;
                if (!unsafe.compareAndSwapObject(c4831, j, c4837, c4837M8968) && unsafe.getObjectVolatile(c4831, j) == c4837) {
                    this = c4831;
                }
            }
            this = c4831;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m8944() {
        return ((C4837) this._cur).m8969();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8945() {
        C4831 c4831;
        while (true) {
            C4837 c4837 = (C4837) this._cur;
            if (c4837.m8970()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12595;
            C4837 c4837M8968 = c4837.m8968();
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC9322.f23936;
                long j = f12594;
                c4831 = this;
                if (!unsafe.compareAndSwapObject(c4831, j, c4837, c4837M8968) && unsafe.getObjectVolatile(c4831, j) == c4837) {
                    this = c4831;
                }
            }
            this = c4831;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m8946(InterfaceC4840 interfaceC4840) {
        C4831 c4831;
        interfaceC4840.getClass();
        while (true) {
            C4837 c4837 = (C4837) this._cur;
            int iM8972 = c4837.m8972(interfaceC4840);
            if (iM8972 == 0) {
                return true;
            }
            if (iM8972 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12595;
                C4837 c4837M8968 = c4837.m8968();
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe = AbstractC9322.f23936;
                    long j = f12594;
                    c4831 = this;
                    if (!unsafe.compareAndSwapObject(c4831, j, c4837, c4837M8968) && unsafe.getObjectVolatile(c4831, j) == c4837) {
                        this = c4831;
                    }
                }
            } else {
                if (iM8972 == 2) {
                    return false;
                }
                c4831 = this;
            }
            this = c4831;
        }
    }
}
