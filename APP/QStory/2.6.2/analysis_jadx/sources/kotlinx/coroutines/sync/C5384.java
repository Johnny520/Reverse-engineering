package kotlinx.coroutines.sync;

import androidx.compose.foundation.C1093;
import io.ktor.util.C4210;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5175;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlinx.coroutines.InterfaceC5411;
import kotlinx.coroutines.InterfaceC5446;
import kotlinx.coroutines.internal.AbstractC5352;
import kotlinx.coroutines.internal.AbstractC5360;
import kotlinx.coroutines.selects.InterfaceC5367;
import p291.AbstractC8501;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.coroutines.sync.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5384 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15004;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f15005;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15006;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f15007;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15008 = AtomicReferenceFieldUpdater.newUpdater(C5384.class, Object.class, "head$volatile");

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
        Unsafe unsafe = AbstractC8501.f23600;
        f15010 = unsafe.objectFieldOffset(C5384.class.getDeclaredField("head$volatile"));
        f15007 = AtomicLongFieldUpdater.newUpdater(C5384.class, "deqIdx$volatile");
        f15006 = AtomicReferenceFieldUpdater.newUpdater(C5384.class, Object.class, "tail$volatile");
        f15009 = unsafe.objectFieldOffset(C5384.class.getDeclaredField("tail$volatile"));
        f15005 = AtomicLongFieldUpdater.newUpdater(C5384.class, "enqIdx$volatile");
        f15004 = AtomicIntegerFieldUpdater.newUpdater(C5384.class, "_availablePermits$volatile");
    }

    public C5384() {
        C5385 c5385 = new C5385(0L, null, 2);
        this.head$volatile = c5385;
        this.tail$volatile = c5385;
        this._availablePermits$volatile = 1;
        this.f15011 = new C1093(this, 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m10433() {
        Object objM10362;
        Unsafe unsafe;
        f15008.getClass();
        Unsafe unsafe2 = AbstractC8501.f23600;
        long j = f15010;
        C5385 c5385 = (C5385) unsafe2.getObjectVolatile(this, j);
        long andIncrement = f15007.getAndIncrement(this);
        long j2 = andIncrement / ((long) AbstractC5383.f14998);
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        loop0: while (true) {
            objM10362 = AbstractC5352.m10362(c5385, j2, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (AbstractC5352.m10359(objM10362)) {
                break;
            }
            AbstractC5360 abstractC5360M10361 = AbstractC5352.m10361(objM10362);
            while (true) {
                AbstractC5360 abstractC5360 = (AbstractC5360) AbstractC8501.f23600.getObjectVolatile(this, j);
                if (abstractC5360.f14944 >= abstractC5360M10361.f14944) {
                    break loop0;
                }
                if (!abstractC5360M10361.m10384()) {
                    break;
                }
                do {
                    unsafe = AbstractC8501.f23600;
                    if (unsafe.compareAndSwapObject(this, f15010, abstractC5360, abstractC5360M10361)) {
                        if (abstractC5360.m10385()) {
                            abstractC5360.m10356();
                        }
                    }
                } while (unsafe.getObjectVolatile(this, j) == abstractC5360);
                if (abstractC5360M10361.m10385()) {
                    abstractC5360M10361.m10356();
                }
            }
        }
        C5385 c53852 = (C5385) AbstractC5352.m10361(objM10362);
        AtomicReferenceArray atomicReferenceArray = c53852.f15012;
        c53852.m10353();
        boolean z = false;
        if (c53852.f14944 <= j2) {
            int i = (int) (andIncrement % ((long) AbstractC5383.f14998));
            Object andSet = atomicReferenceArray.getAndSet(i, AbstractC5383.f15002);
            if (andSet == null) {
                int i2 = AbstractC5383.f15003;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == AbstractC5383.f15001) {
                        return true;
                    }
                }
                C4484 c4484 = AbstractC5383.f15002;
                C4484 c44842 = AbstractC5383.f15000;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, c4484, c44842)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i) != c4484) {
                        break;
                    }
                }
                return !z;
            }
            if (andSet != AbstractC5383.f14999) {
                boolean z2 = andSet instanceof InterfaceC5446;
                C5175 c5175 = C5175.f14739;
                if (!z2) {
                    if (andSet instanceof InterfaceC5367) {
                        return ((InterfaceC5367) andSet).mo10408(this, c5175);
                    }
                    C4210.m8602(andSet, "unexpected: ");
                    return false;
                }
                InterfaceC5446 interfaceC5446 = (InterfaceC5446) andSet;
                C4484 c4484Mo10432 = interfaceC5446.mo10432(c5175, this.f15011);
                if (c4484Mo10432 != null) {
                    interfaceC5446.mo10429(c4484Mo10432);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m10434() {
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
                C5919.m11251("The number of released permits cannot be greater than 1");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m10433());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean m10435(InterfaceC5411 interfaceC5411) {
        Object objM10362;
        Unsafe unsafe;
        C5384 c5384 = this;
        f15006.getClass();
        Unsafe unsafe2 = AbstractC8501.f23600;
        long j = f15009;
        C5385 c5385 = (C5385) unsafe2.getObjectVolatile(c5384, j);
        long andIncrement = f15005.getAndIncrement(c5384);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        long j2 = andIncrement / ((long) AbstractC5383.f14998);
        loop0: while (true) {
            objM10362 = AbstractC5352.m10362(c5385, j2, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (AbstractC5352.m10359(objM10362)) {
                break;
            }
            AbstractC5360 abstractC5360M10361 = AbstractC5352.m10361(objM10362);
            while (true) {
                AbstractC5360 abstractC5360 = (AbstractC5360) AbstractC8501.f23600.getObjectVolatile(c5384, j);
                if (abstractC5360.f14944 >= abstractC5360M10361.f14944) {
                    c5384 = this;
                    break loop0;
                }
                if (!abstractC5360M10361.m10384()) {
                    break;
                }
                do {
                    unsafe = AbstractC8501.f23600;
                    c5384 = this;
                    if (unsafe.compareAndSwapObject(c5384, f15009, abstractC5360, abstractC5360M10361)) {
                        if (abstractC5360.m10385()) {
                            abstractC5360.m10356();
                        }
                    }
                } while (unsafe.getObjectVolatile(c5384, j) == abstractC5360);
                if (abstractC5360M10361.m10385()) {
                    abstractC5360M10361.m10356();
                }
            }
            c5384 = this;
        }
        C5385 c53852 = (C5385) AbstractC5352.m10361(objM10362);
        AtomicReferenceArray atomicReferenceArray = c53852.f15012;
        int i = (int) (andIncrement % ((long) AbstractC5383.f14998));
        while (!atomicReferenceArray.compareAndSet(i, null, interfaceC5411)) {
            if (atomicReferenceArray.get(i) != null) {
                C4484 c4484 = AbstractC5383.f15002;
                C4484 c44842 = AbstractC5383.f15001;
                while (!atomicReferenceArray.compareAndSet(i, c4484, c44842)) {
                    if (atomicReferenceArray.get(i) != c4484) {
                        return false;
                    }
                }
                boolean z = interfaceC5411 instanceof InterfaceC5446;
                C5175 c5175 = C5175.f14739;
                if (z) {
                    ((InterfaceC5446) interfaceC5411).mo10430(c5175, c5384.f15011);
                    return true;
                }
                if (interfaceC5411 instanceof InterfaceC5367) {
                    ((InterfaceC5367) interfaceC5411).mo10407(c5175);
                    return true;
                }
                C4210.m8625(interfaceC5411, "unexpected: ");
                return false;
            }
        }
        interfaceC5411.mo10259(c53852, i);
        return true;
    }
}
