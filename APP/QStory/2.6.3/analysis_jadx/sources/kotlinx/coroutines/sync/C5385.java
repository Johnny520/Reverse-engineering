package kotlinx.coroutines.sync;

import androidx.compose.foundation.C1093;
import io.ktor.util.C4211;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5176;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlinx.coroutines.InterfaceC5412;
import kotlinx.coroutines.InterfaceC5447;
import kotlinx.coroutines.internal.AbstractC5353;
import kotlinx.coroutines.internal.AbstractC5361;
import kotlinx.coroutines.selects.InterfaceC5368;
import p291.AbstractC8493;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5385 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15004;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f15005;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15006;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f15007;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15008 = AtomicReferenceFieldUpdater.newUpdater(C5385.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f15009;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final /* synthetic */ long f15010;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1093 f15011;

    static {
        Unsafe unsafe = AbstractC8493.f23591;
        f15010 = unsafe.objectFieldOffset(C5385.class.getDeclaredField("head$volatile"));
        f15007 = AtomicLongFieldUpdater.newUpdater(C5385.class, "deqIdx$volatile");
        f15006 = AtomicReferenceFieldUpdater.newUpdater(C5385.class, Object.class, "tail$volatile");
        f15009 = unsafe.objectFieldOffset(C5385.class.getDeclaredField("tail$volatile"));
        f15005 = AtomicLongFieldUpdater.newUpdater(C5385.class, "enqIdx$volatile");
        f15004 = AtomicIntegerFieldUpdater.newUpdater(C5385.class, "_availablePermits$volatile");
    }

    public C5385() {
        C5386 c5386 = new C5386(0L, null, 2);
        this.head$volatile = c5386;
        this.tail$volatile = c5386;
        this._availablePermits$volatile = 1;
        this.f15011 = new C1093(this, 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m10437() {
        Object objM10366;
        Unsafe unsafe;
        f15008.getClass();
        Unsafe unsafe2 = AbstractC8493.f23591;
        long j = f15010;
        C5386 c5386 = (C5386) unsafe2.getObjectVolatile(this, j);
        long andIncrement = f15007.getAndIncrement(this);
        long j2 = andIncrement / ((long) AbstractC5384.f14998);
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        loop0: while (true) {
            objM10366 = AbstractC5353.m10366(c5386, j2, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (AbstractC5353.m10363(objM10366)) {
                break;
            }
            AbstractC5361 abstractC5361M10365 = AbstractC5353.m10365(objM10366);
            while (true) {
                AbstractC5361 abstractC5361 = (AbstractC5361) AbstractC8493.f23591.getObjectVolatile(this, j);
                if (abstractC5361.f14944 >= abstractC5361M10365.f14944) {
                    break loop0;
                }
                if (!abstractC5361M10365.m10388()) {
                    break;
                }
                do {
                    unsafe = AbstractC8493.f23591;
                    if (unsafe.compareAndSwapObject(this, f15010, abstractC5361, abstractC5361M10365)) {
                        if (abstractC5361.m10389()) {
                            abstractC5361.m10360();
                        }
                    }
                } while (unsafe.getObjectVolatile(this, j) == abstractC5361);
                if (abstractC5361M10365.m10389()) {
                    abstractC5361M10365.m10360();
                }
            }
        }
        C5386 c53862 = (C5386) AbstractC5353.m10365(objM10366);
        AtomicReferenceArray atomicReferenceArray = c53862.f15012;
        c53862.m10357();
        boolean z = false;
        if (c53862.f14944 <= j2) {
            int i = (int) (andIncrement % ((long) AbstractC5384.f14998));
            Object andSet = atomicReferenceArray.getAndSet(i, AbstractC5384.f15002);
            if (andSet == null) {
                int i2 = AbstractC5384.f15003;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == AbstractC5384.f15001) {
                        return true;
                    }
                }
                C4485 c4485 = AbstractC5384.f15002;
                C4485 c44852 = AbstractC5384.f15000;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, c4485, c44852)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i) != c4485) {
                        break;
                    }
                }
                return !z;
            }
            if (andSet != AbstractC5384.f14999) {
                boolean z2 = andSet instanceof InterfaceC5447;
                C5176 c5176 = C5176.f14739;
                if (!z2) {
                    if (andSet instanceof InterfaceC5368) {
                        return ((InterfaceC5368) andSet).mo10412(this, c5176);
                    }
                    C4211.m8592(andSet, "unexpected: ");
                    return false;
                }
                InterfaceC5447 interfaceC5447 = (InterfaceC5447) andSet;
                C4485 c4485Mo10436 = interfaceC5447.mo10436(c5176, this.f15011);
                if (c4485Mo10436 != null) {
                    interfaceC5447.mo10433(c4485Mo10436);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m10438() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15004;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                C5925.m11312("The number of released permits cannot be greater than 1");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m10437());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m10439(InterfaceC5412 interfaceC5412) {
        Object objM10366;
        Unsafe unsafe;
        C5385 c5385 = this;
        f15006.getClass();
        Unsafe unsafe2 = AbstractC8493.f23591;
        long j = f15009;
        C5386 c5386 = (C5386) unsafe2.getObjectVolatile(c5385, j);
        long andIncrement = f15005.getAndIncrement(c5385);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        long j2 = andIncrement / ((long) AbstractC5384.f14998);
        loop0: while (true) {
            objM10366 = AbstractC5353.m10366(c5386, j2, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (AbstractC5353.m10363(objM10366)) {
                break;
            }
            AbstractC5361 abstractC5361M10365 = AbstractC5353.m10365(objM10366);
            while (true) {
                AbstractC5361 abstractC5361 = (AbstractC5361) AbstractC8493.f23591.getObjectVolatile(c5385, j);
                if (abstractC5361.f14944 >= abstractC5361M10365.f14944) {
                    c5385 = this;
                    break loop0;
                }
                if (!abstractC5361M10365.m10388()) {
                    break;
                }
                do {
                    unsafe = AbstractC8493.f23591;
                    c5385 = this;
                    if (unsafe.compareAndSwapObject(c5385, f15009, abstractC5361, abstractC5361M10365)) {
                        if (abstractC5361.m10389()) {
                            abstractC5361.m10360();
                        }
                    }
                } while (unsafe.getObjectVolatile(c5385, j) == abstractC5361);
                if (abstractC5361M10365.m10389()) {
                    abstractC5361M10365.m10360();
                }
            }
            c5385 = this;
        }
        C5386 c53862 = (C5386) AbstractC5353.m10365(objM10366);
        AtomicReferenceArray atomicReferenceArray = c53862.f15012;
        int i = (int) (andIncrement % ((long) AbstractC5384.f14998));
        while (!atomicReferenceArray.compareAndSet(i, null, interfaceC5412)) {
            if (atomicReferenceArray.get(i) != null) {
                C4485 c4485 = AbstractC5384.f15002;
                C4485 c44852 = AbstractC5384.f15001;
                while (!atomicReferenceArray.compareAndSet(i, c4485, c44852)) {
                    if (atomicReferenceArray.get(i) != c4485) {
                        return false;
                    }
                }
                boolean z = interfaceC5412 instanceof InterfaceC5447;
                C5176 c5176 = C5176.f14739;
                if (z) {
                    ((InterfaceC5447) interfaceC5412).mo10434(c5176, c5385.f15011);
                    return true;
                }
                if (interfaceC5412 instanceof InterfaceC5368) {
                    ((InterfaceC5368) interfaceC5412).mo10411(c5176);
                    return true;
                }
                C4211.m8615(interfaceC5412, "unexpected: ");
                return false;
            }
        }
        interfaceC5412.mo10263(c53862, i);
        return true;
    }
}
