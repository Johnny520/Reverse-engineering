package p000;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: LB */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0485LB implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public AbstractC0356IB f1592a;

    /* JADX INFO: renamed from: b */
    public ViewGroup f1593b;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        AbstractC0356IB r1 = this.f1592a;
        ViewGroup r2 = this.f1593b;
        r2.getViewTreeObserver().removeOnPreDrawListener(this);
        r2.removeOnAttachStateChangeListener(this);
        boolean r7 = true;
        if (AbstractC0528MB.f1723c.remove(r2) == true) goto L5;
        return true;
    L5:
        C0521M4 r3 = AbstractC0528MB.m1024b();
        ArrayList r4 = (ArrayList) r3.get(r2);
        if (r4 != null) goto L10;
        r4 = new ArrayList();
        r3.put(r2, r4);
    L8:
        ArrayList r6 = null;
    L12:
        r4.add(r1);
        r1.m766a(new C0442KB(this, r3));
        int r32 = 0;
        r1.m772h(r2, false);
        if (r6 == null) goto L18;
        Iterator r42 = r6.iterator();
    L16:
        if (r42.hasNext() == false) goto L18;
        ((AbstractC0356IB) r42.next()).mo787y(r2);
    L18:
        r1.f1206k = new ArrayList();
        r1.f1207l = new ArrayList();
        C2428qs r43 = r1.f1202g;
        C2428qs r62 = r1.f1203h;
        C0521M4 r8 = new C0521M4((C0521M4) r43.f8520a);
        C0521M4 r9 = new C0521M4((C0521M4) r62.f8520a);
        int r10 = 0;
    L19:
        int[] r11 = r1.f1205j;
        if (r10 >= r11.length) goto L91;
        int r112 = r11[r10];
        if (r112 != r7) goto L24;
        C2428qs r5 = r62;
        boolean r18 = r7;
        int r0 = r8.f8818c - 1;
    L79:
        if (r0 < 0) goto L90;
        View r33 = (View) r8.m5002f(r0);
        if (r33 == null) goto L89;
        if (r1.m783t(r33) == false) goto L89;
        C0657PB r34 = (C0657PB) r9.remove(r33);
        if (r34 == null) goto L89;
        if (r1.m783t(r34.f2100b) == false) goto L89;
        r1.f1206k.add((C0657PB) r8.mo4h(r0));
        r1.f1207l.add(r34);
    L89:
        r0 = r0 - 1;
    L90:
        r10 = r10 + 1;
        r62 = r5;
        r7 = r18;
        r32 = 0;
        goto L19
    L24:
        if (r112 != 2) goto L26;
        r5 = r62;
        r18 = r7;
        C0521M4 r02 = (C0521M4) r43.f8523d;
        C0521M4 r35 = (C0521M4) r5.f8523d;
        int r63 = r02.f8818c;
        int r72 = 0;
    L64:
        if (r72 >= r63) goto L90;
        View r113 = (View) r02.m5003j(r72);
        if (r113 == null) goto L77;
        if (r1.m783t(r113) == false) goto L77;
        View r12 = (View) r35.get(r02.m5002f(r72));
        if (r12 == null) goto L77;
        if (r1.m783t(r12) == false) goto L77;
        C0657PB r13 = (C0657PB) r8.get(r113);
        C0657PB r14 = (C0657PB) r9.get(r12);
        if (r13 == null) goto L77;
        if (r14 == null) goto L77;
        r1.f1206k.add(r13);
        r1.f1207l.add(r14);
        r8.remove(r113);
        r9.remove(r12);
    L77:
        r72 = r72 + 1;
        goto L64
    L26:
        if (r112 != 3) goto L28;
        r18 = r7;
        SparseArray r36 = (SparseArray) r43.f8521b;
        r5 = r62;
        SparseArray r64 = (SparseArray) r5.f8521b;
        int r73 = r36.size();
        int r114 = 0;
    L49:
        if (r114 >= r73) goto L90;
        View r122 = (View) r36.valueAt(r114);
        if (r122 == null) goto L62;
        if (r1.m783t(r122) == false) goto L62;
        View r132 = (View) r64.get(r36.keyAt(r114));
        if (r132 == null) goto L62;
        if (r1.m783t(r132) == false) goto L62;
        C0657PB r142 = (C0657PB) r8.get(r122);
        C0657PB r15 = (C0657PB) r9.get(r132);
        if (r142 == null) goto L62;
        if (r15 == null) goto L62;
        r1.f1206k.add(r142);
        r1.f1207l.add(r15);
        r8.remove(r122);
        r9.remove(r132);
    L62:
        r114 = r114 + 1;
        goto L49
    L28:
        if (r112 == 4) goto L30;
        r5 = r62;
        r18 = r7;
        goto L90
    L30:
        C2640vp r115 = (C2640vp) r43.f8522c;
        C2640vp r123 = (C2640vp) r62.f8522c;
        int r133 = r115.m5172g();
        int r143 = r32;
    L31:
        if (r143 >= r133) goto L47;
        View r152 = (View) r115.m5173h(r143);
        if (r152 != null) goto L35;
    L45:
        C2428qs r17 = r62;
    L44:
        boolean r182 = r7;
    L46:
        r143 = r143 + 1;
        r62 = r17;
        r7 = r182;
        goto L31
    L35:
        if (r1.m783t(r152) == false) goto L45;
        r17 = r62;
        View r52 = (View) r123.m5167b(r115.m5169d(r143));
        if (r52 == null) goto L44;
        if (r1.m783t(r52) == false) goto L44;
        C0657PB r65 = (C0657PB) r8.get(r152);
        C0657PB r37 = (C0657PB) r9.get(r52);
        if (r65 == null) goto L44;
        if (r37 == null) goto L44;
        r182 = r7;
        r1.f1206k.add(r65);
        r1.f1207l.add(r37);
        r8.remove(r152);
        r9.remove(r52);
        goto L46
    L47:
        r18 = r7;
        r5 = r62;
        goto L90
    L91:
        boolean r183 = r7;
        int r03 = 0;
    L93:
        if (r03 >= r8.f8818c) goto L98;
        C0657PB r38 = (C0657PB) r8.m5003j(r03);
        if (r1.m783t(r38.f2100b) == false) goto L97;
        r1.f1206k.add(r38);
        r1.f1207l.add(null);
    L97:
        r03 = r03 + 1;
        goto L93
    L98:
        int r39 = 0;
    L100:
        if (r39 >= r9.f8818c) goto L106;
        C0657PB r04 = (C0657PB) r9.m5003j(r39);
        if (r1.m783t(r04.f2100b) == false) goto L105;
        r1.f1207l.add(r04);
        r1.f1206k.add(null);
    L105:
        r39 = r39 + 1;
        goto L100
    L106:
        C0521M4 r05 = AbstractC0356IB.m756p();
        int r310 = r05.f8818c;
        WindowId r44 = r2.getWindowId();
        int r311 = r310 - 1;
    L107:
        if (r311 < 0) goto L132;
        Animator r53 = (Animator) r05.m5002f(r311);
        if (r53 == null) goto L131;
        C0270GB r66 = (C0270GB) r05.get(r53);
        if (r66 == null) goto L131;
        AbstractC0356IB r74 = r66.f874e;
        View r82 = r66.f870a;
        if (r82 == null) goto L131;
        if (r44.equals(r66.f873d) == false) goto L131;
        C0657PB r67 = r66.f872c;
        boolean r92 = r183;
        C0657PB r102 = r1.m781r(r82, r92);
        C0657PB r116 = r1.m778n(r82, r92);
        if (r102 != null) goto L120;
        if (r116 != null) goto L120;
        r116 = (C0657PB) ((C0521M4) r1.f1203h.f8520a).get(r82);
    L120:
        if (r102 != null) goto L123;
        if (r116 == null) goto L131;
    L123:
        if (r74.mo782s(r67, r116) == false) goto L131;
        r74.m779o().getClass();
        if (r53.isRunning() == false) goto L127;
    L130:
        r53.cancel();
        goto L131
    L127:
        if (r53.isStarted() == true) goto L130;
        r05.remove(r53);
    L131:
        r311 = r311 - 1;
        r183 = true;
        goto L107
    L132:
        r1.mo776l(r2, r1.f1202g, r1.f1203h, r1.f1206k, r1.f1207l);
        r1.mo788z();
        return true;
    L10:
        if (r4.size() <= 0) goto L8;
        r6 = new ArrayList(r4);
        goto L12
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r3) {
        ViewGroup r32 = this.f1593b;
        r32.getViewTreeObserver().removeOnPreDrawListener(this);
        r32.removeOnAttachStateChangeListener(this);
        AbstractC0528MB.f1723c.remove(r32);
        ArrayList r0 = (ArrayList) AbstractC0528MB.m1024b().get(r32);
        if (r0 != null) goto L5;
    L10:
        this.f1592a.m773i(true);
        return;
    L5:
        if (r0.size() <= 0) goto L10;
        Iterator r02 = r0.iterator();
    L8:
        if (r02.hasNext() == false) goto L10;
        ((AbstractC0356IB) r02.next()).mo787y(r32);
        goto L8
    }
}
