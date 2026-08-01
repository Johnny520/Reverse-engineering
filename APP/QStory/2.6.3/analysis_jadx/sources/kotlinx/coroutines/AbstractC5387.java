package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.collections.C4351;
import kotlin.coroutines.InterfaceC4360;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlinx.coroutines.internal.C5355;
import kotlinx.coroutines.internal.C5364;
import p291.AbstractC8493;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5387 extends AbstractC5394 implements InterfaceC5406 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ long f15013;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15014;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f15015;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15016 = AtomicReferenceFieldUpdater.newUpdater(AbstractC5387.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15017;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        Unsafe unsafe = AbstractC8493.f23591;
        f15013 = unsafe.objectFieldOffset(AbstractC5387.class.getDeclaredField("_queue$volatile"));
        f15017 = AtomicReferenceFieldUpdater.newUpdater(AbstractC5387.class, Object.class, "_delayed$volatile");
        f15015 = unsafe.objectFieldOffset(AbstractC5387.class.getDeclaredField("_delayed$volatile"));
        f15014 = AtomicIntegerFieldUpdater.newUpdater(AbstractC5387.class, "_isCompleted$volatile");
    }

    @Override // kotlinx.coroutines.AbstractC5394
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final long mo10440() {
        if (m10463()) {
            return 0L;
        }
        m10443();
        Runnable runnableM10445 = m10445();
        if (runnableM10445 == null) {
            return m10441();
        }
        runnableM10445.run();
        return 0L;
    }

    @Override // kotlinx.coroutines.InterfaceC5406
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10341(long j, C5444 c5444) {
        long jM10498 = AbstractC5399.m10498(j);
        if (jM10498 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C5390 c5390 = new C5390(this, jM10498 + jNanoTime, c5444);
            m10451(jNanoTime, c5390);
            c5444.m10542(new C5442(c5390, 1));
        }
    }

    @Override // kotlinx.coroutines.AbstractC5432
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo3458(InterfaceC4360 interfaceC4360, Runnable runnable) {
        mo10444(runnable);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final long m10441() {
        AbstractRunnableC5392 abstractRunnableC5392;
        C4351 c4351 = this.f15026;
        if (((c4351 == null || c4351.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
            f15016.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            Object objectVolatile = unsafe.getObjectVolatile(this, f15013);
            if (objectVolatile != null) {
                if (objectVolatile instanceof C5364) {
                    long j = C5364.f14952.get((C5364) objectVolatile);
                    if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (objectVolatile == AbstractC5399.f15036) {
                    return Long.MAX_VALUE;
                }
            }
            f15017.getClass();
            C5391 c5391 = (C5391) unsafe.getObjectVolatile(this, f15015);
            if (c5391 != null) {
                synchronized (c5391) {
                    AbstractRunnableC5392[] abstractRunnableC5392Arr = c5391.f14938;
                    abstractRunnableC5392 = abstractRunnableC5392Arr != null ? abstractRunnableC5392Arr[0] : null;
                }
                if (abstractRunnableC5392 != null) {
                    long jNanoTime = abstractRunnableC5392.f15023 - System.nanoTime();
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
    public final boolean m10442(Runnable runnable) {
        Unsafe unsafe;
        Unsafe unsafe2;
        Unsafe unsafe3;
        loop0: while (true) {
            f15016.getClass();
            Unsafe unsafe4 = AbstractC8493.f23591;
            long j = f15013;
            Object objectVolatile = unsafe4.getObjectVolatile(this, j);
            if (f15014.get(this) == 1) {
                return false;
            }
            if (objectVolatile == null) {
                do {
                    unsafe = AbstractC8493.f23591;
                    if (unsafe.compareAndSwapObject(this, f15013, (Object) null, runnable)) {
                        break loop0;
                    }
                } while (unsafe.getObjectVolatile(this, j) == null);
            } else if (objectVolatile instanceof C5364) {
                C5364 c5364 = (C5364) objectVolatile;
                int iM10406 = c5364.m10406(runnable);
                if (iM10406 == 0) {
                    break;
                }
                if (iM10406 == 1) {
                    C5364 c5364M10403 = c5364.m10403();
                    do {
                        unsafe2 = AbstractC8493.f23591;
                        if (unsafe2.compareAndSwapObject(this, f15013, objectVolatile, c5364M10403)) {
                            break;
                        }
                    } while (unsafe2.getObjectVolatile(this, j) == objectVolatile);
                } else if (iM10406 == 2) {
                    return false;
                }
            } else {
                if (objectVolatile == AbstractC5399.f15036) {
                    return false;
                }
                C5364 c53642 = new C5364(8, true);
                c53642.m10406((Runnable) objectVolatile);
                c53642.m10406(runnable);
                do {
                    unsafe3 = AbstractC8493.f23591;
                    if (unsafe3.compareAndSwapObject(this, f15013, objectVolatile, c53642)) {
                        break loop0;
                    }
                } while (unsafe3.getObjectVolatile(this, j) == objectVolatile);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m10443() {
        AbstractRunnableC5392 abstractRunnableC5392M10378;
        f15017.getClass();
        C5391 c5391 = (C5391) AbstractC8493.f23591.getObjectVolatile(this, f15015);
        if (c5391 == null || C5355.f14937.get(c5391) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c5391) {
                try {
                    AbstractRunnableC5392[] abstractRunnableC5392Arr = c5391.f14938;
                    abstractRunnableC5392M10378 = null;
                    AbstractRunnableC5392 abstractRunnableC5392 = abstractRunnableC5392Arr != null ? abstractRunnableC5392Arr[0] : null;
                    if (abstractRunnableC5392 != null) {
                        if (jNanoTime - abstractRunnableC5392.f15023 >= 0 ? m10442(abstractRunnableC5392) : false) {
                            abstractRunnableC5392M10378 = c5391.m10378(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC5392M10378 != null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public void mo10444(Runnable runnable) {
        m10443();
        if (!m10442(runnable)) {
            RunnableC5410.f15050.mo10444(runnable);
            return;
        }
        Thread threadMo10453 = mo10453();
        if (Thread.currentThread() != threadMo10453) {
            LockSupport.unpark(threadMo10453);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final Runnable m10445() {
        AbstractC5387 abstractC5387;
        Unsafe unsafe;
        while (true) {
            f15016.getClass();
            Unsafe unsafe2 = AbstractC8493.f23591;
            long j = f15013;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                return null;
            }
            if (objectVolatile instanceof C5364) {
                C5364 c5364 = (C5364) objectVolatile;
                Object objM10402 = c5364.m10402();
                if (objM10402 != C5364.f14955) {
                    return (Runnable) objM10402;
                }
                C5364 c5364M10403 = c5364.m10403();
                while (true) {
                    Unsafe unsafe3 = AbstractC8493.f23591;
                    abstractC5387 = this;
                    if (!unsafe3.compareAndSwapObject(abstractC5387, f15013, objectVolatile, c5364M10403) && unsafe3.getObjectVolatile(abstractC5387, j) == objectVolatile) {
                        this = abstractC5387;
                    }
                }
            } else {
                abstractC5387 = this;
                if (objectVolatile == AbstractC5399.f15036) {
                    return null;
                }
                do {
                    unsafe = AbstractC8493.f23591;
                    if (unsafe.compareAndSwapObject(abstractC5387, f15013, objectVolatile, (Object) null)) {
                        return (Runnable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(abstractC5387, j) == objectVolatile);
            }
            this = abstractC5387;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m10446() {
        AbstractC5387 abstractC5387;
        Unsafe unsafe;
        C4485 c4485 = AbstractC5399.f15036;
        while (true) {
            f15016.getClass();
            Unsafe unsafe2 = AbstractC8493.f23591;
            long j = f15013;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                while (true) {
                    Unsafe unsafe3 = AbstractC8493.f23591;
                    abstractC5387 = this;
                    if (unsafe3.compareAndSwapObject(abstractC5387, f15013, (Object) null, c4485)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(abstractC5387, j) != null) {
                        break;
                    } else {
                        this = abstractC5387;
                    }
                }
            } else {
                abstractC5387 = this;
                if (objectVolatile instanceof C5364) {
                    ((C5364) objectVolatile).m10404();
                    return;
                }
                if (objectVolatile == c4485) {
                    return;
                }
                C5364 c5364 = new C5364(8, true);
                c5364.m10406((Runnable) objectVolatile);
                do {
                    unsafe = AbstractC8493.f23591;
                    if (unsafe.compareAndSwapObject(abstractC5387, f15013, objectVolatile, c5364)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(abstractC5387, j) == objectVolatile);
            }
            this = abstractC5387;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final int m10447(long j, AbstractRunnableC5392 abstractRunnableC5392) {
        AbstractC5387 abstractC5387;
        Unsafe unsafe;
        if (f15014.get(this) == 1) {
            return 1;
        }
        f15017.getClass();
        Unsafe unsafe2 = AbstractC8493.f23591;
        long j2 = f15015;
        C5391 c5391 = (C5391) unsafe2.getObjectVolatile(this, j2);
        if (c5391 == null) {
            C5391 c53912 = new C5391();
            c53912.f15021 = j;
            while (true) {
                unsafe = AbstractC8493.f23591;
                abstractC5387 = this;
                if (unsafe.compareAndSwapObject(abstractC5387, f15015, (Object) null, c53912) || unsafe.getObjectVolatile(abstractC5387, j2) != null) {
                    break;
                }
                this = abstractC5387;
            }
            Object objectVolatile = unsafe.getObjectVolatile(abstractC5387, j2);
            objectVolatile.getClass();
            c5391 = (C5391) objectVolatile;
        } else {
            abstractC5387 = this;
        }
        return abstractRunnableC5392.m10457(j, c5391, abstractC5387);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final boolean m10448(AbstractRunnableC5392 abstractRunnableC5392) {
        f15017.getClass();
        C5391 c5391 = (C5391) AbstractC8493.f23591.getObjectVolatile(this, f15015);
        if (c5391 != null) {
            synchronized (c5391) {
                AbstractRunnableC5392[] abstractRunnableC5392Arr = c5391.f14938;
                abstractRunnableC5392 = abstractRunnableC5392Arr != null ? abstractRunnableC5392Arr[0] : null;
            }
        }
        return abstractRunnableC5392 == abstractRunnableC5392;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public final void m10449() {
        AbstractRunnableC5392 abstractRunnableC5392M10378;
        long jNanoTime = System.nanoTime();
        while (true) {
            f15017.getClass();
            C5391 c5391 = (C5391) AbstractC8493.f23591.getObjectVolatile(this, f15015);
            if (c5391 == null) {
                return;
            }
            synchronized (c5391) {
                abstractRunnableC5392M10378 = C5355.f14937.get(c5391) > 0 ? c5391.m10378(0) : null;
            }
            if (abstractRunnableC5392M10378 == null) {
                return;
            } else {
                mo10450(jNanoTime, abstractRunnableC5392M10378);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public void mo10450(long j, AbstractRunnableC5392 abstractRunnableC5392) {
        RunnableC5410.f15050.m10451(j, abstractRunnableC5392);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public final void m10451(long j, AbstractRunnableC5392 abstractRunnableC5392) {
        Thread threadMo10453;
        int iM10447 = m10447(j, abstractRunnableC5392);
        if (iM10447 == 0) {
            if (!m10448(abstractRunnableC5392) || Thread.currentThread() == (threadMo10453 = mo10453())) {
                return;
            }
            LockSupport.unpark(threadMo10453);
            return;
        }
        if (iM10447 == 1) {
            mo10450(j, abstractRunnableC5392);
        } else {
            if (iM10447 == 2) {
                return;
            }
            C5925.m11311("unexpected result");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final void m10452() {
        f15016.getClass();
        Unsafe unsafe = AbstractC8493.f23591;
        unsafe.putObjectVolatile(this, f15013, (Object) null);
        f15017.getClass();
        unsafe.putObjectVolatile(this, f15015, (Object) null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public abstract Thread mo10453();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final boolean m10454() {
        C4351 c4351 = this.f15026;
        if (c4351 != null ? c4351.isEmpty() : true) {
            f15017.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            C5391 c5391 = (C5391) unsafe.getObjectVolatile(this, f15015);
            if (c5391 != null && C5355.f14937.get(c5391) != 0) {
                return false;
            }
            f15016.getClass();
            Object objectVolatile = unsafe.getObjectVolatile(this, f15013);
            if (objectVolatile != null) {
                if (objectVolatile instanceof C5364) {
                    long j = C5364.f14952.get((C5364) objectVolatile);
                    return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
                }
                if (objectVolatile == AbstractC5399.f15036) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.AbstractC5394
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public void mo10455() {
        AbstractC5420.f15059.set(null);
        f15014.set(this, 1);
        m10446();
        while (mo10440() <= 0) {
        }
        m10449();
    }
}
