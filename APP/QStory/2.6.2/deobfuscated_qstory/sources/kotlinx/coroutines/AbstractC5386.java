package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.collections.C4350;
import kotlin.coroutines.InterfaceC4359;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlinx.coroutines.internal.C5354;
import kotlinx.coroutines.internal.C5363;
import p291.AbstractC8501;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5386 extends AbstractC5393 implements InterfaceC5405 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ long f15013;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15014;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f15015;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15016 = AtomicReferenceFieldUpdater.newUpdater(AbstractC5386.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15017;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = AbstractC8501.f23600;
        f15013 = unsafe.objectFieldOffset(AbstractC5386.class.getDeclaredField("_queue$volatile"));
        f15017 = AtomicReferenceFieldUpdater.newUpdater(AbstractC5386.class, Object.class, "_delayed$volatile");
        f15015 = unsafe.objectFieldOffset(AbstractC5386.class.getDeclaredField("_delayed$volatile"));
        f15014 = AtomicIntegerFieldUpdater.newUpdater(AbstractC5386.class, "_isCompleted$volatile");
    }

    @Override // kotlinx.coroutines.AbstractC5393
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final long mo10436() {
        if (m10459()) {
            return 0L;
        }
        m10439();
        Runnable runnableM10441 = m10441();
        if (runnableM10441 == null) {
            return m10437();
        }
        runnableM10441.run();
        return 0L;
    }

    @Override // kotlinx.coroutines.InterfaceC5405
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10337(long j, C5443 c5443) {
        long jM10494 = AbstractC5398.m10494(j);
        if (jM10494 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C5389 c5389 = new C5389(this, jM10494 + jNanoTime, c5443);
            m10447(jNanoTime, c5389);
            c5443.m10538(new C5441(c5389, 1));
        }
    }

    @Override // kotlinx.coroutines.AbstractC5431
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3448(InterfaceC4359 interfaceC4359, Runnable runnable) {
        mo10440(runnable);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final long m10437() {
        AbstractRunnableC5391 abstractRunnableC5391;
        C4350 c4350 = this.f15026;
        if (((c4350 == null || c4350.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            f15016.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            Object objectVolatile = unsafe.getObjectVolatile(this, f15013);
            if (objectVolatile != null) {
                if (objectVolatile instanceof C5363) {
                    long j = C5363.f14952.get((C5363) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == AbstractC5398.f15036) {
                    return Long.MAX_VALUE;
                }
            }
            f15017.getClass();
            C5390 c5390 = (C5390) unsafe.getObjectVolatile(this, f15015);
            if (c5390 != null) {
                synchronized (c5390) {
                    AbstractRunnableC5391[] abstractRunnableC5391Arr = c5390.f14938;
                    abstractRunnableC5391 = abstractRunnableC5391Arr != null ? abstractRunnableC5391Arr[0] : null;
                }
                if (abstractRunnableC5391 != null) {
                    long jNanoTime = abstractRunnableC5391.f15023 - System.nanoTime();
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
    public final boolean m10438(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        loop0: while (true) {
            f15016.getClass();
            Unsafe unsafe4 = AbstractC8501.f23600;
            long j = f15013;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (f15014.get(this) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = AbstractC8501.f23600;
                    if (unsafe.compareAndSwapObject(this, f15013, (Object) null, runnable)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof C5363) {
                C5363 c5363 = (C5363) objectVolatile;
                int iM10402 = c5363.m10402(runnable);
                if (iM10402 == 0) {
                    break;
                }
                if (iM10402 == 1) {
                    C5363 c5363M10399 = c5363.m10399();
                    do {
                        unsafe2 = AbstractC8501.f23600;
                        if (unsafe2.compareAndSwapObject(this, f15013, objectVolatile, c5363M10399)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iM10402 == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == AbstractC5398.f15036) {
                    return false;
                }
                C5363 c53632 = new C5363(8, true);
                c53632.m10402((Runnable) objectVolatile);
                c53632.m10402(runnable);
                do {
                    unsafe3 = AbstractC8501.f23600;
                    if (unsafe3.compareAndSwapObject(this, f15013, objectVolatile, c53632)) {
                        break loop0;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m10439() {
        AbstractRunnableC5391 abstractRunnableC5391M10374;
        f15017.getClass();
        C5390 c5390 = (C5390) AbstractC8501.f23600.getObjectVolatile(this, f15015);
        if (c5390 == null || C5354.f14937.get(c5390) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c5390) {
                try {
                    AbstractRunnableC5391[] abstractRunnableC5391Arr = c5390.f14938;
                    abstractRunnableC5391M10374 = null;
                    AbstractRunnableC5391 abstractRunnableC5391 = abstractRunnableC5391Arr != null ? abstractRunnableC5391Arr[0] : null;
                    if (abstractRunnableC5391 != null) {
                        if (jNanoTime - abstractRunnableC5391.f15023 >= 0 ? m10438(abstractRunnableC5391) : false) {
                            abstractRunnableC5391M10374 = c5390.m10374(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC5391M10374 != null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public void mo10440(Runnable runnable) {
        m10439();
        if (!m10438(runnable)) {
            RunnableC5409.f15050.mo10440(runnable);
            return;
        }
        Thread threadMo10449 = mo10449();
        if (Thread.currentThread() != threadMo10449) {
            LockSupport.unpark(threadMo10449);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final Runnable m10441() {
        AbstractC5386 abstractC5386;
        Unsafe unsafe;
        while (true) {
            f15016.getClass();
            Unsafe unsafe2 = AbstractC8501.f23600;
            long j = f15013;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof C5363) {
                C5363 c5363 = (C5363) objectVolatile;
                Object objM10398 = c5363.m10398();
                if (objM10398 != C5363.f14955) {
                    return (Runnable) objM10398;
                }
                C5363 c5363M10399 = c5363.m10399();
                while (true) {
                    Unsafe unsafe3 = AbstractC8501.f23600;
                    abstractC5386 = this;
                    if (!unsafe3.compareAndSwapObject(abstractC5386, f15013, objectVolatile, c5363M10399) && unsafe3.getObjectVolatile(abstractC5386, j) == objectVolatile) {
                        this = abstractC5386;
                    }
                }
            } else {
                abstractC5386 = this;
                if (objectVolatile == AbstractC5398.f15036) {
                    return null;
                }
                do {
                    unsafe = AbstractC8501.f23600;
                    if (unsafe.compareAndSwapObject(abstractC5386, f15013, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(abstractC5386, j) == objectVolatile);
            }
            this = abstractC5386;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m10442() {
        AbstractC5386 abstractC5386;
        Unsafe unsafe;
        C4484 c4484 = AbstractC5398.f15036;
        while (true) {
            f15016.getClass();
            Unsafe unsafe2 = AbstractC8501.f23600;
            long j = f15013;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = AbstractC8501.f23600;
                    abstractC5386 = this;
                    if (unsafe3.compareAndSwapObject(abstractC5386, f15013, (Object) null, c4484)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(abstractC5386, j) != null) {
                        break;
                    } else {
                        this = abstractC5386;
                    }
                }
            } else {
                abstractC5386 = this;
                if (objectVolatile instanceof C5363) {
                    ((C5363) objectVolatile).m10400();
                    return;
                }
                if (objectVolatile == c4484) {
                    return;
                }
                C5363 c5363 = new C5363(8, true);
                c5363.m10402((Runnable) objectVolatile);
                do {
                    unsafe = AbstractC8501.f23600;
                    if (unsafe.compareAndSwapObject(abstractC5386, f15013, objectVolatile, c5363)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(abstractC5386, j) == objectVolatile);
            }
            this = abstractC5386;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final int m10443(long j, AbstractRunnableC5391 abstractRunnableC5391) {
        AbstractC5386 abstractC5386;
        Unsafe unsafe;
        if (f15014.get(this) == 1) {
            return 1;
        }
        f15017.getClass();
        Unsafe unsafe2 = AbstractC8501.f23600;
        long j2 = f15015;
        C5390 c5390 = (C5390) unsafe2.getObjectVolatile(this, j2);
        if (c5390 == null) {
            C5390 c53902 = new C5390();
            c53902.f15021 = j;
            while (true) {
                unsafe = AbstractC8501.f23600;
                abstractC5386 = this;
                if (unsafe.compareAndSwapObject(abstractC5386, f15015, (Object) null, c53902) || unsafe.getObjectVolatile(abstractC5386, j2) != null) {
                    break;
                }
                this = abstractC5386;
            }
            Object objectVolatile = unsafe.getObjectVolatile(abstractC5386, j2);
            objectVolatile.getClass();
            c5390 = (C5390) objectVolatile;
        } else {
            abstractC5386 = this;
        }
        return abstractRunnableC5391.m10453(j, c5390, abstractC5386);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final boolean m10444(AbstractRunnableC5391 abstractRunnableC5391) {
        f15017.getClass();
        C5390 c5390 = (C5390) AbstractC8501.f23600.getObjectVolatile(this, f15015);
        if (c5390 != null) {
            synchronized (c5390) {
                AbstractRunnableC5391[] abstractRunnableC5391Arr = c5390.f14938;
                abstractRunnableC5391 = abstractRunnableC5391Arr != null ? abstractRunnableC5391Arr[0] : null;
            }
        }
        return abstractRunnableC5391 == abstractRunnableC5391;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final void m10445() {
        AbstractRunnableC5391 abstractRunnableC5391M10374;
        long jNanoTime = System.nanoTime();
        while (true) {
            f15017.getClass();
            C5390 c5390 = (C5390) AbstractC8501.f23600.getObjectVolatile(this, f15015);
            if (c5390 == null) {
                return;
            }
            synchronized (c5390) {
                abstractRunnableC5391M10374 = C5354.f14937.get(c5390) > 0 ? c5390.m10374(0) : null;
            }
            if (abstractRunnableC5391M10374 == null) {
                return;
            } else {
                mo10446(jNanoTime, abstractRunnableC5391M10374);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public void mo10446(long j, AbstractRunnableC5391 abstractRunnableC5391) {
        RunnableC5409.f15050.m10447(j, abstractRunnableC5391);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void m10447(long j, AbstractRunnableC5391 abstractRunnableC5391) {
        Thread threadMo10449;
        int iM10443 = m10443(j, abstractRunnableC5391);
        if (iM10443 == 0) {
            if (!m10444(abstractRunnableC5391) || Thread.currentThread() == (threadMo10449 = mo10449())) {
                return;
            }
            LockSupport.unpark(threadMo10449);
            return;
        }
        if (iM10443 == 1) {
            mo10446(j, abstractRunnableC5391);
        } else {
            if (iM10443 == 2) {
                return;
            }
            C5919.m11250("unexpected result");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final void m10448() {
        f15016.getClass();
        Unsafe unsafe = AbstractC8501.f23600;
        unsafe.putObjectVolatile(this, f15013, (Object) null);
        f15017.getClass();
        unsafe.putObjectVolatile(this, f15015, (Object) null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public abstract Thread mo10449();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final boolean m10450() {
        C4350 c4350 = this.f15026;
        if (c4350 != null ? c4350.isEmpty() : true) {
            f15017.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            C5390 c5390 = (C5390) unsafe.getObjectVolatile(this, f15015);
            if (c5390 != null && C5354.f14937.get(c5390) != 0) {
                return false;
            }
            f15016.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, f15013);
            if (objectVolatile != null) {
                if (objectVolatile instanceof C5363) {
                    long j = C5363.f14952.get((C5363) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == AbstractC5398.f15036) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.AbstractC5393
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public void mo10451() {
        AbstractC5419.f15059.set(null);
        f15014.set(this, 1);
        m10442();
        while (mo10436() <= 0) {
        }
        m10445();
    }
}
