package p043Y;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;
import p063j.C0957b;
import p063j.C0960e;

/* JADX INFO: renamed from: Y.p */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0457p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public AbstractC0454m f1033a;

    /* JADX INFO: renamed from: b */
    public ViewGroup f1034b;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup r1 = this.f1034b;
        r1.getViewTreeObserver().removeOnPreDrawListener(this);
        r1.removeOnAttachStateChangeListener(this);
        ArrayList r12 = AbstractC0458q.f1037c;
        ViewGroup r3 = this.f1034b;
        int r8 = 1;
        if (r12.remove(r3) == true) goto L5;
        return true;
    L5:
        C0957b r13 = AbstractC0458q.m1090b();
        Long r2 = null;
        ArrayList r4 = (ArrayList) r13.getOrDefault(r3, null);
        if (r4 != null) goto L10;
        r4 = new ArrayList();
        r13.put(r3, r4);
    L8:
        ArrayList r5 = null;
    L12:
        AbstractC0454m r9 = this.f1033a;
        r4.add(r9);
        r9.m1079a(new C0456o(this, r13));
        int r14 = 0;
        r9.m1081h(r3, false);
        if (r5 == null) goto L18;
        Iterator r42 = r5.iterator();
    L16:
        if (r42.hasNext() == false) goto L18;
        ((AbstractC0454m) r42.next()).mo1063y(r3);
    L18:
        r9.f1019k = new ArrayList();
        r9.f1020l = new ArrayList();
        C0463v r43 = r9.f1015g;
        C0463v r52 = r9.f1016h;
        C0957b r6 = new C0957b((C0957b) r43.f1044a);
        C0957b r7 = new C0957b((C0957b) r52.f1044a);
        int r10 = 0;
    L19:
        int[] r11 = r9.f1018j;
        if (r10 >= r11.length) goto L91;
        int r112 = r11[r10];
        if (r112 != r8) goto L24;
        int r02 = r6.f3432c - 1;
    L79:
        if (r02 < 0) goto L90;
        View r15 = (View) r6.m2322h(r02);
        if (r15 == null) goto L89;
        if (r9.m1087t(r15) == false) goto L89;
        C0462u r16 = (C0462u) r7.remove(r15);
        if (r16 == null) goto L89;
        if (r9.m1087t(r16.f1042b) == false) goto L89;
        r9.f1019k.add((C0462u) r6.m2323i(r02));
        r9.f1020l.add(r16);
    L89:
        r02 = r02 - 1;
    L90:
        r10 = r10 + 1;
        r14 = 0;
        r2 = null;
        r8 = 1;
        goto L19
    L24:
        if (r112 != 2) goto L26;
        C0957b r03 = (C0957b) r43.f1045b;
        int r17 = r03.f3432c;
        int r22 = 0;
    L64:
        if (r22 >= r17) goto L90;
        View r82 = (View) r03.m2324j(r22);
        if (r82 == null) goto L77;
        if (r9.m1087t(r82) == false) goto L77;
        View r113 = (View) ((C0957b) r52.f1045b).getOrDefault(r03.m2322h(r22), null);
        if (r113 == null) goto L77;
        if (r9.m1087t(r113) == false) goto L77;
        C0462u r122 = (C0462u) r6.getOrDefault(r82, null);
        C0462u r142 = (C0462u) r7.getOrDefault(r113, null);
        if (r122 == null) goto L77;
        if (r142 == null) goto L77;
        r9.f1019k.add(r122);
        r9.f1020l.add(r142);
        r6.remove(r82);
        r7.remove(r113);
    L77:
        r22 = r22 + 1;
        goto L64
    L26:
        if (r112 != 3) goto L28;
        SparseArray r18 = (SparseArray) r43.f1046c;
        SparseArray r23 = (SparseArray) r52.f1046c;
        int r83 = r18.size();
        int r114 = 0;
    L49:
        if (r114 >= r83) goto L90;
        View r123 = (View) r18.valueAt(r114);
        if (r123 == null) goto L62;
        if (r9.m1087t(r123) == false) goto L62;
        View r132 = (View) r23.get(r18.keyAt(r114));
        if (r132 == null) goto L62;
        if (r9.m1087t(r132) == false) goto L62;
        C0462u r152 = (C0462u) r6.getOrDefault(r123, null);
        C0462u r143 = (C0462u) r7.getOrDefault(r132, null);
        if (r152 == null) goto L62;
        if (r143 == null) goto L62;
        r9.f1019k.add(r152);
        r9.f1020l.add(r143);
        r6.remove(r123);
        r7.remove(r132);
    L62:
        r114 = r114 + 1;
        goto L49
    L28:
        if (r112 != 4) goto L90;
        C0960e r115 = (C0960e) r43.f1047d;
        int r124 = r115.m2311f();
        int r133 = r14;
    L31:
        if (r133 >= r124) goto L90;
        View r144 = (View) r115.m2312g(r133);
        if (r144 == null) goto L47;
        if (r9.m1087t(r144) == false) goto L47;
        if (r115.f3405a == false) goto L39;
        r115.m2308c();
    L39:
        View r84 = (View) ((C0960e) r52.f1047d).m2309d(r115.f3406b[r133], r2);
        r9 = r9;
        if (r84 == null) goto L47;
        if (r9.m1087t(r84) == false) goto L47;
        C0462u r153 = (C0462u) r6.getOrDefault(r144, r2);
        C0462u r19 = (C0462u) r7.getOrDefault(r84, r2);
        if (r153 == null) goto L47;
        if (r19 == null) goto L47;
        r9.f1019k.add(r153);
        r9.f1020l.add(r19);
        r6.remove(r144);
        r7.remove(r84);
    L47:
        r133 = r133 + 1;
        r2 = null;
        goto L31
    L91:
        int r04 = 0;
    L93:
        if (r04 >= r6.f3432c) goto L98;
        C0462u r110 = (C0462u) r6.m2324j(r04);
        if (r9.m1087t(r110.f1042b) == false) goto L97;
        r9.f1019k.add(r110);
        r9.f1020l.add(null);
    L97:
        r04 = r04 + 1;
        goto L93
    L98:
        int r111 = 0;
    L100:
        if (r111 >= r7.f3432c) goto L105;
        C0462u r05 = (C0462u) r7.m2324j(r111);
        if (r9.m1087t(r05.f1042b) == false) goto L104;
        r9.f1020l.add(r05);
        r9.f1019k.add(null);
    L104:
        r111 = r111 + 1;
        goto L100
    L105:
        C0957b r06 = AbstractC0454m.m1076p();
        int r116 = r06.f3432c;
        WindowId r24 = r3.getWindowId();
        int r117 = r116 - 1;
    L106:
        if (r117 < 0) goto L133;
        Animator r44 = (Animator) r06.m2322h(r117);
        if (r44 == null) goto L132;
        C0451j r62 = (C0451j) r06.getOrDefault(r44, null);
        if (r62 == null) goto L132;
        View r53 = r62.f994a;
        if (r53 == null) goto L132;
        if (r24.equals(r62.f997d) == false) goto L132;
        C0462u r85 = r9.m1086r(r53, true);
        C0462u r102 = r9.m1084n(r53, true);
        if (r85 != null) goto L120;
        if (r102 != null) goto L120;
        r102 = (C0462u) ((C0957b) r9.f1016h.f1044a).getOrDefault(r53, null);
    L120:
        if (r85 != null) goto L122;
        if (r102 == null) goto L132;
    L122:
        C0462u r54 = r62.f996c;
        AbstractC0454m r63 = r62.f998e;
        if (r63.mo1073s(r54, r102) == false) goto L132;
        r63.m1085o().getClass();
        if (r44.isRunning() == false) goto L127;
    L130:
        r44.cancel();
        goto L132
    L127:
        if (r44.isStarted() == true) goto L130;
        r06.remove(r44);
    L132:
        r117 = r117 - 1;
        goto L106
    L133:
        r9.mo1060l(r3, r9.f1015g, r9.f1016h, r9.f1019k, r9.f1020l);
        r9.mo1064z();
        return true;
    L10:
        if (r4.size() <= 0) goto L8;
        r5 = new ArrayList(r4);
        goto L12
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r1) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r3) {
        ViewGroup r32 = this.f1034b;
        r32.getViewTreeObserver().removeOnPreDrawListener(this);
        r32.removeOnAttachStateChangeListener(this);
        ArrayList r33 = AbstractC0458q.f1037c;
        ViewGroup r02 = this.f1034b;
        r33.remove(r02);
        ArrayList r34 = (ArrayList) AbstractC0458q.m1090b().getOrDefault(r02, null);
        if (r34 != null) goto L5;
    L10:
        this.f1033a.m1082i(true);
        return;
    L5:
        if (r34.size() <= 0) goto L10;
        Iterator r35 = r34.iterator();
    L8:
        if (r35.hasNext() == false) goto L10;
        ((AbstractC0454m) r35.next()).mo1063y(r02);
        goto L8
    }
}
