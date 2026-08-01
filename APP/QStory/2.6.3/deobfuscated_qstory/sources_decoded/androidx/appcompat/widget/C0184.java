package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0184 extends DataSetObserver {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C0182 f737;

    public C0184(C0182 c0182) {
        this.f737 = c0182;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        C0182 c0182 = this.f737;
        if (c0182.f709.isShowing()) {
            c0182.show();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f737.dismiss();
    }
}
