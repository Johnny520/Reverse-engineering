package kotlinx.coroutines;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.window.area.AbstractC3400;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.collections.C5178;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.InterfaceC5193;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.internal.C6194;
import kotlinx.coroutines.internal.C6195;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p307.AbstractC9322;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6292 implements InterfaceC6284, InterfaceC6289 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ long f15454;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15455;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f15456;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15457 = AtomicReferenceFieldUpdater.newUpdater(C6292.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = AbstractC9322.f23936;
        f15454 = unsafe.objectFieldOffset(C6292.class.getDeclaredField("_state$volatile"));
        f15455 = AtomicReferenceFieldUpdater.newUpdater(C6292.class, Object.class, "_parentHandle$volatile");
        f15456 = unsafe.objectFieldOffset(C6292.class.getDeclaredField("_parentHandle$volatile"));
    }

    public C6292(boolean z) {
        this._state$volatile = z ? AbstractC6231.f15387 : AbstractC6231.f15386;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public static String m11124(Object obj) {
        if (!(obj instanceof C6296)) {
            return obj instanceof InterfaceC6302 ? ((InterfaceC6302) obj).mo11017() ? "Active" : "New" : obj instanceof C6262 ? "Cancelled" : "Completed";
        }
        C6296 c6296 = (C6296) obj;
        return c6296.m11153() ? "Cancelling" : C6296.f15465.get(c6296) == 1 ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static C6272 m11125(C6194 c6194) {
        while (c6194.mo10955()) {
            c6194 = c6194.m10958();
        }
        while (true) {
            c6194 = c6194.m10957();
            if (!c6194.mo10955()) {
                if (c6194 instanceof C6272) {
                    return (C6272) c6194;
                }
                if (c6194 instanceof C6290) {
                    return null;
                }
            }
        }
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final Object fold(Object obj, InterfaceC7383 interfaceC7383) {
        return AbstractC1298.m1727(this, obj, interfaceC7383);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5186 get(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1731(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5186
    public final InterfaceC5193 getKey() {
        return C6285.f15450;
    }

    @Override // kotlinx.coroutines.InterfaceC6284
    public final boolean isCancelled() {
        Object objM11140 = m11140();
        if (objM11140 instanceof C6262) {
            return true;
        }
        return (objM11140 instanceof C6296) && ((C6296) objM11140).m11153();
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 minusKey(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1706(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 plus(InterfaceC5192 interfaceC5192) {
        return AbstractC1298.m1714(interfaceC5192, this);
    }

    @Override // kotlinx.coroutines.InterfaceC6284
    public final boolean start() {
        int iM11133;
        do {
            iM11133 = m11133(m11140());
            if (iM11133 == 0) {
                return false;
            }
        } while (iM11133 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo11071() + '{' + m11124(m11140()) + '}');
        sb.append('@');
        sb.append(AbstractC6231.m11060(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C5178 m11126() {
        return new C5178(new JobSupport$children$1(this, null), 2);
    }

    @Override // kotlinx.coroutines.InterfaceC6284
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final boolean mo11117() {
        return !(m11140() instanceof InterfaceC6302);
    }

    @Override // kotlinx.coroutines.InterfaceC6284
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final InterfaceC6230 mo11118(InterfaceC7387 interfaceC7387) {
        return m11138(true, new C6301(interfaceC7387));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final Object m11127(C6296 c6296, Object obj) throws Throwable {
        C6296 c62962;
        Throwable th;
        Throwable thM11149;
        C6292 c6292;
        C6296 c62963;
        C6262 c6262 = obj instanceof C6262 ? (C6262) obj : null;
        Throwable th2 = c6262 != null ? c6262.f15420 : null;
        synchronized (c6296) {
            try {
                c6296.m11153();
                ArrayList<Throwable> arrayListM11152 = c6296.m11152(th2);
                thM11149 = m11149(c6296, arrayListM11152);
                if (thM11149 != null) {
                    try {
                        if (arrayListM11152.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM11152.size()));
                            for (Throwable th3 : arrayListM11152) {
                                if (th3 != thM11149 && th3 != thM11149 && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    AbstractC6019.m10775(thM11149, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c62962 = c6296;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                c62962 = c6296;
                th = th5;
            }
        }
        if (thM11149 != null && thM11149 != th2) {
            obj = new C6262(thM11149, false);
        }
        if (thM11149 != null && (m11130(thM11149) || mo11077(thM11149))) {
            obj.getClass();
            C6262.f15419.compareAndSet((C6262) obj, 0, 1);
        }
        mo11084(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15457;
        Object c6303 = obj instanceof InterfaceC6302 ? new C6303((InterfaceC6302) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15454;
            c6292 = this;
            c62963 = c6296;
            if (unsafe.compareAndSwapObject(c6292, j, c62963, c6303) || unsafe.getObjectVolatile(c6292, j) != c62963) {
                break;
            }
            this = c6292;
            c6296 = c62963;
        }
        c6292.m11129(c62963, obj);
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final Throwable m11128(Object obj) {
        Throwable thM11154;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C6292 c6292 = (C6292) ((InterfaceC6289) obj);
        Object objM11140 = c6292.m11140();
        if (objM11140 instanceof C6296) {
            thM11154 = ((C6296) objM11140).m11154();
        } else if (objM11140 instanceof C6262) {
            thM11154 = ((C6262) objM11140).f15420;
        } else {
            if (objM11140 instanceof InterfaceC6302) {
                C5043.m9151(objM11140, "Cannot be cancelling child in this state: ");
                return null;
            }
            thM11154 = null;
        }
        CancellationException cancellationException = thM11154 instanceof CancellationException ? (CancellationException) thM11154 : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(m11124(objM11140)), thM11154, c6292) : cancellationException;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public boolean mo10865(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m11131(th) && mo11115();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m11129(InterfaceC6302 interfaceC6302, Object obj) {
        InterfaceC6268 interfaceC6268M11151 = m11151();
        if (interfaceC6268M11151 != null) {
            interfaceC6268M11151.dispose();
            m11143(C6287.f15451);
        }
        CompletionHandlerException completionHandlerException = null;
        C6262 c6262 = obj instanceof C6262 ? (C6262) obj : null;
        Throwable th = c6262 != null ? c6262.f15420 : null;
        if (interfaceC6302 instanceof AbstractC6282) {
            try {
                ((AbstractC6282) interfaceC6302).mo11027(th);
                return;
            } catch (Throwable th2) {
                mo11083(new CompletionHandlerException("Exception in completion handler " + interfaceC6302 + " for " + this, th2));
                return;
            }
        }
        C6290 c6290Mo11018 = interfaceC6302.mo11018();
        if (c6290Mo11018 != null) {
            c6290Mo11018.m10953(new C6195(1), 1);
            Object objM10960 = c6290Mo11018.m10960();
            objM10960.getClass();
            for (C6194 c6194M10957 = (C6194) objM10960; !c6194M10957.equals(c6290Mo11018); c6194M10957 = c6194M10957.m10957()) {
                if (c6194M10957 instanceof AbstractC6282) {
                    try {
                        ((AbstractC6282) c6194M10957).mo11027(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            AbstractC6019.m10775(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c6194M10957 + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                mo11083(completionHandlerException);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public String mo11082() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final boolean m11130(Throwable th) {
        if (mo10945()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC6268 interfaceC6268M11151 = m11151();
        return (interfaceC6268M11151 == null || interfaceC6268M11151 == C6287.f15451) ? z : interfaceC6268M11151.mo11087(th) || z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        return r5;
     */
    @Override // kotlinx.coroutines.InterfaceC6284
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC6268 mo11119(C6292 c6292) {
        C6292 c62922;
        C6272 c6272 = new C6272(c6292);
        c6272.f15448 = this;
        loop0: while (true) {
            Object objM11140 = this.m11140();
            if (objM11140 instanceof C6225) {
                C6225 c6225 = (C6225) objM11140;
                if (c6225.f15369) {
                    while (true) {
                        f15457.getClass();
                        Unsafe unsafe = AbstractC9322.f23936;
                        long j = f15454;
                        c62922 = this;
                        if (unsafe.compareAndSwapObject(c62922, j, objM11140, c6272)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(c62922, j) != objM11140) {
                            break;
                        }
                        this = c62922;
                    }
                } else {
                    c62922 = this;
                    c62922.m11142(c6225);
                }
                this = c62922;
            } else {
                c62922 = this;
                boolean z = objM11140 instanceof InterfaceC6302;
                C6287 c6287 = C6287.f15451;
                if (!z) {
                    Object objM111402 = c62922.m11140();
                    C6262 c6262 = objM111402 instanceof C6262 ? (C6262) objM111402 : null;
                    c6272.mo11027(c6262 != null ? c6262.f15420 : null);
                    return c6287;
                }
                C6290 c6290Mo11018 = ((InterfaceC6302) objM11140).mo11018();
                if (c6290Mo11018 == null) {
                    c62922.m11141((AbstractC6282) objM11140);
                    this = c62922;
                } else if (!c6290Mo11018.m10953(c6272, 7)) {
                    boolean zM10953 = c6290Mo11018.m10953(c6272, 3);
                    Object objM111403 = c62922.m11140();
                    if (objM111403 instanceof C6296) {
                        thM11154 = ((C6296) objM111403).m11154();
                    } else {
                        C6262 c62622 = objM111403 instanceof C6262 ? (C6262) objM111403 : null;
                        if (c62622 != null) {
                            thM11154 = c62622.f15420;
                        }
                    }
                    c6272.mo11027(thM11154);
                    if (zM10953) {
                        break loop0;
                    }
                    return c6287;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public void mo10844(CancellationException cancellationException) {
        m11131(cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[PHI: r0
  0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m11131(Object obj) {
        C5317 c5317;
        Object objM11134 = AbstractC6231.f15380;
        if (mo11116()) {
            do {
                Object objM11140 = m11140();
                if (objM11140 instanceof InterfaceC6302) {
                    if (objM11140 instanceof C6296) {
                        if (C6296.f15465.get((C6296) objM11140) == 1) {
                        }
                    }
                    objM11134 = m11134(objM11140, new C6262(m11128(obj), false));
                }
                objM11134 = AbstractC6231.f15380;
                break;
            } while (objM11134 == AbstractC6231.f15378);
            if (objM11134 != AbstractC6231.f15379) {
                if (objM11134 == AbstractC6231.f15380) {
                    Throwable thM11128 = null;
                    while (true) {
                        Object objM111402 = m11140();
                        if (!(objM111402 instanceof C6296)) {
                            if (!(objM111402 instanceof InterfaceC6302)) {
                                c5317 = AbstractC6231.f15385;
                                break;
                            }
                            if (thM11128 == null) {
                                thM11128 = m11128(obj);
                            }
                            InterfaceC6302 interfaceC6302 = (InterfaceC6302) objM111402;
                            if (!interfaceC6302.mo11017()) {
                                Object objM111342 = m11134(objM111402, new C6262(thM11128, false));
                                if (objM111342 == AbstractC6231.f15380) {
                                    C5043.m9151(objM111402, "Cannot happen in ");
                                    return false;
                                }
                                if (objM111342 != AbstractC6231.f15378) {
                                    objM11134 = objM111342;
                                    break;
                                }
                            } else if (m11137(interfaceC6302, thM11128)) {
                                c5317 = AbstractC6231.f15380;
                                break;
                            }
                        } else {
                            synchronized (objM111402) {
                                if (((C6296) objM111402).m11155() == AbstractC6231.f15384) {
                                    c5317 = AbstractC6231.f15385;
                                } else {
                                    boolean zM11153 = ((C6296) objM111402).m11153();
                                    if (thM11128 == null) {
                                        thM11128 = m11128(obj);
                                    }
                                    ((C6296) objM111402).m11156(thM11128);
                                    Throwable thM11154 = zM11153 ? null : ((C6296) objM111402).m11154();
                                    if (thM11154 != null) {
                                        m11146(((C6296) objM111402).f15467, thM11154);
                                    }
                                    c5317 = AbstractC6231.f15380;
                                }
                            }
                        }
                    }
                }
                if (objM11134 != AbstractC6231.f15380 && objM11134 != AbstractC6231.f15379) {
                    if (objM11134 == AbstractC6231.f15385) {
                        return false;
                    }
                    mo10942(objM11134);
                    return true;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final Object m11132(InterfaceC5189 interfaceC5189) throws Throwable {
        Object objM11140;
        do {
            objM11140 = m11140();
            if (!(objM11140 instanceof InterfaceC6302)) {
                if (objM11140 instanceof C6262) {
                    throw ((C6262) objM11140).f15420;
                }
                return AbstractC6231.m11039(objM11140);
            }
        } while (m11133(objM11140) < 0);
        C6281 c6281 = new C6281(this, AbstractC3400.m5624(interfaceC5189));
        c6281.m11102();
        c6281.m11101(new C6274(AbstractC6231.m11056(this, new C6288(c6281)), 1));
        Object objM11099 = c6281.m11099();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM11099;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public void mo10943(Object obj) {
        mo10942(obj);
    }

    @Override // kotlinx.coroutines.InterfaceC6284
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC6230 mo11120(boolean z, boolean z2, InterfaceC7387 interfaceC7387) {
        return m11138(z2, z ? new C6300(interfaceC7387) : new C6301(interfaceC7387));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final int m11133(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof C6225;
        long j = f15454;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15457;
        if (z) {
            if (((C6225) obj).f15369) {
                return 0;
            }
            C6225 c6225 = AbstractC6231.f15387;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = AbstractC9322.f23936;
                if (unsafe2.compareAndSwapObject(this, f15454, obj, c6225)) {
                    mo10833();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof C6298)) {
            return 0;
        }
        C6290 c6290 = ((C6298) obj).f15470;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = AbstractC9322.f23936;
            if (unsafe.compareAndSwapObject(this, f15454, obj, c6290)) {
                mo10833();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public final Object m11134(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC6302)) {
            return AbstractC6231.f15380;
        }
        if (((obj instanceof C6225) || (obj instanceof AbstractC6282)) && !(obj instanceof C6272) && !(obj2 instanceof C6262)) {
            return m11136((InterfaceC6302) obj, obj2) ? obj2 : AbstractC6231.f15378;
        }
        InterfaceC6302 interfaceC6302 = (InterfaceC6302) obj;
        C6290 c6290M11150 = m11150(interfaceC6302);
        if (c6290M11150 == null) {
            return AbstractC6231.f15378;
        }
        C6296 c6296 = interfaceC6302 instanceof C6296 ? (C6296) interfaceC6302 : null;
        if (c6296 == null) {
            c6296 = new C6296(c6290M11150, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (c6296) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C6296.f15465;
            if (atomicIntegerFieldUpdater.get(c6296) == 1) {
                return AbstractC6231.f15380;
            }
            atomicIntegerFieldUpdater.set(c6296, 1);
            if (c6296 != interfaceC6302) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15457;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC6302, c6296)) {
                    if (atomicReferenceFieldUpdater.get(this) != interfaceC6302) {
                        return AbstractC6231.f15378;
                    }
                }
            }
            boolean zM11153 = c6296.m11153();
            C6262 c6262 = obj2 instanceof C6262 ? (C6262) obj2 : null;
            if (c6262 != null) {
                c6296.m11156(c6262.f15420);
            }
            ?? M11154 = zM11153 ? 0 : c6296.m11154();
            ref$ObjectRef.element = M11154;
            if (M11154 != 0) {
                m11146(c6290M11150, M11154);
            }
            C6272 c6272M11125 = m11125(c6290M11150);
            if (c6272M11125 != null && m11135(c6296, c6272M11125, obj2)) {
                return AbstractC6231.f15379;
            }
            c6290M11150.m10953(new C6195(2), 2);
            C6272 c6272M111252 = m11125(c6290M11150);
            return (c6272M111252 == null || !m11135(c6296, c6272M111252, obj2)) ? m11127(c6296, obj2) : AbstractC6231.f15379;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final boolean m11135(C6296 c6296, C6272 c6272, Object obj) {
        while (c6272.f15431.m11138(false, new C6280(this, c6296, c6272, obj)) == C6287.f15451) {
            c6272 = m11125(c6272);
            if (c6272 == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final boolean m11136(InterfaceC6302 interfaceC6302, Object obj) {
        Object c6303 = obj instanceof InterfaceC6302 ? new C6303((InterfaceC6302) obj) : obj;
        while (true) {
            f15457.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15454;
            C6292 c6292 = this;
            InterfaceC6302 interfaceC63022 = interfaceC6302;
            if (unsafe.compareAndSwapObject(c6292, j, interfaceC63022, c6303)) {
                c6292.mo11084(obj);
                c6292.m11129(interfaceC63022, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(c6292, j) != interfaceC63022) {
                return false;
            }
            this = c6292;
            interfaceC6302 = interfaceC63022;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final boolean m11137(InterfaceC6302 interfaceC6302, Throwable th) {
        C6290 c6290M11150 = m11150(interfaceC6302);
        if (c6290M11150 == null) {
            return false;
        }
        C6296 c6296 = new C6296(c6290M11150, th);
        while (true) {
            f15457.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15454;
            C6292 c6292 = this;
            InterfaceC6302 interfaceC63022 = interfaceC6302;
            if (unsafe.compareAndSwapObject(c6292, j, interfaceC63022, c6296)) {
                c6292.m11146(c6290M11150, th);
                return true;
            }
            if (unsafe.getObjectVolatile(c6292, j) != interfaceC63022) {
                return false;
            }
            this = c6292;
            interfaceC6302 = interfaceC63022;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC6284
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public boolean mo11121() {
        Object objM11140 = m11140();
        return (objM11140 instanceof InterfaceC6302) && ((InterfaceC6302) objM11140).mo11017();
    }

    @Override // kotlinx.coroutines.InterfaceC6284
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final CancellationException mo11122() {
        CancellationException cancellationException;
        Object objM11140 = m11140();
        if (objM11140 instanceof C6296) {
            Throwable thM11154 = ((C6296) objM11140).m11154();
            if (thM11154 == null) {
                C5043.m9151(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thM11154 instanceof CancellationException ? (CancellationException) thM11154 : null;
            return cancellationException == null ? new JobCancellationException(strConcat, thM11154, this) : cancellationException;
        }
        if (objM11140 instanceof InterfaceC6302) {
            C5043.m9151(this, "Job is still new or active: ");
            return null;
        }
        if (!(objM11140 instanceof C6262)) {
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((C6262) objM11140).f15420;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new JobCancellationException(mo11082(), th, this) : cancellationException;
    }

    @Override // kotlinx.coroutines.InterfaceC6284
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo11123(InterfaceC5189 interfaceC5189) {
        Object objM11140;
        C6008 c6008;
        do {
            objM11140 = m11140();
            boolean z = objM11140 instanceof InterfaceC6302;
            c6008 = C6008.f15084;
            if (!z) {
                AbstractC6231.m11061(interfaceC5189.getContext());
                return c6008;
            }
        } while (m11133(objM11140) < 0);
        C6276 c6276 = new C6276(1, AbstractC3400.m5624(interfaceC5189));
        c6276.m11102();
        c6276.m11101(new C6274(AbstractC6231.m11056(this, new C6250(c6276)), 1));
        Object objM11099 = c6276.m11099();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (objM11099 != coroutineSingletons) {
            objM11099 = c6008;
        }
        return objM11099 == coroutineSingletons ? objM11099 : c6008;
    }

    @Override // kotlinx.coroutines.InterfaceC6284, kotlinx.coroutines.channels.InterfaceC6031
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo10815(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo11082(), null, this);
        }
        mo10844(cancellationException);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public boolean mo10945() {
        return this instanceof C6256;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        return r8;
     */
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC6230 m11138(boolean z, AbstractC6282 abstractC6282) {
        C6292 c6292;
        AbstractC6282 abstractC62822;
        boolean zM10953;
        abstractC6282.f15448 = this;
        loop0: while (true) {
            Object objM11140 = this.m11140();
            if (objM11140 instanceof C6225) {
                C6225 c6225 = (C6225) objM11140;
                if (c6225.f15369) {
                    while (true) {
                        f15457.getClass();
                        Unsafe unsafe = AbstractC9322.f23936;
                        long j = f15454;
                        c6292 = this;
                        abstractC62822 = abstractC6282;
                        if (unsafe.compareAndSwapObject(c6292, j, objM11140, abstractC62822)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(c6292, j) != objM11140) {
                            break;
                        }
                        this = c6292;
                        abstractC6282 = abstractC62822;
                    }
                } else {
                    c6292 = this;
                    abstractC62822 = abstractC6282;
                    c6292.m11142(c6225);
                }
                this = c6292;
                abstractC6282 = abstractC62822;
            } else {
                c6292 = this;
                abstractC62822 = abstractC6282;
                boolean z2 = objM11140 instanceof InterfaceC6302;
                C6287 c6287 = C6287.f15451;
                if (z2) {
                    InterfaceC6302 interfaceC6302 = (InterfaceC6302) objM11140;
                    C6290 c6290Mo11018 = interfaceC6302.mo11018();
                    if (c6290Mo11018 == null) {
                        c6292.m11141((AbstractC6282) objM11140);
                    } else {
                        if (abstractC62822.mo11028()) {
                            C6296 c6296 = interfaceC6302 instanceof C6296 ? (C6296) interfaceC6302 : null;
                            Throwable thM11154 = c6296 != null ? c6296.m11154() : null;
                            if (thM11154 == null) {
                                zM10953 = c6290Mo11018.m10953(abstractC62822, 5);
                            } else if (z) {
                                abstractC62822.mo11027(thM11154);
                                return c6287;
                            }
                        } else {
                            zM10953 = c6290Mo11018.m10953(abstractC62822, 1);
                        }
                        if (zM10953) {
                            break;
                        }
                    }
                    this = c6292;
                    abstractC6282 = abstractC62822;
                } else if (z) {
                    Object objM111402 = c6292.m11140();
                    C6262 c6262 = objM111402 instanceof C6262 ? (C6262) objM111402 : null;
                    abstractC62822.mo11027(c6262 != null ? c6262.f15420 : null);
                }
            }
        }
        return abstractC62822;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m11139(InterfaceC6284 interfaceC6284) {
        C6287 c6287 = C6287.f15451;
        if (interfaceC6284 == null) {
            m11143(c6287);
            return;
        }
        interfaceC6284.start();
        InterfaceC6268 interfaceC6268Mo11119 = interfaceC6284.mo11119(this);
        m11143(interfaceC6268Mo11119);
        if (mo11117()) {
            interfaceC6268Mo11119.dispose();
            m11143(c6287);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public boolean mo11077(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final Object m11140() {
        f15457.getClass();
        return AbstractC9322.f23936.getObjectVolatile(this, f15454);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void m11141(AbstractC6282 abstractC6282) {
        abstractC6282.m10951(new C6290());
        C6194 c6194M10957 = abstractC6282.m10957();
        while (true) {
            f15457.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15454;
            C6292 c6292 = this;
            AbstractC6282 abstractC62822 = abstractC6282;
            if (unsafe.compareAndSwapObject(c6292, j, abstractC62822, c6194M10957) || unsafe.getObjectVolatile(c6292, j) != abstractC62822) {
                return;
            }
            this = c6292;
            abstractC6282 = abstractC62822;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void m11142(C6225 c6225) {
        C6290 c6290 = new C6290();
        Object c6298 = c6225.f15369 ? c6290 : new C6298(c6290);
        while (true) {
            f15457.getClass();
            Unsafe unsafe = AbstractC9322.f23936;
            long j = f15454;
            C6292 c6292 = this;
            C6225 c62252 = c6225;
            if (unsafe.compareAndSwapObject(c6292, j, c62252, c6298) || unsafe.getObjectVolatile(c6292, j) != c62252) {
                return;
            }
            this = c6292;
            c6225 = c62252;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final void m11143(InterfaceC6268 interfaceC6268) {
        f15455.getClass();
        AbstractC9322.f23936.putObjectVolatile(this, f15456, interfaceC6268);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final void m11144(AbstractC6282 abstractC6282) {
        C6292 c6292;
        while (true) {
            Object objM11140 = this.m11140();
            if (!(objM11140 instanceof AbstractC6282)) {
                if (!(objM11140 instanceof InterfaceC6302) || ((InterfaceC6302) objM11140).mo11018() == null) {
                    return;
                }
                abstractC6282.m10954();
                return;
            }
            if (objM11140 != abstractC6282) {
                return;
            }
            C6225 c6225 = AbstractC6231.f15387;
            while (true) {
                f15457.getClass();
                Unsafe unsafe = AbstractC9322.f23936;
                long j = f15454;
                c6292 = this;
                if (unsafe.compareAndSwapObject(c6292, j, objM11140, c6225)) {
                    return;
                }
                if (unsafe.getObjectVolatile(c6292, j) != objM11140) {
                    break;
                } else {
                    this = c6292;
                }
            }
            this = c6292;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public String mo11071() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final void m11146(C6290 c6290, Throwable th) {
        c6290.m10953(new C6195(4), 4);
        Object objM10960 = c6290.m10960();
        objM10960.getClass();
        CompletionHandlerException completionHandlerException = null;
        for (C6194 c6194M10957 = (C6194) objM10960; !c6194M10957.equals(c6290); c6194M10957 = c6194M10957.m10957()) {
            if ((c6194M10957 instanceof AbstractC6282) && ((AbstractC6282) c6194M10957).mo11028()) {
                try {
                    ((AbstractC6282) c6194M10957).mo11027(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        AbstractC6019.m10775(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c6194M10957 + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo11083(completionHandlerException);
        }
        m11130(th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final boolean m11147(Object obj) {
        Object objM11134;
        do {
            objM11134 = m11134(m11140(), obj);
            if (objM11134 == AbstractC6231.f15380) {
                return false;
            }
            if (objM11134 == AbstractC6231.f15379) {
                return true;
            }
        } while (objM11134 == AbstractC6231.f15378);
        mo10942(objM11134);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final Object m11148(Object obj) {
        Object objM11134;
        do {
            objM11134 = m11134(m11140(), obj);
            if (objM11134 == AbstractC6231.f15380) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C6262 c6262 = obj instanceof C6262 ? (C6262) obj : null;
                throw new IllegalStateException(str, c6262 != null ? c6262.f15420 : null);
            }
        } while (objM11134 == AbstractC6231.f15378);
        return objM11134;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public boolean mo11115() {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final Throwable m11149(C6296 c6296, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (c6296.m11153()) {
                return new JobCancellationException(mo11082(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final C6290 m11150(InterfaceC6302 interfaceC6302) {
        C6290 c6290Mo11018 = interfaceC6302.mo11018();
        if (c6290Mo11018 != null) {
            return c6290Mo11018;
        }
        if (interfaceC6302 instanceof C6225) {
            return new C6290();
        }
        if (interfaceC6302 instanceof AbstractC6282) {
            m11141((AbstractC6282) interfaceC6302);
            return null;
        }
        C5043.m9151(interfaceC6302, "State should have list: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final InterfaceC6268 m11151() {
        f15455.getClass();
        return (InterfaceC6268) AbstractC9322.f23936.getObjectVolatile(this, f15456);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public boolean mo11116() {
        return this instanceof C6270;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public void mo10833() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public void mo10942(Object obj) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public void mo11083(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public void mo11084(Object obj) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public void m11145(Throwable th) {
    }
}
