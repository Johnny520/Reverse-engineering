package p322w0;

import gg.AbstractC1428x;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import okio.C3193a;
import p015b0.C0154t;
import p069f.C0925b0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.AbstractC1855m;
import p117i0.AbstractC1861n1;
import p117i0.AbstractC1874r;
import p117i0.C1832g0;
import p131j0.C2046b;
import p198nb.C2924a;
import p222p.AbstractC3199a;
import p243q9.C3465a;
import p266s0.AbstractC3879i;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: w0.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4668s {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1231l f15536a;

    /* JADX INFO: renamed from: c */
    public boolean f15538c;

    /* JADX INFO: renamed from: h */
    public C3465a f15543h;

    /* JADX INFO: renamed from: i */
    public C4667r f15544i;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f15537b = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final C0154t f15539d = new C0154t(this, 25);

    /* JADX INFO: renamed from: e */
    public final C2924a f15540e = new C2924a(this, 22);

    /* JADX INFO: renamed from: f */
    public final C2046b f15541f = new C2046b(new C4667r[16]);

    /* JADX INFO: renamed from: g */
    public final Object f15542g = new Object();

    /* JADX INFO: renamed from: j */
    public long f15545j = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4668s(InterfaceC1231l interfaceC1231l) {
        this.f15536a = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m9160a() {
        synchronized (this.f15542g) {
            C2046b c2046b = this.f15541f;
            Object[] objArr = c2046b.f6891g;
            int i9 = c2046b.f6893i;
            for (int i10 = 0; i10 < i9; i10++) {
                C4667r c4667r = (C4667r) objArr[i10];
                c4667r.f15527e.m2314a();
                c4667r.f15528f.m2314a();
                c4667r.f15534l.m2314a();
                c4667r.f15535m.clear();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m9161b() {
        boolean z9;
        Set set;
        Set set2;
        synchronized (this.f15542g) {
            z9 = this.f15538c;
        }
        if (z9) {
            return false;
        }
        boolean z10 = false;
        while (true) {
            AtomicReference atomicReference = this.f15537b;
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
                        AbstractC1855m.m4574b("Unexpected notification");
                        C3193a.m6814c();
                        return false;
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
                return z10;
            }
            synchronized (this.f15542g) {
                C2046b c2046b = this.f15541f;
                Object[] objArr = c2046b.f6891g;
                int i9 = c2046b.f6893i;
                for (int i10 = 0; i10 < i9; i10++) {
                    z10 = ((C4667r) objArr[i10]).m9156a(set) || z10;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v19, resolved type: long */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: long */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: long */
    /* JADX DEBUG: Multi-variable search result rejected for r6v9, resolved type: long */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x021b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d8  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9162c(Object obj, InterfaceC1231l interfaceC1231l, InterfaceC1220a interfaceC1220a) {
        C2046b c2046b;
        Object obj2;
        C4667r c4667r;
        boolean z9;
        C4667r c4667r2;
        long j3;
        long j4;
        C4667r c4667r3;
        AbstractC4655f c4674y;
        long j5;
        C0925b0 c0925b0;
        int i9;
        long j10;
        C0925b0 c0925b02;
        long jM8069c = AbstractC3879i.m8069c();
        synchronized (this.f15542g) {
            c2046b = this.f15541f;
            Object[] objArr = c2046b.f6891g;
            int i10 = c2046b.f6893i;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i11];
                if (((C4667r) obj2).f15523a == interfaceC1231l) {
                    break;
                } else {
                    i11++;
                }
            }
            c4667r = (C4667r) obj2;
            z9 = true;
            if (c4667r == null) {
                interfaceC1231l.getClass();
                AbstractC1428x.m3838c(1, interfaceC1231l);
                c4667r = new C4667r(interfaceC1231l);
                c2046b.m5056b(c4667r);
            }
            c4667r2 = this.f15544i;
            j3 = this.f15545j;
        }
        Object obj3 = c2046b;
        if (j3 != -1) {
            obj3 = c2046b;
            if (j3 != jM8069c) {
                StringBuilder sbM6842o = AbstractC3199a.m6842o(j3, "Detected multithreaded access to SnapshotStateObserver: previousThreadId=", "), currentThread={id=");
                sbM6842o.append(jM8069c);
                sbM6842o.append(", name=");
                sbM6842o.append(Thread.currentThread().getName());
                sbM6842o.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                AbstractC1861n1.m4583a(sbM6842o.toString());
                obj3 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
            }
        }
        try {
            synchronized (this.f15542g) {
                try {
                    this.f15544i = c4667r;
                    this.f15545j = jM8069c;
                } catch (Throwable th2) {
                    th = th2;
                    j4 = obj3;
                }
            }
            C2924a c2924a = this.f15540e;
            Object obj4 = c4667r.f15524b;
            C0925b0 c0925b03 = c4667r.f15525c;
            int i12 = c4667r.f15526d;
            c4667r.f15524b = obj;
            c4667r.f15525c = (C0925b0) c4667r.f15528f.m2320g(obj);
            if (c4667r.f15526d == -1) {
                c4667r.f15526d = Long.hashCode(AbstractC4662m.m9129j().mo9109g());
            }
            C1832g0 c1832g0 = c4667r.f15531i;
            C2046b c2046bM4633o = AbstractC1874r.m4633o();
            try {
                c2046bM4633o.m5056b(c1832g0);
                if (c2924a == null) {
                    interfaceC1220a.invoke();
                    c4667r3 = c4667r;
                } else {
                    AbstractC4655f abstractC4655f = (AbstractC4655f) AbstractC4662m.f15511b.m818o();
                    if (abstractC4655f instanceof C4674y) {
                        c4667r3 = c4667r;
                        if (((C4674y) abstractC4655f).f15561t == AbstractC3879i.m8069c()) {
                            InterfaceC1231l interfaceC1231l2 = ((C4674y) abstractC4655f).f15559r;
                            InterfaceC1231l interfaceC1231l3 = ((C4674y) abstractC4655f).f15560s;
                            try {
                                ((C4674y) abstractC4655f).f15559r = AbstractC4662m.m9130k(c2924a, interfaceC1231l2, true);
                                ((C4674y) abstractC4655f).f15560s = interfaceC1231l3;
                                interfaceC1220a.invoke();
                                ((C4674y) abstractC4655f).f15559r = interfaceC1231l2;
                                ((C4674y) abstractC4655f).f15560s = interfaceC1231l3;
                            } catch (Throwable th3) {
                                ((C4674y) abstractC4655f).f15559r = interfaceC1231l2;
                                ((C4674y) abstractC4655f).f15560s = interfaceC1231l3;
                                throw th3;
                            }
                        }
                    } else {
                        c4667r3 = c4667r;
                    }
                    if (abstractC4655f == null || (abstractC4655f instanceof C4651b)) {
                        c4674y = new C4674y(abstractC4655f instanceof C4651b ? (C4651b) abstractC4655f : null, c2924a, null, true, false);
                    } else {
                        c4674y = abstractC4655f.mo9090u(c2924a);
                    }
                    try {
                        AbstractC4655f abstractC4655fM9110j = c4674y.m9110j();
                        try {
                            interfaceC1220a.invoke();
                            AbstractC4655f.m9106q(abstractC4655fM9110j);
                            c4674y.mo9086c();
                        } catch (Throwable th4) {
                            try {
                                AbstractC4655f.m9106q(abstractC4655fM9110j);
                                throw th4;
                            } catch (Throwable th5) {
                                th = th5;
                                try {
                                    c4674y.mo9086c();
                                    throw th;
                                } catch (Throwable th6) {
                                    th = th6;
                                    c2046bM4633o.m5065k(c2046bM4633o.f6893i - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                }
                c2046bM4633o.m5065k(c2046bM4633o.f6893i - 1);
                C4667r c4667r4 = c4667r3;
                Object obj5 = c4667r4.f15524b;
                obj5.getClass();
                int i13 = c4667r4.f15526d;
                C0925b0 c0925b04 = c4667r4.f15525c;
                if (c0925b04 != null) {
                    try {
                        long[] jArr = c0925b04.f2894a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j11 = jArr[i14];
                                boolean z10 = z9;
                                C0925b0 c0925b05 = c0925b04;
                                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                                    int i16 = 0;
                                    while (i16 < i15) {
                                        if ((j11 & 255) < 128) {
                                            i9 = i16;
                                            int i17 = (i14 << 3) + i9;
                                            j10 = j11;
                                            c0925b02 = c0925b05;
                                            Object obj6 = c0925b02.f2895b[i17];
                                            j5 = j3;
                                            try {
                                                boolean z11 = c0925b02.f2896c[i17] != i13 ? z10 : false;
                                                if (z11) {
                                                    c4667r4.m9158c(obj5, obj6);
                                                }
                                                if (z11) {
                                                    c0925b02.m2272f(i17);
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                                j4 = j5;
                                                synchronized (this.f15542g) {
                                                    this.f15544i = c4667r2;
                                                    this.f15545j = j4;
                                                }
                                                throw th;
                                            }
                                        } else {
                                            i9 = i16;
                                            j10 = j11;
                                            c0925b02 = c0925b05;
                                            j5 = j3;
                                        }
                                        i16 = i9 + 1;
                                        long j12 = j5;
                                        c0925b05 = c0925b02;
                                        j11 = j10 >> 8;
                                        j3 = j12;
                                    }
                                    c0925b0 = c0925b05;
                                    j5 = j3;
                                    if (i15 != 8) {
                                        break;
                                    }
                                } else {
                                    c0925b0 = c0925b05;
                                    j5 = j3;
                                }
                                if (i14 == length) {
                                    break;
                                }
                                i14++;
                                c0925b04 = c0925b0;
                                z9 = z10;
                                j3 = j5;
                            }
                        } else {
                            j5 = j3;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        j5 = j3;
                        j4 = j5;
                        synchronized (this.f15542g) {
                        }
                    }
                }
                c4667r4.f15524b = obj4;
                c4667r4.f15525c = c0925b03;
                c4667r4.f15526d = i12;
                synchronized (this.f15542g) {
                    this.f15544i = c4667r2;
                    this.f15545j = j5;
                }
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Throwable th11) {
            th = th11;
            j4 = j3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX INFO: renamed from: d */
    public final void m9163d() {
        C0154t c0154t = this.f15539d;
        AbstractC4662m.m9124e(AbstractC4662m.f15510a);
        synchronized (AbstractC4662m.f15512c) {
            AbstractC4662m.f15517h = AbstractC4166m.m8398G1(AbstractC4662m.f15517h, c0154t);
        }
        this.f15543h = new C3465a(c0154t, 10);
    }
}
