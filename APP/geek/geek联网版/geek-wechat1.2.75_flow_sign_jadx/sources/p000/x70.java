package p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class x70 implements Cloneable {

    /* JADX INFO: renamed from: t */
    public static final int[] f5200t = {2, 1, 3, 4};

    /* JADX INFO: renamed from: u */
    public static final C0426kw f5201u = new C0426kw(10);

    /* JADX INFO: renamed from: v */
    public static final ThreadLocal f5202v = new ThreadLocal();

    /* JADX INFO: renamed from: k */
    public ArrayList f5213k;

    /* JADX INFO: renamed from: l */
    public ArrayList f5214l;

    /* JADX INFO: renamed from: a */
    public final String f5203a = getClass().getName();

    /* JADX INFO: renamed from: b */
    public long f5204b = -1;

    /* JADX INFO: renamed from: c */
    public long f5205c = -1;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f5206d = null;

    /* JADX INFO: renamed from: e */
    public final ArrayList f5207e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f5208f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public C0402k8 f5209g = new C0402k8(4);

    /* JADX INFO: renamed from: h */
    public C0402k8 f5210h = new C0402k8(4);

    /* JADX INFO: renamed from: i */
    public C0364j7 f5211i = null;

    /* JADX INFO: renamed from: j */
    public final int[] f5212j = f5200t;

    /* JADX INFO: renamed from: m */
    public final ArrayList f5215m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public int f5216n = 0;

    /* JADX INFO: renamed from: o */
    public boolean f5217o = false;

    /* JADX INFO: renamed from: p */
    public boolean f5218p = false;

    /* JADX INFO: renamed from: q */
    public ArrayList f5219q = null;

    /* JADX INFO: renamed from: r */
    public ArrayList f5220r = new ArrayList();

    /* JADX INFO: renamed from: s */
    public C0426kw f5221s = f5201u;

    /* JADX INFO: renamed from: b */
    public static void m2639b(C0402k8 c0402k8, View view, d80 d80Var) {
        C0511n6 c0511n6 = (C0511n6) c0402k8.f2794a;
        C0511n6 c0511n62 = (C0511n6) c0402k8.f2797d;
        SparseArray sparseArray = (SparseArray) c0402k8.f2795b;
        C0235fs c0235fs = (C0235fs) c0402k8.f2796c;
        c0511n6.put(view, d80Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = oa0.f3426a;
        String strM893k = da0.m893k(view);
        if (strM893k != null) {
            if (c0511n62.containsKey(strM893k)) {
                c0511n62.put(strM893k, null);
            } else {
                c0511n62.put(strM893k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c0235fs.f1824a) {
                    c0235fs.m1108b();
                }
                if (AbstractC0259gf.m1254l(c0235fs.f1825b, c0235fs.f1827d, itemIdAtPosition) < 0) {
                    x90.m2670r(view, true);
                    c0235fs.m1110d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c0235fs.m1109c(itemIdAtPosition, null);
                if (view2 != null) {
                    x90.m2670r(view2, false);
                    c0235fs.m1110d(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static C0511n6 m2640n() {
        ThreadLocal threadLocal = f5202v;
        C0511n6 c0511n6 = (C0511n6) threadLocal.get();
        if (c0511n6 != null) {
            return c0511n6;
        }
        C0511n6 c0511n62 = new C0511n6();
        threadLocal.set(c0511n62);
        return c0511n62;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m2641s(d80 d80Var, d80 d80Var2, String str) {
        Object obj = d80Var.f1334a.get(str);
        Object obj2 = d80Var2.f1334a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: A */
    public void mo1576A(C0426kw c0426kw) {
        if (c0426kw == null) {
            this.f5221s = f5201u;
        } else {
            this.f5221s = c0426kw;
        }
    }

    /* JADX INFO: renamed from: C */
    public void mo1578C(long j) {
        this.f5204b = j;
    }

    /* JADX INFO: renamed from: D */
    public final void m2642D() {
        if (this.f5216n == 0) {
            ArrayList arrayList = this.f5219q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5219q.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((w70) arrayList2.get(i)).mo2014b();
                }
            }
            this.f5218p = false;
        }
        this.f5216n++;
    }

    /* JADX INFO: renamed from: E */
    public String mo1579E(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f5205c != -1) {
            str2 = str2 + "dur(" + this.f5205c + ") ";
        }
        if (this.f5204b != -1) {
            str2 = str2 + "dly(" + this.f5204b + ") ";
        }
        if (this.f5206d != null) {
            str2 = str2 + "interp(" + this.f5206d + ") ";
        }
        ArrayList arrayList = this.f5207e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f5208f;
        if (size <= 0 && arrayList2.size() <= 0) {
            return str2;
        }
        String strM1146i = g40.m1146i(str2, "tgts(");
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    strM1146i = g40.m1146i(strM1146i, ", ");
                }
                strM1146i = strM1146i + arrayList.get(i);
            }
        }
        if (arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (i2 > 0) {
                    strM1146i = g40.m1146i(strM1146i, ", ");
                }
                strM1146i = strM1146i + arrayList2.get(i2);
            }
        }
        return g40.m1146i(strM1146i, ")");
    }

    /* JADX INFO: renamed from: a */
    public void m2643a(w70 w70Var) {
        if (this.f5219q == null) {
            this.f5219q = new ArrayList();
        }
        this.f5219q.add(w70Var);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo1581c(d80 d80Var);

    /* JADX INFO: renamed from: d */
    public final void m2644d(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            d80 d80Var = new d80(view);
            if (z) {
                mo1583f(d80Var);
            } else {
                mo1581c(d80Var);
            }
            d80Var.f1336c.add(this);
            mo1582e(d80Var);
            if (z) {
                m2639b(this.f5209g, view, d80Var);
            } else {
                m2639b(this.f5210h, view, d80Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m2644d(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo1583f(d80 d80Var);

    /* JADX INFO: renamed from: g */
    public final void m2645g(ViewGroup viewGroup, boolean z) {
        m2646h(z);
        ArrayList arrayList = this.f5207e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f5208f;
        if (size <= 0 && arrayList2.size() <= 0) {
            m2644d(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                d80 d80Var = new d80(viewFindViewById);
                if (z) {
                    mo1583f(d80Var);
                } else {
                    mo1581c(d80Var);
                }
                d80Var.f1336c.add(this);
                mo1582e(d80Var);
                if (z) {
                    m2639b(this.f5209g, viewFindViewById, d80Var);
                } else {
                    m2639b(this.f5210h, viewFindViewById, d80Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            d80 d80Var2 = new d80(view);
            if (z) {
                mo1583f(d80Var2);
            } else {
                mo1581c(d80Var2);
            }
            d80Var2.f1336c.add(this);
            mo1582e(d80Var2);
            if (z) {
                m2639b(this.f5209g, view, d80Var2);
            } else {
                m2639b(this.f5210h, view, d80Var2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2646h(boolean z) {
        if (z) {
            ((C0511n6) this.f5209g.f2794a).clear();
            ((SparseArray) this.f5209g.f2795b).clear();
            ((C0235fs) this.f5209g.f2796c).m1107a();
        } else {
            ((C0511n6) this.f5210h.f2794a).clear();
            ((SparseArray) this.f5210h.f2795b).clear();
            ((C0235fs) this.f5210h.f2796c).m1107a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public x70 clone() {
        try {
            x70 x70Var = (x70) super.clone();
            x70Var.f5220r = new ArrayList();
            x70Var.f5209g = new C0402k8(4);
            x70Var.f5210h = new C0402k8(4);
            x70Var.f5213k = null;
            x70Var.f5214l = null;
            return x70Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public Animator mo1817j(ViewGroup viewGroup, d80 d80Var, d80 d80Var2) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void mo1585k(ViewGroup viewGroup, C0402k8 c0402k8, C0402k8 c0402k82, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorMo1817j;
        int i;
        int i2;
        View view;
        d80 d80Var;
        Animator animator;
        C0511n6 c0511n6M2640n = m2640n();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            d80 d80Var2 = (d80) arrayList.get(i3);
            d80 d80Var3 = (d80) arrayList2.get(i3);
            d80 d80Var4 = null;
            if (d80Var2 != null && !d80Var2.f1336c.contains(this)) {
                d80Var2 = null;
            }
            if (d80Var3 != null && !d80Var3.f1336c.contains(this)) {
                d80Var3 = null;
            }
            if (!(d80Var2 == null && d80Var3 == null) && ((d80Var2 == null || d80Var3 == null || mo2297q(d80Var2, d80Var3)) && (animatorMo1817j = mo1817j(viewGroup, d80Var2, d80Var3)) != null)) {
                String str = this.f5203a;
                if (d80Var3 != null) {
                    view = d80Var3.f1335b;
                    String[] strArrMo1818o = mo1818o();
                    if (strArrMo1818o != null && strArrMo1818o.length > 0) {
                        d80Var = new d80(view);
                        d80 d80Var5 = (d80) ((C0511n6) c0402k82.f2794a).getOrDefault(view, null);
                        i = size;
                        if (d80Var5 != null) {
                            int i4 = 0;
                            while (i4 < strArrMo1818o.length) {
                                String str2 = strArrMo1818o[i4];
                                d80Var.f1334a.put(str2, d80Var5.f1334a.get(str2));
                                i4++;
                                i3 = i3;
                                d80Var5 = d80Var5;
                            }
                        }
                        i2 = i3;
                        int i5 = c0511n6M2640n.f681c;
                        for (int i6 = 0; i6 < i5; i6++) {
                            v70 v70Var = (v70) c0511n6M2640n.getOrDefault((Animator) c0511n6M2640n.m485h(i6), null);
                            if (v70Var.f4915c != null && v70Var.f4913a == view && v70Var.f4914b.equals(str) && v70Var.f4915c.equals(d80Var)) {
                                animator = null;
                                break;
                            }
                        }
                    } else {
                        i = size;
                        i2 = i3;
                        d80Var = null;
                    }
                    animator = animatorMo1817j;
                    animatorMo1817j = animator;
                    d80Var4 = d80Var;
                } else {
                    i = size;
                    i2 = i3;
                    view = d80Var2.f1335b;
                }
                if (animatorMo1817j != null) {
                    ib0 ib0Var = gb0.f1949a;
                    ec0 ec0Var = new ec0(viewGroup);
                    v70 v70Var2 = new v70();
                    v70Var2.f4913a = view;
                    v70Var2.f4914b = str;
                    v70Var2.f4915c = d80Var4;
                    v70Var2.f4916d = ec0Var;
                    v70Var2.f4917e = this;
                    c0511n6M2640n.put(animatorMo1817j, v70Var2);
                    this.f5220r.add(animatorMo1817j);
                }
            } else {
                i = size;
                i2 = i3;
            }
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator2 = (Animator) this.f5220r.get(sparseIntArray.keyAt(i7));
                animator2.setStartDelay(animator2.getStartDelay() + (((long) sparseIntArray.valueAt(i7)) - Long.MAX_VALUE));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2647l() {
        int i = this.f5216n - 1;
        this.f5216n = i;
        if (i == 0) {
            ArrayList arrayList = this.f5219q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5219q.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((w70) arrayList2.get(i2)).mo1670e(this);
                }
            }
            for (int i3 = 0; i3 < ((C0235fs) this.f5209g.f2796c).m1111e(); i3++) {
                View view = (View) ((C0235fs) this.f5209g.f2796c).m1112f(i3);
                if (view != null) {
                    WeakHashMap weakHashMap = oa0.f3426a;
                    x90.m2670r(view, false);
                }
            }
            for (int i4 = 0; i4 < ((C0235fs) this.f5210h.f2796c).m1111e(); i4++) {
                View view2 = (View) ((C0235fs) this.f5210h.f2796c).m1112f(i4);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = oa0.f3426a;
                    x90.m2670r(view2, false);
                }
            }
            this.f5218p = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.f5214l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.f5213k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (p000.d80) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p000.d80 m2648m(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            j7 r0 = r4.f5211i
            if (r0 == 0) goto L9
            d80 r5 = r0.m2648m(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.f5213k
            goto L10
        Le:
            java.util.ArrayList r0 = r4.f5214l
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            d80 r3 = (p000.d80) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f1335b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r5 = r4.f5214l
            goto L35
        L33:
            java.util.ArrayList r5 = r4.f5213k
        L35:
            java.lang.Object r5 = r5.get(r2)
            d80 r5 = (p000.d80) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.x70.m2648m(android.view.View, boolean):d80");
    }

    /* JADX INFO: renamed from: o */
    public String[] mo1818o() {
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final d80 m2649p(View view, boolean z) {
        C0364j7 c0364j7 = this.f5211i;
        if (c0364j7 != null) {
            return c0364j7.m2649p(view, z);
        }
        return (d80) ((C0511n6) (z ? this.f5209g : this.f5210h).f2794a).getOrDefault(view, null);
    }

    /* JADX INFO: renamed from: q */
    public boolean mo2297q(d80 d80Var, d80 d80Var2) {
        if (d80Var != null && d80Var2 != null) {
            String[] strArrMo1818o = mo1818o();
            if (strArrMo1818o != null) {
                for (String str : strArrMo1818o) {
                    if (m2641s(d80Var, d80Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = d80Var.f1334a.keySet().iterator();
                while (it.hasNext()) {
                    if (m2641s(d80Var, d80Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m2650r(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f5207e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f5208f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    /* JADX INFO: renamed from: t */
    public void mo1586t(View view) {
        if (this.f5218p) {
            return;
        }
        C0511n6 c0511n6M2640n = m2640n();
        int i = c0511n6M2640n.f681c;
        ib0 ib0Var = gb0.f1949a;
        WindowId windowId = view.getWindowId();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            v70 v70Var = (v70) c0511n6M2640n.m487j(i2);
            if (v70Var.f4913a != null && v70Var.f4916d.f1573a.equals(windowId)) {
                ((Animator) c0511n6M2640n.m485h(i2)).pause();
            }
        }
        ArrayList arrayList = this.f5219q;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f5219q.clone();
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((w70) arrayList2.get(i3)).mo1668c();
            }
        }
        this.f5217o = true;
    }

    public final String toString() {
        return mo1579E("");
    }

    /* JADX INFO: renamed from: u */
    public void m2651u(w70 w70Var) {
        ArrayList arrayList = this.f5219q;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(w70Var);
        if (this.f5219q.size() == 0) {
            this.f5219q = null;
        }
    }

    /* JADX INFO: renamed from: v */
    public void mo1587v(View view) {
        if (this.f5217o) {
            if (!this.f5218p) {
                C0511n6 c0511n6M2640n = m2640n();
                int i = c0511n6M2640n.f681c;
                ib0 ib0Var = gb0.f1949a;
                WindowId windowId = view.getWindowId();
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    v70 v70Var = (v70) c0511n6M2640n.m487j(i2);
                    if (v70Var.f4913a != null && v70Var.f4916d.f1573a.equals(windowId)) {
                        ((Animator) c0511n6M2640n.m485h(i2)).resume();
                    }
                }
                ArrayList arrayList = this.f5219q;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f5219q.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((w70) arrayList2.get(i3)).mo1669d();
                    }
                }
            }
            this.f5217o = false;
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo1588w() {
        m2642D();
        C0511n6 c0511n6M2640n = m2640n();
        ArrayList arrayList = this.f5220r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (c0511n6M2640n.containsKey(animator)) {
                m2642D();
                if (animator != null) {
                    animator.addListener(new u70(this, c0511n6M2640n));
                    long j = this.f5205c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f5204b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f5206d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0913y0(5, this));
                    animator.start();
                }
            }
        }
        this.f5220r.clear();
        m2647l();
    }

    /* JADX INFO: renamed from: x */
    public void mo1589x(long j) {
        this.f5205c = j;
    }

    /* JADX INFO: renamed from: z */
    public void mo1591z(TimeInterpolator timeInterpolator) {
        this.f5206d = timeInterpolator;
    }

    /* JADX INFO: renamed from: e */
    public void mo1582e(d80 d80Var) {
    }

    /* JADX INFO: renamed from: y */
    public void mo1590y(AbstractC0498mu abstractC0498mu) {
    }

    /* JADX INFO: renamed from: B */
    public void mo1577B() {
    }
}
