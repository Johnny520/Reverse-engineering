package kotlinx.coroutines;

import io.ktor.util.C4210;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C5175;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlinx.coroutines.internal.AbstractC5352;
import kotlinx.coroutines.internal.AbstractC5360;
import kotlinx.coroutines.internal.C5348;
import p052.InterfaceC6550;
import p052.InterfaceC6557;
import p063.InterfaceC6862;
import p291.AbstractC8501;
import sun.misc.Unsafe;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5443 extends AbstractC5395 implements InterfaceC5446, InterfaceC6862, InterfaceC5411 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ long f15090;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15091;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f15092;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f15093 = AtomicIntegerFieldUpdater.newUpdater(C5443.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15094 = AtomicReferenceFieldUpdater.newUpdater(C5443.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC4359 f15095;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC4356 f15096;

    static {
        Unsafe unsafe = AbstractC8501.f23600;
        f15090 = unsafe.objectFieldOffset(C5443.class.getDeclaredField("_state$volatile"));
        f15091 = AtomicReferenceFieldUpdater.newUpdater(C5443.class, Object.class, "_parentHandle$volatile");
        f15092 = unsafe.objectFieldOffset(C5443.class.getDeclaredField("_parentHandle$volatile"));
    }

    public C5443(int i, InterfaceC4356 interfaceC4356) {
        super(i);
        this.f15096 = interfaceC4356;
        this.f15095 = interfaceC4356.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C5427.f15072;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static void m10526(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static Object m10527(InterfaceC5453 interfaceC5453, Object obj, int i, InterfaceC6550 interfaceC6550) {
        if (obj instanceof C5429) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (interfaceC6550 != null || (interfaceC5453 instanceof InterfaceC5445)) {
            return new C5430(obj, interfaceC5453 instanceof InterfaceC5445 ? (InterfaceC5445) interfaceC5453 : null, interfaceC6550, (Throwable) null, 16);
        }
        return obj;
    }

    @Override // p063.InterfaceC6862
    public final InterfaceC6862 getCallerFrame() {
        InterfaceC4356 interfaceC4356 = this.f15096;
        if (interfaceC4356 instanceof InterfaceC6862) {
            return (InterfaceC6862) interfaceC4356;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final InterfaceC4359 getContext() {
        return this.f15095;
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final void resumeWith(Object obj) {
        Throwable thM8758exceptionOrNullimpl = Result.m8758exceptionOrNullimpl(obj);
        if (thM8758exceptionOrNullimpl != null) {
            obj = new C5429(thM8758exceptionOrNullimpl, false);
        }
        m10534(obj, this.f15031, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo10530());
        sb.append('(');
        sb.append(AbstractC5398.m10478(this.f15096));
        sb.append("){");
        Object objM10535 = m10535();
        sb.append(objM10535 instanceof InterfaceC5453 ? "Active" : objM10535 instanceof C5444 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC5398.m10497(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean m10528() {
        f15094.getClass();
        Unsafe unsafe = AbstractC8501.f23600;
        long j = f15090;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if ((objectVolatile instanceof C5430) && ((C5430) objectVolatile).f15077 != null) {
            m10542();
            return false;
        }
        f15093.set(this, 536870911);
        unsafe.putObjectVolatile(this, j, C5427.f15072);
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC5446
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final void mo10429(Object obj) throws DispatchException {
        m10544(this.f15031);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m10529() {
        Throwable thM10344;
        InterfaceC4356 interfaceC4356 = this.f15096;
        C5348 c5348 = interfaceC4356 instanceof C5348 ? (C5348) interfaceC4356 : null;
        if (c5348 == null || (thM10344 = c5348.m10344(this)) == null) {
            return;
        }
        m10542();
        mo10431(thM10344);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public String mo10530() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m10531() {
        return this.f15031 == 2 && ((C5348) this.f15096).m10343();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final C4484 m10532(Object obj, InterfaceC6550 interfaceC6550) {
        C5443 c5443;
        C4484 c4484 = AbstractC5398.f15038;
        while (true) {
            f15094.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f15090;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof InterfaceC5453)) {
                return null;
            }
            Object objM10527 = m10527((InterfaceC5453) objectVolatile, obj, this.f15031, interfaceC6550);
            while (true) {
                Unsafe unsafe2 = AbstractC8501.f23600;
                c5443 = this;
                if (unsafe2.compareAndSwapObject(c5443, f15090, objectVolatile, objM10527)) {
                    c5443.m10541();
                    return c4484;
                }
                if (unsafe2.getObjectVolatile(c5443, j) != objectVolatile) {
                    break;
                }
                this = c5443;
            }
            this = c5443;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m10533(AbstractC5431 abstractC5431) {
        InterfaceC4356 interfaceC4356 = this.f15096;
        C5348 c5348 = interfaceC4356 instanceof C5348 ? (C5348) interfaceC4356 : null;
        m10534(C5175.f14739, (c5348 != null ? c5348.f14917 : null) == abstractC5431 ? 4 : this.f15031, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m10534(Object obj, int i, InterfaceC6550 interfaceC6550) throws DispatchException {
        C5443 c5443;
        while (true) {
            f15094.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f15090;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof InterfaceC5453)) {
                C5443 c54432 = this;
                if (objectVolatile instanceof C5444) {
                    C5444 c5444 = (C5444) objectVolatile;
                    if (C5444.f15097.compareAndSet(c5444, 0, 1)) {
                        if (interfaceC6550 != null) {
                            c54432.m10546(interfaceC6550, c5444.f15075, obj);
                            return;
                        }
                        return;
                    }
                }
                C4210.m8602(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objM10527 = m10527((InterfaceC5453) objectVolatile, obj, i, interfaceC6550);
            while (true) {
                Unsafe unsafe2 = AbstractC8501.f23600;
                c5443 = this;
                if (unsafe2.compareAndSwapObject(c5443, f15090, objectVolatile, objM10527)) {
                    c5443.m10541();
                    c5443.m10544(i);
                    return;
                } else if (unsafe2.getObjectVolatile(c5443, j) != objectVolatile) {
                    break;
                } else {
                    this = c5443;
                }
            }
            this = c5443;
        }
    }

    @Override // kotlinx.coroutines.AbstractC5395
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Throwable mo10460(Object obj) {
        Throwable thMo10460 = super.mo10460(obj);
        if (thMo10460 != null) {
            return thMo10460;
        }
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC5446
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo10430(Object obj, InterfaceC6550 interfaceC6550) throws DispatchException {
        m10534(obj, this.f15031, interfaceC6550);
    }

    @Override // kotlinx.coroutines.AbstractC5395
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC4356 mo10341() {
        return this.f15096;
    }

    @Override // kotlinx.coroutines.AbstractC5395
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo10461(CancellationException cancellationException) {
        CancellationException cancellationException2;
        C5443 c5443;
        while (true) {
            f15094.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f15090;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof InterfaceC5453) {
                C5919.m11250("Not completed");
                return;
            }
            if (objectVolatile instanceof C5429) {
                return;
            }
            if (objectVolatile instanceof C5430) {
                C5430 c5430 = (C5430) objectVolatile;
                if (c5430.f15076 != null) {
                    C5919.m11250("Must be called at most once");
                    return;
                }
                C5430 c5430M10522 = C5430.m10522(c5430, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = AbstractC8501.f23600;
                    C5443 c54432 = this;
                    if (unsafe2.compareAndSwapObject(c54432, f15090, objectVolatile, c5430M10522)) {
                        InterfaceC5445 interfaceC5445 = c5430.f15079;
                        if (interfaceC5445 != null) {
                            c54432.m10548(interfaceC5445, cancellationException);
                        }
                        InterfaceC6550 interfaceC6550 = c5430.f15078;
                        if (interfaceC6550 != null) {
                            c54432.m10546(interfaceC6550, cancellationException, c5430.f15080);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(c54432, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        c5443 = c54432;
                        break;
                    }
                    this = c54432;
                }
            } else {
                C5443 c54433 = this;
                CancellationException cancellationException3 = cancellationException;
                C5430 c54302 = new C5430(objectVolatile, (InterfaceC5445) null, (InterfaceC6550) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    C5430 c54303 = c54302;
                    Unsafe unsafe3 = AbstractC8501.f23600;
                    c5443 = c54433;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(c5443, f15090, objectVolatile, c54303);
                    c54302 = c54303;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(c5443, j) != objectVolatile) {
                        break;
                    } else {
                        c54433 = c5443;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = c5443;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5411
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo10259(AbstractC5360 abstractC5360, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f15093;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                C5919.m11250("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        m10538(abstractC5360);
    }

    @Override // kotlinx.coroutines.InterfaceC5446
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo10431(Throwable th) throws DispatchException {
        Throwable cancellationException;
        C5443 c5443;
        while (true) {
            f15094.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f15090;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof InterfaceC5453)) {
                return false;
            }
            boolean z = (objectVolatile instanceof InterfaceC5445) || (objectVolatile instanceof AbstractC5360);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            C5444 c5444 = new C5444(cancellationException, z);
            while (true) {
                Unsafe unsafe2 = AbstractC8501.f23600;
                c5443 = this;
                if (unsafe2.compareAndSwapObject(c5443, f15090, objectVolatile, c5444)) {
                    InterfaceC5453 interfaceC5453 = (InterfaceC5453) objectVolatile;
                    if (interfaceC5453 instanceof InterfaceC5445) {
                        c5443.m10548((InterfaceC5445) objectVolatile, th);
                    } else if (interfaceC5453 instanceof AbstractC5360) {
                        c5443.m10547((AbstractC5360) objectVolatile, th);
                    }
                    c5443.m10541();
                    c5443.m10544(c5443.f15031);
                    return true;
                }
                if (unsafe2.getObjectVolatile(c5443, j) != objectVolatile) {
                    break;
                }
                this = c5443;
            }
            this = c5443;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final Object m10535() {
        f15094.getClass();
        return AbstractC8501.f23600.getObjectVolatile(this, f15090);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object m10536() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        InterfaceC5451 interfaceC5451;
        boolean zM10531 = m10531();
        do {
            atomicIntegerFieldUpdater = f15093;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    C5919.m11250("Already suspended");
                    return null;
                }
                if (zM10531) {
                    m10529();
                }
                Object objM10535 = m10535();
                if (objM10535 instanceof C5429) {
                    throw ((C5429) objM10535).f15075;
                }
                int i3 = this.f15031;
                if ((i3 != 1 && i3 != 2) || (interfaceC5451 = (InterfaceC5451) this.f15095.get(C5452.f15105)) == null || interfaceC5451.mo10557()) {
                    return mo10463(objM10535);
                }
                CancellationException cancellationExceptionMo10559 = interfaceC5451.mo10559();
                mo10461(cancellationExceptionMo10559);
                throw cancellationExceptionMo10559;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (m10543() == null) {
            m10540();
        }
        if (zM10531) {
            m10529();
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m10537(InterfaceC6557 interfaceC6557) {
        m10538(new C5441(interfaceC6557, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ce, code lost:
    
        m10526(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d1, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10538(kotlinx.coroutines.InterfaceC5453 r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C5443.m10538(kotlinx.coroutines.飘花落叶言子苏兰世哲楪):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m10539() {
        InterfaceC5397 interfaceC5397M10540 = m10540();
        if (interfaceC5397M10540 == null || (m10535() instanceof InterfaceC5453)) {
            return;
        }
        interfaceC5397M10540.dispose();
        f15091.getClass();
        AbstractC8501.f23600.putObjectVolatile(this, f15092, C5454.f15106);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC5397 m10540() {
        InterfaceC5451 interfaceC5451 = (InterfaceC5451) this.f15095.get(C5452.f15105);
        if (interfaceC5451 == null) {
            return null;
        }
        InterfaceC5397 interfaceC5397M10493 = AbstractC5398.m10493(interfaceC5451, new C5436(this));
        while (true) {
            f15091.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f15092;
            C5443 c5443 = this;
            if (unsafe.compareAndSwapObject(c5443, j, (Object) null, interfaceC5397M10493) || unsafe.getObjectVolatile(c5443, j) != null) {
                break;
            }
            this = c5443;
        }
        return interfaceC5397M10493;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m10541() {
        if (m10531()) {
            return;
        }
        m10542();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m10542() {
        InterfaceC5397 interfaceC5397M10543 = m10543();
        if (interfaceC5397M10543 == null) {
            return;
        }
        interfaceC5397M10543.dispose();
        f15091.getClass();
        AbstractC8501.f23600.putObjectVolatile(this, f15092, C5454.f15106);
    }

    @Override // kotlinx.coroutines.InterfaceC5446
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final C4484 mo10432(Object obj, InterfaceC6550 interfaceC6550) {
        return m10532(obj, interfaceC6550);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5397 m10543() {
        f15091.getClass();
        return (InterfaceC5397) AbstractC8501.f23600.getObjectVolatile(this, f15092);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m10544(int i) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f15093;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    C5919.m11250("Already resumed");
                    return;
                }
                boolean z = i == 4;
                InterfaceC4356 interfaceC4356 = this.f15096;
                if (!z && (interfaceC4356 instanceof C5348)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f15031;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        C5348 c5348 = (C5348) interfaceC4356;
                        AbstractC5431 abstractC5431 = c5348.f14917;
                        InterfaceC4359 context = c5348.f14916.getContext();
                        if (AbstractC5352.m10371(abstractC5431, context)) {
                            AbstractC5352.m10370(abstractC5431, context, this);
                            return;
                        }
                        AbstractC5393 abstractC5393M10515 = AbstractC5419.m10515();
                        if (abstractC5393M10515.f15027 >= 4294967296L) {
                            abstractC5393M10515.m10457(this);
                            return;
                        }
                        abstractC5393M10515.m10456(true);
                        try {
                            AbstractC5398.m10470(this, interfaceC4356, true);
                            do {
                            } while (abstractC5393M10515.m10459());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC5398.m10470(this, interfaceC4356, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Throwable mo10545(C5459 c5459) {
        return c5459.mo10559();
    }

    @Override // kotlinx.coroutines.AbstractC5395
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo10463(Object obj) {
        return obj instanceof C5430 ? ((C5430) obj).f15080 : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m10546(InterfaceC6550 interfaceC6550, Throwable th, Object obj) {
        InterfaceC4359 interfaceC4359 = this.f15095;
        try {
            interfaceC6550.invoke(th, obj, interfaceC4359);
        } catch (Throwable th2) {
            AbstractC5398.m10492(interfaceC4359, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m10547(AbstractC5360 abstractC5360, Throwable th) {
        InterfaceC4359 interfaceC4359 = this.f15095;
        int i = f15093.get(this) & 536870911;
        if (i == 536870911) {
            C5919.m11250("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            abstractC5360.mo10263(i, interfaceC4359);
        } catch (Throwable th2) {
            AbstractC5398.m10492(interfaceC4359, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // kotlinx.coroutines.AbstractC5395
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo10347() {
        return m10535();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m10548(InterfaceC5445 interfaceC5445, Throwable th) {
        try {
            interfaceC5445.mo10411(th);
        } catch (Throwable th2) {
            AbstractC5398.m10492(this.f15095, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }
}
