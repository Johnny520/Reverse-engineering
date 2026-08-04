package yyds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛴᲈᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0986 implements InterfaceC2798 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final /* synthetic */ long f4495;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final /* synthetic */ long f4496;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = AbstractC2112.f10448;
        f4496 = unsafe.objectFieldOffset(AbstractC0986.class.getDeclaredField("_state$volatile"));
        f4495 = unsafe.objectFieldOffset(AbstractC0986.class.getDeclaredField("_parentHandle$volatile"));
    }

    public AbstractC0986(boolean z) {
        this._state$volatile = z ? AbstractC0395.f2036 : AbstractC0395.f2038;
    }

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    public static String m2140(Object obj) {
        if (!(obj instanceof C1321)) {
            return obj instanceof InterfaceC2067 ? ((InterfaceC2067) obj).mo2048() ? "Active" : "New" : obj instanceof C0417 ? "Cancelled" : "Completed";
        }
        C1321 c1321 = (C1321) obj;
        return c1321.m2611() ? "Cancelling" : c1321.m2615() ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public static C2628 m2141(AbstractC0694 abstractC0694) {
        while (abstractC0694.mo1605()) {
            abstractC0694 = abstractC0694.m1606();
        }
        while (true) {
            abstractC0694 = abstractC0694.m1602();
            if (!abstractC0694.mo1605()) {
                if (abstractC0694 instanceof C2628) {
                    return (C2628) abstractC0694;
                }
                if (abstractC0694 instanceof C1518) {
                    return null;
                }
            }
        }
    }

    @Override // yyds.InterfaceC2247
    public final InterfaceC2289 getKey() {
        return C1586.f8041;
    }

    @Override // yyds.InterfaceC2798
    public final boolean start() {
        int iM2164;
        do {
            iM2164 = m2164(m2163());
            if (iM2164 == 0) {
                return false;
            }
        } while (iM2164 != 1);
        return true;
    }

    public final String toString() {
        return (mo2165() + '{' + m2140(m2163()) + '}') + '@' + AbstractC2408.m4457(this);
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public boolean mo2142() {
        return this instanceof C2539;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[PHI: r0
  0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2143(Object obj) {
        AbstractC0986 abstractC0986;
        C0415 c0415;
        Object objM2153;
        Object objM21532 = AbstractC0395.f2034;
        if (mo2142()) {
            do {
                Object objM2163 = m2163();
                if (!(objM2163 instanceof InterfaceC2067) || ((objM2163 instanceof C1321) && ((C1321) objM2163).m2615())) {
                    objM21532 = AbstractC0395.f2034;
                    break;
                }
                objM21532 = m2153(objM2163, new C0417(m2159(obj), false));
            } while (objM21532 == AbstractC0395.f2037);
            if (objM21532 != AbstractC0395.f2035) {
                if (objM21532 == AbstractC0395.f2034) {
                    Throwable thM2159 = null;
                    loop1: while (true) {
                        Object objM21632 = this.m2163();
                        if (!(objM21632 instanceof C1321)) {
                            if (!(objM21632 instanceof InterfaceC2067)) {
                                abstractC0986 = this;
                                objM2153 = AbstractC0395.f2039;
                                break;
                            }
                            if (thM2159 == null) {
                                thM2159 = this.m2159(obj);
                            }
                            InterfaceC2067 interfaceC2067 = (InterfaceC2067) objM21632;
                            if (interfaceC2067.mo2048()) {
                                C1518 c1518M2162 = this.m2162(interfaceC2067);
                                if (c1518M2162 == null) {
                                    abstractC0986 = this;
                                } else {
                                    C1321 c1321 = new C1321(c1518M2162, thM2159);
                                    while (true) {
                                        Unsafe unsafe = AbstractC2112.f10448;
                                        long j = f4496;
                                        abstractC0986 = this;
                                        if (unsafe.compareAndSwapObject(abstractC0986, j, interfaceC2067, c1321)) {
                                            abstractC0986.m2151(c1518M2162, thM2159);
                                            objM2153 = AbstractC0395.f2034;
                                            break loop1;
                                        }
                                        if (unsafe.getObjectVolatile(abstractC0986, j) != interfaceC2067) {
                                            break;
                                        }
                                        this = abstractC0986;
                                    }
                                }
                                this = abstractC0986;
                            } else {
                                abstractC0986 = this;
                                objM2153 = abstractC0986.m2153(objM21632, new C0417(thM2159, false));
                                if (objM2153 == AbstractC0395.f2034) {
                                    C0188.m791(objM21632, "Cannot happen in ");
                                    return false;
                                }
                                if (objM2153 != AbstractC0395.f2037) {
                                    break;
                                }
                                this = abstractC0986;
                            }
                        } else {
                            synchronized (objM21632) {
                                if (AbstractC2112.f10448.getObjectVolatile((C1321) objM21632, C1321.f6073) == AbstractC0395.f2033) {
                                    c0415 = AbstractC0395.f2039;
                                } else {
                                    boolean zM2611 = ((C1321) objM21632).m2611();
                                    if (obj != null || !zM2611) {
                                        if (thM2159 == null) {
                                            thM2159 = this.m2159(obj);
                                        }
                                        ((C1321) objM21632).m2612(thM2159);
                                    }
                                    Throwable thM2614 = zM2611 ? null : ((C1321) objM21632).m2614();
                                    if (thM2614 != null) {
                                        this.m2151(((C1321) objM21632).f6074, thM2614);
                                    }
                                    c0415 = AbstractC0395.f2034;
                                }
                            }
                            abstractC0986 = this;
                            objM21532 = c0415;
                        }
                    }
                    objM21532 = objM2153;
                } else {
                    abstractC0986 = this;
                }
                if (objM21532 != AbstractC0395.f2034 && objM21532 != AbstractC0395.f2035) {
                    if (objM21532 == AbstractC0395.f2039) {
                        return false;
                    }
                    abstractC0986.mo1619(objM21532);
                    return true;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public boolean mo2144() {
        return this instanceof C0701;
    }

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public final void m2145(AbstractC0931 abstractC0931) {
        AbstractC0931 abstractC09312;
        AbstractC0986 abstractC0986;
        C1518 c1518 = new C1518();
        Unsafe unsafe = AbstractC2112.f10448;
        unsafe.putObjectVolatile(c1518, AbstractC0694.f3285, abstractC0931);
        long j = AbstractC0694.f3284;
        unsafe.putObjectVolatile(c1518, j, abstractC0931);
        loop0: while (true) {
            if (abstractC0931.m1601() != abstractC0931) {
                abstractC09312 = abstractC0931;
                break;
            }
            while (true) {
                Unsafe unsafe2 = AbstractC2112.f10448;
                abstractC09312 = abstractC0931;
                if (unsafe2.compareAndSwapObject(abstractC09312, AbstractC0694.f3284, abstractC0931, c1518)) {
                    c1518.m1604(abstractC09312);
                    break loop0;
                }
                abstractC0986 = this;
                abstractC0931 = abstractC09312;
                if (unsafe2.getObjectVolatile(abstractC09312, j) != abstractC09312) {
                    break;
                } else {
                    this = abstractC0986;
                }
            }
            this = abstractC0986;
        }
        AbstractC0694 abstractC0694M1602 = abstractC09312.m1602();
        while (true) {
            Unsafe unsafe3 = AbstractC2112.f10448;
            long j2 = f4496;
            AbstractC0986 abstractC09862 = this;
            if (unsafe3.compareAndSwapObject(abstractC09862, j2, abstractC09312, abstractC0694M1602) || unsafe3.getObjectVolatile(abstractC09862, j2) != abstractC09312) {
                return;
            } else {
                this = abstractC09862;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        return r8;
     */
    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0970 m2146(boolean z, AbstractC0931 abstractC0931) {
        AbstractC0986 abstractC0986;
        AbstractC0931 abstractC09312;
        boolean zM1603;
        abstractC0931.f4255 = this;
        loop0: while (true) {
            Object objM2163 = this.m2163();
            if (objM2163 instanceof C2631) {
                C2631 c2631 = (C2631) objM2163;
                if (c2631.f12962) {
                    while (true) {
                        Unsafe unsafe = AbstractC2112.f10448;
                        long j = f4496;
                        abstractC0986 = this;
                        abstractC09312 = abstractC0931;
                        if (unsafe.compareAndSwapObject(abstractC0986, j, objM2163, abstractC09312)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(abstractC0986, j) != objM2163) {
                            break;
                        }
                        this = abstractC0986;
                        abstractC0931 = abstractC09312;
                    }
                } else {
                    abstractC0986 = this;
                    abstractC09312 = abstractC0931;
                    abstractC0986.m2157(c2631);
                }
                this = abstractC0986;
                abstractC0931 = abstractC09312;
            } else {
                abstractC0986 = this;
                abstractC09312 = abstractC0931;
                boolean z2 = objM2163 instanceof InterfaceC2067;
                C2329 c2329 = C2329.f11479;
                if (z2) {
                    InterfaceC2067 interfaceC2067 = (InterfaceC2067) objM2163;
                    C1518 c1518Mo2049 = interfaceC2067.mo2049();
                    if (c1518Mo2049 == null) {
                        abstractC0986.m2145((AbstractC0931) objM2163);
                    } else {
                        if (abstractC09312.mo926()) {
                            C1321 c1321 = interfaceC2067 instanceof C1321 ? (C1321) interfaceC2067 : null;
                            Throwable thM2614 = c1321 != null ? c1321.m2614() : null;
                            if (thM2614 == null) {
                                zM1603 = c1518Mo2049.m1603(abstractC09312, 5);
                            } else if (z) {
                                abstractC09312.mo925(thM2614);
                                return c2329;
                            }
                        } else {
                            zM1603 = c1518Mo2049.m1603(abstractC09312, 1);
                        }
                        if (zM1603) {
                            break;
                        }
                    }
                    this = abstractC0986;
                    abstractC0931 = abstractC09312;
                } else if (z) {
                    Object objM21632 = abstractC0986.m2163();
                    C0417 c0417 = objM21632 instanceof C0417 ? (C0417) objM21632 : null;
                    abstractC09312.mo925(c0417 != null ? c0417.f2152 : null);
                }
            }
        }
        return abstractC09312;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public void mo2147(Object obj) {
        mo1619(obj);
    }

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public boolean mo2148() {
        return true;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public void mo1619(Object obj) {
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final Object m2149(C1321 c1321, Object obj) throws Throwable {
        C1321 c13212;
        Throwable th;
        Throwable thM2154;
        AbstractC0986 abstractC0986;
        C1321 c13213;
        C0417 c0417 = obj instanceof C0417 ? (C0417) obj : null;
        Throwable th2 = c0417 != null ? c0417.f2152 : null;
        synchronized (c1321) {
            try {
                c1321.m2611();
                ArrayList<Throwable> arrayListM2613 = c1321.m2613(th2);
                thM2154 = m2154(c1321, arrayListM2613);
                if (thM2154 != null) {
                    try {
                        if (arrayListM2613.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM2613.size()));
                            for (Throwable th3 : arrayListM2613) {
                                if (th3 != thM2154 && th3 != thM2154 && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    AbstractC1579.m3235(thM2154, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c13212 = c1321;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                c13212 = c1321;
                th = th5;
            }
        }
        if (thM2154 != null && thM2154 != th2) {
            obj = new C0417(thM2154, false);
        }
        if (thM2154 != null && (m2156(thM2154) || mo939(thM2154))) {
            C0417 c04172 = (C0417) obj;
            c04172.getClass();
            AbstractC2112.f10448.compareAndSwapInt(c04172, C0417.f2151, 0, 1);
        }
        mo814(obj);
        Object c2455 = obj instanceof InterfaceC2067 ? new C2455((InterfaceC2067) obj) : obj;
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f4496;
            abstractC0986 = this;
            c13213 = c1321;
            if (unsafe.compareAndSwapObject(abstractC0986, j, c13213, c2455) || unsafe.getObjectVolatile(abstractC0986, j) != c13213) {
                break;
            }
            this = abstractC0986;
            c1321 = c13213;
        }
        abstractC0986.m2160(c13213, obj);
        return obj;
    }

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public void m2150() {
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public final void m2151(C1518 c1518, Throwable th) {
        c1518.m1603(new C2031(4), 4);
        C1738 c1738 = null;
        for (AbstractC0694 abstractC0694M1602 = (AbstractC0694) c1518.m1601(); !AbstractC1544.m3188(abstractC0694M1602, c1518); abstractC0694M1602 = abstractC0694M1602.m1602()) {
            if ((abstractC0694M1602 instanceof AbstractC0931) && ((AbstractC0931) abstractC0694M1602).mo926()) {
                try {
                    ((AbstractC0931) abstractC0694M1602).mo925(th);
                } catch (Throwable th2) {
                    if (c1738 != null) {
                        AbstractC1579.m3235(c1738, th2);
                    } else {
                        c1738 = new C1738("Exception in completion handler " + abstractC0694M1602 + " for " + this, th2);
                    }
                }
            }
        }
        if (c1738 != null) {
            mo815(c1738);
        }
        m2156(th);
    }

    @Override // yyds.InterfaceC2798
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public boolean mo2091() {
        Object objM2163 = m2163();
        return (objM2163 instanceof InterfaceC2067) && ((InterfaceC2067) objM2163).mo2048();
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public boolean mo2152(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m2143(th) && mo2148();
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public final InterfaceC2213 mo421(InterfaceC2289 interfaceC2289) {
        return AbstractC1579.m3232(this, interfaceC2289);
    }

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public final Object m2153(Object obj, Object obj2) {
        Unsafe unsafe;
        long j;
        if (!(obj instanceof InterfaceC2067)) {
            return AbstractC0395.f2034;
        }
        if ((!(obj instanceof C2631) && !(obj instanceof AbstractC0931)) || (obj instanceof C2628) || (obj2 instanceof C0417)) {
            AbstractC0986 abstractC0986 = this;
            InterfaceC2067 interfaceC2067 = (InterfaceC2067) obj;
            C1518 c1518M2162 = abstractC0986.m2162(interfaceC2067);
            if (c1518M2162 == null) {
                return AbstractC0395.f2037;
            }
            C1321 c1321 = interfaceC2067 instanceof C1321 ? (C1321) interfaceC2067 : null;
            if (c1321 == null) {
                c1321 = new C1321(c1518M2162, null);
            }
            C1321 c13212 = c1321;
            synchronized (c13212) {
                if (c13212.m2615()) {
                    return AbstractC0395.f2034;
                }
                AbstractC2112.f10448.putIntVolatile(c13212, C1321.f6071, 1);
                if (c13212 != interfaceC2067) {
                    do {
                        unsafe = AbstractC2112.f10448;
                        j = f4496;
                        AbstractC0986 abstractC09862 = abstractC0986;
                        abstractC0986 = abstractC09862;
                        if (unsafe.compareAndSwapObject(abstractC09862, j, interfaceC2067, c13212)) {
                        }
                    } while (unsafe.getObjectVolatile(abstractC0986, j) == interfaceC2067);
                    return AbstractC0395.f2037;
                }
                boolean zM2611 = c13212.m2611();
                C0417 c0417 = obj2 instanceof C0417 ? (C0417) obj2 : null;
                if (c0417 != null) {
                    c13212.m2612(c0417.f2152);
                }
                Throwable thM2614 = zM2611 ? null : c13212.m2614();
                if (thM2614 != null) {
                    abstractC0986.m2151(c1518M2162, thM2614);
                }
                C2628 c2628M2141 = m2141(c1518M2162);
                if (c2628M2141 != null && abstractC0986.m2155(c13212, c2628M2141, obj2)) {
                    return AbstractC0395.f2035;
                }
                c1518M2162.m1603(new C2031(2), 2);
                C2628 c2628M21412 = m2141(c1518M2162);
                return (c2628M21412 == null || !abstractC0986.m2155(c13212, c2628M21412, obj2)) ? abstractC0986.m2149(c13212, obj2) : AbstractC0395.f2035;
            }
        }
        InterfaceC2067 interfaceC20672 = (InterfaceC2067) obj;
        Object c2455 = obj2 instanceof InterfaceC2067 ? new C2455((InterfaceC2067) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = AbstractC2112.f10448;
            long j2 = f4496;
            AbstractC0986 abstractC09863 = this;
            if (unsafe2.compareAndSwapObject(abstractC09863, j2, interfaceC20672, c2455)) {
                abstractC09863.mo814(obj2);
                abstractC09863.m2160(interfaceC20672, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(abstractC09863, j2) != interfaceC20672) {
                return AbstractC0395.f2037;
            }
            this = abstractC09863;
        }
    }

    @Override // yyds.InterfaceC2798
    /* JADX INFO: renamed from: ᛵᛶᛲᲀ */
    public final CancellationException mo2092() {
        CancellationException cancellationException;
        Object objM2163 = m2163();
        if (objM2163 instanceof C1321) {
            Throwable thM2614 = ((C1321) objM2163).m2614();
            if (thM2614 == null) {
                C0188.m791(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thM2614 instanceof CancellationException ? (CancellationException) thM2614 : null;
            return cancellationException == null ? new C2062(strConcat, thM2614, this) : cancellationException;
        }
        if (objM2163 instanceof InterfaceC2067) {
            C0188.m791(this, "Job is still new or active: ");
            return null;
        }
        if (!(objM2163 instanceof C0417)) {
            return new C2062(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((C0417) objM2163).f2152;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new C2062(mo816(), th, this) : cancellationException;
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final Throwable m2154(C1321 c1321, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (c1321.m2611()) {
                return new C2062(mo816(), null, this);
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
        if (th2 instanceof C1263) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof C1263)) {
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

    @Override // yyds.InterfaceC2798
    /* JADX INFO: renamed from: ᛵᲀᲈᛴ */
    public final void mo2093(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C2062(mo816(), null, this);
        }
        m2143(cancellationException);
    }

    /* JADX INFO: renamed from: ᛵᲈᲇᛵ, reason: contains not printable characters */
    public final boolean m2155(C1321 c1321, C2628 c2628, Object obj) {
        while (AbstractC0024.m3302(c2628.f12929, false, new C1840(this, c1321, c2628, obj)) == C2329.f11479) {
            c2628 = m2141(c2628);
            if (c2628 == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final boolean m2156(Throwable th) {
        if (mo2144()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC2330 interfaceC2330 = (InterfaceC2330) AbstractC2112.f10448.getObjectVolatile(this, f4495);
        return (interfaceC2330 == null || interfaceC2330 == C2329.f11479) ? z : interfaceC2330.mo4351(th) || z;
    }

    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public final void m2157(C2631 c2631) {
        C1518 c1518 = new C1518();
        Object c1793 = c2631.f12962 ? c1518 : new C1793(c1518);
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f4496;
            AbstractC0986 abstractC0986 = this;
            C2631 c26312 = c2631;
            if (unsafe.compareAndSwapObject(abstractC0986, j, c26312, c1793) || unsafe.getObjectVolatile(abstractC0986, j) != c26312) {
                return;
            }
            this = abstractC0986;
            c2631 = c26312;
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public Object m2158() {
        return m2167();
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final Throwable m2159(Object obj) {
        Throwable thM2614;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C2062(mo816(), null, this) : th;
        }
        AbstractC0986 abstractC0986 = (AbstractC0986) obj;
        Object objM2163 = abstractC0986.m2163();
        if (objM2163 instanceof C1321) {
            thM2614 = ((C1321) objM2163).m2614();
        } else if (objM2163 instanceof C0417) {
            thM2614 = ((C0417) objM2163).f2152;
        } else {
            if (objM2163 instanceof InterfaceC2067) {
                C0188.m791(objM2163, "Cannot be cancelling child in this state: ");
                return null;
            }
            thM2614 = null;
        }
        CancellationException cancellationException = thM2614 instanceof CancellationException ? (CancellationException) thM2614 : null;
        return cancellationException == null ? new C2062("Parent job is ".concat(m2140(objM2163)), thM2614, abstractC0986) : cancellationException;
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final void m2160(InterfaceC2067 interfaceC2067, Object obj) {
        Unsafe unsafe = AbstractC2112.f10448;
        long j = f4495;
        InterfaceC2330 interfaceC2330 = (InterfaceC2330) unsafe.getObjectVolatile(this, j);
        if (interfaceC2330 != null) {
            interfaceC2330.mo1720();
            unsafe.putObjectVolatile(this, j, C2329.f11479);
        }
        C1738 c1738 = null;
        C0417 c0417 = obj instanceof C0417 ? (C0417) obj : null;
        Throwable th = c0417 != null ? c0417.f2152 : null;
        if (interfaceC2067 instanceof AbstractC0931) {
            try {
                ((AbstractC0931) interfaceC2067).mo925(th);
                return;
            } catch (Throwable th2) {
                mo815(new C1738("Exception in completion handler " + interfaceC2067 + " for " + this, th2));
                return;
            }
        }
        C1518 c1518Mo2049 = interfaceC2067.mo2049();
        if (c1518Mo2049 != null) {
            c1518Mo2049.m1603(new C2031(1), 1);
            for (AbstractC0694 abstractC0694M1602 = (AbstractC0694) c1518Mo2049.m1601(); !AbstractC1544.m3188(abstractC0694M1602, c1518Mo2049); abstractC0694M1602 = abstractC0694M1602.m1602()) {
                if (abstractC0694M1602 instanceof AbstractC0931) {
                    try {
                        ((AbstractC0931) abstractC0694M1602).mo925(th);
                    } catch (Throwable th3) {
                        if (c1738 != null) {
                            AbstractC1579.m3235(c1738, th3);
                        } else {
                            c1738 = new C1738("Exception in completion handler " + abstractC0694M1602 + " for " + this, th3);
                        }
                    }
                }
            }
            if (c1738 != null) {
                mo815(c1738);
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ */
    public void mo814(Object obj) {
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛷᛶᛷᲀ */
    public final InterfaceC2213 mo422(InterfaceC2213 interfaceC2213) {
        return AbstractC0879.m1960(this, interfaceC2213);
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᛷᛸᲇᛶ */
    public final InterfaceC2247 mo423(InterfaceC2289 interfaceC2289) {
        return AbstractC1579.m3240(this, interfaceC2289);
    }

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ */
    public void mo815(C1738 c1738) {
        throw c1738;
    }

    @Override // yyds.InterfaceC2798
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final native InterfaceC0970 mo2094(boolean z, boolean z2, C2635 c2635);

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public final Object m2161(Object obj) {
        Object objM2153;
        do {
            objM2153 = m2153(m2163(), obj);
            if (objM2153 == AbstractC0395.f2034) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0417 c0417 = obj instanceof C0417 ? (C0417) obj : null;
                throw new IllegalStateException(str, c0417 != null ? c0417.f2152 : null);
            }
        } while (objM2153 == AbstractC0395.f2037);
        return objM2153;
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final C1518 m2162(InterfaceC2067 interfaceC2067) {
        C1518 c1518Mo2049 = interfaceC2067.mo2049();
        if (c1518Mo2049 != null) {
            return c1518Mo2049;
        }
        if (interfaceC2067 instanceof C2631) {
            return new C1518();
        }
        if (interfaceC2067 instanceof AbstractC0931) {
            m2145((AbstractC0931) interfaceC2067);
            return null;
        }
        C0188.m791(interfaceC2067, "State should have list: ");
        return null;
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public final Object m2163() {
        return AbstractC2112.f10448.getObjectVolatile(this, f4496);
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ */
    public String mo816() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ */
    public boolean mo939(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public final int m2164(Object obj) {
        Unsafe unsafe;
        boolean z = obj instanceof C2631;
        long j = f4496;
        if (!z) {
            AbstractC0986 abstractC0986 = this;
            Object obj2 = obj;
            if (!(obj2 instanceof C1793)) {
                return 0;
            }
            C1518 c1518 = ((C1793) obj2).f9039;
            do {
                AbstractC0986 abstractC09862 = abstractC0986;
                unsafe = AbstractC2112.f10448;
                Object obj3 = obj2;
                boolean zCompareAndSwapObject = unsafe.compareAndSwapObject(abstractC09862, f4496, obj3, c1518);
                abstractC0986 = abstractC09862;
                obj2 = obj3;
                if (zCompareAndSwapObject) {
                    return 1;
                }
            } while (unsafe.getObjectVolatile(abstractC0986, j) == obj2);
            return -1;
        }
        if (((C2631) obj).f12962) {
            return 0;
        }
        while (true) {
            Unsafe unsafe2 = AbstractC2112.f10448;
            AbstractC0986 abstractC09863 = this;
            Object obj4 = obj;
            if (unsafe2.compareAndSwapObject(abstractC09863, f4496, obj4, AbstractC0395.f2036)) {
                return 1;
            }
            if (unsafe2.getObjectVolatile(abstractC09863, j) != obj4) {
                return -1;
            }
            this = abstractC09863;
            obj = obj4;
        }
    }

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public String mo2165() {
        return getClass().getSimpleName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        return r5;
     */
    @Override // yyds.InterfaceC2798
    /* JADX INFO: renamed from: ᲇᛱᛲ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2330 mo2095(AbstractC0986 abstractC0986) {
        AbstractC0986 abstractC09862;
        C2628 c2628 = new C2628(abstractC0986);
        c2628.f4255 = this;
        loop0: while (true) {
            Object objM2163 = this.m2163();
            if (objM2163 instanceof C2631) {
                C2631 c2631 = (C2631) objM2163;
                if (c2631.f12962) {
                    while (true) {
                        Unsafe unsafe = AbstractC2112.f10448;
                        long j = f4496;
                        abstractC09862 = this;
                        if (unsafe.compareAndSwapObject(abstractC09862, j, objM2163, c2628)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(abstractC09862, j) != objM2163) {
                            break;
                        }
                        this = abstractC09862;
                    }
                } else {
                    abstractC09862 = this;
                    abstractC09862.m2157(c2631);
                }
                this = abstractC09862;
            } else {
                abstractC09862 = this;
                boolean z = objM2163 instanceof InterfaceC2067;
                C2329 c2329 = C2329.f11479;
                if (!z) {
                    Object objM21632 = abstractC09862.m2163();
                    C0417 c0417 = objM21632 instanceof C0417 ? (C0417) objM21632 : null;
                    c2628.mo925(c0417 != null ? c0417.f2152 : null);
                    return c2329;
                }
                C1518 c1518Mo2049 = ((InterfaceC2067) objM2163).mo2049();
                if (c1518Mo2049 == null) {
                    abstractC09862.m2145((AbstractC0931) objM2163);
                    this = abstractC09862;
                } else if (!c1518Mo2049.m1603(c2628, 7)) {
                    boolean zM1603 = c1518Mo2049.m1603(c2628, 3);
                    Object objM21633 = abstractC09862.m2163();
                    if (objM21633 instanceof C1321) {
                        thM2614 = ((C1321) objM21633).m2614();
                    } else {
                        C0417 c04172 = objM21633 instanceof C0417 ? (C0417) objM21633 : null;
                        if (c04172 != null) {
                            thM2614 = c04172.f2152;
                        }
                    }
                    c2628.mo925(thM2614);
                    if (zM1603) {
                        break loop0;
                    }
                    return c2329;
                }
            }
        }
    }

    @Override // yyds.InterfaceC2213
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final Object mo424(Object obj, InterfaceC0477 interfaceC0477) {
        return interfaceC0477.mo511(obj, this);
    }

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public final void m2166(InterfaceC2798 interfaceC2798) {
        long j = f4495;
        C2329 c2329 = C2329.f11479;
        if (interfaceC2798 == null) {
            AbstractC2112.f10448.putObjectVolatile(this, j, c2329);
            return;
        }
        interfaceC2798.start();
        InterfaceC2330 interfaceC2330Mo2095 = interfaceC2798.mo2095(this);
        Unsafe unsafe = AbstractC2112.f10448;
        unsafe.putObjectVolatile(this, j, interfaceC2330Mo2095);
        if (m2163() instanceof InterfaceC2067) {
            return;
        }
        interfaceC2330Mo2095.mo1720();
        unsafe.putObjectVolatile(this, j, c2329);
    }

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final Object m2167() throws Throwable {
        Object objM2163 = m2163();
        if (objM2163 instanceof InterfaceC2067) {
            C0188.m800("This job has not completed yet");
            return null;
        }
        if (objM2163 instanceof C0417) {
            throw ((C0417) objM2163).f2152;
        }
        return AbstractC0395.m1137(objM2163);
    }
}
