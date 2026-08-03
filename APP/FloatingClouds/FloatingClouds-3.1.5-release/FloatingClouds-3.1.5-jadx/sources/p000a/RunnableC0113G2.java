package p000a;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C1284c;
import p000a.C0234Mf;
import p000a.C0787qd;

/* JADX INFO: renamed from: a.G2 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0113G2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f379a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f380b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f381c;

    public /* synthetic */ RunnableC0113G2(Object obj, int i, int i2) {
        this.f379a = i2;
        this.f381c = obj;
        this.f380b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f379a) {
            case 0:
                C0787qd.e eVar = ((C0234Mf.a) this.f381c).f779u;
                if (eVar != null) {
                    eVar.mo1036b(this.f380b);
                }
                break;
            default:
                RecyclerView recyclerView = ((C1284c) this.f381c).f5699e0;
                if (!recyclerView.f4886x) {
                    RecyclerView.AbstractC1175l abstractC1175l = recyclerView.f4864m;
                    if (abstractC1175l != null) {
                        abstractC1175l.mo1486z0(recyclerView, this.f380b);
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    }
                    break;
                }
                break;
        }
    }
}
