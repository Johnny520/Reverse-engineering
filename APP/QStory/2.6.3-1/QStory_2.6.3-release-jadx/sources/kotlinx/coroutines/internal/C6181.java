package kotlinx.coroutines.internal;

import io.ktor.util.C5043;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.AbstractC6226;
import kotlinx.coroutines.AbstractC6228;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.AbstractC6252;
import kotlinx.coroutines.AbstractC6264;
import kotlinx.coroutines.C6262;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.DispatchException;
import p079.InterfaceC7692;
import p307.AbstractC9322;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6181 extends AbstractC6228 implements InterfaceC7692, InterfaceC5189 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15259 = AtomicReferenceFieldUpdater.newUpdater(C6181.class, Object.class, "_reusableCancellableContinuation$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f15260 = AbstractC9322.f23936.objectFieldOffset(C6181.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final ContinuationImpl f15261;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC6264 f15262;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object f15263;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Object f15264;

    public C6181(AbstractC6264 abstractC6264, ContinuationImpl continuationImpl) {
        super(-1);
        this.f15262 = abstractC6264;
        this.f15261 = continuationImpl;
        this.f15263 = AbstractC6185.f15275;
        this.f15264 = AbstractC6185.m10928(continuationImpl.getContext());
    }

    @Override // p079.InterfaceC7692
    public final InterfaceC7692 getCallerFrame() {
        return this.f15261;
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final InterfaceC5192 getContext() {
        return this.f15261.getContext();
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final void resumeWith(Object obj) throws DispatchException {
        Throwable thM9307exceptionOrNullimpl = Result.m9307exceptionOrNullimpl(obj);
        Object c6262 = thM9307exceptionOrNullimpl == null ? obj : new C6262(thM9307exceptionOrNullimpl, false);
        ContinuationImpl continuationImpl = this.f15261;
        InterfaceC5192 context = continuationImpl.getContext();
        AbstractC6264 abstractC6264 = this.f15262;
        if (AbstractC6185.m10934(abstractC6264, context)) {
            this.f15263 = c6262;
            this.f15376 = 0;
            AbstractC6185.m10933(abstractC6264, continuationImpl.getContext(), this);
            return;
        }
        AbstractC6226 abstractC6226M11078 = AbstractC6252.m11078();
        if (abstractC6226M11078.f15372 >= 4294967296L) {
            this.f15263 = c6262;
            this.f15376 = 0;
            abstractC6226M11078.m11021(this);
            return;
        }
        abstractC6226M11078.m11019(true);
        try {
            InterfaceC5192 context2 = continuationImpl.getContext();
            Object objM10927 = AbstractC6185.m10927(context2, this.f15264);
            try {
                continuationImpl.resumeWith(obj);
                while (abstractC6226M11078.m11022()) {
                }
            } finally {
                AbstractC6185.m10930(context2, objM10927);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f15262 + ", " + AbstractC6231.m11041(this.f15261) + ']';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m10905(Throwable th) {
        C6181 c6181;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            f15259.getClass();
            Unsafe unsafe2 = AbstractC9322.f23936;
            long j = f15260;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            C5317 c5317 = AbstractC6185.f15274;
            if (AbstractC5227.m9466(objectVolatile, c5317)) {
                while (true) {
                    Unsafe unsafe3 = AbstractC9322.f23936;
                    C6181 c61812 = this;
                    th2 = th;
                    c6181 = c61812;
                    if (unsafe3.compareAndSwapObject(c61812, f15260, c5317, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(c6181, j) != c5317) {
                        break;
                    }
                    this = c6181;
                    th = th2;
                }
            } else {
                c6181 = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = AbstractC9322.f23936;
                    if (unsafe.compareAndSwapObject(c6181, f15260, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(c6181, j) == objectVolatile);
            }
            this = c6181;
            th = th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m10906() {
        f15259.getClass();
        return AbstractC9322.f23936.getObjectVolatile(this, f15260) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Throwable m10907(C6276 c6276) {
        Unsafe unsafe;
        C6181 c6181;
        C6276 c62762;
        while (true) {
            f15259.getClass();
            Unsafe unsafe2 = AbstractC9322.f23936;
            long j = f15260;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            C5317 c5317 = AbstractC6185.f15274;
            if (objectVolatile != c5317) {
                C6181 c61812 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    C5043.m9151(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = AbstractC9322.f23936;
                    if (unsafe.compareAndSwapObject(c61812, f15260, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(c61812, j) == objectVolatile);
                C6755.m11869("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = AbstractC9322.f23936;
                c6181 = this;
                c62762 = c6276;
                if (unsafe3.compareAndSwapObject(c6181, f15260, c5317, c62762)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(c6181, j) != c5317) {
                    break;
                }
                this = c6181;
                c6276 = c62762;
            }
            this = c6181;
            c6276 = c62762;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C6276 m10908() {
        C6181 c6181;
        C5317 c5317 = AbstractC6185.f15274;
        while (true) {
            f15259.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15260;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, c5317);
                return null;
            }
            if (objectVolatile instanceof C6276) {
                while (true) {
                    Unsafe unsafe2 = AbstractC9322.f23936;
                    C6181 c61812 = this;
                    boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(c61812, f15260, objectVolatile, c5317);
                    c6181 = c61812;
                    if (zCompareAndSwapObject) {
                        return (C6276) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(c6181, j) != objectVolatile) {
                        break;
                    }
                    this = c6181;
                }
            } else {
                c6181 = this;
                if (objectVolatile != c5317 && !(objectVolatile instanceof Throwable)) {
                    C5043.m9151(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = c6181;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C6276 m10909() {
        f15259.getClass();
        Object objectVolatile = AbstractC9322.f23936.getObjectVolatile(this, f15260);
        if (objectVolatile instanceof C6276) {
            return (C6276) objectVolatile;
        }
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC6228
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Object mo10910() {
        Object obj = this.f15263;
        this.f15263 = AbstractC6185.f15275;
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m10911() {
        do {
            f15259.getClass();
        } while (AbstractC9322.f23936.getObjectVolatile(this, f15260) == AbstractC6185.f15274);
    }

    @Override // kotlinx.coroutines.AbstractC6228
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC5189 mo10904() {
        return this;
    }
}
