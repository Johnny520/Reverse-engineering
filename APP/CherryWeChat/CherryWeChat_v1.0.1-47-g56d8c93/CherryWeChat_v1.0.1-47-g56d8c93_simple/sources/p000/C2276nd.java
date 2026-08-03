package p000;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: nd */
/* JADX INFO: loaded from: classes.dex */
public final class C2276nd {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f8009a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f8010b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f8011c;

    /* JADX INFO: renamed from: d */
    public boolean f8012d;

    /* JADX INFO: renamed from: e */
    public boolean f8013e;

    public C2276nd(ViewGroup r1) {
        this.f8009a = r1;
        this.f8010b = new ArrayList();
        this.f8011c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public final void m4604a(int r4, int r5, C0326Hi r6) {
        ArrayList r0 = this.f8010b;
        monitor-enter(r0);
        C0609O6 r1 = new C0609O6();     // Catch: Throwable -> L9
        C0557My r2 = m4607d(r6.f1110c);     // Catch: Throwable -> L9
        if (r2 == null) goto L11;
        r2.m1099c(r4, r5);     // Catch: Throwable -> L9
        monitor-exit(r0);
        return;
    L11:
        final C0557My r22 = new C0557My(r4, r5, r6, r1);     // Catch: Throwable -> L9
        this.f8010b.add(r22);     // Catch: Throwable -> L9
        final int r52 = 0;
        Runnable r42 = new RunnableC0514Ly(this, r22, r52);     // Catch: Throwable -> L9
        r22.f1828d.add(r42);     // Catch: Throwable -> L9
        final int r53 = 1;
        Runnable r43 = new RunnableC0514Ly(this, r22, r53);     // Catch: Throwable -> L9
        r22.f1828d.add(r43);     // Catch: Throwable -> L9
        monitor-exit(r0);
        return;
    L9:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public final void m4605b(ArrayList r20, boolean r21) {
        Iterator r3 = r20.iterator();
    L3:
        Object r5 = null;
        int r10 = 2;
        if (r3.hasNext() == false) goto L20;
        Object r4 = r3.next();
        C0557My r11 = (C0557My) r4;
        View r12 = r11.f1827c.f5296E;
        if (r12.getAlpha() != 0.0f) goto L10;
        if (r12.getVisibility() == 0) goto L3;
    L10:
        int r122 = r12.getVisibility();
        if (r122 != 0) goto L12;
        if (r11.f1825a == 2) goto L3;
    L21:
        C0557My r112 = (C0557My) r4;
        ListIterator r32 = r20.listIterator(r20.size());
    L23:
        if (r32.hasPrevious() == false) goto L39;
        Object r42 = r32.previous();
        C0557My r123 = (C0557My) r42;
        View r13 = r123.f1827c.f5296E;
        if (r13.getAlpha() == 0.0f) goto L27;
    L29:
        int r132 = r13.getVisibility();
        if (r132 == 0) goto L23;
        if (r132 == 4) goto L37;
        if (r132 == 8) goto L37;
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r132, "Unknown visibility "));
    L37:
        if (r123.f1825a != 2) goto L23;
        r5 = r42;
        goto L39
    L27:
        if (r13.getVisibility() != 0) goto L29;
    L39:
        C0557My r6 = (C0557My) r5;
        if (AbstractC2805zi.m5374G(2) == false) goto L42;
        Objects.toString(r112);
        Objects.toString(r6);
    L42:
        ArrayList r33 = new ArrayList();
        ArrayList r43 = new ArrayList();
        ArrayList r7 = new ArrayList(r20);
        AbstractComponentCallbacksC1503hi r52 = ((C0557My) AbstractC2453ra.m4902l0(r20)).f1827c;
        Iterator r8 = r20.iterator();
    L44:
        if (r8.hasNext() == false) goto L46;
        C1415fi r9 = ((C0557My) r8.next()).f1827c.f5299H;
        C1415fi r124 = r52.f5299H;
        r9.f4998b = r124.f4998b;
        r9.f4999c = r124.f4999c;
        r9.f5000d = r124.f5000d;
        r9.f5001e = r124.f5001e;
        goto L44
    L46:
        Iterator r0 = r20.iterator();
    L48:
        if (r0.hasNext() == false) goto L74;
        C0557My r53 = (C0557My) r0.next();
        C0609O6 r125 = new C0609O6();
        r53.m1100d();
        LinkedHashSet r133 = r53.f1829e;
        r133.add(r125);
        r33.add(new C2099jd(r53, r125, r21));
        C0609O6 r126 = new C0609O6();
        r53.m1100d();
        r133.add(r126);
        if (r21 == false) goto L54;
        if (r53 != r112) goto L53;
    L52:
        boolean r82 = true;
    L56:
        AbstractComponentCallbacksC1503hi r92 = r53.f1827c;
        C2143kd r134 = new C2143kd(r53, r126);
        if (r53.f1825a != 2) goto L61;
        if (r21 == false) goto L60;
        C1415fi r127 = r92.f5299H;
    L65:
        if (r53.f1825a != 2) goto L69;
        if (r21 == false) goto L68;
        C1415fi r128 = r92.f5299H;
        goto L69
    L68:
        C1415fi r129 = r92.f5299H;
    L69:
        if (r82 == false) goto L73;
        if (r21 == false) goto L72;
        C1415fi r83 = r92.f5299H;
        goto L73
    L72:
        r92.getClass();
    L73:
        r43.add(r134);
        r53.f1828d.add(new RunnableC2260n3(r7, r53, this, 7));
        goto L48
    L60:
        r92.getClass();
        goto L65
    L61:
        if (r21 == false) goto L63;
        C1415fi r1210 = r92.f5299H;
        goto L65
    L63:
        r92.getClass();
    L53:
        r82 = false;
        goto L56
    L54:
        if (r53 != r6) goto L53;
    L74:
        LinkedHashMap r1211 = new LinkedHashMap();
        ArrayList r02 = new ArrayList();
        Iterator r2 = r43.iterator();
    L76:
        if (r2.hasNext() == false) goto L80;
        Object r54 = r2.next();
        if (((C2143kd) r54).m84j() == true) goto L76;
        r02.add(r54);
        goto L76
    L80:
        ArrayList r22 = new ArrayList();
        Iterator r03 = r02.iterator();
    L82:
        if (r03.hasNext() == false) goto L84;
        ((C2143kd) r03.next()).getClass();
        goto L82
    L84:
        Iterator r04 = r22.iterator();
    L86:
        if (r04.hasNext() == false) goto L88;
        ((C2143kd) r04.next()).getClass();
        goto L86
    L88:
        Iterator r05 = r43.iterator();
    L90:
        if (r05.hasNext() == false) goto L92;
        C2143kd r23 = (C2143kd) r05.next();
        r1211.put((C0557My) r23.f96a, Boolean.FALSE);
        r23.m78d();
        goto L90
    L92:
        boolean r135 = r1211.containsValue(Boolean.TRUE);
        ViewGroup r14 = this.f8009a;
        Context r15 = r14.getContext();
        ArrayList r06 = new ArrayList();
        Iterator r16 = r33.iterator();
        boolean r24 = false;
    L94:
        if (r16.hasNext() == false) goto L122;
        C2099jd r55 = (C2099jd) r16.next();
        if (r55.m84j() == true) goto L97;
        C0649P3 r34 = r55.m4293o(r15);
        if (r34 == null) goto L101;
        Animator r35 = (Animator) r34.f2090c;
        if (r35 == null) goto L104;
        C0557My r44 = (C0557My) r55.f96a;
        AbstractComponentCallbacksC1503hi r84 = r44.f1827c;
        int r17 = r10;
        if (AbstractC0585Nj.m1134a(r1211.get(r44), Boolean.TRUE) == true) goto L108;
        if (r44.f1825a != 3) goto L115;
        Animator r25 = r35;
        boolean r36 = true;
    L116:
        if (r36 == false) goto L118;
        r7.remove(r44);
    L118:
        View r85 = r84.f5296E;
        r14.startViewTransition(r85);
        ArrayList r93 = r06;
        Animator r86 = r25;
        r86.addListener(new C2190ld(this, r85, r36, r44, r55));
        r86.setTarget(r85);
        r86.start();
        if (AbstractC2805zi.m5374G(r17) == false) goto L121;
        r44.toString();
    L121:
        ((C0609O6) r55.f97b).m1188a(new C0698Q9(1, r86, r44));
        r06 = r93;
        r10 = r17;
        r24 = true;
        goto L94
    L115:
        r25 = r35;
        r36 = false;
        goto L116
    L108:
        if (AbstractC2805zi.m5374G(r17) == false) goto L110;
        Objects.toString(r84);
    L110:
        r55.m78d();
    L111:
        r10 = r17;
        goto L94
    L104:
        r06.add(r55);
    L98:
        r17 = r10;
        goto L111
    L101:
        r55.m78d();
        goto L98
    L97:
        r55.m78d();
        goto L98
    L122:
        int r172 = r10;
        Iterator r07 = r06.iterator();
    L124:
        if (r07.hasNext() == false) goto L151;
        C2099jd r37 = (C2099jd) r07.next();
        C0557My r45 = (C0557My) r37.f96a;
        AbstractComponentCallbacksC1503hi r56 = r45.f1827c;
        if (r135 == true) goto L128;
        if (r24 == true) goto L133;
        View r57 = r56.f5296E;
        C0649P3 r87 = r37.m4293o(r15);
        if (r87 == null) goto L150;
        Animation r88 = (Animation) r87.f2089b;
        if (r88 == null) goto L148;
        if (r45.f1825a == 1) goto L143;
        r57.startAnimation(r88);
        r37.m78d();
    L146:
        ((C0609O6) r37.f97b).m1188a(new C1542id(r57, this, r37, r45));
        goto L124
    L143:
        r14.startViewTransition(r57);
        RunnableC2195li r94 = new RunnableC2195li(r88, r14, r57);
        r94.setAnimationListener(new AnimationAnimationListenerC2233md(r45, this, r57, r37));
        r57.startAnimation(r94);
        if (AbstractC2805zi.m5374G(r172) == false) goto L146;
        r45.toString();
        goto L146
    L148:
        throw new IllegalStateException("Required value was null.");
    L150:
        throw new IllegalStateException("Required value was null.");
    L133:
        if (AbstractC2805zi.m5374G(r172) == false) goto L135;
        Objects.toString(r56);
    L135:
        r37.m78d();
        goto L124
    L128:
        if (AbstractC2805zi.m5374G(r172) == false) goto L130;
        Objects.toString(r56);
    L130:
        r37.m78d();
        goto L124
    L151:
        Iterator r08 = r7.iterator();
    L153:
        if (r08.hasNext() == false) goto L155;
        C0557My r26 = (C0557My) r08.next();
        AbstractC2374ph.m4804a(r26.f1827c.f5296E, r26.f1825a);
        goto L153
    L155:
        r7.clear();
        if (AbstractC2805zi.m5374G(r172) == false) goto L214;
        Objects.toString(r112);
        Objects.toString(r6);
        return;
    L214:
        return;
    L12:
        if (r122 == 4) goto L3;
        if (r122 == 8) goto L3;
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r122, "Unknown visibility "));
    L20:
        r4 = null;
        goto L21
    }

    /* JADX INFO: renamed from: c */
    public final void m4606c() {
        if (this.f8013e == false) goto L5;
        return;
    L5:
        ViewGroup r0 = this.f8009a;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        if (r0.isAttachedToWindow() == true) goto L9;
        m4608e();
        this.f8012d = false;
        return;
    L9:
        ArrayList r02 = this.f8010b;
        monitor-enter(r02);
    L19:
        th = move-exception;
        throw th;
    L12:
        if (this.f8010b.isEmpty() == true) goto L29;
        ArrayList r3 = new ArrayList(this.f8011c);     // Catch: Throwable -> L19
        this.f8011c.clear();     // Catch: Throwable -> L19
        Iterator r2 = r3.iterator();     // Catch: Throwable -> L19
    L15:
        if (r2.hasNext() == false) goto L24;
        C0557My r32 = (C0557My) r2.next();     // Catch: Throwable -> L19
        if (AbstractC2805zi.m5374G(2) == false) goto L21;
        Objects.toString(r32);     // Catch: Throwable -> L19
    L21:
        r32.m1097a();     // Catch: Throwable -> L19
        if (r32.f1831g == true) goto L15;
        this.f8011c.add(r32);     // Catch: Throwable -> L19
        goto L15
    L24:
        m4609f();     // Catch: Throwable -> L19
        ArrayList r33 = new ArrayList(this.f8010b);     // Catch: Throwable -> L19
        this.f8010b.clear();     // Catch: Throwable -> L19
        this.f8011c.addAll(r33);     // Catch: Throwable -> L19
        Iterator r22 = r33.iterator();     // Catch: Throwable -> L19
    L26:
        if (r22.hasNext() == false) goto L28;
        ((C0557My) r22.next()).m1100d();     // Catch: Throwable -> L19
        goto L26
    L28:
        m4605b(r33, this.f8012d);     // Catch: Throwable -> L19
        this.f8012d = false;     // Catch: Throwable -> L19
    L29:
        monitor-exit(r02);
    }

    /* JADX INFO: renamed from: d */
    public final C0557My m4607d(AbstractComponentCallbacksC1503hi r5) {
        Iterator r0 = this.f8010b.iterator();
    L4:
        if (r0.hasNext() == false) goto L10;
        Object r1 = r0.next();
        C0557My r2 = (C0557My) r1;
        if (AbstractC0585Nj.m1134a(r2.f1827c, r5) == false) goto L4;
        if (r2.f1830f == true) goto L4;
    L12:
        return (C0557My) r1;
    L10:
        r1 = null;
        goto L12
    }

    /* JADX INFO: renamed from: e */
    public final void m4608e() {
        ViewGroup r0 = this.f8009a;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        boolean r02 = r0.isAttachedToWindow();
        ArrayList r12 = this.f8010b;
        monitor-enter(r12);
        m4609f();     // Catch: Throwable -> L8
        Iterator r2 = this.f8010b.iterator();     // Catch: Throwable -> L8
    L6:
        if (r2.hasNext() == false) goto L10;
        ((C0557My) r2.next()).m1100d();     // Catch: Throwable -> L8
        goto L6
    L10:
        Iterator r22 = new ArrayList(this.f8011c).iterator();     // Catch: Throwable -> L8
    L12:
        if (r22.hasNext() == false) goto L20;
        C0557My r3 = (C0557My) r22.next();     // Catch: Throwable -> L8
        if (AbstractC2805zi.m5374G(2) == false) goto L19;
        if (r02 == true) goto L18;
        Objects.toString(this.f8009a);     // Catch: Throwable -> L8
    L18:
        Objects.toString(r3);     // Catch: Throwable -> L8
    L19:
        r3.m1097a();     // Catch: Throwable -> L8
        goto L12
    L20:
        Iterator r23 = new ArrayList(this.f8010b).iterator();     // Catch: Throwable -> L8
    L21:
        if (r23.hasNext() == false) goto L31;
        C0557My r32 = (C0557My) r23.next();     // Catch: Throwable -> L8
        if (AbstractC2805zi.m5374G(2) == false) goto L29;
        if (r02 == true) goto L28;
        Objects.toString(this.f8009a);     // Catch: Throwable -> L8
    L28:
        Objects.toString(r32);     // Catch: Throwable -> L8
    L29:
        r32.m1097a();     // Catch: Throwable -> L8
        goto L21
    L31:
        monitor-exit(r12);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final void m4609f() {
        Iterator r0 = this.f8010b.iterator();
    L4:
        if (r0.hasNext() == false) goto L17;
        C0557My r1 = (C0557My) r0.next();
        int r3 = 2;
        if (r1.f1826b != 2) goto L4;
        int r2 = r1.f1827c.m2879z().getVisibility();
        if (r2 == 0) goto L16;
        r3 = 4;
        if (r2 == 4) goto L16;
        if (r2 != 8) goto L15;
        r3 = 3;
        goto L16
    L15:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r2, "Unknown visibility "));
    L16:
        r1.m1099c(r3, 1);
        goto L4
    }
}
