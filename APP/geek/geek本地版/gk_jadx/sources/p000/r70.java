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
public abstract class r70 implements Cloneable {

    /* JADX INFO: renamed from: t */
    public static final int[] f4222t = {2, 1, 3, 4};

    /* JADX INFO: renamed from: u */
    public static final C0354iy f4223u = new C0354iy(8);

    /* JADX INFO: renamed from: v */
    public static final ThreadLocal f4224v = new ThreadLocal();

    /* JADX INFO: renamed from: k */
    public ArrayList f4235k;

    /* JADX INFO: renamed from: l */
    public ArrayList f4236l;

    /* JADX INFO: renamed from: a */
    public final String f4225a = getClass().getName();

    /* JADX INFO: renamed from: b */
    public long f4226b = -1;

    /* JADX INFO: renamed from: c */
    public long f4227c = -1;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f4228d = null;

    /* JADX INFO: renamed from: e */
    public final ArrayList f4229e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f4230f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public C0009a8 f4231g = new C0009a8(4);

    /* JADX INFO: renamed from: h */
    public C0009a8 f4232h = new C0009a8(4);

    /* JADX INFO: renamed from: i */
    public C0956z6 f4233i = null;

    /* JADX INFO: renamed from: j */
    public final int[] f4234j = f4222t;

    /* JADX INFO: renamed from: m */
    public final ArrayList f4237m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public int f4238n = 0;

    /* JADX INFO: renamed from: o */
    public boolean f4239o = false;

    /* JADX INFO: renamed from: p */
    public boolean f4240p = false;

    /* JADX INFO: renamed from: q */
    public ArrayList f4241q = null;

    /* JADX INFO: renamed from: r */
    public ArrayList f4242r = new ArrayList();

    /* JADX INFO: renamed from: s */
    public C0354iy f4243s = f4223u;

