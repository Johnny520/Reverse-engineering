package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.collections.C5183;
import kotlin.coroutines.InterfaceC5192;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.internal.C6187;
import kotlinx.coroutines.internal.C6196;
import p307.AbstractC9322;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6219 extends AbstractC6226 implements InterfaceC6238 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ long f15358;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15359;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f15360;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15361 = AtomicReferenceFieldUpdater.newUpdater(AbstractC6219.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15362;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = AbstractC9322.f23936;
        f15358 = unsafe.objectFieldOffset(AbstractC6219.class.getDeclaredField("_queue$volatile"));
        f15362 = AtomicReferenceFieldUpdater.newUpdater(AbstractC6219.class, Object.class, "_delayed$volatile");
        f15360 = unsafe.objectFieldOffset(AbstractC6219.class.getDeclaredField("_delayed$volatile"));
        f15359 = AtomicIntegerFieldUpdater.newUpdater(AbstractC6219.class, "_isCompleted$volatile");
    }

    @Override // kotlinx.coroutines.AbstractC6226
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long mo10999() {
        if (m11022()) {
            return 0L;
        }
        m11002();
        Runnable runnableM11004 = m11004();
        if (runnableM11004 == null) {
            return m11000();
        }
        runnableM11004.run();
        return 0L;
    }

    @Override // kotlinx.coroutines.InterfaceC6238
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10900(long j, C6276 c6276) {
        long jM11057 = AbstractC6231.m11057(j);
        if (jM11057 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C6222 c6222 = new C6222(this, jM11057 + jNanoTime, c6276);
            m11010(jNanoTime, c6222);
            c6276.m11101(new C6274(c6222, 1));
        }
    }

    @Override // kotlinx.coroutines.AbstractC6264
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo4018(InterfaceC5192 interfaceC5192, Runnable runnable) {
        mo11003(runnable);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final long m11000() {
        AbstractRunnableC6224 abstractRunnableC6224;
        C5183 c5183 = this.f15371;
        if (((c5183 == null || c5183.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            f15361.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            Object objectVolatile = unsafe.getObjectVolatile(this, f15358);
            if (objectVolatile != null) {
                if (objectVolatile instanceof C6196) {
                    long j = C6196.f15297.get((C6196) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == AbstractC6231.f15381) {
                    return Long.MAX_VALUE;
                }
            }
            f15362.getClass();
            C6223 c6223 = (C6223) unsafe.getObjectVolatile(this, f15360);
            if (c6223 != null) {
                synchronized (c6223) {
                    AbstractRunnableC6224[] abstractRunnableC6224Arr = c6223.f15283;
                    abstractRunnableC6224 = abstractRunnableC6224Arr != null ? abstractRunnableC6224Arr[0] : null;
                }
                if (abstractRunnableC6224 != null) {
                    long jNanoTime = abstractRunnableC6224.f15368 - System.nanoTime();
                    if (jNanoTime >= 0) {
                        return jNanoTime;
                    }
                }
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final boolean m11001(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        loop0: while (true) {
            f15361.getClass();
            Unsafe unsafe4 = AbstractC9322.f23936;
            long j = f15358;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (f15359.get(this) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = AbstractC9322.f23936;
                    if (unsafe.compareAndSwapObject(this, f15358, (Object) null, runnable)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof C6196) {
                C6196 c6196 = (C6196) objectVolatile;
                int iM10965 = c6196.m10965(runnable);
                if (iM10965 == 0) {
                    break;
                }
                if (iM10965 == 1) {
                    C6196 c6196M10962 = c6196.m10962();
                    do {
                        unsafe2 = AbstractC9322.f23936;
                        if (unsafe2.compareAndSwapObject(this, f15358, objectVolatile, c6196M10962)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iM10965 == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == AbstractC6231.f15381) {
                    return false;
                }
                C6196 c61962 = new C6196(8, true);
                c61962.m10965((Runnable) objectVolatile);
                c61962.m10965(runnable);
                do {
                    unsafe3 = AbstractC9322.f23936;
                    if (unsafe3.compareAndSwapObject(this, f15358, objectVolatile, c61962)) {
                        break loop0;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m11002() {
        AbstractRunnableC6224 abstractRunnableC6224M10937;
        f15362.getClass();
        C6223 c6223 = (C6223) AbstractC9322.f23936.getObjectVolatile(this, f15360);
        if (c6223 == null || C6187.f15282.get(c6223) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c6223) {
                try {
                    AbstractRunnableC6224[] abstractRunnableC6224Arr = c6223.f15283;
                    abstractRunnableC6224M10937 = null;
                    AbstractRunnableC6224 abstractRunnableC6224 = abstractRunnableC6224Arr != null ? abstractRunnableC6224Arr[0] : null;
                    if (abstractRunnableC6224 != null) {
                        if (jNanoTime - abstractRunnableC6224.f15368 >= 0 ? m11001(abstractRunnableC6224) : false) {
                            abstractRunnableC6224M10937 = c6223.m10937(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC6224M10937 != null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public void mo11003(Runnable runnable) {
        m11002();
        if (!m11001(runnable)) {
            RunnableC6242.f15395.mo11003(runnable);
            return;
        }
        Thread threadMo11012 = mo11012();
        if (Thread.currentThread() != threadMo11012) {
            LockSupport.unpark(threadMo11012);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final Runnable m11004() {
        AbstractC6219 abstractC6219;
        Unsafe unsafe;
        while (true) {
            f15361.getClass();
            Unsafe unsafe2 = AbstractC9322.f23936;
            long j = f15358;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof C6196) {
                C6196 c6196 = (C6196) objectVolatile;
                Object objM10961 = c6196.m10961();
                if (objM10961 != C6196.f15300) {
                    return (Runnable) objM10961;
                }
                C6196 c6196M10962 = c6196.m10962();
                while (true) {
                    Unsafe unsafe3 = AbstractC9322.f23936;
                    abstractC6219 = this;
                    if (!unsafe3.compareAndSwapObject(abstractC6219, f15358, objectVolatile, c6196M10962) && unsafe3.getObjectVolatile(abstractC6219, j) == objectVolatile) {
                        this = abstractC6219;
                    }
                }
            } else {
                abstractC6219 = this;
                if (objectVolatile == AbstractC6231.f15381) {
                    return null;
                }
                do {
                    unsafe = AbstractC9322.f23936;
                    if (unsafe.compareAndSwapObject(abstractC6219, f15358, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(abstractC6219, j) == objectVolatile);
            }
            this = abstractC6219;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m11005() {
        AbstractC6219 abstractC6219;
        Unsafe unsafe;
        C5317 c5317 = AbstractC6231.f15381;
        while (true) {
            f15361.getClass();
            Unsafe unsafe2 = AbstractC9322.f23936;
            long j = f15358;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = AbstractC9322.f23936;
                    abstractC6219 = this;
                    if (unsafe3.compareAndSwapObject(abstractC6219, f15358, (Object) null, c5317)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(abstractC6219, j) != null) {
                        break;
                    } else {
                        this = abstractC6219;
                    }
                }
            } else {
                abstractC6219 = this;
                if (objectVolatile instanceof C6196) {
                    ((C6196) objectVolatile).m10963();
                    return;
                }
                if (objectVolatile == c5317) {
                    return;
                }
                C6196 c6196 = new C6196(8, true);
                c6196.m10965((Runnable) objectVolatile);
                do {
                    unsafe = AbstractC9322.f23936;
                    if (unsafe.compareAndSwapObject(abstractC6219, f15358, objectVolatile, c6196)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(abstractC6219, j) == objectVolatile);
            }
            this = abstractC6219;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final int m11006(long j, AbstractRunnableC6224 abstractRunnableC6224) {
        AbstractC6219 abstractC6219;
        Unsafe unsafe;
        if (f15359.get(this) == 1) {
            return 1;
        }
        f15362.getClass();
        Unsafe unsafe2 = AbstractC9322.f23936;
        long j2 = f15360;
        C6223 c6223 = (C6223) unsafe2.getObjectVolatile(this, j2);
        if (c6223 == null) {
            C6223 c62232 = new C6223();
            c62232.f15366 = j;
            while (true) {
                unsafe = AbstractC9322.f23936;
                abstractC6219 = this;
                if (unsafe.compareAndSwapObject(abstractC6219, f15360, (Object) null, c62232) || unsafe.getObjectVolatile(abstractC6219, j2) != null) {
                    break;
                }
                this = abstractC6219;
            }
            Object objectVolatile = unsafe.getObjectVolatile(abstractC6219, j2);
            objectVolatile.getClass();
            c6223 = (C6223) objectVolatile;
        } else {
            abstractC6219 = this;
        }
        return abstractRunnableC6224.m11016(j, c6223, abstractC6219);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final boolean m11007(AbstractRunnableC6224 abstractRunnableC6224) {
        f15362.getClass();
        C6223 c6223 = (C6223) AbstractC9322.f23936.getObjectVolatile(this, f15360);
        if (c6223 != null) {
            synchronized (c6223) {
                AbstractRunnableC6224[] abstractRunnableC6224Arr = c6223.f15283;
                abstractRunnableC6224 = abstractRunnableC6224Arr != null ? abstractRunnableC6224Arr[0] : null;
            }
        }
        return abstractRunnableC6224 == abstractRunnableC6224;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final void m11008() {
        AbstractRunnableC6224 abstractRunnableC6224M10937;
        long jNanoTime = System.nanoTime();
        while (true) {
            f15362.getClass();
            C6223 c6223 = (C6223) AbstractC9322.f23936.getObjectVolatile(this, f15360);
            if (c6223 == null) {
                return;
            }
            synchronized (c6223) {
                abstractRunnableC6224M10937 = C6187.f15282.get(c6223) > 0 ? c6223.m10937(0) : null;
            }
            if (abstractRunnableC6224M10937 == null) {
                return;
            } else {
                mo11009(jNanoTime, abstractRunnableC6224M10937);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public void mo11009(long j, AbstractRunnableC6224 abstractRunnableC6224) {
        RunnableC6242.f15395.m11010(j, abstractRunnableC6224);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void m11010(long j, AbstractRunnableC6224 abstractRunnableC6224) {
        Thread threadMo11012;
        int iM11006 = m11006(j, abstractRunnableC6224);
        if (iM11006 == 0) {
            if (!m11007(abstractRunnableC6224) || Thread.currentThread() == (threadMo11012 = mo11012())) {
                return;
            }
            LockSupport.unpark(threadMo11012);
            return;
        }
        if (iM11006 == 1) {
            mo11009(j, abstractRunnableC6224);
        } else {
            if (iM11006 == 2) {
                return;
            }
            C6755.m11870("unexpected result");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final void m11011() {
        f15361.getClass();
        Unsafe unsafe = AbstractC9322.f23936;
        unsafe.putObjectVolatile(this, f15358, (Object) null);
        f15362.getClass();
        unsafe.putObjectVolatile(this, f15360, (Object) null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public abstract Thread mo11012();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final boolean m11013() {
        C5183 c5183 = this.f15371;
        if (c5183 != null ? c5183.isEmpty() : true) {
            f15362.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            C6223 c6223 = (C6223) unsafe.getObjectVolatile(this, f15360);
            if (c6223 != null && C6187.f15282.get(c6223) != 0) {
                return false;
            }
            f15361.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, f15358);
            if (objectVolatile != null) {
                if (objectVolatile instanceof C6196) {
                    long j = C6196.f15297.get((C6196) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == AbstractC6231.f15381) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.AbstractC6226
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public void mo11014() {
        AbstractC6252.f15404.set(null);
        f15359.set(this, 1);
        m11005();
        while (mo10999() <= 0) {
        }
        m11008();
    }
}
