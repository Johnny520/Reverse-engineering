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
    public static final Animator[] f1005w = null;

    /* JADX INFO: renamed from: x */
    public static final int[] f1006x = null;

    /* JADX INFO: renamed from: y */
    public static final C1121e f1007y = null;

    /* JADX INFO: renamed from: z */
    public static final ThreadLocal f1008z = null;

    /* JADX INFO: renamed from: a */
    public final String f1009a;

    /* JADX INFO: renamed from: b */
    public long f1010b;

    /* JADX INFO: renamed from: c */
    public long f1011c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f1012d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f1013e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f1014f;

    /* JADX INFO: renamed from: g */
    public C0463v f1015g;

    /* JADX INFO: renamed from: h */
    public C0463v f1016h;

    /* JADX INFO: renamed from: i */
    public C0442a f1017i;

    /* JADX INFO: renamed from: j */
    public final int[] f1018j;

    /* JADX INFO: renamed from: k */
    public ArrayList f1019k;

    /* JADX INFO: renamed from: l */
    public ArrayList f1020l;

    /* JADX INFO: renamed from: m */
    public InterfaceC0452k[] f1021m;

    /* JADX INFO: renamed from: n */
    public final ArrayList f1022n;

    /* JADX INFO: renamed from: o */
    public Animator[] f1023o;

    /* JADX INFO: renamed from: p */
    public int f1024p;

    /* JADX INFO: renamed from: q */
    public boolean f1025q;

    /* JADX INFO: renamed from: r */
    public boolean f1026r;

    /* JADX INFO: renamed from: s */
    public AbstractC0454m f1027s;

    /* JADX INFO: renamed from: t */
    public ArrayList f1028t;

    /* JADX INFO: renamed from: u */
    public ArrayList f1029u;

    /* JADX INFO: renamed from: v */
    public C1121e f1030v;

    static {
        f1005w = new Animator[0];
        f1006x = new int[]{2, 1, 3, 4};
        f1007y = new C1121e(19);
        f1008z = new ThreadLocal();
    }

    public AbstractC0454m() {
        this.f1009a = getClass().getName();
        this.f1010b = -1;
        this.f1011c = -1;
        this.f1012d = null;
        this.f1013e = new ArrayList();
        this.f1014f = new ArrayList();
        this.f1015g = new C0463v(0);
        this.f1016h = new C0463v(0);
        this.f1017i = null;
        this.f1018j = f1006x;
        this.f1022n = new ArrayList();
        this.f1023o = f1005w;
        this.f1024p = 0;
        this.f1025q = false;
        this.f1026r = false;
        this.f1027s = null;
        this.f1028t = null;
        this.f1029u = new ArrayList();
        this.f1030v = f1007y;
    }

    /* JADX INFO: renamed from: b */
    public static void m1075b(C0463v r4, View r5, C0462u r6) {
        ((C0957b) r4.f1044a).put(r5, r6);
        int r62 = r5.getId();
        if (r62 < 0) goto L8;
        SparseArray r1 = (SparseArray) r4.f1046c;
        if (r1.indexOfKey(r62) < 0) goto L7;
        r1.put(r62, null);
        goto L8
    L7:
        r1.put(r62, r5);
    L8:
        Field r63 = AbstractC0080Q.f219a;
        String r64 = AbstractC0070G.m221k(r5);
        if (r64 == null) goto L15;
        C0957b r12 = (C0957b) r4.f1045b;
        if (r12.containsKey(r64) == false) goto L13;
        r12.put(r64, null);
        goto L15
    L13:
        r12.put(r64, r5);
    L15:
        if ((r5.getParent() instanceof ListView) == false) goto L28;
        ListView r65 = (ListView) r5.getParent();
        if (r65.getAdapter().hasStableIds() == false) goto L29;
        long r13 = r65.getItemIdAtPosition(r65.getPositionForView(r5));
        C0960e r42 = (C0960e) r4.f1047d;
        if (r42.f3405a == false) goto L22;
        r42.m2308c();
    L22:
        if (AbstractC0959d.m2305b(r42.f3406b, r42.f3408d, r13) < 0) goto L26;
        View r52 = (View) r42.m2309d(r13, null);
        if (r52 == null) goto L30;
        r52.setHasTransientState(false);
        r42.m2310e(r13, null);
        return;
    L30:
        return;
    L26:
        r5.setHasTransientState(true);
        r42.m2310e(r13, r5);
        return;
    L29:
        return;
    }

    /* JADX INFO: renamed from: p */
    public static C0957b m1076p() {
        ThreadLocal r02 = f1008z;
        C0957b r1 = (C0957b) r02.get();
        if (r1 != null) goto L6;
        C0957b r12 = new C0957b();
        r02.set(r12);
        return r12;
    L6:
        return r1;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m1077u(C0462u r02, C0462u r1, String r2) {
        Object r03 = r02.f1041a.get(r2);
        Object r12 = r1.f1041a.get(r2);
        if (r03 != null) goto L7;
        if (r12 != null) goto L7;
        return false;
    L7:
        if (r03 == null) goto L12;
        if (r12 == null) goto L12;
        return !r03.equals(r12);
    L12:
        return true;
    }

    /* JADX INFO: renamed from: A */
    public void mo1047A(long r1) {
        this.f1011c = r1;
    }

    /* JADX INFO: renamed from: B */
    public void mo1048B(AbstractC0358S r1) {
    }

    /* JADX INFO: renamed from: C */
    public void mo1049C(TimeInterpolator r1) {
        this.f1012d = r1;
    }

    /* JADX INFO: renamed from: D */
    public void mo1050D(C1121e r1) {
        if (r1 != null) goto L4;
        this.f1030v = f1007y;
        return;
    L4:
        this.f1030v = r1;
    }

    /* JADX INFO: renamed from: E */
    public void mo1051E() {
    }

    /* JADX INFO: renamed from: F */
    public void mo1052F(long r1) {
        this.f1010b = r1;
    }

    /* JADX INFO: renamed from: G */
    public final void m1078G() {
        if (this.f1024p != 0) goto L5;
        m1088v(this, InterfaceC0453l.f1000a);
        this.f1026r = false;
    L5:
        this.f1024p++;
    }

    /* JADX INFO: renamed from: H */
    public String mo1053H(String r8) {
        StringBuilder r02 = new StringBuilder(r8);
        r02.append(getClass().getSimpleName());
        r02.append("@");
        r02.append(Integer.toHexString(hashCode()));
        r02.append(": ");
        if (this.f1011c == (-1)) goto L6;
        r02.append("dur(");
        r02.append(this.f1011c);
        r02.append(") ");
    L6:
        if (this.f1010b == (-1)) goto L9;
        r02.append("dly(");
        r02.append(this.f1010b);
        r02.append(") ");
    L9:
        if (this.f1012d == null) goto L11;
        r02.append("interp(");
        r02.append(this.f1012d);
        r02.append(") ");
    L11:
        ArrayList r82 = this.f1013e;
        int r1 = r82.size();
        ArrayList r2 = this.f1014f;
        if (r1 <= 0) goto L14;
    L15:
        r02.append("tgts(");
        int r4 = 0;
        if (r82.size() <= 0) goto L24;
        int r12 = 0;
    L19:
        if (r12 >= r82.size()) goto L24;
        if (r12 <= 0) goto L22;
        r02.append(", ");
    L22:
        r02.append(r82.get(r12));
        r12 = r12 + 1;
    L24:
        if (r2.size() > 0) goto L26;
    L30:
        r02.append(")");
    L32:
        return r02.toString();
    L26:
        if (r4 >= r2.size()) goto L30;
        if (r4 <= 0) goto L29;
        r02.append(", ");
    L29:
        r02.append(r2.get(r4));
        r4 = r4 + 1;
        goto L26
    L14:
        if (r2.size() <= 0) goto L32;
        goto L15
    }

    /* JADX INFO: renamed from: a */
    public void m1079a(InterfaceC0452k r2) {
        if (this.f1028t != null) goto L5;
        this.f1028t = new ArrayList();
    L5:
        this.f1028t.add(r2);
    }

    /* JADX INFO: renamed from: c */
    public void mo1055c() {
        ArrayList r02 = this.f1022n;
        int r1 = r02.size();
        Animator[] r03 = (Animator[]) r02.toArray(this.f1023o);
        this.f1023o = f1005w;
        int r12 = r1 - 1;
    L3:
        if (r12 < 0) goto L5;
        Animator r2 = r03[r12];
        r03[r12] = null;
        r2.cancel();
        r12 = r12 - 1;
        goto L3
    L5:
        this.f1023o = r03;
        m1088v(this, InterfaceC0453l.f1002c);
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return mo1059j();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo1056d(C0462u r1);

    /* JADX INFO: renamed from: e */
    public final void m1080e(View r3, boolean r4) {
        if (r3 != null) goto L4;
        return;
    L4:
        r3.getId();
        if ((r3.getParent() instanceof ViewGroup) == false) goto L15;
        C0462u r02 = new C0462u(r3);
        if (r4 == false) goto L9;
        mo1058g(r02);
    L10:
        r02.f1043c.add(this);
        mo1057f(r02);
        if (r4 == false) goto L13;
        m1075b(this.f1015g, r3, r02);
        goto L15
    L13:
        m1075b(this.f1016h, r3, r02);
        goto L15
    L9:
        mo1056d(r02);
    L15:
        if ((r3 instanceof ViewGroup) == false) goto L20;
        ViewGroup r32 = (ViewGroup) r3;
        int r03 = 0;
    L18:
        if (r03 >= r32.getChildCount()) goto L22;
        m1080e(r32.getChildAt(r03), r4);
        r03 = r03 + 1;
        goto L18
    L22:
        return;
    }

    /* JADX INFO: renamed from: f */
    public void mo1057f(C0462u r1) {
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo1058g(C0462u r1);

    /* JADX INFO: renamed from: h */
    public final void m1081h(ViewGroup r8, boolean r9) {
        m1082i(r9);
        ArrayList r02 = this.f1013e;
        int r1 = r02.size();
        ArrayList r2 = this.f1014f;
        if (r1 <= 0) goto L5;
    L8:
        int r12 = 0;
        int r3 = 0;
    L10:
        if (r3 >= r02.size()) goto L23;
        View r4 = r8.findViewById(((Integer) r02.get(r3)).intValue());
        if (r4 == null) goto L21;
        C0462u r5 = new C0462u(r4);
        if (r9 == false) goto L16;
        mo1058g(r5);
    L17:
        r5.f1043c.add(this);
        mo1057f(r5);
        if (r9 == false) goto L20;
        m1075b(this.f1015g, r4, r5);
        goto L21
    L20:
        m1075b(this.f1016h, r4, r5);
        goto L21
    L16:
        mo1056d(r5);
    L21:
        r3 = r3 + 1;
    L23:
        if (r12 >= r2.size()) goto L41;
        View r82 = (View) r2.get(r12);
        C0462u r03 = new C0462u(r82);
        if (r9 == false) goto L27;
        mo1058g(r03);
    L28:
        r03.f1043c.add(this);
        mo1057f(r03);
        if (r9 == false) goto L31;
        m1075b(this.f1015g, r82, r03);
    L32:
        r12 = r12 + 1;
        goto L23
    L31:
        m1075b(this.f1016h, r82, r03);
        goto L32
    L27:
        mo1056d(r03);
        goto L28
    L41:
        return;
    L5:
        if (r2.size() > 0) goto L8;
        m1080e(r8, r9);
    }

    /* JADX INFO: renamed from: i */
    public final void m1082i(boolean r1) {
        if (r1 == false) goto L4;
        ((C0957b) this.f1015g.f1044a).clear();
        ((SparseArray) this.f1015g.f1046c).clear();
        ((C0960e) this.f1015g.f1047d).m2306a();
        return;
    L4:
        ((C0957b) this.f1016h.f1044a).clear();
        ((SparseArray) this.f1016h.f1046c).clear();
        ((C0960e) this.f1016h.f1047d).m2306a();
    }

    /* JADX INFO: renamed from: j */
    public AbstractC0454m mo1059j() {
        AbstractC0454m r02 = (AbstractC0454m) super.clone();     // Catch: CloneNotSupportedException -> L4
        r02.f1029u = new ArrayList();     // Catch: CloneNotSupportedException -> L4
        r02.f1015g = new C0463v(0);     // Catch: CloneNotSupportedException -> L4
        r02.f1016h = new C0463v(0);     // Catch: CloneNotSupportedException -> L4
        r02.f1019k = null;     // Catch: CloneNotSupportedException -> L4
        r02.f1020l = null;     // Catch: CloneNotSupportedException -> L4
        r02.f1027s = this;     // Catch: CloneNotSupportedException -> L4
        r02.f1028t = null;     // Catch: CloneNotSupportedException -> L4
        return r02;
    L4:
        e = move-exception;
        throw new RuntimeException(e);
    }

    /* JADX INFO: renamed from: k */
    public Animator mo1066k(ViewGroup r1, C0462u r2, C0462u r3) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public void mo1060l(ViewGroup r19, C0463v r20, C0463v r21, ArrayList r22, ArrayList r23) {
        C0957b r1 = m1076p();
        SparseIntArray r2 = new SparseIntArray();
        int r3 = r22.size();
        m1085o().getClass();
        int r5 = 0;
    L4:
        if (r5 >= r3) goto L56;
        C0462u r8 = (C0462u) r22.get(r5);
        C0462u r10 = (C0462u) r23.get(r5);
        if (r8 != null) goto L8;
    L10:
        if (r10 != null) goto L12;
    L14:
        if (r8 != null) goto L18;
        if (r10 != null) goto L18;
    L17:
        int r16 = r3;
    L54:
        r5 = r5 + 1;
        r3 = r16;
    L18:
        if (r8 == null) goto L22;
        if (r10 == null) goto L22;
        if (mo1073s(r8, r10) == false) goto L17;
    L22:
        Animator r12 = mo1066k(r19, r8, r10);
        if (r12 == null) goto L17;
        String r13 = this.f1009a;
        if (r10 == null) goto L51;
        String[] r82 = mo1067q();
        View r102 = r10.f1042b;
        if (r82 != null) goto L29;
    L49:
        r16 = r3;
        Animator r6 = r12;
        C0462u r14 = null;
    L50:
        r12 = r6;
        C0462u r62 = r14;
    L52:
        if (r12 == null) goto L54;
        WindowId r4 = r19.getWindowId();
        C0451j r32 = new C0451j();
        r32.f994a = r102;
        r32.f995b = r13;
        r32.f996c = r62;
        r32.f997d = r4;
        r32.f998e = this;
        r32.f999f = r12;
        r1.put(r12, r32);
        this.f1029u.add(r12);
        goto L54
    L29:
        if (r82.length <= 0) goto L49;
        r14 = new C0462u(r102);
        C0462u r42 = (C0462u) ((C0957b) r21.f1044a).getOrDefault(r102, null);
        r16 = r3;
        if (r42 == null) goto L36;
        int r63 = 0;
    L34:
        if (r63 >= r82.length) goto L36;
        HashMap r33 = r14.f1041a;
        String r7 = r82[r63];
        r33.put(r7, r42.f1041a.get(r7));
        r63 = r63 + 1;
        r82 = r82;
    L36:
        int r34 = r1.f3432c;
        int r43 = 0;
    L37:
        if (r43 >= r34) goto L48;
        C0451j r64 = (C0451j) r1.getOrDefault((Animator) r1.m2322h(r43), null);
        if (r64.f996c == null) goto L47;
        if (r64.f994a != r102) goto L47;
        if (r64.f995b.equals(r13) == false) goto L47;
        if (r64.f996c.equals(r14) == false) goto L47;
        r6 = null;
    L47:
        r43 = r43 + 1;
        goto L37
    L48:
        r6 = r12;
        goto L50
    L51:
        r16 = r3;
        r102 = r8.f1042b;
        r62 = null;
        goto L52
    L12:
        if (r10.f1043c.contains(this) == true) goto L14;
        r10 = null;
        goto L14
    L8:
        if (r8.f1043c.contains(this) == true) goto L10;
        r8 = null;
        goto L10
    L56:
        if (r2.size() == 0) goto L61;
        int r44 = 0;
    L59:
        if (r44 >= r2.size()) goto L74;
        C0451j r35 = (C0451j) r1.getOrDefault((Animator) this.f1029u.get(r2.keyAt(r44)), null);
        r35.f999f.setStartDelay(r35.f999f.getStartDelay() + (((long) r2.valueAt(r44)) - Long.MAX_VALUE));
        r44 = r44 + 1;
        goto L59
    L74:
        return;
    }

    /* JADX INFO: renamed from: m */
    public final void m1083m() {
        int r02 = this.f1024p - 1;
        this.f1024p = r02;
        if (r02 != 0) goto L26;
        m1088v(this, InterfaceC0453l.f1001b);
        int r2 = 0;
    L6:
        if (r2 >= ((C0960e) this.f1015g.f1047d).m2311f()) goto L11;
        View r3 = (View) ((C0960e) this.f1015g.f1047d).m2312g(r2);
        if (r3 == null) goto L10;
        r3.setHasTransientState(false);
    L10:
        r2 = r2 + 1;
        goto L6
    L11:
        int r22 = 0;
    L13:
        if (r22 >= ((C0960e) this.f1016h.f1047d).m2311f()) goto L18;
        View r32 = (View) ((C0960e) this.f1016h.f1047d).m2312g(r22);
        if (r32 == null) goto L17;
        r32.setHasTransientState(false);
    L17:
        r22 = r22 + 1;
        goto L13
    L18:
        this.f1026r = true;
        return;
    }

    /* JADX INFO: renamed from: n */
    public final C0462u m1084n(View r6, boolean r7) {
        C0442a r02 = this.f1017i;
        if (r02 != null) goto L5;
        if (r7 == false) goto L8;
        ArrayList r03 = this.f1019k;
    L10:
        if (r03 != null) goto L12;
        return null;
    L12:
        int r2 = r03.size();
        int r3 = 0;
    L13:
        if (r3 >= r2) goto L21;
        C0462u r4 = (C0462u) r03.get(r3);
        if (r4 == null) goto L16;
        if (r4.f1042b == r6) goto L22;
        r3 = r3 + 1;
    L22:
        if (r3 < 0) goto L31;
        if (r7 == false) goto L25;
        ArrayList r62 = this.f1020l;
    L27:
        return (C0462u) r62.get(r3);
    L25:
        r62 = this.f1019k;
        goto L27
    L31:
        return null;
    L16:
        return null;
    L21:
        r3 = -1;
        goto L22
    L8:
        r03 = this.f1020l;
        goto L10
    L5:
        return r02.m1084n(r6, r7);
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC0454m m1085o() {
        C0442a r02 = this.f1017i;
        if (r02 != null) goto L5;
        return this;
    L5:
        return r02.m1085o();
    }

    /* JADX INFO: renamed from: q */
    public String[] mo1067q() {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final C0462u m1086r(View r2, boolean r3) {
        C0442a r02 = this.f1017i;
        if (r02 != null) goto L5;
        if (r3 == false) goto L8;
        C0463v r32 = this.f1015g;
    L10:
        return (C0462u) ((C0957b) r32.f1044a).getOrDefault(r2, null);
    L8:
        r32 = this.f1016h;
        goto L10
    L5:
        return r02.m1086r(r2, r3);
    }

    /* JADX INFO: renamed from: s */
    public boolean mo1073s(C0462u r7, C0462u r8) {
        if (r7 == null) goto L25;
        if (r8 == null) goto L26;
        String[] r1 = mo1067q();
        if (r1 == null) goto L13;
        int r3 = r1.length;
        int r4 = 0;
    L8:
        if (r4 >= r3) goto L27;
        if (m1077u(r7, r8, r1[r4]) == true) goto L19;
        r4 = r4 + 1;
    L19:
        return true;
    L27:
        return false;
    L13:
        Iterator r12 = r7.f1041a.keySet().iterator();
    L15:
        if (r12.hasNext() == false) goto L28;
        if (m1077u(r7, r8, (String) r12.next()) == false) goto L15;
    L28:
        return false;
    L26:
        return false;
    L25:
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1087t(View r6) {
        int r02 = r6.getId();
        ArrayList r1 = this.f1013e;
        int r2 = r1.size();
        ArrayList r4 = this.f1014f;
        if (r2 != 0) goto L8;
        if (r4.size() != 0) goto L8;
        return true;
    L8:
        if (r1.contains(Integer.valueOf(r02)) == false) goto L10;
    L14:
        return true;
    L10:
        if (r4.contains(r6) == true) goto L14;
        return false;
    }

    public final String toString() {
        return mo1053H("");
    }

    /* JADX INFO: renamed from: v */
    public final void m1088v(AbstractC0454m r6, InterfaceC0453l r7) {
        AbstractC0454m r02 = this.f1027s;
        if (r02 == null) goto L5;
        r02.m1088v(r6, r7);
    L5:
        ArrayList r03 = this.f1028t;
        if (r03 != null) goto L8;
        return;
    L8:
        if (r03.isEmpty() == true) goto L19;
        int r04 = this.f1028t.size();
        InterfaceC0452k[] r1 = this.f1021m;
        if (r1 != null) goto L12;
        r1 = new InterfaceC0452k[r04];
    L12:
        this.f1021m = null;
        InterfaceC0452k[] r12 = (InterfaceC0452k[]) this.f1028t.toArray(r1);
        int r3 = 0;
    L13:
        if (r3 >= r04) goto L15;
        r7.mo54a(r12[r3], r6);
        r12[r3] = null;
        r3 = r3 + 1;
        goto L13
    L15:
        this.f1021m = r12;
        return;
    }

    /* JADX INFO: renamed from: w */
    public void mo1061w(View r5) {
        if (this.f1026r == true) goto L10;
        ArrayList r52 = this.f1022n;
        int r02 = r52.size();
        Animator[] r53 = (Animator[]) r52.toArray(this.f1023o);
        this.f1023o = f1005w;
        int r03 = r02 - 1;
    L5:
        if (r03 < 0) goto L7;
        Animator r2 = r53[r03];
        r53[r03] = null;
        r2.pause();
        r03 = r03 - 1;
        goto L5
    L7:
        this.f1023o = r53;
        m1088v(this, InterfaceC0453l.f1003d);
        this.f1025q = true;
        return;
    }

    /* JADX INFO: renamed from: x */
    public AbstractC0454m mo1062x(InterfaceC0452k r2) {
        ArrayList r02 = this.f1028t;
        if (r02 != null) goto L6;
        return this;
    L6:
        if (r02.remove(r2) == true) goto L11;
        AbstractC0454m r03 = this.f1027s;
        if (r03 == null) goto L11;
        r03.mo1062x(r2);
    L11:
        if (this.f1028t.size() != 0) goto L13;
        this.f1028t = null;
    L13:
        return this;
    }

    /* JADX INFO: renamed from: y */
    public void mo1063y(View r4) {
        if (this.f1025q == true) goto L5;
        return;
    L5:
        if (this.f1026r == true) goto L10;
        ArrayList r42 = this.f1022n;
        int r02 = r42.size();
        Animator[] r43 = (Animator[]) r42.toArray(this.f1023o);
        this.f1023o = f1005w;
        int r03 = r02 - 1;
    L7:
        if (r03 < 0) goto L9;
        Animator r1 = r43[r03];
        r43[r03] = null;
        r1.resume();
        r03 = r03 - 1;
        goto L7
    L9:
        this.f1023o = r43;
        m1088v(this, InterfaceC0453l.f1004e);
    L10:
        this.f1025q = false;
    }

    /* JADX INFO: renamed from: z */
    public void mo1064z() {
        m1078G();
        C0957b r02 = m1076p();
        Iterator r1 = this.f1029u.iterator();
    L4:
        if (r1.hasNext() == false) goto L19;
        Animator r2 = (Animator) r1.next();
        if (r02.containsKey(r2) == false) goto L4;
        m1078G();
        if (r2 == null) goto L4;
        r2.addListener(new C0086X(this, r02));
        long r3 = this.f1011c;
        if (r3 < 0) goto L12;
        r2.setDuration(r3);
    L12:
        long r32 = this.f1010b;
        if (r32 < 0) goto L15;
        r2.setStartDelay(r2.getStartDelay() + r32);
    L15:
        TimeInterpolator r33 = this.f1012d;
        if (r33 == null) goto L18;
        r2.setInterpolator(r33);
    L18:
        r2.addListener(new C0038n(1, this));
        r2.start();
        goto L4
    L19:
        this.f1029u.clear();
        m1083m();
    }
}
