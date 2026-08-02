package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t40 {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public vp0 c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public af0 h;
    public ov1 i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public a51 n;
    public i32 o;
    public b90 p;
    public boolean q;
    public boolean r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                ih1 ih1Var = (ih1) arrayListB.get(i);
                a51 a51Var = ih1Var.a;
                List list = ih1Var.b;
                if (!arrayList.contains(a51Var)) {
                    arrayList.add(ih1Var.a);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add((a51) list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List listF = this.c.a().f(this.d);
            int size = listF.size();
            for (int i = 0; i < size; i++) {
                ih1 ih1VarB = ((jh1) listF.get(i)).b(this.d, this.e, this.f, this.i);
                if (ih1VarB != null) {
                    arrayList.add(ih1VarB);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    public final wb1 c(Class cls) {
        wb1 wb1Var;
        Class cls2;
        Class cls3;
        Class cls4;
        wb1 wb1Var2;
        ArrayList arrayList;
        n92 n92Var;
        Class cls5 = cls;
        v72 v72VarA = this.c.a();
        Class cls6 = this.g;
        Class cls7 = this.k;
        xb1 xb1Var = v72VarA.i;
        hj1 hj1Var = (hj1) xb1Var.b.getAndSet(null);
        if (hj1Var == null) {
            hj1Var = new hj1();
        }
        hj1Var.a = cls5;
        hj1Var.b = cls6;
        hj1Var.c = cls7;
        synchronized (xb1Var.a) {
            wb1Var = (wb1) xb1Var.a.get(hj1Var);
        }
        xb1Var.b.set(hj1Var);
        v72VarA.i.getClass();
        if (xb1.c.equals(wb1Var)) {
            return null;
        }
        if (wb1Var != null) {
            return wb1Var;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls8 : v72VarA.c.F(cls5, cls6)) {
            for (Class cls9 : v72VarA.f.g(cls8, cls7)) {
                dq1 dq1Var = v72VarA.c;
                synchronized (dq1Var) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) dq1Var.i).iterator();
                    while (it.hasNext()) {
                        List<h92> list = (List) ((HashMap) dq1Var.j).get((String) it.next());
                        if (list != null) {
                            for (h92 h92Var : list) {
                                if (h92Var.a.isAssignableFrom(cls5) && cls8.isAssignableFrom(h92Var.b)) {
                                    arrayList.add(h92Var.c);
                                }
                            }
                        }
                    }
                }
                ye0 ye0Var = v72VarA.f;
                synchronized (ye0Var) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        for (f33 f33Var : ye0Var.a) {
                            if (f33Var.a.isAssignableFrom(cls8) && cls9.isAssignableFrom(f33Var.b)) {
                                n92Var = f33Var.c;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    n92Var = sn.W;
                }
                arrayList2.add(new x40(cls5, cls8, cls9, arrayList, n92Var, v72VarA.j));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            wb1Var2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            wb1Var2 = new wb1(cls2, cls3, cls4, arrayList2, v72VarA.j);
        }
        xb1 xb1Var2 = v72VarA.i;
        synchronized (xb1Var2.a) {
            xb1Var2.a.put(new hj1(cls2, cls3, cls4), wb1Var2 != null ? wb1Var2 : xb1.c);
        }
        return wb1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r0 = r2.b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final we0 d(Object obj) {
        we0 we0Var;
        ye0 ye0Var = this.c.a().b;
        Class<?> cls = obj.getClass();
        synchronized (ye0Var) {
            Iterator it = ye0Var.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    we0Var = null;
                    break;
                }
                xe0 xe0Var = (xe0) it.next();
                if (xe0Var.a.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (we0Var != null) {
            return we0Var;
        }
        throw new u72("Failed to find source encoder for data class: " + obj.getClass());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final n33 e(Class cls) {
        n33 n33Var = (n33) this.j.get(cls);
        if (n33Var == null) {
            Iterator it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    n33Var = (n33) entry.getValue();
                    break;
                }
            }
        }
        if (n33Var != null) {
            return n33Var;
        }
        if (!this.j.isEmpty() || !this.q) {
            return d83.b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
