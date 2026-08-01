package p000;

/* JADX INFO: renamed from: f */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0267f extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ androidx.appcompat.widget.ActivityChooserView f3699;

    public C0267f(androidx.appcompat.widget.ActivityChooserView r1) {
            r0 = this;
            r0.f3699 = r1
            r0.<init>()
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
            r0 = this;
            long r0 = (long) r1
            return r0
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            androidx.appcompat.widget.ActivityChooserView r1 = r1.f3699
            if (r3 == 0) goto Ld
            int r2 = r3.getId()
            r0 = 2131296782(0x7f09020e, float:1.821149E38)
            if (r2 == r0) goto L1d
        Ld:
            android.content.Context r2 = r1.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r3 = 2131492871(0x7f0c0007, float:1.8609206E38)
            r0 = 0
            android.view.View r3 = r2.inflate(r3, r4, r0)
        L1d:
            android.content.Context r1 = r1.getContext()
            r1.getPackageManager()
            r1 = 2131296682(0x7f0901aa, float:1.8211288E38)
            android.view.View r1 = r3.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 0
            throw r1
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
            r0 = this;
            r0 = 3
            return r0
    }
}
