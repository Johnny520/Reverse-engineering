package kotlinx.coroutines;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.window.area.AbstractC2567;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC5187;
import kotlin.C5176;
import kotlin.collections.C4346;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.InterfaceC4361;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.internal.C5362;
import kotlinx.coroutines.internal.C5363;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p291.AbstractC8493;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5460 implements InterfaceC5452, InterfaceC5457 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ long f15109;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15110;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f15111;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15112 = AtomicReferenceFieldUpdater.newUpdater(C5460.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = AbstractC8493.f23591;
        f15109 = unsafe.objectFieldOffset(C5460.class.getDeclaredField("_state$volatile"));
        f15110 = AtomicReferenceFieldUpdater.newUpdater(C5460.class, Object.class, "_parentHandle$volatile");
        f15111 = unsafe.objectFieldOffset(C5460.class.getDeclaredField("_parentHandle$volatile"));
    }

    public C5460(boolean z) {
        this._state$volatile = z ? AbstractC5399.f15042 : AbstractC5399.f15041;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public static String m10565(Object obj) {
        if (!(obj instanceof C5464)) {
            return obj instanceof InterfaceC5470 ? ((InterfaceC5470) obj).mo10458() ? "Active" : "New" : obj instanceof C5430 ? "Cancelled" : "Completed";
        }
        C5464 c5464 = (C5464) obj;
        return c5464.m10594() ? "Cancelling" : C5464.f15120.get(c5464) == 1 ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static C5440 m10566(C5362 c5362) {
        while (c5362.mo10396()) {
            c5362 = c5362.m10399();
        }
        while (true) {
            c5362 = c5362.m10398();
            if (!c5362.mo10396()) {
                if (c5362 instanceof C5440) {
                    return (C5440) c5362;
                }
                if (c5362 instanceof C5458) {
                    return null;
                }
            }
        }
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final Object fold(Object obj, InterfaceC6554 interfaceC6554) {
        return AbstractC0455.m1167(this, obj, interfaceC6554);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4354 get(InterfaceC4361 interfaceC4361) {
        return AbstractC0455.m1171(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4354
    public final InterfaceC4361 getKey() {
        return C5453.f15105;
    }

    @Override // kotlinx.coroutines.InterfaceC5452
    public final boolean isCancelled() {
        Object objM10581 = m10581();
        if (objM10581 instanceof C5430) {
            return true;
        }
        return (objM10581 instanceof C5464) && ((C5464) objM10581).m10594();
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4360 minusKey(InterfaceC4361 interfaceC4361) {
        return AbstractC0455.m1146(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4360 plus(InterfaceC4360 interfaceC4360) {
        return AbstractC0455.m1154(interfaceC4360, this);
    }

    @Override // kotlinx.coroutines.InterfaceC5452
    public final boolean start() {
        int iM10574;
        do {
            iM10574 = m10574(m10581());
            if (iM10574 == 0) {
                return false;
            }
        } while (iM10574 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo10512() + '{' + m10565(m10581()) + '}');
        sb.append('@');
        sb.append(AbstractC5399.m10501(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C4346 m10567() {
        return new C4346(new JobSupport$children$1(this, null), 2);
    }

    @Override // kotlinx.coroutines.InterfaceC5452
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final boolean mo10558() {
        return !(m10581() instanceof InterfaceC5470);
    }

    @Override // kotlinx.coroutines.InterfaceC5452
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final InterfaceC5398 mo10559(InterfaceC6558 interfaceC6558) {
        return m10579(true, new C5469(interfaceC6558));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final Object m10568(C5464 c5464, Object obj) throws Throwable {
        C5464 c54642;
        Throwable th;
        Throwable thM10590;
        C5460 c5460;
        C5464 c54643;
        C5430 c5430 = obj instanceof C5430 ? (C5430) obj : null;
        Throwable th2 = c5430 != null ? c5430.f15075 : null;
        synchronized (c5464) {
            try {
                c5464.m10594();
                ArrayList<Throwable> arrayListM10593 = c5464.m10593(th2);
                thM10590 = m10590(c5464, arrayListM10593);
                if (thM10590 != null) {
                    try {
                        if (arrayListM10593.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM10593.size()));
                            for (Throwable th3 : arrayListM10593) {
                                if (th3 != thM10590 && th3 != thM10590 && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    AbstractC5187.m10216(thM10590, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c54642 = c5464;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                c54642 = c5464;
                th = th5;
            }
        }
        if (thM10590 != null && thM10590 != th2) {
            obj = new C5430(thM10590, false);
        }
        if (thM10590 != null && (m10571(thM10590) || mo10518(thM10590))) {
            obj.getClass();
            C5430.f15074.compareAndSet((C5430) obj, 0, 1);
        }
        mo10525(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15112;
        Object c5471 = obj instanceof InterfaceC5470 ? new C5471((InterfaceC5470) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f15109;
            c5460 = this;
            c54643 = c5464;
            if (unsafe.compareAndSwapObject(c5460, j, c54643, c5471) || unsafe.getObjectVolatile(c5460, j) != c54643) {
                break;
            }
            this = c5460;
            c5464 = c54643;
        }
        c5460.m10570(c54643, obj);
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final Throwable m10569(Object obj) {
        Throwable thM10595;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C5460 c5460 = (C5460) ((InterfaceC5457) obj);
        Object objM10581 = c5460.m10581();
        if (objM10581 instanceof C5464) {
            thM10595 = ((C5464) objM10581).m10595();
        } else if (objM10581 instanceof C5430) {
            thM10595 = ((C5430) objM10581).f15075;
        } else {
            if (objM10581 instanceof InterfaceC5470) {
                C4211.m8592(objM10581, "Cannot be cancelling child in this state: ");
                return null;
            }
            thM10595 = null;
        }
        CancellationException cancellationException = thM10595 instanceof CancellationException ? (CancellationException) thM10595 : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(m10565(objM10581)), thM10595, c5460) : cancellationException;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public boolean mo10306(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m10572(th) && mo10556();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m10570(InterfaceC5470 interfaceC5470, Object obj) {
        InterfaceC5436 interfaceC5436M10592 = m10592();
        if (interfaceC5436M10592 != null) {
            interfaceC5436M10592.dispose();
            m10584(C5455.f15106);
        }
        CompletionHandlerException completionHandlerException = null;
        C5430 c5430 = obj instanceof C5430 ? (C5430) obj : null;
        Throwable th = c5430 != null ? c5430.f15075 : null;
        if (interfaceC5470 instanceof AbstractC5450) {
            try {
                ((AbstractC5450) interfaceC5470).mo10468(th);
                return;
            } catch (Throwable th2) {
                mo10524(new CompletionHandlerException("Exception in completion handler " + interfaceC5470 + " for " + this, th2));
                return;
            }
        }
        C5458 c5458Mo10459 = interfaceC5470.mo10459();
        if (c5458Mo10459 != null) {
            c5458Mo10459.m10394(new C5363(1), 1);
            Object objM10401 = c5458Mo10459.m10401();
            objM10401.getClass();
            for (C5362 c5362M10398 = (C5362) objM10401; !c5362M10398.equals(c5458Mo10459); c5362M10398 = c5362M10398.m10398()) {
                if (c5362M10398 instanceof AbstractC5450) {
                    try {
                        ((AbstractC5450) c5362M10398).mo10468(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            AbstractC5187.m10216(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c5362M10398 + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                mo10524(completionHandlerException);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public String mo10523() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final boolean m10571(Throwable th) {
        if (mo10386()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC5436 interfaceC5436M10592 = m10592();
        return (interfaceC5436M10592 == null || interfaceC5436M10592 == C5455.f15106) ? z : interfaceC5436M10592.mo10528(th) || z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        return r5;
     */
    @Override // kotlinx.coroutines.InterfaceC5452
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.InterfaceC5436 mo10560(kotlinx.coroutines.C5460 r7) {
        /*
            r6 = this;
            kotlinx.coroutines.飘花落叶言子楪哲苏世兰 r5 = new kotlinx.coroutines.飘花落叶言子楪哲苏世兰
            r5.<init>(r7)
            r5.f15103 = r6
        L7:
            java.lang.Object r4 = r6.m10581()
            boolean r7 = r4 instanceof kotlinx.coroutines.C5393
            if (r7 == 0) goto L35
            r7 = r4
            kotlinx.coroutines.飘花落叶言子世哲兰楪苏 r7 = (kotlinx.coroutines.C5393) r7
            boolean r0 = r7.f15024
            if (r0 == 0) goto L30
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.C5460.f15112
            r7.getClass()
            sun.misc.Unsafe r0 = p291.AbstractC8493.f23591
            long r2 = kotlinx.coroutines.C5460.f15109
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L27
            goto L7a
        L27:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L2e
            goto L4b
        L2e:
            r6 = r1
            goto L16
        L30:
            r1 = r6
            r1.m10583(r7)
            goto L4b
        L35:
            r1 = r6
            boolean r6 = r4 instanceof kotlinx.coroutines.InterfaceC5470
            kotlinx.coroutines.飘花落叶言子苏兰世楪哲 r7 = kotlinx.coroutines.C5455.f15106
            r0 = 0
            if (r6 == 0) goto L7c
            r6 = r4
            kotlinx.coroutines.飘花落叶言子苏楪哲世兰 r6 = (kotlinx.coroutines.InterfaceC5470) r6
            kotlinx.coroutines.飘花落叶言子苏兰楪世哲 r6 = r6.mo10459()
            if (r6 != 0) goto L4d
            kotlinx.coroutines.飘花落叶言子苏世哲兰楪 r4 = (kotlinx.coroutines.AbstractC5450) r4
            r1.m10582(r4)
        L4b:
            r6 = r1
            goto L7
        L4d:
            r2 = 7
            boolean r2 = r6.m10394(r5, r2)
            if (r2 == 0) goto L55
            goto L7a
        L55:
            r2 = 3
            boolean r6 = r6.m10394(r5, r2)
            java.lang.Object r1 = r1.m10581()
            boolean r2 = r1 instanceof kotlinx.coroutines.C5464
            if (r2 == 0) goto L69
            kotlinx.coroutines.飘花落叶言子苏哲楪世兰 r1 = (kotlinx.coroutines.C5464) r1
            java.lang.Throwable r0 = r1.m10595()
            goto L75
        L69:
            boolean r2 = r1 instanceof kotlinx.coroutines.C5430
            if (r2 == 0) goto L70
            kotlinx.coroutines.飘花落叶言子楪兰世哲苏 r1 = (kotlinx.coroutines.C5430) r1
            goto L71
        L70:
            r1 = r0
        L71:
            if (r1 == 0) goto L75
            java.lang.Throwable r0 = r1.f15075
        L75:
            r5.mo10468(r0)
            if (r6 == 0) goto L7b
        L7a:
            return r5
        L7b:
            return r7
        L7c:
            java.lang.Object r6 = r1.m10581()
            boolean r1 = r6 instanceof kotlinx.coroutines.C5430
            if (r1 == 0) goto L87
            kotlinx.coroutines.飘花落叶言子楪兰世哲苏 r6 = (kotlinx.coroutines.C5430) r6
            goto L88
        L87:
            r6 = r0
        L88:
            if (r6 == 0) goto L8c
            java.lang.Throwable r0 = r6.f15075
        L8c:
            r5.mo10468(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C5460.mo10560(kotlinx.coroutines.飘花落叶言子苏哲世兰楪):kotlinx.coroutines.飘花落叶言子楪哲世兰苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public void mo10285(CancellationException cancellationException) {
        m10572(cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[PHI: r0
  0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m10572(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C5460.m10572(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final Object m10573(InterfaceC4357 interfaceC4357) throws Throwable {
        Object objM10581;
        do {
            objM10581 = m10581();
            if (!(objM10581 instanceof InterfaceC5470)) {
                if (objM10581 instanceof C5430) {
                    throw ((C5430) objM10581).f15075;
                }
                return AbstractC5399.m10480(objM10581);
            }
        } while (m10574(objM10581) < 0);
        C5449 c5449 = new C5449(this, AbstractC2567.m5064(interfaceC4357));
        c5449.m10543();
        c5449.m10542(new C5442(AbstractC5399.m10497(this, new C5456(c5449)), 1));
        Object objM10540 = c5449.m10540();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM10540;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public void mo10384(Object obj) {
        mo10383(obj);
    }

    @Override // kotlinx.coroutines.InterfaceC5452
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final InterfaceC5398 mo10561(boolean z, boolean z2, InterfaceC6558 interfaceC6558) {
        return m10579(z2, z ? new C5468(interfaceC6558) : new C5469(interfaceC6558));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final int m10574(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof C5393;
        long j = f15109;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15112;
        if (z) {
            if (((C5393) obj).f15024) {
                return 0;
            }
            C5393 c5393 = AbstractC5399.f15042;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = AbstractC8493.f23591;
                if (unsafe2.compareAndSwapObject(this, f15109, obj, c5393)) {
                    mo10274();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof C5466)) {
            return 0;
        }
        C5458 c5458 = ((C5466) obj).f15125;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = AbstractC8493.f23591;
            if (unsafe.compareAndSwapObject(this, f15109, obj, c5458)) {
                mo10274();
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
    public final Object m10575(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC5470)) {
            return AbstractC5399.f15035;
        }
        if (((obj instanceof C5393) || (obj instanceof AbstractC5450)) && !(obj instanceof C5440) && !(obj2 instanceof C5430)) {
            return m10577((InterfaceC5470) obj, obj2) ? obj2 : AbstractC5399.f15033;
        }
        InterfaceC5470 interfaceC5470 = (InterfaceC5470) obj;
        C5458 c5458M10591 = m10591(interfaceC5470);
        if (c5458M10591 == null) {
            return AbstractC5399.f15033;
        }
        C5464 c5464 = interfaceC5470 instanceof C5464 ? (C5464) interfaceC5470 : null;
        if (c5464 == null) {
            c5464 = new C5464(c5458M10591, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (c5464) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C5464.f15120;
            if (atomicIntegerFieldUpdater.get(c5464) == 1) {
                return AbstractC5399.f15035;
            }
            atomicIntegerFieldUpdater.set(c5464, 1);
            if (c5464 != interfaceC5470) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15112;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC5470, c5464)) {
                    if (atomicReferenceFieldUpdater.get(this) != interfaceC5470) {
                        return AbstractC5399.f15033;
                    }
                }
            }
            boolean zM10594 = c5464.m10594();
            C5430 c5430 = obj2 instanceof C5430 ? (C5430) obj2 : null;
            if (c5430 != null) {
                c5464.m10597(c5430.f15075);
            }
            ?? M10595 = zM10594 ? 0 : c5464.m10595();
            ref$ObjectRef.element = M10595;
            if (M10595 != 0) {
                m10587(c5458M10591, M10595);
            }
            C5440 c5440M10566 = m10566(c5458M10591);
            if (c5440M10566 != null && m10576(c5464, c5440M10566, obj2)) {
                return AbstractC5399.f15034;
            }
            c5458M10591.m10394(new C5363(2), 2);
            C5440 c5440M105662 = m10566(c5458M10591);
            return (c5440M105662 == null || !m10576(c5464, c5440M105662, obj2)) ? m10568(c5464, obj2) : AbstractC5399.f15034;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final boolean m10576(C5464 c5464, C5440 c5440, Object obj) {
        while (c5440.f15086.m10579(false, new C5448(this, c5464, c5440, obj)) == C5455.f15106) {
            c5440 = m10566(c5440);
            if (c5440 == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final boolean m10577(InterfaceC5470 interfaceC5470, Object obj) {
        Object c5471 = obj instanceof InterfaceC5470 ? new C5471((InterfaceC5470) obj) : obj;
        while (true) {
            f15112.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f15109;
            C5460 c5460 = this;
            InterfaceC5470 interfaceC54702 = interfaceC5470;
            if (unsafe.compareAndSwapObject(c5460, j, interfaceC54702, c5471)) {
                c5460.mo10525(obj);
                c5460.m10570(interfaceC54702, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(c5460, j) != interfaceC54702) {
                return false;
            }
            this = c5460;
            interfaceC5470 = interfaceC54702;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final boolean m10578(InterfaceC5470 interfaceC5470, Throwable th) {
        C5458 c5458M10591 = m10591(interfaceC5470);
        if (c5458M10591 == null) {
            return false;
        }
        C5464 c5464 = new C5464(c5458M10591, th);
        while (true) {
            f15112.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f15109;
            C5460 c5460 = this;
            InterfaceC5470 interfaceC54702 = interfaceC5470;
            if (unsafe.compareAndSwapObject(c5460, j, interfaceC54702, c5464)) {
                c5460.m10587(c5458M10591, th);
                return true;
            }
            if (unsafe.getObjectVolatile(c5460, j) != interfaceC54702) {
                return false;
            }
            this = c5460;
            interfaceC5470 = interfaceC54702;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5452
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public boolean mo10562() {
        Object objM10581 = m10581();
        return (objM10581 instanceof InterfaceC5470) && ((InterfaceC5470) objM10581).mo10458();
    }

    @Override // kotlinx.coroutines.InterfaceC5452
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final CancellationException mo10563() {
        CancellationException cancellationException;
        Object objM10581 = m10581();
        if (objM10581 instanceof C5464) {
            Throwable thM10595 = ((C5464) objM10581).m10595();
            if (thM10595 == null) {
                C4211.m8592(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thM10595 instanceof CancellationException ? (CancellationException) thM10595 : null;
            return cancellationException == null ? new JobCancellationException(strConcat, thM10595, this) : cancellationException;
        }
        if (objM10581 instanceof InterfaceC5470) {
            C4211.m8592(this, "Job is still new or active: ");
            return null;
        }
        if (!(objM10581 instanceof C5430)) {
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((C5430) objM10581).f15075;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new JobCancellationException(mo10523(), th, this) : cancellationException;
    }

    @Override // kotlinx.coroutines.InterfaceC5452
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final Object mo10564(InterfaceC4357 interfaceC4357) {
        Object objM10581;
        C5176 c5176;
        do {
            objM10581 = m10581();
            boolean z = objM10581 instanceof InterfaceC5470;
            c5176 = C5176.f14739;
            if (!z) {
                AbstractC5399.m10502(interfaceC4357.getContext());
                return c5176;
            }
        } while (m10574(objM10581) < 0);
        C5444 c5444 = new C5444(1, AbstractC2567.m5064(interfaceC4357));
        c5444.m10543();
        c5444.m10542(new C5442(AbstractC5399.m10497(this, new C5418(c5444)), 1));
        Object objM10540 = c5444.m10540();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (objM10540 != coroutineSingletons) {
            objM10540 = c5176;
        }
        return objM10540 == coroutineSingletons ? objM10540 : c5176;
    }

    @Override // kotlinx.coroutines.InterfaceC5452, kotlinx.coroutines.channels.InterfaceC5199
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo10256(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo10523(), null, this);
        }
        mo10285(cancellationException);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public boolean mo10386() {
        return this instanceof C5424;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        return r8;
     */
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.InterfaceC5398 m10579(boolean r7, kotlinx.coroutines.AbstractC5450 r8) {
        /*
            r6 = this;
            r8.f15103 = r6
        L2:
            java.lang.Object r4 = r6.m10581()
            boolean r0 = r4 instanceof kotlinx.coroutines.C5393
            if (r0 == 0) goto L33
            r0 = r4
            kotlinx.coroutines.飘花落叶言子世哲兰楪苏 r0 = (kotlinx.coroutines.C5393) r0
            boolean r1 = r0.f15024
            if (r1 == 0) goto L2d
        L11:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.C5460.f15112
            r0.getClass()
            sun.misc.Unsafe r0 = p291.AbstractC8493.f23591
            long r2 = kotlinx.coroutines.C5460.f15109
            r1 = r6
            r5 = r8
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L23
            goto L74
        L23:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L2a
            goto L75
        L2a:
            r6 = r1
            r8 = r5
            goto L11
        L2d:
            r1 = r6
            r5 = r8
            r1.m10583(r0)
            goto L75
        L33:
            r1 = r6
            r5 = r8
            boolean r6 = r4 instanceof kotlinx.coroutines.InterfaceC5470
            kotlinx.coroutines.飘花落叶言子苏兰世楪哲 r8 = kotlinx.coroutines.C5455.f15106
            r0 = 0
            if (r6 == 0) goto L78
            r6 = r4
            kotlinx.coroutines.飘花落叶言子苏楪哲世兰 r6 = (kotlinx.coroutines.InterfaceC5470) r6
            kotlinx.coroutines.飘花落叶言子苏兰楪世哲 r2 = r6.mo10459()
            if (r2 != 0) goto L4b
            kotlinx.coroutines.飘花落叶言子苏世哲兰楪 r4 = (kotlinx.coroutines.AbstractC5450) r4
            r1.m10582(r4)
            goto L75
        L4b:
            boolean r3 = r5.mo10469()
            if (r3 == 0) goto L6d
            boolean r3 = r6 instanceof kotlinx.coroutines.C5464
            if (r3 == 0) goto L58
            kotlinx.coroutines.飘花落叶言子苏哲楪世兰 r6 = (kotlinx.coroutines.C5464) r6
            goto L59
        L58:
            r6 = r0
        L59:
            if (r6 == 0) goto L5f
            java.lang.Throwable r0 = r6.m10595()
        L5f:
            if (r0 != 0) goto L67
            r6 = 5
            boolean r6 = r2.m10394(r5, r6)
            goto L72
        L67:
            if (r7 == 0) goto L8d
            r5.mo10468(r0)
            return r8
        L6d:
            r6 = 1
            boolean r6 = r2.m10394(r5, r6)
        L72:
            if (r6 == 0) goto L75
        L74:
            return r5
        L75:
            r6 = r1
            r8 = r5
            goto L2
        L78:
            if (r7 == 0) goto L8d
            java.lang.Object r6 = r1.m10581()
            boolean r7 = r6 instanceof kotlinx.coroutines.C5430
            if (r7 == 0) goto L85
            kotlinx.coroutines.飘花落叶言子楪兰世哲苏 r6 = (kotlinx.coroutines.C5430) r6
            goto L86
        L85:
            r6 = r0
        L86:
            if (r6 == 0) goto L8a
            java.lang.Throwable r0 = r6.f15075
        L8a:
            r5.mo10468(r0)
        L8d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C5460.m10579(boolean, kotlinx.coroutines.飘花落叶言子苏世哲兰楪):kotlinx.coroutines.飘花落叶言子世哲苏楪兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m10580(InterfaceC5452 interfaceC5452) {
        C5455 c5455 = C5455.f15106;
        if (interfaceC5452 == null) {
            m10584(c5455);
            return;
        }
        interfaceC5452.start();
        InterfaceC5436 interfaceC5436Mo10560 = interfaceC5452.mo10560(this);
        m10584(interfaceC5436Mo10560);
        if (mo10558()) {
            interfaceC5436Mo10560.dispose();
            m10584(c5455);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public boolean mo10518(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final Object m10581() {
        f15112.getClass();
        return AbstractC8493.f23591.getObjectVolatile(this, f15109);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void m10582(AbstractC5450 abstractC5450) {
        abstractC5450.m10392(new C5458());
        C5362 c5362M10398 = abstractC5450.m10398();
        while (true) {
            f15112.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f15109;
            C5460 c5460 = this;
            AbstractC5450 abstractC54502 = abstractC5450;
            if (unsafe.compareAndSwapObject(c5460, j, abstractC54502, c5362M10398) || unsafe.getObjectVolatile(c5460, j) != abstractC54502) {
                return;
            }
            this = c5460;
            abstractC5450 = abstractC54502;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void m10583(C5393 c5393) {
        C5458 c5458 = new C5458();
        Object c5466 = c5393.f15024 ? c5458 : new C5466(c5458);
        while (true) {
            f15112.getClass();
            Unsafe unsafe = AbstractC8493.f23591;
            long j = f15109;
            C5460 c5460 = this;
            C5393 c53932 = c5393;
            if (unsafe.compareAndSwapObject(c5460, j, c53932, c5466) || unsafe.getObjectVolatile(c5460, j) != c53932) {
                return;
            }
            this = c5460;
            c5393 = c53932;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final void m10584(InterfaceC5436 interfaceC5436) {
        f15110.getClass();
        AbstractC8493.f23591.putObjectVolatile(this, f15111, interfaceC5436);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final void m10585(AbstractC5450 abstractC5450) {
        C5460 c5460;
        while (true) {
            Object objM10581 = this.m10581();
            if (!(objM10581 instanceof AbstractC5450)) {
                if (!(objM10581 instanceof InterfaceC5470) || ((InterfaceC5470) objM10581).mo10459() == null) {
                    return;
                }
                abstractC5450.m10395();
                return;
            }
            if (objM10581 != abstractC5450) {
                return;
            }
            C5393 c5393 = AbstractC5399.f15042;
            while (true) {
                f15112.getClass();
                Unsafe unsafe = AbstractC8493.f23591;
                long j = f15109;
                c5460 = this;
                if (unsafe.compareAndSwapObject(c5460, j, objM10581, c5393)) {
                    return;
                }
                if (unsafe.getObjectVolatile(c5460, j) != objM10581) {
                    break;
                } else {
                    this = c5460;
                }
            }
            this = c5460;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public String mo10512() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final void m10587(C5458 c5458, Throwable th) {
        c5458.m10394(new C5363(4), 4);
        Object objM10401 = c5458.m10401();
        objM10401.getClass();
        CompletionHandlerException completionHandlerException = null;
        for (C5362 c5362M10398 = (C5362) objM10401; !c5362M10398.equals(c5458); c5362M10398 = c5362M10398.m10398()) {
            if ((c5362M10398 instanceof AbstractC5450) && ((AbstractC5450) c5362M10398).mo10469()) {
                try {
                    ((AbstractC5450) c5362M10398).mo10468(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        AbstractC5187.m10216(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c5362M10398 + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo10524(completionHandlerException);
        }
        m10571(th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final boolean m10588(Object obj) {
        Object objM10575;
        do {
            objM10575 = m10575(m10581(), obj);
            if (objM10575 == AbstractC5399.f15035) {
                return false;
            }
            if (objM10575 == AbstractC5399.f15034) {
                return true;
            }
        } while (objM10575 == AbstractC5399.f15033);
        mo10383(objM10575);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final Object m10589(Object obj) {
        Object objM10575;
        do {
            objM10575 = m10575(m10581(), obj);
            if (objM10575 == AbstractC5399.f15035) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C5430 c5430 = obj instanceof C5430 ? (C5430) obj : null;
                throw new IllegalStateException(str, c5430 != null ? c5430.f15075 : null);
            }
        } while (objM10575 == AbstractC5399.f15033);
        return objM10575;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public boolean mo10556() {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final Throwable m10590(C5464 c5464, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (c5464.m10594()) {
                return new JobCancellationException(mo10523(), null, this);
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
    public final C5458 m10591(InterfaceC5470 interfaceC5470) {
        C5458 c5458Mo10459 = interfaceC5470.mo10459();
        if (c5458Mo10459 != null) {
            return c5458Mo10459;
        }
        if (interfaceC5470 instanceof C5393) {
            return new C5458();
        }
        if (interfaceC5470 instanceof AbstractC5450) {
            m10582((AbstractC5450) interfaceC5470);
            return null;
        }
        C4211.m8592(interfaceC5470, "State should have list: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final InterfaceC5436 m10592() {
        f15110.getClass();
        return (InterfaceC5436) AbstractC8493.f23591.getObjectVolatile(this, f15111);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public boolean mo10557() {
        return this instanceof C5438;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public void mo10274() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public void mo10383(Object obj) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public void mo10524(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public void mo10525(Object obj) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public void m10586(Throwable th) {
    }
}
