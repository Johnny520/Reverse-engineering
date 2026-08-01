package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ljx.wechatmod.R;
import defpackage.am;
import defpackage.bm;
import defpackage.cg;
import defpackage.cm;
import defpackage.d4;
import defpackage.dm;
import defpackage.e40;
import defpackage.f50;
import defpackage.fm;
import defpackage.g40;
import defpackage.gm;
import defpackage.ip;
import defpackage.iq;
import defpackage.ja0;
import defpackage.jq;
import defpackage.ll;
import defpackage.ml;
import defpackage.nl;
import defpackage.pa0;
import defpackage.pr;
import defpackage.r5;
import defpackage.ra0;
import defpackage.se;
import defpackage.tl;
import defpackage.v90;
import defpackage.vh;
import defpackage.w90;
import defpackage.yl;
import defpackage.z30;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final d4 a;
    public final r5 b;
    public final ml c;
    public boolean d;
    public int e;

    public a(d4 r2, r5 r3, ml r4) {
        this.d = false;
        this.e = -1;
        this.a = r2;
        this.b = r3;
        this.c = r4;
    }

    public final void a() {
        boolean r1 = yl.A(3);
        ml r3 = this.c;
        if (r1 == false) goto L5;
        Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + r3);
    L5:
        Bundle r12 = r3.b;
        r3.t.F();
        r3.a = 3;
        r3.C = true;
        if (yl.A(3) == false) goto L8;
        Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + r3);
    L8:
        View r0 = r3.E;
        if (r0 == null) goto L23;
        Bundle r4 = r3.b;
        SparseArray<Parcelable> r5 = r3.c;
        if (r5 == null) goto L14;
        r0.restoreHierarchyState(r5);
        r3.c = null;
    L14:
        if (r3.E == null) goto L16;
        fm r02 = r3.M;
        r02.c.b(r3.d);
        r3.d = null;
    L16:
        r3.C = false;
        r3.u(r4);
        if (r3.C == false) goto L22;
        if (r3.E == null) goto L23;
        r3.M.c(iq.ON_CREATE);
        goto L23
    L22:
        throw new f50("Fragment " + r3 + " did not call through to super.onViewStateRestored()");
    L23:
        r3.b = null;
        yl r03 = r3.t;
        r03.y = false;
        r03.z = false;
        r03.F.h = false;
        r03.p(4);
        this.a.c(false);
    }

    public final void b() {
        ArrayList r0 = (ArrayList) this.b.c;
        ml r1 = this.c;
        ViewGroup r2 = r1.D;
        int r3 = -1;
        if (r2 == null) goto L21;
        int r4 = r0.indexOf(r1);
        int r5 = r4 - 1;
    L6:
        if (r5 < 0) goto L13;
        ml r6 = (ml) r0.get(r5);
        if (r6.D != r2) goto L12;
        View r62 = r6.E;
        if (r62 == null) goto L12;
        r3 = r2.indexOfChild(r62) + 1;
    L12:
        r5 = r5 - 1;
    L13:
        r4 = r4 + 1;
        if (r4 >= r0.size()) goto L21;
        ml r52 = (ml) r0.get(r4);
        if (r52.D != r2) goto L13;
        View r53 = r52.E;
        if (r53 == null) goto L13;
        r3 = r2.indexOfChild(r53);
    L21:
        r1.D.addView(r1.E, r3);
    }

    public final void c() {
        boolean r0 = yl.A(3);
        ml r1 = this.c;
        if (r0 == false) goto L5;
        Log.d("FragmentManager", "moveto ATTACHED: " + r1);
    L5:
        ml r02 = r1.g;
        r5 r4 = this.b;
        a r5 = null;
        if (r02 == null) goto L12;
        a r03 = (a) ((HashMap) r4.b).get(r02.e);
        if (r03 == null) goto L11;
        r1.h = r1.g.e;
        r1.g = null;
        r5 = r03;
    L19:
        if (r5 == null) goto L21;
        r5.k();
    L21:
        yl r04 = r1.r;
        r1.s = r04.n;
        r1.u = r04.p;
        d4 r05 = this.a;
        r05.j(false);
        ArrayList r3 = r1.P;
        Iterator r42 = r3.iterator();
        if (r42.hasNext() == true) goto L34;
        r3.clear();
        r1.t.b(r1.s, r1.c(), r1);
        r1.a = 0;
        r1.C = false;
        r1.l(r1.s.D);
        if (r1.C == false) goto L32;
        Iterator r32 = r1.r.l.iterator();
    L27:
        if (r32.hasNext() == false) goto L29;
        ((bm) r32.next()).a();
        goto L27
    L29:
        yl r12 = r1.t;
        r12.y = false;
        r12.z = false;
        r12.F.h = false;
        r12.p(0);
        r05.e(false);
        return;
    L32:
        throw new f50("Fragment " + r1 + " did not call through to super.onAttach()");
    L34:
        throw z30.h(r42);
    L11:
        throw new IllegalStateException("Fragment " + r1 + " declared target fragment " + r1.g + " that does not belong to this FragmentManager!");
    L12:
        String r06 = r1.h;
        if (r06 == null) goto L19;
        r5 = (a) ((HashMap) r4.b).get(r06);
        if (r5 != null) goto L19;
        StringBuilder r43 = new StringBuilder("Fragment ");
        r43.append(r1);
        r43.append(" declared target fragment ");
        throw new IllegalStateException(z30.l(r43, r1.h, " that does not belong to this FragmentManager!"));
    }

    public final int d() {
        ml r0 = this.c;
        if (r0.r == null) goto L5;
        int r1 = this.e;
        int r2 = r0.K.ordinal();
        int r3 = 0;
        if (r2 == 1) goto L14;
        if (r2 == 2) goto L13;
        if (r2 == 3) goto L12;
        if (r2 == 4) goto L16;
        r1 = Math.min(r1, -1);
    L16:
        if (r0.m == false) goto L29;
        if (r0.n == false) goto L25;
        r1 = Math.max(this.e, 2);
        View r22 = r0.E;
        if (r22 == null) goto L29;
        if (r22.getParent() != null) goto L29;
        r1 = Math.min(r1, 2);
        goto L29
    L25:
        if (this.e >= 4) goto L27;
        r1 = Math.min(r1, r0.a);
        goto L29
    L27:
        r1 = Math.min(r1, 1);
    L29:
        if (r0.k == true) goto L31;
        r1 = Math.min(r1, 1);
    L31:
        ViewGroup r23 = r0.D;
        if (r23 == null) goto L50;
        cg r24 = cg.f(r23, r0.j().y());
        g40 r10 = r24.d(r0);
        if (r10 == null) goto L36;
        int r102 = r10.b;
    L37:
        ArrayList r25 = r24.c;
        int r11 = r25.size();
    L38:
        if (r3 >= r11) goto L44;
        Object r12 = r25.get(r3);
        r3 = r3 + 1;
        g40 r122 = (g40) r12;
        if (r122.c.equals(r0) == false) goto L38;
        if (r122.f == true) goto L38;
    L45:
        if (r122 == null) goto L49;
        if (r102 == 0) goto L48;
        if (r102 != 1) goto L49;
    L48:
        r3 = r122.b;
    L49:
        r3 = r102;
        goto L50
    L44:
        r122 = null;
        goto L45
    L36:
        r102 = 0;
    L50:
        if (r3 != 2) goto L52;
        r1 = Math.min(r1, 6);
    L61:
        if (r0.F == false) goto L66;
        if (r0.a >= 5) goto L66;
        r1 = Math.min(r1, 4);
    L66:
        if (yl.A(2) == false) goto L68;
        Log.v("FragmentManager", "computeExpectedState() of " + r1 + " for " + r0);
    L68:
        return r1;
    L52:
        if (r3 != 3) goto L55;
        r1 = Math.max(r1, 3);
        goto L61
    L55:
        if (r0.l == false) goto L61;
        if (r0.q <= 0) goto L59;
        r1 = Math.min(r1, 1);
        goto L61
    L59:
        r1 = Math.min(r1, -1);
        goto L61
    L12:
        r1 = Math.min(r1, 5);
        goto L16
    L13:
        r1 = Math.min(r1, 1);
        goto L16
    L14:
        r1 = Math.min(r1, 0);
        goto L16
    L5:
        return r0.a;
    }

    public final void e() {
        boolean r0 = yl.A(3);
        final ml r1 = this.c;
        if (r0 == false) goto L6;
        Log.d("FragmentManager", "moveto CREATED: " + r1);
    L6:
        if (r1.J == true) goto L13;
        d4 r02 = this.a;
        r02.k(false);
        Bundle r4 = r1.b;
        r1.t.F();
        r1.a = 1;
        r1.C = false;
        r1.L.a(new Fragment$5(r1));
        r1.O.b(r4);
        r1.m(r4);
        r1.J = true;
        if (r1.C == false) goto L12;
        r1.L.d(iq.ON_CREATE);
        r02.f(false);
        return;
    L12:
        throw new f50("Fragment " + r1 + " did not call through to super.onCreate()");
    L13:
        Bundle r03 = r1.b;
        if (r03 == null) goto L18;
        Parcelable r04 = r03.getParcelable("android:support:fragments");
        if (r04 == null) goto L18;
        r1.t.K(r04);
        yl r05 = r1.t;
        r05.y = false;
        r05.z = false;
        r05.F.h = false;
        r05.p(1);
    L18:
        r1.a = 1;
    }

    public final void f() {
        ml r0 = this.c;
        if (r0.m == false) goto L6;
        return;
    L6:
        if (yl.A(3) == false) goto L8;
        Log.d("FragmentManager", "moveto CREATE_VIEW: " + r0);
    L8:
        LayoutInflater r1 = r0.q(r0.b);
        ViewGroup r3 = r0.D;
        if (r3 != null) goto L28;
        int r32 = r0.w;
        if (r32 != 0) goto L14;
        r3 = null;
        goto L28
    L14:
        if (r32 == (-1)) goto L26;
        r3 = (ViewGroup) r0.r.o.G(r32);
        if (r3 != null) goto L28;
        if (r0.o == true) goto L28;
        String r12 = r0.z().getResources().getResourceName(r0.w);     // Catch: Resources.NotFoundException -> L22
    L24:
        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(r0.w) + " (" + r12 + ") for fragment " + r0);
    L22:
        r12 = "unknown";
        goto L24
    L26:
        throw new IllegalArgumentException("Cannot create fragment " + r0 + " for a container view with no id");
    L28:
        r0.D = r3;
        r0.v(r1, r3, r0.b);
        View r13 = r0.E;
        if (r13 == null) goto L49;
        int r5 = 0;
        r13.setSaveFromParentEnabled(false);
        r0.E.setTag(R.id.fragment_container_view_tag, r0);
        if (r3 == null) goto L34;
        b();
    L34:
        if (r0.y == false) goto L36;
        r0.E.setVisibility(8);
    L36:
        View r14 = r0.E;
        WeakHashMap r33 = ja0.a;
        if (v90.b(r14) == false) goto L39;
        w90.c(r0.E);
    L40:
        r0.t.p(2);
        this.a.p(false);
        int r15 = r0.E.getVisibility();
        r0.f().j = r0.E.getAlpha();
        if (r0.D == null) goto L49;
        if (r15 != 0) goto L49;
        View r16 = r0.E.findFocus();
        if (r16 == null) goto L48;
        r0.f().k = r16;
        if (yl.A(2) == false) goto L48;
        Log.v("FragmentManager", "requestFocus: Saved focused view " + r16 + " for Fragment " + r0);
    L48:
        r0.E.setAlpha(0.0f);
        goto L49
    L39:
        View r17 = r0.E;
        r17.addOnAttachStateChangeListener(new dm(r17, r5));
    L49:
        r0.a = 2;
    }

    public final void g() {
        boolean r1 = yl.A(3);
        ml r3 = this.c;
        if (r1 == false) goto L5;
        Log.d("FragmentManager", "movefrom CREATED: " + r3);
    L5:
        int r4 = 0;
        if (r3.l == true) goto L8;
    L11:
        boolean r12 = false;
    L12:
        r5 r6 = this.b;
        if (r12 == true) goto L32;
        am r7 = (am) r6.d;
        if (r7.c.containsKey(r3.e) == true) goto L18;
    L20:
        boolean r72 = true;
    L21:
        if (r72 == true) goto L32;
        String r0 = r3.h;
        if (r0 == null) goto L30;
        ml r02 = r6.g(r0);
        if (r02 == null) goto L30;
        if (r02.A == false) goto L30;
        r3.g = r02;
    L30:
        r3.a = 0;
        return;
    L18:
        if (r7.f == false) goto L20;
        r72 = r7.g;
    L32:
        nl r73 = r3.s;
        if (r73 == null) goto L35;
        boolean r74 = ((am) r6.d).g;
    L39:
        if (r12 == true) goto L41;
        if (r74 == true) goto L41;
    L50:
        r3.t.k();
        r3.L.d(iq.ON_DESTROY);
        r3.a = 0;
        r3.J = false;
        r3.C = true;
        this.a.g(false);
        ArrayList r03 = r6.i();
        int r13 = r03.size();
    L51:
        if (r4 >= r13) goto L57;
        Object r2 = r03.get(r4);
        r4 = r4 + 1;
        a r22 = (a) r2;
        if (r22 == null) goto L51;
        ml r23 = r22.c;
        if (r3.e.equals(r23.h) == false) goto L51;
        r23.g = r3;
        r23.h = null;
        goto L51
    L57:
        String r04 = r3.h;
        if (r04 == null) goto L60;
        r3.g = r6.g(r04);
    L60:
        r6.w(this);
        return;
    L41:
        am r14 = (am) r6.d;
        HashMap r75 = r14.e;
        HashMap r15 = r14.d;
        if (yl.A(3) == false) goto L44;
        Log.d("FragmentManager", "Clearing non-config state for " + r3);
    L44:
        am r05 = (am) r15.get(r3.e);
        if (r05 == null) goto L47;
        r05.a();
        r15.remove(r3.e);
    L47:
        ra0 r06 = (ra0) r75.get(r3.e);
        if (r06 == null) goto L50;
        r06.a();
        r75.remove(r3.e);
        goto L50
    L35:
        FragmentActivity r76 = r73.D;
        if (r76 == null) goto L38;
        r74 = !r76.isChangingConfigurations();
        goto L39
    L38:
        r74 = true;
        goto L39
    L8:
        if (r3.q > 0) goto L11;
        r12 = true;
        goto L12
    }

    public final void h() {
        boolean r0 = yl.A(3);
        ml r1 = this.c;
        if (r0 == false) goto L5;
        Log.d("FragmentManager", "movefrom CREATE_VIEW: " + r1);
    L5:
        ViewGroup r02 = r1.D;
        if (r02 == null) goto L10;
        View r2 = r1.E;
        if (r2 == null) goto L10;
        r02.removeView(r2);
    L10:
        r1.t.p(1);
        if (r1.E == null) goto L15;
        fm r03 = r1.M;
        r03.f();
        if (r03.b.c.compareTo(jq.c) < 0) goto L15;
        r1.M.c(iq.ON_DESTROY);
    L15:
        r1.a = 1;
        r1.C = false;
        r1.o();
        if (r1.C == false) goto L38;
        ra0 r22 = r1.d();
        ip.o("store", r22);
        se r3 = se.b;
        ip.o("defaultCreationExtras", r3);
        String r5 = pr.class.getCanonicalName();
        if (r5 == null) goto L36;
        String r52 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(r5);
        ip.o("key", r52);
        LinkedHashMap r23 = r22.a;
        pa0 r6 = (pa0) r23.get(r52);
        if (pr.class.isInstance(r6) == false) goto L22;
        ip.m("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get", r6);
    L29:
        e40 r24 = ((pr) r6).c;
        if (r24.c > 0) goto L33;
        r1.p = false;
        this.a.q(false);
        r1.D = null;
        r1.E = null;
        r1.M = null;
        r1.N.e(null);
        r1.n = false;
        return;
    L33:
        r24.b[0].getClass();
        throw new ClassCastException();
    L22:
        LinkedHashMap r4 = new LinkedHashMap();
        r4.putAll(r3.a);
        r4.put(vh.p, r52);
        pr r32 = new pr();     // Catch: AbstractMethodError -> L25
    L24:
        r6 = r32;
        pa0 r25 = (pa0) r23.put(r52, r6);
        if (r25 == null) goto L29;
        r25.a();
    L25:
        r32 = new pr();
        goto L24
    L36:
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    L38:
        throw new f50("Fragment " + r1 + " did not call through to super.onDestroyView()");
    }

    public final void i() {
        boolean r1 = yl.A(3);
        ml r3 = this.c;
        if (r1 == false) goto L5;
        Log.d("FragmentManager", "movefrom ATTACHED: " + r3);
    L5:
        r3.a = -1;
        r3.C = false;
        r3.p();
        if (r3.C == false) goto L28;
        yl r5 = r3.t;
        if (r5.A == true) goto L10;
        r5.k();
        r3.t = new yl();
    L10:
        this.a.h(false);
        r3.a = -1;
        r3.s = null;
        r3.u = null;
        r3.r = null;
        if (r3.l == true) goto L13;
    L14:
        am r52 = (am) this.b.d;
        if (r52.c.containsKey(r3.e) == true) goto L18;
    L20:
        boolean r53 = true;
    L21:
        if (r53 == true) goto L23;
        return;
    L23:
        if (yl.A(3) == false) goto L25;
        Log.d("FragmentManager", "initState called for fragment: " + r3);
    L25:
        r3.L = new androidx.lifecycle.a(r3);
        r3.O = new gm(r3);
        r3.e = UUID.randomUUID().toString();
        r3.k = false;
        r3.l = false;
        r3.m = false;
        r3.n = false;
        r3.o = false;
        r3.q = 0;
        r3.r = null;
        r3.t = new yl();
        r3.s = null;
        r3.v = 0;
        r3.w = 0;
        r3.x = null;
        r3.y = false;
        r3.z = false;
        return;
    L18:
        if (r52.f == false) goto L20;
        r53 = r52.g;
        goto L21
    L13:
        if (r3.q <= 0) goto L23;
    L28:
        throw new f50("Fragment " + r3 + " did not call through to super.onDetach()");
    }

    public final void j() {
        ml r0 = this.c;
        if (r0.m == true) goto L5;
        return;
    L5:
        if (r0.n == true) goto L7;
        return;
    L7:
        if (r0.p == false) goto L9;
        return;
    L9:
        if (yl.A(3) == false) goto L11;
        Log.d("FragmentManager", "moveto CREATE_VIEW: " + r0);
    L11:
        r0.v(r0.q(r0.b), null, r0.b);
        View r1 = r0.E;
        if (r1 == null) goto L21;
        r1.setSaveFromParentEnabled(false);
        r0.E.setTag(R.id.fragment_container_view_tag, r0);
        if (r0.y == false) goto L16;
        r0.E.setVisibility(8);
    L16:
        r0.t.p(2);
        this.a.p(false);
        r0.a = 2;
        return;
    }

    public final void k() {
        boolean r0 = this.d;
        ml r3 = this.c;
        if (r0 == false) goto L89;
        if (yl.A(2) == false) goto L131;
        Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + r3);
        return;
    L131:
        return;
    L89:
        this.d = true;     // Catch: Throwable -> L17
    L10:
        int r5 = d();     // Catch: Throwable -> L17
        int r6 = r3.a;     // Catch: Throwable -> L17
        if (r5 == r6) goto L62;
        if (r5 > r6) goto L14;
        switch((r6 - 1)) {
            case -1: goto L60;
            case 0: goto L59;
            case 1: goto L58;
            case 2: goto L57;
            case 3: goto L41;
            case 4: goto L39;
            case 5: goto L38;
            case 6: goto L37;
            default: goto L10;
        };     // Catch: Throwable -> L17
    L37:
        l();     // Catch: Throwable -> L17
        goto L10
    L38:
        r3.a = 5;     // Catch: Throwable -> L17
        goto L10
    L39:
        q();     // Catch: Throwable -> L17
        goto L10
    L41:
        if (yl.A(3) == false) goto L44;
        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + r3);     // Catch: Throwable -> L17
    L44:
        if (r3.E == null) goto L49;
        if (r3.c != null) goto L49;
        o();     // Catch: Throwable -> L17
    L49:
        if (r3.E == null) goto L56;
        ViewGroup r52 = r3.D;     // Catch: Throwable -> L17
        if (r52 == null) goto L56;
        cg r53 = cg.f(r52, r3.j().y());     // Catch: Throwable -> L17
        if (yl.A(2) == false) goto L55;
        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + r3);     // Catch: Throwable -> L17
    L55:
        r53.a(1, 3, this);     // Catch: Throwable -> L17
    L56:
        r3.a = 3;     // Catch: Throwable -> L17
        goto L10
    L57:
        r3.n = false;     // Catch: Throwable -> L17
        r3.a = 2;     // Catch: Throwable -> L17
        goto L10
    L58:
        h();     // Catch: Throwable -> L17
        r3.a = 1;     // Catch: Throwable -> L17
        goto L10
    L59:
        g();     // Catch: Throwable -> L17
        goto L10
    L60:
        i();     // Catch: Throwable -> L17
        goto L10
    L14:
        switch((r6 + 1)) {
            case 0: goto L33;
            case 1: goto L32;
            case 2: goto L31;
            case 3: goto L30;
            case 4: goto L22;
            case 5: goto L20;
            case 6: goto L19;
            case 7: goto L16;
            default: goto L10;
        };     // Catch: Throwable -> L17
    L16:
        n();     // Catch: Throwable -> L17
        goto L10
    L19:
        r3.a = 6;     // Catch: Throwable -> L17
        goto L10
    L20:
        p();     // Catch: Throwable -> L17
        goto L10
    L22:
        if (r3.E == null) goto L29;
        ViewGroup r54 = r3.D;     // Catch: Throwable -> L17
        if (r54 == null) goto L29;
        cg r55 = cg.f(r54, r3.j().y());     // Catch: Throwable -> L17
        int r62 = z30.b(r3.E.getVisibility());     // Catch: Throwable -> L17
        if (yl.A(2) == false) goto L28;
        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + r3);     // Catch: Throwable -> L17
    L28:
        r55.a(r62, 2, this);     // Catch: Throwable -> L17
    L29:
        r3.a = 4;     // Catch: Throwable -> L17
        goto L10
    L30:
        a();     // Catch: Throwable -> L17
        goto L10
    L31:
        j();     // Catch: Throwable -> L17
        f();     // Catch: Throwable -> L17
        goto L10
    L32:
        e();     // Catch: Throwable -> L17
        goto L10
    L33:
        c();     // Catch: Throwable -> L17
        goto L10
    L62:
        if (r3.I == true) goto L64;
    L85:
        this.d = false;
        return;
    L64:
        if (r3.E == null) goto L77;
        ViewGroup r56 = r3.D;     // Catch: Throwable -> L17
        if (r56 == null) goto L77;
        cg r57 = cg.f(r56, r3.j().y());     // Catch: Throwable -> L17
        if (r3.y == false) goto L74;
        if (yl.A(2) == false) goto L72;
        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + r3);     // Catch: Throwable -> L17
    L72:
        r57.a(3, 1, this);     // Catch: Throwable -> L17
        goto L77
    L74:
        if (yl.A(2) == false) goto L76;
        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + r3);     // Catch: Throwable -> L17
    L76:
        r57.a(2, 1, this);     // Catch: Throwable -> L17
    L77:
        yl r1 = r3.r;     // Catch: Throwable -> L17
        if (r1 != null) goto L80;
    L84:
        r3.I = false;     // Catch: Throwable -> L17
        goto L85
    L80:
        if (r3.k == false) goto L84;
        if (yl.B(r3) == false) goto L84;
        r1.x = true;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        this.d = false;
        throw th;
    }

    public final void l() {
        boolean r0 = yl.A(3);
        ml r1 = this.c;
        if (r0 == false) goto L5;
        Log.d("FragmentManager", "movefrom RESUMED: " + r1);
    L5:
        r1.t.p(5);
        if (r1.E == null) goto L8;
        r1.M.c(iq.ON_PAUSE);
    L8:
        r1.L.d(iq.ON_PAUSE);
        r1.a = 6;
        r1.C = true;
        this.a.i(false);
    }

    public final void m(ClassLoader r4) {
        ml r0 = this.c;
        Bundle r1 = r0.b;
        if (r1 == null) goto L13;
        r1.setClassLoader(r4);
        r0.c = r0.b.getSparseParcelableArray("android:view_state");
        r0.d = r0.b.getBundle("android:view_registry_state");
        String r42 = r0.b.getString("android:target_state");
        r0.h = r42;
        if (r42 == null) goto L8;
        r0.i = r0.b.getInt("android:target_req_state", 0);
    L8:
        boolean r43 = r0.b.getBoolean("android:user_visible_hint", true);
        r0.G = r43;
        if (r43 == true) goto L12;
        r0.F = true;
        return;
    L12:
        return;
    }

    public final void n() {
        boolean r0 = yl.A(3);
        ml r2 = this.c;
        if (r0 == false) goto L5;
        Log.d("FragmentManager", "moveto RESUMED: " + r2);
    L5:
        ll r02 = r2.H;
        if (r02 != null) goto L8;
        View r03 = null;
    L9:
        if (r03 != null) goto L11;
    L25:
        r2.f().k = null;
        r2.t.F();
        r2.t.t(true);
        r2.a = 7;
        r2.C = true;
        androidx.lifecycle.a r1 = r2.L;
        iq r4 = iq.ON_RESUME;
        r1.d(r4);
        if (r2.E == null) goto L28;
        r2.M.b.d(r4);
    L28:
        yl r12 = r2.t;
        r12.y = false;
        r12.z = false;
        r12.F.h = false;
        r12.p(7);
        this.a.l(false);
        r2.b = null;
        r2.c = null;
        r2.d = null;
        return;
    L11:
        if (r03 == r2.E) goto L17;
        ViewParent r42 = r03.getParent();
    L14:
        if (r42 == null) goto L25;
        if (r42 == r2.E) goto L17;
        r42 = r42.getParent();
    L17:
        boolean r43 = r03.requestFocus();
        if (yl.A(2) == false) goto L25;
        StringBuilder r5 = new StringBuilder("requestFocus: Restoring focused view ");
        r5.append(r03);
        r5.append(" ");
        if (r43 == false) goto L22;
        String r04 = "succeeded";
    L23:
        r5.append(r04);
        r5.append(" on Fragment ");
        r5.append(r2);
        r5.append(" resulting in focused view ");
        r5.append(r2.E.findFocus());
        Log.v("FragmentManager", r5.toString());
        goto L25
    L22:
        r04 = "failed";
        goto L23
    L8:
        r03 = r02.k;
        goto L9
    }

    public final void o() {
        ml r0 = this.c;
        if (r0.E == null) goto L13;
        SparseArray<Parcelable> r1 = new SparseArray();
        r0.E.saveHierarchyState(r1);
        if (r1.size() <= 0) goto L8;
        r0.c = r1;
    L8:
        Bundle r12 = new Bundle();
        r0.M.c.c(r12);
        if (r12.isEmpty() == true) goto L12;
        r0.d = r12;
        return;
    L12:
        return;
    }

    public final void p() {
        boolean r0 = yl.A(3);
        ml r1 = this.c;
        if (r0 == false) goto L5;
        Log.d("FragmentManager", "moveto STARTED: " + r1);
    L5:
        r1.t.F();
        r1.t.t(true);
        r1.a = 5;
        r1.C = false;
        r1.s();
        if (r1.C == false) goto L13;
        androidx.lifecycle.a r3 = r1.L;
        iq r4 = iq.ON_START;
        r3.d(r4);
        if (r1.E == null) goto L10;
        r1.M.b.d(r4);
    L10:
        yl r12 = r1.t;
        r12.y = false;
        r12.z = false;
        r12.F.h = false;
        r12.p(5);
        this.a.n(false);
        return;
    L13:
        throw new f50("Fragment " + r1 + " did not call through to super.onStart()");
    }

    public final void q() {
        boolean r0 = yl.A(3);
        ml r1 = this.c;
        if (r0 == false) goto L5;
        Log.d("FragmentManager", "movefrom STARTED: " + r1);
    L5:
        yl r02 = r1.t;
        r02.z = true;
        r02.F.h = true;
        r02.p(4);
        if (r1.E == null) goto L8;
        r1.M.c(iq.ON_STOP);
    L8:
        r1.L.d(iq.ON_STOP);
        r1.a = 4;
        r1.C = false;
        r1.t();
        if (r1.C == false) goto L13;
        this.a.o(false);
        return;
    L13:
        throw new f50("Fragment " + r1 + " did not call through to super.onStop()");
    }

    public a(d4 r2, r5 r3, ClassLoader r4, tl r5, cm r6) {
        this.d = false;
        this.e = -1;
        this.a = r2;
        this.b = r3;
        ml r22 = r5.a(r6.a);
        this.c = r22;
        Bundle r32 = r6.j;
        if (r32 == null) goto L5;
        r32.setClassLoader(r4);
    L5:
        r22.C(r32);
        r22.e = r6.b;
        r22.m = r6.c;
        r22.o = true;
        r22.v = r6.d;
        r22.w = r6.e;
        r22.x = r6.f;
        r22.A = r6.g;
        r22.l = r6.h;
        r22.z = r6.i;
        r22.y = r6.k;
        r22.K = jq.values()[r6.l];
        Bundle r33 = r6.m;
        if (r33 == null) goto L8;
        r22.b = r33;
    L10:
        if (yl.A(2) == false) goto L13;
        Log.v("FragmentManager", "Instantiated fragment " + r22);
        return;
    L13:
        return;
    L8:
        r22.b = new Bundle();
        goto L10
    }

    public a(d4 r3, r5 r4, ml r5, cm r6) {
        this.d = false;
        this.e = -1;
        this.a = r3;
        this.b = r4;
        this.c = r5;
        r5.c = null;
        r5.d = null;
        r5.q = 0;
        r5.n = false;
        r5.k = false;
        ml r42 = r5.g;
        if (r42 == null) goto L5;
        String r43 = r42.e;
    L6:
        r5.h = r43;
        r5.g = null;
        Bundle r32 = r6.m;
        if (r32 == null) goto L10;
        r5.b = r32;
        return;
    L10:
        r5.b = new Bundle();
        return;
    L5:
        r43 = null;
        goto L6
    }
}
