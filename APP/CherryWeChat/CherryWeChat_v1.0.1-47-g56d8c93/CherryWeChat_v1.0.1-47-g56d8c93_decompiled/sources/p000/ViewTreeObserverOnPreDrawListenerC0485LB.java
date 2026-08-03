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

    /* JADX WARN: Removed duplicated region for block: B:101:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f6 A[EDGE_INSN: B:135:0x01f6->B:91:0x01f6 BREAK  A[LOOP:1: B:19:0x0085->B:90:0x01ec], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fd  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        C2428qs c2428qs;
        C0521M4 c0521m4;
        C0521M4 c0521m42;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        C0270GB c0270gb;
        C2428qs c2428qs2;
        boolean z;
        C0657PB c0657pb;
        View view;
        View view2;
        C2428qs c2428qs3;
        boolean z2;
        AbstractC0356IB abstractC0356IB = this.f1592a;
        ViewGroup viewGroup = this.f1593b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!AbstractC0528MB.f1723c.remove(viewGroup)) {
            return true;
        }
        C0521M4 c0521m4M1024b = AbstractC0528MB.m1024b();
        ArrayList arrayList2 = (ArrayList) c0521m4M1024b.get(viewGroup);
        if (arrayList2 != null) {
            arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
            arrayList2.add(abstractC0356IB);
            abstractC0356IB.m766a(new C0442KB(this, c0521m4M1024b));
            i = 0;
            abstractC0356IB.m772h(viewGroup, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0356IB) it.next()).mo787y(viewGroup);
                }
            }
            abstractC0356IB.f1206k = new ArrayList();
            abstractC0356IB.f1207l = new ArrayList();
            C2428qs c2428qs4 = abstractC0356IB.f1202g;
            c2428qs = abstractC0356IB.f1203h;
            c0521m4 = new C0521M4((C0521M4) c2428qs4.f8520a);
            c0521m42 = new C0521M4((C0521M4) c2428qs.f8520a);
            i2 = 0;
            while (true) {
                iArr = abstractC0356IB.f1205j;
                if (i2 < iArr.length) {
                    break;
                }
                int i6 = iArr[i2];
                if (i6 == z3) {
                    c2428qs2 = c2428qs;
                    z = z3;
                    for (int i7 = c0521m4.f8818c - 1; i7 >= 0; i7--) {
                        View view3 = (View) c0521m4.m5002f(i7);
                        if (view3 != null && abstractC0356IB.m783t(view3) && (c0657pb = (C0657PB) c0521m42.remove(view3)) != null && abstractC0356IB.m783t(c0657pb.f2100b)) {
                            abstractC0356IB.f1206k.add((C0657PB) c0521m4.mo4h(i7));
                            abstractC0356IB.f1207l.add(c0657pb);
                        }
                    }
                } else if (i6 == 2) {
                    c2428qs2 = c2428qs;
                    z = z3;
                    C0521M4 c0521m43 = (C0521M4) c2428qs4.f8523d;
                    C0521M4 c0521m44 = (C0521M4) c2428qs2.f8523d;
                    int i8 = c0521m43.f8818c;
                    for (int i9 = 0; i9 < i8; i9++) {
                        View view4 = (View) c0521m43.m5003j(i9);
                        if (view4 != null && abstractC0356IB.m783t(view4) && (view = (View) c0521m44.get(c0521m43.m5002f(i9))) != null && abstractC0356IB.m783t(view)) {
                            C0657PB c0657pb2 = (C0657PB) c0521m4.get(view4);
                            C0657PB c0657pb3 = (C0657PB) c0521m42.get(view);
                            if (c0657pb2 != null && c0657pb3 != null) {
                                abstractC0356IB.f1206k.add(c0657pb2);
                                abstractC0356IB.f1207l.add(c0657pb3);
                                c0521m4.remove(view4);
                                c0521m42.remove(view);
                            }
                        }
                    }
                } else if (i6 == 3) {
                    z = z3;
                    SparseArray sparseArray = (SparseArray) c2428qs4.f8521b;
                    c2428qs2 = c2428qs;
                    SparseArray sparseArray2 = (SparseArray) c2428qs2.f8521b;
                    int size = sparseArray.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        View view5 = (View) sparseArray.valueAt(i10);
                        if (view5 != null && abstractC0356IB.m783t(view5) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i10))) != null && abstractC0356IB.m783t(view2)) {
                            C0657PB c0657pb4 = (C0657PB) c0521m4.get(view5);
                            C0657PB c0657pb5 = (C0657PB) c0521m42.get(view2);
                            if (c0657pb4 != null && c0657pb5 != null) {
                                abstractC0356IB.f1206k.add(c0657pb4);
                                abstractC0356IB.f1207l.add(c0657pb5);
                                c0521m4.remove(view5);
                                c0521m42.remove(view2);
                            }
                        }
                    }
                } else if (i6 != 4) {
                    c2428qs2 = c2428qs;
                    z = z3;
                } else {
                    C2640vp c2640vp = (C2640vp) c2428qs4.f8522c;
                    C2640vp c2640vp2 = (C2640vp) c2428qs.f8522c;
                    int iM5172g = c2640vp.m5172g();
                    int i11 = i;
                    while (i11 < iM5172g) {
                        View view6 = (View) c2640vp.m5173h(i11);
                        if (view6 == null || !abstractC0356IB.m783t(view6)) {
                            c2428qs3 = c2428qs;
                        } else {
                            c2428qs3 = c2428qs;
                            View view7 = (View) c2640vp2.m5167b(c2640vp.m5169d(i11));
                            if (view7 != null && abstractC0356IB.m783t(view7)) {
                                C0657PB c0657pb6 = (C0657PB) c0521m4.get(view6);
                                C0657PB c0657pb7 = (C0657PB) c0521m42.get(view7);
                                if (c0657pb6 != null && c0657pb7 != null) {
                                    z2 = z3;
                                    abstractC0356IB.f1206k.add(c0657pb6);
                                    abstractC0356IB.f1207l.add(c0657pb7);
                                    c0521m4.remove(view6);
                                    c0521m42.remove(view7);
                                }
                            }
                            i11++;
                            c2428qs = c2428qs3;
                            z3 = z2;
                        }
                        z2 = z3;
                        i11++;
                        c2428qs = c2428qs3;
                        z3 = z2;
                    }
                    z = z3;
                    c2428qs2 = c2428qs;
                }
                i2++;
                c2428qs = c2428qs2;
                z3 = z;
                i = 0;
            }
            boolean z4 = z3;
            for (i3 = 0; i3 < c0521m4.f8818c; i3++) {
                C0657PB c0657pb8 = (C0657PB) c0521m4.m5003j(i3);
                if (abstractC0356IB.m783t(c0657pb8.f2100b)) {
                    abstractC0356IB.f1206k.add(c0657pb8);
                    abstractC0356IB.f1207l.add(null);
                }
            }
            for (i4 = 0; i4 < c0521m42.f8818c; i4++) {
                C0657PB c0657pb9 = (C0657PB) c0521m42.m5003j(i4);
                if (abstractC0356IB.m783t(c0657pb9.f2100b)) {
                    abstractC0356IB.f1207l.add(c0657pb9);
                    abstractC0356IB.f1206k.add(null);
                }
            }
            C0521M4 c0521m4M756p = AbstractC0356IB.m756p();
            int i12 = c0521m4M756p.f8818c;
            WindowId windowId = viewGroup.getWindowId();
            i5 = i12 - 1;
            while (i5 >= 0) {
                Animator animator = (Animator) c0521m4M756p.m5002f(i5);
                if (animator != null && (c0270gb = (C0270GB) c0521m4M756p.get(animator)) != null) {
                    AbstractC0356IB abstractC0356IB2 = c0270gb.f874e;
                    View view8 = c0270gb.f870a;
                    if (view8 != null && windowId.equals(c0270gb.f873d)) {
                        C0657PB c0657pb10 = c0270gb.f872c;
                        boolean z5 = z4;
                        C0657PB c0657pbM781r = abstractC0356IB.m781r(view8, z5);
                        C0657PB c0657pbM778n = abstractC0356IB.m778n(view8, z5);
                        if (c0657pbM781r == null && c0657pbM778n == null) {
                            c0657pbM778n = (C0657PB) ((C0521M4) abstractC0356IB.f1203h.f8520a).get(view8);
                        }
                        if ((c0657pbM781r != null || c0657pbM778n != null) && abstractC0356IB2.mo782s(c0657pb10, c0657pbM778n)) {
                            abstractC0356IB2.m779o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                c0521m4M756p.remove(animator);
                            }
                        }
                    }
                }
                i5--;
                z4 = true;
            }
            abstractC0356IB.mo776l(viewGroup, abstractC0356IB.f1202g, abstractC0356IB.f1203h, abstractC0356IB.f1206k, abstractC0356IB.f1207l);
            abstractC0356IB.mo788z();
            return true;
        }
        arrayList2 = new ArrayList();
        c0521m4M1024b.put(viewGroup, arrayList2);
        arrayList2.add(abstractC0356IB);
        abstractC0356IB.m766a(new C0442KB(this, c0521m4M1024b));
        i = 0;
        abstractC0356IB.m772h(viewGroup, false);
        if (arrayList != null) {
        }
        abstractC0356IB.f1206k = new ArrayList();
        abstractC0356IB.f1207l = new ArrayList();
        C2428qs c2428qs42 = abstractC0356IB.f1202g;
        c2428qs = abstractC0356IB.f1203h;
        c0521m4 = new C0521M4((C0521M4) c2428qs42.f8520a);
        c0521m42 = new C0521M4((C0521M4) c2428qs.f8520a);
        i2 = 0;
        while (true) {
            iArr = abstractC0356IB.f1205j;
            if (i2 < iArr.length) {
            }
            i2++;
            c2428qs = c2428qs2;
            z3 = z;
            i = 0;
        }
        boolean z42 = z3;
        while (i3 < c0521m4.f8818c) {
        }
        while (i4 < c0521m42.f8818c) {
        }
        C0521M4 c0521m4M756p2 = AbstractC0356IB.m756p();
        int i122 = c0521m4M756p2.f8818c;
        WindowId windowId2 = viewGroup.getWindowId();
        i5 = i122 - 1;
        while (i5 >= 0) {
        }
        abstractC0356IB.mo776l(viewGroup, abstractC0356IB.f1202g, abstractC0356IB.f1203h, abstractC0356IB.f1206k, abstractC0356IB.f1207l);
        abstractC0356IB.mo788z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f1593b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        AbstractC0528MB.f1723c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) AbstractC0528MB.m1024b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC0356IB) it.next()).mo787y(viewGroup);
            }
        }
        this.f1592a.m773i(true);
    }
}
