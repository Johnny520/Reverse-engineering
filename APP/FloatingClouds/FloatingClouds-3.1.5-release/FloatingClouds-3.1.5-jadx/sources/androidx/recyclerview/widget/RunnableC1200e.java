package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.e */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1200e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f5076a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1206k f5077b;

    public RunnableC1200e(C1206k c1206k, ArrayList arrayList) {
        this.f5077b = c1206k;
        this.f5076a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f5076a;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C1206k c1206k = this.f5077b;
            if (!zHasNext) {
                arrayList.clear();
                c1206k.f5105l.remove(arrayList);
                return;
            }
            RecyclerView.AbstractC1163A abstractC1163A = (RecyclerView.AbstractC1163A) it.next();
            c1206k.getClass();
            View view = abstractC1163A.f4891a;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            c1206k.f5108o.add(abstractC1163A);
            viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(c1206k.f4919c).setListener(new C1202g(view, viewPropertyAnimatorAnimate, c1206k, abstractC1163A)).start();
        }
    }
}
