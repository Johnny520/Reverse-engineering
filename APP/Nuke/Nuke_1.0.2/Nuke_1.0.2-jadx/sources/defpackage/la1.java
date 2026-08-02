package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class la1 extends ba1 {
    public final boolean a;
    public b5 b;
    public final mb3 c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public aa1 h;
    public final ju2 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public la1(ia1 ia1Var, boolean z) {
        new AtomicReference(null);
        this.a = z;
        this.b = new b5(12);
        this.c = new mb3(ia1Var);
        this.g = new ArrayList();
        aa1 aa1Var = aa1.i;
        this.h = aa1Var;
        this.i = pp0.f(aa1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ba1
    public final void a(ha1 ha1Var) {
        fa1 y50Var;
        ka1 ka1Var;
        ia1 ia1Var;
        ha1Var.getClass();
        d("addObserver");
        aa1 aa1Var = this.h;
        aa1 aa1Var2 = aa1.h;
        if (aa1Var != aa1Var2) {
            aa1Var2 = aa1.i;
        }
        ka1 ka1Var2 = new ka1();
        ka1Var2.a = aa1Var2;
        HashMap map = qa1.a;
        boolean z = ha1Var instanceof fa1;
        boolean z2 = ha1Var instanceof w50;
        int i = 2;
        if (z && z2) {
            y50Var = new y50((w50) ha1Var, (fa1) ha1Var);
        } else if (z2) {
            y50Var = new y50((w50) ha1Var, (fa1) null);
        } else if (z) {
            y50Var = (fa1) ha1Var;
        } else {
            Class<?> cls = ha1Var.getClass();
            if (qa1.b(cls) == 2) {
                Object obj = qa1.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    qa1.a((Constructor) list.get(0), ha1Var);
                    throw null;
                }
                int size = list.size();
                mo0[] mo0VarArr = new mo0[size];
                if (size > 0) {
                    qa1.a((Constructor) list.get(0), ha1Var);
                    throw null;
                }
                y50Var = new n62(i, mo0VarArr);
            } else {
                y50Var = new y50(ha1Var);
            }
        }
        ka1Var2.b = y50Var;
        b5 b5Var = this.b;
        b5Var.getClass();
        rk1 rk1Var = (rk1) b5Var.i;
        ei0 ei0Var = (ei0) rk1Var.g(ha1Var);
        if (ei0Var != null) {
            ka1Var = ei0Var.i;
        } else {
            ei0 ei0Var2 = new ei0(ha1Var, ka1Var2);
            rk1Var.m(ha1Var, ei0Var2);
            ei0 ei0Var3 = (ei0) b5Var.k;
            if (ei0Var3 == null) {
                b5Var.j = ei0Var2;
                b5Var.k = ei0Var2;
            } else {
                ei0Var3.j = ei0Var2;
                ei0Var2.k = ei0Var3;
                b5Var.k = ei0Var2;
            }
            ka1Var = null;
        }
        if (ka1Var == null && (ia1Var = (ia1) ((WeakReference) this.c.a).get()) != null) {
            boolean z3 = this.d != 0 || this.e;
            aa1 aa1VarC = c(ha1Var);
            this.d++;
            while (ka1Var2.a.compareTo(aa1VarC) < 0) {
                b5 b5Var2 = this.b;
                b5Var2.getClass();
                if (!((rk1) b5Var2.i).c(ha1Var)) {
                    break;
                }
                aa1 aa1Var3 = ka1Var2.a;
                ArrayList arrayList = this.g;
                arrayList.add(aa1Var3);
                x91 x91Var = z91.Companion;
                aa1 aa1Var4 = ka1Var2.a;
                x91Var.getClass();
                aa1Var4.getClass();
                int iOrdinal = aa1Var4.ordinal();
                z91 z91Var = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : z91.ON_RESUME : z91.ON_START : z91.ON_CREATE;
                if (z91Var == null) {
                    s.n("no event up from ", ka1Var2.a);
                    return;
                } else {
                    ka1Var2.a(ia1Var, z91Var);
                    iu.i0(arrayList);
                    aa1VarC = c(ha1Var);
                }
            }
            if (!z3) {
                g();
            }
            this.d--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ba1
    public final void b(ha1 ha1Var) {
        ha1Var.getClass();
        d("removeObserver");
        b5 b5Var = this.b;
        b5Var.getClass();
        ei0 ei0Var = (ei0) ((rk1) b5Var.i).k(ha1Var);
        if (ei0Var == null) {
            return;
        }
        ei0 ei0Var2 = ei0Var.k;
        ei0 ei0Var3 = ei0Var.j;
        if (ei0Var2 == null) {
            b5Var.j = ei0Var3;
        } else {
            ei0Var2.j = ei0Var3;
        }
        ei0 ei0Var4 = ei0Var.j;
        if (ei0Var4 == null) {
            b5Var.k = ei0Var2;
        } else {
            ei0Var4.k = ei0Var2;
        }
        ei0Var.l = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final aa1 c(ha1 ha1Var) {
        b5 b5Var = this.b;
        b5Var.getClass();
        ha1Var.getClass();
        ei0 ei0Var = (ei0) ((rk1) b5Var.i).g(ha1Var);
        ei0 ei0Var2 = ei0Var != null ? ei0Var.k : null;
        aa1 aa1Var = ei0Var2 != null ? ei0Var2.i.a : null;
        ArrayList arrayList = this.g;
        aa1 aa1Var2 = arrayList.isEmpty() ? null : (aa1) arrayList.get(arrayList.size() - 1);
        aa1 aa1Var3 = this.h;
        if (aa1Var == null || aa1Var.compareTo(aa1Var3) >= 0) {
            aa1Var = aa1Var3;
        }
        return (aa1Var2 == null || aa1Var2.compareTo(aa1Var) >= 0) ? aa1Var : aa1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(String str) {
        if (this.a) {
            ((tf) tf.Y().A).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            c80.h(vi0.j("Method ", str, " must be called on the main thread"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(z91 z91Var) {
        z91Var.getClass();
        d("handleLifecycleEvent");
        f(z91Var.a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(aa1 aa1Var) {
        if (this.h == aa1Var) {
            return;
        }
        ia1 ia1Var = (ia1) ((WeakReference) this.c.a).get();
        aa1 aa1Var2 = this.h;
        aa1 aa1Var3 = aa1.i;
        aa1 aa1Var4 = aa1.h;
        if (aa1Var2 == aa1Var3 && aa1Var == aa1Var4) {
            throw new IllegalStateException(("State must be at least '" + aa1.j + "' to be moved to '" + aa1Var + "' in component " + ia1Var).toString());
        }
        if (aa1Var2 == aa1Var4 && aa1Var2 != aa1Var) {
            throw new IllegalStateException(("State is '" + aa1Var4 + "' and cannot be moved to `" + aa1Var + "` in component " + ia1Var).toString());
        }
        this.h = aa1Var;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        g();
        this.e = false;
        if (this.h == aa1Var4) {
            this.b = new b5(12);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        r7.f = false;
        r7.i.g(r7.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        Object obj = ((WeakReference) this.c.a).get();
        if (obj == null) {
            s.l("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final ia1 ia1Var = (ia1) obj;
        while (true) {
            b5 b5Var = this.b;
            final int i = 0;
            if (((rk1) b5Var.i).e == 0) {
                break;
            }
            ei0 ei0Var = (ei0) b5Var.j;
            if (ei0Var == null) {
                um2.i("Collection is empty.");
                return;
            }
            aa1 aa1Var = ei0Var.i.a;
            ei0 ei0Var2 = (ei0) b5Var.k;
            if (ei0Var2 == null) {
                um2.i("Collection is empty.");
                return;
            }
            aa1 aa1Var2 = ei0Var2.i.a;
            if (aa1Var == aa1Var2 && this.h == aa1Var2) {
                break;
            }
            this.f = false;
            aa1 aa1Var3 = this.h;
            if (ei0Var == null) {
                um2.i("Collection is empty.");
                return;
            }
            if (aa1Var3.compareTo(aa1Var) < 0) {
                b5 b5Var2 = this.b;
                in0 in0Var = new in0(this) { // from class: ja1
                    public final /* synthetic */ la1 i;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.i = this;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.in0
                    public final Object j(Object obj2) {
                        int i2 = i;
                        a83 a83Var = a83.a;
                        ia1 ia1Var2 = ia1Var;
                        la1 la1Var = this.i;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i2) {
                            case 0:
                                entry.getClass();
                                ha1 ha1Var = (ha1) entry.getKey();
                                ka1 ka1Var = (ka1) entry.getValue();
                                while (true) {
                                    aa1 aa1Var4 = ka1Var.a;
                                    aa1 aa1Var5 = la1Var.h;
                                    ArrayList arrayList = la1Var.g;
                                    if (aa1Var4.compareTo(aa1Var5) > 0 && !la1Var.f) {
                                        b5 b5Var3 = la1Var.b;
                                        b5Var3.getClass();
                                        ha1Var.getClass();
                                        if (((rk1) b5Var3.i).c(ha1Var)) {
                                            x91 x91Var = z91.Companion;
                                            aa1 aa1Var6 = ka1Var.a;
                                            x91Var.getClass();
                                            aa1Var6.getClass();
                                            int iOrdinal = aa1Var6.ordinal();
                                            z91 z91Var = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : z91.ON_PAUSE : z91.ON_STOP : z91.ON_DESTROY;
                                            if (z91Var == null) {
                                                c80.y("no event down from ", ka1Var.a);
                                            } else {
                                                arrayList.add(z91Var.a());
                                                ka1Var.a(ia1Var2, z91Var);
                                                iu.i0(arrayList);
                                            }
                                        }
                                        break;
                                    }
                                }
                                break;
                            default:
                                entry.getClass();
                                ha1 ha1Var2 = (ha1) entry.getKey();
                                ka1 ka1Var2 = (ka1) entry.getValue();
                                while (true) {
                                    aa1 aa1Var7 = ka1Var2.a;
                                    aa1 aa1Var8 = la1Var.h;
                                    ArrayList arrayList2 = la1Var.g;
                                    if (aa1Var7.compareTo(aa1Var8) < 0 && !la1Var.f) {
                                        b5 b5Var4 = la1Var.b;
                                        b5Var4.getClass();
                                        ha1Var2.getClass();
                                        if (((rk1) b5Var4.i).c(ha1Var2)) {
                                            arrayList2.add(ka1Var2.a);
                                            x91 x91Var2 = z91.Companion;
                                            aa1 aa1Var9 = ka1Var2.a;
                                            x91Var2.getClass();
                                            aa1Var9.getClass();
                                            int iOrdinal2 = aa1Var9.ordinal();
                                            z91 z91Var2 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : z91.ON_RESUME : z91.ON_START : z91.ON_CREATE;
                                            if (z91Var2 == null) {
                                                c80.y("no event up from ", ka1Var2.a);
                                            } else {
                                                ka1Var2.a(ia1Var2, z91Var2);
                                                iu.i0(arrayList2);
                                            }
                                        }
                                        break;
                                    }
                                }
                                break;
                        }
                        return null;
                    }
                };
                b5Var2.getClass();
                for (ei0 ei0Var3 = (ei0) b5Var2.k; ei0Var3 != null; ei0Var3 = ei0Var3.k) {
                    if (!ei0Var3.l) {
                        in0Var.j(ei0Var3);
                    }
                }
            }
            ei0 ei0Var4 = (ei0) this.b.k;
            if (!this.f && ei0Var4 != null && this.h.compareTo(ei0Var4.i.a) > 0) {
                b5 b5Var3 = this.b;
                final int i2 = 1;
                in0 in0Var2 = new in0(this) { // from class: ja1
                    public final /* synthetic */ la1 i;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    {
                        this.i = this;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // defpackage.in0
                    public final Object j(Object obj2) {
                        int i22 = i2;
                        a83 a83Var = a83.a;
                        ia1 ia1Var2 = ia1Var;
                        la1 la1Var = this.i;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i22) {
                            case 0:
                                entry.getClass();
                                ha1 ha1Var = (ha1) entry.getKey();
                                ka1 ka1Var = (ka1) entry.getValue();
                                while (true) {
                                    aa1 aa1Var4 = ka1Var.a;
                                    aa1 aa1Var5 = la1Var.h;
                                    ArrayList arrayList = la1Var.g;
                                    if (aa1Var4.compareTo(aa1Var5) > 0 && !la1Var.f) {
                                        b5 b5Var32 = la1Var.b;
                                        b5Var32.getClass();
                                        ha1Var.getClass();
                                        if (((rk1) b5Var32.i).c(ha1Var)) {
                                            x91 x91Var = z91.Companion;
                                            aa1 aa1Var6 = ka1Var.a;
                                            x91Var.getClass();
                                            aa1Var6.getClass();
                                            int iOrdinal = aa1Var6.ordinal();
                                            z91 z91Var = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : z91.ON_PAUSE : z91.ON_STOP : z91.ON_DESTROY;
                                            if (z91Var == null) {
                                                c80.y("no event down from ", ka1Var.a);
                                            } else {
                                                arrayList.add(z91Var.a());
                                                ka1Var.a(ia1Var2, z91Var);
                                                iu.i0(arrayList);
                                            }
                                        }
                                        break;
                                    }
                                }
                                break;
                            default:
                                entry.getClass();
                                ha1 ha1Var2 = (ha1) entry.getKey();
                                ka1 ka1Var2 = (ka1) entry.getValue();
                                while (true) {
                                    aa1 aa1Var7 = ka1Var2.a;
                                    aa1 aa1Var8 = la1Var.h;
                                    ArrayList arrayList2 = la1Var.g;
                                    if (aa1Var7.compareTo(aa1Var8) < 0 && !la1Var.f) {
                                        b5 b5Var4 = la1Var.b;
                                        b5Var4.getClass();
                                        ha1Var2.getClass();
                                        if (((rk1) b5Var4.i).c(ha1Var2)) {
                                            arrayList2.add(ka1Var2.a);
                                            x91 x91Var2 = z91.Companion;
                                            aa1 aa1Var9 = ka1Var2.a;
                                            x91Var2.getClass();
                                            aa1Var9.getClass();
                                            int iOrdinal2 = aa1Var9.ordinal();
                                            z91 z91Var2 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : z91.ON_RESUME : z91.ON_START : z91.ON_CREATE;
                                            if (z91Var2 == null) {
                                                c80.y("no event up from ", ka1Var2.a);
                                            } else {
                                                ka1Var2.a(ia1Var2, z91Var2);
                                                iu.i0(arrayList2);
                                            }
                                        }
                                        break;
                                    }
                                }
                                break;
                        }
                        return null;
                    }
                };
                b5Var3.getClass();
                for (ei0 ei0Var5 = (ei0) b5Var3.j; ei0Var5 != null; ei0Var5 = ei0Var5.j) {
                    if (!ei0Var5.l) {
                        in0Var2.j(ei0Var5);
                    }
                }
            }
        }
    }
}
