package kotlinx.coroutines.sync;

import androidx.window.area.AbstractC3400;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6276;
import p307.AbstractC9322;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6212 extends C6217 implements InterfaceC6215 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15336 = AtomicReferenceFieldUpdater.newUpdater(C6212.class, Object.class, "owner$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final /* synthetic */ long f15337 = AbstractC9322.f23936.objectFieldOffset(C6212.class.getDeclaredField("owner$volatile"));
    private volatile /* synthetic */ Object owner$volatile = AbstractC6211.f15335;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC6231.m11060(this));
        sb.append("[isLocked=");
        sb.append(m10987());
        sb.append(",owner=");
        f15336.getClass();
        sb.append(AbstractC9322.f23936.getObjectVolatile(this, f15337));
        sb.append(']');
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r6 = kotlinx.coroutines.sync.C6212.f15336;
        r2 = r0.f15341;
        r6.set(r2, null);
        r6 = r0.f15342;
        r6.m11097(r1, r6.f15376, new androidx.compose.foundation.C1931(new androidx.compose.foundation.C1905(r2, 24, r0), r3));
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m10986(InterfaceC5189 interfaceC5189) {
        boolean zM10990 = m10990();
        C6008 c6008 = C6008.f15084;
        if (!zM10990) {
            C6276 c6276M11051 = AbstractC6231.m11051(AbstractC3400.m5624(interfaceC5189));
            try {
                C6214 c6214 = new C6214(this, c6276M11051);
                while (true) {
                    int andDecrement = C6217.f15349.getAndDecrement(this);
                    int i = 1;
                    if (andDecrement <= 1) {
                        if (andDecrement > 0) {
                            break;
                        }
                        if (m10998(c6214)) {
                            break;
                        }
                    }
                }
                Object objM11099 = c6276M11051.m11099();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objM11099 != coroutineSingletons) {
                    objM11099 = c6008;
                }
                if (objM11099 == coroutineSingletons) {
                    return objM11099;
                }
            } catch (Throwable th) {
                c6276M11051.m11092();
                throw th;
            }
        }
        return c6008;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m10987() {
        return Math.max(C6217.f15349.get(this), 0) == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m10988(Object obj) {
        while (m10987()) {
            f15336.getClass();
            Object objectVolatile = AbstractC9322.f23936.getObjectVolatile(this, f15337);
            if (objectVolatile != AbstractC6211.f15335) {
                return objectVolatile == obj ? 1 : 2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int m10989() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C6217.f15349;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 > 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
            } else {
                if (i2 <= 0) {
                    return 1;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    f15336.getClass();
                    AbstractC9322.f23936.putObjectVolatile(this, f15337, (Object) null);
                    return 0;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m10990() {
        int iM10989 = m10989();
        if (iM10989 == 0) {
            return true;
        }
        if (iM10989 == 1) {
            return false;
        }
        if (iM10989 != 2) {
            C6755.m11870("unexpected");
            return false;
        }
        C6755.m11871("This mutex is already locked by the specified owner: null");
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m10991(Object obj) {
        while (this.m10987()) {
            f15336.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15337;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            C5317 c5317 = AbstractC6211.f15335;
            if (objectVolatile != c5317) {
                if (objectVolatile != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + objectVolatile + ", but " + obj + " is expected").toString());
                }
                while (true) {
                    Unsafe unsafe2 = AbstractC9322.f23936;
                    C6212 c6212 = this;
                    if (unsafe2.compareAndSwapObject(c6212, f15337, objectVolatile, c5317)) {
                        c6212.m10997();
                        return;
                    } else {
                        if (unsafe2.getObjectVolatile(c6212, j) != objectVolatile) {
                            this = c6212;
                            break;
                        }
                        this = c6212;
                    }
                }
            }
        }
        C6755.m11870("This mutex is not locked");
    }
}
