package yyds;

import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛸᲀᛱᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1853 extends AbstractC2017 implements InterfaceC1617, InterfaceC1431, InterfaceC1927 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f9323;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f9324;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f9325;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final InterfaceC2213 f9326;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final InterfaceC0274 f9327;

    static {
        Unsafe unsafe = AbstractC2112.f10448;
        f9323 = unsafe.objectFieldOffset(C1853.class.getDeclaredField("_decisionAndIndex$volatile"));
        f9325 = unsafe.objectFieldOffset(C1853.class.getDeclaredField("_state$volatile"));
        f9324 = unsafe.objectFieldOffset(C1853.class.getDeclaredField("_parentHandle$volatile"));
    }

    public C1853(int i, InterfaceC0274 interfaceC0274) {
        super(i);
        this.f9327 = interfaceC0274;
        this.f9326 = interfaceC0274.mo733();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C2583.f12732;
    }

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static void m3616(InterfaceC0576 interfaceC0576, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC0576 + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public static Object m3617(InterfaceC0576 interfaceC0576, Object obj, int i, InterfaceC0295 interfaceC0295) {
        if (obj instanceof C0417) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (interfaceC0295 != null || (interfaceC0576 instanceof InterfaceC0230)) {
            return new C0697(obj, interfaceC0576 instanceof InterfaceC0230 ? (InterfaceC0230) interfaceC0576 : null, interfaceC0295, (Throwable) null, 16);
        }
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(mo1355());
        sb.append('(');
        sb.append(AbstractC2408.m4458(this.f9327));
        sb.append("){");
        Object objM3628 = m3628();
        sb.append(objM3628 instanceof InterfaceC0576 ? "Active" : objM3628 instanceof C1259 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC2408.m4457(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public final void m3618() {
        C1853 c1853;
        Unsafe unsafe;
        InterfaceC0274 interfaceC0274 = this.f9327;
        Throwable th = null;
        C1118 c1118 = interfaceC0274 instanceof C1118 ? (C1118) interfaceC0274 : null;
        if (c1118 != null) {
            long j = C1118.f5136;
            loop0: while (true) {
                Object objectVolatile = AbstractC2112.f10448.getObjectVolatile(c1118, j);
                C0415 c0415 = AbstractC0427.f2178;
                if (objectVolatile != c0415) {
                    c1853 = this;
                    if (!(objectVolatile instanceof Throwable)) {
                        C0188.m791(objectVolatile, "Inconsistent state ");
                        return;
                    }
                    do {
                        unsafe = AbstractC2112.f10448;
                        if (unsafe.compareAndSwapObject(c1118, C1118.f5136, objectVolatile, (Object) null)) {
                            th = (Throwable) objectVolatile;
                        }
                    } while (unsafe.getObjectVolatile(c1118, j) == objectVolatile);
                    C0188.m798("Failed requirement.");
                    return;
                }
                while (true) {
                    Unsafe unsafe2 = AbstractC2112.f10448;
                    C1853 c18532 = this;
                    c1853 = c18532;
                    if (unsafe2.compareAndSwapObject(c1118, C1118.f5136, c0415, c18532)) {
                        break loop0;
                    } else if (unsafe2.getObjectVolatile(c1118, j) != c0415) {
                        break;
                    } else {
                        this = c1853;
                    }
                }
                this = c1853;
            }
            if (th == null) {
                return;
            }
            c1853.m3623();
            c1853.m3626(th);
        }
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final void m3619(InterfaceC0230 interfaceC0230, Throwable th) {
        try {
            interfaceC0230.mo884(th);
        } catch (Throwable th2) {
            AbstractC2071.m3956(this.f9326, new C1738("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // yyds.InterfaceC0274
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final void mo812(Object obj) {
        Throwable thM4249 = C2248.m4249(obj);
        if (thM4249 != null) {
            obj = new C0417(thM4249, false);
        }
        m3631(obj, this.f10086, null);
    }

    @Override // yyds.AbstractC2017
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final Object mo2310() {
        return m3628();
    }

    @Override // yyds.AbstractC2017
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final Object mo3620(Object obj) {
        return obj instanceof C0697 ? ((C0697) obj).f3292 : obj;
    }

    @Override // yyds.InterfaceC0274
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final InterfaceC2213 mo733() {
        return this.f9326;
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final InterfaceC0970 m3621() {
        InterfaceC2798 interfaceC2798 = (InterfaceC2798) this.f9326.mo423(C1586.f8041);
        if (interfaceC2798 == null) {
            return null;
        }
        InterfaceC0970 interfaceC0970M3302 = AbstractC0024.m3302(interfaceC2798, true, new C0278(this));
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f9324;
            C1853 c1853 = this;
            if (unsafe.compareAndSwapObject(c1853, j, (Object) null, interfaceC0970M3302) || unsafe.getObjectVolatile(c1853, j) != null) {
                break;
            }
            this = c1853;
        }
        return interfaceC0970M3302;
    }

    @Override // yyds.InterfaceC1927
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo3447(C1056 c1056, int i) {
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f9323;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                C0188.m800("invokeOnCancellation should be called at most once");
                return;
            }
            C1853 c1853 = this;
            if (unsafe.compareAndSwapInt(c1853, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                c1853.m3636(c1056);
                return;
            }
            this = c1853;
        }
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ */
    public Throwable mo1354(AbstractC0986 abstractC0986) {
        return abstractC0986.mo2092();
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m3622(InterfaceC0295 interfaceC0295, Throwable th, Object obj) {
        InterfaceC2213 interfaceC2213 = this.f9326;
        try {
            interfaceC0295.mo944(th, obj, interfaceC2213);
        } catch (Throwable th2) {
            AbstractC2071.m3956(interfaceC2213, new C1738("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final void m3623() {
        Unsafe unsafe = AbstractC2112.f10448;
        long j = f9324;
        InterfaceC0970 interfaceC0970 = (InterfaceC0970) unsafe.getObjectVolatile(this, j);
        if (interfaceC0970 == null) {
            return;
        }
        interfaceC0970.mo1720();
        unsafe.putObjectVolatile(this, j, C2329.f11479);
    }

    @Override // yyds.InterfaceC1617
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo3311(C1911 c1911) {
        m3631(C2746.f13459, this.f10086, c1911);
    }

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final boolean m3624() {
        if (this.f10086 == 2) {
            return AbstractC2112.f10448.getObjectVolatile((C1118) this.f9327, C1118.f5136) != null;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final void m3625() {
        InterfaceC0970 interfaceC0970M3621 = m3621();
        if (interfaceC0970M3621 == null || (m3628() instanceof InterfaceC0576)) {
            return;
        }
        interfaceC0970M3621.mo1720();
        AbstractC2112.f10448.putObjectVolatile(this, f9324, C2329.f11479);
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final boolean m3626(Throwable th) {
        C1853 c1853;
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f9325;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof InterfaceC0576)) {
                return false;
            }
            C1259 c1259 = new C1259(this, th, (objectVolatile instanceof InterfaceC0230) || (objectVolatile instanceof AbstractC0381));
            while (true) {
                Unsafe unsafe2 = AbstractC2112.f10448;
                c1853 = this;
                if (unsafe2.compareAndSwapObject(c1853, f9325, objectVolatile, c1259)) {
                    InterfaceC0576 interfaceC0576 = (InterfaceC0576) objectVolatile;
                    if (interfaceC0576 instanceof InterfaceC0230) {
                        c1853.m3619((InterfaceC0230) objectVolatile, th);
                    } else if (interfaceC0576 instanceof AbstractC0381) {
                        c1853.m3635((AbstractC0381) objectVolatile, th);
                    }
                    if (!c1853.m3624()) {
                        c1853.m3623();
                    }
                    c1853.m3633(c1853.f10086);
                    return true;
                }
                if (unsafe2.getObjectVolatile(c1853, j) != objectVolatile) {
                    break;
                }
                this = c1853;
            }
            this = c1853;
        }
    }

    @Override // yyds.AbstractC2017
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Throwable mo3627(Object obj) {
        Throwable thMo3627 = super.mo3627(obj);
        if (thMo3627 != null) {
            return thMo3627;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final Object m3628() {
        return AbstractC2112.f10448.getObjectVolatile(this, f9325);
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final Object m3629() throws Throwable {
        InterfaceC2798 interfaceC2798;
        boolean zM3624 = m3624();
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f9323;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    C0188.m800("Already suspended");
                    return null;
                }
                if (zM3624) {
                    this.m3618();
                }
                Object objM3628 = this.m3628();
                if (objM3628 instanceof C0417) {
                    throw ((C0417) objM3628).f2152;
                }
                int i2 = this.f10086;
                if ((i2 != 1 && i2 != 2) || (interfaceC2798 = (InterfaceC2798) this.f9326.mo423(C1586.f8041)) == null || interfaceC2798.mo2091()) {
                    return this.mo3620(objM3628);
                }
                CancellationException cancellationExceptionMo2092 = interfaceC2798.mo2092();
                this.mo3634(cancellationExceptionMo2092);
                throw cancellationExceptionMo2092;
            }
            C1853 c1853 = this;
            if (unsafe.compareAndSwapInt(c1853, j, intVolatile, 536870912 + (536870911 & intVolatile))) {
                if (((InterfaceC0970) unsafe.getObjectVolatile(c1853, f9324)) == null) {
                    c1853.m3621();
                }
                if (zM3624) {
                    c1853.m3618();
                }
                return EnumC1765.f8858;
            }
            this = c1853;
        }
    }

    @Override // yyds.InterfaceC1617
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final C0415 mo3312(C1911 c1911) {
        return m3630(C2746.f13459, c1911);
    }

    @Override // yyds.InterfaceC1617
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public final void mo3313(Object obj) {
        m3633(this.f10086);
    }

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public final C0415 m3630(Object obj, InterfaceC0295 interfaceC0295) {
        C1853 c1853;
        C0415 c0415 = AbstractC2408.f11840;
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f9325;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof InterfaceC0576)) {
                return null;
            }
            Object objM3617 = m3617((InterfaceC0576) objectVolatile, obj, this.f10086, interfaceC0295);
            while (true) {
                Unsafe unsafe2 = AbstractC2112.f10448;
                c1853 = this;
                if (unsafe2.compareAndSwapObject(c1853, f9325, objectVolatile, objM3617)) {
                    if (!c1853.m3624()) {
                        c1853.m3623();
                    }
                    return c0415;
                }
                if (unsafe2.getObjectVolatile(c1853, j) != objectVolatile) {
                    break;
                }
                this = c1853;
            }
            this = c1853;
        }
    }

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ */
    public String mo1355() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final void m3631(Object obj, int i, InterfaceC0295 interfaceC0295) {
        C1853 c1853;
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f9325;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof InterfaceC0576)) {
                C1853 c18532 = this;
                if (objectVolatile instanceof C1259) {
                    C1259 c1259 = (C1259) objectVolatile;
                    if (unsafe.compareAndSwapInt(c1259, C1259.f5817, 0, 1)) {
                        if (interfaceC0295 != null) {
                            c18532.m3622(interfaceC0295, c1259.f2152, obj);
                            return;
                        }
                        return;
                    }
                }
                C0188.m791(obj, "Already resumed, but proposed with update ");
                return;
            }
            Object objM3617 = m3617((InterfaceC0576) objectVolatile, obj, i, interfaceC0295);
            while (true) {
                Unsafe unsafe2 = AbstractC2112.f10448;
                c1853 = this;
                if (unsafe2.compareAndSwapObject(c1853, f9325, objectVolatile, objM3617)) {
                    if (!c1853.m3624()) {
                        c1853.m3623();
                    }
                    c1853.m3633(i);
                    return;
                } else if (unsafe2.getObjectVolatile(c1853, j) != objectVolatile) {
                    break;
                } else {
                    this = c1853;
                }
            }
            this = c1853;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public final void m3632(AbstractC0974 abstractC0974) {
        InterfaceC0274 interfaceC0274 = this.f9327;
        C1118 c1118 = interfaceC0274 instanceof C1118 ? (C1118) interfaceC0274 : null;
        m3631(C2746.f13459, (c1118 != null ? c1118.f5140 : null) == abstractC0974 ? 4 : this.f10086, null);
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final void m3633(int i) {
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f9323;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    C0188.m800("Already resumed");
                    return;
                }
                boolean z = i == 4;
                InterfaceC0274 interfaceC0274 = this.f9327;
                if (!z && (interfaceC0274 instanceof C1118)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.f10086;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        C1118 c1118 = (C1118) interfaceC0274;
                        AbstractC0974 abstractC0974 = c1118.f5140;
                        InterfaceC2213 interfaceC2213 = c1118.f5139.f6070;
                        if (abstractC0974.mo2117(interfaceC2213)) {
                            abstractC0974.mo1251(interfaceC2213, this);
                            return;
                        }
                        AbstractC0467 abstractC0467M4643 = AbstractC2567.m4643();
                        if (abstractC0467M4643.f2325 < 4294967296L) {
                            abstractC0467M4643.m1250(true);
                            try {
                                AbstractC1741.m3481(this, interfaceC0274, true);
                                do {
                                } while (abstractC0467M4643.m1243());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            return;
                        }
                        C0217 c0217 = abstractC0467M4643.f2324;
                        if (c0217 == null) {
                            c0217 = new C0217();
                            abstractC0467M4643.f2324 = c0217;
                        }
                        c0217.addLast(this);
                        return;
                    }
                }
                AbstractC1741.m3481(this, interfaceC0274, z);
                return;
            }
            C1853 c1853 = this;
            if (unsafe.compareAndSwapInt(c1853, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = c1853;
            }
        }
    }

    @Override // yyds.AbstractC2017
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void mo3634(CancellationException cancellationException) {
        CancellationException cancellationException2;
        C1853 c1853;
        while (true) {
            Unsafe unsafe = AbstractC2112.f10448;
            long j = f9325;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof InterfaceC0576) {
                C0188.m800("Not completed");
                return;
            }
            if (objectVolatile instanceof C0417) {
                return;
            }
            if (objectVolatile instanceof C0697) {
                C0697 c0697 = (C0697) objectVolatile;
                if (c0697.f3291 != null) {
                    C0188.m800("Must be called at most once");
                    return;
                }
                C0697 c0697M1616 = C0697.m1616(c0697, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = AbstractC2112.f10448;
                    C1853 c18532 = this;
                    if (unsafe2.compareAndSwapObject(c18532, f9325, objectVolatile, c0697M1616)) {
                        InterfaceC0230 interfaceC0230 = c0697.f3293;
                        if (interfaceC0230 != null) {
                            c18532.m3619(interfaceC0230, cancellationException);
                        }
                        InterfaceC0295 interfaceC0295 = c0697.f3294;
                        if (interfaceC0295 != null) {
                            c18532.m3622(interfaceC0295, cancellationException, c0697.f3292);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(c18532, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        c1853 = c18532;
                        break;
                    }
                    this = c18532;
                }
            } else {
                C1853 c18533 = this;
                CancellationException cancellationException3 = cancellationException;
                C0697 c06972 = new C0697(objectVolatile, (InterfaceC0230) null, (InterfaceC0295) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    C0697 c06973 = c06972;
                    Unsafe unsafe3 = AbstractC2112.f10448;
                    c1853 = c18533;
                    boolean zCompareAndSwapObject = unsafe3.compareAndSwapObject(c1853, f9325, objectVolatile, c06973);
                    c06972 = c06973;
                    if (zCompareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(c1853, j) != objectVolatile) {
                        break;
                    } else {
                        c18533 = c1853;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = c1853;
        }
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void m3635(AbstractC0381 abstractC0381, Throwable th) {
        int intVolatile = AbstractC2112.f10448.getIntVolatile(this, f9323) & 536870911;
        if (intVolatile == 536870911) {
            C0188.m800("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            abstractC0381.mo1086(intVolatile);
        } catch (Throwable th2) {
            AbstractC2071.m3956(this.f9326, new C1738("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // yyds.AbstractC2017
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final InterfaceC0274 mo2311() {
        return this.f9327;
    }

    @Override // yyds.InterfaceC1431
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final InterfaceC1431 mo1008() {
        InterfaceC0274 interfaceC0274 = this.f9327;
        if (interfaceC0274 instanceof InterfaceC1431) {
            return (InterfaceC1431) interfaceC0274;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c6, code lost:
    
        m3616(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:
    
        throw null;
     */
    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3636(InterfaceC0576 interfaceC0576) {
        InterfaceC0576 interfaceC05762;
        C1853 c1853;
        C1853 c18532;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = AbstractC2112.f10448;
            long j = f9325;
            Object objectVolatile = unsafe2.getObjectVolatile(this, j);
            if (objectVolatile instanceof C2583) {
                while (true) {
                    Unsafe unsafe3 = AbstractC2112.f10448;
                    C1853 c18533 = this;
                    InterfaceC0576 interfaceC05763 = interfaceC0576;
                    c1853 = c18533;
                    interfaceC05762 = interfaceC05763;
                    if (unsafe3.compareAndSwapObject(c18533, f9325, objectVolatile, interfaceC05763)) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(c1853, j) != objectVolatile) {
                        break;
                    }
                    this = c1853;
                    interfaceC0576 = interfaceC05762;
                }
            } else {
                interfaceC05762 = interfaceC0576;
                c1853 = this;
                if ((objectVolatile instanceof InterfaceC0230) || (objectVolatile instanceof AbstractC0381)) {
                    break;
                }
                if (objectVolatile instanceof C0417) {
                    C0417 c0417 = (C0417) objectVolatile;
                    if (!unsafe2.compareAndSwapInt(c0417, C0417.f2151, 0, 1)) {
                        m3616(interfaceC05762, objectVolatile);
                        throw null;
                    }
                    if (objectVolatile instanceof C1259) {
                        Throwable th = c0417.f2152;
                        if (interfaceC05762 instanceof InterfaceC0230) {
                            c1853.m3619((InterfaceC0230) interfaceC05762, th);
                            return;
                        } else {
                            c1853.m3635((AbstractC0381) interfaceC05762, th);
                            return;
                        }
                    }
                    return;
                }
                if (objectVolatile instanceof C0697) {
                    C0697 c0697 = (C0697) objectVolatile;
                    if (c0697.f3293 != null) {
                        m3616(interfaceC05762, objectVolatile);
                        throw null;
                    }
                    if (interfaceC05762 instanceof AbstractC0381) {
                        return;
                    }
                    InterfaceC0230 interfaceC0230 = (InterfaceC0230) interfaceC05762;
                    Throwable th2 = c0697.f3291;
                    if (th2 != null) {
                        c1853.m3619(interfaceC0230, th2);
                        return;
                    }
                    C0697 c0697M1616 = C0697.m1616(c0697, interfaceC0230, null, 29);
                    do {
                        unsafe = AbstractC2112.f10448;
                        if (unsafe.compareAndSwapObject(c1853, f9325, objectVolatile, c0697M1616)) {
                            return;
                        }
                    } while (unsafe.getObjectVolatile(c1853, j) == objectVolatile);
                } else {
                    if (interfaceC05762 instanceof AbstractC0381) {
                        return;
                    }
                    C0697 c06972 = new C0697(objectVolatile, (InterfaceC0230) interfaceC05762, (InterfaceC0295) null, (Throwable) null, 28);
                    while (true) {
                        C0697 c06973 = c06972;
                        Unsafe unsafe4 = AbstractC2112.f10448;
                        c18532 = c1853;
                        boolean zCompareAndSwapObject = unsafe4.compareAndSwapObject(c18532, f9325, objectVolatile, c06973);
                        c06972 = c06973;
                        if (zCompareAndSwapObject) {
                            return;
                        }
                        if (unsafe4.getObjectVolatile(c18532, j) != objectVolatile) {
                            break;
                        } else {
                            c1853 = c18532;
                        }
                    }
                    this = c18532;
                    interfaceC0576 = interfaceC05762;
                }
            }
            c18532 = c1853;
            this = c18532;
            interfaceC0576 = interfaceC05762;
        }
    }
}
