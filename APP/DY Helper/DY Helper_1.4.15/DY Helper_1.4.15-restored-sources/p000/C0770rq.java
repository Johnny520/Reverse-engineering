package p000;

/* JADX INFO: renamed from: rq */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0770rq extends android.database.DataSetObserver {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9436;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f9437;

    public /* synthetic */ C0770rq(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f9436 = r1
            r0.f9437 = r2
            r0.<init>()
            return
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
            r1 = this;
            int r0 = r1.f9436
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f9437
            androidx.appcompat.widget.θ r1 = (androidx.appcompat.widget.C0035) r1
            m5 r0 = r1.f831
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L14
            r1.mo342()
        L14:
            return
        L15:
            java.lang.Object r1 = r1.f9437
            m12 r1 = (p000.m12) r1
            r0 = 1
            r1.f9989 = r0
            r1.notifyDataSetChanged()
            return
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
            r1 = this;
            int r0 = r1.f9436
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.f9437
            androidx.appcompat.widget.θ r1 = (androidx.appcompat.widget.C0035) r1
            r1.dismiss()
            return
        Ld:
            java.lang.Object r1 = r1.f9437
            m12 r1 = (p000.m12) r1
            r0 = 0
            r1.f9989 = r0
            r1.notifyDataSetInvalidated()
            return
    }
}
