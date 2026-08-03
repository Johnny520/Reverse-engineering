package p057g;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: g.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0913l0 extends DataSetObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0919o0 f3233a;

    public C0913l0(AbstractC0919o0 r1) {
        this.f3233a = r1;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        AbstractC0919o0 r02 = this.f3233a;
        if (r02.f3272v.isShowing() == false) goto L6;
        r02.mo1980f();
        return;
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f3233a.dismiss();
    }
}
