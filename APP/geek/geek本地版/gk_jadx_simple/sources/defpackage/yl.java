package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.a;
import androidx.fragment.app.FragmentContainerView;
import com.ljx.wechatmod.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class yl {
    public boolean A;
    public boolean B;
    public ArrayList C;
    public ArrayList D;
    public ArrayList E;
    public am F;
    public final y6 G;
    public final ArrayList a;
    public boolean b;
    public final r5 c;
    public ArrayList d;
    public ArrayList e;
    public final ql f;
    public a g;
    public final sl h;
    public final AtomicInteger i;
    public final Map j;
    public final d4 k;
    public final CopyOnWriteArrayList l;
    public int m;
    public nl n;
    public ip o;
    public ml p;
    public ml q;
    public final tl r;
    public final vh s;
    public d4 t;
    public d4 u;
    public d4 v;
    public ArrayDeque w;
    public boolean x;
    public boolean y;
    public boolean z;

    public yl() {
        this.a = new ArrayList();
        this.c = new r5();
        this.f = new ql(this);
        this.h = new sl(this);
        this.i = new AtomicInteger();
        this.j = Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new vh(this);
        this.k = new d4(this);
        this.l = new CopyOnWriteArrayList();
        this.m = -1;
        this.r = new tl(this);
        this.s = new vh(24);
        this.w = new ArrayDeque();
        this.G = new y6(7, this);
    }

    public static boolean A(int r1) {
        if (Log.isLoggable("FragmentManager", r1) == false) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean B(ml r5) {
        r5.getClass();
        r5 r52 = r5.t.c;
        r52.getClass();
        ArrayList r0 = new ArrayList();
        Iterator r53 = ((HashMap) r52.b).values().iterator();
    L4:
        if (r53.hasNext() == false) goto L9;
        androidx.fragment.app.a r1 = (androidx.fragment.app.a) r53.next();
        if (r1 != null) goto L7;
        r0.add(null);
        goto L4
    L7:
        r0.add(r1.c);
        goto L4
    L9:
        int r54 = r0.size();
        boolean r2 = false;
        int r3 = 0;
    L10:
        if (r3 >= r54) goto L17;
        Object r4 = r0.get(r3);
        r3 = r3 + 1;
        ml r42 = (ml) r4;
        if (r42 == null) goto L14;
        r2 = B(r42);
    L14:
        if (r2 == false) goto L10;
        return true;
    L17:
        return false;
    }

    public static boolean C(ml r1) {
        if (r1 != null) goto L5;
        return true;
    L5:
        if (r1.B == true) goto L7;
        return false;
    L7:
        if (r1.r != null) goto L9;
        return true;
    L9:
        if (C(r1.u) == false) goto L16;
        return true;
    L16:
        return false;
    }

    public static boolean D(ml r2) {
        if (r2 == null) goto L12;
        yl r0 = r2.r;
        if (r2.equals(r0.q) == true) goto L7;
        return false;
    L7:
        if (D(r0.p) == false) goto L13;
        return true;
    L13:
        return false;
    L12:
        return true;
    }

    public static void R(ml r2) {
        if (A(2) == false) goto L6;
        Log.v("FragmentManager", "show: " + r2);
    L6:
        if (r2.y == false) goto L9;
        r2.y = false;
        r2.I = !r2.I;
        return;
    }

    public final void E(int r6, boolean r7) {
        if (this.n == null) goto L5;
    L9:
        if (r7 == false) goto L11;
    L13:
        this.m = r6;
        r5 r62 = this.c;
        HashMap r72 = (HashMap) r62.b;
        ArrayList r0 = (ArrayList) r62.c;
        int r1 = r0.size();
        int r3 = 0;
    L14:
        if (r3 >= r1) goto L18;
        Object r4 = r0.get(r3);
        r3 = r3 + 1;
        androidx.fragment.app.a r42 = (androidx.fragment.app.a) r72.get(((ml) r4).e);
        if (r42 == null) goto L14;
        r42.k();
        goto L14
    L18:
        Iterator r73 = r72.values().iterator();
    L20:
        if (r73.hasNext() == false) goto L29;
        androidx.fragment.app.a r02 = (androidx.fragment.app.a) r73.next();
        if (r02 == null) goto L20;
        r02.k();
        ml r12 = r02.c;
        if (r12.l == false) goto L20;
        if (r12.q > 0) goto L20;
        r62.w(r02);
        goto L20
    L29:
        S();
        if (this.x == false) goto L51;
        nl r63 = this.n;
        if (r63 != null) goto L34;
        return;
    L34:
        if (this.m != 7) goto L53;
        r63.G.f();
        this.x = false;
        return;
    L53:
        return;
    L51:
        return;
    L11:
        if (r6 != this.m) goto L13;
        return;
    L5:
        if (r6 == (-1)) goto L9;
        throw new IllegalStateException("No activity");
    }

    public final void F() {
        if (this.n == null) goto L11;
        this.y = false;
        this.z = false;
        this.F.h = false;
        Iterator r0 = this.c.p().iterator();
    L7:
        if (r0.hasNext() == false) goto L17;
        ml r1 = (ml) r0.next();
        if (r1 == null) goto L7;
        r1.t.F();
        goto L7
    L17:
        return;
    }

    public final boolean G() {
        t(false);
        s(true);
        ml r2 = this.q;
        if (r2 != null) goto L5;
    L7:
        boolean r22 = H(this.C, this.D, -1, 0);
        if (r22 == false) goto L15;
        this.b = true;
        J(this.C, this.D);     // Catch: Throwable -> L12
        d();
    L12:
        th = move-exception;
        d();
        throw th;
    L15:
        T();
        if (this.B == false) goto L18;
        this.B = false;
        S();
    L18:
        ((HashMap) this.c.b).values().removeAll(Collections.singleton(null));
        return r22;
    L5:
        if (r2.g().G() == false) goto L7;
        return true;
    }

    public final boolean H(ArrayList r4, ArrayList r5, int r6, int r7) {
        ArrayList r0 = this.d;
        if (r0 != null) goto L6;
        return false;
    L6:
        if (r6 < 0) goto L8;
    L14:
        if (r6 < 0) goto L34;
        int r02 = r0.size() - 1;
    L16:
        if (r02 < 0) goto L23;
        b7 r2 = (b7) this.d.get(r02);
        if (r6 < 0) goto L22;
        if (r6 == r2.r) goto L23;
    L22:
        r02 = r02 - 1;
    L23:
        if (r02 >= 0) goto L26;
        return false;
    L26:
        if ((r7 & 1) == 0) goto L36;
    L27:
        r02 = r02 - 1;
        if (r02 < 0) goto L36;
        b7 r72 = (b7) this.d.get(r02);
        if (r6 < 0) goto L36;
        if (r6 == r72.r) goto L27;
    L36:
        if (r02 != (this.d.size() - 1)) goto L39;
        return false;
    L39:
        int r62 = this.d.size() - 1;
    L40:
        if (r62 <= r02) goto L42;
        r4.add(this.d.remove(r62));
        r5.add(Boolean.TRUE);
        r62 = r62 - 1;
        goto L40
    L42:
        return true;
    L34:
        r02 = -1;
        goto L36
    L8:
        if ((r7 & 1) != 0) goto L14;
        int r63 = r0.size() - 1;
        if (r63 < 0) goto L53;
        r4.add(this.d.remove(r63));
        r5.add(Boolean.TRUE);
        return true;
    L53:
        return false;
    }

    public final void I(ml r5) {
        if (A(2) == false) goto L6;
        Log.v("FragmentManager", "remove: " + r5 + " nesting=" + r5.q);
    L6:
        if (r5.q <= 0) goto L8;
        boolean r0 = true;
    L10:
        if (r5.z == false) goto L14;
        if (r0 == false) goto L14;
        return;
    L14:
        r5 r02 = this.c;
        ArrayList r3 = (ArrayList) r02.c;
        monitor-enter(r3);
        ((ArrayList) r02.c).remove(r5);     // Catch: Throwable -> L23
        monitor-exit(r3);     // Catch: Throwable -> L23
        r5.k = false;
        if (B(r5) == false) goto L21;
        this.x = true;
    L21:
        r5.l = true;
        Q(r5);
        return;
    L23:
        th = move-exception;
        throw th;
    L8:
        r0 = false;
        goto L10
    }

    public final void J(ArrayList r5, ArrayList r6) {
        if (r5.isEmpty() == false) goto L6;
        return;
    L6:
        if (r5.size() != r6.size()) goto L27;
        int r0 = r5.size();
        int r1 = 0;
        int r2 = 0;
    L8:
        if (r1 >= r0) goto L23;
        if (((b7) r5.get(r1)).o == true) goto L22;
        if (r2 == r1) goto L13;
        u(r5, r6, r2, r1);
    L13:
        r2 = r1 + 1;
        if (((Boolean) r6.get(r1)).booleanValue() == false) goto L21;
    L15:
        if (r2 >= r0) goto L21;
        if (((Boolean) r6.get(r2)).booleanValue() == false) goto L21;
        if (((b7) r5.get(r2)).o == true) goto L21;
        r2 = r2 + 1;
    L21:
        u(r5, r6, r1, r2);
        r1 = r2 - 1;
    L22:
        r1 = r1 + 1;
        goto L8
    L23:
        if (r2 == r0) goto L34;
        u(r5, r6, r2, r0);
        return;
    L34:
        return;
    L27:
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final void K(Parcelable r20) {
        if (r20 == null) goto L101;
        zl r1 = (zl) r20;
        if (r1.a != null) goto L8;
        return;
    L8:
        r5 r2 = this.c;
        ((HashMap) r2.b).clear();
        ArrayList r3 = r1.a;
        int r4 = r3.size();
        int r6 = 0;
    L9:
        d4 r7 = this.k;
        int r9 = 2;
        if (r6 >= r4) goto L24;
        Object r11 = r3.get(r6);
        r6 = r6 + 1;
        cm r112 = (cm) r11;
        if (r112 == null) goto L9;
        am r12 = this.F;
        ml r122 = (ml) r12.c.get(r112.b);
        if (r122 != null) goto L16;
        androidx.fragment.app.a r13 = new androidx.fragment.app.a(this.k, this.c, this.n.D.getClassLoader(), x(), r112);
    L20:
        ml r72 = r13.c;
        r72.r = this;
        if (A(2) == false) goto L23;
        Log.v("FragmentManager", "restoreSaveState: active (" + r72.e + "): " + r72);
    L23:
        r13.m(this.n.D.getClassLoader());
        r2.v(r13);
        r13.e = this.m;
        goto L9
    L16:
        if (A(2) == false) goto L18;
        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + r122);
    L18:
        r13 = new androidx.fragment.app.a(r7, r2, r122, r112);
        goto L20
    L24:
        am r32 = this.F;
        r32.getClass();
        ArrayList r42 = new ArrayList(r32.c.values());
        int r33 = r42.size();
        int r62 = 0;
    L26:
        if (r62 >= r33) goto L34;
        Object r123 = r42.get(r62);
        r62 = r62 + 1;
        ml r124 = (ml) r123;
        if (((HashMap) r2.b).get(r124.e) != null) goto L26;
        if (A(2) == false) goto L33;
        Log.v("FragmentManager", "Discarding retained Fragment " + r124 + " that was not found in the set of active Fragments " + r1.a);
    L33:
        this.F.b(r124);
        r124.r = this;
        androidx.fragment.app.a r132 = new androidx.fragment.app.a(r7, r2, r124);
        r132.e = 1;
        r132.k();
        r124.l = true;
        r132.k();
        goto L26
    L34:
        ArrayList r34 = r1.b;
        ((ArrayList) r2.c).clear();
        if (r34 == null) goto L46;
        int r43 = r34.size();
        int r63 = 0;
    L37:
        if (r63 >= r43) goto L46;
        Object r73 = r34.get(r63);
        r63 = r63 + 1;
        String r74 = (String) r73;
        ml r125 = r2.g(r74);
        if (r125 == null) goto L45;
        if (A(2) == false) goto L43;
        Log.v("FragmentManager", "restoreSaveState: added (" + r74 + "): " + r125);
    L43:
        r2.a(r125);
        goto L37
    L45:
        throw new IllegalStateException(z30.j("No instantiated fragment for (", r74, ")"));
    L46:
        ml r44 = null;
        if (r1.c == null) goto L68;
        this.d = new ArrayList(r1.c.length);
        int r35 = 0;
    L49:
        c7[] r64 = r1.c;
        if (r35 >= r64.length) goto L67;
        c7 r65 = r64[r35];
        int[] r75 = r65.a;
        b7 r126 = new b7(this);
        int r133 = 0;
        int r14 = 0;
    L53:
        if (r133 >= r75.length) goto L62;
        em r15 = new em();
        int r16 = r133 + 1;
        int r202 = r9;
        r15.a = r75[r133];
        if (A(r202) == false) goto L57;
        Log.v("FragmentManager", "Instantiate " + r126 + " op #" + r14 + " base fragment #" + r75[r16]);
    L57:
        String r5 = (String) r65.b.get(r14);
        if (r5 == null) goto L60;
        r15.b = r2.g(r5);
    L61:
        r15.g = jq.values()[r65.c[r14]];
        r15.h = jq.values()[r65.d[r14]];
        int r92 = r75[r16];
        r15.c = r92;
        int r52 = r75[r133 + 2];
        r15.d = r52;
        int r18 = r133 + 4;
        int r45 = r75[r133 + 3];
        r15.e = r45;
        r133 = r133 + 5;
        int r113 = r75[r18];
        r15.f = r113;
        r126.b = r92;
        r126.c = r52;
        r126.d = r45;
        r126.e = r113;
        r126.b(r15);
        r14 = r14 + 1;
        r9 = r202;
        r44 = null;
        goto L53
    L60:
        r15.b = r44;
        goto L61
    L62:
        int r203 = r9;
        r126.f = r65.e;
        r126.h = r65.f;
        r126.r = r65.g;
        r126.g = true;
        r126.i = r65.h;
        r126.j = r65.i;
        r126.k = r65.j;
        r126.l = r65.k;
        r126.m = r65.l;
        r126.n = r65.m;
        r126.o = r65.n;
        r126.c(1);
        if (A(r203) == false) goto L66;
        Log.v("FragmentManager", "restoreAllState: back stack #" + r35 + " (index " + r126.r + "): " + r126);
        PrintWriter r66 = new PrintWriter(new as());
        r126.d("  ", r66, false);
        r66.close();
    L66:
        this.d.add(r126);
        r35 = r35 + 1;
        r9 = r203;
        r44 = null;
        goto L49
    L67:
        int r76 = 0;
    L69:
        this.i.set(r1.d);
        String r36 = r1.e;
        if (r36 == null) goto L72;
        ml r22 = r2.g(r36);
        this.q = r22;
        n(r22);
    L72:
        ArrayList r23 = r1.f;
        if (r23 == null) goto L78;
        int r53 = r76;
    L76:
        if (r53 >= r23.size()) goto L78;
        Bundle r37 = (Bundle) r1.g.get(r53);
        r37.setClassLoader(this.n.D.getClassLoader());
        this.j.put(r23.get(r53), r37);
        r53 = r53 + 1;
    L78:
        this.w = new ArrayDeque(r1.h);
        return;
    L68:
        r76 = 0;
        this.d = null;
        goto L69
    }

    public final zl L() {
        Iterator r0 = e().iterator();
    L3:
        int r2 = 0;
        if (r0.hasNext() == false) goto L8;
        cg r1 = (cg) r0.next();
        if (r1.e == false) goto L3;
        r1.e = false;
        r1.c();
        goto L3
    L8:
        Iterator r02 = e().iterator();
    L10:
        if (r02.hasNext() == false) goto L12;
        ((cg) r02.next()).e();
        goto L10
    L12:
        t(true);
        this.y = true;
        this.F.h = true;
        r5 r03 = this.c;
        r03.getClass();
        HashMap r04 = (HashMap) r03.b;
        ArrayList r12 = new ArrayList(r04.size());
        Iterator r05 = r04.values().iterator();
    L13:
        Bundle r5 = null;
        if (r05.hasNext() == false) goto L58;
        androidx.fragment.app.a r3 = (androidx.fragment.app.a) r05.next();
        if (r3 == null) goto L13;
        ml r6 = r3.c;
        cm r7 = new cm(r6);
        if (r6.a > (-1)) goto L20;
    L53:
        r7.m = r6.b;
    L54:
        r12.add(r7);
        if (A(2) == false) goto L13;
        Log.v("FragmentManager", "Saved state of " + r6 + ": " + r7.m);
        goto L13
    L20:
        if (r7.m != null) goto L53;
        Bundle r8 = new Bundle();
        r6.r(r8);
        r6.O.c(r8);
        zl r9 = r6.t.L();
        if (r9 == null) goto L24;
        r8.putParcelable("android:support:fragments", r9);
    L24:
        r3.a.m(false);
        if (r8.isEmpty() == true) goto L29;
        r5 = r8;
    L29:
        if (r6.E == null) goto L32;
        r3.o();
    L32:
        if (r6.c == null) goto L37;
        if (r5 != null) goto L35;
        r5 = new Bundle();
    L35:
        r5.putSparseParcelableArray("android:view_state", r6.c);
    L37:
        if (r6.d == null) goto L42;
        if (r5 != null) goto L40;
        r5 = new Bundle();
    L40:
        r5.putBundle("android:view_registry_state", r6.d);
    L42:
        if (r6.G == true) goto L46;
        if (r5 != null) goto L45;
        r5 = new Bundle();
    L45:
        r5.putBoolean("android:user_visible_hint", r6.G);
    L46:
        r7.m = r5;
        if (r6.h == null) goto L54;
        if (r5 != null) goto L50;
        r7.m = new Bundle();
    L50:
        r7.m.putString("android:target_state", r6.h);
        int r32 = r6.i;
        if (r32 == 0) goto L54;
        r7.m.putInt("android:target_req_state", r32);
        goto L54
    L58:
        if (r12.isEmpty() == true) goto L60;
        r5 r06 = this.c;
        ArrayList r33 = (ArrayList) r06.c;
        monitor-enter(r33);
    L69:
        th = move-exception;
        throw th;
    L66:
        if (((ArrayList) r06.c).isEmpty() == false) goto L71;
        monitor-exit(r33);     // Catch: Throwable -> L69
        ArrayList r62 = null;
    L77:
        ArrayList r07 = this.d;
        if (r07 == null) goto L87;
        int r08 = r07.size();
        if (r08 <= 0) goto L87;
        c7[] r34 = new c7[r08];
    L82:
        if (r2 >= r08) goto L88;
        r34[r2] = new c7((b7) this.d.get(r2));
        if (A(2) == false) goto L86;
        Log.v("FragmentManager", "saveAllState: adding back stack #" + r2 + ": " + this.d.get(r2));
    L86:
        r2 = r2 + 1;
    L88:
        zl r09 = new zl();
        r09.e = null;
        ArrayList r22 = new ArrayList();
        r09.f = r22;
        ArrayList r4 = new ArrayList();
        r09.g = r4;
        r09.a = r12;
        r09.b = r62;
        r09.c = r34;
        r09.d = this.i.get();
        ml r13 = this.q;
        if (r13 == null) goto L91;
        r09.e = r13.e;
    L91:
        r22.addAll(this.j.keySet());
        r4.addAll(this.j.values());
        r09.h = new ArrayList(this.w);
        return r09;
    L87:
        r34 = null;
        goto L88
    L71:
        r62 = new ArrayList(((ArrayList) r06.c).size());     // Catch: Throwable -> L69
        ArrayList r010 = (ArrayList) r06.c;     // Catch: Throwable -> L69
        int r72 = r010.size();     // Catch: Throwable -> L69
        int r82 = 0;
    L72:
        if (r82 >= r72) goto L76;
        Object r92 = r010.get(r82);     // Catch: Throwable -> L69
        r82 = r82 + 1;     // Catch: Throwable -> L69
        ml r93 = (ml) r92;     // Catch: Throwable -> L69
        r62.add(r93.e);     // Catch: Throwable -> L69
        if (A(2) == false) goto L72;
        Log.v("FragmentManager", "saveAllState: adding fragment (" + r93.e + "): " + r93);     // Catch: Throwable -> L69
        goto L72
    L76:
        monitor-exit(r33);     // Catch: Throwable -> L69
        goto L77
    L60:
        if (A(2) == false) goto L62;
        Log.v("FragmentManager", "saveAllState: no fragments!");
    L62:
        return null;
    }

    public final void M() {
        ArrayList r0 = this.a;
        monitor-enter(r0);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (this.a.size() != 1) goto L9;
        this.n.E.removeCallbacks(this.G);     // Catch: Throwable -> L7
        this.n.E.post(this.G);     // Catch: Throwable -> L7
        T();     // Catch: Throwable -> L7
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L7
    }

    public final void N(ml r2, boolean r3) {
        ViewGroup r22 = w(r2);
        if (r22 != null) goto L5;
        return;
    L5:
        if ((r22 instanceof FragmentContainerView) == false) goto L9;
        ((FragmentContainerView) r22).setDrawDisappearingViewsLast(!r3);
        return;
    }

    public final void O(ml r3, jq r4) {
        if (r3.equals(this.c.g(r3.e)) == false) goto L11;
        if (r3.s != null) goto L7;
    L8:
        r3.K = r4;
        return;
    L7:
        if (r3.r == this) goto L8;
    L11:
        throw new IllegalArgumentException("Fragment " + r3 + " is not an active fragment of FragmentManager " + this);
    }

    public final void P(ml r4) {
        if (r4 != null) goto L4;
    L12:
        ml r0 = this.q;
        this.q = r4;
        n(r0);
        n(this.q);
        return;
    L4:
        if (r4.equals(this.c.g(r4.e)) == false) goto L11;
        if (r4.s == null) goto L12;
        if (r4.r == this) goto L12;
    L11:
        throw new IllegalArgumentException("Fragment " + r4 + " is not an active fragment of FragmentManager " + this);
    }

    public final void Q(ml r6) {
        ViewGroup r0 = w(r6);
        if (r0 == null) goto L33;
        ll r1 = r6.H;
        boolean r2 = false;
        if (r1 != null) goto L7;
        int r3 = 0;
    L8:
        if (r1 != null) goto L10;
        int r4 = 0;
    L11:
        int r42 = r4 + r3;
        if (r1 != null) goto L14;
        int r32 = 0;
    L15:
        int r33 = r32 + r42;
        if (r1 != null) goto L18;
        int r12 = 0;
    L20:
        if ((r12 + r33) > 0) goto L22;
        return;
    L22:
        if (r0.getTag(R.id.visible_removing_fragment_view_tag) != null) goto L24;
        r0.setTag(R.id.visible_removing_fragment_view_tag, r6);
    L24:
        ml r02 = (ml) r0.getTag(R.id.visible_removing_fragment_view_tag);
        ll r62 = r6.H;
        if (r62 == null) goto L29;
        r2 = r62.a;
    L29:
        if (r02.H == null) goto L35;
        r02.f().a = r2;
        return;
    L35:
        return;
    L18:
        r12 = r1.e;
        goto L20
    L14:
        r32 = r1.d;
        goto L15
    L10:
        r4 = r1.c;
        goto L11
    L7:
        r3 = r1.b;
        goto L8
    }

    public final void S() {
        ArrayList r0 = this.c.i();
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L10;
        Object r4 = r0.get(r3);
        r3 = r3 + 1;
        androidx.fragment.app.a r42 = (androidx.fragment.app.a) r4;
        ml r5 = r42.c;
        if (r5.F == false) goto L3;
        if (this.b == true) goto L8;
        r5.F = false;
        r42.k();
        goto L3
    L8:
        this.B = true;
        goto L3
    }

    public final void T() {
        ArrayList r0 = this.a;
        monitor-enter(r0);
        boolean r2 = true;
        if (this.a.isEmpty() == true) goto L13;
        sl r1 = this.h;     // Catch: Throwable -> L11
        r1.a = true;     // Catch: Throwable -> L11
        xw r12 = r1.c;     // Catch: Throwable -> L11
        if (r12 == null) goto L9;
        r12.a();     // Catch: Throwable -> L11
    L9:
        monitor-exit(r0);     // Catch: Throwable -> L11
        return;
    L13:
        monitor-exit(r0);     // Catch: Throwable -> L11
        sl r02 = this.h;
        ArrayList r13 = this.d;
        if (r13 == null) goto L17;
        int r14 = r13.size();
    L18:
        if (r14 > 0) goto L20;
    L22:
        r2 = false;
    L23:
        r02.a = r2;
        xw r03 = r02.c;
        if (r03 == null) goto L30;
        r03.a();
        return;
    L30:
        return;
    L20:
        if (D(this.p) == false) goto L22;
    L17:
        r14 = 0;
    L11:
        th = move-exception;
        throw th;
    }

    public final androidx.fragment.app.a a(ml r4) {
        if (A(2) == false) goto L5;
        Log.v("FragmentManager", "add: " + r4);
    L5:
        androidx.fragment.app.a r0 = f(r4);
        r4.r = this;
        r5 r1 = this.c;
        r1.v(r0);
        if (r4.z == true) goto L13;
        r1.a(r4);
        r4.l = false;
        if (r4.E != null) goto L11;
        r4.I = false;
    L11:
        if (B(r4) == false) goto L13;
        this.x = true;
    L13:
        return r0;
    }

    public final void b(nl r6, ip r7, ml r8) {
        if (this.n != null) goto L55;
        this.n = r6;
        this.o = r7;
        this.p = r8;
        CopyOnWriteArrayList r72 = this.l;
        if (r8 == null) goto L7;
        r72.add(new ul(r8));
    L10:
        if (this.p == null) goto L12;
        T();
    L12:
        if (r6 == null) goto L18;
        a r73 = r6.G.i();
        this.g = r73;
        if (r8 == null) goto L16;
        oq r0 = r8;
    L17:
        r73.a(r0, this.h);
        goto L18
    L16:
        r0 = r6;
    L18:
        boolean r74 = false;
        if (r8 == null) goto L24;
        am r62 = r8.r.F;
        HashMap r1 = r62.d;
        am r2 = (am) r1.get(r8.e);
        if (r2 != null) goto L23;
        r2 = new am(r62.f);
        r1.put(r8.e, r2);
    L23:
        this.F = r2;
    L41:
        am r63 = this.F;
        if (this.y == false) goto L44;
    L45:
        r74 = true;
    L46:
        r63.h = r74;
        this.c.d = r63;
        nl r64 = this.n;
        if (r64 == null) goto L58;
        sb r65 = r64.G.j;
        if (r8 == null) goto L51;
        String r75 = z30.l(new StringBuilder(), r8.e, ":");
    L52:
        String r76 = "FragmentManager:" + r75;
        this.t = r65.b(z30.i(r76, "StartActivityForResult"), new v1(1), new rl(this, 2));
        this.u = r65.b(z30.i(r76, "StartIntentSenderForResult"), new v1(2), new rl(this, 0));
        this.v = r65.b(z30.i(r76, "RequestPermissions"), new v1(0), new rl(this, 1));
        return;
    L51:
        r75 = "";
        goto L52
    L58:
        return;
    L44:
        if (this.z == false) goto L46;
    L24:
        if (r6 == null) goto L40;
        ra0 r66 = r6.G.d();
        ip.o("store", r66);
        se r12 = se.b;
        ip.o("defaultCreationExtras", r12);
        String r3 = am.class.getCanonicalName();
        if (r3 == null) goto L39;
        String r32 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r3);
        ip.o("key", r32);
        LinkedHashMap r67 = r66.a;
        pa0 r4 = (pa0) r67.get(r32);
        if (am.class.isInstance(r4) == false) goto L30;
        ip.m("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", r4);
    L37:
        this.F = (am) r4;
        goto L41
    L30:
        LinkedHashMap r22 = new LinkedHashMap();
        r22.putAll(r12.a);
        r22.put(vh.p, r32);
        am r13 = new am(true);     // Catch: AbstractMethodError -> L33
    L32:
        r4 = r13;
        pa0 r68 = (pa0) r67.put(r32, r4);
        if (r68 == null) goto L37;
        r68.a();
    L33:
        r13 = new am(true);
        goto L32
    L39:
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    L40:
        this.F = new am(false);
        goto L41
    L7:
        if (r6 == null) goto L10;
        r72.add(r6);
        goto L10
    L55:
        throw new IllegalStateException("Already attached");
    }

    public final void c(ml r5) {
        if (A(2) == false) goto L6;
        Log.v("FragmentManager", "attach: " + r5);
    L6:
        if (r5.z == false) goto L16;
        r5.z = false;
        if (r5.k == true) goto L17;
        this.c.a(r5);
        if (A(2) == false) goto L13;
        Log.v("FragmentManager", "add from attach: " + r5);
    L13:
        if (B(r5) == false) goto L18;
        this.x = true;
        return;
    L18:
        return;
    L17:
        return;
    }

    public final void d() {
        this.b = false;
        this.D.clear();
        this.C.clear();
    }

    public final HashSet e() {
        HashSet r0 = new HashSet();
        ArrayList r1 = this.c.i();
        int r2 = r1.size();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L7;
        Object r4 = r1.get(r3);
        r3 = r3 + 1;
        ViewGroup r42 = ((androidx.fragment.app.a) r4).c.D;
        if (r42 == null) goto L3;
        r0.add(cg.f(r42, y()));
        goto L3
    L7:
        return r0;
    }

    public final androidx.fragment.app.a f(ml r4) {
        String r0 = r4.e;
        r5 r1 = this.c;
        androidx.fragment.app.a r02 = (androidx.fragment.app.a) ((HashMap) r1.b).get(r0);
        if (r02 == null) goto L5;
        return r02;
    L5:
        androidx.fragment.app.a r03 = new androidx.fragment.app.a(this.k, r1, r4);
        r03.m(this.n.D.getClassLoader());
        r03.e = this.m;
        return r03;
    }

    public final void g(ml r5) {
        if (A(2) == false) goto L6;
        Log.v("FragmentManager", "detach: " + r5);
    L6:
        if (r5.z == true) goto L24;
        r5.z = true;
        if (r5.k == true) goto L10;
        return;
    L10:
        if (A(2) == false) goto L12;
        Log.v("FragmentManager", "remove from detach: " + r5);
    L12:
        r5 r0 = this.c;
        ArrayList r1 = (ArrayList) r0.c;
        monitor-enter(r1);
        ((ArrayList) r0.c).remove(r5);     // Catch: Throwable -> L21
        monitor-exit(r1);     // Catch: Throwable -> L21
        r5.k = false;
        if (B(r5) == false) goto L19;
        this.x = true;
    L19:
        Q(r5);
        return;
    L21:
        th = move-exception;
        throw th;
    }

    public final void h() {
        Iterator r0 = this.c.p().iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        ml r1 = (ml) r0.next();
        if (r1 == null) goto L4;
        r1.C = true;
        r1.t.h();
        goto L4
    }

    public final boolean i() {
        if (this.m < 1) goto L16;
        Iterator r0 = this.c.p().iterator();
    L7:
        if (r0.hasNext() == false) goto L16;
        ml r3 = (ml) r0.next();
        if (r3 == null) goto L7;
        if (r3.y == true) goto L13;
        boolean r32 = r3.t.i();
    L14:
        if (r32 == false) goto L7;
        return true;
    L13:
        r32 = false;
    L16:
        return false;
    }

    public final boolean j() {
        int r1 = 0;
        if (this.m >= 1) goto L5;
        return false;
    L5:
        Iterator r0 = this.c.p().iterator();
        ArrayList r3 = null;
        boolean r4 = false;
    L7:
        if (r0.hasNext() == false) goto L21;
        ml r5 = (ml) r0.next();
        if (r5 == null) goto L7;
        if (C(r5) == false) goto L7;
        if (r5.y == true) goto L15;
        boolean r6 = r5.t.j();
    L16:
        if (r6 == false) goto L7;
        if (r3 != null) goto L19;
        r3 = new ArrayList();
    L19:
        r3.add(r5);
        r4 = true;
        goto L7
    L15:
        r6 = false;
        goto L16
    L21:
        if (this.e != null) goto L23;
    L30:
        this.e = r3;
        return r4;
    L23:
        if (r1 >= this.e.size()) goto L30;
        ml r02 = (ml) this.e.get(r1);
        if (r3 != null) goto L27;
    L28:
        r02.getClass();
    L29:
        r1 = r1 + 1;
        goto L23
    L27:
        if (r3.contains(r02) == true) goto L29;
        goto L28
    }

    public final void k() {
        this.A = true;
        t(true);
        Iterator r0 = e().iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((cg) r0.next()).e();
        goto L4
    L6:
        p(-1);
        this.n = null;
        this.o = null;
        this.p = null;
        if (this.g == null) goto L13;
        Iterator r1 = this.h.b.iterator();
    L10:
        if (r1.hasNext() == false) goto L12;
        ((h8) r1.next()).cancel();
        goto L10
    L12:
        this.g = null;
    L13:
        d4 r02 = this.t;
        if (r02 == null) goto L61;
        sb r12 = (sb) r02.c;
        String r03 = (String) r02.b;
        Bundle r2 = r12.g;
        HashMap r3 = r12.f;
        if (r12.d.contains(r03) == true) goto L20;
        Integer r4 = (Integer) r12.b.remove(r03);
        if (r4 == null) goto L20;
        r12.a.remove(r4);
    L20:
        r12.e.remove(r03);
        if (r3.containsKey(r03) == false) goto L24;
        Log.w("ActivityResultRegistry", "Dropping pending result for request " + r03 + ": " + r3.get(r03));
        r3.remove(r03);
    L24:
        if (r2.containsKey(r03) == false) goto L27;
        Log.w("ActivityResultRegistry", "Dropping pending result for request " + r03 + ": " + r2.getParcelable(r03));
        r2.remove(r03);
    L27:
        if (r12.c.get(r03) != null) goto L60;
        d4 r04 = this.u;
        sb r13 = (sb) r04.c;
        String r05 = (String) r04.b;
        Bundle r22 = r13.g;
        HashMap r32 = r13.f;
        if (r13.d.contains(r05) == true) goto L33;
        Integer r42 = (Integer) r13.b.remove(r05);
        if (r42 == null) goto L33;
        r13.a.remove(r42);
    L33:
        r13.e.remove(r05);
        if (r32.containsKey(r05) == false) goto L37;
        Log.w("ActivityResultRegistry", "Dropping pending result for request " + r05 + ": " + r32.get(r05));
        r32.remove(r05);
    L37:
        if (r22.containsKey(r05) == false) goto L40;
        Log.w("ActivityResultRegistry", "Dropping pending result for request " + r05 + ": " + r22.getParcelable(r05));
        r22.remove(r05);
    L40:
        if (r13.c.get(r05) != null) goto L58;
        d4 r06 = this.v;
        sb r14 = (sb) r06.c;
        String r07 = (String) r06.b;
        Bundle r23 = r14.g;
        HashMap r33 = r14.f;
        if (r14.d.contains(r07) == true) goto L46;
        Integer r43 = (Integer) r14.b.remove(r07);
        if (r43 == null) goto L46;
        r14.a.remove(r43);
    L46:
        r14.e.remove(r07);
        if (r33.containsKey(r07) == false) goto L50;
        Log.w("ActivityResultRegistry", "Dropping pending result for request " + r07 + ": " + r33.get(r07));
        r33.remove(r07);
    L50:
        if (r23.containsKey(r07) == false) goto L53;
        Log.w("ActivityResultRegistry", "Dropping pending result for request " + r07 + ": " + r23.getParcelable(r07));
        r23.remove(r07);
    L53:
        if (r14.c.get(r07) != null) goto L56;
        return;
    L56:
        throw new ClassCastException();
    L58:
        throw new ClassCastException();
    L60:
        throw new ClassCastException();
    }

    public final boolean l() {
        if (this.m < 1) goto L16;
        Iterator r0 = this.c.p().iterator();
    L7:
        if (r0.hasNext() == false) goto L16;
        ml r3 = (ml) r0.next();
        if (r3 == null) goto L7;
        if (r3.y == true) goto L13;
        boolean r32 = r3.t.l();
    L14:
        if (r32 == false) goto L7;
        return true;
    L13:
        r32 = false;
    L16:
        return false;
    }

    public final void m() {
        if (this.m < 1) goto L13;
        Iterator r0 = this.c.p().iterator();
    L7:
        if (r0.hasNext() == false) goto L21;
        ml r1 = (ml) r0.next();
        if (r1 == null) goto L7;
        if (r1.y == true) goto L7;
        r1.t.m();
        goto L7
    L21:
        return;
    }

    public final void n(ml r3) {
        if (r3 == null) goto L11;
        String r0 = r3.e;
        if (r3.equals(this.c.g(r0)) == false) goto L12;
        r3.r.getClass();
        boolean r02 = D(r3);
        Boolean r1 = r3.j;
        if (r1 != null) goto L8;
    L9:
        r3.j = Boolean.valueOf(r02);
        yl r32 = r3.t;
        r32.T();
        r32.n(r32.q);
        return;
    L8:
        if (r1.booleanValue() != r02) goto L9;
        return;
    L12:
        return;
    }

    public final boolean o() {
        boolean r1 = false;
        if (this.m >= 1) goto L5;
        return false;
    L5:
        Iterator r0 = this.c.p().iterator();
    L7:
        if (r0.hasNext() == false) goto L18;
        ml r3 = (ml) r0.next();
        if (r3 == null) goto L7;
        if (C(r3) == false) goto L7;
        if (r3.y == true) goto L15;
        boolean r32 = r3.t.o();
    L16:
        if (r32 == false) goto L7;
        r1 = true;
        goto L7
    L15:
        r32 = false;
        goto L16
    L18:
        return r1;
    }

    public final void p(int r5) {
        this.b = true;     // Catch: Throwable -> L14
        Iterator r2 = ((HashMap) this.c.b).values().iterator();     // Catch: Throwable -> L14
    L5:
        if (r2.hasNext() == false) goto L9;
        androidx.fragment.app.a r3 = (androidx.fragment.app.a) r2.next();     // Catch: Throwable -> L14
        if (r3 == null) goto L5;
        r3.e = r5;     // Catch: Throwable -> L14
        goto L5
    L9:
        E(r5, false);     // Catch: Throwable -> L14
        Iterator r52 = e().iterator();     // Catch: Throwable -> L14
    L10:
        if (r52.hasNext() == false) goto L16;
        ((cg) r52.next()).e();     // Catch: Throwable -> L14
        goto L10
    L16:
        this.b = false;
        t(true);
        return;
    L14:
        th = move-exception;
        this.b = false;
        throw th;
    }

    public final void q(String r14, FileDescriptor r15, PrintWriter r16, String[] r17) {
        String r1 = z30.i(r14, "    ");
        r5 r2 = this.c;
        ArrayList r3 = (ArrayList) r2.c;
        String r4 = z30.i(r14, "    ");
        HashMap r22 = (HashMap) r2.b;
        if (r22.isEmpty() == true) goto L120;
        r16.print(r14);
        r16.println("Active Fragments:");
        Iterator r23 = r22.values().iterator();
    L6:
        if (r23.hasNext() == false) goto L120;
        androidx.fragment.app.a r5 = (androidx.fragment.app.a) r23.next();
        r16.print(r14);
        if (r5 != null) goto L9;
        r16.println("null");
        goto L6
    L9:
        ml r52 = r5.c;
        r16.println(r52);
        r52.getClass();
        r16.print(r4);
        r16.print("mFragmentId=#");
        r16.print(Integer.toHexString(r52.v));
        r16.print(" mContainerId=#");
        r16.print(Integer.toHexString(r52.w));
        r16.print(" mTag=");
        r16.println(r52.x);
        r16.print(r4);
        r16.print("mState=");
        r16.print(r52.a);
        r16.print(" mWho=");
        r16.print(r52.e);
        r16.print(" mBackStackNesting=");
        r16.println(r52.q);
        r16.print(r4);
        r16.print("mAdded=");
        r16.print(r52.k);
        r16.print(" mRemoving=");
        r16.print(r52.l);
        r16.print(" mFromLayout=");
        r16.print(r52.m);
        r16.print(" mInLayout=");
        r16.println(r52.n);
        r16.print(r4);
        r16.print("mHidden=");
        r16.print(r52.y);
        r16.print(" mDetached=");
        r16.print(r52.z);
        r16.print(" mMenuVisible=");
        r16.print(r52.B);
        r16.print(" mHasMenu=");
        r16.println(false);
        r16.print(r4);
        r16.print("mRetainInstance=");
        r16.print(r52.A);
        r16.print(" mUserVisibleHint=");
        r16.println(r52.G);
        if (r52.r == null) goto L13;
        r16.print(r4);
        r16.print("mFragmentManager=");
        r16.println(r52.r);
    L13:
        if (r52.s == null) goto L16;
        r16.print(r4);
        r16.print("mHost=");
        r16.println(r52.s);
    L16:
        if (r52.u == null) goto L19;
        r16.print(r4);
        r16.print("mParentFragment=");
        r16.println(r52.u);
    L19:
        if (r52.f == null) goto L22;
        r16.print(r4);
        r16.print("mArguments=");
        r16.println(r52.f);
    L22:
        if (r52.b == null) goto L25;
        r16.print(r4);
        r16.print("mSavedFragmentState=");
        r16.println(r52.b);
    L25:
        if (r52.c == null) goto L28;
        r16.print(r4);
        r16.print("mSavedViewState=");
        r16.println(r52.c);
    L28:
        if (r52.d == null) goto L30;
        r16.print(r4);
        r16.print("mSavedViewRegistryState=");
        r16.println(r52.d);
    L30:
        Object r7 = r52.g;
        if (r7 != null) goto L39;
        yl r72 = r52.r;
        if (r72 == null) goto L38;
        String r9 = r52.h;
        if (r9 == null) goto L38;
        r7 = r72.c.g(r9);
    L38:
        r7 = null;
    L39:
        if (r7 == null) goto L41;
        r16.print(r4);
        r16.print("mTarget=");
        r16.print(r7);
        r16.print(" mTargetRequestCode=");
        r16.println(r52.i);
    L41:
        r16.print(r4);
        r16.print("mPopDirection=");
        ll r73 = r52.H;
        if (r73 != null) goto L44;
        boolean r74 = false;
    L45:
        r16.println(r74);
        ll r75 = r52.H;
        if (r75 != null) goto L48;
        int r76 = 0;
    L49:
        if (r76 == 0) goto L55;
        r16.print(r4);
        r16.print("getEnterAnim=");
        ll r77 = r52.H;
        if (r77 != null) goto L53;
        int r78 = 0;
    L54:
        r16.println(r78);
        goto L55
    L53:
        r78 = r77.b;
    L55:
        ll r79 = r52.H;
        if (r79 != null) goto L58;
        int r710 = 0;
    L59:
        if (r710 == 0) goto L65;
        r16.print(r4);
        r16.print("getExitAnim=");
        ll r711 = r52.H;
        if (r711 != null) goto L63;
        int r712 = 0;
    L64:
        r16.println(r712);
        goto L65
    L63:
        r712 = r711.c;
    L65:
        ll r713 = r52.H;
        if (r713 != null) goto L68;
        int r714 = 0;
    L69:
        if (r714 == 0) goto L75;
        r16.print(r4);
        r16.print("getPopEnterAnim=");
        ll r715 = r52.H;
        if (r715 != null) goto L73;
        int r716 = 0;
    L74:
        r16.println(r716);
        goto L75
    L73:
        r716 = r715.d;
    L75:
        ll r717 = r52.H;
        if (r717 != null) goto L78;
        int r718 = 0;
    L79:
        if (r718 == 0) goto L86;
        r16.print(r4);
        r16.print("getPopExitAnim=");
        ll r719 = r52.H;
        if (r719 != null) goto L83;
        int r720 = 0;
    L84:
        r16.println(r720);
        goto L86
    L83:
        r720 = r719.e;
    L86:
        if (r52.D == null) goto L89;
        r16.print(r4);
        r16.print("mContainer=");
        r16.println(r52.D);
    L89:
        if (r52.E == null) goto L92;
        r16.print(r4);
        r16.print("mView=");
        r16.println(r52.E);
    L92:
        if (r52.h() == null) goto L118;
        ra0 r721 = r52.d();
        ip.o("store", r721);
        se r92 = se.b;
        ip.o("defaultCreationExtras", r92);
        String r11 = pr.class.getCanonicalName();
        if (r11 == null) goto L117;
        String r112 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r11);
        ip.o("key", r112);
        LinkedHashMap r722 = r721.a;
        pa0 r12 = (pa0) r722.get(r112);
        if (pr.class.isInstance(r12) == false) goto L98;
        ip.m("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", r12);
    L105:
        e40 r723 = ((pr) r12).c;
        if (r723.c <= 0) goto L118;
        r16.print(r4);
        r16.println("Loaders:");
        if (r723.c <= 0) goto L118;
        if (r723.b[0] != null) goto L115;
        r16.print(r4);
        r16.print("  #");
        r16.print(r723.a[0]);
        r16.print(": ");
        throw null;
    L115:
        throw new ClassCastException();
    L98:
        LinkedHashMap r10 = new LinkedHashMap();
        r10.putAll(r92.a);
        r10.put(vh.p, r112);
        pr r93 = new pr();     // Catch: AbstractMethodError -> L101
    L100:
        r12 = r93;
        pa0 r724 = (pa0) r722.put(r112, r12);
        if (r724 == null) goto L105;
        r724.a();
    L101:
        r93 = new pr();
        goto L100
    L117:
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    L118:
        r16.print(r4);
        r16.println("Child " + r52.t + ":");
        r52.t.q(z30.i(r4, "  "), r15, r16, r17);
        goto L6
    L78:
        r718 = r717.e;
        goto L79
    L68:
        r714 = r713.d;
        goto L69
    L58:
        r710 = r79.c;
        goto L59
    L48:
        r76 = r75.b;
        goto L49
    L44:
        r74 = r73.a;
    L120:
        int r24 = r3.size();
        int r42 = 0;
        if (r24 <= 0) goto L125;
        r16.print(r14);
        r16.println("Added Fragments:");
        int r53 = 0;
    L123:
        if (r53 >= r24) goto L125;
        ml r6 = (ml) r3.get(r53);
        r16.print(r14);
        r16.print("  #");
        r16.print(r53);
        r16.print(": ");
        r16.println(r6.toString());
        r53 = r53 + 1;
    L125:
        ArrayList r25 = this.e;
        if (r25 == null) goto L132;
        int r26 = r25.size();
        if (r26 <= 0) goto L132;
        r16.print(r14);
        r16.println("Fragments Created Menus:");
        int r32 = 0;
    L130:
        if (r32 >= r26) goto L132;
        ml r54 = (ml) this.e.get(r32);
        r16.print(r14);
        r16.print("  #");
        r16.print(r32);
        r16.print(": ");
        r16.println(r54.toString());
        r32 = r32 + 1;
    L132:
        ArrayList r27 = this.d;
        if (r27 == null) goto L139;
        int r28 = r27.size();
        if (r28 <= 0) goto L139;
        r16.print(r14);
        r16.println("Back Stack:");
        int r33 = 0;
    L137:
        if (r33 >= r28) goto L139;
        b7 r55 = (b7) this.d.get(r33);
        r16.print(r14);
        r16.print("  #");
        r16.print(r33);
        r16.print(": ");
        r16.println(r55.toString());
        r55.d(r1, r16, true);
        r33 = r33 + 1;
    L139:
        r16.print(r14);
        r16.println("Back Stack Index: " + this.i.get());
        ArrayList r13 = this.a;
        monitor-enter(r13);
        int r29 = this.a.size();     // Catch: Throwable -> L146
        if (r29 <= 0) goto L148;
        r16.print(r14);     // Catch: Throwable -> L146
        r16.println("Pending Actions:");     // Catch: Throwable -> L146
    L144:
        if (r42 >= r29) goto L148;
        Object r34 = (wl) this.a.get(r42);     // Catch: Throwable -> L146
        r16.print(r14);     // Catch: Throwable -> L146
        r16.print("  #");     // Catch: Throwable -> L146
        r16.print(r42);     // Catch: Throwable -> L146
        r16.print(": ");     // Catch: Throwable -> L146
        r16.println(r34);     // Catch: Throwable -> L146
        r42 = r42 + 1;     // Catch: Throwable -> L146
    L148:
        monitor-exit(r13);     // Catch: Throwable -> L146
        r16.print(r14);
        r16.println("FragmentManager misc state:");
        r16.print(r14);
        r16.print("  mHost=");
        r16.println(this.n);
        r16.print(r14);
        r16.print("  mContainer=");
        r16.println(this.o);
        if (this.p == null) goto L152;
        r16.print(r14);
        r16.print("  mParent=");
        r16.println(this.p);
    L152:
        r16.print(r14);
        r16.print("  mCurState=");
        r16.print(this.m);
        r16.print(" mStateSaved=");
        r16.print(this.y);
        r16.print(" mStopped=");
        r16.print(this.z);
        r16.print(" mDestroyed=");
        r16.println(this.A);
        if (this.x == false) goto L174;
        r16.print(r14);
        r16.print("  mNeedMenuInvalidate=");
        r16.println(this.x);
        return;
    L174:
        return;
    L146:
        th = move-exception;
        throw th;
    }

    public final void r(wl r3, boolean r4) {
        if (r4 == false) goto L4;
    L18:
        ArrayList r0 = this.a;
        monitor-enter(r0);
    L25:
        th = move-exception;
        throw th;
    L21:
        if (this.n != null) goto L29;
        if (r4 == false) goto L28;
        monitor-exit(r0);     // Catch: Throwable -> L25
        return;
    L28:
        throw new IllegalStateException("Activity has been destroyed");     // Catch: Throwable -> L25
    L29:
        this.a.add(r3);     // Catch: Throwable -> L25
        M();     // Catch: Throwable -> L25
        monitor-exit(r0);     // Catch: Throwable -> L25
        return;
    L4:
        if (this.n != null) goto L12;
        if (this.A == false) goto L10;
        throw new IllegalStateException("FragmentManager has been destroyed");
    L10:
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    L12:
        if (this.y == true) goto L17;
        if (this.z == false) goto L18;
    L17:
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public final void s(boolean r3) {
        if (this.b == true) goto L30;
        if (this.n != null) goto L13;
        if (this.A == false) goto L11;
        throw new IllegalStateException("FragmentManager has been destroyed");
    L11:
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    L13:
        if (Looper.myLooper() != this.n.E.getLooper()) goto L28;
        if (r3 == true) goto L23;
        if (this.y == true) goto L21;
        if (this.z == false) goto L23;
    L21:
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    L23:
        if (this.C != null) goto L25;
        this.C = new ArrayList();
        this.D = new ArrayList();
    L25:
        this.b = false;
        return;
    L28:
        throw new IllegalStateException("Must be called from main thread of fragment host");
    L30:
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final boolean t(boolean r9) {
        s(r9);
        boolean r0 = false;
    L3:
        ArrayList r1 = this.C;
        ArrayList r2 = this.D;
        ArrayList r3 = this.a;
        monitor-enter(r3);
        if (this.a.isEmpty() == false) goto L11;
        monitor-exit(r3);     // Catch: Throwable -> L9
        boolean r6 = false;
    L16:
        if (r6 == false) goto L23;
        r0 = true;
        this.b = true;
        J(this.C, this.D);     // Catch: Throwable -> L20
        d();
    L20:
        th = move-exception;
        d();
        throw th;
    L23:
        T();
        if (this.B == false) goto L26;
        this.B = false;
        S();
    L26:
        ((HashMap) this.c.b).values().removeAll(Collections.singleton(null));
        return r0;
    L11:
        int r4 = this.a.size();     // Catch: Throwable -> L9
        int r5 = 0;
        r6 = false;
    L12:
        if (r5 >= r4) goto L14;
        r6 = r6 | ((wl) this.a.get(r5)).a(r1, r2);     // Catch: Throwable -> L9
        r5 = r5 + 1;     // Catch: Throwable -> L9
        goto L12
    L14:
        this.a.clear();     // Catch: Throwable -> L9
        this.n.E.removeCallbacks(this.G);     // Catch: Throwable -> L9
        monitor-exit(r3);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(128);
        r0.append("FragmentManager{");
        r0.append(Integer.toHexString(System.identityHashCode(this)));
        r0.append(" in ");
        ml r1 = this.p;
        if (r1 == null) goto L5;
        r0.append(r1.getClass().getSimpleName());
        r0.append("{");
        r0.append(Integer.toHexString(System.identityHashCode(this.p)));
        r0.append("}");
    L9:
        r0.append("}}");
        return r0.toString();
    L5:
        nl r12 = this.n;
        if (r12 == null) goto L8;
        r0.append(r12.getClass().getSimpleName());
        r0.append("{");
        r0.append(Integer.toHexString(System.identityHashCode(this.n)));
        r0.append("}");
        goto L9
    L8:
        r0.append("null");
        goto L9
    }

    public final void u(ArrayList r23, ArrayList r24, int r25, int r26) {
        r5 r4 = this.c;
        boolean r6 = ((b7) r23.get(r25)).o;
        ArrayList r7 = this.E;
        if (r7 != null) goto L5;
        this.E = new ArrayList();
    L6:
        this.E.addAll(r4.p());
        ml r72 = this.q;
        int r9 = r25;
        boolean r10 = false;
    L7:
        int r11 = 1;
        if (r9 >= r26) goto L75;
        b7 r12 = (b7) r23.get(r9);
        if (((Boolean) r24.get(r9)).booleanValue() == true) goto L53;
        ArrayList r13 = this.E;
        ArrayList r8 = r12.a;
        int r15 = 0;
    L13:
        if (r15 >= r8.size()) goto L52;
        em r14 = (em) r8.get(r15);
        int r5 = r14.a;
        if (r5 == r11) goto L49;
        int r16 = r11;
        boolean r17 = r6;
        if (r5 != 2) goto L19;
        ml r52 = r14.b;
        int r112 = r52.w;
        int r62 = r13.size() - 1;
        int r18 = 0;
    L36:
        if (r62 < 0) goto L45;
        int r20 = r62;
        ml r63 = (ml) r13.get(r62);
        int r19 = r9;
        if (r63.w != r112) goto L44;
        if (r63 != r52) goto L41;
        r18 = r16;
        goto L44
    L41:
        if (r63 != r72) goto L43;
        r8.add(r15, new em(9, r63));
        r15 = r15 + 1;
        r72 = null;
    L43:
        em r92 = new em(3, r63);
        r92.c = r14.c;
        r92.e = r14.e;
        r92.d = r14.d;
        r92.f = r14.f;
        r8.add(r15, r92);
        r13.remove(r63);
        r15 = r15 + 1;
        r72 = r72;
    L44:
        r62 = r20 - 1;
        r9 = r19;
        goto L36
    L45:
        int r192 = r9;
        if (r18 == 0) goto L48;
        r8.remove(r15);
        r15 = r15 - 1;
    L29:
        int r64 = r16;
    L51:
        r15 = r15 + r64;
        r11 = r64;
        r6 = r17;
        r9 = r192;
        goto L13
    L48:
        r64 = r16;
        r14.a = r64;
        r13.add(r52);
        goto L51
    L19:
        if (r5 != 3) goto L21;
    L32:
        r13.remove(r14.b);
        ml r53 = r14.b;
        if (r53 == r72) goto L34;
    L28:
        r192 = r9;
        goto L29
    L34:
        r8.add(r15, new em(9, r53));
        r15 = r15 + 1;
        r192 = r9;
        r64 = r16;
        r72 = null;
        goto L51
    L21:
        if (r5 == 6) goto L32;
        if (r5 != 7) goto L25;
        r64 = r16;
    L31:
        r192 = r9;
        r13.add(r14.b);
        goto L51
    L25:
        if (r5 != 8) goto L28;
        r8.add(r15, new em(9, r72));
        r15 = r15 + 1;
        r72 = r14.b;
        goto L28
    L49:
        r17 = r6;
        r64 = r11;
        goto L31
    L52:
        boolean r172 = r6;
        int r193 = r9;
    L68:
        if (r10 == false) goto L70;
    L73:
        r10 = true;
    L74:
        r9 = r193 + 1;
        r6 = r172;
        goto L7
    L70:
        if (r12.g == true) goto L73;
        r10 = false;
        goto L74
    L53:
        r172 = r6;
        r193 = r9;
        int r65 = 1;
        ArrayList r54 = this.E;
        ArrayList r82 = r12.a;
        int r93 = r82.size() - 1;
    L54:
        if (r93 < 0) goto L68;
        em r113 = (em) r82.get(r93);
        int r132 = r113.a;
        if (r132 == r65) goto L66;
        if (r132 == 3) goto L64;
        switch(r132) {
            case 6: goto L64;
            case 7: goto L66;
            case 8: goto L63;
            case 9: goto L62;
            case 10: goto L61;
            default: goto L67;
        };
    L61:
        r113.h = r113.g;
        goto L67
    L62:
        r72 = r113.b;
        goto L67
    L63:
        r72 = null;
    L67:
        r93 = r93 - 1;
        r65 = 1;
    L64:
        r54.add(r113.b);
    L66:
        r54.remove(r113.b);
        goto L67
    L75:
        boolean r173 = r6;
        this.E.clear();
        if (r173 == false) goto L78;
    L89:
        int r42 = r25;
    L91:
        if (r42 >= r26) goto L159;
        b7 r66 = (b7) r23.get(r42);
        if (((Boolean) r24.get(r42)).booleanValue() == false) goto L130;
        r66.c(-1);
        yl r55 = r66.p;
        ArrayList r73 = r66.a;
        int r83 = r73.size() - 1;
    L95:
        if (r83 < 0) goto L158;
        em r102 = (em) r73.get(r83);
        ml r114 = r102.b;
        if (r114 == null) goto L117;
        if (r114.H == null) goto L102;
        r114.f().a = true;
    L102:
        int r122 = r66.f;
        int r133 = 8194;
        if (r122 == 4097) goto L111;
        if (r122 == 4099) goto L109;
        if (r122 == 8194) goto L108;
        r133 = 0;
        goto L111
    L108:
        r133 = 4097;
        goto L111
    L109:
        r133 = 4099;
    L111:
        if (r114.H != null) goto L114;
        if (r133 != 0) goto L114;
    L115:
        r114.f();
        r114.H.getClass();
    L114:
        r114.f();
        r114.H.f = r133;
    L117:
        switch(r102.a) {
            case 1: goto L128;
            case 2: goto L119;
            case 3: goto L127;
            case 4: goto L126;
            case 5: goto L125;
            case 6: goto L124;
            case 7: goto L123;
            case 8: goto L122;
            case 9: goto L121;
            case 10: goto L120;
            default: goto L119;
        };
    L120:
        r55.O(r114, r102.g);
    L129:
        r83 = r83 - 1;
        goto L95
    L121:
        r55.P(r114);
        goto L129
    L122:
        r55.P(null);
        goto L129
    L123:
        r114.B(r102.c, r102.d, r102.e, r102.f);
        r55.N(r114, true);
        r55.g(r114);
        goto L129
    L124:
        r114.B(r102.c, r102.d, r102.e, r102.f);
        r55.c(r114);
        goto L129
    L125:
        r114.B(r102.c, r102.d, r102.e, r102.f);
        r55.N(r114, true);
        r55.z(r114);
        goto L129
    L126:
        r114.B(r102.c, r102.d, r102.e, r102.f);
        r55.getClass();
        R(r114);
        goto L129
    L127:
        r114.B(r102.c, r102.d, r102.e, r102.f);
        r55.a(r114);
        goto L129
    L128:
        r114.B(r102.c, r102.d, r102.e, r102.f);
        r55.N(r114, true);
        r55.I(r114);
        goto L129
    L119:
        throw new IllegalArgumentException("Unknown cmd: " + r102.a);
    L158:
        r42 = r42 + 1;
        goto L91
    L130:
        r66.c(1);
        yl r56 = r66.p;
        ArrayList r74 = r66.a;
        int r84 = r74.size();
        int r103 = 0;
    L131:
        if (r103 >= r84) goto L158;
        em r115 = (em) r74.get(r103);
        ml r123 = r115.b;
        if (r123 == null) goto L145;
        if (r123.H == null) goto L138;
        r123.f().a = false;
    L138:
        int r134 = r66.f;
        if (r123.H != null) goto L142;
        if (r134 != 0) goto L142;
    L143:
        r123.f();
        r123.H.getClass();
    L142:
        r123.f();
        r123.H.f = r134;
    L145:
        switch(r115.a) {
            case 1: goto L156;
            case 2: goto L147;
            case 3: goto L155;
            case 4: goto L154;
            case 5: goto L153;
            case 6: goto L152;
            case 7: goto L151;
            case 8: goto L150;
            case 9: goto L149;
            case 10: goto L148;
            default: goto L147;
        };
    L148:
        r56.O(r123, r115.h);
    L157:
        r103 = r103 + 1;
        goto L131
    L149:
        r56.P(null);
        goto L157
    L150:
        r56.P(r123);
        goto L157
    L151:
        r123.B(r115.c, r115.d, r115.e, r115.f);
        r56.N(r123, false);
        r56.c(r123);
        goto L157
    L152:
        r123.B(r115.c, r115.d, r115.e, r115.f);
        r56.g(r123);
        goto L157
    L153:
        r123.B(r115.c, r115.d, r115.e, r115.f);
        r56.N(r123, false);
        R(r123);
        goto L157
    L154:
        r123.B(r115.c, r115.d, r115.e, r115.f);
        r56.z(r123);
        goto L157
    L155:
        r123.B(r115.c, r115.d, r115.e, r115.f);
        r56.I(r123);
        goto L157
    L156:
        r123.B(r115.c, r115.d, r115.e, r115.f);
        r56.N(r123, false);
        r56.a(r123);
        goto L157
    L147:
        throw new IllegalArgumentException("Unknown cmd: " + r115.a);
    L159:
        boolean r43 = ((Boolean) r24.get(r26 - 1)).booleanValue();
        int r67 = r25;
    L160:
        if (r67 >= r26) goto L175;
        b7 r75 = (b7) r23.get(r67);
        if (r43 == false) goto L169;
        int r85 = r75.a.size() - 1;
    L164:
        if (r85 < 0) goto L174;
        ml r94 = ((em) r75.a.get(r85)).b;
        if (r94 == null) goto L168;
        f(r94).k();
    L168:
        r85 = r85 - 1;
    L174:
        r67 = r67 + 1;
        goto L160
    L169:
        ArrayList r76 = r75.a;
        int r86 = r76.size();
        int r95 = 0;
    L170:
        if (r95 >= r86) goto L174;
        Object r104 = r76.get(r95);
        r95 = r95 + 1;
        ml r105 = ((em) r104).b;
        if (r105 == null) goto L170;
        f(r105).k();
        goto L170
    L175:
        E(this.m, true);
        HashSet r68 = new HashSet();
        int r77 = r25;
    L176:
        if (r77 >= r26) goto L185;
        ArrayList r87 = ((b7) r23.get(r77)).a;
        int r96 = r87.size();
        int r106 = 0;
    L178:
        if (r106 >= r96) goto L184;
        Object r116 = r87.get(r106);
        r106 = r106 + 1;
        ml r117 = ((em) r116).b;
        if (r117 == null) goto L178;
        ViewGroup r118 = r117.D;
        if (r118 == null) goto L178;
        r68.add(cg.f(r118, y()));
        goto L178
    L184:
        r77 = r77 + 1;
        goto L176
    L185:
        Iterator r69 = r68.iterator();
    L187:
        if (r69.hasNext() == false) goto L203;
        cg r78 = (cg) r69.next();
        r78.d = r43;
        ArrayList r88 = r78.b;
        monitor-enter(r88);
        r78.g();     // Catch: Throwable -> L196
        r78.e = false;     // Catch: Throwable -> L196
        int r107 = r78.b.size() - 1;
    L191:
        if (r107 < 0) goto L199;
        g40 r119 = (g40) r78.b.get(r107);     // Catch: Throwable -> L196
        int r124 = z30.c(r119.c.E);     // Catch: Throwable -> L196
        if (r119.a != 2) goto L198;
        if (r124 == 2) goto L198;
        r119.c.getClass();     // Catch: Throwable -> L196
        r78.e = false;     // Catch: Throwable -> L196
    L198:
        r107 = r107 - 1;
    L199:
        monitor-exit(r88);     // Catch: Throwable -> L196
        r78.c();
    L196:
        th = move-exception;
        throw th;
    L203:
        int r44 = r25;
    L204:
        if (r44 >= r26) goto L211;
        b7 r610 = (b7) r23.get(r44);
        if (((Boolean) r24.get(r44)).booleanValue() == false) goto L210;
        if (r610.r < 0) goto L210;
        r610.r = -1;
    L210:
        r610.getClass();
        r44 = r44 + 1;
        goto L204
    L211:
        return;
    L78:
        if (this.m < 1) goto L89;
        int r57 = r25;
    L80:
        if (r57 >= r26) goto L89;
        ArrayList r611 = ((b7) r23.get(r57)).a;
        int r79 = r611.size();
        int r89 = 0;
    L82:
        if (r89 >= r79) goto L88;
        Object r97 = r611.get(r89);
        r89 = r89 + 1;
        ml r98 = ((em) r97).b;
        if (r98 == null) goto L82;
        if (r98.r == null) goto L82;
        r4.v(f(r98));
        goto L82
    L88:
        r57 = r57 + 1;
        goto L80
    L5:
        r7.clear();
        goto L6
    }

    public final ml v(int r6) {
        r5 r0 = this.c;
        ArrayList r1 = (ArrayList) r0.c;
        int r2 = r1.size() - 1;
    L3:
        if (r2 < 0) goto L10;
        ml r3 = (ml) r1.get(r2);
        if (r3 == null) goto L9;
        if (r3.v != r6) goto L9;
        return r3;
    L9:
        r2 = r2 - 1;
        goto L3
    L10:
        Iterator r02 = ((HashMap) r0.b).values().iterator();
    L12:
        if (r02.hasNext() == false) goto L18;
        androidx.fragment.app.a r12 = (androidx.fragment.app.a) r02.next();
        if (r12 == null) goto L12;
        ml r13 = r12.c;
        if (r13.v != r6) goto L12;
        return r13;
    L18:
        return null;
    }

    public final ViewGroup w(ml r2) {
        ViewGroup r0 = r2.D;
        if (r0 == null) goto L6;
        return r0;
    L6:
        if (r2.w > 0) goto L9;
        return null;
    L9:
        if (this.o.H() == false) goto L14;
        View r22 = this.o.G(r2.w);
        if ((r22 instanceof ViewGroup) == true) goto L13;
        return null;
    L13:
        return (ViewGroup) r22;
    L14:
        return null;
    }

    public final tl x() {
        ml r0 = this.p;
        if (r0 == null) goto L7;
        return r0.r.x();
    L7:
        return this.r;
    }

    public final vh y() {
        ml r0 = this.p;
        if (r0 == null) goto L7;
        return r0.r.y();
    L7:
        return this.s;
    }

    public final void z(ml r3) {
        if (A(2) == false) goto L6;
        Log.v("FragmentManager", "hide: " + r3);
    L6:
        if (r3.y == true) goto L9;
        r3.y = true;
        r3.I = true ^ r3.I;
        Q(r3);
        return;
    }
}
