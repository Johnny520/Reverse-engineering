package p000;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class e31 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0742sw f1284a;

    /* JADX INFO: renamed from: c */
    public boolean f1286c;

    /* JADX INFO: renamed from: h */
    public yk0 f1291h;

    /* JADX INFO: renamed from: i */
    public d31 f1292i;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f1285b = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final C0956ya f1287d = new C0956ya(9, this);

    /* JADX INFO: renamed from: e */
    public final C0532o f1288e = new C0532o(22, this);

    /* JADX INFO: renamed from: f */
    public final sh0 f1289f = new sh0(new d31[16]);

    /* JADX INFO: renamed from: g */
    public final Object f1290g = new Object();

    /* JADX INFO: renamed from: j */
    public long f1293j = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e31(InterfaceC0742sw interfaceC0742sw) {
        this.f1284a = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m776a() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.f1290g) {
            z = this.f1286c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.f1285b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        AbstractC0653qi.m3253b("Unexpected notification");
                        throw new C0725sg();
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                while (!atomicReference.compareAndSet(obj, obj2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.f1290g) {
                sh0 sh0Var = this.f1289f;
                Object[] objArr = sh0Var.f5768d;
                int i = sh0Var.f5770f;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((d31) objArr[i2]).m630a(set) || z2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f5  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m777b(Object obj, InterfaceC0742sw interfaceC0742sw, InterfaceC0298hw interfaceC0298hw) {
        Object obj2;
        d31 d31Var;
        boolean z;
        ch0 ch0Var;
        l21 e91Var;
        Object obj3;
        Object obj4;
        Object obj5;
        long[] jArr;
        Object obj6;
        int i;
        long[] jArr2;
        long j;
        synchronized (this.f1290g) {
            sh0 sh0Var = this.f1289f;
            Object[] objArr = sh0Var.f5768d;
            int i2 = sh0Var.f5770f;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((d31) obj2).f954a == interfaceC0742sw) {
                    break;
                } else {
                    i3++;
                }
            }
            d31Var = (d31) obj2;
            z = true;
            if (d31Var == null) {
                interfaceC0742sw.getClass();
                s91.m4048m(1, interfaceC0742sw);
                d31Var = new d31(interfaceC0742sw);
                sh0Var.m4072b(d31Var);
            }
        }
        d31 d31Var2 = this.f1292i;
        long j2 = this.f1293j;
        if (j2 != -1 && j2 != u50.m4266g()) {
            wr0.m5024a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j2 + "), currentThread={id=" + u50.m4266g() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.f1292i = d31Var;
            this.f1293j = u50.m4266g();
            C0532o c0532o = this.f1288e;
            Object obj7 = d31Var.f955b;
            ch0 ch0Var2 = d31Var.f956c;
            int i4 = d31Var.f957d;
            d31Var.f955b = obj;
            d31Var.f956c = (ch0) d31Var.f959f.m1701g(obj);
            if (d31Var.f957d == -1) {
                d31Var.f957d = Long.hashCode(t21.m4172j().mo811g());
            }
            C0552oi c0552oi = d31Var.f962i;
            sh0 sh0VarM3409k = r60.m3409k();
            try {
                sh0VarM3409k.m4072b(c0552oi);
                if (c0532o == null) {
                    interfaceC0298hw.invoke();
                    ch0Var = ch0Var2;
                } else {
                    l21 l21Var = (l21) t21.f5892b.m2801e();
                    if (l21Var instanceof e91) {
                        ch0Var = ch0Var2;
                        if (((e91) l21Var).f1359t == u50.m4266g()) {
                            InterfaceC0742sw interfaceC0742sw2 = ((e91) l21Var).f1357r;
                            InterfaceC0742sw interfaceC0742sw3 = ((e91) l21Var).f1358s;
                            try {
                                ((e91) l21Var).f1357r = t21.m4173k(c0532o, interfaceC0742sw2, true);
                                ((e91) l21Var).f1358s = interfaceC0742sw3;
                                interfaceC0298hw.invoke();
                                ((e91) l21Var).f1357r = interfaceC0742sw2;
                                ((e91) l21Var).f1358s = interfaceC0742sw3;
                            } catch (Throwable th) {
                                ((e91) l21Var).f1357r = interfaceC0742sw2;
                                ((e91) l21Var).f1358s = interfaceC0742sw3;
                                throw th;
                            }
                        }
                    } else {
                        ch0Var = ch0Var2;
                    }
                    if (l21Var == null || (l21Var instanceof nh0)) {
                        e91Var = new e91(l21Var instanceof nh0 ? (nh0) l21Var : null, c0532o, null, true, false);
                    } else {
                        e91Var = l21Var.mo821u(c0532o);
                    }
                    try {
                        l21 l21VarM1969j = e91Var.m1969j();
                        try {
                            interfaceC0298hw.invoke();
                            l21.m1966q(l21VarM1969j);
                            e91Var.mo807c();
                        } catch (Throwable th2) {
                            try {
                                l21.m1966q(l21VarM1969j);
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    e91Var.mo807c();
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                    sh0VarM3409k.m4081k(sh0VarM3409k.f5770f - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                sh0VarM3409k.m4081k(sh0VarM3409k.f5770f - 1);
                Object obj8 = d31Var.f955b;
                obj8.getClass();
                int i5 = d31Var.f957d;
                ch0 ch0Var3 = d31Var.f956c;
                if (ch0Var3 != null) {
                    long[] jArr3 = ch0Var3.f810a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j3 = jArr3[i6];
                            boolean z2 = z;
                            obj4 = obj7;
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j3 & 255) < 128) {
                                        i = i8;
                                        int i9 = (i6 << 3) + i;
                                        jArr2 = jArr3;
                                        Object obj9 = ch0Var3.f811b[i9];
                                        j = j3;
                                        boolean z3 = ch0Var3.f812c[i9] != i5 ? z2 : false;
                                        if (z3) {
                                            jh0 jh0Var = d31Var.f958e;
                                            u50.m4281x(jh0Var, obj9, obj8);
                                            obj6 = obj8;
                                            if ((obj9 instanceof C0135dn) && !jh0Var.m1697c(obj9)) {
                                                u50.m4282y(d31Var.f965l, obj9);
                                                d31Var.f966m.remove(obj9);
                                            }
                                        } else {
                                            obj6 = obj8;
                                        }
                                        if (z3) {
                                            ch0Var3.m536f(i9);
                                        }
                                    } else {
                                        obj6 = obj8;
                                        i = i8;
                                        jArr2 = jArr3;
                                        j = j3;
                                    }
                                    j3 = j >> 8;
                                    i8 = i + 1;
                                    jArr3 = jArr2;
                                    obj8 = obj6;
                                }
                                obj5 = obj8;
                                jArr = jArr3;
                                if (i7 != 8) {
                                    break;
                                }
                            } else {
                                obj5 = obj8;
                                jArr = jArr3;
                            }
                            if (i6 == length) {
                                break;
                            }
                            i6++;
                            z = z2;
                            obj7 = obj4;
                            jArr3 = jArr;
                            obj8 = obj5;
                        }
                        obj3 = obj4;
                    } else {
                        obj3 = obj7;
                    }
                }
                d31Var.f955b = obj3;
                d31Var.f956c = ch0Var;
                d31Var.f957d = i4;
                this.f1292i = d31Var2;
                this.f1293j = j2;
            } catch (Throwable th6) {
                th = th6;
                sh0VarM3409k.m4081k(sh0VarM3409k.f5770f - 1);
                throw th;
            }
        } finally {
            this.f1292i = d31Var2;
            this.f1293j = j2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m778c() {
        C0956ya c0956ya = this.f1287d;
        t21.m4167e(t21.f5891a);
        synchronized (t21.f5893c) {
            t21.f5898h = AbstractC0960ye.m5248R(t21.f5898h, c0956ya);
        }
        this.f1291h = new yk0(c0956ya);
    }
}
