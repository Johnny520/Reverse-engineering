package kotlinx.coroutines.sync;

import androidx.compose.foundation.C1931;
import io.ktor.util.C5043;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C6008;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.InterfaceC6244;
import kotlinx.coroutines.InterfaceC6279;
import kotlinx.coroutines.internal.AbstractC6185;
import kotlinx.coroutines.internal.AbstractC6193;
import kotlinx.coroutines.selects.InterfaceC6200;
import p307.AbstractC9322;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6217 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f15350;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15351;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f15352;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15353 = AtomicReferenceFieldUpdater.newUpdater(C6217.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ long f15354;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final /* synthetic */ long f15355;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1931 f15356;

    static {
        Unsafe unsafe = AbstractC9322.f23936;
        f15355 = unsafe.objectFieldOffset(C6217.class.getDeclaredField("head$volatile"));
        f15352 = AtomicLongFieldUpdater.newUpdater(C6217.class, "deqIdx$volatile");
        f15351 = AtomicReferenceFieldUpdater.newUpdater(C6217.class, Object.class, "tail$volatile");
        f15354 = unsafe.objectFieldOffset(C6217.class.getDeclaredField("tail$volatile"));
        f15350 = AtomicLongFieldUpdater.newUpdater(C6217.class, "enqIdx$volatile");
        f15349 = AtomicIntegerFieldUpdater.newUpdater(C6217.class, "_availablePermits$volatile");
    }

    public C6217() {
        C6218 c6218 = new C6218(0L, null, 2);
        this.head$volatile = c6218;
        this.tail$volatile = c6218;
        this._availablePermits$volatile = 1;
        this.f15356 = new C1931(this, 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m10996() {
        Object objM10925;
        Unsafe unsafe;
        f15353.getClass();
        Unsafe unsafe2 = AbstractC9322.f23936;
        long j = f15355;
        C6218 c6218 = (C6218) unsafe2.getObjectVolatile(this, j);
        long andIncrement = f15352.getAndIncrement(this);
        long j2 = andIncrement / ((long) AbstractC6216.f15343);
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        loop0: while (true) {
            objM10925 = AbstractC6185.m10925(c6218, j2, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (AbstractC6185.m10922(objM10925)) {
                break;
            }
            AbstractC6193 abstractC6193M10924 = AbstractC6185.m10924(objM10925);
            while (true) {
                AbstractC6193 abstractC6193 = (AbstractC6193) AbstractC9322.f23936.getObjectVolatile(this, j);
                if (abstractC6193.f15289 >= abstractC6193M10924.f15289) {
                    break loop0;
                }
                if (!abstractC6193M10924.m10947()) {
                    break;
                }
                do {
                    unsafe = AbstractC9322.f23936;
                    if (unsafe.compareAndSwapObject(this, f15355, abstractC6193, abstractC6193M10924)) {
                        if (abstractC6193.m10948()) {
                            abstractC6193.m10919();
                        }
                    }
                } while (unsafe.getObjectVolatile(this, j) == abstractC6193);
                if (abstractC6193M10924.m10948()) {
                    abstractC6193M10924.m10919();
                }
            }
        }
        C6218 c62182 = (C6218) AbstractC6185.m10924(objM10925);
        AtomicReferenceArray atomicReferenceArray = c62182.f15357;
        c62182.m10916();
        boolean z = false;
        if (c62182.f15289 <= j2) {
            int i = (int) (andIncrement % ((long) AbstractC6216.f15343));
            Object andSet = atomicReferenceArray.getAndSet(i, AbstractC6216.f15347);
            if (andSet == null) {
                int i2 = AbstractC6216.f15348;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == AbstractC6216.f15346) {
                        return true;
                    }
                }
                C5317 c5317 = AbstractC6216.f15347;
                C5317 c53172 = AbstractC6216.f15345;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, c5317, c53172)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i) != c5317) {
                        break;
                    }
                }
                return !z;
            }
            if (andSet != AbstractC6216.f15344) {
                boolean z2 = andSet instanceof InterfaceC6279;
                C6008 c6008 = C6008.f15084;
                if (!z2) {
                    if (andSet instanceof InterfaceC6200) {
                        return ((InterfaceC6200) andSet).mo10971(this, c6008);
                    }
                    C5043.m9151(andSet, "unexpected: ");
                    return false;
                }
                InterfaceC6279 interfaceC6279 = (InterfaceC6279) andSet;
                C5317 c5317Mo10995 = interfaceC6279.mo10995(c6008, this.f15356);
                if (c5317Mo10995 != null) {
                    interfaceC6279.mo10992(c5317Mo10995);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m10997() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f15349;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                C6755.m11871("The number of released permits cannot be greater than 1");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m10996());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m10998(InterfaceC6244 interfaceC6244) {
        Object objM10925;
        Unsafe unsafe;
        C6217 c6217 = this;
        f15351.getClass();
        Unsafe unsafe2 = AbstractC9322.f23936;
        long j = f15354;
        C6218 c6218 = (C6218) unsafe2.getObjectVolatile(c6217, j);
        long andIncrement = f15350.getAndIncrement(c6217);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        long j2 = andIncrement / ((long) AbstractC6216.f15343);
        loop0: while (true) {
            objM10925 = AbstractC6185.m10925(c6218, j2, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (AbstractC6185.m10922(objM10925)) {
                break;
            }
            AbstractC6193 abstractC6193M10924 = AbstractC6185.m10924(objM10925);
            while (true) {
                AbstractC6193 abstractC6193 = (AbstractC6193) AbstractC9322.f23936.getObjectVolatile(c6217, j);
                if (abstractC6193.f15289 >= abstractC6193M10924.f15289) {
                    c6217 = this;
                    break loop0;
                }
                if (!abstractC6193M10924.m10947()) {
                    break;
                }
                do {
                    unsafe = AbstractC9322.f23936;
                    c6217 = this;
                    if (unsafe.compareAndSwapObject(c6217, f15354, abstractC6193, abstractC6193M10924)) {
                        if (abstractC6193.m10948()) {
                            abstractC6193.m10919();
                        }
                    }
                } while (unsafe.getObjectVolatile(c6217, j) == abstractC6193);
                if (abstractC6193M10924.m10948()) {
                    abstractC6193M10924.m10919();
                }
            }
            c6217 = this;
        }
        C6218 c62182 = (C6218) AbstractC6185.m10924(objM10925);
        AtomicReferenceArray atomicReferenceArray = c62182.f15357;
        int i = (int) (andIncrement % ((long) AbstractC6216.f15343));
        while (!atomicReferenceArray.compareAndSet(i, null, interfaceC6244)) {
            if (atomicReferenceArray.get(i) != null) {
                C5317 c5317 = AbstractC6216.f15347;
                C5317 c53172 = AbstractC6216.f15346;
                while (!atomicReferenceArray.compareAndSet(i, c5317, c53172)) {
                    if (atomicReferenceArray.get(i) != c5317) {
                        return false;
                    }
                }
                boolean z = interfaceC6244 instanceof InterfaceC6279;
                C6008 c6008 = C6008.f15084;
                if (z) {
                    ((InterfaceC6279) interfaceC6244).mo10993(c6008, c6217.f15356);
                    return true;
                }
                if (interfaceC6244 instanceof InterfaceC6200) {
                    ((InterfaceC6200) interfaceC6244).mo10970(c6008);
                    return true;
                }
                C5043.m9174(interfaceC6244, "unexpected: ");
                return false;
            }
        }
        interfaceC6244.mo10822(c62182, i);
        return true;
    }
}
