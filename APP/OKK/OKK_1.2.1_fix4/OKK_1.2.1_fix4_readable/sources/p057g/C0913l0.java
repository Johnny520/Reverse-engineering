package p057g;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: g.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0913l0 extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0919o0 f3233a;

    public C0913l0(AbstractC0919o0 abstractC0919o0) {
        this.f3233a = abstractC0919o0;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        AbstractC0919o0 abstractC0919o0 = this.f3233a;
        if (abstractC0919o0.f3272v.isShowing()) {
            abstractC0919o0.mo1980f();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f3233a.dismiss();
    }
}