    /* JADX INFO: renamed from: b */
    public static void m2253b(C0009a8 c0009a8, View view, x70 x70Var) {
        C0511n6 c0511n6 = (C0511n6) c0009a8.f64a;
        C0511n6 c0511n62 = (C0511n6) c0009a8.f67d;
        SparseArray sparseArray = (SparseArray) c0009a8.f65b;
        C0079bs c0079bs = (C0079bs) c0009a8.f66c;
        c0511n6.put(view, x70Var);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = ja0.f2600a;
        String strM2665k = y90.m2665k(view);
        if (strM2665k != null) {
            if (c0511n62.containsKey(strM2665k)) {
                c0511n62.put(strM2665k, null);
            } else {
                c0511n62.put(strM2665k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c0079bs.f824a) {
                    c0079bs.m565b();
                }
                if (AbstractC0222ff.m1185d(c0079bs.f825b, c0079bs.f827d, itemIdAtPosition) < 0) {
                    s90.m2326r(view, true);
                    c0079bs.m567d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c0079bs.m566c(itemIdAtPosition, null);
                if (view2 != null) {
                    s90.m2326r(view2, false);
                    c0079bs.m567d(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static C0511n6 m2254n() {
        ThreadLocal threadLocal = f4224v;
        C0511n6 c0511n6 = (C0511n6) threadLocal.get();
        if (c0511n6 != null) {
            return c0511n6;
        }
        C0511n6 c0511n62 = new C0511n6();
        threadLocal.set(c0511n62);
        return c0511n62;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m2255s(x70 x70Var, x70 x70Var2, String str) {
        Object obj = x70Var.f5121a.get(str);
        Object obj2 = x70Var2.f5121a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: A */
    public void mo2256A(C0354iy c0354iy) {
        if (c0354iy == null) {
            this.f4243s = f4223u;
        } else {
            this.f4243s = c0354iy;
        }
    }

    /* JADX INFO: renamed from: C */
    public void mo2258C(long j) {
        this.f4226b = j;
    }

    /* JADX INFO: renamed from: D */
    public final void m2259D() {
        if (this.f4238n == 0) {
            ArrayList arrayList = this.f4241q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4241q.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((q70) arrayList2.get(i)).mo1582b();
                }
            }
            this.f4240p = false;
        }
        this.f4238n++;
    }

    /* JADX INFO: renamed from: E */
    public String mo2260E(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f4227c != -1) {
            str2 = str2 + "dur(" + this.f4227c + ") ";
        }
        if (this.f4226b != -1) {
            str2 = str2 + "dly(" + this.f4226b + ") ";
        }
        if (this.f4228d != null) {
            str2 = str2 + "interp(" + this.f4228d + ") ";
        }
        ArrayList arrayList = this.f4229e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4230f;
        if (size <= 0 && arrayList2.size() <= 0) {
            return str2;
        }
        String strM2764i = z30.m2764i(str2, "tgts(");
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    strM2764i = z30.m2764i(strM2764i, ", ");
                }
                strM2764i = strM2764i + arrayList.get(i);
            }
        }
        if (arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (i2 > 0) {
                    strM2764i = z30.m2764i(strM2764i, ", ");
                }
                strM2764i = strM2764i + arrayList2.get(i2);
            }
        }
        return z30.m2764i(strM2764i, ")");
    }

    /* JADX INFO: renamed from: a */
    public void m2261a(q70 q70Var) {
        if (this.f4241q == null) {
            this.f4241q = new ArrayList();
        }
        this.f4241q.add(q70Var);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo544c(x70 x70Var);

    /* JADX INFO: renamed from: d */
    public final void m2262d(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            x70 x70Var = new x70(view);
            if (z) {
                mo545f(x70Var);
            } else {
                mo544c(x70Var);
            }
            x70Var.f5123c.add(this);
            mo2263e(x70Var);
            if (z) {
                m2253b(this.f4231g, view, x70Var);
            } else {
                m2253b(this.f4232h, view, x70Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m2262d(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo545f(x70 x70Var);

    /* JADX INFO: renamed from: g */
    public final void m2264g(ViewGroup viewGroup, boolean z) {
        m2265h(z);
        ArrayList arrayList = this.f4229e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4230f;
        if (size <= 0 && arrayList2.size() <= 0) {
            m2262d(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                x70 x70Var = new x70(viewFindViewById);
                if (z) {
                    mo545f(x70Var);
                } else {
                    mo544c(x70Var);
                }
                x70Var.f5123c.add(this);
                mo2263e(x70Var);
                if (z) {
                    m2253b(this.f4231g, viewFindViewById, x70Var);
                } else {
                    m2253b(this.f4232h, viewFindViewById, x70Var);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            x70 x70Var2 = new x70(view);
            if (z) {
                mo545f(x70Var2);
            } else {
                mo544c(x70Var2);
            }
            x70Var2.f5123c.add(this);
            mo2263e(x70Var2);
            if (z) {
                m2253b(this.f4231g, view, x70Var2);
            } else {
                m2253b(this.f4232h, view, x70Var2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2265h(boolean z) {
        if (z) {
            ((C0511n6) this.f4231g.f64a).clear();
            ((SparseArray) this.f4231g.f65b).clear();
            ((C0079bs) this.f4231g.f66c).m564a();
        } else {
            ((C0511n6) this.f4232h.f64a).clear();
            ((SparseArray) this.f4232h.f65b).clear();
            ((C0079bs) this.f4232h.f66c).m564a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public r70 clone() {
        try {
            r70 r70Var = (r70) super.clone();
            r70Var.f4242r = new ArrayList();
            r70Var.f4231g = new C0009a8(4);
            r70Var.f4232h = new C0009a8(4);
            r70Var.f4235k = null;
            r70Var.f4236l = null;
            return r70Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public Animator mo546j(ViewGroup viewGroup, x70 x70Var, x70 x70Var2) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public void mo2267k(ViewGroup viewGroup, C0009a8 c0009a8, C0009a8 c0009a82, ArrayList arrayList, ArrayList arrayList2) {
        Animator animatorMo546j;
        int i;
        int i2;
        View view;
        x70 x70Var;
        Animator animator;
        C0511n6 c0511n6M2254n = m2254n();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            x70 x70Var2 = (x70) arrayList.get(i3);
            x70 x70Var3 = (x70) arrayList2.get(i3);
            x70 x70Var4 = null;
            if (x70Var2 != null && !x70Var2.f5123c.contains(this)) {
                x70Var2 = null;
            }
            if (x70Var3 != null && !x70Var3.f5123c.contains(this)) {
                x70Var3 = null;
            }
            if (!(x70Var2 == null && x70Var3 == null) && ((x70Var2 == null || x70Var3 == null || mo2123q(x70Var2, x70Var3)) && (animatorMo546j = mo546j(viewGroup, x70Var2, x70Var3)) != null)) {
                String str = this.f4225a;
                if (x70Var3 != null) {
                    view = x70Var3.f5122b;
                    String[] strArrMo547o = mo547o();
                    if (strArrMo547o != null && strArrMo547o.length > 0) {
                        x70Var = new x70(view);
                        x70 x70Var5 = (x70) ((C0511n6) c0009a82.f64a).getOrDefault(view, null);
                        i = size;
                        if (x70Var5 != null) {
                            int i4 = 0;
                            while (i4 < strArrMo547o.length) {
                                String str2 = strArrMo547o[i4];
                                x70Var.f5121a.put(str2, x70Var5.f5121a.get(str2));
                                i4++;
                                i3 = i3;
                                x70Var5 = x70Var5;
                            }
                        }
                        i2 = i3;
                        int i5 = c0511n6M2254n.f4662c;
                        for (int i6 = 0; i6 < i5; i6++) {
                            p70 p70Var = (p70) c0511n6M2254n.getOrDefault((Animator) c0511n6M2254n.m2416h(i6), null);
                            if (p70Var.f3677c != null && p70Var.f3675a == view && p70Var.f3676b.equals(str) && p70Var.f3677c.equals(x70Var)) {
                                animator = null;
                                break;
                            }
                        }
                    } else {
                        i = size;
                        i2 = i3;
                        x70Var = null;
                    }
                    animator = animatorMo546j;
                    animatorMo546j = animator;
                    x70Var4 = x70Var;
                } else {
                    i = size;
                    i2 = i3;
                    view = x70Var2.f5122b;
                }
                if (animatorMo546j != null) {
                    db0 db0Var = bb0.f804a;
                    zb0 zb0Var = new zb0(viewGroup);
                    p70 p70Var2 = new p70();
                    p70Var2.f3675a = view;
                    p70Var2.f3676b = str;
                    p70Var2.f3677c = x70Var4;
                    p70Var2.f3678d = zb0Var;
                    p70Var2.f3679e = this;
                    c0511n6M2254n.put(animatorMo546j, p70Var2);
                    this.f4242r.add(animatorMo546j);
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
                Animator animator2 = (Animator) this.f4242r.get(sparseIntArray.keyAt(i7));
                animator2.setStartDelay(animator2.getStartDelay() + (((long) sparseIntArray.valueAt(i7)) - Long.MAX_VALUE));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2268l() {
        int i = this.f4238n - 1;
        this.f4238n = i;
        if (i == 0) {
            ArrayList arrayList = this.f4241q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4241q.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((q70) arrayList2.get(i2)).mo1431e(this);
                }
            }
            for (int i3 = 0; i3 < ((C0079bs) this.f4231g.f66c).m568e(); i3++) {
                View view = (View) ((C0079bs) this.f4231g.f66c).m569f(i3);
                if (view != null) {
                    WeakHashMap weakHashMap = ja0.f2600a;
                    s90.m2326r(view, false);
                }
            }
            for (int i4 = 0; i4 < ((C0079bs) this.f4232h.f66c).m568e(); i4++) {
                View view2 = (View) ((C0079bs) this.f4232h.f66c).m569f(i4);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = ja0.f2600a;
                    s90.m2326r(view2, false);
                }
            }
            this.f4240p = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.f4236l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.f4235k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (p000.x70) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p000.x70 m2269m(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            z6 r0 = r4.f4233i
            if (r0 == 0) goto L9
            x70 r5 = r0.m2269m(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.f4235k
            goto L10
        Le:
            java.util.ArrayList r0 = r4.f4236l
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            x70 r3 = (p000.x70) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.f5122b
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
            java.util.ArrayList r5 = r4.f4236l
            goto L35
        L33:
            java.util.ArrayList r5 = r4.f4235k
        L35:
            java.lang.Object r5 = r5.get(r2)
            x70 r5 = (p000.x70) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.r70.m2269m(android.view.View, boolean):x70");
    }

    /* JADX INFO: renamed from: o */
    public String[] mo547o() {
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final x70 m2270p(View view, boolean z) {
        C0956z6 c0956z6 = this.f4233i;
        if (c0956z6 != null) {
            return c0956z6.m2270p(view, z);
        }
        return (x70) ((C0511n6) (z ? this.f4231g : this.f4232h).f64a).getOrDefault(view, null);
    }

    /* JADX INFO: renamed from: q */
    public boolean mo2123q(x70 x70Var, x70 x70Var2) {
        if (x70Var != null && x70Var2 != null) {
            String[] strArrMo547o = mo547o();
            if (strArrMo547o != null) {
                for (String str : strArrMo547o) {
                    if (m2255s(x70Var, x70Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = x70Var.f5121a.keySet().iterator();
                while (it.hasNext()) {
                    if (m2255s(x70Var, x70Var2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m2271r(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f4229e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4230f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    /* JADX INFO: renamed from: t */
    public void mo2272t(View view) {
        if (this.f4240p) {
            return;
        }
        C0511n6 c0511n6M2254n = m2254n();
        int i = c0511n6M2254n.f4662c;
        db0 db0Var = bb0.f804a;
        WindowId windowId = view.getWindowId();
        for (int i2 = i - 1; i2 >= 0; i2--) {
            p70 p70Var = (p70) c0511n6M2254n.m2418j(i2);
            if (p70Var.f3675a != null && p70Var.f3678d.f5533a.equals(windowId)) {
                ((Animator) c0511n6M2254n.m2416h(i2)).pause();
            }
        }
        ArrayList arrayList = this.f4241q;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f4241q.clone();
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((q70) arrayList2.get(i3)).mo1429c();
            }
        }
        this.f4239o = true;
    }

    public final String toString() {
        return mo2260E("");
    }

    /* JADX INFO: renamed from: u */
    public void m2273u(q70 q70Var) {
        ArrayList arrayList = this.f4241q;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(q70Var);
        if (this.f4241q.size() == 0) {
            this.f4241q = null;
        }
    }

    /* JADX INFO: renamed from: v */
    public void mo2274v(View view) {
        if (this.f4239o) {
            if (!this.f4240p) {
                C0511n6 c0511n6M2254n = m2254n();
                int i = c0511n6M2254n.f4662c;
                db0 db0Var = bb0.f804a;
                WindowId windowId = view.getWindowId();
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    p70 p70Var = (p70) c0511n6M2254n.m2418j(i2);
                    if (p70Var.f3675a != null && p70Var.f3678d.f5533a.equals(windowId)) {
                        ((Animator) c0511n6M2254n.m2416h(i2)).resume();
                    }
                }
                ArrayList arrayList = this.f4241q;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f4241q.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((q70) arrayList2.get(i3)).mo1430d();
                    }
                }
            }
            this.f4239o = false;
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo2275w() {
        m2259D();
        C0511n6 c0511n6M2254n = m2254n();
        ArrayList arrayList = this.f4242r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (c0511n6M2254n.containsKey(animator)) {
                m2259D();
                if (animator != null) {
                    animator.addListener(new o70(this, c0511n6M2254n));
                    long j = this.f4227c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f4226b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f4228d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0913y0(5, this));
                    animator.start();
                }
            }
        }
        this.f4242r.clear();
        m2268l();
    }

    /* JADX INFO: renamed from: x */
    public void mo2276x(long j) {
        this.f4227c = j;
    }

    /* JADX INFO: renamed from: z */
    public void mo2278z(TimeInterpolator timeInterpolator) {
        this.f4228d = timeInterpolator;
    }

    /* JADX INFO: renamed from: e */
    public void mo2263e(x70 x70Var) {
    }

    /* JADX INFO: renamed from: y */
    public void mo2277y(AbstractC0273gt abstractC0273gt) {
    }

    /* JADX INFO: renamed from: B */
    public void mo2257B() {
    }
}
