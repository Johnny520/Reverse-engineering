package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C1206k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1198c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f5072a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1206k f5073b;

    public RunnableC1198c(C1206k c1206k, ArrayList arrayList) {
        this.f5073b = c1206k;
        this.f5072a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f5072a;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C1206k c1206k = this.f5073b;
            if (!zHasNext) {
                arrayList.clear();
                c1206k.f5106m.remove(arrayList);
                return;
            }
            C1206k.b bVar = (C1206k.b) it.next();
            RecyclerView.AbstractC1163A abstractC1163A = bVar.f5118a;
            c1206k.getClass();
            View view = abstractC1163A.f4891a;
            int i = bVar.f5121d - bVar.f5119b;
            int i2 = bVar.f5122e - bVar.f5120c;
            if (i != 0) {
                view.animate().translationX(0.0f);
            }
            if (i2 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            c1206k.f5109p.add(abstractC1163A);
            viewPropertyAnimatorAnimate.setDuration(c1206k.f4921e).setListener(new C1203h(c1206k, abstractC1163A, i, view, i2, viewPropertyAnimatorAnimate)).start();
        }
    }
}
