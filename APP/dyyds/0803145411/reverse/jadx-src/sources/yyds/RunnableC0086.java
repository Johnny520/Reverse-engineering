package yyds;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛱᛲᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0086 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f678;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C1213 f679;

    public /* synthetic */ RunnableC0086(C1213 c1213, int i) {
        this.f678 = i;
        this.f679 = c1213;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0115  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i = this.f678;
        C1213 c1213 = this.f679;
        switch (i) {
            case 0:
                if (c1213.f5547 && !c1213.isLayoutRequested()) {
                    if (!c1213.f5557) {
                        c1213.requestLayout();
                    } else if (c1213.f5546) {
                        c1213.f5591 = true;
                    } else {
                        c1213.m2433();
                    }
                    break;
                }
                break;
            default:
                AbstractC2411 abstractC2411 = c1213.f5532;
                if (abstractC2411 != null) {
                    C2446 c2446 = (C2446) abstractC2411;
                    long j = c2446.f11856;
                    ArrayList<AbstractC0185> arrayList = c2446.f12044;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c2446.f12053;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c2446.f12051;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c2446.f12046;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                        for (AbstractC0185 abstractC0185 : arrayList) {
                            View view = abstractC0185.f1093;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            c2446.f12049.add(abstractC0185);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C0915(c2446, abstractC0185, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z2 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            c2446.f12045.add(arrayList5);
                            arrayList2.clear();
                            RunnableC1346 runnableC1346 = new RunnableC1346(c2446, arrayList5, 0);
                            if (z2) {
                                runnableC1346.run();
                            } else {
                                View view2 = ((C0307) arrayList5.get(0)).f1611.f1093;
                                WeakHashMap weakHashMap = AbstractC1640.f8352;
                                view2.postOnAnimationDelayed(runnableC1346, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            c2446.f12043.add(arrayList6);
                            arrayList3.clear();
                            RunnableC1346 runnableC13462 = new RunnableC1346(c2446, arrayList6, 1);
                            if (z2) {
                                runnableC13462.run();
                            } else {
                                View view3 = ((C0641) arrayList6.get(0)).f3078.f1093;
                                WeakHashMap weakHashMap2 = AbstractC1640.f8352;
                                view3.postOnAnimationDelayed(runnableC13462, j);
                            }
                        }
                        if (zIsEmpty4) {
                            z = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            c2446.f12052.add(arrayList7);
                            arrayList4.clear();
                            RunnableC1346 runnableC13463 = new RunnableC1346(c2446, arrayList7, 2);
                            if (z2 && zIsEmpty2 && zIsEmpty3) {
                                runnableC13463.run();
                                z = false;
                            } else {
                                if (z2) {
                                    j = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? c2446.f11851 : 0L, zIsEmpty3 ? 0L : c2446.f11855) + j;
                                z = false;
                                View view4 = ((AbstractC0185) arrayList7.get(0)).f1093;
                                WeakHashMap weakHashMap3 = AbstractC1640.f8352;
                                view4.postOnAnimationDelayed(runnableC13463, jMax);
                            }
                        }
                    }
                }
                c1213.f5584 = z;
                break;
        }
    }
}
