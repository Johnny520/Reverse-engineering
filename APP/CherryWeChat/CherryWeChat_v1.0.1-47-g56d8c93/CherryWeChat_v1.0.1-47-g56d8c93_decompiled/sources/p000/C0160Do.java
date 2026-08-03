package p000;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: Do */
/* JADX INFO: loaded from: classes.dex */
public final class C0160Do extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f435a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f436b;

    public /* synthetic */ C0160Do(int i, Object obj) {
        this.f435a = i;
        this.f436b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f435a) {
            case 0:
                C0289Go c0289Go = (C0289Go) this.f436b;
                if (c0289Go.f962z.isShowing()) {
                    c0289Go.mo577c();
                }
                break;
            default:
                ((C0230FE) this.f436b).m455e();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f435a) {
            case 0:
                ((C0289Go) this.f436b).dismiss();
                break;
            default:
                ((C0230FE) this.f436b).m455e();
                break;
        }
    }
}
