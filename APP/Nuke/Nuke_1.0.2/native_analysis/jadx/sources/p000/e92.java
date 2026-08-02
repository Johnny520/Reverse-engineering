package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class e92 implements h40, e40 {

    /* JADX INFO: renamed from: h */
    public final w40 f2355h;

    /* JADX INFO: renamed from: i */
    public final t40 f2356i;

    /* JADX INFO: renamed from: j */
    public int f2357j;

    /* JADX INFO: renamed from: k */
    public int f2358k = -1;

    /* JADX INFO: renamed from: l */
    public a51 f2359l;

    /* JADX INFO: renamed from: m */
    public List f2360m;

    /* JADX INFO: renamed from: n */
    public int f2361n;

    /* JADX INFO: renamed from: o */
    public volatile ih1 f2362o;

    /* JADX INFO: renamed from: p */
    public File f2363p;

    /* JADX INFO: renamed from: q */
    public f92 f2364q;

    public e92(t40 t40Var, w40 w40Var) {
        this.f2356i = t40Var;
        this.f2355h = w40Var;
    }

    @Override // p000.h40
    /* JADX INFO: renamed from: c */
    public final boolean mo634c() {
        List list;
        ArrayList arrayListM2714w;
        ArrayList arrayListM5116a = this.f2356i.m5116a();
        boolean z = false;
        if (!arrayListM5116a.isEmpty()) {
            t40 t40Var = this.f2356i;
            v72 v72VarM5748a = t40Var.f10539c.m5748a();
            Class<?> cls = t40Var.f10540d.getClass();
            Class cls2 = t40Var.f10543g;
            Class cls3 = t40Var.f10547k;
            sz0 sz0Var = v72VarM5748a.f11812h;
            hj1 hj1Var = (hj1) ((AtomicReference) sz0Var.f10436i).getAndSet(null);
            if (hj1Var == null) {
                hj1Var = new hj1(cls, cls2, cls3);
            } else {
                hj1Var.f4035a = cls;
                hj1Var.f4036b = cls2;
                hj1Var.f4037c = cls3;
            }
            synchronized (((C0276hg) sz0Var.f10437j)) {
                list = (List) ((C0276hg) sz0Var.f10437j).get(hj1Var);
            }
            ((AtomicReference) sz0Var.f10436i).set(hj1Var);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                sz0 sz0Var2 = v72VarM5748a.f11805a;
                synchronized (sz0Var2) {
                    arrayListM2714w = ((kj1) sz0Var2.f10436i).m2714w(cls);
                }
                Iterator it = arrayListM2714w.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : v72VarM5748a.f11807c.m1083F((Class) it.next(), cls2)) {
                        if (!v72VarM5748a.f11810f.m6255g(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                sz0 sz0Var3 = v72VarM5748a.f11812h;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((C0276hg) sz0Var3.f10437j)) {
                    ((C0276hg) sz0Var3.f10437j).put(new hj1(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.f2360m;
                    if (list3 != null && this.f2361n < list3.size()) {
                        this.f2362o = null;
                        while (!z && this.f2361n < this.f2360m.size()) {
                            List list4 = this.f2360m;
                            int i = this.f2361n;
                            this.f2361n = i + 1;
                            jh1 jh1Var = (jh1) list4.get(i);
                            File file = this.f2363p;
                            t40 t40Var2 = this.f2356i;
                            this.f2362o = jh1Var.mo236b(file, t40Var2.f10541e, t40Var2.f10542f, t40Var2.f10545i);
                            if (this.f2362o != null && this.f2356i.m5118c(this.f2362o.f4618c.mo1371a()) != null) {
                                this.f2362o.f4618c.mo1373c(this.f2356i.f10551o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.f2358k + 1;
                    this.f2358k = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.f2357j + 1;
                        this.f2357j = i3;
                        if (i3 >= arrayListM5116a.size()) {
                            break;
                        }
                        this.f2358k = 0;
                    }
                    a51 a51Var = (a51) arrayListM5116a.get(this.f2357j);
                    Class cls5 = (Class) list2.get(this.f2358k);
                    n33 n33VarM5120e = this.f2356i.m5120e(cls5);
                    t40 t40Var3 = this.f2356i;
                    this.f2364q = new f92(t40Var3.f10539c.f12099a, a51Var, t40Var3.f10550n, t40Var3.f10541e, t40Var3.f10542f, n33VarM5120e, cls5, t40Var3.f10545i);
                    File fileMo112d = t40Var3.f10544h.m145a().mo112d(this.f2364q);
                    this.f2363p = fileMo112d;
                    if (fileMo112d != null) {
                        this.f2359l = a51Var;
                        this.f2360m = this.f2356i.f10539c.m5748a().m5646f(fileMo112d);
                        this.f2361n = 0;
                    }
                }
            } else if (!File.class.equals(this.f2356i.f10547k)) {
                StringBuilder sb = new StringBuilder("Failed to find any load path from ");
                sb.append(this.f2356i.f10540d.getClass());
                Class cls6 = this.f2356i.f10547k;
                sb.append(" to ");
                sb.append(cls6);
                throw new IllegalStateException(sb.toString());
            }
        }
        return false;
    }

    @Override // p000.h40
    public final void cancel() {
        ih1 ih1Var = this.f2362o;
        if (ih1Var != null) {
            ih1Var.f4618c.cancel();
        }
    }

    @Override // p000.e40
    /* JADX INFO: renamed from: d */
    public final void mo635d(Exception exc) {
        this.f2355h.mo1802b(this.f2364q, exc, this.f2362o.f4618c, 4);
    }

    @Override // p000.e40
    /* JADX INFO: renamed from: h */
    public final void mo636h(Object obj) {
        this.f2355h.mo1801a(this.f2359l, obj, this.f2362o.f4618c, 4, this.f2364q);
    }
}
