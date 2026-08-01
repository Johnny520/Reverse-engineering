package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vb1 extends android.widget.ArrayAdapter {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ android.app.Activity f11224;

    public vb1(android.app.Activity r2, java.util.List r3) {
            r1 = this;
            r1.f11224 = r2
            r0 = 17367049(0x1090009, float:2.516295E-38)
            r1.<init>(r2, r0, r3)
            return
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final android.view.View getDropDownView(int r1, android.view.View r2, android.view.ViewGroup r3) {
            r0 = this;
            r3.getClass()
            android.view.View r1 = super.getDropDownView(r1, r2, r3)
            boolean r2 = r1 instanceof android.widget.TextView
            if (r2 == 0) goto Lf
            r2 = r1
            android.widget.TextView r2 = (android.widget.TextView) r2
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L17
            android.app.Activity r0 = r0.f11224
            p000.xn0.m6703(r2, r0)
        L17:
            r1.getClass()
            return r1
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
            r0 = this;
            r3.getClass()
            android.view.View r1 = super.getView(r1, r2, r3)
            r1.getClass()
            boolean r2 = r1 instanceof android.widget.TextView
            if (r2 == 0) goto L12
            r2 = r1
            android.widget.TextView r2 = (android.widget.TextView) r2
            goto L13
        L12:
            r2 = 0
        L13:
            if (r2 == 0) goto L1a
            android.app.Activity r0 = r0.f11224
            p000.xn0.m6703(r2, r0)
        L1a:
            return r1
    }
}
