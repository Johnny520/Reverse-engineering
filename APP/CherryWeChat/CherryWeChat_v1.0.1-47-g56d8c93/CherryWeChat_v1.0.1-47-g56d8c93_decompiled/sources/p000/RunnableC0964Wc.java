package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.AbstractC1166o;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Wc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0964Wc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3003a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f3004b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1261cd f3005c;

    public /* synthetic */ RunnableC0964Wc(C1261cd c1261cd, ArrayList arrayList, int i) {
        this.f3003a = i;
        this.f3005c = c1261cd;
        this.f3004b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3003a) {
            case 0:
                ArrayList arrayList = this.f3004b;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C1261cd c1261cd = this.f3005c;
                    if (!zHasNext) {
                        arrayList.clear();
                        c1261cd.f4282m.remove(arrayList);
                    } else {
                        C1218bd c1218bd = (C1218bd) it.next();
                        AbstractC1166o abstractC1166o = c1218bd.f4152a;
                        int i = c1218bd.f4153b;
                        int i2 = c1218bd.f4154c;
                        int i3 = c1218bd.f4155d;
                        int i4 = c1218bd.f4156e;
                        c1261cd.getClass();
                        View view = abstractC1166o.itemView;
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        if (i5 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c1261cd.f4285p.add(abstractC1166o);
                        viewPropertyAnimatorAnimate.setDuration(c1261cd.f4037e).setListener(new C1050Yc(c1261cd, abstractC1166o, i5, view, i6, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f3004b;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    C1261cd c1261cd2 = this.f3005c;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c1261cd2.f4283n.remove(arrayList2);
                        break;
                    } else {
                        C1138ad c1138ad = (C1138ad) it2.next();
                        ArrayList arrayList3 = c1261cd2.f4287r;
                        long j = c1261cd2.f4038f;
                        AbstractC1166o abstractC1166o2 = c1138ad.f3593a;
                        View view2 = abstractC1166o2 == null ? null : abstractC1166o2.itemView;
                        AbstractC1166o abstractC1166o3 = c1138ad.f3594b;
                        View view3 = abstractC1166o3 != null ? abstractC1166o3.itemView : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c1138ad.f3593a);
                            duration.translationX(c1138ad.f3597e - c1138ad.f3595c);
                            duration.translationY(c1138ad.f3598f - c1138ad.f3596d);
                            duration.alpha(0.0f).setListener(new C1093Zc(c1261cd2, c1138ad, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c1138ad.f3594b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C1093Zc(c1261cd2, c1138ad, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f3004b;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    C1261cd c1261cd3 = this.f3005c;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        c1261cd3.f4281l.remove(arrayList4);
                    } else {
                        AbstractC1166o abstractC1166o4 = (AbstractC1166o) it3.next();
                        c1261cd3.getClass();
                        View view4 = abstractC1166o4.itemView;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c1261cd3.f4284o.add(abstractC1166o4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c1261cd3.f4035c).setListener(new C1007Xc(c1261cd3, abstractC1166o4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
