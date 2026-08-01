package p000;

import android.database.DataSetObserver;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: ve */
/* JADX INFO: loaded from: classes.dex */
public final class C0816ve extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4840a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4841b;

    public /* synthetic */ C0816ve(int i, Object obj) {
        this.f4840a = i;
        this.f4841b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f4840a) {
            case Base64.DEFAULT /* 0 */:
                e50 e50Var = (e50) this.f4841b;
                e50Var.f4956a = true;
                e50Var.notifyDataSetChanged();
                break;
            default:
                C0421kr c0421kr = (C0421kr) this.f4841b;
                if (c0421kr.f2945z.isShowing()) {
                    c0421kr.mo1708f();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f4840a) {
            case Base64.DEFAULT /* 0 */:
                e50 e50Var = (e50) this.f4841b;
                e50Var.f4956a = false;
                e50Var.notifyDataSetInvalidated();
                break;
            default:
                ((C0421kr) this.f4841b).dismiss();
                break;
        }
    }
}
