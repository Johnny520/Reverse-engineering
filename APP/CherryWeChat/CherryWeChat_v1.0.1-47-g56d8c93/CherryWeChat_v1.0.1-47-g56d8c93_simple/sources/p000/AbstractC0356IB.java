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
    public static final Animator[] f1192w = null;

    /* JADX INFO: renamed from: x */
    public static final int[] f1193x = null;

    /* JADX INFO: renamed from: y */
    public static final C1517hw f1194y = null;

    /* JADX INFO: renamed from: z */
    public static final ThreadLocal f1195z = null;

    /* JADX INFO: renamed from: a */
    public final String f1196a;

    /* JADX INFO: renamed from: b */
    public long f1197b;

    /* JADX INFO: renamed from: c */
    public long f1198c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f1199d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f1200e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f1201f;

    /* JADX INFO: renamed from: g */
    public C2428qs f1202g;

    /* JADX INFO: renamed from: h */
    public C2428qs f1203h;

    /* JADX INFO: renamed from: i */
    public C1308d5 f1204i;

    /* JADX INFO: renamed from: j */
    public final int[] f1205j;

    /* JADX INFO: renamed from: k */
    public ArrayList f1206k;

    /* JADX INFO: renamed from: l */
    public ArrayList f1207l;

    /* JADX INFO: renamed from: m */
    public InterfaceC0313HB[] f1208m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f1209n;

    /* JADX INFO: renamed from: o */
    public Animator[] f1210o;

    /* JADX INFO: renamed from: p */
    public int f1211p;

    /* JADX INFO: renamed from: q */
    public boolean f1212q;

    /* JADX INFO: renamed from: r */
    public boolean f1213r;

    /* JADX INFO: renamed from: s */
    public AbstractC0356IB f1214s;

    /* JADX INFO: renamed from: t */
    public ArrayList f1215t;

    /* JADX INFO: renamed from: u */
    public ArrayList f1216u;

    /* JADX INFO: renamed from: v */
    public C1517hw f1217v;

    static {
        f1192w = new Animator[0];
        f1193x = new int[]{2, 1, 3, 4};
        f1194y = new C1517hw(15);
        f1195z = new ThreadLocal();
    }

    public AbstractC0356IB() {
        this.f1196a = getClass().getName();
        this.f1197b = -1;
        this.f1198c = -1;
        this.f1199d = null;
        this.f1200e = new ArrayList();
        this.f1201f = new ArrayList();
        this.f1202g = new C2428qs(10);
        this.f1203h = new C2428qs(10);
        this.f1204i = null;
        this.f1205j = f1193x;
        this.f1209n = new ArrayList();
        this.f1210o = f1192w;
        this.f1211p = 0;
        this.f1212q = false;
        this.f1213r = false;
        this.f1214s = null;
        this.f1215t = null;
        this.f1216u = new ArrayList();
        this.f1217v = f1194y;
    }

    /* JADX INFO: renamed from: b */
    public static void m755b(C2428qs r4, View r5, C0657PB r6) {
        C0521M4 r0 = (C0521M4) r4.f8520a;
        C0521M4 r1 = (C0521M4) r4.f8523d;
        SparseArray r2 = (SparseArray) r4.f8521b;
        C2640vp r42 = (C2640vp) r4.f8522c;
        r0.put(r5, r6);
        int r62 = r5.getId();
        if (r62 >= 0) goto L5;
    L8:
        WeakHashMap r63 = AbstractC2185lE.f7617a;
        String r64 = AbstractC1360eE.m2634f(r5);
        if (r64 == null) goto L15;
        if (r1.containsKey(r64) == false) goto L13;
        r1.put(r64, null);
        goto L15
    L13:
        r1.put(r64, r5);
    L15:
        if ((r5.getParent() instanceof ListView) == false) goto L26;
        ListView r65 = (ListView) r5.getParent();
        if (r65.getAdapter().hasStableIds() == false) goto L27;
        long r12 = r65.getItemIdAtPosition(r65.getPositionForView(r5));
        if (r42.m5168c(r12) < 0) goto L24;
        View r52 = (View) r42.m5167b(r12);
        if (r52 == null) goto L28;
        r52.setHasTransientState(false);
        r42.m5170e(r12, null);
        return;
    L28:
        return;
    L24:
        r5.setHasTransientState(true);
        r42.m5170e(r12, r5);
        return;
    L27:
        return;
    L26:
        return;
    L5:
        if (r2.indexOfKey(r62) < 0) goto L7;
        r2.put(r62, null);
        goto L8
    L7:
        r2.put(r62, r5);
        goto L8
    }

    /* JADX INFO: renamed from: p */
    public static C0521M4 m756p() {
        ThreadLocal r0 = f1195z;
        C0521M4 r1 = (C0521M4) r0.get();
        if (r1 != null) goto L6;
        C0521M4 r12 = new C0521M4(0);
        r0.set(r12);
        return r12;
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m757u(C0657PB r0, C0657PB r1, String r2) {
        Object r02 = r0.f2099a.get(r2);
        Object r12 = r1.f2099a.get(r2);
        if (r02 != null) goto L8;
        if (r12 != null) goto L8;
        return false;
    L8:
        if (r02 == null) goto L13;
        if (r12 == null) goto L13;
        return !r02.equals(r12);
    L13:
        return true;
    }

    /* JADX INFO: renamed from: A */
    public void mo758A(long r1) {
        this.f1198c = r1;
    }

    /* JADX INFO: renamed from: B */
    public void mo759B(AbstractC0671Pj r1) {
    }

    /* JADX INFO: renamed from: C */
    public void mo760C(TimeInterpolator r1) {
        this.f1199d = r1;
    }

    /* JADX INFO: renamed from: D */
    public void mo761D(C1517hw r1) {
        if (r1 != null) goto L5;
        this.f1217v = f1194y;
        return;
    L5:
        this.f1217v = r1;
    }

    /* JADX INFO: renamed from: E */
    public void mo762E() {
    }

    /* JADX INFO: renamed from: F */
    public void mo763F(long r1) {
        this.f1197b = r1;
    }

    /* JADX INFO: renamed from: G */
    public final void m764G() {
        if (this.f1211p != 0) goto L5;
        m784v(this, C2438r1.f8547b);
        this.f1213r = false;
    L5:
        this.f1211p++;
    }

    /* JADX INFO: renamed from: H */
    public String mo765H(String r8) {
        StringBuilder r0 = new StringBuilder(r8);
        r0.append(getClass().getSimpleName());
        r0.append("@");
        r0.append(Integer.toHexString(hashCode()));
        r0.append(": ");
        if (this.f1198c == (-1)) goto L6;
        r0.append("dur(");
        r0.append(this.f1198c);
        r0.append(") ");
    L6:
        if (this.f1197b == (-1)) goto L9;
        r0.append("dly(");
        r0.append(this.f1197b);
        r0.append(") ");
    L9:
        if (this.f1199d == null) goto L11;
        r0.append("interp(");
        r0.append(this.f1199d);
        r0.append(") ");
    L11:
        ArrayList r82 = this.f1200e;
        int r1 = r82.size();
        ArrayList r2 = this.f1201f;
        if (r1 <= 0) goto L14;
    L15:
        r0.append("tgts(");
        int r4 = 0;
        if (r82.size() <= 0) goto L24;
        int r12 = 0;
    L19:
        if (r12 >= r82.size()) goto L24;
        if (r12 <= 0) goto L22;
        r0.append(", ");
    L22:
        r0.append(r82.get(r12));
        r12 = r12 + 1;
    L24:
        if (r2.size() > 0) goto L26;
    L30:
        r0.append(")");
    L32:
        return r0.toString();
    L26:
        if (r4 >= r2.size()) goto L30;
        if (r4 <= 0) goto L29;
        r0.append(", ");
    L29:
        r0.append(r2.get(r4));
        r4 = r4 + 1;
        goto L26
    L14:
        if (r2.size() <= 0) goto L32;
        goto L15
    }

    /* JADX INFO: renamed from: a */
    public void m766a(InterfaceC0313HB r2) {
        if (this.f1215t != null) goto L5;
        this.f1215t = new ArrayList();
    L5:
        this.f1215t.add(r2);
    }

    /* JADX INFO: renamed from: c */
    public void mo767c() {
        ArrayList r0 = this.f1209n;
        int r1 = r0.size();
        Animator[] r02 = (Animator[]) r0.toArray(this.f1210o);
        this.f1210o = f1192w;
        int r12 = r1 - 1;
    L3:
        if (r12 < 0) goto L5;
        Animator r2 = r02[r12];
        r02[r12] = null;
        r2.cancel();
        r12 = r12 - 1;
        goto L3
    L5:
        this.f1210o = r02;
        m784v(this, C2438r1.f8549d);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return mo774j();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo768d(C0657PB r1);

    /* JADX INFO: renamed from: e */
    public final void m769e(View r3, boolean r4) {
        if (r3 == null) goto L22;
        r3.getId();
        if ((r3.getParent() instanceof ViewGroup) == false) goto L15;
        C0657PB r0 = new C0657PB(r3);
        if (r4 == false) goto L9;
        mo771g(r0);
    L10:
        r0.f2101c.add(this);
        mo770f(r0);
        if (r4 == false) goto L13;
        m755b(this.f1202g, r3, r0);
        goto L15
    L13:
        m755b(this.f1203h, r3, r0);
        goto L15
    L9:
        mo768d(r0);
    L15:
        if ((r3 instanceof ViewGroup) == false) goto L20;
        ViewGroup r32 = (ViewGroup) r3;
        int r02 = 0;
    L18:
        if (r02 >= r32.getChildCount()) goto L23;
        m769e(r32.getChildAt(r02), r4);
        r02 = r02 + 1;
        goto L18
    L23:
        return;
    L20:
        return;
    }

    /* JADX INFO: renamed from: f */
    public void mo770f(C0657PB r1) {
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo771g(C0657PB r1);

    /* JADX INFO: renamed from: h */
    public final void m772h(ViewGroup r8, boolean r9) {
        m773i(r9);
        ArrayList r0 = this.f1200e;
        int r1 = r0.size();
        ArrayList r2 = this.f1201f;
        if (r1 <= 0) goto L5;
    L9:
        int r12 = 0;
        int r3 = 0;
    L11:
        if (r3 >= r0.size()) goto L24;
        View r4 = r8.findViewById(((Integer) r0.get(r3)).intValue());
        if (r4 == null) goto L22;
        C0657PB r5 = new C0657PB(r4);
        if (r9 == false) goto L17;
        mo771g(r5);
    L18:
        r5.f2101c.add(this);
        mo770f(r5);
        if (r9 == false) goto L21;
        m755b(this.f1202g, r4, r5);
        goto L22
    L21:
        m755b(this.f1203h, r4, r5);
        goto L22
    L17:
        mo768d(r5);
    L22:
        r3 = r3 + 1;
    L24:
        if (r12 >= r2.size()) goto L34;
        View r82 = (View) r2.get(r12);
        C0657PB r02 = new C0657PB(r82);
        if (r9 == false) goto L28;
        mo771g(r02);
    L29:
        r02.f2101c.add(this);
        mo770f(r02);
        if (r9 == false) goto L32;
        m755b(this.f1202g, r82, r02);
    L33:
        r12 = r12 + 1;
        goto L24
    L32:
        m755b(this.f1203h, r82, r02);
        goto L33
    L28:
        mo768d(r02);
        goto L29
    L34:
        return;
    L5:
        if (r2.size() > 0) goto L9;
        m769e(r8, r9);
    }

    /* JADX INFO: renamed from: i */
    public final void m773i(boolean r1) {
        if (r1 == false) goto L5;
        ((C0521M4) this.f1202g.f8520a).clear();
        ((SparseArray) this.f1202g.f8521b).clear();
        ((C2640vp) this.f1202g.f8522c).m5166a();
        return;
    L5:
        ((C0521M4) this.f1203h.f8520a).clear();
        ((SparseArray) this.f1203h.f8521b).clear();
        ((C2640vp) this.f1203h.f8522c).m5166a();
    }

    /* JADX INFO: renamed from: j */
    public AbstractC0356IB mo774j() {
        AbstractC0356IB r0 = (AbstractC0356IB) super.clone();     // Catch: CloneNotSupportedException -> L4
        r0.f1216u = new ArrayList();     // Catch: CloneNotSupportedException -> L4
        r0.f1202g = new C2428qs(10);     // Catch: CloneNotSupportedException -> L4
        r0.f1203h = new C2428qs(10);     // Catch: CloneNotSupportedException -> L4
        r0.f1206k = null;     // Catch: CloneNotSupportedException -> L4
        r0.f1207l = null;     // Catch: CloneNotSupportedException -> L4
        r0.f1214s = this;     // Catch: CloneNotSupportedException -> L4
        r0.f1215t = null;     // Catch: CloneNotSupportedException -> L4
        return r0;
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    /* JADX INFO: renamed from: k */
    public Animator mo775k(ViewGroup r1, C0657PB r2, C0657PB r3) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void mo776l(ViewGroup r20, C2428qs r21, C2428qs r22, ArrayList r23, ArrayList r24) {
        C0521M4 r1 = m756p();
        SparseIntArray r2 = new SparseIntArray();
        int r3 = r23.size();
        m779o().getClass();
        int r5 = 0;
    L3:
        if (r5 >= r3) goto L55;
        C0657PB r7 = (C0657PB) r23.get(r5);
        C0657PB r9 = (C0657PB) r24.get(r5);
        if (r7 != null) goto L7;
    L9:
        if (r9 != null) goto L11;
    L13:
        if (r7 != null) goto L17;
        if (r9 != null) goto L17;
    L16:
        int r16 = r3;
        int r17 = r5;
    L53:
        r5 = r17 + 1;
        r3 = r16;
    L17:
        if (r7 == null) goto L21;
        if (r9 == null) goto L21;
        if (mo782s(r7, r9) == false) goto L16;
    L21:
        Animator r12 = mo775k(r20, r7, r9);
        if (r12 == null) goto L16;
        String r13 = this.f1196a;
        if (r9 == null) goto L50;
        View r72 = r9.f2100b;
        String[] r92 = mo780q();
        if (r92 != null) goto L28;
    L48:
        r16 = r3;
        r17 = r5;
        Animator r10 = r12;
        C0657PB r14 = null;
    L49:
        r12 = r10;
        C0657PB r102 = r14;
    L51:
        if (r12 == null) goto L53;
        WindowId r4 = r20.getWindowId();
        C0270GB r32 = new C0270GB();
        r32.f870a = r72;
        r32.f871b = r13;
        r32.f872c = r102;
        r32.f873d = r4;
        r32.f874e = this;
        r32.f875f = r12;
        r1.put(r12, r32);
        this.f1216u.add(r12);
        goto L53
    L28:
        if (r92.length <= 0) goto L48;
        r14 = new C0657PB(r72);
        C0657PB r42 = (C0657PB) ((C0521M4) r22.f8520a).get(r72);
        r16 = r3;
        if (r42 == null) goto L35;
        int r103 = 0;
    L33:
        if (r103 >= r92.length) goto L35;
        String r33 = r92[r103];
        int r172 = r5;
        Object r52 = r42.f2099a.get(r33);
        C0657PB r18 = r42;
        r14.f2099a.put(r33, r52);
        r103 = r103 + 1;
        r5 = r172;
        r42 = r18;
    L35:
        r17 = r5;
        int r34 = r1.f8818c;
        int r43 = 0;
    L36:
        if (r43 >= r34) goto L47;
        C0270GB r53 = (C0270GB) r1.get((Animator) r1.m5002f(r43));
        if (r53.f872c == null) goto L46;
        if (r53.f870a != r72) goto L46;
        if (r53.f871b.equals(r13) == false) goto L46;
        if (r53.f872c.equals(r14) == false) goto L46;
        r10 = null;
    L46:
        r43 = r43 + 1;
        goto L36
    L47:
        r10 = r12;
        goto L49
    L50:
        r16 = r3;
        r17 = r5;
        r72 = r7.f2100b;
        r102 = null;
        goto L51
    L11:
        if (r9.f2101c.contains(this) == true) goto L13;
        r9 = null;
        goto L13
    L7:
        if (r7.f2101c.contains(this) == true) goto L9;
        r7 = null;
        goto L9
    L55:
        if (r2.size() == 0) goto L60;
        int r44 = 0;
    L58:
        if (r44 >= r2.size()) goto L73;
        int r35 = r2.keyAt(r44);
        C0270GB r36 = (C0270GB) r1.get((Animator) this.f1216u.get(r35));
        long r54 = ((long) r2.valueAt(r44)) - Long.MAX_VALUE;
        long r73 = r36.f875f.getStartDelay() + r54;
        r36.f875f.setStartDelay(r73);
        r44 = r44 + 1;
        goto L58
    L73:
        return;
    }

    /* JADX INFO: renamed from: m */
    public final void m777m() {
        int r0 = this.f1211p - 1;
        this.f1211p = r0;
        if (r0 != 0) goto L26;
        m784v(this, C2438r1.f8548c);
        int r2 = 0;
    L6:
        if (r2 >= ((C2640vp) this.f1202g.f8522c).m5172g()) goto L11;
        View r3 = (View) ((C2640vp) this.f1202g.f8522c).m5173h(r2);
        if (r3 == null) goto L10;
        r3.setHasTransientState(false);
    L10:
        r2 = r2 + 1;
        goto L6
    L11:
        int r22 = 0;
    L13:
        if (r22 >= ((C2640vp) this.f1203h.f8522c).m5172g()) goto L18;
        View r32 = (View) ((C2640vp) this.f1203h.f8522c).m5173h(r22);
        if (r32 == null) goto L17;
        r32.setHasTransientState(false);
    L17:
        r22 = r22 + 1;
        goto L13
    L18:
        this.f1213r = true;
        return;
    }

    /* JADX INFO: renamed from: n */
    public final C0657PB m778n(View r5, boolean r6) {
        C1308d5 r0 = this.f1204i;
        if (r0 != null) goto L5;
        if (r6 == false) goto L8;
        ArrayList r02 = this.f1206k;
    L9:
        if (r02 == null) goto L32;
        int r1 = r02.size();
        int r2 = 0;
    L12:
        if (r2 >= r1) goto L20;
        C0657PB r3 = (C0657PB) r02.get(r2);
        if (r3 == null) goto L33;
        if (r3.f2100b == r5) goto L21;
        r2 = r2 + 1;
    L21:
        if (r2 < 0) goto L27;
        if (r6 == false) goto L24;
        ArrayList r52 = this.f1207l;
    L26:
        return (C0657PB) r52.get(r2);
    L24:
        r52 = this.f1206k;
        goto L26
    L27:
        return null;
    L33:
        return null;
    L20:
        r2 = -1;
        goto L21
    L32:
        return null;
    L8:
        r02 = this.f1207l;
        goto L9
    L5:
        return r0.m778n(r5, r6);
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC0356IB m779o() {
        C1308d5 r0 = this.f1204i;
        if (r0 != null) goto L5;
        return this;
    L5:
        return r0.m779o();
    }

    /* JADX INFO: renamed from: q */
    public String[] mo780q() {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final C0657PB m781r(View r2, boolean r3) {
        C1308d5 r0 = this.f1204i;
        if (r0 != null) goto L5;
        if (r3 == false) goto L8;
        C2428qs r32 = this.f1202g;
    L10:
        return (C0657PB) ((C0521M4) r32.f8520a).get(r2);
    L8:
        r32 = this.f1203h;
        goto L10
    L5:
        return r0.m781r(r2, r3);
    }

    /* JADX INFO: renamed from: s */
    public boolean mo782s(C0657PB r6, C0657PB r7) {
        if (r6 == null) goto L20;
        if (r7 == null) goto L20;
        String[] r1 = mo780q();
        if (r1 == null) goto L13;
        int r2 = r1.length;
        int r3 = 0;
    L8:
        if (r3 >= r2) goto L20;
        if (m757u(r6, r7, r1[r3]) == true) goto L18;
        r3 = r3 + 1;
        goto L8
    L18:
        return true;
    L13:
        Iterator r12 = r6.f2099a.keySet().iterator();
    L15:
        if (r12.hasNext() == false) goto L20;
        if (m757u(r6, r7, (String) r12.next()) == false) goto L15;
        return true;
    L20:
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m783t(View r6) {
        int r0 = r6.getId();
        ArrayList r1 = this.f1200e;
        int r2 = r1.size();
        ArrayList r4 = this.f1201f;
        if (r2 != 0) goto L8;
        if (r4.size() != 0) goto L8;
        return true;
    L8:
        if (r1.contains(Integer.valueOf(r0)) == false) goto L10;
    L14:
        return true;
    L10:
        if (r4.contains(r6) == true) goto L14;
        return false;
    }

    public final String toString() {
        return mo765H("");
    }

    /* JADX INFO: renamed from: v */
    public final void m784v(AbstractC0356IB r7, C2438r1 r8) {
        AbstractC0356IB r0 = this.f1214s;
        if (r0 == null) goto L5;
        r0.m784v(r7, r8);
    L5:
        ArrayList r02 = this.f1215t;
        if (r02 != null) goto L8;
        return;
    L8:
        if (r02.isEmpty() == true) goto L31;
        int r03 = this.f1215t.size();
        InterfaceC0313HB[] r1 = this.f1208m;
        if (r1 != null) goto L12;
        r1 = new InterfaceC0313HB[r03];
    L12:
        this.f1208m = null;
        InterfaceC0313HB[] r12 = (InterfaceC0313HB[]) this.f1215t.toArray(r1);
        int r3 = 0;
    L13:
        if (r3 >= r03) goto L22;
        InterfaceC0313HB r4 = r12[r3];
        switch(r8.f8552a) {
            case 12: goto L20;
            case 13: goto L19;
            case 14: goto L18;
            case 15: goto L17;
            default: goto L16;
        };
    L16:
        r4.mo664c();
    L21:
        r12[r3] = null;
        r3 = r3 + 1;
        goto L13
    L17:
        r4.mo663b();
        goto L21
    L18:
        r4.mo667f(r7);
        goto L21
    L19:
        r4.mo665d(r7);
        goto L21
    L20:
        r4.mo666e(r7);
        goto L21
    L22:
        this.f1208m = r12;
        return;
    }

    /* JADX INFO: renamed from: w */
    public void mo785w(View r5) {
        if (this.f1213r == true) goto L10;
        ArrayList r52 = this.f1209n;
        int r0 = r52.size();
        Animator[] r53 = (Animator[]) r52.toArray(this.f1210o);
        this.f1210o = f1192w;
        int r02 = r0 - 1;
    L5:
        if (r02 < 0) goto L7;
        Animator r2 = r53[r02];
        r53[r02] = null;
        r2.pause();
        r02 = r02 - 1;
        goto L5
    L7:
        this.f1210o = r53;
        m784v(this, C2438r1.f8550e);
        this.f1212q = true;
        return;
    }

    /* JADX INFO: renamed from: x */
    public AbstractC0356IB mo786x(InterfaceC0313HB r2) {
        ArrayList r0 = this.f1215t;
        if (r0 != null) goto L6;
    L13:
        return this;
    L6:
        if (r0.remove(r2) == true) goto L11;
        AbstractC0356IB r02 = this.f1214s;
        if (r02 == null) goto L11;
        r02.mo786x(r2);
    L11:
        if (this.f1215t.size() != 0) goto L13;
        this.f1215t = null;
        goto L13
    }

    /* JADX INFO: renamed from: y */
    public void mo787y(View r4) {
        if (this.f1212q == true) goto L5;
        return;
    L5:
        if (this.f1213r == true) goto L10;
        ArrayList r42 = this.f1209n;
        int r0 = r42.size();
        Animator[] r43 = (Animator[]) r42.toArray(this.f1210o);
        this.f1210o = f1192w;
        int r02 = r0 - 1;
    L7:
        if (r02 < 0) goto L9;
        Animator r1 = r43[r02];
        r43[r02] = null;
        r1.resume();
        r02 = r02 - 1;
        goto L7
    L9:
        this.f1210o = r43;
        m784v(this, C2438r1.f8551f);
    L10:
        this.f1212q = false;
    }

    /* JADX INFO: renamed from: z */
    public void mo788z() {
        m764G();
        C0521M4 r0 = m756p();
        Iterator r1 = this.f1216u.iterator();
    L4:
        if (r1.hasNext() == false) goto L19;
        Animator r2 = (Animator) r1.next();
        if (r0.containsKey(r2) == false) goto L4;
        m764G();
        if (r2 == null) goto L4;
        r2.addListener(new C0227FB(this, r0));
        long r3 = this.f1198c;
        if (r3 < 0) goto L12;
        r2.setDuration(r3);
    L12:
        long r32 = this.f1197b;
        if (r32 < 0) goto L15;
        r2.setStartDelay(r2.getStartDelay() + r32);
    L15:
        TimeInterpolator r33 = this.f1199d;
        if (r33 == null) goto L18;
        r2.setInterpolator(r33);
    L18:
        r2.addListener(new C2437r0(5, this));
        r2.start();
        goto L4
    L19:
        this.f1216u.clear();
        m777m();
    }
}
