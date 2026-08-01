package kotlinx.coroutines.internal;

import io.ktor.util.C4211;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5396;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.AbstractC5420;
import kotlinx.coroutines.AbstractC5432;
import kotlinx.coroutines.C5430;
import kotlinx.coroutines.C5444;
import kotlinx.coroutines.DispatchException;
import p063.InterfaceC6863;
import p291.AbstractC8493;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5349 extends AbstractC5396 implements InterfaceC6863, InterfaceC4357 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14914 = AtomicReferenceFieldUpdater.newUpdater(C5349.class, Object.class, "_reusableCancellableContinuation$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f14915 = AbstractC8493.f23591.objectFieldOffset(C5349.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final ContinuationImpl f14916;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC5432 f14917;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public Object f14918;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Object f14919;

    public C5349(AbstractC5432 abstractC5432, ContinuationImpl continuationImpl) {
        super(-1);
        this.f14917 = abstractC5432;
        this.f14916 = continuationImpl;
        this.f14918 = AbstractC5353.f14930;
        this.f14919 = AbstractC5353.m10369(continuationImpl.getContext());
    }

    @Override // p063.InterfaceC6863
    public final InterfaceC6863 getCallerFrame() {
        return this.f14916;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final InterfaceC4360 getContext() {
        return this.f14916.getContext();
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final void resumeWith(Object obj) throws DispatchException {
        Throwable thM8748exceptionOrNullimpl = Result.m8748exceptionOrNullimpl(obj);
        Object c5430 = thM8748exceptionOrNullimpl == null ? obj : new C5430(thM8748exceptionOrNullimpl, false);
        ContinuationImpl continuationImpl = this.f14916;
        InterfaceC4360 context = continuationImpl.getContext();
        AbstractC5432 abstractC5432 = this.f14917;
        if (AbstractC5353.m10375(abstractC5432, context)) {
            this.f14918 = c5430;
            this.f15031 = 0;
            AbstractC5353.m10374(abstractC5432, continuationImpl.getContext(), this);
            return;
        }
        AbstractC5394 abstractC5394M10519 = AbstractC5420.m10519();
        if (abstractC5394M10519.f15027 >= 4294967296L) {
            this.f14918 = c5430;
            this.f15031 = 0;
            abstractC5394M10519.m10462(this);
            return;
        }
        abstractC5394M10519.m10460(true);
        try {
            InterfaceC4360 context2 = continuationImpl.getContext();
            Object objM10368 = AbstractC5353.m10368(context2, this.f14919);
            try {
                continuationImpl.resumeWith(obj);
                while (abstractC5394M10519.m10463()) {
                }
            } finally {
                AbstractC5353.m10371(context2, objM10368);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f14917 + ", " + AbstractC5399.m10482(this.f14916) + ']';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final boolean m10346(Throwable th) {
        C5349 c5349;
        Throwable th2;
        Unsafe unsafe;
        while (true) {
            f14914.getClass();
            Unsafe unsafe2 = AbstractC8493.f23591;
            long j = f14915;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            C4485 c4485 = AbstractC5353.f14929;
            if (AbstractC4395.m8907(objectVolatile, c4485)) {
                while (true) {
                    Unsafe unsafe3 = AbstractC8493.f23591;
                    C5349 c53492 = this;
                    th2 = th;
                    c5349 = c53492;
                    if (unsafe3.compareAndSwapObject(c53492, f14915, c4485, th2)) {
                        return true;
                    }
                    if (unsafe3.getObjectVolatile(c5349, j) != c4485) {
                        break;
                    }
                    this = c5349;
                    th = th2;
                }
            } else {
                c5349 = this;
                th2 = th;
                if (objectVolatile instanceof Throwable) {
                    return true;
                }
                do {
                    unsafe = AbstractC8493.f23591;
                    if (unsafe.compareAndSwapObject(c5349, f14915, objectVolatile, (Object) null)) {
                        return false;
                    }
                } while (unsafe.getObjectVolatile(c5349, j) == objectVolatile);
            }
            this = c5349;
            th = th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final boolean m10347() {
        f14914.getClass();
        return AbstractC8493.f23591.getObjectVolatile(this, f14915) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final Throwable m10348(C5444 c5444) {
        Unsafe unsafe;
        C5349 c5349;
        C5444 c54442;
        while (true) {
            f14914.getClass();
            Unsafe unsafe2 = AbstractC8493.f23591;
            long j = f14915;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            C4485 c4485 = AbstractC5353.f14929;
            if (objectVolatile != c4485) {
                C5349 c53492 = this;
                if (!(objectVolatile instanceof Throwable)) {
                    C4211.m8592(objectVolatile, "Inconsistent state ");
                    return null;
                }
                do {
                    unsafe = AbstractC8493.f23591;
                    if (unsafe.compareAndSwapObject(c53492, f14915, objectVolatile, (Object) null)) {
                        return (Throwable) objectVolatile;
                    }
                } while (unsafe.getObjectVolatile(c53492, j) == objectVolatile);
                C5925.m11310("Failed requirement.");
                return null;
            }
            while (true) {
                Unsafe unsafe3 = AbstractC8493.f23591;
                c5349 = this;
                c54442 = c5444;
                if (unsafe3.compareAndSwapObject(c5349, f14915, c4485, c54442)) {
                    return null;
                }
                if (unsafe3.getObjectVolatile(c5349, j) != c4485) {
                    break;
                }
                this = c5349;
                c5444 = c54442;
            }
            this = c5349;
            c5444 = c54442;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C5444 m10349() {
        C5349 c5349;
        C4485 c4485 = AbstractC5353.f14929;
        while (true) {
            f14914.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f14915;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile == null) {
                unsafe.putObjectVolatile(this, j, c4485);
                return null;
            }
            if (objectVolatile instanceof C5444) {
                while (true) {
                    Unsafe unsafe2 = AbstractC8493.f23591;
                    C5349 c53492 = this;
                    boolean zCompareAndSwapObject = unsafe2.compareAndSwapObject(c53492, f14915, objectVolatile, c4485);
                    c5349 = c53492;
                    if (zCompareAndSwapObject) {
                        return (C5444) objectVolatile;
                    }
                    if (unsafe2.getObjectVolatile(c5349, j) != objectVolatile) {
                        break;
                    }
                    this = c5349;
                }
            } else {
                c5349 = this;
                if (objectVolatile != c4485 && !(objectVolatile instanceof Throwable)) {
                    C4211.m8592(objectVolatile, "Inconsistent state ");
                    return null;
                }
            }
            this = c5349;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C5444 m10350() {
        f14914.getClass();
        Object objectVolatile = AbstractC8493.f23591.getObjectVolatile(this, f14915);
        if (objectVolatile instanceof C5444) {
            return (C5444) objectVolatile;
        }
        return null;
    }

    @Override // kotlinx.coroutines.AbstractC5396
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Object mo10351() {
        Object obj = this.f14918;
        this.f14918 = AbstractC5353.f14930;
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m10352() {
        do {
            f14914.getClass();
        } while (AbstractC8493.f23591.getObjectVolatile(this, f14915) == AbstractC5353.f14929);
    }

    @Override // kotlinx.coroutines.AbstractC5396
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC4357 mo10345() {
        return this;
    }
}
