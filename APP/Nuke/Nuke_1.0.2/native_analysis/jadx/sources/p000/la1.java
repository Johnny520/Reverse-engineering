package p000;

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

    /* JADX INFO: renamed from: a */
    public final boolean f6002a;

    /* JADX INFO: renamed from: b */
    public C0043b5 f6003b;

    /* JADX INFO: renamed from: c */
    public final mb3 f6004c;

    /* JADX INFO: renamed from: d */
    public int f6005d;

    /* JADX INFO: renamed from: e */
    public boolean f6006e;

    /* JADX INFO: renamed from: f */
    public boolean f6007f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f6008g;

    /* JADX INFO: renamed from: h */
    public aa1 f6009h;

    /* JADX INFO: renamed from: i */
    public final ju2 f6010i;

    public la1(ia1 ia1Var, boolean z) {
        new AtomicReference(null);
        this.f6002a = z;
        this.f6003b = new C0043b5(12);
        this.f6004c = new mb3(ia1Var);
        this.f6008g = new ArrayList();
        aa1 aa1Var = aa1.f120i;
        this.f6009h = aa1Var;
        this.f6010i = pp0.m3908f(aa1Var);
    }

    @Override // p000.ba1
    /* JADX INFO: renamed from: a */
    public final void mo505a(ha1 ha1Var) {
        fa1 y50Var;
        ka1 ka1Var;
        ia1 ia1Var;
        ha1Var.getClass();
        m2891d("addObserver");
        aa1 aa1Var = this.f6009h;
        aa1 aa1Var2 = aa1.f119h;
        if (aa1Var != aa1Var2) {
            aa1Var2 = aa1.f120i;
        }
        ka1 ka1Var2 = new ka1();
        ka1Var2.f5416a = aa1Var2;
        HashMap map = qa1.f8853a;
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
            if (qa1.m4105b(cls) == 2) {
                Object obj = qa1.f8854b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    qa1.m4104a((Constructor) list.get(0), ha1Var);
                    throw null;
                }
                int size = list.size();
                mo0[] mo0VarArr = new mo0[size];
                if (size > 0) {
                    qa1.m4104a((Constructor) list.get(0), ha1Var);
                    throw null;
                }
                y50Var = new n62(i, mo0VarArr);
            } else {
                y50Var = new y50(ha1Var);
            }
        }
        ka1Var2.f5417b = y50Var;
        C0043b5 c0043b5 = this.f6003b;
        c0043b5.getClass();
        rk1 rk1Var = (rk1) c0043b5.f562i;
        ei0 ei0Var = (ei0) rk1Var.m4505g(ha1Var);
        if (ei0Var != null) {
            ka1Var = ei0Var.f2451i;
        } else {
            ei0 ei0Var2 = new ei0(ha1Var, ka1Var2);
            rk1Var.m4511m(ha1Var, ei0Var2);
            ei0 ei0Var3 = (ei0) c0043b5.f564k;
            if (ei0Var3 == null) {
                c0043b5.f563j = ei0Var2;
                c0043b5.f564k = ei0Var2;
            } else {
                ei0Var3.f2452j = ei0Var2;
                ei0Var2.f2453k = ei0Var3;
                c0043b5.f564k = ei0Var2;
            }
            ka1Var = null;
        }
        if (ka1Var == null && (ia1Var = (ia1) ((WeakReference) this.f6004c.f6554a).get()) != null) {
            boolean z3 = this.f6005d != 0 || this.f6006e;
            aa1 aa1VarM2890c = m2890c(ha1Var);
            this.f6005d++;
            while (ka1Var2.f5416a.compareTo(aa1VarM2890c) < 0) {
                C0043b5 c0043b52 = this.f6003b;
                c0043b52.getClass();
                if (!((rk1) c0043b52.f562i).m4501c(ha1Var)) {
                    break;
                }
                aa1 aa1Var3 = ka1Var2.f5416a;
                ArrayList arrayList = this.f6008g;
                arrayList.add(aa1Var3);
                x91 x91Var = z91.Companion;
                aa1 aa1Var4 = ka1Var2.f5416a;
                x91Var.getClass();
                aa1Var4.getClass();
                int iOrdinal = aa1Var4.ordinal();
                z91 z91Var = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : z91.ON_RESUME : z91.ON_START : z91.ON_CREATE;
                if (z91Var == null) {
                    C0676s.m4655n("no event up from ", ka1Var2.f5416a);
                    return;
                } else {
                    ka1Var2.m2623a(ia1Var, z91Var);
                    AbstractC0325iu.m2395i0(arrayList);
                    aa1VarM2890c = m2890c(ha1Var);
                }
            }
            if (!z3) {
                m2894g();
            }
            this.f6005d--;
        }
    }

    @Override // p000.ba1
    /* JADX INFO: renamed from: b */
    public final void mo506b(ha1 ha1Var) {
        ha1Var.getClass();
        m2891d("removeObserver");
        C0043b5 c0043b5 = this.f6003b;
        c0043b5.getClass();
        ei0 ei0Var = (ei0) ((rk1) c0043b5.f562i).m4509k(ha1Var);
        if (ei0Var == null) {
            return;
        }
        ei0 ei0Var2 = ei0Var.f2453k;
        ei0 ei0Var3 = ei0Var.f2452j;
        if (ei0Var2 == null) {
            c0043b5.f563j = ei0Var3;
        } else {
            ei0Var2.f2452j = ei0Var3;
        }
        ei0 ei0Var4 = ei0Var.f2452j;
        if (ei0Var4 == null) {
            c0043b5.f564k = ei0Var2;
        } else {
            ei0Var4.f2453k = ei0Var2;
        }
        ei0Var.f2454l = true;
    }

    /* JADX INFO: renamed from: c */
    public final aa1 m2890c(ha1 ha1Var) {
        C0043b5 c0043b5 = this.f6003b;
        c0043b5.getClass();
        ha1Var.getClass();
        ei0 ei0Var = (ei0) ((rk1) c0043b5.f562i).m4505g(ha1Var);
        ei0 ei0Var2 = ei0Var != null ? ei0Var.f2453k : null;
        aa1 aa1Var = ei0Var2 != null ? ei0Var2.f2451i.f5416a : null;
        ArrayList arrayList = this.f6008g;
        aa1 aa1Var2 = arrayList.isEmpty() ? null : (aa1) arrayList.get(arrayList.size() - 1);
        aa1 aa1Var3 = this.f6009h;
        if (aa1Var == null || aa1Var.compareTo(aa1Var3) >= 0) {
            aa1Var = aa1Var3;
        }
        return (aa1Var2 == null || aa1Var2.compareTo(aa1Var) >= 0) ? aa1Var : aa1Var2;
    }

    /* JADX INFO: renamed from: d */
    public final void m2891d(String str) {
        if (this.f6002a) {
            ((C0732tf) C0732tf.m5248Y().f10710A).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            c80.m665h(vi0.m5691j("Method ", str, " must be called on the main thread"));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2892e(z91 z91Var) {
        z91Var.getClass();
        m2891d("handleLifecycleEvent");
        m2893f(z91Var.m6402a());
    }

    /* JADX INFO: renamed from: f */
    public final void m2893f(aa1 aa1Var) {
        if (this.f6009h == aa1Var) {
            return;
        }
        ia1 ia1Var = (ia1) ((WeakReference) this.f6004c.f6554a).get();
        aa1 aa1Var2 = this.f6009h;
        aa1 aa1Var3 = aa1.f120i;
        aa1 aa1Var4 = aa1.f119h;
        if (aa1Var2 == aa1Var3 && aa1Var == aa1Var4) {
            throw new IllegalStateException(("State must be at least '" + aa1.f121j + "' to be moved to '" + aa1Var + "' in component " + ia1Var).toString());
        }
        if (aa1Var2 == aa1Var4 && aa1Var2 != aa1Var) {
            throw new IllegalStateException(("State is '" + aa1Var4 + "' and cannot be moved to `" + aa1Var + "` in component " + ia1Var).toString());
        }
        this.f6009h = aa1Var;
        if (this.f6006e || this.f6005d != 0) {
            this.f6007f = true;
            return;
        }
        this.f6006e = true;
        m2894g();
        this.f6006e = false;
        if (this.f6009h == aa1Var4) {
            this.f6003b = new C0043b5(12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        r7.f6007f = false;
        r7.f6010i.m2575g(r7.f6009h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2894g() {
        Object obj = ((WeakReference) this.f6004c.f6554a).get();
        if (obj == null) {
            C0676s.m4653l("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final ia1 ia1Var = (ia1) obj;
        while (true) {
            C0043b5 c0043b5 = this.f6003b;
            final int i = 0;
            if (((rk1) c0043b5.f562i).f9622e == 0) {
                break;
            }
            ei0 ei0Var = (ei0) c0043b5.f563j;
            if (ei0Var == null) {
                um2.m5519i("Collection is empty.");
                return;
            }
            aa1 aa1Var = ei0Var.f2451i.f5416a;
            ei0 ei0Var2 = (ei0) c0043b5.f564k;
            if (ei0Var2 == null) {
                um2.m5519i("Collection is empty.");
                return;
            }
            aa1 aa1Var2 = ei0Var2.f2451i.f5416a;
            if (aa1Var == aa1Var2 && this.f6009h == aa1Var2) {
                break;
            }
            this.f6007f = false;
            aa1 aa1Var3 = this.f6009h;
            if (ei0Var == null) {
                um2.m5519i("Collection is empty.");
                return;
            }
            if (aa1Var3.compareTo(aa1Var) < 0) {
                C0043b5 c0043b52 = this.f6003b;
                in0 in0Var = new in0(this) { // from class: ja1

                    /* JADX INFO: renamed from: i */
                    public final /* synthetic */ la1 f4933i;

                    {
                        this.f4933i = this;
                    }

                    @Override // p000.in0
                    /* JADX INFO: renamed from: j */
                    public final Object mo5j(Object obj2) {
                        int i2 = i;
                        a83 a83Var = a83.f116a;
                        ia1 ia1Var2 = ia1Var;
                        la1 la1Var = this.f4933i;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i2) {
                            case 0:
                                entry.getClass();
                                ha1 ha1Var = (ha1) entry.getKey();
                                ka1 ka1Var = (ka1) entry.getValue();
                                while (true) {
                                    aa1 aa1Var4 = ka1Var.f5416a;
                                    aa1 aa1Var5 = la1Var.f6009h;
                                    ArrayList arrayList = la1Var.f6008g;
                                    if (aa1Var4.compareTo(aa1Var5) > 0 && !la1Var.f6007f) {
                                        C0043b5 c0043b53 = la1Var.f6003b;
                                        c0043b53.getClass();
                                        ha1Var.getClass();
                                        if (((rk1) c0043b53.f562i).m4501c(ha1Var)) {
                                            x91 x91Var = z91.Companion;
                                            aa1 aa1Var6 = ka1Var.f5416a;
                                            x91Var.getClass();
                                            aa1Var6.getClass();
                                            int iOrdinal = aa1Var6.ordinal();
                                            z91 z91Var = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : z91.ON_PAUSE : z91.ON_STOP : z91.ON_DESTROY;
                                            if (z91Var == null) {
                                                c80.m681y("no event down from ", ka1Var.f5416a);
                                            } else {
                                                arrayList.add(z91Var.m6402a());
                                                ka1Var.m2623a(ia1Var2, z91Var);
                                                AbstractC0325iu.m2395i0(arrayList);
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
                                    aa1 aa1Var7 = ka1Var2.f5416a;
                                    aa1 aa1Var8 = la1Var.f6009h;
                                    ArrayList arrayList2 = la1Var.f6008g;
                                    if (aa1Var7.compareTo(aa1Var8) < 0 && !la1Var.f6007f) {
                                        C0043b5 c0043b54 = la1Var.f6003b;
                                        c0043b54.getClass();
                                        ha1Var2.getClass();
                                        if (((rk1) c0043b54.f562i).m4501c(ha1Var2)) {
                                            arrayList2.add(ka1Var2.f5416a);
                                            x91 x91Var2 = z91.Companion;
                                            aa1 aa1Var9 = ka1Var2.f5416a;
                                            x91Var2.getClass();
                                            aa1Var9.getClass();
                                            int iOrdinal2 = aa1Var9.ordinal();
                                            z91 z91Var2 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : z91.ON_RESUME : z91.ON_START : z91.ON_CREATE;
                                            if (z91Var2 == null) {
                                                c80.m681y("no event up from ", ka1Var2.f5416a);
                                            } else {
                                                ka1Var2.m2623a(ia1Var2, z91Var2);
                                                AbstractC0325iu.m2395i0(arrayList2);
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
                c0043b52.getClass();
                for (ei0 ei0Var3 = (ei0) c0043b52.f564k; ei0Var3 != null; ei0Var3 = ei0Var3.f2453k) {
                    if (!ei0Var3.f2454l) {
                        in0Var.mo5j(ei0Var3);
                    }
                }
            }
            ei0 ei0Var4 = (ei0) this.f6003b.f564k;
            if (!this.f6007f && ei0Var4 != null && this.f6009h.compareTo(ei0Var4.f2451i.f5416a) > 0) {
                C0043b5 c0043b53 = this.f6003b;
                final int i2 = 1;
                in0 in0Var2 = new in0(this) { // from class: ja1

                    /* JADX INFO: renamed from: i */
                    public final /* synthetic */ la1 f4933i;

                    {
                        this.f4933i = this;
                    }

                    @Override // p000.in0
                    /* JADX INFO: renamed from: j */
                    public final Object mo5j(Object obj2) {
                        int i22 = i2;
                        a83 a83Var = a83.f116a;
                        ia1 ia1Var2 = ia1Var;
                        la1 la1Var = this.f4933i;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i22) {
                            case 0:
                                entry.getClass();
                                ha1 ha1Var = (ha1) entry.getKey();
                                ka1 ka1Var = (ka1) entry.getValue();
                                while (true) {
                                    aa1 aa1Var4 = ka1Var.f5416a;
                                    aa1 aa1Var5 = la1Var.f6009h;
                                    ArrayList arrayList = la1Var.f6008g;
                                    if (aa1Var4.compareTo(aa1Var5) > 0 && !la1Var.f6007f) {
                                        C0043b5 c0043b532 = la1Var.f6003b;
                                        c0043b532.getClass();
                                        ha1Var.getClass();
                                        if (((rk1) c0043b532.f562i).m4501c(ha1Var)) {
                                            x91 x91Var = z91.Companion;
                                            aa1 aa1Var6 = ka1Var.f5416a;
                                            x91Var.getClass();
                                            aa1Var6.getClass();
                                            int iOrdinal = aa1Var6.ordinal();
                                            z91 z91Var = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : z91.ON_PAUSE : z91.ON_STOP : z91.ON_DESTROY;
                                            if (z91Var == null) {
                                                c80.m681y("no event down from ", ka1Var.f5416a);
                                            } else {
                                                arrayList.add(z91Var.m6402a());
                                                ka1Var.m2623a(ia1Var2, z91Var);
                                                AbstractC0325iu.m2395i0(arrayList);
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
                                    aa1 aa1Var7 = ka1Var2.f5416a;
                                    aa1 aa1Var8 = la1Var.f6009h;
                                    ArrayList arrayList2 = la1Var.f6008g;
                                    if (aa1Var7.compareTo(aa1Var8) < 0 && !la1Var.f6007f) {
                                        C0043b5 c0043b54 = la1Var.f6003b;
                                        c0043b54.getClass();
                                        ha1Var2.getClass();
                                        if (((rk1) c0043b54.f562i).m4501c(ha1Var2)) {
                                            arrayList2.add(ka1Var2.f5416a);
                                            x91 x91Var2 = z91.Companion;
                                            aa1 aa1Var9 = ka1Var2.f5416a;
                                            x91Var2.getClass();
                                            aa1Var9.getClass();
                                            int iOrdinal2 = aa1Var9.ordinal();
                                            z91 z91Var2 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : z91.ON_RESUME : z91.ON_START : z91.ON_CREATE;
                                            if (z91Var2 == null) {
                                                c80.m681y("no event up from ", ka1Var2.f5416a);
                                            } else {
                                                ka1Var2.m2623a(ia1Var2, z91Var2);
                                                AbstractC0325iu.m2395i0(arrayList2);
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
                c0043b53.getClass();
                for (ei0 ei0Var5 = (ei0) c0043b53.f563j; ei0Var5 != null; ei0Var5 = ei0Var5.f2452j) {
                    if (!ei0Var5.f2454l) {
                        in0Var2.mo5j(ei0Var5);
                    }
                }
            }
        }
    }
}
