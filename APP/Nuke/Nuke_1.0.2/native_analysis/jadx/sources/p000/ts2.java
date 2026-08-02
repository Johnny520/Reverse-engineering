package p000;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ts2 {

    /* JADX INFO: renamed from: a */
    public final in0 f10947a;

    /* JADX INFO: renamed from: c */
    public boolean f10949c;

    /* JADX INFO: renamed from: h */
    public rl1 f10954h;

    /* JADX INFO: renamed from: i */
    public ss2 f10955i;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f10948b = new AtomicReference(null);

    /* JADX INFO: renamed from: d */
    public final C0686s9 f10950d = new C0686s9(20, this);

    /* JADX INFO: renamed from: e */
    public final xq2 f10951e = new xq2(2, this);

    /* JADX INFO: renamed from: f */
    public final zk1 f10952f = new zk1(new ss2[16]);

    /* JADX INFO: renamed from: g */
    public final Object f10953g = new Object();

    /* JADX INFO: renamed from: j */
    public long f10956j = -1;

    public ts2(in0 in0Var) {
        this.f10947a = in0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m5434a() {
        synchronized (this.f10953g) {
            zk1 zk1Var = this.f10952f;
            Object[] objArr = zk1Var.f13934h;
            int i = zk1Var.f13936j;
            for (int i2 = 0; i2 < i; i2++) {
                ss2 ss2Var = (ss2) objArr[i2];
                ss2Var.f10353e.m4499a();
                ss2Var.f10354f.m4499a();
                ss2Var.f10360l.m4499a();
                ss2Var.f10361m.clear();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5435b() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.f10953g) {
            z = this.f10949c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.f10948b;
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
                        AbstractC0752tx.m5444b("Unexpected notification");
                        C0676s.m4644b();
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
            synchronized (this.f10953g) {
                zk1 zk1Var = this.f10952f;
                Object[] objArr = zk1Var.f13934h;
                int i = zk1Var.f13936j;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((ss2) objArr[i2]).m4996a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01df  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5436c(Object obj, in0 in0Var, xm0 xm0Var) {
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
        long jM5656b = v93.m5656b();
        synchronized (this.f10953g) {
            zk1Var = this.f10952f;
            Object[] objArr = zk1Var.f13934h;
            int i2 = zk1Var.f13936j;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((ss2) obj2).f10349a == in0Var) {
                    break;
                } else {
                    i3++;
                }
            }
            ss2Var = (ss2) obj2;
            z = true;
            if (ss2Var == null) {
                in0Var.getClass();
                xe1.m6119f(1, in0Var);
                ss2Var = new ss2(in0Var);
                zk1Var.m6423b(ss2Var);
            }
            ss2Var2 = this.f10955i;
            j = this.f10956j;
        }
        Object obj3 = zk1Var;
        if (j != -1) {
            obj3 = zk1Var;
            if (j != jM5656b) {
                j22.m2429a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + jM5656b + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                obj3 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
            }
        }
        try {
            synchronized (this.f10953g) {
                try {
                    this.f10955i = ss2Var;
                    this.f10956j = jM5656b;
                } catch (Throwable th) {
                    th = th;
                    j2 = obj3;
                }
            }
            xq2 xq2Var = this.f10951e;
            Object obj4 = ss2Var.f10350b;
            gk1 gk1Var3 = ss2Var.f10351c;
            int i4 = ss2Var.f10352d;
            ss2Var.f10350b = obj;
            ss2Var.f10351c = (gk1) ss2Var.f10354f.m4505g(obj);
            if (ss2Var.f10352d == -1) {
                ss2Var.f10352d = Long.hashCode(ds2.m1126j().mo79g());
            }
            fo0 fo0Var = ss2Var.f10357i;
            zk1 zk1VarM3589l = op0.m3589l();
            try {
                zk1VarM3589l.m6423b(fo0Var);
                if (xq2Var == null) {
                    xm0Var.mo6a();
                    ss2Var3 = ss2Var;
                } else {
                    vr2 vr2Var = (vr2) ds2.f2180b.m429p();
                    if (vr2Var instanceof a43) {
                        ss2Var3 = ss2Var;
                        if (((a43) vr2Var).f58t == v93.m5656b()) {
                            in0 in0Var2 = ((a43) vr2Var).f56r;
                            in0 in0Var3 = ((a43) vr2Var).f57s;
                            try {
                                ((a43) vr2Var).f56r = ds2.m1127k(xq2Var, in0Var2, true);
                                ((a43) vr2Var).f57s = in0Var3;
                                xm0Var.mo6a();
                                ((a43) vr2Var).f56r = in0Var2;
                                ((a43) vr2Var).f57s = in0Var3;
                            } catch (Throwable th2) {
                                ((a43) vr2Var).f56r = in0Var2;
                                ((a43) vr2Var).f57s = in0Var3;
                                throw th2;
                            }
                        }
                    } else {
                        ss2Var3 = ss2Var;
                    }
                    if (vr2Var == null || (vr2Var instanceof wk1)) {
                        a43Var = new a43(vr2Var instanceof wk1 ? (wk1) vr2Var : null, xq2Var, null, true, false);
                    } else {
                        a43Var = vr2Var.mo89u(xq2Var);
                    }
                    try {
                        vr2 vr2VarM5787j = a43Var.m5787j();
                        try {
                            xm0Var.mo6a();
                            vr2.m5784q(vr2VarM5787j);
                            a43Var.mo75c();
                        } catch (Throwable th3) {
                            try {
                                vr2.m5784q(vr2VarM5787j);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    a43Var.mo75c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    zk1VarM3589l.m6432k(zk1VarM3589l.f13936j - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                zk1VarM3589l.m6432k(zk1VarM3589l.f13936j - 1);
                ss2 ss2Var4 = ss2Var3;
                Object obj5 = ss2Var4.f10350b;
                obj5.getClass();
                int i5 = ss2Var4.f10352d;
                gk1 gk1Var4 = ss2Var4.f10351c;
                if (gk1Var4 != null) {
                    try {
                        long[] jArr = gk1Var4.f3552a;
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
                                            Object obj6 = gk1Var2.f3553b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = gk1Var2.f3554c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    ss2Var4.m4998c(obj5, obj6);
                                                }
                                                if (z3) {
                                                    gk1Var2.m1935f(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.f10953g) {
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
                        synchronized (this.f10953g) {
                            this.f10955i = ss2Var2;
                            this.f10956j = j2;
                        }
                        throw th;
                    }
                }
                ss2Var4.f10350b = obj4;
                ss2Var4.f10351c = gk1Var3;
                ss2Var4.f10352d = i4;
                synchronized (this.f10953g) {
                    this.f10955i = ss2Var2;
                    this.f10956j = j3;
                }
            } catch (Throwable th9) {
                th = th9;
                zk1VarM3589l.m6432k(zk1VarM3589l.f13936j - 1);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5437d() {
        C0686s9 c0686s9 = this.f10950d;
        ds2.m1121e(ds2.f2179a);
        synchronized (ds2.f2181c) {
            ds2.f2186h = AbstractC0142du.m1169y0(ds2.f2186h, c0686s9);
        }
        this.f10954h = new rl1(c0686s9);
    }
}
