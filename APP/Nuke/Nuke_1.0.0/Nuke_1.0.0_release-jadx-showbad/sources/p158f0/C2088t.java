package p158f0;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p000A.C0002B;
import p000A.C0049a;
import p027E4.C0330q;
import p061L2.AbstractC0973m;
import p095T.AbstractC1380p0;
import p095T.AbstractC1385s;
import p095T.AbstractC1387t;
import p095T.C1381q;
import p105V.C1483e;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1678w;
import p135b.C1836x;
import p136b0.AbstractC1848j;
import p186k.C2444z;

/* JADX INFO: renamed from: f0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2088t {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1601c f6996a;

    /* JADX INFO: renamed from: c */
    public boolean f6998c;

    /* JADX INFO: renamed from: h */
    public C1836x f7003h;

    /* JADX INFO: renamed from: i */
    public C2087s f7004i;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f6997b = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final C0002B f6999d = new C0002B(16, this);

    /* JADX INFO: renamed from: e */
    public final C0049a f7000e = new C0049a(20, this);

    /* JADX INFO: renamed from: f */
    public final C1483e f7001f = new C1483e(new C2087s[16]);

    /* JADX INFO: renamed from: g */
    public final Object f7002g = new Object();

    /* JADX INFO: renamed from: j */
    public long f7005j = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2088t(InterfaceC1601c interfaceC1601c) {
        this.f6996a = interfaceC1601c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3865a() {
        synchronized (this.f7002g) {
            C1483e c1483e = this.f7001f;
            Object[] objArr = c1483e.f5181d;
            int i5 = c1483e.f5183f;
            for (int i6 = 0; i6 < i5; i6++) {
                C2087s c2087s = (C2087s) objArr[i6];
                c2087s.f6987e.m4266a();
                c2087s.f6988f.m4266a();
                c2087s.f6994l.m4266a();
                c2087s.f6995m.clear();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m3866b() {
        boolean z5;
        Set set;
        Set set2;
        synchronized (this.f7002g) {
            z5 = this.f6998c;
        }
        if (z5) {
            return false;
        }
        boolean z6 = false;
        while (true) {
            AtomicReference atomicReference = this.f6997b;
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
                        AbstractC1387t.m2639b("Unexpected notification");
                        throw new C0330q();
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
                return z6;
            }
            synchronized (this.f7002g) {
                C1483e c1483e = this.f7001f;
                Object[] objArr = c1483e.f5181d;
                int i5 = c1483e.f5183f;
                for (int i6 = 0; i6 < i5; i6++) {
                    z6 = ((C2087s) objArr[i6]).m3861a(set) || z6;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d1  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3867c(Object obj, InterfaceC1601c interfaceC1601c, InterfaceC1599a interfaceC1599a) {
        Object obj2;
        C2087s c2087s;
        boolean z5;
        C2444z c2444z;
        AbstractC2074f c2094z;
        Object obj3;
        Object obj4;
        long[] jArr;
        int i5;
        long[] jArr2;
        long j5;
        synchronized (this.f7002g) {
            C1483e c1483e = this.f7001f;
            Object[] objArr = c1483e.f5181d;
            int i6 = c1483e.f5183f;
            int i7 = 0;
            while (true) {
                if (i7 >= i6) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i7];
                if (((C2087s) obj2).f6983a == interfaceC1601c) {
                    break;
                } else {
                    i7++;
                }
            }
            c2087s = (C2087s) obj2;
            z5 = true;
            if (c2087s == null) {
                AbstractC1665j.m2983c(interfaceC1601c, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                AbstractC1678w.m2998b(1, interfaceC1601c);
                c2087s = new C2087s(interfaceC1601c);
                c1483e.m2753b(c2087s);
            }
        }
        C2087s c2087s2 = this.f7004i;
        long j6 = this.f7005j;
        if (j6 != -1 && j6 != AbstractC1848j.m3313b()) {
            AbstractC1380p0.m2542a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j6 + "), currentThread={id=" + AbstractC1848j.m3313b() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.f7004i = c2087s;
            this.f7005j = AbstractC1848j.m3313b();
            C0049a c0049a = this.f7000e;
            Object obj5 = c2087s.f6984b;
            C2444z c2444z2 = c2087s.f6985c;
            int i8 = c2087s.f6986d;
            c2087s.f6984b = obj;
            c2087s.f6985c = (C2444z) c2087s.f6988f.m4272g(obj);
            if (c2087s.f6986d == -1) {
                c2087s.f6986d = Long.hashCode(AbstractC2082n.m3834j().mo3791g());
            }
            C1381q c1381q = c2087s.f6991i;
            C1483e c1483eM2623m = AbstractC1385s.m2623m();
            try {
                c1483eM2623m.m2753b(c1381q);
                if (c0049a == null) {
                    interfaceC1599a.mo6a();
                    c2444z = c2444z2;
                } else {
                    AbstractC2074f abstractC2074f = (AbstractC2074f) AbstractC2082n.f6971b.m105i();
                    if (abstractC2074f instanceof C2094z) {
                        c2444z = c2444z2;
                        if (((C2094z) abstractC2074f).f7021t == AbstractC1848j.m3313b()) {
                            InterfaceC1601c interfaceC1601c2 = ((C2094z) abstractC2074f).f7019r;
                            InterfaceC1601c interfaceC1601c3 = ((C2094z) abstractC2074f).f7020s;
                            try {
                                ((C2094z) abstractC2074f).f7019r = AbstractC2082n.m3835k(c0049a, interfaceC1601c2, true);
                                ((C2094z) abstractC2074f).f7020s = interfaceC1601c3;
                                interfaceC1599a.mo6a();
                                ((C2094z) abstractC2074f).f7019r = interfaceC1601c2;
                                ((C2094z) abstractC2074f).f7020s = interfaceC1601c3;
                            } catch (Throwable th) {
                                ((C2094z) abstractC2074f).f7019r = interfaceC1601c2;
                                ((C2094z) abstractC2074f).f7020s = interfaceC1601c3;
                                throw th;
                            }
                        }
                    } else {
                        c2444z = c2444z2;
                    }
                    if (abstractC2074f == null || (abstractC2074f instanceof C2070b)) {
                        c2094z = new C2094z(abstractC2074f instanceof C2070b ? (C2070b) abstractC2074f : null, c0049a, null, true, false);
                    } else {
                        c2094z = abstractC2074f.mo3797u(c0049a);
                    }
                    try {
                        AbstractC2074f abstractC2074fM3813j = c2094z.m3813j();
                        try {
                            interfaceC1599a.mo6a();
                            AbstractC2074f.m3811q(abstractC2074fM3813j);
                            c2094z.mo3787c();
                        } catch (Throwable th2) {
                            try {
                                AbstractC2074f.m3811q(abstractC2074fM3813j);
                                throw th2;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    c2094z.mo3787c();
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                    c1483eM2623m.m2762k(c1483eM2623m.f5183f - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                c1483eM2623m.m2762k(c1483eM2623m.f5183f - 1);
                Object obj6 = c2087s.f6984b;
                AbstractC1665j.m2982b(obj6);
                int i9 = c2087s.f6986d;
                C2444z c2444z3 = c2087s.f6985c;
                if (c2444z3 != null) {
                    long[] jArr3 = c2444z3.f7898a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j7 = jArr3[i10];
                            boolean z6 = z5;
                            obj4 = obj5;
                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                int i12 = 0;
                                while (i12 < i11) {
                                    if ((j7 & 255) < 128) {
                                        i5 = i12;
                                        int i13 = (i10 << 3) + i5;
                                        jArr2 = jArr3;
                                        Object obj7 = c2444z3.f7899b[i13];
                                        j5 = j7;
                                        boolean z7 = c2444z3.f7900c[i13] != i9 ? z6 : false;
                                        if (z7) {
                                            c2087s.m3863c(obj6, obj7);
                                        }
                                        if (z7) {
                                            c2444z3.m4366f(i13);
                                        }
                                    } else {
                                        i5 = i12;
                                        jArr2 = jArr3;
                                        j5 = j7;
                                    }
                                    j7 = j5 >> 8;
                                    i12 = i5 + 1;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                if (i11 != 8) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10++;
                            z5 = z6;
                            obj5 = obj4;
                            jArr3 = jArr;
                        }
                        obj3 = obj4;
                    } else {
                        obj3 = obj5;
                    }
                }
                c2087s.f6984b = obj3;
                c2087s.f6985c = c2444z;
                c2087s.f6986d = i8;
                this.f7004i = c2087s2;
                this.f7005j = j6;
            } catch (Throwable th6) {
                th = th6;
            }
        } finally {
            this.f7004i = c2087s2;
            this.f7005j = j6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX INFO: renamed from: d */
    public final void m3868d() {
        C0002B c0002b = this.f6999d;
        AbstractC2082n.m3829e(AbstractC2082n.f6970a);
        synchronized (AbstractC2082n.f6972c) {
            AbstractC2082n.f6977h = AbstractC0973m.m2020a0(AbstractC2082n.f6977h, c0002b);
        }
        this.f7003h = new C1836x(2, c0002b);
    }
}
