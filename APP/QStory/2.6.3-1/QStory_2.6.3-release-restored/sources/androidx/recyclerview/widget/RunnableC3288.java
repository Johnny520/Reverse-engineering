package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.AbstractC3103;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3288 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ RecyclerView f7650;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7651;

    public /* synthetic */ RunnableC3288(RecyclerView recyclerView, int i) {
        this.f7651 = i;
        this.f7650 = recyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0115  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i = this.f7651;
        RecyclerView recyclerView = this.f7650;
        switch (i) {
            case 0:
                if (recyclerView.f7543 && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f7545) {
                        recyclerView.requestLayout();
                    } else if (recyclerView.f7536) {
                        recyclerView.f7533 = true;
                    } else {
                        recyclerView.m5288();
                    }
                    break;
                }
                break;
            default:
                AbstractC3369 abstractC3369 = recyclerView.f7599;
                if (abstractC3369 != null) {
                    C3338 c3338 = (C3338) abstractC3369;
                    long j = c3338.f7985;
                    ArrayList<AbstractC3317> arrayList = c3338.f7850;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c3338.f7855;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c3338.f7852;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c3338.f7854;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                        for (AbstractC3317 abstractC3317 : arrayList) {
                            View view = abstractC3317.itemView;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            c3338.f7846.add(abstractC3317);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C3343(c3338, abstractC3317, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z2 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            c3338.f7845.add(arrayList5);
                            arrayList2.clear();
                            RunnableC3344 runnableC3344 = new RunnableC3344(c3338, arrayList5, 0);
                            if (z2) {
                                runnableC3344.run();
                            } else {
                                View view2 = ((C3346) arrayList5.get(0)).f7909.itemView;
                                WeakHashMap weakHashMap = AbstractC3103.f6939;
                                view2.postOnAnimationDelayed(runnableC3344, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            c3338.f7844.add(arrayList6);
                            arrayList3.clear();
                            RunnableC3344 runnableC33442 = new RunnableC3344(c3338, arrayList6, 1);
                            if (z2) {
                                runnableC33442.run();
                            } else {
                                View view3 = ((C3345) arrayList6.get(0)).f7904.itemView;
                                WeakHashMap weakHashMap2 = AbstractC3103.f6939;
                                view3.postOnAnimationDelayed(runnableC33442, j);
                            }
                        }
                        if (zIsEmpty4) {
                            z = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            c3338.f7853.add(arrayList7);
                            arrayList4.clear();
                            RunnableC3344 runnableC33443 = new RunnableC3344(c3338, arrayList7, 2);
                            if (z2 && zIsEmpty2 && zIsEmpty3) {
                                runnableC33443.run();
                                z = false;
                            } else {
                                if (z2) {
                                    j = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? c3338.f7984 : 0L, zIsEmpty3 ? 0L : c3338.f7983) + j;
                                z = false;
                                View view4 = ((AbstractC3317) arrayList7.get(0)).itemView;
                                WeakHashMap weakHashMap3 = AbstractC3103.f6939;
                                view4.postOnAnimationDelayed(runnableC33443, jMax);
                            }
                        }
                    }
                }
                recyclerView.f7560 = z;
                break;
        }
    }
}
