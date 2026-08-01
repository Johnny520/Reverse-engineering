package p000;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.github.megatronking.stringfog.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: e8 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0178e8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1745a;

    /* JADX INFO: renamed from: b */
    public final int f1746b;

    /* JADX INFO: renamed from: c */
    public final Object f1747c;

    public /* synthetic */ RunnableC0178e8(Object obj, int i, int i2) {
        this.f1745a = i2;
        this.f1747c = obj;
        this.f1746b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1745a) {
            case Base64.DEFAULT /* 0 */:
                AbstractC0979zt abstractC0979zt = (AbstractC0979zt) ((C0431l0) this.f1747c).f2980b;
                if (abstractC0979zt != null) {
                    abstractC0979zt.mo2608I(this.f1746b);
                }
                break;
            case Base64.NO_PADDING /* 1 */:
                ArrayList arrayList = (ArrayList) this.f1747c;
                int size = arrayList.size();
                int i = 0;
                if (this.f1746b == 1) {
                    while (i < size) {
                        ((AbstractC0105ci) arrayList.get(i)).mo690a();
                        i++;
                    }
                } else {
                    while (i < size) {
                        ((AbstractC0105ci) arrayList.get(i)).getClass();
                        i++;
                    }
                }
                break;
            default:
                RecyclerView recyclerView = ((C0794ut) this.f1747c).f4766Y;
                if (!recyclerView.f621u) {
                    AbstractC0540nz abstractC0540nz = recyclerView.f605l;
                    if (abstractC0540nz != null) {
                        abstractC0540nz.mo364v0(recyclerView, this.f1746b);
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    }
                    break;
                }
                break;
        }
    }

    public RunnableC0178e8(List list, int i, Throwable th) {
        this.f1745a = 1;
        AbstractC0979zt.m2825f("initCallbacks cannot be null", list);
        this.f1747c = new ArrayList(list);
        this.f1746b = i;
    }
}
