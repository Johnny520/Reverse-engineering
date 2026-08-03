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

/* JADX INFO: renamed from: IB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0356IB implements Cloneable {

    /* JADX INFO: renamed from: w */
    public static final Animator[] f1192w = new Animator[0];

    /* JADX INFO: renamed from: x */
    public static final int[] f1193x = {2, 1, 3, 4};

    /* JADX INFO: renamed from: y */
    public static final C1517hw f1194y = new C1517hw(15);

    /* JADX INFO: renamed from: z */
    public static final ThreadLocal f1195z = new ThreadLocal();

    /* JADX INFO: renamed from: k */
    public ArrayList f1206k;

    /* JADX INFO: renamed from: l */
    public ArrayList f1207l;

    /* JADX INFO: renamed from: m */
    public InterfaceC0313HB[] f1208m;

    /* JADX INFO: renamed from: a */
    public final String f1196a = getClass().getName();

    /* JADX INFO: renamed from: b */
    public long f1197b = -1;

    /* JADX INFO: renamed from: c */
    public long f1198c = -1;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f1199d = null;

    /* JADX INFO: renamed from: e */
    public final ArrayList f1200e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f1201f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public C2428qs f1202g = new C2428qs(10);

    /* JADX INFO: renamed from: h */
    public C2428qs f1203h = new C2428qs(10);

    /* JADX INFO: renamed from: i */
    public C1308d5 f1204i = null;

    /* JADX INFO: renamed from: j */
    public final int[] f1205j = f1193x;

    /* JADX INFO: renamed from: n */
    public final ArrayList f1209n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public Animator[] f1210o = f1192w;

    /* JADX INFO: renamed from: p */
    public int f1211p = 0;

    /* JADX INFO: renamed from: q */
    public boolean f1212q = false;

    /* JADX INFO: renamed from: r */
    public boolean f1213r = false;

    /* JADX INFO: renamed from: s */
    public AbstractC0356IB f1214s = null;

    /* JADX INFO: renamed from: t */
    public ArrayList f1215t = null;

    /* JADX INFO: renamed from: u */
    public ArrayList f1216u = new ArrayList();

    /* JADX INFO: renamed from: v */
    public C1517hw f1217v = f1194y;

    /* JADX INFO: renamed from: b */
    public static void m755b(C2428qs c2428qs, View view, C0657PB c0657pb) {
        C0521M4 c0521m4 = (C0521M4) c2428qs.f8520a;
        C0521M4 c0521m42 = (C0521M4) c2428qs.f8523d;
        SparseArray sparseArray = (SparseArray) c2428qs.f8521b;
        C2640vp c2640vp = (C2640vp) c2428qs.f8522c;
        c0521m4.put(view, c0657pb);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        String strM2634f = AbstractC1360eE.m2634f(view);
        if (strM2634f != null) {
            if (c0521m42.containsKey(strM2634f)) {
                c0521m42.put(strM2634f, null);
            } else {
                c0521m42.put(strM2634f, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c2640vp.m5168c(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c2640vp.m5170e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c2640vp.m5167b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c2640vp.m5170e(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static C0521M4 m756p() {
        ThreadLocal threadLocal = f1195z;
        C0521M4 c0521m4 = (C0521M4) threadLocal.get();
        if (c0521m4 != null) {
            return c0521m4;
        }
        C0521M4 c0521m42 = new C0521M4(0);
        threadLocal.set(c0521m42);
        return c0521m42;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m757u(C0657PB c0657pb, C0657PB c0657pb2, String str) {
        Object obj = c0657pb.f2099a.get(str);
        Object obj2 = c0657pb2.f2099a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: A */
    public void mo758A(long j) {
        this.f1198c = j;
    }

    /* JADX INFO: renamed from: B */
    public void mo759B(AbstractC0671Pj abstractC0671Pj) {
    }

    /* JADX INFO: renamed from: C */
    public void mo760C(TimeInterpolator timeInterpolator) {
        this.f1199d = timeInterpolator;
    }

    /* JADX INFO: renamed from: D */
    public void mo761D(C1517hw c1517hw) {
        if (c1517hw == null) {
            this.f1217v = f1194y;
        } else {
            this.f1217v = c1517hw;
        }
    }

    /* JADX INFO: renamed from: E */
    public void mo762E() {
    }

    /* JADX INFO: renamed from: F */
    public void mo763F(long j) {
        this.f1197b = j;
    }

    /* JADX INFO: renamed from: G */
    public final void m764G() {
        if (this.f1211p == 0) {
            m784v(this, C2438r1.f8547b);
            this.f1213r = false;
        }
        this.f1211p++;
    }

    /* JADX INFO: renamed from: H */
    public String mo765H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f1198c != -1) {
            sb.append("dur(");
            sb.append(this.f1198c);
            sb.append(") ");
        }
        if (this.f1197b != -1) {
            sb.append("dly(");
            sb.append(this.f1197b);
            sb.append(") ");
        }
        if (this.f1199d != null) {
            sb.append("interp(");
            sb.append(this.f1199d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f1200e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1201f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m766a(InterfaceC0313HB interfaceC0313HB) {
        if (this.f1215t == null) {
            this.f1215t = new ArrayList();
        }
        this.f1215t.add(interfaceC0313HB);
    }

    /* JADX INFO: renamed from: c */
    public void mo767c() {
        ArrayList arrayList = this.f1209n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1210o);
        this.f1210o = f1192w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f1210o = animatorArr;
        m784v(this, C2438r1.f8549d);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo768d(C0657PB c0657pb);

    /* JADX INFO: renamed from: e */
    public final void m769e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C0657PB c0657pb = new C0657PB(view);
            if (z) {
                mo771g(c0657pb);
            } else {
                mo768d(c0657pb);
            }
            c0657pb.f2101c.add(this);
            mo770f(c0657pb);
            if (z) {
                m755b(this.f1202g, view, c0657pb);
            } else {
                m755b(this.f1203h, view, c0657pb);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m769e(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo770f(C0657PB c0657pb) {
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo771g(C0657PB c0657pb);

    /* JADX INFO: renamed from: h */
    public final void m772h(ViewGroup viewGroup, boolean z) {
        m773i(z);
        ArrayList arrayList = this.f1200e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1201f;
        if (size <= 0 && arrayList2.size() <= 0) {
            m769e(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                C0657PB c0657pb = new C0657PB(viewFindViewById);
                if (z) {
                    mo771g(c0657pb);
                } else {
                    mo768d(c0657pb);
                }
                c0657pb.f2101c.add(this);
                mo770f(c0657pb);
                if (z) {
                    m755b(this.f1202g, viewFindViewById, c0657pb);
                } else {
                    m755b(this.f1203h, viewFindViewById, c0657pb);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C0657PB c0657pb2 = new C0657PB(view);
            if (z) {
                mo771g(c0657pb2);
            } else {
                mo768d(c0657pb2);
            }
            c0657pb2.f2101c.add(this);
            mo770f(c0657pb2);
            if (z) {
                m755b(this.f1202g, view, c0657pb2);
            } else {
                m755b(this.f1203h, view, c0657pb2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m773i(boolean z) {
        if (z) {
            ((C0521M4) this.f1202g.f8520a).clear();
            ((SparseArray) this.f1202g.f8521b).clear();
            ((C2640vp) this.f1202g.f8522c).m5166a();
        } else {
            ((C0521M4) this.f1203h.f8520a).clear();
            ((SparseArray) this.f1203h.f8521b).clear();
            ((C2640vp) this.f1203h.f8522c).m5166a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j */
    public AbstractC0356IB clone() {
        try {
            AbstractC0356IB abstractC0356IB = (AbstractC0356IB) super.clone();
            abstractC0356IB.f1216u = new ArrayList();
            abstractC0356IB.f1202g = new C2428qs(10);
            abstractC0356IB.f1203h = new C2428qs(10);
            abstractC0356IB.f1206k = null;
            abstractC0356IB.f1207l = null;
            abstractC0356IB.f1214s = this;
            abstractC0356IB.f1215t = null;
            return abstractC0356IB;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: k */
    public Animator mo775k(ViewGroup viewGroup, C0657PB c0657pb, C0657PB c0657pb2) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void mo776l(ViewGroup viewGroup, C2428qs c2428qs, C2428qs c2428qs2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        C0657PB c0657pb;
        Animator animator;
        C0657PB c0657pb2;
        C0521M4 c0521m4M756p = m756p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m779o().getClass();
        int i3 = 0;
        while (i3 < size) {
            C0657PB c0657pb3 = (C0657PB) arrayList.get(i3);
            C0657PB c0657pb4 = (C0657PB) arrayList2.get(i3);
            if (c0657pb3 != null && !c0657pb3.f2101c.contains(this)) {
                c0657pb3 = null;
            }
            if (c0657pb4 != null && !c0657pb4.f2101c.contains(this)) {
                c0657pb4 = null;
            }
            if ((c0657pb3 != null || c0657pb4 != null) && (c0657pb3 == null || c0657pb4 == null || mo782s(c0657pb3, c0657pb4))) {
                Animator animatorMo775k = mo775k(viewGroup, c0657pb3, c0657pb4);
                if (animatorMo775k != null) {
                    String str = this.f1196a;
                    if (c0657pb4 != null) {
                        view = c0657pb4.f2100b;
                        String[] strArrMo780q = mo780q();
                        if (strArrMo780q != null && strArrMo780q.length > 0) {
                            c0657pb2 = new C0657PB(view);
                            C0657PB c0657pb5 = (C0657PB) ((C0521M4) c2428qs2.f8520a).get(view);
                            i = size;
                            if (c0657pb5 != null) {
                                int i4 = 0;
                                while (i4 < strArrMo780q.length) {
                                    String str2 = strArrMo780q[i4];
                                    int i5 = i3;
                                    c0657pb2.f2099a.put(str2, c0657pb5.f2099a.get(str2));
                                    i4++;
                                    i3 = i5;
                                    c0657pb5 = c0657pb5;
                                }
                            }
                            i2 = i3;
                            int i6 = c0521m4M756p.f8818c;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    animator = animatorMo775k;
                                    break;
                                }
                                C0270GB c0270gb = (C0270GB) c0521m4M756p.get((Animator) c0521m4M756p.m5002f(i7));
                                if (c0270gb.f872c != null && c0270gb.f870a == view && c0270gb.f871b.equals(str) && c0270gb.f872c.equals(c0657pb2)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = animatorMo775k;
                            c0657pb2 = null;
                        }
                        animatorMo775k = animator;
                        c0657pb = c0657pb2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = c0657pb3.f2100b;
                        c0657pb = null;
                    }
                    if (animatorMo775k != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C0270GB c0270gb2 = new C0270GB();
                        c0270gb2.f870a = view;
                        c0270gb2.f871b = str;
                        c0270gb2.f872c = c0657pb;
                        c0270gb2.f873d = windowId;
                        c0270gb2.f874e = this;
                        c0270gb2.f875f = animatorMo775k;
                        c0521m4M756p.put(animatorMo775k, c0270gb2);
                        this.f1216u.add(animatorMo775k);
                    }
                }
                i3 = i2 + 1;
                size = i;
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                C0270GB c0270gb3 = (C0270GB) c0521m4M756p.get((Animator) this.f1216u.get(sparseIntArray.keyAt(i8)));
                c0270gb3.f875f.setStartDelay(c0270gb3.f875f.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m777m() {
        int i = this.f1211p - 1;
        this.f1211p = i;
        if (i == 0) {
            m784v(this, C2438r1.f8548c);
            for (int i2 = 0; i2 < ((C2640vp) this.f1202g.f8522c).m5172g(); i2++) {
                View view = (View) ((C2640vp) this.f1202g.f8522c).m5173h(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C2640vp) this.f1203h.f8522c).m5172g(); i3++) {
                View view2 = (View) ((C2640vp) this.f1203h.f8522c).m5173h(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f1213r = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.f1207l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.f1206k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (p000.C0657PB) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0657PB m778n(View view, boolean z) {
        C1308d5 c1308d5 = this.f1204i;
        if (c1308d5 != null) {
            return c1308d5.m778n(view, z);
        }
        ArrayList arrayList = z ? this.f1206k : this.f1207l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C0657PB c0657pb = (C0657PB) arrayList.get(i);
            if (c0657pb == null) {
                return null;
            }
            if (c0657pb.f2100b == view) {
                break;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC0356IB m779o() {
        C1308d5 c1308d5 = this.f1204i;
        return c1308d5 != null ? c1308d5.m779o() : this;
    }

    /* JADX INFO: renamed from: q */
    public String[] mo780q() {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final C0657PB m781r(View view, boolean z) {
        C1308d5 c1308d5 = this.f1204i;
        if (c1308d5 != null) {
            return c1308d5.m781r(view, z);
        }
        return (C0657PB) ((C0521M4) (z ? this.f1202g : this.f1203h).f8520a).get(view);
    }

    /* JADX INFO: renamed from: s */
    public boolean mo782s(C0657PB c0657pb, C0657PB c0657pb2) {
        if (c0657pb != null && c0657pb2 != null) {
            String[] strArrMo780q = mo780q();
            if (strArrMo780q != null) {
                for (String str : strArrMo780q) {
                    if (m757u(c0657pb, c0657pb2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = c0657pb.f2099a.keySet().iterator();
                while (it.hasNext()) {
                    if (m757u(c0657pb, c0657pb2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m783t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f1200e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1201f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return mo765H("");
    }

    /* JADX INFO: renamed from: v */
    public final void m784v(AbstractC0356IB abstractC0356IB, C2438r1 c2438r1) {
        AbstractC0356IB abstractC0356IB2 = this.f1214s;
        if (abstractC0356IB2 != null) {
            abstractC0356IB2.m784v(abstractC0356IB, c2438r1);
        }
        ArrayList arrayList = this.f1215t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f1215t.size();
        InterfaceC0313HB[] interfaceC0313HBArr = this.f1208m;
        if (interfaceC0313HBArr == null) {
            interfaceC0313HBArr = new InterfaceC0313HB[size];
        }
        this.f1208m = null;
        InterfaceC0313HB[] interfaceC0313HBArr2 = (InterfaceC0313HB[]) this.f1215t.toArray(interfaceC0313HBArr);
        for (int i = 0; i < size; i++) {
            InterfaceC0313HB interfaceC0313HB = interfaceC0313HBArr2[i];
            switch (c2438r1.f8552a) {
                case 12:
                    interfaceC0313HB.mo666e(abstractC0356IB);
                    break;
                case 13:
                    interfaceC0313HB.mo665d(abstractC0356IB);
                    break;
                case 14:
                    interfaceC0313HB.mo667f(abstractC0356IB);
                    break;
                case 15:
                    interfaceC0313HB.mo663b();
                    break;
                default:
                    interfaceC0313HB.mo664c();
                    break;
            }
            interfaceC0313HBArr2[i] = null;
        }
        this.f1208m = interfaceC0313HBArr2;
    }

    /* JADX INFO: renamed from: w */
    public void mo785w(View view) {
        if (this.f1213r) {
            return;
        }
        ArrayList arrayList = this.f1209n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1210o);
        this.f1210o = f1192w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f1210o = animatorArr;
        m784v(this, C2438r1.f8550e);
        this.f1212q = true;
    }

    /* JADX INFO: renamed from: x */
    public AbstractC0356IB mo786x(InterfaceC0313HB interfaceC0313HB) {
        AbstractC0356IB abstractC0356IB;
        ArrayList arrayList = this.f1215t;
        if (arrayList != null) {
            if (!arrayList.remove(interfaceC0313HB) && (abstractC0356IB = this.f1214s) != null) {
                abstractC0356IB.mo786x(interfaceC0313HB);
            }
            if (this.f1215t.size() == 0) {
                this.f1215t = null;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: y */
    public void mo787y(View view) {
        if (this.f1212q) {
            if (!this.f1213r) {
                ArrayList arrayList = this.f1209n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1210o);
                this.f1210o = f1192w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f1210o = animatorArr;
                m784v(this, C2438r1.f8551f);
            }
            this.f1212q = false;
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo788z() {
        m764G();
        C0521M4 c0521m4M756p = m756p();
        for (Animator animator : this.f1216u) {
            if (c0521m4M756p.containsKey(animator)) {
                m764G();
                if (animator != null) {
                    animator.addListener(new C0227FB(this, c0521m4M756p));
                    long j = this.f1198c;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f1197b;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f1199d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C2437r0(5, this));
                    animator.start();
                }
            }
        }
        this.f1216u.clear();
        m777m();
    }
}
