package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t40 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f10537a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final ArrayList f10538b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public vp0 f10539c;

    /* JADX INFO: renamed from: d */
    public Object f10540d;

    /* JADX INFO: renamed from: e */
    public int f10541e;

    /* JADX INFO: renamed from: f */
    public int f10542f;

    /* JADX INFO: renamed from: g */
    public Class f10543g;

    /* JADX INFO: renamed from: h */
    public af0 f10544h;

    /* JADX INFO: renamed from: i */
    public ov1 f10545i;

    /* JADX INFO: renamed from: j */
    public Map f10546j;

    /* JADX INFO: renamed from: k */
    public Class f10547k;

    /* JADX INFO: renamed from: l */
    public boolean f10548l;

    /* JADX INFO: renamed from: m */
    public boolean f10549m;

    /* JADX INFO: renamed from: n */
    public a51 f10550n;

    /* JADX INFO: renamed from: o */
    public i32 f10551o;

    /* JADX INFO: renamed from: p */
    public b90 f10552p;

    /* JADX INFO: renamed from: q */
    public boolean f10553q;

    /* JADX INFO: renamed from: r */
    public boolean f10554r;

    /* JADX INFO: renamed from: a */
    public final ArrayList m5116a() {
        boolean z = this.f10549m;
        ArrayList arrayList = this.f10538b;
        if (!z) {
            this.f10549m = true;
            arrayList.clear();
            ArrayList arrayListM5117b = m5117b();
            int size = arrayListM5117b.size();
            for (int i = 0; i < size; i++) {
                ih1 ih1Var = (ih1) arrayListM5117b.get(i);
                a51 a51Var = ih1Var.f4616a;
                List list = ih1Var.f4617b;
                if (!arrayList.contains(a51Var)) {
                    arrayList.add(ih1Var.f4616a);
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

    /* JADX INFO: renamed from: b */
    public final ArrayList m5117b() {
        boolean z = this.f10548l;
        ArrayList arrayList = this.f10537a;
        if (!z) {
            this.f10548l = true;
            arrayList.clear();
            List listM5646f = this.f10539c.m5748a().m5646f(this.f10540d);
            int size = listM5646f.size();
            for (int i = 0; i < size; i++) {
                ih1 ih1VarMo236b = ((jh1) listM5646f.get(i)).mo236b(this.f10540d, this.f10541e, this.f10542f, this.f10545i);
                if (ih1VarMo236b != null) {
                    arrayList.add(ih1VarMo236b);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final wb1 m5118c(Class cls) {
        wb1 wb1Var;
        Class cls2;
        Class cls3;
        Class cls4;
        wb1 wb1Var2;
        ArrayList arrayList;
        n92 n92Var;
        Class cls5 = cls;
        v72 v72VarM5748a = this.f10539c.m5748a();
        Class cls6 = this.f10543g;
        Class cls7 = this.f10547k;
        xb1 xb1Var = v72VarM5748a.f11813i;
        hj1 hj1Var = (hj1) xb1Var.f12954b.getAndSet(null);
        if (hj1Var == null) {
            hj1Var = new hj1();
        }
        hj1Var.f4035a = cls5;
        hj1Var.f4036b = cls6;
        hj1Var.f4037c = cls7;
        synchronized (xb1Var.f12953a) {
            wb1Var = (wb1) xb1Var.f12953a.get(hj1Var);
        }
        xb1Var.f12954b.set(hj1Var);
        v72VarM5748a.f11813i.getClass();
        if (xb1.f12952c.equals(wb1Var)) {
            return null;
        }
        if (wb1Var != null) {
            return wb1Var;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls8 : v72VarM5748a.f11807c.m1083F(cls5, cls6)) {
            for (Class cls9 : v72VarM5748a.f11810f.m6255g(cls8, cls7)) {
                dq1 dq1Var = v72VarM5748a.f11807c;
                synchronized (dq1Var) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) dq1Var.f2147i).iterator();
                    while (it.hasNext()) {
                        List<h92> list = (List) ((HashMap) dq1Var.f2148j).get((String) it.next());
                        if (list != null) {
                            for (h92 h92Var : list) {
                                if (h92Var.f3924a.isAssignableFrom(cls5) && cls8.isAssignableFrom(h92Var.f3925b)) {
                                    arrayList.add(h92Var.f3926c);
                                }
                            }
                        }
                    }
                }
                ye0 ye0Var = v72VarM5748a.f11810f;
                synchronized (ye0Var) {
                    if (!cls9.isAssignableFrom(cls8)) {
                        for (f33 f33Var : ye0Var.f13428a) {
                            if (f33Var.f2771a.isAssignableFrom(cls8) && cls9.isAssignableFrom(f33Var.f2772b)) {
                                n92Var = f33Var.f2773c;
                            } else {
                                cls5 = cls;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                    }
                    n92Var = C0700sn.f10219W;
                }
                arrayList2.add(new x40(cls5, cls8, cls9, arrayList, n92Var, v72VarM5748a.f11814j));
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
            wb1Var2 = new wb1(cls2, cls3, cls4, arrayList2, v72VarM5748a.f11814j);
        }
        xb1 xb1Var2 = v72VarM5748a.f11813i;
        synchronized (xb1Var2.f12953a) {
            xb1Var2.f12953a.put(new hj1(cls2, cls3, cls4), wb1Var2 != null ? wb1Var2 : xb1.f12952c);
        }
        return wb1Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r0 = r2.f12991b;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final we0 m5119d(Object obj) {
        we0 we0Var;
        ye0 ye0Var = this.f10539c.m5748a().f11806b;
        Class<?> cls = obj.getClass();
        synchronized (ye0Var) {
            Iterator it = ye0Var.f13428a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    we0Var = null;
                    break;
                }
                xe0 xe0Var = (xe0) it.next();
                if (xe0Var.f12990a.isAssignableFrom(cls)) {
                    break;
                }
            }
        }
        if (we0Var != null) {
            return we0Var;
        }
        throw new u72("Failed to find source encoder for data class: " + obj.getClass());
    }

    /* JADX INFO: renamed from: e */
    public final n33 m5120e(Class cls) {
        n33 n33Var = (n33) this.f10546j.get(cls);
        if (n33Var == null) {
            Iterator it = this.f10546j.entrySet().iterator();
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
        if (!this.f10546j.isEmpty() || !this.f10553q) {
            return d83.f1912b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
