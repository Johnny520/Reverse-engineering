package kotlinx.coroutines.internal;

import io.ktor.util.C4210;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlinx.coroutines.AbstractC5393;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.AbstractC5419;
import kotlinx.coroutines.AbstractC5431;
import kotlinx.coroutines.C5429;
import kotlinx.coroutines.C5443;
import kotlinx.coroutines.DispatchException;
import p063.InterfaceC6862;
import p291.AbstractC8501;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5348 extends AbstractC5395 implements InterfaceC6862, InterfaceC4356 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14914 = AtomicReferenceFieldUpdater.newUpdater(C5348.class, Object.class, "_reusableCancellableContinuation$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f14915 = AbstractC8501.f23600.objectFieldOffset(C5348.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final ContinuationImpl f14916;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC5431 f14917;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object f14918;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Object f14919;

    public C5348(AbstractC5431 abstractC5431, ContinuationImpl continuationImpl) {
        super(-1);
        this.f14917 = abstractC5431;
        this.f14916 = continuationImpl;
        this.f14918 = AbstractC5352.f14930;
        this.f14919 = AbstractC5352.m10365(continuationImpl.getContext());
    }

    @Override // p063.InterfaceC6862
    public final InterfaceC6862 getCallerFrame() {
        return this.f14916;
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final InterfaceC4359 getContext() {
        return this.f14916.getContext();
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final void resumeWith(Object obj) throws DispatchException {
        Throwable thM8758exceptionOrNullimpl = Result.m8758exceptionOrNullimpl(obj);
        Object c5429 = thM8758exceptionOrNullimpl == null ? obj : new C5429(thM8758exceptionOrNullimpl, false);
        ContinuationImpl continuationImpl = this.f14916;
        InterfaceC4359 context = continuationImpl.getContext();
        AbstractC5431 abstractC5431 = this.f14917;
        if (AbstractC5352.m10371(abstractC5431, context)) {
            this.f14918 = c5429;
            this.f15031 = 0;
            AbstractC5352.m10370(abstractC5431, continuationImpl.getContext(), this);
            return;
        }
        AbstractC5393 abstractC5393M10515 = AbstractC5419.m10515();
        if (abstractC5393M10515.f15027 >= 4294967296L) {
            this.f14918 = c5429;
            this.f15031 = 0;
            abstractC5393M10515.m10457(this);
            return;
        }
        abstractC5393M10515.m10456(true);
        try {
            InterfaceC4359 context2 = continuationImpl.getContext();
            Object objM10364 = AbstractC5352.m10364(context2, this.f14919);
            try {
                continuationImpl.resumeWith(obj);
                while (abstractC5393M10515.m10459()) {
                }
            } finally {
                AbstractC5352.m10367(context2, objM10364);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f14917 + ", " + AbstractC5398.m10478(this.f14916) + ']';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m10342(Throwable th) {
        C5348 c5348;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            f14914.getClass();
            Unsafe unsafe2 = AbstractC8501.f23600;
            long j = f14915;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            C4484 c4484 = AbstractC5352.f14929;
            if (AbstractC4394.m8917(objectVolatile, c4484)) {
                while (true) {
                    Unsafe unsafe3 = AbstractC8501.f23600;
                    C5348 c53482 = this;
                    th2 = th;
                    c5348 = c53482;
                    if (unsafe3.compareAndSwapObject(c53482, f14915, c4484, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(c5348, j) != c4484) {
                        break;
                    }
                    this = c5348;
                    th = th2;
                }
            } else {
                c5348 = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = AbstractC8501.f23600;
                    if (unsafe.compareAndSwapObject(c5348, f14915, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(c5348, j) == objectVolatile);
            }
            this = c5348;
            th = th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m10343() {
        f14914.getClass();
        return AbstractC8501.f23600.getObjectVolatile(this, f14915) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Throwable m10344(C5443 c5443) {
        Unsafe unsafe;
        C5348 c5348;
        C5443 c54432;
        while (true) {
            f14914.getClass();
            Unsafe unsafe2 = AbstractC8501.f23600;
            long j = f14915;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            C4484 c4484 = AbstractC5352.f14929;
            if (objectVolatile != c4484) {
                C5348 c53482 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    C4210.m8602(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = AbstractC8501.f23600;
                    if (unsafe.compareAndSwapObject(c53482, f14915, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(c53482, j) == objectVolatile);
                C5919.m11249("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = AbstractC8501.f23600;
                c5348 = this;
                c54432 = c5443;
                if (unsafe3.compareAndSwapObject(c5348, f14915, c4484, c54432)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(c5348, j) != c4484) {
                    break;
                }
                this = c5348;
                c5443 = c54432;
            }
            this = c5348;
            c5443 = c54432;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C5443 m10345() {
        C5348 c5348;
        C4484 c4484 = AbstractC5352.f14929;
        while (true) {
            f14914.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f14915;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, c4484);
                return null;
            }
            if (objectVolatile instanceof C5443) {
                while (true) {
                    Unsafe unsafe2 = AbstractC8501.f23600;
                    C5348 c53482 = this;
                    boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(c53482, f14915, objectVolatile, c4484);
                    c5348 = c53482;
                    if (zCompareAndSwapObject) {
                        return (C5443) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(c5348, j) != objectVolatile) {
                        break;
                    }
                    this = c5348;
                }
            } else {
                c5348 = this;
                if (objectVolatile != c4484 && !(objectVolatile instanceof Throwable)) {
                    C4210.m8602(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = c5348;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C5443 m10346() {
        f14914.getClass();
        Object objectVolatile = AbstractC8501.f23600.getObjectVolatile(this, f14915);
        if (objectVolatile instanceof C5443) {
            return (C5443) objectVolatile;
        }
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC5395
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Object mo10347() {
        Object obj = this.f14918;
        this.f14918 = AbstractC5352.f14930;
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m10348() {
        do {
            f14914.getClass();
        } while (AbstractC8501.f23600.getObjectVolatile(this, f14915) == AbstractC5352.f14929);
    }

    @Override // kotlinx.coroutines.AbstractC5395
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC4356 mo10341() {
        return this;
    }
}
