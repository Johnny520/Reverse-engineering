package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000.AbstractC2185lE;
import p000.C1007Xc;
import p000.C1138ad;
import p000.C1218bd;
import p000.C1261cd;
import p000.RunnableC0964Wc;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1156e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4030a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RecyclerView f4031b;

    public /* synthetic */ RunnableC1156e(RecyclerView recyclerView, int i) {
        this.f4030a = i;
        this.f4031b = recyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0119  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i = this.f4030a;
        RecyclerView recyclerView = this.f4031b;
        switch (i) {
            case 0:
                if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.mIsAttached) {
                        recyclerView.requestLayout();
                    } else if (recyclerView.mLayoutSuppressed) {
                        recyclerView.mLayoutWasDefered = true;
                    } else {
                        recyclerView.consumePendingUpdateOperations();
                    }
                    break;
                }
                break;
            default:
                AbstractC1159h abstractC1159h = recyclerView.mItemAnimator;
                if (abstractC1159h != null) {
                    C1261cd c1261cd = (C1261cd) abstractC1159h;
                    long j = c1261cd.f4036d;
                    ArrayList<AbstractC1166o> arrayList = c1261cd.f4277h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c1261cd.f4279j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c1261cd.f4280k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c1261cd.f4278i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                        for (AbstractC1166o abstractC1166o : arrayList) {
                            View view = abstractC1166o.itemView;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            c1261cd.f4286q.add(abstractC1166o);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C1007Xc(c1261cd, abstractC1166o, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z2 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            c1261cd.f4282m.add(arrayList5);
                            arrayList2.clear();
                            RunnableC0964Wc runnableC0964Wc = new RunnableC0964Wc(c1261cd, arrayList5, 0);
                            if (z2) {
                                runnableC0964Wc.run();
                            } else {
                                View view2 = ((C1218bd) arrayList5.get(0)).f4152a.itemView;
                                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                                view2.postOnAnimationDelayed(runnableC0964Wc, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            c1261cd.f4283n.add(arrayList6);
                            arrayList3.clear();
                            RunnableC0964Wc runnableC0964Wc2 = new RunnableC0964Wc(c1261cd, arrayList6, 1);
                            if (z2) {
                                runnableC0964Wc2.run();
                            } else {
                                View view3 = ((C1138ad) arrayList6.get(0)).f3593a.itemView;
                                WeakHashMap weakHashMap2 = AbstractC2185lE.f7617a;
                                view3.postOnAnimationDelayed(runnableC0964Wc2, j);
                            }
                        }
                        if (zIsEmpty4) {
                            z = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            c1261cd.f4281l.add(arrayList7);
                            arrayList4.clear();
                            RunnableC0964Wc runnableC0964Wc3 = new RunnableC0964Wc(c1261cd, arrayList7, 2);
                            if (z2 && zIsEmpty2 && zIsEmpty3) {
                                runnableC0964Wc3.run();
                                z = false;
                            } else {
                                if (z2) {
                                    j = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? c1261cd.f4037e : 0L, zIsEmpty3 ? 0L : c1261cd.f4038f) + j;
                                z = false;
                                View view4 = ((AbstractC1166o) arrayList7.get(0)).itemView;
                                WeakHashMap weakHashMap3 = AbstractC2185lE.f7617a;
                                view4.postOnAnimationDelayed(runnableC0964Wc3, jMax);
                            }
                        }
                    }
                }
                recyclerView.mPostedAnimatorRunner = z;
                break;
        }
    }
}
