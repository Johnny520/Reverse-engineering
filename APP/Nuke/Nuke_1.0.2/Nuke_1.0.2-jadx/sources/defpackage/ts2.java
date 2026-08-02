package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ts2 {
    public final in0 a;
    public boolean c;
    public rl1 h;
    public ss2 i;
    public final AtomicReference b = new AtomicReference(null);
    public final s9 d = new s9(20, this);
    public final xq2 e = new xq2(2, this);
    public final zk1 f = new zk1(new ss2[16]);
    public final Object g = new Object();
    public long j = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ts2(in0 in0Var) {
        this.a = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        synchronized (this.g) {
            zk1 zk1Var = this.f;
            Object[] objArr = zk1Var.h;
            int i = zk1Var.j;
            for (int i2 = 0; i2 < i; i2++) {
                ss2 ss2Var = (ss2) objArr[i2];
                ss2Var.e.a();
                ss2Var.f.a();
                ss2Var.l.a();
                ss2Var.m.clear();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
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
                        tx.b("Unexpected notification");
                        s.b();
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
                return z2;
            }
            synchronized (this.g) {
                zk1 zk1Var = this.f;
                Object[] objArr = zk1Var.h;
                int i = zk1Var.j;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((ss2) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: long */
    /* JADX DEBUG: Multi-variable search result rejected for r6v20, resolved type: long */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: long */
    /* JADX DEBUG: Multi-variable search result rejected for r6v9, resolved type: long */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj, in0 in0Var, xm0 xm0Var) {
        zk1 zk1Var;
        Object obj2;
        ss2 ss2Var;
        boolean z;
        ss2 ss2Var2;
        long j;
        long j2;
        ss2 ss2Var3;
        vr2 a43Var;
        long j3;
        gk1 gk1Var;
        int i;
        long j4;
        gk1 gk1Var2;
        long jB = v93.b();
        synchronized (this.g) {
            zk1Var = this.f;
            Object[] objArr = zk1Var.h;
            int i2 = zk1Var.j;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((ss2) obj2).a == in0Var) {
                    break;
                } else {
                    i3++;
                }
            }
            ss2Var = (ss2) obj2;
            z = true;
            if (ss2Var == null) {
                in0Var.getClass();
                xe1.f(1, in0Var);
                ss2Var = new ss2(in0Var);
                zk1Var.b(ss2Var);
            }
            ss2Var2 = this.i;
            j = this.j;
        }
        Object obj3 = zk1Var;
        if (j != -1) {
            obj3 = zk1Var;
            if (j != jB) {
                j22.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + jB + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                obj3 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
            }
        }
        try {
            synchronized (this.g) {
                try {
                    this.i = ss2Var;
                    this.j = jB;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj3;
                }
            }
            xq2 xq2Var = this.e;
            Object obj4 = ss2Var.b;
            gk1 gk1Var3 = ss2Var.c;
            int i4 = ss2Var.d;
            ss2Var.b = obj;
            ss2Var.c = (gk1) ss2Var.f.g(obj);
            if (ss2Var.d == -1) {
                ss2Var.d = Long.hashCode(ds2.j().g());
            }
            fo0 fo0Var = ss2Var.i;
            zk1 zk1VarL = op0.l();
            try {
                zk1VarL.b(fo0Var);
                if (xq2Var == null) {
                    xm0Var.a();
                    ss2Var3 = ss2Var;
                } else {
                    vr2 vr2Var = (vr2) ds2.b.p();
                    if (vr2Var instanceof a43) {
                        ss2Var3 = ss2Var;
                        if (((a43) vr2Var).t == v93.b()) {
                            in0 in0Var2 = ((a43) vr2Var).r;
                            in0 in0Var3 = ((a43) vr2Var).s;
                            try {
                                ((a43) vr2Var).r = ds2.k(xq2Var, in0Var2, true);
                                ((a43) vr2Var).s = in0Var3;
                                xm0Var.a();
                                ((a43) vr2Var).r = in0Var2;
                                ((a43) vr2Var).s = in0Var3;
                            } catch (Throwable th2) {
                                ((a43) vr2Var).r = in0Var2;
                                ((a43) vr2Var).s = in0Var3;
                                throw th2;
                            }
                        }
                    } else {
                        ss2Var3 = ss2Var;
                    }
                    if (vr2Var == null || (vr2Var instanceof wk1)) {
                        a43Var = new a43(vr2Var instanceof wk1 ? (wk1) vr2Var : null, xq2Var, null, true, false);
                    } else {
                        a43Var = vr2Var.u(xq2Var);
                    }
                    try {
                        vr2 vr2VarJ = a43Var.j();
                        try {
                            xm0Var.a();
                            vr2.q(vr2VarJ);
                            a43Var.c();
                        } catch (Throwable th3) {
                            try {
                                vr2.q(vr2VarJ);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    a43Var.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    zk1VarL.k(zk1VarL.j - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                zk1VarL.k(zk1VarL.j - 1);
                ss2 ss2Var4 = ss2Var3;
                Object obj5 = ss2Var4.b;
                obj5.getClass();
                int i5 = ss2Var4.d;
                gk1 gk1Var4 = ss2Var4.c;
                if (gk1Var4 != null) {
                    try {
                        long[] jArr = gk1Var4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j5 = jArr[i6];
                                boolean z2 = z;
                                gk1 gk1Var5 = gk1Var4;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j5 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j5;
                                            gk1Var2 = gk1Var5;
                                            Object obj6 = gk1Var2.b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = gk1Var2.c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    ss2Var4.c(obj5, obj6);
                                                }
                                                if (z3) {
                                                    gk1Var2.f(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.g) {
                                                }
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j5;
                                            gk1Var2 = gk1Var5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j6 = j3;
                                        gk1Var5 = gk1Var2;
                                        j5 = j4 >> 8;
                                        j = j6;
                                    }
                                    gk1Var = gk1Var5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    gk1Var = gk1Var5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                gk1Var4 = gk1Var;
                                z = z2;
                                j = j3;
                            }
                        } else {
                            j3 = j;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.g) {
                            this.i = ss2Var2;
                            this.j = j2;
                        }
                        throw th;
                    }
                }
                ss2Var4.b = obj4;
                ss2Var4.c = gk1Var3;
                ss2Var4.d = i4;
                synchronized (this.g) {
                    this.i = ss2Var2;
                    this.j = j3;
                }
            } catch (Throwable th9) {
                th = th9;
                zk1VarL.k(zk1VarL.j - 1);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        s9 s9Var = this.d;
        ds2.e(ds2.a);
        synchronized (ds2.c) {
            ds2.h = du.y0(ds2.h, s9Var);
        }
        this.h = new rl1(s9Var);
    }
}
