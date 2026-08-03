package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C1206k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.d */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1199d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f5074a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1206k f5075b;

    public RunnableC1199d(C1206k c1206k, ArrayList arrayList) {
        this.f5075b = c1206k;
        this.f5074a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f5074a;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C1206k c1206k = this.f5075b;
            if (!zHasNext) {
                arrayList.clear();
                c1206k.f5107n.remove(arrayList);
                return;
            }
            C1206k.a aVar = (C1206k.a) it.next();
            c1206k.getClass();
            RecyclerView.AbstractC1163A abstractC1163A = aVar.f5112a;
            View view = abstractC1163A == null ? null : abstractC1163A.f4891a;
            RecyclerView.AbstractC1163A abstractC1163A2 = aVar.f5113b;
            View view2 = abstractC1163A2 != null ? abstractC1163A2.f4891a : null;
            ArrayList<RecyclerView.AbstractC1163A> arrayList2 = c1206k.f5111r;
            long j = c1206k.f4922f;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(j);
                arrayList2.add(aVar.f5112a);
                duration.translationX(aVar.f5116e - aVar.f5114c);
                duration.translationY(aVar.f5117f - aVar.f5115d);
                duration.alpha(0.0f).setListener(new C1204i(c1206k, aVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                arrayList2.add(aVar.f5113b);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C1205j(c1206k, aVar, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
    }
}
