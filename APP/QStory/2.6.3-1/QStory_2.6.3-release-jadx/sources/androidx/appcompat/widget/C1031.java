package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1031 extends DataSetObserver {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1029 f1082;

    public C1031(C1029 c1029) {
        this.f1082 = c1029;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C1029 c1029 = this.f1082;
        if (c1029.f1054.isShowing()) {
            c1029.show();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f1082.dismiss();
    }
}
