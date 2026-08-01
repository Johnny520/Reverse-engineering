package kotlinx.coroutines;

import io.ktor.util.C4211;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5176;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlinx.coroutines.internal.AbstractC5353;
import kotlinx.coroutines.internal.AbstractC5361;
import kotlinx.coroutines.internal.C5349;
import p052.InterfaceC6551;
import p052.InterfaceC6558;
import p063.InterfaceC6863;
import p291.AbstractC8493;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5444 extends AbstractC5396 implements InterfaceC5447, InterfaceC6863, InterfaceC5412 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ long f15090;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15091;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f15092;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15093 = AtomicIntegerFieldUpdater.newUpdater(C5444.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15094 = AtomicReferenceFieldUpdater.newUpdater(C5444.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC4360 f15095;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC4357 f15096;

    static {
        Unsafe unsafe = AbstractC8493.f23591;
        f15090 = unsafe.objectFieldOffset(C5444.class.getDeclaredField("_state$volatile"));
        f15091 = AtomicReferenceFieldUpdater.newUpdater(C5444.class, Object.class, "_parentHandle$volatile");
        f15092 = unsafe.objectFieldOffset(C5444.class.getDeclaredField("_parentHandle$volatile"));
    }

    public C5444(int i, InterfaceC4357 interfaceC4357) {
        super(i);
        this.f15096 = interfaceC4357;
        this.f15095 = interfaceC4357.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C5428.f15072;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m10530(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static Object m10531(InterfaceC5454 interfaceC5454, Object obj, int i, InterfaceC6551 interfaceC6551) {
        if (obj instanceof C5430) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (interfaceC6551 != null || (interfaceC5454 instanceof InterfaceC5446)) {
            return new C5431(obj, interfaceC5454 instanceof InterfaceC5446 ? (InterfaceC5446) interfaceC5454 : null, interfaceC6551, (Throwable) null, 16);
        }
        return obj;
    }

    @Override // p063.InterfaceC6863
    public final InterfaceC6863 getCallerFrame() {
        InterfaceC4357 interfaceC4357 = this.f15096;
        if (interfaceC4357 instanceof InterfaceC6863) {
            return (InterfaceC6863) interfaceC4357;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final InterfaceC4360 getContext() {
        return this.f15095;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final void resumeWith(Object obj) {
        Throwable thM8748exceptionOrNullimpl = Result.m8748exceptionOrNullimpl(obj);
        if (thM8748exceptionOrNullimpl != null) {
            obj = new C5430(thM8748exceptionOrNullimpl, false);
        }
        m10538(obj, this.f15031, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo10534());
        sb.append('(');
        sb.append(AbstractC5399.m10482(this.f15096));
        sb.append("){");
        Object objM10539 = m10539();
        sb.append(objM10539 instanceof InterfaceC5454 ? "Active" : objM10539 instanceof C5445 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC5399.m10501(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean m10532() {
        f15094.getClass();
        Unsafe unsafe = AbstractC8493.f23591;
        long j = f15090;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof C5431) && ((C5431) objectVolatile).f15077 != null) {
            m10546();
            return false;
        }
        f15093.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, C5428.f15072);
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC5447
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo10433(Object obj) throws DispatchException {
        m10548(this.f15031);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m10533() {
        Throwable thM10348;
        InterfaceC4357 interfaceC4357 = this.f15096;
        C5349 c5349 = interfaceC4357 instanceof C5349 ? (C5349) interfaceC4357 : null;
        if (c5349 == null || (thM10348 = c5349.m10348(this)) == null) {
            return;
        }
        m10546();
        mo10435(thM10348);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public String mo10534() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m10535() {
        return this.f15031 == 2 && ((C5349) this.f15096).m10347();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C4485 m10536(Object obj, InterfaceC6551 interfaceC6551) {
        C5444 c5444;
        C4485 c4485 = AbstractC5399.f15038;
        while (true) {
            f15094.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f15090;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof InterfaceC5454)) {
                return null;
            }
            Object objM10531 = m10531((InterfaceC5454) objectVolatile, obj, this.f15031, interfaceC6551);
            while (true) {
                Unsafe unsafe2 = AbstractC8493.f23591;
                c5444 = this;
                if (unsafe2.compareAndSwapObject(c5444, f15090, objectVolatile, objM10531)) {
                    c5444.m10545();
                    return c4485;
                }
                if (unsafe2.getObjectVolatile(c5444, j) != objectVolatile) {
                    break;
                }
                this = c5444;
            }
            this = c5444;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m10537(AbstractC5432 abstractC5432) {
        InterfaceC4357 interfaceC4357 = this.f15096;
        C5349 c5349 = interfaceC4357 instanceof C5349 ? (C5349) interfaceC4357 : null;
        m10538(C5176.f14739, (c5349 != null ? c5349.f14917 : null) == abstractC5432 ? 4 : this.f15031, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m10538(Object obj, int i, InterfaceC6551 interfaceC6551) throws DispatchException {
        C5444 c5444;
        while (true) {
            f15094.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f15090;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof InterfaceC5454)) {
                C5444 c54442 = this;
                if (objectVolatile instanceof C5445) {
                    C5445 c5445 = (C5445) objectVolatile;
                    if (C5445.f15097.compareAndSet(c5445, 0, 1)) {
                        if (interfaceC6551 != null) {
                            c54442.m10550(interfaceC6551, c5445.f15075, obj);
                            return;
                        }
                        return;
                    }
                }
                C4211.m8592(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objM10531 = m10531((InterfaceC5454) objectVolatile, obj, i, interfaceC6551);
            while (true) {
                Unsafe unsafe2 = AbstractC8493.f23591;
                c5444 = this;
                if (unsafe2.compareAndSwapObject(c5444, f15090, objectVolatile, objM10531)) {
                    c5444.m10545();
                    c5444.m10548(i);
                    return;
                } else if (unsafe2.getObjectVolatile(c5444, j) != objectVolatile) {
                    break;
                } else {
                    this = c5444;
                }
            }
            this = c5444;
        }
    }

    @Override // kotlinx.coroutines.AbstractC5396
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Throwable mo10464(Object obj) {
        Throwable thMo10464 = super.mo10464(obj);
        if (thMo10464 != null) {
            return thMo10464;
        }
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC5447
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo10434(Object obj, InterfaceC6551 interfaceC6551) throws DispatchException {
        m10538(obj, this.f15031, interfaceC6551);
    }

    @Override // kotlinx.coroutines.AbstractC5396
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC4357 mo10345() {
        return this.f15096;
    }

    @Override // kotlinx.coroutines.AbstractC5396
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo10465(CancellationException cancellationException) {
        CancellationException cancellationException2;
        C5444 c5444;
        while (true) {
            f15094.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f15090;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof InterfaceC5454) {
                C5925.m11311("Not completed");
                return;
            }
            if (objectVolatile instanceof C5430) {
                return;
            }
            if (objectVolatile instanceof C5431) {
                C5431 c5431 = (C5431) objectVolatile;
                if (c5431.f15076 != null) {
                    C5925.m11311("Must be called at most once");
                    return;
                }
                C5431 c5431M10526 = C5431.m10526(c5431, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = AbstractC8493.f23591;
                    C5444 c54442 = this;
                    if (unsafe2.compareAndSwapObject(c54442, f15090, objectVolatile, c5431M10526)) {
                        InterfaceC5446 interfaceC5446 = c5431.f15079;
                        if (interfaceC5446 != null) {
                            c54442.m10552(interfaceC5446, cancellationException);
                        }
                        InterfaceC6551 interfaceC6551 = c5431.f15078;
                        if (interfaceC6551 != null) {
                            c54442.m10550(interfaceC6551, cancellationException, c5431.f15080);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(c54442, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        c5444 = c54442;
                        break;
                    }
                    this = c54442;
                }
            } else {
                C5444 c54443 = this;
                CancellationException cancellationException3 = cancellationException;
                C5431 c54312 = new C5431(objectVolatile, (InterfaceC5446) null, (InterfaceC6551) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    C5431 c54313 = c54312;
                    Unsafe unsafe3 = AbstractC8493.f23591;
                    c5444 = c54443;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(c5444, f15090, objectVolatile, c54313);
                    c54312 = c54313;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(c5444, j) != objectVolatile) {
                        break;
                    } else {
                        c54443 = c5444;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = c5444;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5412
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10263(AbstractC5361 abstractC5361, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f15093;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                C5925.m11311("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        m10542(abstractC5361);
    }

    @Override // kotlinx.coroutines.InterfaceC5447
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo10435(Throwable th) throws DispatchException {
        Throwable cancellationException;
        C5444 c5444;
        while (true) {
            f15094.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f15090;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof InterfaceC5454)) {
                return false;
            }
            boolean z = (objectVolatile instanceof InterfaceC5446) || (objectVolatile instanceof AbstractC5361);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            C5445 c5445 = new C5445(cancellationException, z);
            while (true) {
                Unsafe unsafe2 = AbstractC8493.f23591;
                c5444 = this;
                if (unsafe2.compareAndSwapObject(c5444, f15090, objectVolatile, c5445)) {
                    InterfaceC5454 interfaceC5454 = (InterfaceC5454) objectVolatile;
                    if (interfaceC5454 instanceof InterfaceC5446) {
                        c5444.m10552((InterfaceC5446) objectVolatile, th);
                    } else if (interfaceC5454 instanceof AbstractC5361) {
                        c5444.m10551((AbstractC5361) objectVolatile, th);
                    }
                    c5444.m10545();
                    c5444.m10548(c5444.f15031);
                    return true;
                }
                if (unsafe2.getObjectVolatile(c5444, j) != objectVolatile) {
                    break;
                }
                this = c5444;
            }
            this = c5444;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object m10539() {
        f15094.getClass();
        return AbstractC8493.f23591.getObjectVolatile(this, f15090);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object m10540() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        InterfaceC5452 interfaceC5452;
        boolean zM10535 = m10535();
        do {
            atomicIntegerFieldUpdater = f15093;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    C5925.m11311("Already suspended");
                    return null;
                }
                if (zM10535) {
                    m10533();
                }
                Object objM10539 = m10539();
                if (objM10539 instanceof C5430) {
                    throw ((C5430) objM10539).f15075;
                }
                int i3 = this.f15031;
                if ((i3 != 1 && i3 != 2) || (interfaceC5452 = (InterfaceC5452) this.f15095.get(C5453.f15105)) == null || interfaceC5452.mo10562()) {
                    return mo10467(objM10539);
                }
                CancellationException cancellationExceptionMo10563 = interfaceC5452.mo10563();
                mo10465(cancellationExceptionMo10563);
                throw cancellationExceptionMo10563;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (m10547() == null) {
            m10544();
        }
        if (zM10535) {
            m10533();
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m10541(InterfaceC6558 interfaceC6558) {
        m10542(new C5442(interfaceC6558, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
    
        m10530(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10542(kotlinx.coroutines.InterfaceC5454 r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C5444.m10542(kotlinx.coroutines.飘花落叶言子苏兰世哲楪):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m10543() {
        InterfaceC5398 interfaceC5398M10544 = m10544();
        if (interfaceC5398M10544 == null || (m10539() instanceof InterfaceC5454)) {
            return;
        }
        interfaceC5398M10544.dispose();
        f15091.getClass();
        AbstractC8493.f23591.putObjectVolatile(this, f15092, C5455.f15106);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC5398 m10544() {
        InterfaceC5452 interfaceC5452 = (InterfaceC5452) this.f15095.get(C5453.f15105);
        if (interfaceC5452 == null) {
            return null;
        }
        InterfaceC5398 interfaceC5398M10497 = AbstractC5399.m10497(interfaceC5452, new C5437(this));
        while (true) {
            f15091.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f15092;
            C5444 c5444 = this;
            if (unsafe.compareAndSwapObject(c5444, j, (Object) null, interfaceC5398M10497) || unsafe.getObjectVolatile(c5444, j) != null) {
                break;
            }
            this = c5444;
        }
        return interfaceC5398M10497;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m10545() {
        if (m10535()) {
            return;
        }
        m10546();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m10546() {
        InterfaceC5398 interfaceC5398M10547 = m10547();
        if (interfaceC5398M10547 == null) {
            return;
        }
        interfaceC5398M10547.dispose();
        f15091.getClass();
        AbstractC8493.f23591.putObjectVolatile(this, f15092, C5455.f15106);
    }

    @Override // kotlinx.coroutines.InterfaceC5447
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final C4485 mo10436(Object obj, InterfaceC6551 interfaceC6551) {
        return m10536(obj, interfaceC6551);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5398 m10547() {
        f15091.getClass();
        return (InterfaceC5398) AbstractC8493.f23591.getObjectVolatile(this, f15092);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m10548(int i) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f15093;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    C5925.m11311("Already resumed");
                    return;
                }
                boolean z = i == 4;
                InterfaceC4357 interfaceC4357 = this.f15096;
                if (!z && (interfaceC4357 instanceof C5349)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f15031;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        C5349 c5349 = (C5349) interfaceC4357;
                        AbstractC5432 abstractC5432 = c5349.f14917;
                        InterfaceC4360 context = c5349.f14916.getContext();
                        if (AbstractC5353.m10375(abstractC5432, context)) {
                            AbstractC5353.m10374(abstractC5432, context, this);
                            return;
                        }
                        AbstractC5394 abstractC5394M10519 = AbstractC5420.m10519();
                        if (abstractC5394M10519.f15027 >= 4294967296L) {
                            abstractC5394M10519.m10462(this);
                            return;
                        }
                        abstractC5394M10519.m10460(true);
                        try {
                            AbstractC5399.m10474(this, interfaceC4357, true);
                            do {
                            } while (abstractC5394M10519.m10463());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC5399.m10474(this, interfaceC4357, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Throwable mo10549(C5460 c5460) {
        return c5460.mo10563();
    }

    @Override // kotlinx.coroutines.AbstractC5396
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo10467(Object obj) {
        return obj instanceof C5431 ? ((C5431) obj).f15080 : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m10550(InterfaceC6551 interfaceC6551, Throwable th, Object obj) {
        InterfaceC4360 interfaceC4360 = this.f15095;
        try {
            interfaceC6551.invoke(th, obj, interfaceC4360);
        } catch (Throwable th2) {
            AbstractC5399.m10496(interfaceC4360, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m10551(AbstractC5361 abstractC5361, Throwable th) {
        InterfaceC4360 interfaceC4360 = this.f15095;
        int i = f15093.get(this) & 536870911;
        if (i == 536870911) {
            C5925.m11311("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            abstractC5361.mo10267(i, interfaceC4360);
        } catch (Throwable th2) {
            AbstractC5399.m10496(interfaceC4360, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.AbstractC5396
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo10351() {
        return m10539();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m10552(InterfaceC5446 interfaceC5446, Throwable th) {
        try {
            interfaceC5446.mo10415(th);
        } catch (Throwable th2) {
            AbstractC5399.m10496(this.f15095, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }
}
