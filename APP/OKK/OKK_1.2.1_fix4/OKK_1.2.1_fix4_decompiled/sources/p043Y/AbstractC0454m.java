package p043Y;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p001A0.C0038n;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p006D.C0086X;
import p037U.AbstractC0358S;
import p063j.AbstractC0959d;
import p063j.C0957b;
import p063j.C0960e;
import p089x0.C1121e;

/* JADX INFO: renamed from: Y.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0454m implements Cloneable {

    /* JADX INFO: renamed from: w */
    public static final Animator[] f1005w = new Animator[0];

    /* JADX INFO: renamed from: x */
    public static final int[] f1006x = {2, 1, 3, 4};

    /* JADX INFO: renamed from: y */
    public static final C1121e f1007y = new C1121e(19);

    /* JADX INFO: renamed from: z */
    public static final ThreadLocal f1008z = new ThreadLocal();

    /* JADX INFO: renamed from: k */
    public ArrayList f1019k;

    /* JADX INFO: renamed from: l */
    public ArrayList f1020l;

    /* JADX INFO: renamed from: m */
    public InterfaceC0452k[] f1021m;

    /* JADX INFO: renamed from: a */
    public final String f1009a = getClass().getName();

    /* JADX INFO: renamed from: b */
    public long f1010b = -1;

    /* JADX INFO: renamed from: c */
    public long f1011c = -1;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f1012d = null;

    /* JADX INFO: renamed from: e */
    public final ArrayList f1013e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f1014f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public C0463v f1015g = new C0463v(0);

    /* JADX INFO: renamed from: h */
    public C0463v f1016h = new C0463v(0);

    /* JADX INFO: renamed from: i */
    public C0442a f1017i = null;

    /* JADX INFO: renamed from: j */
    public final int[] f1018j = f1006x;

    /* JADX INFO: renamed from: n */
    public final ArrayList f1022n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public Animator[] f1023o = f1005w;

    /* JADX INFO: renamed from: p */
    public int f1024p = 0;

    /* JADX INFO: renamed from: q */
    public boolean f1025q = false;

    /* JADX INFO: renamed from: r */
    public boolean f1026r = false;

    /* JADX INFO: renamed from: s */
    public AbstractC0454m f1027s = null;

    /* JADX INFO: renamed from: t */
    public ArrayList f1028t = null;

    /* JADX INFO: renamed from: u */
    public ArrayList f1029u = new ArrayList();

    /* JADX INFO: renamed from: v */
    public C1121e f1030v = f1007y;

    /* JADX INFO: renamed from: b */
    public static void m1075b(C0463v c0463v, View view, C0462u c0462u) {
        ((C0957b) c0463v.f1044a).put(view, c0462u);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) c0463v.f1046c;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        Field field = AbstractC0080Q.f219a;
        String strM221k = AbstractC0070G.m221k(view);
        if (strM221k != null) {
            C0957b c0957b = (C0957b) c0463v.f1045b;
            if (c0957b.containsKey(strM221k)) {
                c0957b.put(strM221k, null);
            } else {
                c0957b.put(strM221k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0960e c0960e = (C0960e) c0463v.f1047d;
                if (c0960e.f3405a) {
                    c0960e.m2308c();
                }
                if (AbstractC0959d.m2305b(c0960e.f3406b, c0960e.f3408d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c0960e.m2310e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c0960e.m2309d(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c0960e.m2310e(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static C0957b m1076p() {
        ThreadLocal threadLocal = f1008z;
        C0957b c0957b = (C0957b) threadLocal.get();
        if (c0957b != null) {
            return c0957b;
        }
        C0957b c0957b2 = new C0957b();
        threadLocal.set(c0957b2);
        return c0957b2;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m1077u(C0462u c0462u, C0462u c0462u2, String str) {
        Object obj = c0462u.f1041a.get(str);
        Object obj2 = c0462u2.f1041a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: A */
    public void mo1047A(long j2) {
        this.f1011c = j2;
    }

    /* JADX INFO: renamed from: B */
    public void mo1048B(AbstractC0358S abstractC0358S) {
    }

    /* JADX INFO: renamed from: C */
    public void mo1049C(TimeInterpolator timeInterpolator) {
        this.f1012d = timeInterpolator;
    }

    /* JADX INFO: renamed from: D */
    public void mo1050D(C1121e c1121e) {
        if (c1121e == null) {
            this.f1030v = f1007y;
        } else {
            this.f1030v = c1121e;
        }
    }

    /* JADX INFO: renamed from: E */
    public void mo1051E() {
    }

    /* JADX INFO: renamed from: F */
    public void mo1052F(long j2) {
        this.f1010b = j2;
    }

    /* JADX INFO: renamed from: G */
    public final void m1078G() {
        if (this.f1024p == 0) {
            m1088v(this, InterfaceC0453l.f1000a);
            this.f1026r = false;
        }
        this.f1024p++;
    }

    /* JADX INFO: renamed from: H */
    public String mo1053H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f1011c != -1) {
            sb.append("dur(");
            sb.append(this.f1011c);
            sb.append(") ");
        }
        if (this.f1010b != -1) {
            sb.append("dly(");
            sb.append(this.f1010b);
            sb.append(") ");
        }
        if (this.f1012d != null) {
            sb.append("interp(");
            sb.append(this.f1012d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f1013e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1014f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i2));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i3));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m1079a(InterfaceC0452k interfaceC0452k) {
        if (this.f1028t == null) {
            this.f1028t = new ArrayList();
        }
        this.f1028t.add(interfaceC0452k);
    }

    /* JADX INFO: renamed from: c */
    public void mo1055c() {
        ArrayList arrayList = this.f1022n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1023o);
        this.f1023o = f1005w;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.cancel();
        }
        this.f1023o = animatorArr;
        m1088v(this, InterfaceC0453l.f1002c);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo1056d(C0462u c0462u);

    /* JADX INFO: renamed from: e */
    public final void m1080e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C0462u c0462u = new C0462u(view);
            if (z2) {
                mo1058g(c0462u);
            } else {
                mo1056d(c0462u);
            }
            c0462u.f1043c.add(this);
            mo1057f(c0462u);
            if (z2) {
                m1075b(this.f1015g, view, c0462u);
            } else {
                m1075b(this.f1016h, view, c0462u);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                m1080e(viewGroup.getChildAt(i2), z2);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo1057f(C0462u c0462u) {
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo1058g(C0462u c0462u);

    /* JADX INFO: renamed from: h */
    public final void m1081h(ViewGroup viewGroup, boolean z2) {
        m1082i(z2);
        ArrayList arrayList = this.f1013e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1014f;
        if (size <= 0 && arrayList2.size() <= 0) {
            m1080e(viewGroup, z2);
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i2)).intValue());
            if (viewFindViewById != null) {
                C0462u c0462u = new C0462u(viewFindViewById);
                if (z2) {
                    mo1058g(c0462u);
                } else {
                    mo1056d(c0462u);
                }
                c0462u.f1043c.add(this);
                mo1057f(c0462u);
                if (z2) {
                    m1075b(this.f1015g, viewFindViewById, c0462u);
                } else {
                    m1075b(this.f1016h, viewFindViewById, c0462u);
                }
            }
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            View view = (View) arrayList2.get(i3);
            C0462u c0462u2 = new C0462u(view);
            if (z2) {
                mo1058g(c0462u2);
            } else {
                mo1056d(c0462u2);
            }
            c0462u2.f1043c.add(this);
            mo1057f(c0462u2);
            if (z2) {
                m1075b(this.f1015g, view, c0462u2);
            } else {
                m1075b(this.f1016h, view, c0462u2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1082i(boolean z2) {
        if (z2) {
            ((C0957b) this.f1015g.f1044a).clear();
            ((SparseArray) this.f1015g.f1046c).clear();
            ((C0960e) this.f1015g.f1047d).m2306a();
        } else {
            ((C0957b) this.f1016h.f1044a).clear();
            ((SparseArray) this.f1016h.f1046c).clear();
            ((C0960e) this.f1016h.f1047d).m2306a();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: j */
    public AbstractC0454m clone() {
        try {
            AbstractC0454m abstractC0454m = (AbstractC0454m) super.clone();
            abstractC0454m.f1029u = new ArrayList();
            abstractC0454m.f1015g = new C0463v(0);
            abstractC0454m.f1016h = new C0463v(0);
            abstractC0454m.f1019k = null;
            abstractC0454m.f1020l = null;
            abstractC0454m.f1027s = this;
            abstractC0454m.f1028t = null;
            return abstractC0454m;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: k */
    public Animator mo1066k(ViewGroup viewGroup, C0462u c0462u, C0462u c0462u2) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void mo1060l(ViewGroup viewGroup, C0463v c0463v, C0463v c0463v2, ArrayList arrayList, ArrayList arrayList2) {
        int i2;
        View view;
        C0462u c0462u;
        Animator animator;
        C0462u c0462u2;
        C0957b c0957bM1076p = m1076p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m1085o().getClass();
        int i3 = 0;
        while (i3 < size) {
            C0462u c0462u3 = (C0462u) arrayList.get(i3);
            C0462u c0462u4 = (C0462u) arrayList2.get(i3);
            if (c0462u3 != null && !c0462u3.f1043c.contains(this)) {
                c0462u3 = null;
            }
            if (c0462u4 != null && !c0462u4.f1043c.contains(this)) {
                c0462u4 = null;
            }
            if ((c0462u3 != null || c0462u4 != null) && (c0462u3 == null || c0462u4 == null || mo1073s(c0462u3, c0462u4))) {
                Animator animatorMo1066k = mo1066k(viewGroup, c0462u3, c0462u4);
                if (animatorMo1066k != null) {
                    String str = this.f1009a;
                    if (c0462u4 != null) {
                        String[] strArrMo1067q = mo1067q();
                        view = c0462u4.f1042b;
                        if (strArrMo1067q != null && strArrMo1067q.length > 0) {
                            c0462u2 = new C0462u(view);
                            C0462u c0462u5 = (C0462u) ((C0957b) c0463v2.f1044a).getOrDefault(view, null);
                            i2 = size;
                            if (c0462u5 != null) {
                                int i4 = 0;
                                while (i4 < strArrMo1067q.length) {
                                    HashMap map = c0462u2.f1041a;
                                    String str2 = strArrMo1067q[i4];
                                    map.put(str2, c0462u5.f1041a.get(str2));
                                    i4++;
                                    strArrMo1067q = strArrMo1067q;
                                }
                            }
                            int i5 = c0957bM1076p.f3432c;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator = animatorMo1066k;
                                    break;
                                }
                                C0451j c0451j = (C0451j) c0957bM1076p.getOrDefault((Animator) c0957bM1076p.m2322h(i6), null);
                                if (c0451j.f996c != null && c0451j.f994a == view && c0451j.f995b.equals(str) && c0451j.f996c.equals(c0462u2)) {
                                    animator = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i2 = size;
                            animator = animatorMo1066k;
                            c0462u2 = null;
                        }
                        animatorMo1066k = animator;
                        c0462u = c0462u2;
                    } else {
                        i2 = size;
                        view = c0462u3.f1042b;
                        c0462u = null;
                    }
                    if (animatorMo1066k != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        C0451j c0451j2 = new C0451j();
                        c0451j2.f994a = view;
                        c0451j2.f995b = str;
                        c0451j2.f996c = c0462u;
                        c0451j2.f997d = windowId;
                        c0451j2.f998e = this;
                        c0451j2.f999f = animatorMo1066k;
                        c0957bM1076p.put(animatorMo1066k, c0451j2);
                        this.f1029u.add(animatorMo1066k);
                    }
                }
                i3++;
                size = i2;
            }
            i2 = size;
            i3++;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                C0451j c0451j3 = (C0451j) c0957bM1076p.getOrDefault((Animator) this.f1029u.get(sparseIntArray.keyAt(i7)), null);
                c0451j3.f999f.setStartDelay(c0451j3.f999f.getStartDelay() + (((long) sparseIntArray.valueAt(i7)) - Long.MAX_VALUE));
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1083m() {
        int i2 = this.f1024p - 1;
        this.f1024p = i2;
        if (i2 == 0) {
            m1088v(this, InterfaceC0453l.f1001b);
            for (int i3 = 0; i3 < ((C0960e) this.f1015g.f1047d).m2311f(); i3++) {
                View view = (View) ((C0960e) this.f1015g.f1047d).m2312g(i3);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < ((C0960e) this.f1016h.f1047d).m2311f(); i4++) {
                View view2 = (View) ((C0960e) this.f1016h.f1047d).m2312g(i4);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f1026r = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f1020l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f1019k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (p043Y.C0462u) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0462u m1084n(View view, boolean z2) {
        C0442a c0442a = this.f1017i;
        if (c0442a != null) {
            return c0442a.m1084n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f1019k : this.f1020l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            C0462u c0462u = (C0462u) arrayList.get(i2);
            if (c0462u == null) {
                return null;
            }
            if (c0462u.f1042b == view) {
                break;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC0454m m1085o() {
        C0442a c0442a = this.f1017i;
        return c0442a != null ? c0442a.m1085o() : this;
    }

    /* JADX INFO: renamed from: q */
    public String[] mo1067q() {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final C0462u m1086r(View view, boolean z2) {
        C0442a c0442a = this.f1017i;
        if (c0442a != null) {
            return c0442a.m1086r(view, z2);
        }
        return (C0462u) ((C0957b) (z2 ? this.f1015g : this.f1016h).f1044a).getOrDefault(view, null);
    }

    /* JADX INFO: renamed from: s */
    public boolean mo1073s(C0462u c0462u, C0462u c0462u2) {
        if (c0462u == null || c0462u2 == null) {
            return false;
        }
        String[] strArrMo1067q = mo1067q();
        if (strArrMo1067q == null) {
            Iterator it = c0462u.f1041a.keySet().iterator();
            while (it.hasNext()) {
                if (m1077u(c0462u, c0462u2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrMo1067q) {
            if (!m1077u(c0462u, c0462u2, str)) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1087t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f1013e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1014f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return mo1053H("");
    }

    /* JADX INFO: renamed from: v */
    public final void m1088v(AbstractC0454m abstractC0454m, InterfaceC0453l interfaceC0453l) {
        AbstractC0454m abstractC0454m2 = this.f1027s;
        if (abstractC0454m2 != null) {
            abstractC0454m2.m1088v(abstractC0454m, interfaceC0453l);
        }
        ArrayList arrayList = this.f1028t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f1028t.size();
        InterfaceC0452k[] interfaceC0452kArr = this.f1021m;
        if (interfaceC0452kArr == null) {
            interfaceC0452kArr = new InterfaceC0452k[size];
        }
        this.f1021m = null;
        InterfaceC0452k[] interfaceC0452kArr2 = (InterfaceC0452k[]) this.f1028t.toArray(interfaceC0452kArr);
        for (int i2 = 0; i2 < size; i2++) {
            interfaceC0453l.mo54a(interfaceC0452kArr2[i2], abstractC0454m);
            interfaceC0452kArr2[i2] = null;
        }
        this.f1021m = interfaceC0452kArr2;
    }

    /* JADX INFO: renamed from: w */
    public void mo1061w(View view) {
        if (this.f1026r) {
            return;
        }
        ArrayList arrayList = this.f1022n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1023o);
        this.f1023o = f1005w;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.pause();
        }
        this.f1023o = animatorArr;
        m1088v(this, InterfaceC0453l.f1003d);
        this.f1025q = true;
    }

    /* JADX INFO: renamed from: x */
    public AbstractC0454m mo1062x(InterfaceC0452k interfaceC0452k) {
        AbstractC0454m abstractC0454m;
        ArrayList arrayList = this.f1028t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(interfaceC0452k) && (abstractC0454m = this.f1027s) != null) {
            abstractC0454m.mo1062x(interfaceC0452k);
        }
        if (this.f1028t.size() == 0) {
            this.f1028t = null;
        }
        return this;
    }

    /* JADX INFO: renamed from: y */
    public void mo1063y(View view) {
        if (this.f1025q) {
            if (!this.f1026r) {
                ArrayList arrayList = this.f1022n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1023o);
                this.f1023o = f1005w;
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    Animator animator = animatorArr[i2];
                    animatorArr[i2] = null;
                    animator.resume();
                }
                this.f1023o = animatorArr;
                m1088v(this, InterfaceC0453l.f1004e);
            }
            this.f1025q = false;
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo1064z() {
        m1078G();
        C0957b c0957bM1076p = m1076p();
        for (Animator animator : this.f1029u) {
            if (c0957bM1076p.containsKey(animator)) {
                m1078G();
                if (animator != null) {
                    animator.addListener(new C0086X(this, c0957bM1076p));
                    long j2 = this.f1011c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f1010b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f1012d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0038n(1, this));
                    animator.start();
                }
            }
        }
        this.f1029u.clear();
        m1083m();
    }
}
