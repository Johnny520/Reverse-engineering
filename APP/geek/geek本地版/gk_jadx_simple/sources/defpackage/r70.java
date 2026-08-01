package defpackage;

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
    public static final int[] t = null;
    public static final iy u = null;
    public static final ThreadLocal v = null;
    public final String a;
    public long b;
    public long c;
    public TimeInterpolator d;
    public final ArrayList e;
    public final ArrayList f;
    public a8 g;
    public a8 h;
    public z6 i;
    public final int[] j;
    public ArrayList k;
    public ArrayList l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public ArrayList q;
    public ArrayList r;
    public iy s;

    static {
        t = new int[]{2, 1, 3, 4};
        u = new iy(8);
        v = new ThreadLocal();
    }

    public r70() {
        this.a = getClass().getName();
        this.b = -1;
        this.c = -1;
        this.d = null;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new a8(4);
        this.h = new a8(4);
        this.i = null;
        this.j = t;
        this.m = new ArrayList();
        this.n = 0;
        this.o = false;
        this.p = false;
        this.q = null;
        this.r = new ArrayList();
        this.s = u;
    }

    public static void b(a8 r4, View r5, x70 r6) {
        n6 r0 = (n6) r4.a;
        n6 r1 = (n6) r4.d;
        SparseArray r2 = (SparseArray) r4.b;
        bs r42 = (bs) r4.c;
        r0.put(r5, r6);
        int r62 = r5.getId();
        if (r62 >= 0) goto L5;
    L8:
        WeakHashMap r63 = ja0.a;
        String r64 = y90.k(r5);
        if (r64 == null) goto L15;
        if (r1.containsKey(r64) == false) goto L13;
        r1.put(r64, null);
        goto L15
    L13:
        r1.put(r64, r5);
    L15:
        if ((r5.getParent() instanceof ListView) == false) goto L29;
        ListView r65 = (ListView) r5.getParent();
        if (r65.getAdapter().hasStableIds() == false) goto L30;
        long r12 = r65.getItemIdAtPosition(r65.getPositionForView(r5));
        if (r42.a == false) goto L22;
        r42.b();
    L22:
        if (ff.d(r42.b, r42.d, r12) < 0) goto L27;
        View r52 = (View) r42.c(r12, null);
        if (r52 == null) goto L31;
        s90.r(r52, false);
        r42.d(r12, null);
        return;
    L31:
        return;
    L27:
        s90.r(r5, true);
        r42.d(r12, r5);
        return;
    L30:
        return;
    L29:
        return;
    L5:
        if (r2.indexOfKey(r62) < 0) goto L7;
        r2.put(r62, null);
        goto L8
    L7:
        r2.put(r62, r5);
        goto L8
    }

    public static n6 n() {
        ThreadLocal r0 = v;
        n6 r1 = (n6) r0.get();
        if (r1 != null) goto L6;
        n6 r12 = new n6();
        r0.set(r12);
        return r12;
    L6:
        return r1;
    }

    public static boolean s(x70 r0, x70 r1, String r2) {
        Object r02 = r0.a.get(r2);
        Object r12 = r1.a.get(r2);
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

    public void A(iy r1) {
        if (r1 != null) goto L5;
        this.s = u;
        return;
    L5:
        this.s = r1;
    }

    public void C(long r1) {
        this.b = r1;
    }

    public final void D() {
        if (this.n != 0) goto L12;
        ArrayList r0 = this.q;
        if (r0 != null) goto L7;
    L11:
        this.p = false;
        goto L12
    L7:
        if (r0.size() <= 0) goto L11;
        ArrayList r02 = (ArrayList) this.q.clone();
        int r2 = r02.size();
        int r3 = 0;
    L9:
        if (r3 >= r2) goto L11;
        ((q70) r02.get(r3)).b();
        r3 = r3 + 1;
    L12:
        this.n++;
    }

    public String E(String r7) {
        String r72 = r7 + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.c == (-1)) goto L6;
        r72 = r72 + "dur(" + this.c + ") ";
    L6:
        if (this.b == (-1)) goto L9;
        r72 = r72 + "dly(" + this.b + ") ";
    L9:
        if (this.d == null) goto L11;
        r72 = r72 + "interp(" + this.d + ") ";
    L11:
        ArrayList r0 = this.e;
        int r1 = r0.size();
        ArrayList r2 = this.f;
        if (r1 <= 0) goto L14;
    L17:
        String r73 = z30.i(r72, "tgts(");
        int r4 = 0;
        if (r0.size() <= 0) goto L26;
        int r12 = 0;
    L21:
        if (r12 >= r0.size()) goto L26;
        if (r12 <= 0) goto L24;
        r73 = z30.i(r73, ", ");
    L24:
        r73 = r73 + r0.get(r12);
        r12 = r12 + 1;
    L26:
        if (r2.size() <= 0) goto L33;
    L28:
        if (r4 >= r2.size()) goto L33;
        if (r4 <= 0) goto L31;
        r73 = z30.i(r73, ", ");
    L31:
        r73 = r73 + r2.get(r4);
        r4 = r4 + 1;
    L33:
        return z30.i(r73, ")");
    L14:
        if (r2.size() > 0) goto L17;
        return r72;
    }

    public void a(q70 r2) {
        if (this.q != null) goto L5;
        this.q = new ArrayList();
    L5:
        this.q.add(r2);
    }

    public abstract void c(x70 r1);

    public /* bridge */ /* synthetic */ Object clone() {
        return i();
    }

    public final void d(View r3, boolean r4) {
        if (r3 == null) goto L22;
        r3.getId();
        if ((r3.getParent() instanceof ViewGroup) == false) goto L15;
        x70 r0 = new x70(r3);
        if (r4 == false) goto L9;
        f(r0);
    L10:
        r0.c.add(this);
        e(r0);
        if (r4 == false) goto L13;
        b(this.g, r3, r0);
        goto L15
    L13:
        b(this.h, r3, r0);
        goto L15
    L9:
        c(r0);
    L15:
        if ((r3 instanceof ViewGroup) == false) goto L20;
        ViewGroup r32 = (ViewGroup) r3;
        int r02 = 0;
    L18:
        if (r02 >= r32.getChildCount()) goto L23;
        d(r32.getChildAt(r02), r4);
        r02 = r02 + 1;
        goto L18
    L23:
        return;
    L20:
        return;
    }

    public abstract void f(x70 r1);

    public final void g(ViewGroup r8, boolean r9) {
        h(r9);
        ArrayList r0 = this.e;
        int r1 = r0.size();
        ArrayList r2 = this.f;
        if (r1 <= 0) goto L5;
    L9:
        int r12 = 0;
        int r3 = 0;
    L11:
        if (r3 >= r0.size()) goto L24;
        View r4 = r8.findViewById(((Integer) r0.get(r3)).intValue());
        if (r4 == null) goto L22;
        x70 r5 = new x70(r4);
        if (r9 == false) goto L17;
        f(r5);
    L18:
        r5.c.add(this);
        e(r5);
        if (r9 == false) goto L21;
        b(this.g, r4, r5);
        goto L22
    L21:
        b(this.h, r4, r5);
        goto L22
    L17:
        c(r5);
    L22:
        r3 = r3 + 1;
    L24:
        if (r12 >= r2.size()) goto L34;
        View r82 = (View) r2.get(r12);
        x70 r02 = new x70(r82);
        if (r9 == false) goto L28;
        f(r02);
    L29:
        r02.c.add(this);
        e(r02);
        if (r9 == false) goto L32;
        b(this.g, r82, r02);
    L33:
        r12 = r12 + 1;
        goto L24
    L32:
        b(this.h, r82, r02);
        goto L33
    L28:
        c(r02);
        goto L29
    L34:
        return;
    L5:
        if (r2.size() > 0) goto L9;
        d(r8, r9);
    }

    public final void h(boolean r1) {
        if (r1 == false) goto L5;
        ((n6) this.g.a).clear();
        ((SparseArray) this.g.b).clear();
        ((bs) this.g.c).a();
        return;
    L5:
        ((n6) this.h.a).clear();
        ((SparseArray) this.h.b).clear();
        ((bs) this.h.c).a();
    }

    public r70 i() {
        r70 r1 = (r70) super.clone();     // Catch: CloneNotSupportedException -> L5
        r1.r = new ArrayList();     // Catch: CloneNotSupportedException -> L5
        r1.g = new a8(4);     // Catch: CloneNotSupportedException -> L5
        r1.h = new a8(4);     // Catch: CloneNotSupportedException -> L5
        r1.k = null;     // Catch: CloneNotSupportedException -> L5
        r1.l = null;     // Catch: CloneNotSupportedException -> L5
        return r1;
    L5:
        return null;
    }

    public Animator j(ViewGroup r1, x70 r2, x70 r3) {
        return null;
    }

    public void k(ViewGroup r20, a8 r21, a8 r22, ArrayList r23, ArrayList r24) {
        n6 r2 = n();
        SparseIntArray r3 = new SparseIntArray();
        int r4 = r23.size();
        int r6 = 0;
    L3:
        if (r6 >= r4) goto L54;
        x70 r8 = (x70) r23.get(r6);
        x70 r10 = (x70) r24.get(r6);
        x70 r11 = null;
        if (r8 != null) goto L7;
    L9:
        if (r10 != null) goto L11;
    L13:
        if (r8 != null) goto L16;
        if (r10 != null) goto L16;
    L15:
        int r16 = r4;
        int r17 = r6;
    L52:
        r6 = r17 + 1;
        r4 = r16;
    L16:
        if (r8 == null) goto L20;
        if (r10 == null) goto L20;
        if (q(r8, r10) == false) goto L15;
    L20:
        Animator r12 = j(r20, r8, r10);
        if (r12 == null) goto L15;
        String r13 = this.a;
        if (r10 == null) goto L49;
        View r82 = r10.b;
        String[] r102 = o();
        if (r102 != null) goto L27;
    L47:
        r16 = r4;
        r17 = r6;
        x70 r14 = null;
    L46:
        Animator r112 = r12;
    L48:
        r12 = r112;
        r11 = r14;
    L50:
        if (r12 == null) goto L52;
        db0 r5 = bb0.a;
        zb0 r52 = new zb0(r20);
        p70 r42 = new p70();
        r42.a = r82;
        r42.b = r13;
        r42.c = r11;
        r42.d = r52;
        r42.e = this;
        r2.put(r12, r42);
        this.r.add(r12);
        goto L52
    L27:
        if (r102.length <= 0) goto L47;
        r14 = new x70(r82);
        x70 r53 = (x70) ((n6) r22.a).getOrDefault(r82, null);
        r16 = r4;
        if (r53 == null) goto L34;
        int r113 = 0;
    L32:
        if (r113 >= r102.length) goto L34;
        String r43 = r102[r113];
        int r172 = r6;
        r14.a.put(r43, r53.a.get(r43));
        r113 = r113 + 1;
        r6 = r172;
        r53 = r53;
    L34:
        r17 = r6;
        int r44 = r2.c;
        int r54 = 0;
    L35:
        if (r54 >= r44) goto L46;
        p70 r62 = (p70) r2.getOrDefault((Animator) r2.h(r54), null);
        if (r62.c == null) goto L45;
        if (r62.a != r82) goto L45;
        if (r62.b.equals(r13) == false) goto L45;
        if (r62.c.equals(r14) == false) goto L45;
        r112 = null;
    L45:
        r54 = r54 + 1;
        goto L35
    L49:
        r16 = r4;
        r17 = r6;
        r82 = r8.b;
        goto L50
    L11:
        if (r10.c.contains(this) == true) goto L13;
        r10 = null;
        goto L13
    L7:
        if (r8.c.contains(this) == true) goto L9;
        r8 = null;
        goto L9
    L54:
        if (r3.size() == 0) goto L59;
        int r55 = 0;
    L57:
        if (r55 >= r3.size()) goto L72;
        Animator r1 = (Animator) this.r.get(r3.keyAt(r55));
        r1.setStartDelay(r1.getStartDelay() + (((long) r3.valueAt(r55)) - Long.MAX_VALUE));
        r55 = r55 + 1;
        goto L57
    L72:
        return;
    }

    public final void l() {
        int r0 = this.n - 1;
        this.n = r0;
        if (r0 != 0) goto L34;
        ArrayList r02 = this.q;
        if (r02 != null) goto L7;
    L11:
        int r03 = 0;
    L13:
        if (r03 >= ((bs) this.g.c).e()) goto L18;
        View r3 = (View) ((bs) this.g.c).f(r03);
        if (r3 == null) goto L17;
        WeakHashMap r4 = ja0.a;
        s90.r(r3, false);
    L17:
        r03 = r03 + 1;
        goto L13
    L18:
        int r04 = 0;
    L20:
        if (r04 >= ((bs) this.h.c).e()) goto L25;
        View r32 = (View) ((bs) this.h.c).f(r04);
        if (r32 == null) goto L24;
        WeakHashMap r42 = ja0.a;
        s90.r(r32, false);
    L24:
        r04 = r04 + 1;
        goto L20
    L25:
        this.p = true;
        return;
    L7:
        if (r02.size() <= 0) goto L11;
        ArrayList r05 = (ArrayList) this.q.clone();
        int r33 = r05.size();
        int r43 = 0;
    L9:
        if (r43 >= r33) goto L11;
        ((q70) r05.get(r43)).e(this);
        r43 = r43 + 1;
        goto L9
    }

    public final x70 m(View r5, boolean r6) {
        z6 r0 = this.i;
        if (r0 != null) goto L5;
        if (r6 == false) goto L8;
        ArrayList r02 = this.k;
    L9:
        if (r02 == null) goto L32;
        int r1 = r02.size();
        int r2 = 0;
    L12:
        if (r2 >= r1) goto L20;
        x70 r3 = (x70) r02.get(r2);
        if (r3 == null) goto L33;
        if (r3.b == r5) goto L21;
        r2 = r2 + 1;
    L21:
        if (r2 < 0) goto L27;
        if (r6 == false) goto L24;
        ArrayList r52 = this.l;
    L26:
        return (x70) r52.get(r2);
    L24:
        r52 = this.k;
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
        r02 = this.l;
        goto L9
    L5:
        return r0.m(r5, r6);
    }

    public String[] o() {
        return null;
    }

    public final x70 p(View r2, boolean r3) {
        z6 r0 = this.i;
        if (r0 != null) goto L5;
        if (r3 == false) goto L8;
        a8 r32 = this.g;
    L10:
        return (x70) ((n6) r32.a).getOrDefault(r2, null);
    L8:
        r32 = this.h;
        goto L10
    L5:
        return r0.p(r2, r3);
    }

    public boolean q(x70 r6, x70 r7) {
        if (r6 == null) goto L20;
        if (r7 == null) goto L20;
        String[] r1 = o();
        if (r1 == null) goto L13;
        int r2 = r1.length;
        int r3 = 0;
    L8:
        if (r3 >= r2) goto L20;
        if (s(r6, r7, r1[r3]) == true) goto L18;
        r3 = r3 + 1;
        goto L8
    L18:
        return true;
    L13:
        Iterator r12 = r6.a.keySet().iterator();
    L15:
        if (r12.hasNext() == false) goto L20;
        if (s(r6, r7, (String) r12.next()) == false) goto L15;
        return true;
    L20:
        return false;
    }

    public final boolean r(View r6) {
        int r0 = r6.getId();
        ArrayList r1 = this.e;
        int r2 = r1.size();
        ArrayList r4 = this.f;
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

    public void t(View r6) {
        if (this.p == true) goto L26;
        n6 r0 = n();
        int r1 = r0.c;
        db0 r2 = bb0.a;
        WindowId r62 = r6.getWindowId();
        int r12 = r1 - 1;
    L5:
        if (r12 < 0) goto L12;
        p70 r3 = (p70) r0.j(r12);
        if (r3.a == null) goto L11;
        if (r3.d.a.equals(r62) == false) goto L11;
        ((Animator) r0.h(r12)).pause();
    L11:
        r12 = r12 - 1;
        goto L5
    L12:
        ArrayList r63 = this.q;
        if (r63 != null) goto L15;
    L19:
        this.o = true;
        return;
    L15:
        if (r63.size() <= 0) goto L19;
        ArrayList r64 = (ArrayList) this.q.clone();
        int r02 = r64.size();
        int r13 = 0;
    L17:
        if (r13 >= r02) goto L19;
        ((q70) r64.get(r13)).c();
        r13 = r13 + 1;
        goto L17
    }

    public final String toString() {
        return E("");
    }

    public void u(q70 r2) {
        ArrayList r0 = this.q;
        if (r0 == null) goto L10;
        r0.remove(r2);
        if (this.q.size() != 0) goto L9;
        this.q = null;
        return;
    L9:
        return;
    }

    public void v(View r6) {
        if (this.o == true) goto L5;
        return;
    L5:
        if (this.p == true) goto L21;
        n6 r0 = n();
        int r2 = r0.c;
        db0 r3 = bb0.a;
        WindowId r62 = r6.getWindowId();
        int r22 = r2 - 1;
    L7:
        if (r22 < 0) goto L14;
        p70 r32 = (p70) r0.j(r22);
        if (r32.a == null) goto L13;
        if (r32.d.a.equals(r62) == false) goto L13;
        ((Animator) r0.h(r22)).resume();
    L13:
        r22 = r22 - 1;
        goto L7
    L14:
        ArrayList r63 = this.q;
        if (r63 == null) goto L21;
        if (r63.size() <= 0) goto L21;
        ArrayList r64 = (ArrayList) this.q.clone();
        int r02 = r64.size();
        int r23 = 0;
    L19:
        if (r23 >= r02) goto L21;
        ((q70) r64.get(r23)).d();
        r23 = r23 + 1;
    L21:
        this.o = false;
    }

    public void w() {
        D();
        n6 r0 = n();
        ArrayList r1 = this.r;
        int r2 = r1.size();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L18;
        Object r4 = r1.get(r3);
        r3 = r3 + 1;
        Animator r42 = (Animator) r4;
        if (r0.containsKey(r42) == false) goto L3;
        D();
        if (r42 == null) goto L3;
        r42.addListener(new o70(this, r0));
        long r5 = this.c;
        if (r5 < 0) goto L11;
        r42.setDuration(r5);
    L11:
        long r52 = this.b;
        if (r52 < 0) goto L14;
        r42.setStartDelay(r42.getStartDelay() + r52);
    L14:
        TimeInterpolator r53 = this.d;
        if (r53 == null) goto L17;
        r42.setInterpolator(r53);
    L17:
        r42.addListener(new y0(5, this));
        r42.start();
        goto L3
    L18:
        this.r.clear();
        l();
    }

    public void x(long r1) {
        this.c = r1;
    }

    public void z(TimeInterpolator r1) {
        this.d = r1;
    }

    public void e(x70 r1) {
    }

    public void y(gt r1) {
    }

    public void B() {
    }
}
