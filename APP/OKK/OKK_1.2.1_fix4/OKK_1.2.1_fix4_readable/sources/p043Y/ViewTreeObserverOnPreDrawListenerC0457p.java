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

    /* JADX WARN: Removed duplicated region for block: B:101:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01e6 A[EDGE_INSN: B:136:0x01e6->B:91:0x01e6 BREAK  A[LOOP:1: B:19:0x0088->B:90:0x01dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01eb  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        AbstractC0454m abstractC0454m;
        int i2;
        C0957b c0957b;
        C0957b c0957b2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        int i6;
        C0451j c0451j;
        View view;
        C0462u c0462u;
        View view2;
        ViewGroup viewGroup = this.f1034b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = AbstractC0458q.f1037c;
        ViewGroup viewGroup2 = this.f1034b;
        int i7 = 1;
        if (!arrayList2.remove(viewGroup2)) {
            return true;
        }
        C0957b c0957bM1090b = AbstractC0458q.m1090b();
        Long l2 = null;
        ArrayList arrayList3 = (ArrayList) c0957bM1090b.getOrDefault(viewGroup2, null);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            abstractC0454m = this.f1033a;
            arrayList3.add(abstractC0454m);
            abstractC0454m.m1079a(new C0456o(this, c0957bM1090b));
            i2 = 0;
            abstractC0454m.m1081h(viewGroup2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0454m) it.next()).mo1063y(viewGroup2);
                }
            }
            abstractC0454m.f1019k = new ArrayList();
            abstractC0454m.f1020l = new ArrayList();
            C0463v c0463v = abstractC0454m.f1015g;
            C0463v c0463v2 = abstractC0454m.f1016h;
            c0957b = new C0957b((C0957b) c0463v.f1044a);
            c0957b2 = new C0957b((C0957b) c0463v2.f1044a);
            i3 = 0;
            while (true) {
                iArr = abstractC0454m.f1018j;
                if (i3 < iArr.length) {
                    break;
                }
                int i8 = iArr[i3];
                if (i8 == i7) {
                    for (int i9 = c0957b.f3432c - 1; i9 >= 0; i9--) {
                        View view3 = (View) c0957b.m2322h(i9);
                        if (view3 != null && abstractC0454m.m1087t(view3) && (c0462u = (C0462u) c0957b2.remove(view3)) != null && abstractC0454m.m1087t(c0462u.f1042b)) {
                            abstractC0454m.f1019k.add((C0462u) c0957b.m2323i(i9));
                            abstractC0454m.f1020l.add(c0462u);
                        }
                    }
                } else if (i8 == 2) {
                    C0957b c0957b3 = (C0957b) c0463v.f1045b;
                    int i10 = c0957b3.f3432c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        View view4 = (View) c0957b3.m2324j(i11);
                        if (view4 != null && abstractC0454m.m1087t(view4)) {
                            View view5 = (View) ((C0957b) c0463v2.f1045b).getOrDefault(c0957b3.m2322h(i11), null);
                            if (view5 != null && abstractC0454m.m1087t(view5)) {
                                C0462u c0462u2 = (C0462u) c0957b.getOrDefault(view4, null);
                                C0462u c0462u3 = (C0462u) c0957b2.getOrDefault(view5, null);
                                if (c0462u2 != null && c0462u3 != null) {
                                    abstractC0454m.f1019k.add(c0462u2);
                                    abstractC0454m.f1020l.add(c0462u3);
                                    c0957b.remove(view4);
                                    c0957b2.remove(view5);
                                }
                            }
                        }
                    }
                } else if (i8 == 3) {
                    SparseArray sparseArray = (SparseArray) c0463v.f1046c;
                    SparseArray sparseArray2 = (SparseArray) c0463v2.f1046c;
                    int size = sparseArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        View view6 = (View) sparseArray.valueAt(i12);
                        if (view6 != null && abstractC0454m.m1087t(view6) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i12))) != null && abstractC0454m.m1087t(view2)) {
                            C0462u c0462u4 = (C0462u) c0957b.getOrDefault(view6, null);
                            C0462u c0462u5 = (C0462u) c0957b2.getOrDefault(view2, null);
                            if (c0462u4 != null && c0462u5 != null) {
                                abstractC0454m.f1019k.add(c0462u4);
                                abstractC0454m.f1020l.add(c0462u5);
                                c0957b.remove(view6);
                                c0957b2.remove(view2);
                            }
                        }
                    }
                } else if (i8 == 4) {
                    C0960e c0960e = (C0960e) c0463v.f1047d;
                    int iM2311f = c0960e.m2311f();
                    int i13 = i2;
                    while (i13 < iM2311f) {
                        View view7 = (View) c0960e.m2312g(i13);
                        if (view7 != null && abstractC0454m.m1087t(view7)) {
                            if (c0960e.f3405a) {
                                c0960e.m2308c();
                            }
                            View view8 = (View) ((C0960e) c0463v2.f1047d).m2309d(c0960e.f3406b[i13], l2);
                            abstractC0454m = abstractC0454m;
                            if (view8 != null && abstractC0454m.m1087t(view8)) {
                                C0462u c0462u6 = (C0462u) c0957b.getOrDefault(view7, l2);
                                C0462u c0462u7 = (C0462u) c0957b2.getOrDefault(view8, l2);
                                if (c0462u6 != null && c0462u7 != null) {
                                    abstractC0454m.f1019k.add(c0462u6);
                                    abstractC0454m.f1020l.add(c0462u7);
                                    c0957b.remove(view7);
                                    c0957b2.remove(view8);
                                }
                            }
                        }
                        i13++;
                        l2 = null;
                    }
                }
                i3++;
                i2 = 0;
                l2 = null;
                i7 = 1;
            }
            for (i4 = 0; i4 < c0957b.f3432c; i4++) {
                C0462u c0462u8 = (C0462u) c0957b.m2324j(i4);
                if (abstractC0454m.m1087t(c0462u8.f1042b)) {
                    abstractC0454m.f1019k.add(c0462u8);
                    abstractC0454m.f1020l.add(null);
                }
            }
            for (i5 = 0; i5 < c0957b2.f3432c; i5++) {
                C0462u c0462u9 = (C0462u) c0957b2.m2324j(i5);
                if (abstractC0454m.m1087t(c0462u9.f1042b)) {
                    abstractC0454m.f1020l.add(c0462u9);
                    abstractC0454m.f1019k.add(null);
                }
            }
            C0957b c0957bM1076p = AbstractC0454m.m1076p();
            int i14 = c0957bM1076p.f3432c;
            WindowId windowId = viewGroup2.getWindowId();
            for (i6 = i14 - 1; i6 >= 0; i6--) {
                Animator animator = (Animator) c0957bM1076p.m2322h(i6);
                if (animator != null && (c0451j = (C0451j) c0957bM1076p.getOrDefault(animator, null)) != null && (view = c0451j.f994a) != null && windowId.equals(c0451j.f997d)) {
                    C0462u c0462uM1086r = abstractC0454m.m1086r(view, true);
                    C0462u c0462uM1084n = abstractC0454m.m1084n(view, true);
                    if (c0462uM1086r == null && c0462uM1084n == null) {
                        c0462uM1084n = (C0462u) ((C0957b) abstractC0454m.f1016h.f1044a).getOrDefault(view, null);
                    }
                    if (c0462uM1086r != null || c0462uM1084n != null) {
                        C0462u c0462u10 = c0451j.f996c;
                        AbstractC0454m abstractC0454m2 = c0451j.f998e;
                        if (abstractC0454m2.mo1073s(c0462u10, c0462uM1084n)) {
                            abstractC0454m2.m1085o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                c0957bM1076p.remove(animator);
                            }
                        }
                    }
                }
            }
            abstractC0454m.mo1060l(viewGroup2, abstractC0454m.f1015g, abstractC0454m.f1016h, abstractC0454m.f1019k, abstractC0454m.f1020l);
            abstractC0454m.mo1064z();
            return true;
        }
        arrayList3 = new ArrayList();
        c0957bM1090b.put(viewGroup2, arrayList3);
        abstractC0454m = this.f1033a;
        arrayList3.add(abstractC0454m);
        abstractC0454m.m1079a(new C0456o(this, c0957bM1090b));
        i2 = 0;
        abstractC0454m.m1081h(viewGroup2, false);
        if (arrayList != null) {
        }
        abstractC0454m.f1019k = new ArrayList();
        abstractC0454m.f1020l = new ArrayList();
        C0463v c0463v3 = abstractC0454m.f1015g;
        C0463v c0463v22 = abstractC0454m.f1016h;
        c0957b = new C0957b((C0957b) c0463v3.f1044a);
        c0957b2 = new C0957b((C0957b) c0463v22.f1044a);
        i3 = 0;
        while (true) {
            iArr = abstractC0454m.f1018j;
            if (i3 < iArr.length) {
            }
            i3++;
            i2 = 0;
            l2 = null;
            i7 = 1;
        }
        while (i4 < c0957b.f3432c) {
        }
        while (i5 < c0957b2.f3432c) {
        }
        C0957b c0957bM1076p2 = AbstractC0454m.m1076p();
        int i142 = c0957bM1076p2.f3432c;
        WindowId windowId2 = viewGroup2.getWindowId();
        while (i6 >= 0) {
        }
        abstractC0454m.mo1060l(viewGroup2, abstractC0454m.f1015g, abstractC0454m.f1016h, abstractC0454m.f1019k, abstractC0454m.f1020l);
        abstractC0454m.mo1064z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f1034b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = AbstractC0458q.f1037c;
        ViewGroup viewGroup2 = this.f1034b;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) AbstractC0458q.m1090b().getOrDefault(viewGroup2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0454m) it.next()).mo1063y(viewGroup2);
            }
        }
        this.f1033a.m1082i(true);
    }
}
