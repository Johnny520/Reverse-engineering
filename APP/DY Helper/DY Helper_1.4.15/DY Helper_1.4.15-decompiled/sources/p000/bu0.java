package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class bu0 extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: ε */
    public int f1841;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ p000.cu0 f1842;

    public bu0(p000.cu0 r1) {
            r0 = this;
            r0.f1842 = r1
            r0.<init>()
            r1 = -1
            r0.f1841 = r1
            r0.m1026()
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r2 = this;
            cu0 r0 = r2.f1842
            iz0 r1 = r0.f2754
            r1.m2834()
            java.util.ArrayList r1 = r1.f5260
            int r1 = r1.size()
            r0.getClass()
            int r2 = r2.f1841
            if (r2 >= 0) goto L15
            return r1
        L15:
            int r1 = r1 + (-1)
            return r1
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            lz0 r0 = r0.m1027(r1)
            return r0
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
            r0 = this;
            long r0 = (long) r1
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            if (r4 != 0) goto Le
            cu0 r4 = r2.f1842
            android.view.LayoutInflater r4 = r4.f2753
            r0 = 2131492880(0x7f0c0010, float:1.8609224E38)
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r5, r1)
        Le:
            r5 = r4
            vz0 r5 = (p000.vz0) r5
            lz0 r2 = r2.m1027(r3)
            r5.mo232(r2)
            return r4
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
            r0 = this;
            r0.m1026()
            super.notifyDataSetChanged()
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m1026() {
            r5 = this;
            cu0 r0 = r5.f1842
            iz0 r0 = r0.f2754
            lz0 r1 = r0.f5272
            if (r1 == 0) goto L22
            r0.m2834()
            java.util.ArrayList r0 = r0.f5260
            int r2 = r0.size()
            r3 = 0
        L12:
            if (r3 >= r2) goto L22
            java.lang.Object r4 = r0.get(r3)
            lz0 r4 = (p000.lz0) r4
            if (r4 != r1) goto L1f
            r5.f1841 = r3
            return
        L1f:
            int r3 = r3 + 1
            goto L12
        L22:
            r0 = -1
            r5.f1841 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public final p000.lz0 m1027(int r3) {
            r2 = this;
            cu0 r0 = r2.f1842
            iz0 r1 = r0.f2754
            r1.m2834()
            java.util.ArrayList r1 = r1.f5260
            r0.getClass()
            int r2 = r2.f1841
            if (r2 < 0) goto L14
            if (r3 < r2) goto L14
            int r3 = r3 + 1
        L14:
            java.lang.Object r2 = r1.get(r3)
            lz0 r2 = (p000.lz0) r2
            return r2
    }
}
