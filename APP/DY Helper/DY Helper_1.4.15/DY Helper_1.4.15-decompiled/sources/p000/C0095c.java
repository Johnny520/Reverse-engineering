package p000;

/* JADX INFO: renamed from: c */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0095c extends android.database.DataSetObserver {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f1922;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ androidx.appcompat.widget.ActivityChooserView f1923;

    public /* synthetic */ C0095c(androidx.appcompat.widget.ActivityChooserView r1, int r2) {
            r0 = this;
            r0.f1922 = r2
            r0.f1923 = r1
            r0.<init>()
            return
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
            r1 = this;
            int r0 = r1.f1922
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            super.onChanged()
            androidx.appcompat.widget.ActivityChooserView r1 = r1.f1923
            f r1 = r1.f529
            r1.getClass()
            r1 = 0
            throw r1
        L11:
            super.onChanged()
            androidx.appcompat.widget.ActivityChooserView r1 = r1.f1923
            f r1 = r1.f529
            r1.notifyDataSetChanged()
            return
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
            r1 = this;
            int r0 = r1.f1922
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.onInvalidated()
            return
        L9:
            super.onInvalidated()
            androidx.appcompat.widget.ActivityChooserView r1 = r1.f1923
            f r1 = r1.f529
            r1.notifyDataSetInvalidated()
            return
    }
}
