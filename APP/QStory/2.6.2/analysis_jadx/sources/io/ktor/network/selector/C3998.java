package io.ktor.network.selector;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p291.AbstractC8501;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: io.ktor.network.selector.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3998 {
    private volatile /* synthetic */ Object _cur = new C4004(8);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12246 = AtomicReferenceFieldUpdater.newUpdater(C3998.class, Object.class, "_cur");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f12245 = AbstractC8501.f23600.objectFieldOffset(C3998.class.getDeclaredField("_cur"));

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m8394() {
        C3998 c3998;
        while (true) {
            C4004 c4004 = (C4004) this._cur;
            Object objM8418 = c4004.m8418();
            if (objM8418 != C4004.f12257) {
                return objM8418;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12246;
            C4004 c4004M8419 = c4004.m8419();
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC8501.f23600;
                long j = f12245;
                c3998 = this;
                if (!unsafe.compareAndSwapObject(c3998, j, c4004, c4004M8419) && unsafe.getObjectVolatile(c3998, j) == c4004) {
                    this = c3998;
                }
            }
            this = c3998;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m8395() {
        return ((C4004) this._cur).m8420();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m8396() {
        C3998 c3998;
        while (true) {
            C4004 c4004 = (C4004) this._cur;
            if (c4004.m8421()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12246;
            C4004 c4004M8419 = c4004.m8419();
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = AbstractC8501.f23600;
                long j = f12245;
                c3998 = this;
                if (!unsafe.compareAndSwapObject(c3998, j, c4004, c4004M8419) && unsafe.getObjectVolatile(c3998, j) == c4004) {
                    this = c3998;
                }
            }
            this = c3998;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m8397(InterfaceC4007 interfaceC4007) {
        C3998 c3998;
        interfaceC4007.getClass();
        while (true) {
            C4004 c4004 = (C4004) this._cur;
            int iM8423 = c4004.m8423(interfaceC4007);
            if (iM8423 == 0) {
                return true;
            }
            if (iM8423 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12246;
                C4004 c4004M8419 = c4004.m8419();
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe = AbstractC8501.f23600;
                    long j = f12245;
                    c3998 = this;
                    if (!unsafe.compareAndSwapObject(c3998, j, c4004, c4004M8419) && unsafe.getObjectVolatile(c3998, j) == c4004) {
                        this = c3998;
                    }
                }
            } else {
                if (iM8423 == 2) {
                    return false;
                }
                c3998 = this;
            }
            this = c3998;
        }
    }
}
