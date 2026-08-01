package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fz0 extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: ε */
    public final p000.iz0 f4174;

    /* JADX INFO: renamed from: ζ */
    public int f4175;

    /* JADX INFO: renamed from: η */
    public boolean f4176;

    /* JADX INFO: renamed from: θ */
    public final boolean f4177;

    /* JADX INFO: renamed from: ι */
    public final android.view.LayoutInflater f4178;

    /* JADX INFO: renamed from: κ */
    public final int f4179;

    public fz0(p000.iz0 r2, android.view.LayoutInflater r3, boolean r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f4175 = r0
            r1.f4177 = r4
            r1.f4178 = r3
            r1.f4174 = r2
            r1.f4179 = r5
            r1.m2219()
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r2 = this;
            boolean r0 = r2.f4177
            iz0 r1 = r2.f4174
            if (r0 == 0) goto Lc
            r1.m2834()
            java.util.ArrayList r0 = r1.f5260
            goto L10
        Lc:
            java.util.ArrayList r0 = r1.m2835()
        L10:
            int r2 = r2.f4175
            if (r2 >= 0) goto L19
            int r2 = r0.size()
            return r2
        L19:
            int r2 = r0.size()
            int r2 = r2 + (-1)
            return r2
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            lz0 r0 = r0.m2220(r1)
            return r0
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
            r0 = this;
            long r0 = (long) r1
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto Lb
            android.view.LayoutInflater r7 = r5.f4178
            int r1 = r5.f4179
            android.view.View r7 = r7.inflate(r1, r8, r0)
        Lb:
            lz0 r8 = r5.m2220(r6)
            int r8 = r8.f6854
            int r1 = r6 + (-1)
            if (r1 < 0) goto L1c
            lz0 r1 = r5.m2220(r1)
            int r1 = r1.f6854
            goto L1d
        L1c:
            r1 = r8
        L1d:
            r2 = r7
            androidx.appcompat.view.menu.ListMenuItemView r2 = (androidx.appcompat.view.menu.ListMenuItemView) r2
            iz0 r3 = r5.f4174
            boolean r3 = r3.mo686()
            r4 = 1
            if (r3 == 0) goto L2c
            if (r8 == r1) goto L2c
            r0 = r4
        L2c:
            r2.setGroupDividerEnabled(r0)
            r8 = r7
            vz0 r8 = (p000.vz0) r8
            boolean r0 = r5.f4176
            if (r0 == 0) goto L39
            r2.setForceShowIcon(r4)
        L39:
            lz0 r5 = r5.m2220(r6)
            r8.mo232(r5)
            return r7
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
            r0 = this;
            r0.m2219()
            super.notifyDataSetChanged()
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m2219() {
            r5 = this;
            iz0 r0 = r5.f4174
            lz0 r1 = r0.f5272
            if (r1 == 0) goto L20
            r0.m2834()
            java.util.ArrayList r0 = r0.f5260
            int r2 = r0.size()
            r3 = 0
        L10:
            if (r3 >= r2) goto L20
            java.lang.Object r4 = r0.get(r3)
            lz0 r4 = (p000.lz0) r4
            if (r4 != r1) goto L1d
            r5.f4175 = r3
            return
        L1d:
            int r3 = r3 + 1
            goto L10
        L20:
            r0 = -1
            r5.f4175 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public final p000.lz0 m2220(int r3) {
            r2 = this;
            boolean r0 = r2.f4177
            iz0 r1 = r2.f4174
            if (r0 == 0) goto Lc
            r1.m2834()
            java.util.ArrayList r0 = r1.f5260
            goto L10
        Lc:
            java.util.ArrayList r0 = r1.m2835()
        L10:
            int r2 = r2.f4175
            if (r2 < 0) goto L18
            if (r3 < r2) goto L18
            int r3 = r3 + 1
        L18:
            java.lang.Object r2 = r0.get(r3)
            lz0 r2 = (p000.lz0) r2
            return r2
    }
}
