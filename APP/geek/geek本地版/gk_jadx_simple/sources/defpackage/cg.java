package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.a;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cg {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;

    public cg(ViewGroup r2) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = false;
        this.e = false;
        this.a = r2;
    }

    public static cg f(ViewGroup r3, vh r4) {
        Object r1 = r3.getTag(R.id.special_effects_controller_view_tag);
        if ((r1 instanceof cg) == true) goto L5;
        r4.getClass();
        cg r42 = new cg(r3);
        r3.setTag(R.id.special_effects_controller_view_tag, r42);
        return r42;
    L5:
        return (cg) r1;
    }

    public final void a(int r4, int r5, a r6) {
        ArrayList r0 = this.b;
        monitor-enter(r0);
        k8 r1 = new k8();     // Catch: Throwable -> L9
        g40 r2 = d(r6.c);     // Catch: Throwable -> L9
        if (r2 == null) goto L11;
        r2.c(r4, r5);     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L11:
        g40 r22 = new g40(r4, r5, r6, r1);     // Catch: Throwable -> L9
        this.b.add(r22);     // Catch: Throwable -> L9
        f40 r42 = new f40(this, r22, 0);     // Catch: Throwable -> L9
        r22.d.add(r42);     // Catch: Throwable -> L9
        f40 r43 = new f40(this, r22, 1);     // Catch: Throwable -> L9
        r22.d.add(r43);     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        throw th;
    }

    public final void b(ArrayList r24, boolean r25) {
        int r3 = r24.size();
        boolean r4 = false;
        g40 r5 = null;
        int r7 = 0;
        g40 r6 = null;
    L3:
        int r9 = 2;
        if (r7 >= r3) goto L16;
        Object r11 = r24.get(r7);
        r7 = r7 + 1;
        g40 r112 = (g40) r11;
        int r12 = z30.c(r112.c.E);
        int r13 = z30.t(r112.a);
        if (r13 == 0) goto L13;
        if (r13 != 1) goto L8;
        if (r12 == 2) goto L3;
        r6 = r112;
        goto L3
    L8:
        if (r13 == 2) goto L13;
        if (r13 != 3) goto L3;
    L13:
        if (r12 != 2) goto L3;
        if (r5 != null) goto L3;
        r5 = r112;
        goto L3
    L16:
        ArrayList r32 = new ArrayList();
        ArrayList r72 = new ArrayList();
        ArrayList r113 = new ArrayList(r24);
        int r122 = r24.size();
        int r132 = 0;
    L17:
        if (r132 >= r122) goto L41;
        Object r14 = r24.get(r132);
        r132 = r132 + 1;
        g40 r142 = (g40) r14;
        k8 r15 = new k8();
        r142.d();
        HashSet r10 = r142.e;
        r10.add(r15);
        ag r8 = new ag(r142, r15);
        r8.d = r4;
        r8.c = r25;
        r32.add(r8);
        k8 r82 = new k8();
        r142.d();
        r10.add(r82);
        if (r25 == false) goto L23;
        if (r142 != r5) goto L22;
    L21:
        boolean r152 = true;
    L25:
        bg r102 = new bg(r142, r82);
        int r83 = r142.a;
        ml r42 = r142.c;
        if (r83 != 2) goto L33;
        if (r25 == false) goto L29;
        r42.getClass();
    L30:
        if (r25 == false) goto L32;
        r42.getClass();
    L36:
        if (r152 == false) goto L40;
        if (r25 == false) goto L39;
        r42.getClass();
        goto L40
    L39:
        r42.getClass();
    L40:
        r72.add(r102);
        r142.d.add(new h1(this, r113, r142));
        r4 = false;
        goto L17
    L32:
        r42.getClass();
        goto L36
    L29:
        r42.getClass();
        goto L30
    L33:
        if (r25 == false) goto L35;
        r42.getClass();
        goto L36
    L35:
        r42.getClass();
    L22:
        r152 = r4;
        goto L25
    L23:
        if (r142 != r6) goto L22;
    L41:
        HashMap r1 = new HashMap();
        int r2 = r72.size();
        int r43 = 0;
    L42:
        if (r43 >= r2) goto L44;
        Object r52 = r72.get(r43);
        r43 = r43 + 1;
        g40 r53 = (g40) ((bg) r52).a;
        z30.c(r53.c.E);
        int r54 = r53.a;
        goto L42
    L44:
        int r22 = r72.size();
        int r44 = 0;
    L45:
        if (r44 >= r22) goto L47;
        Object r55 = r72.get(r44);
        r44 = r44 + 1;
        bg r56 = (bg) r55;
        r1.put((g40) r56.a, Boolean.FALSE);
        r56.d();
        goto L45
    L47:
        boolean r23 = r1.containsValue(Boolean.TRUE);
        ViewGroup r45 = this.a;
        Context r57 = r45.getContext();
        ArrayList r62 = new ArrayList();
        int r73 = r32.size();
        boolean r84 = false;
        int r103 = 0;
    L49:
        if (r103 >= r73) goto L77;
        Object r133 = r32.get(r103);
        r103 = r103 + 1;
        ag r134 = (ag) r133;
        g40 r143 = (g40) r134.a;
        int r153 = z30.c(r143.c.E);
        int r144 = r143.a;
        if (r153 == r144) goto L54;
        if (r153 == r9) goto L55;
        if (r144 != r9) goto L54;
    L55:
        d4 r145 = r134.j(r57);
        if (r145 == null) goto L57;
        Animator r146 = (Animator) r145.c;
        if (r146 == null) goto L61;
        g40 r154 = (g40) r134.a;
        int r222 = r9;
        ml r92 = r154.c;
        boolean r242 = r23;
        if (Boolean.TRUE.equals(r1.get(r154)) == true) goto L65;
        if (r154.a != 3) goto L71;
        boolean r19 = true;
    L72:
        if (r19 == false) goto L74;
        r113.remove(r154);
    L74:
        View r0 = r92.E;
        r45.startViewTransition(r0);
        ViewGroup r17 = r45;
        r146.addListener(new yf(r17, r0, r19, r154, r134));
        r146.setTarget(r0);
        r146.start();
        ((k8) r134.b).a(new l0(10, r146));
        r23 = r242;
        r45 = r17;
        r9 = r222;
        r84 = true;
        goto L49
    L71:
        r19 = false;
        goto L72
    L65:
        if (yl.A(r222) == false) goto L67;
        Log.v("FragmentManager", "Ignoring Animator set on " + r92 + " as this Fragment was involved in a Transition.");
    L67:
        r134.d();
        ViewGroup r93 = r45;
    L76:
        r23 = r242;
        r45 = r93;
        r9 = r222;
        goto L49
    L61:
        r62.add(r134);
    L58:
        r242 = r23;
        r222 = r9;
        r93 = r45;
        goto L76
    L57:
        r134.d();
    L54:
        r242 = r23;
        r222 = r9;
        r93 = r45;
        r134.d();
        goto L76
    L77:
        boolean r243 = r23;
        int r223 = r9;
        ViewGroup r94 = r45;
        int r02 = r62.size();
        int r16 = 0;
    L78:
        if (r16 >= r02) goto L95;
        Object r26 = r62.get(r16);
        r16 = r16 + 1;
        ag r27 = (ag) r26;
        g40 r33 = (g40) r27.a;
        ml r46 = r33.c;
        if (r243 == true) goto L82;
        if (r84 == true) goto L87;
        View r47 = r46.E;
        d4 r74 = r27.j(r57);
        r74.getClass();
        Animation r75 = (Animation) r74.b;
        r75.getClass();
        if (r33.a == 1) goto L93;
        r47.startAnimation(r75);
        r27.d();
    L94:
        ((k8) r27.b).a(new r5(r27, r47, r94));
        goto L78
    L93:
        r94.startViewTransition(r47);
        ol r34 = new ol(r75, r94, r47);
        r34.setAnimationListener(new zf(r27, r47, r94));
        r47.startAnimation(r34);
        goto L94
    L87:
        if (yl.A(r223) == false) goto L89;
        Log.v("FragmentManager", "Ignoring Animation set on " + r46 + " as Animations cannot run alongside Animators.");
    L89:
        r27.d();
        goto L78
    L82:
        if (yl.A(r223) == false) goto L84;
        Log.v("FragmentManager", "Ignoring Animation set on " + r46 + " as Animations cannot run alongside Transitions.");
    L84:
        r27.d();
        goto L78
    L95:
        int r03 = r113.size();
        int r48 = 0;
    L96:
        if (r48 >= r03) goto L98;
        Object r18 = r113.get(r48);
        r48 = r48 + 1;
        g40 r110 = (g40) r18;
        z30.a(r110.c.E, r110.a);
        goto L96
    L98:
        r113.clear();
    }

    public final void c() {
        if (this.e == false) goto L5;
        return;
    L5:
        ViewGroup r0 = this.a;
        WeakHashMap r1 = ja0.a;
        if (v90.b(r0) == true) goto L9;
        e();
        this.d = false;
        return;
    L9:
        ArrayList r02 = this.b;
        monitor-enter(r02);
    L18:
        th = move-exception;
        throw th;
    L12:
        if (this.b.isEmpty() == true) goto L27;
        ArrayList r2 = new ArrayList(this.c);     // Catch: Throwable -> L18
        this.c.clear();     // Catch: Throwable -> L18
        int r3 = r2.size();     // Catch: Throwable -> L18
        int r4 = 0;
    L14:
        if (r4 >= r3) goto L23;
        Object r5 = r2.get(r4);     // Catch: Throwable -> L18
        r4 = r4 + 1;     // Catch: Throwable -> L18
        g40 r52 = (g40) r5;     // Catch: Throwable -> L18
        if (yl.A(2) == false) goto L20;
        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + r52);     // Catch: Throwable -> L18
    L20:
        r52.a();     // Catch: Throwable -> L18
        if (r52.g == true) goto L14;
        this.c.add(r52);     // Catch: Throwable -> L18
        goto L14
    L23:
        g();     // Catch: Throwable -> L18
        ArrayList r22 = new ArrayList(this.b);     // Catch: Throwable -> L18
        this.b.clear();     // Catch: Throwable -> L18
        this.c.addAll(r22);     // Catch: Throwable -> L18
        int r32 = r22.size();     // Catch: Throwable -> L18
        int r42 = 0;
    L24:
        if (r42 >= r32) goto L26;
        Object r53 = r22.get(r42);     // Catch: Throwable -> L18
        r42 = r42 + 1;     // Catch: Throwable -> L18
        ((g40) r53).d();     // Catch: Throwable -> L18
        goto L24
    L26:
        b(r22, this.d);     // Catch: Throwable -> L18
        this.d = false;     // Catch: Throwable -> L18
    L27:
        monitor-exit(r02);     // Catch: Throwable -> L18
    }

    public final g40 d(ml r6) {
        ArrayList r0 = this.b;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L9;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        g40 r32 = (g40) r3;
        if (r32.c.equals(r6) == false) goto L3;
        if (r32.f == true) goto L3;
        return r32;
    L9:
        return null;
    }

    public final void e() {
        ViewGroup r0 = this.a;
        WeakHashMap r1 = ja0.a;
        boolean r02 = v90.b(r0);
        ArrayList r12 = this.b;
        monitor-enter(r12);
        g();     // Catch: Throwable -> L7
        ArrayList r2 = this.b;     // Catch: Throwable -> L7
        int r3 = r2.size();     // Catch: Throwable -> L7
        int r4 = 0;
        int r5 = 0;
    L5:
        if (r5 >= r3) goto L9;
        Object r6 = r2.get(r5);     // Catch: Throwable -> L7
        r5 = r5 + 1;     // Catch: Throwable -> L7
        ((g40) r6).d();     // Catch: Throwable -> L7
        goto L5
    L9:
        ArrayList r22 = new ArrayList(this.c);     // Catch: Throwable -> L7
        int r32 = r22.size();     // Catch: Throwable -> L7
        int r52 = 0;
    L11:
        if (r52 >= r32) goto L20;
        Object r7 = r22.get(r52);     // Catch: Throwable -> L7
        r52 = r52 + 1;     // Catch: Throwable -> L7
        g40 r72 = (g40) r7;     // Catch: Throwable -> L7
        if (yl.A(2) == false) goto L19;
        StringBuilder r8 = new StringBuilder();     // Catch: Throwable -> L7
        r8.append("SpecialEffectsController: ");     // Catch: Throwable -> L7
        if (r02 == false) goto L17;
        String r9 = "";
    L18:
        r8.append(r9);     // Catch: Throwable -> L7
        r8.append("Cancelling running operation ");     // Catch: Throwable -> L7
        r8.append(r72);     // Catch: Throwable -> L7
        Log.v("FragmentManager", r8.toString());     // Catch: Throwable -> L7
        goto L19
    L17:
        r9 = "Container " + this.a + " is not attached to window. ";     // Catch: Throwable -> L7
    L19:
        r72.a();     // Catch: Throwable -> L7
        goto L11
    L20:
        ArrayList r23 = new ArrayList(this.b);     // Catch: Throwable -> L7
        int r33 = r23.size();     // Catch: Throwable -> L7
    L21:
        if (r4 >= r33) goto L30;
        Object r53 = r23.get(r4);     // Catch: Throwable -> L7
        r4 = r4 + 1;     // Catch: Throwable -> L7
        g40 r54 = (g40) r53;     // Catch: Throwable -> L7
        if (yl.A(2) == false) goto L29;
        StringBuilder r82 = new StringBuilder();     // Catch: Throwable -> L7
        r82.append("SpecialEffectsController: ");     // Catch: Throwable -> L7
        if (r02 == false) goto L27;
        String r92 = "";
    L28:
        r82.append(r92);     // Catch: Throwable -> L7
        r82.append("Cancelling pending operation ");     // Catch: Throwable -> L7
        r82.append(r54);     // Catch: Throwable -> L7
        Log.v("FragmentManager", r82.toString());     // Catch: Throwable -> L7
        goto L29
    L27:
        r92 = "Container " + this.a + " is not attached to window. ";     // Catch: Throwable -> L7
    L29:
        r54.a();     // Catch: Throwable -> L7
        goto L21
    L30:
        monitor-exit(r12);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }

    public final void g() {
        ArrayList r0 = this.b;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L7;
        Object r3 = r0.get(r2);
        r2 = r2 + 1;
        g40 r32 = (g40) r3;
        if (r32.b != 2) goto L3;
        r32.c(z30.b(r32.c.A().getVisibility()), 1);
        goto L3
    }
}
