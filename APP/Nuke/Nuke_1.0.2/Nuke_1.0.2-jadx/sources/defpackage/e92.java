package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class e92 implements h40, e40 {
    public final w40 h;
    public final t40 i;
    public int j;
    public int k = -1;
    public a51 l;
    public List m;
    public int n;
    public volatile ih1 o;
    public File p;
    public f92 q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e92(t40 t40Var, w40 w40Var) {
        this.i = t40Var;
        this.h = w40Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h40
    public final boolean c() {
        List list;
        ArrayList arrayListW;
        ArrayList arrayListA = this.i.a();
        boolean z = false;
        if (!arrayListA.isEmpty()) {
            t40 t40Var = this.i;
            v72 v72VarA = t40Var.c.a();
            Class<?> cls = t40Var.d.getClass();
            Class cls2 = t40Var.g;
            Class cls3 = t40Var.k;
            sz0 sz0Var = v72VarA.h;
            hj1 hj1Var = (hj1) ((AtomicReference) sz0Var.i).getAndSet(null);
            if (hj1Var == null) {
                hj1Var = new hj1(cls, cls2, cls3);
            } else {
                hj1Var.a = cls;
                hj1Var.b = cls2;
                hj1Var.c = cls3;
            }
            synchronized (((hg) sz0Var.j)) {
                list = (List) ((hg) sz0Var.j).get(hj1Var);
            }
            ((AtomicReference) sz0Var.i).set(hj1Var);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                sz0 sz0Var2 = v72VarA.a;
                synchronized (sz0Var2) {
                    arrayListW = ((kj1) sz0Var2.i).w(cls);
                }
                Iterator it = arrayListW.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : v72VarA.c.F((Class) it.next(), cls2)) {
                        if (!v72VarA.f.g(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                sz0 sz0Var3 = v72VarA.h;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((hg) sz0Var3.j)) {
                    ((hg) sz0Var3.j).put(new hj1(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.m;
                    if (list3 != null && this.n < list3.size()) {
                        this.o = null;
                        while (!z && this.n < this.m.size()) {
                            List list4 = this.m;
                            int i = this.n;
                            this.n = i + 1;
                            jh1 jh1Var = (jh1) list4.get(i);
                            File file = this.p;
                            t40 t40Var2 = this.i;
                            this.o = jh1Var.b(file, t40Var2.e, t40Var2.f, t40Var2.i);
                            if (this.o != null && this.i.c(this.o.c.a()) != null) {
                                this.o.c.c(this.i.o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.k + 1;
                    this.k = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.j + 1;
                        this.j = i3;
                        if (i3 >= arrayListA.size()) {
                            break;
                        }
                        this.k = 0;
                    }
                    a51 a51Var = (a51) arrayListA.get(this.j);
                    Class cls5 = (Class) list2.get(this.k);
                    n33 n33VarE = this.i.e(cls5);
                    t40 t40Var3 = this.i;
                    this.q = new f92(t40Var3.c.a, a51Var, t40Var3.n, t40Var3.e, t40Var3.f, n33VarE, cls5, t40Var3.i);
                    File fileD = t40Var3.h.a().d(this.q);
                    this.p = fileD;
                    if (fileD != null) {
                        this.l = a51Var;
                        this.m = this.i.c.a().f(fileD);
                        this.n = 0;
                    }
                }
            } else if (!File.class.equals(this.i.k)) {
                StringBuilder sb = new StringBuilder("Failed to find any load path from ");
                sb.append(this.i.d.getClass());
                Class cls6 = this.i.k;
                sb.append(" to ");
                sb.append(cls6);
                throw new IllegalStateException(sb.toString());
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.h40
    public final void cancel() {
        ih1 ih1Var = this.o;
        if (ih1Var != null) {
            ih1Var.c.cancel();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e40
    public final void d(Exception exc) {
        this.h.b(this.q, exc, this.o.c, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.e40
    public final void h(Object obj) {
        this.h.a(this.l, obj, this.o.c, 4, this.q);
    }
}
