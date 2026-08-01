package kotlinx.coroutines;

import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3055;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.AbstractC5186;
import kotlin.C5175;
import kotlin.collections.C4345;
import kotlin.coroutines.InterfaceC4353;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.internal.C5361;
import kotlinx.coroutines.internal.C5362;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p291.AbstractC8501;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5459 implements InterfaceC5451, InterfaceC5456 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ long f15109;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15110;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ long f15111;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15112 = AtomicReferenceFieldUpdater.newUpdater(C5459.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = AbstractC8501.f23600;
        f15109 = unsafe.objectFieldOffset(C5459.class.getDeclaredField("_state$volatile"));
        f15110 = AtomicReferenceFieldUpdater.newUpdater(C5459.class, Object.class, "_parentHandle$volatile");
        f15111 = unsafe.objectFieldOffset(C5459.class.getDeclaredField("_parentHandle$volatile"));
    }

    public C5459(boolean z) {
        this._state$volatile = z ? AbstractC5398.f15042 : AbstractC5398.f15041;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public static String m10561(Object obj) {
        if (!(obj instanceof C5463)) {
            return obj instanceof InterfaceC5469 ? ((InterfaceC5469) obj).mo10454() ? "Active" : "New" : obj instanceof C5429 ? "Cancelled" : "Completed";
        }
        C5463 c5463 = (C5463) obj;
        return c5463.m10590() ? "Cancelling" : C5463.f15120.get(c5463) == 1 ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static C5439 m10562(C5361 c5361) {
        while (c5361.mo10392()) {
            c5361 = c5361.m10395();
        }
        while (true) {
            c5361 = c5361.m10394();
            if (!c5361.mo10392()) {
                if (c5361 instanceof C5439) {
                    return (C5439) c5361;
                }
                if (c5361 instanceof C5457) {
                    return null;
                }
            }
        }
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final Object fold(Object obj, InterfaceC6553 interfaceC6553) {
        return AbstractC3055.m6648(this, obj, interfaceC6553);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4353 get(InterfaceC4360 interfaceC4360) {
        return AbstractC3055.m6640(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4353
    public final InterfaceC4360 getKey() {
        return C5452.f15105;
    }

    @Override // kotlinx.coroutines.InterfaceC5451
    public final boolean isCancelled() {
        Object objM10578 = m10578();
        if (objM10578 instanceof C5429) {
            return true;
        }
        return (objM10578 instanceof C5463) && ((C5463) objM10578).m10590();
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4359 minusKey(InterfaceC4360 interfaceC4360) {
        return AbstractC3055.m6637(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4359 plus(InterfaceC4359 interfaceC4359) {
        return AbstractC3055.m6636(interfaceC4359, this);
    }

    @Override // kotlinx.coroutines.InterfaceC5451
    public final boolean start() {
        int iM10571;
        do {
            iM10571 = m10571(m10578());
            if (iM10571 == 0) {
                return false;
            }
        } while (iM10571 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo10508() + '{' + m10561(m10578()) + '}');
        sb.append('@');
        sb.append(AbstractC5398.m10497(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C4345 m10563() {
        return new C4345(new JobSupport$children$1(this, null), 2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final Throwable m10564(C5463 c5463, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (c5463.m10590()) {
                return new JobCancellationException(mo10519(), null, this);
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

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final Throwable m10565(Object obj) {
        Throwable thM10591;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C5459 c5459 = (C5459) ((InterfaceC5456) obj);
        Object objM10578 = c5459.m10578();
        if (objM10578 instanceof C5463) {
            thM10591 = ((C5463) objM10578).m10591();
        } else if (objM10578 instanceof C5429) {
            thM10591 = ((C5429) objM10578).f15075;
        } else {
            if (objM10578 instanceof InterfaceC5469) {
                C4210.m8602(objM10578, "Cannot be cancelling child in this state: ");
                return null;
            }
            thM10591 = null;
        }
        CancellationException cancellationException = thM10591 instanceof CancellationException ? (CancellationException) thM10591 : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(m10561(objM10578)), thM10591, c5459) : cancellationException;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final Object m10566(C5463 c5463, Object obj) throws Throwable {
        C5463 c54632;
        Throwable th;
        Throwable thM10564;
        C5459 c5459;
        C5463 c54633;
        C5429 c5429 = obj instanceof C5429 ? (C5429) obj : null;
        Throwable th2 = c5429 != null ? c5429.f15075 : null;
        synchronized (c5463) {
            try {
                c5463.m10590();
                ArrayList<Throwable> arrayListM10589 = c5463.m10589(th2);
                thM10564 = m10564(c5463, arrayListM10589);
                if (thM10564 != null) {
                    try {
                        if (arrayListM10589.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM10589.size()));
                            for (Throwable th3 : arrayListM10589) {
                                if (th3 != thM10564 && th3 != thM10564 && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    AbstractC5186.m10212(thM10564, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c54632 = c5463;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                c54632 = c5463;
                th = th5;
            }
        }
        if (thM10564 != null && thM10564 != th2) {
            obj = new C5429(thM10564, false);
        }
        if (thM10564 != null && (m10568(thM10564) || mo10514(thM10564))) {
            obj.getClass();
            C5429.f15074.compareAndSet((C5429) obj, 0, 1);
        }
        mo10521(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15112;
        Object c5470 = obj instanceof InterfaceC5469 ? new C5470((InterfaceC5469) obj) : obj;
        while (true) {
            atomicReferenceFieldUpdater.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f15109;
            c5459 = this;
            c54633 = c5463;
            if (unsafe.compareAndSwapObject(c5459, j, c54633, c5470) || unsafe.getObjectVolatile(c5459, j) != c54633) {
                break;
            }
            this = c5459;
            c5463 = c54633;
        }
        c5459.m10567(c54633, obj);
        return obj;
    }

    @Override // kotlinx.coroutines.InterfaceC5451
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final InterfaceC5397 mo10554(InterfaceC6557 interfaceC6557) {
        return m10576(true, new C5468(interfaceC6557));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m10567(InterfaceC5469 interfaceC5469, Object obj) {
        InterfaceC5435 interfaceC5435M10588 = m10588();
        if (interfaceC5435M10588 != null) {
            interfaceC5435M10588.dispose();
            m10581(C5454.f15106);
        }
        CompletionHandlerException completionHandlerException = null;
        C5429 c5429 = obj instanceof C5429 ? (C5429) obj : null;
        Throwable th = c5429 != null ? c5429.f15075 : null;
        if (interfaceC5469 instanceof AbstractC5449) {
            try {
                ((AbstractC5449) interfaceC5469).mo10464(th);
                return;
            } catch (Throwable th2) {
                mo10520(new CompletionHandlerException("Exception in completion handler " + interfaceC5469 + " for " + this, th2));
                return;
            }
        }
        C5457 c5457Mo10455 = interfaceC5469.mo10455();
        if (c5457Mo10455 != null) {
            c5457Mo10455.m10390(new C5362(1), 1);
            Object objM10397 = c5457Mo10455.m10397();
            objM10397.getClass();
            for (C5361 c5361M10394 = (C5361) objM10397; !c5361M10394.equals(c5457Mo10455); c5361M10394 = c5361M10394.m10394()) {
                if (c5361M10394 instanceof AbstractC5449) {
                    try {
                        ((AbstractC5449) c5361M10394).mo10464(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            AbstractC5186.m10212(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c5361M10394 + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                mo10520(completionHandlerException);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public String mo10519() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final boolean m10568(Throwable th) {
        if (mo10382()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC5435 interfaceC5435M10588 = m10588();
        return (interfaceC5435M10588 == null || interfaceC5435M10588 == C5454.f15106) ? z : interfaceC5435M10588.mo10524(th) || z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public boolean mo10302(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m10569(th) && mo10552();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        return r5;
     */
    @Override // kotlinx.coroutines.InterfaceC5451
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.InterfaceC5435 mo10555(kotlinx.coroutines.C5459 r7) {
        /*
            r6 = this;
            kotlinx.coroutines.飘花落叶言子楪哲苏世兰 r5 = new kotlinx.coroutines.飘花落叶言子楪哲苏世兰
            r5.<init>(r7)
            r5.f15103 = r6
        L7:
            java.lang.Object r4 = r6.m10578()
            boolean r7 = r4 instanceof kotlinx.coroutines.C5392
            if (r7 == 0) goto L35
            r7 = r4
            kotlinx.coroutines.飘花落叶言子世哲兰楪苏 r7 = (kotlinx.coroutines.C5392) r7
            boolean r0 = r7.f15024
            if (r0 == 0) goto L30
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.C5459.f15112
            r7.getClass()
            sun.misc.Unsafe r0 = p291.AbstractC8501.f23600
            long r2 = kotlinx.coroutines.C5459.f15109
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
            r1.m10580(r7)
            goto L4b
        L35:
            r1 = r6
            boolean r6 = r4 instanceof kotlinx.coroutines.InterfaceC5469
            kotlinx.coroutines.飘花落叶言子苏兰世楪哲 r7 = kotlinx.coroutines.C5454.f15106
            r0 = 0
            if (r6 == 0) goto L7c
            r6 = r4
            kotlinx.coroutines.飘花落叶言子苏楪哲世兰 r6 = (kotlinx.coroutines.InterfaceC5469) r6
            kotlinx.coroutines.飘花落叶言子苏兰楪世哲 r6 = r6.mo10455()
            if (r6 != 0) goto L4d
            kotlinx.coroutines.飘花落叶言子苏世哲兰楪 r4 = (kotlinx.coroutines.AbstractC5449) r4
            r1.m10579(r4)
        L4b:
            r6 = r1
            goto L7
        L4d:
            r2 = 7
            boolean r2 = r6.m10390(r5, r2)
            if (r2 == 0) goto L55
            goto L7a
        L55:
            r2 = 3
            boolean r6 = r6.m10390(r5, r2)
            java.lang.Object r1 = r1.m10578()
            boolean r2 = r1 instanceof kotlinx.coroutines.C5463
            if (r2 == 0) goto L69
            kotlinx.coroutines.飘花落叶言子苏哲楪世兰 r1 = (kotlinx.coroutines.C5463) r1
            java.lang.Throwable r0 = r1.m10591()
            goto L75
        L69:
            boolean r2 = r1 instanceof kotlinx.coroutines.C5429
            if (r2 == 0) goto L70
            kotlinx.coroutines.飘花落叶言子楪兰世哲苏 r1 = (kotlinx.coroutines.C5429) r1
            goto L71
        L70:
            r1 = r0
        L71:
            if (r1 == 0) goto L75
            java.lang.Throwable r0 = r1.f15075
        L75:
            r5.mo10464(r0)
            if (r6 == 0) goto L7b
        L7a:
            return r5
        L7b:
            return r7
        L7c:
            java.lang.Object r6 = r1.m10578()
            boolean r1 = r6 instanceof kotlinx.coroutines.C5429
            if (r1 == 0) goto L87
            kotlinx.coroutines.飘花落叶言子楪兰世哲苏 r6 = (kotlinx.coroutines.C5429) r6
            goto L88
        L87:
            r6 = r0
        L88:
            if (r6 == 0) goto L8c
            java.lang.Throwable r0 = r6.f15075
        L8c:
            r5.mo10464(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C5459.mo10555(kotlinx.coroutines.飘花落叶言子苏哲世兰楪):kotlinx.coroutines.飘花落叶言子楪哲世兰苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public void mo10281(CancellationException cancellationException) {
        m10569(cancellationException);
    }

    @Override // kotlinx.coroutines.InterfaceC5451
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final InterfaceC5397 mo10556(boolean z, boolean z2, InterfaceC6557 interfaceC6557) {
        return m10576(z2, z ? new C5467(interfaceC6557) : new C5468(interfaceC6557));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        r0 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c A[PHI: r0
  0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m10569(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C5459.m10569(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final Object m10570(InterfaceC4356 interfaceC4356) throws Throwable {
        Object objM10578;
        do {
            objM10578 = m10578();
            if (!(objM10578 instanceof InterfaceC5469)) {
                if (objM10578 instanceof C5429) {
                    throw ((C5429) objM10578).f15075;
                }
                return AbstractC5398.m10476(objM10578);
            }
        } while (m10571(objM10578) < 0);
        C5448 c5448 = new C5448(this, AbstractC3054.m6602(interfaceC4356));
        c5448.m10539();
        c5448.m10538(new C5441(AbstractC5398.m10493(this, new C5455(c5448)), 1));
        Object objM10536 = c5448.m10536();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM10536;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public void mo10380(Object obj) {
        mo10379(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public final int m10571(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof C5392;
        long j = f15109;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15112;
        if (z) {
            if (((C5392) obj).f15024) {
                return 0;
            }
            C5392 c5392 = AbstractC5398.f15042;
            do {
                atomicReferenceFieldUpdater.getClass();
                unsafe2 = AbstractC8501.f23600;
                if (unsafe2.compareAndSwapObject(this, f15109, obj, c5392)) {
                    mo10270();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof C5465)) {
            return 0;
        }
        C5457 c5457 = ((C5465) obj).f15125;
        do {
            atomicReferenceFieldUpdater.getClass();
            unsafe = AbstractC8501.f23600;
            if (unsafe.compareAndSwapObject(this, f15109, obj, c5457)) {
                mo10270();
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
    public final Object m10572(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC5469)) {
            return AbstractC5398.f15035;
        }
        if (((obj instanceof C5392) || (obj instanceof AbstractC5449)) && !(obj instanceof C5439) && !(obj2 instanceof C5429)) {
            return m10574((InterfaceC5469) obj, obj2) ? obj2 : AbstractC5398.f15033;
        }
        InterfaceC5469 interfaceC5469 = (InterfaceC5469) obj;
        C5457 c5457M10587 = m10587(interfaceC5469);
        if (c5457M10587 == null) {
            return AbstractC5398.f15033;
        }
        C5463 c5463 = interfaceC5469 instanceof C5463 ? (C5463) interfaceC5469 : null;
        if (c5463 == null) {
            c5463 = new C5463(c5457M10587, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (c5463) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C5463.f15120;
            if (atomicIntegerFieldUpdater.get(c5463) == 1) {
                return AbstractC5398.f15035;
            }
            atomicIntegerFieldUpdater.set(c5463, 1);
            if (c5463 != interfaceC5469) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15112;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC5469, c5463)) {
                    if (atomicReferenceFieldUpdater.get(this) != interfaceC5469) {
                        return AbstractC5398.f15033;
                    }
                }
            }
            boolean zM10590 = c5463.m10590();
            C5429 c5429 = obj2 instanceof C5429 ? (C5429) obj2 : null;
            if (c5429 != null) {
                c5463.m10593(c5429.f15075);
            }
            ?? M10591 = zM10590 ? 0 : c5463.m10591();
            ref$ObjectRef.element = M10591;
            if (M10591 != 0) {
                m10584(c5457M10587, M10591);
            }
            C5439 c5439M10562 = m10562(c5457M10587);
            if (c5439M10562 != null && m10573(c5463, c5439M10562, obj2)) {
                return AbstractC5398.f15034;
            }
            c5457M10587.m10390(new C5362(2), 2);
            C5439 c5439M105622 = m10562(c5457M10587);
            return (c5439M105622 == null || !m10573(c5463, c5439M105622, obj2)) ? m10566(c5463, obj2) : AbstractC5398.f15034;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final boolean m10573(C5463 c5463, C5439 c5439, Object obj) {
        while (c5439.f15086.m10576(false, new C5447(this, c5463, c5439, obj)) == C5454.f15106) {
            c5439 = m10562(c5439);
            if (c5439 == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public final boolean m10574(InterfaceC5469 interfaceC5469, Object obj) {
        Object c5470 = obj instanceof InterfaceC5469 ? new C5470((InterfaceC5469) obj) : obj;
        while (true) {
            f15112.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f15109;
            C5459 c5459 = this;
            InterfaceC5469 interfaceC54692 = interfaceC5469;
            if (unsafe.compareAndSwapObject(c5459, j, interfaceC54692, c5470)) {
                c5459.mo10521(obj);
                c5459.m10567(interfaceC54692, obj);
                return true;
            }
            if (unsafe.getObjectVolatile(c5459, j) != interfaceC54692) {
                return false;
            }
            this = c5459;
            interfaceC5469 = interfaceC54692;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public final boolean m10575(InterfaceC5469 interfaceC5469, Throwable th) {
        C5457 c5457M10587 = m10587(interfaceC5469);
        if (c5457M10587 == null) {
            return false;
        }
        C5463 c5463 = new C5463(c5457M10587, th);
        while (true) {
            f15112.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f15109;
            C5459 c5459 = this;
            InterfaceC5469 interfaceC54692 = interfaceC5469;
            if (unsafe.compareAndSwapObject(c5459, j, interfaceC54692, c5463)) {
                c5459.m10584(c5457M10587, th);
                return true;
            }
            if (unsafe.getObjectVolatile(c5459, j) != interfaceC54692) {
                return false;
            }
            this = c5459;
            interfaceC5469 = interfaceC54692;
        }
    }

    @Override // kotlinx.coroutines.InterfaceC5451
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public boolean mo10557() {
        Object objM10578 = m10578();
        return (objM10578 instanceof InterfaceC5469) && ((InterfaceC5469) objM10578).mo10454();
    }

    @Override // kotlinx.coroutines.InterfaceC5451
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final Object mo10558(InterfaceC4356 interfaceC4356) {
        Object objM10578;
        C5175 c5175;
        do {
            objM10578 = m10578();
            boolean z = objM10578 instanceof InterfaceC5469;
            c5175 = C5175.f14739;
            if (!z) {
                AbstractC5398.m10498(interfaceC4356.getContext());
                return c5175;
            }
        } while (m10571(objM10578) < 0);
        C5443 c5443 = new C5443(1, AbstractC3054.m6602(interfaceC4356));
        c5443.m10539();
        c5443.m10538(new C5441(AbstractC5398.m10493(this, new C5417(c5443)), 1));
        Object objM10536 = c5443.m10536();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (objM10536 != coroutineSingletons) {
            objM10536 = c5175;
        }
        return objM10536 == coroutineSingletons ? objM10536 : c5175;
    }

    @Override // kotlinx.coroutines.InterfaceC5451
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final CancellationException mo10559() {
        CancellationException cancellationException;
        Object objM10578 = m10578();
        if (objM10578 instanceof C5463) {
            Throwable thM10591 = ((C5463) objM10578).m10591();
            if (thM10591 == null) {
                C4210.m8602(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thM10591 instanceof CancellationException ? (CancellationException) thM10591 : null;
            return cancellationException == null ? new JobCancellationException(strConcat, thM10591, this) : cancellationException;
        }
        if (objM10578 instanceof InterfaceC5469) {
            C4210.m8602(this, "Job is still new or active: ");
            return null;
        }
        if (!(objM10578 instanceof C5429)) {
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((C5429) objM10578).f15075;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new JobCancellationException(mo10519(), th, this) : cancellationException;
    }

    @Override // kotlinx.coroutines.InterfaceC5451, kotlinx.coroutines.channels.InterfaceC5198
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo10252(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo10519(), null, this);
        }
        mo10281(cancellationException);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public boolean mo10382() {
        return this instanceof C5423;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        return r8;
     */
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.InterfaceC5397 m10576(boolean r7, kotlinx.coroutines.AbstractC5449 r8) {
        /*
            r6 = this;
            r8.f15103 = r6
        L2:
            java.lang.Object r4 = r6.m10578()
            boolean r0 = r4 instanceof kotlinx.coroutines.C5392
            if (r0 == 0) goto L33
            r0 = r4
            kotlinx.coroutines.飘花落叶言子世哲兰楪苏 r0 = (kotlinx.coroutines.C5392) r0
            boolean r1 = r0.f15024
            if (r1 == 0) goto L2d
        L11:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.C5459.f15112
            r0.getClass()
            sun.misc.Unsafe r0 = p291.AbstractC8501.f23600
            long r2 = kotlinx.coroutines.C5459.f15109
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
            r1.m10580(r0)
            goto L75
        L33:
            r1 = r6
            r5 = r8
            boolean r6 = r4 instanceof kotlinx.coroutines.InterfaceC5469
            kotlinx.coroutines.飘花落叶言子苏兰世楪哲 r8 = kotlinx.coroutines.C5454.f15106
            r0 = 0
            if (r6 == 0) goto L78
            r6 = r4
            kotlinx.coroutines.飘花落叶言子苏楪哲世兰 r6 = (kotlinx.coroutines.InterfaceC5469) r6
            kotlinx.coroutines.飘花落叶言子苏兰楪世哲 r2 = r6.mo10455()
            if (r2 != 0) goto L4b
            kotlinx.coroutines.飘花落叶言子苏世哲兰楪 r4 = (kotlinx.coroutines.AbstractC5449) r4
            r1.m10579(r4)
            goto L75
        L4b:
            boolean r3 = r5.mo10465()
            if (r3 == 0) goto L6d
            boolean r3 = r6 instanceof kotlinx.coroutines.C5463
            if (r3 == 0) goto L58
            kotlinx.coroutines.飘花落叶言子苏哲楪世兰 r6 = (kotlinx.coroutines.C5463) r6
            goto L59
        L58:
            r6 = r0
        L59:
            if (r6 == 0) goto L5f
            java.lang.Throwable r0 = r6.m10591()
        L5f:
            if (r0 != 0) goto L67
            r6 = 5
            boolean r6 = r2.m10390(r5, r6)
            goto L72
        L67:
            if (r7 == 0) goto L8d
            r5.mo10464(r0)
            return r8
        L6d:
            r6 = 1
            boolean r6 = r2.m10390(r5, r6)
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
            java.lang.Object r6 = r1.m10578()
            boolean r7 = r6 instanceof kotlinx.coroutines.C5429
            if (r7 == 0) goto L85
            kotlinx.coroutines.飘花落叶言子楪兰世哲苏 r6 = (kotlinx.coroutines.C5429) r6
            goto L86
        L85:
            r6 = r0
        L86:
            if (r6 == 0) goto L8a
            java.lang.Throwable r0 = r6.f15075
        L8a:
            r5.mo10464(r0)
        L8d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C5459.m10576(boolean, kotlinx.coroutines.飘花落叶言子苏世哲兰楪):kotlinx.coroutines.飘花落叶言子世哲苏楪兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m10577(InterfaceC5451 interfaceC5451) {
        C5454 c5454 = C5454.f15106;
        if (interfaceC5451 == null) {
            m10581(c5454);
            return;
        }
        interfaceC5451.start();
        InterfaceC5435 interfaceC5435Mo10555 = interfaceC5451.mo10555(this);
        m10581(interfaceC5435Mo10555);
        if (mo10560()) {
            interfaceC5435Mo10555.dispose();
            m10581(c5454);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public boolean mo10514(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final Object m10578() {
        f15112.getClass();
        return AbstractC8501.f23600.getObjectVolatile(this, f15109);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void m10579(AbstractC5449 abstractC5449) {
        abstractC5449.m10388(new C5457());
        C5361 c5361M10394 = abstractC5449.m10394();
        while (true) {
            f15112.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f15109;
            C5459 c5459 = this;
            AbstractC5449 abstractC54492 = abstractC5449;
            if (unsafe.compareAndSwapObject(c5459, j, abstractC54492, c5361M10394) || unsafe.getObjectVolatile(c5459, j) != abstractC54492) {
                return;
            }
            this = c5459;
            abstractC5449 = abstractC54492;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final void m10580(C5392 c5392) {
        C5457 c5457 = new C5457();
        Object c5465 = c5392.f15024 ? c5457 : new C5465(c5457);
        while (true) {
            f15112.getClass();
            Unsafe unsafe = AbstractC8501.f23600;
            long j = f15109;
            C5459 c5459 = this;
            C5392 c53922 = c5392;
            if (unsafe.compareAndSwapObject(c5459, j, c53922, c5465) || unsafe.getObjectVolatile(c5459, j) != c53922) {
                return;
            }
            this = c5459;
            c5392 = c53922;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final void m10581(InterfaceC5435 interfaceC5435) {
        f15110.getClass();
        AbstractC8501.f23600.putObjectVolatile(this, f15111, interfaceC5435);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final void m10582(AbstractC5449 abstractC5449) {
        C5459 c5459;
        while (true) {
            Object objM10578 = this.m10578();
            if (!(objM10578 instanceof AbstractC5449)) {
                if (!(objM10578 instanceof InterfaceC5469) || ((InterfaceC5469) objM10578).mo10455() == null) {
                    return;
                }
                abstractC5449.m10391();
                return;
            }
            if (objM10578 != abstractC5449) {
                return;
            }
            C5392 c5392 = AbstractC5398.f15042;
            while (true) {
                f15112.getClass();
                Unsafe unsafe = AbstractC8501.f23600;
                long j = f15109;
                c5459 = this;
                if (unsafe.compareAndSwapObject(c5459, j, objM10578, c5392)) {
                    return;
                }
                if (unsafe.getObjectVolatile(c5459, j) != objM10578) {
                    break;
                } else {
                    this = c5459;
                }
            }
            this = c5459;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public String mo10508() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public final void m10584(C5457 c5457, Throwable th) {
        c5457.m10390(new C5362(4), 4);
        Object objM10397 = c5457.m10397();
        objM10397.getClass();
        CompletionHandlerException completionHandlerException = null;
        for (C5361 c5361M10394 = (C5361) objM10397; !c5361M10394.equals(c5457); c5361M10394 = c5361M10394.m10394()) {
            if ((c5361M10394 instanceof AbstractC5449) && ((AbstractC5449) c5361M10394).mo10465()) {
                try {
                    ((AbstractC5449) c5361M10394).mo10464(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        AbstractC5186.m10212(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c5361M10394 + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo10520(completionHandlerException);
        }
        m10568(th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final boolean m10585(Object obj) {
        Object objM10572;
        do {
            objM10572 = m10572(m10578(), obj);
            if (objM10572 == AbstractC5398.f15035) {
                return false;
            }
            if (objM10572 == AbstractC5398.f15034) {
                return true;
            }
        } while (objM10572 == AbstractC5398.f15033);
        mo10379(objM10572);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public final Object m10586(Object obj) {
        Object objM10572;
        do {
            objM10572 = m10572(m10578(), obj);
            if (objM10572 == AbstractC5398.f15035) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C5429 c5429 = obj instanceof C5429 ? (C5429) obj : null;
                throw new IllegalStateException(str, c5429 != null ? c5429.f15075 : null);
            }
        } while (objM10572 == AbstractC5398.f15033);
        return objM10572;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public boolean mo10552() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC5451
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final boolean mo10560() {
        return !(m10578() instanceof InterfaceC5469);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final C5457 m10587(InterfaceC5469 interfaceC5469) {
        C5457 c5457Mo10455 = interfaceC5469.mo10455();
        if (c5457Mo10455 != null) {
            return c5457Mo10455;
        }
        if (interfaceC5469 instanceof C5392) {
            return new C5457();
        }
        if (interfaceC5469 instanceof AbstractC5449) {
            m10579((AbstractC5449) interfaceC5469);
            return null;
        }
        C4210.m8602(interfaceC5469, "State should have list: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final InterfaceC5435 m10588() {
        f15110.getClass();
        return (InterfaceC5435) AbstractC8501.f23600.getObjectVolatile(this, f15111);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public boolean mo10553() {
        return this instanceof C5437;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世 */
    public void mo10270() {
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public void mo10379(Object obj) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public void mo10520(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲 */
    public void mo10521(Object obj) {
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public void m10583(Throwable th) {
    }
}
