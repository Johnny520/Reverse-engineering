package p000;

import android.database.DataSetObserver;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: we */
/* JADX INFO: loaded from: classes.dex */
public final class C0853we extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5096a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5097b;

    public /* synthetic */ C0853we(int i, Object obj) {
        this.f5096a = i;
        this.f5097b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f5096a) {
            case Base64.DEFAULT /* 0 */:
                l50 l50Var = (l50) this.f5097b;
                l50Var.f5237a = true;
                l50Var.notifyDataSetChanged();
                break;
            default:
                C0569or c0569or = (C0569or) this.f5097b;
                if (c0569or.f3542z.isShowing()) {
                    c0569or.mo976f();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f5096a) {
            case Base64.DEFAULT /* 0 */:
                l50 l50Var = (l50) this.f5097b;
                l50Var.f5237a = false;
                l50Var.notifyDataSetInvalidated();
                break;
            default:
                ((C0569or) this.f5097b).dismiss();
                break;
        }
    }
}
