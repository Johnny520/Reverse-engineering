package p144;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import androidx.collection.C1104;
import androidx.collection.C1110;
import androidx.compose.animation.core.C1171;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC8307 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public ViewGroup f20576;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC8312 f20577;

    /* JADX WARN: Removed duplicated region for block: B:100:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e3 A[EDGE_INSN: B:141:0x01e3->B:90:0x01e3 BREAK  A[LOOP:1: B:19:0x0085->B:89:0x01dc], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ea  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        C1104 c1104;
        C1104 c11042;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        ArrayList arrayList2;
        int i5;
        int i6;
        C8313 c8313;
        boolean z;
        C8298 c8298;
        View view;
        View view2;
        boolean z2;
        AbstractC8312 abstractC8312 = this.f20577;
        ViewGroup viewGroup = this.f20576;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        boolean z3 = true;
        if (!AbstractC8308.f20578.remove(viewGroup)) {
            return true;
        }
        C1104 c1104M13255 = AbstractC8308.m13255();
        ArrayList arrayList3 = (ArrayList) c1104M13255.get(viewGroup);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            arrayList3.add(abstractC8312);
            abstractC8312.m13269(new C8303(this, c1104M13255));
            i = 0;
            abstractC8312.m13275(viewGroup, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC8312) it.next()).mo13233(viewGroup);
                }
            }
            abstractC8312.f20599 = new ArrayList();
            abstractC8312.f20598 = new ArrayList();
            C1171 c1171 = abstractC8312.f20612;
            C1171 c11712 = abstractC8312.f20609;
            c1104 = new C1104((C1104) c1171.f1440);
            c11042 = new C1104((C1104) c11712.f1440);
            i2 = 0;
            while (true) {
                iArr = abstractC8312.f20600;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == z3) {
                    z = z3;
                    for (int i8 = c1104.f1339 - 1; i8 >= 0; i8--) {
                        View view3 = (View) c1104.m1422(i8);
                        if (view3 != null && abstractC8312.m13271(view3) && (c8298 = (C8298) c11042.remove(view3)) != null && abstractC8312.m13271(c8298.f20554)) {
                            abstractC8312.f20599.add((C8298) c1104.mo1428(i8));
                            abstractC8312.f20598.add(c8298);
                        }
                    }
                } else if (i7 == 2) {
                    z = z3;
                    C1104 c11043 = (C1104) c1171.f1438;
                    C1104 c11044 = (C1104) c11712.f1438;
                    int i9 = c11043.f1339;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) c11043.m1431(i10);
                        if (view4 != null && abstractC8312.m13271(view4) && (view = (View) c11044.get((String) c11043.m1422(i10))) != null && abstractC8312.m13271(view)) {
                            C8298 c82982 = (C8298) c1104.get(view4);
                            C8298 c82983 = (C8298) c11042.get(view);
                            if (c82982 != null && c82983 != null) {
                                abstractC8312.f20599.add(c82982);
                                abstractC8312.f20598.add(c82983);
                                c1104.remove(view4);
                                c11042.remove(view);
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 4) {
                        C1110 c1110 = (C1110) c1171.f1439;
                        C1110 c11102 = (C1110) c11712.f1439;
                        int iM1388 = c1110.m1388();
                        int i11 = i;
                        while (i11 < iM1388) {
                            View view5 = (View) c1110.m1389(i11);
                            if (view5 == null || !abstractC8312.m13271(view5)) {
                                z2 = z3;
                            } else {
                                boolean z4 = z3;
                                View view6 = (View) c11102.m1386(c1110.m1384(i11));
                                if (view6 == null || !abstractC8312.m13271(view6)) {
                                    z2 = z4;
                                } else {
                                    C8298 c82984 = (C8298) c1104.get(view5);
                                    C8298 c82985 = (C8298) c11042.get(view6);
                                    if (c82984 != null && c82985 != null) {
                                        z2 = z4;
                                        abstractC8312.f20599.add(c82984);
                                        abstractC8312.f20598.add(c82985);
                                        c1104.remove(view5);
                                        c11042.remove(view6);
                                    }
                                }
                            }
                            i11++;
                            z3 = z2;
                        }
                    }
                    z = z3;
                } else {
                    z = z3;
                    SparseArray sparseArray = (SparseArray) c1171.f1441;
                    SparseArray sparseArray2 = (SparseArray) c11712.f1441;
                    int size = sparseArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        View view7 = (View) sparseArray.valueAt(i12);
                        if (view7 != null && abstractC8312.m13271(view7) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i12))) != null && abstractC8312.m13271(view2)) {
                            C8298 c82986 = (C8298) c1104.get(view7);
                            C8298 c82987 = (C8298) c11042.get(view2);
                            if (c82986 != null && c82987 != null) {
                                abstractC8312.f20599.add(c82986);
                                abstractC8312.f20598.add(c82987);
                                c1104.remove(view7);
                                c11042.remove(view2);
                            }
                        }
                    }
                }
                i2++;
                z3 = z;
                i = 0;
            }
            boolean z5 = z3;
            for (i3 = 0; i3 < c1104.f1339; i3++) {
                C8298 c82988 = (C8298) c1104.m1431(i3);
                if (abstractC8312.m13271(c82988.f20554)) {
                    abstractC8312.f20599.add(c82988);
                    abstractC8312.f20598.add(null);
                }
            }
            for (i4 = 0; i4 < c11042.f1339; i4++) {
                C8298 c82989 = (C8298) c11042.m1431(i4);
                if (abstractC8312.m13271(c82989.f20554)) {
                    abstractC8312.f20598.add(c82989);
                    abstractC8312.f20599.add(null);
                }
            }
            C1104 c1104M13265 = AbstractC8312.m13265();
            int i13 = c1104M13265.f1339;
            WindowId windowId = viewGroup.getWindowId();
            arrayList2 = new ArrayList();
            i5 = i13 - 1;
            while (i5 >= 0) {
                Animator animator = (Animator) c1104M13265.m1422(i5);
                if (animator != null && (c8313 = (C8313) c1104M13265.get(animator)) != null) {
                    AbstractC8312 abstractC83122 = c8313.f20617;
                    View view8 = c8313.f20621;
                    if (view8 != null && windowId.equals(c8313.f20618)) {
                        C8298 c829810 = c8313.f20619;
                        boolean z6 = z5;
                        C8298 c8298M13270 = abstractC8312.m13270(view8, z6);
                        C8298 c8298M13274 = abstractC8312.m13274(view8, z6);
                        if (c8298M13270 == null && c8298M13274 == null) {
                            c8298M13274 = (C8298) ((C1104) abstractC8312.f20609.f1440).get(view8);
                        }
                        if ((c8298M13270 != null || c8298M13274 != null) && abstractC83122.mo13261(c829810, c8298M13274)) {
                            abstractC83122.m13272().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                c1104M13265.mo1428(i5);
                            }
                        }
                    }
                }
                i5--;
                z5 = true;
            }
            for (i6 = 0; i6 < arrayList2.size(); i6++) {
                AbstractC8312 abstractC83123 = (AbstractC8312) arrayList2.get(i6);
                abstractC83123.m13266(abstractC83123, InterfaceC8311.f20588);
                if (!abstractC83123.f20604) {
                    abstractC83123.f20604 = true;
                    abstractC83123.m13266(abstractC83123, InterfaceC8311.f20587);
                }
            }
            abstractC8312.mo13242(viewGroup, abstractC8312.f20612, abstractC8312.f20609, abstractC8312.f20599, abstractC8312.f20598);
            abstractC8312.mo13232();
            return true;
        }
        arrayList3 = new ArrayList();
        c1104M13255.put(viewGroup, arrayList3);
        arrayList3.add(abstractC8312);
        abstractC8312.m13269(new C8303(this, c1104M13255));
        i = 0;
        abstractC8312.m13275(viewGroup, false);
        if (arrayList != null) {
        }
        abstractC8312.f20599 = new ArrayList();
        abstractC8312.f20598 = new ArrayList();
        C1171 c11713 = abstractC8312.f20612;
        C1171 c117122 = abstractC8312.f20609;
        c1104 = new C1104((C1104) c11713.f1440);
        c11042 = new C1104((C1104) c117122.f1440);
        i2 = 0;
        while (true) {
            iArr = abstractC8312.f20600;
            if (i2 < iArr.length) {
            }
            i2++;
            z3 = z;
            i = 0;
        }
        boolean z52 = z3;
        while (i3 < c1104.f1339) {
        }
        while (i4 < c11042.f1339) {
        }
        C1104 c1104M132652 = AbstractC8312.m13265();
        int i132 = c1104M132652.f1339;
        WindowId windowId2 = viewGroup.getWindowId();
        arrayList2 = new ArrayList();
        i5 = i132 - 1;
        while (i5 >= 0) {
        }
        while (i6 < arrayList2.size()) {
        }
        abstractC8312.mo13242(viewGroup, abstractC8312.f20612, abstractC8312.f20609, abstractC8312.f20599, abstractC8312.f20598);
        abstractC8312.mo13232();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f20576;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        AbstractC8308.f20578.remove(viewGroup);
        ArrayList arrayList = (ArrayList) AbstractC8308.m13255().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC8312) it.next()).mo13233(viewGroup);
            }
        }
        this.f20577.m13276(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
