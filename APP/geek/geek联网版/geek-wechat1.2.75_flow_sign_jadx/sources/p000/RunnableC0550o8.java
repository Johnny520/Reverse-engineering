package p000;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o8 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0550o8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3413a;

    /* JADX INFO: renamed from: b */
    public final int f3414b;

    /* JADX INFO: renamed from: c */
    public final Object f3415c;

    public /* synthetic */ RunnableC0550o8(Object obj, int i, int i2) {
        this.f3413a = i2;
        this.f3415c = obj;
        this.f3414b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3413a) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0498mu abstractC0498mu = (AbstractC0498mu) ((C0431l0) this.f3415c).f2886b;
                if (abstractC0498mu != null) {
                    abstractC0498mu.mo968w(this.f3414b);
                }
                break;
            case Base64.NO_PADDING /* 1 */:
                ArrayList arrayList = (ArrayList) this.f3415c;
                int size = arrayList.size();
                int i = 0;
                if (this.f3414b == 1) {
                    while (i < size) {
                        ((AbstractC0188ei) arrayList.get(i)).mo997a();
                        i++;
                    }
                } else {
                    while (i < size) {
                        ((AbstractC0188ei) arrayList.get(i)).getClass();
                        i++;
                    }
                }
                break;
            default:
                RecyclerView recyclerView = ((C0942yt) this.f3415c).f5498Y;
                if (!recyclerView.f584u) {
                    AbstractC0799uz abstractC0799uz = recyclerView.f568l;
                    if (abstractC0799uz != null) {
                        abstractC0799uz.mo349v0(recyclerView, this.f3414b);
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    }
                    break;
                }
                break;
        }
    }

    public RunnableC0550o8(List list, int i, Throwable th) {
        this.f3413a = 1;
        AbstractC0498mu.m1887d("initCallbacks cannot be null", list);
        this.f3415c = new ArrayList(list);
        this.f3414b = i;
    }
}
