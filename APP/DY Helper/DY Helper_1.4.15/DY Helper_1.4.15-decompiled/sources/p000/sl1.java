package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sl1 implements p000.InterfaceC0260et {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f9954;

    public /* synthetic */ sl1(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            r0.f9954 = r1
            r0.<init>()
            return
    }

    @Override // p000.InterfaceC0260et
    /* JADX INFO: renamed from: δ */
    public boolean mo1955(float r5) {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r4 = r4.f9954
            zl1 r0 = r4.f1160
            boolean r0 = r0.mo493()
            r1 = 0
            if (r0 == 0) goto Lf
            int r5 = (int) r5
            r0 = r5
            r5 = r1
            goto L1c
        Lf:
            zl1 r0 = r4.f1160
            boolean r0 = r0.mo492()
            if (r0 == 0) goto L1a
            int r5 = (int) r5
            r0 = r1
            goto L1c
        L1a:
            r5 = r1
            r0 = r5
        L1c:
            if (r5 != 0) goto L21
            if (r0 != 0) goto L21
            return r1
        L21:
            r4.setScrollState(r1)
            nm1 r2 = r4.f1171
            androidx.recyclerview.widget.RecyclerView r3 = r2.f7684
            r3.removeCallbacks(r2)
            android.widget.OverScroller r2 = r2.f7680
            r2.abortAnimation()
            zl1 r2 = r4.f1160
            if (r2 == 0) goto L3b
            ds0 r2 = r2.f13156
            if (r2 == 0) goto L3b
            r2.m1798()
        L3b:
            r2 = 2147483647(0x7fffffff, float:NaN)
            boolean r4 = r4.m531(r5, r0, r1, r2)
            return r4
    }

    @Override // p000.InterfaceC0260et
    /* JADX INFO: renamed from: λ */
    public float mo1956() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r1 = r1.f9954
            zl1 r0 = r1.f1160
            boolean r0 = r0.mo493()
            if (r0 == 0) goto Le
            float r1 = r1.f1149
        Lc:
            float r1 = -r1
            return r1
        Le:
            zl1 r0 = r1.f1160
            boolean r0 = r0.mo492()
            if (r0 == 0) goto L19
            float r1 = r1.f1148
            goto Lc
        L19:
            r1 = 0
            return r1
    }

    @Override // p000.InterfaceC0260et
    /* JADX INFO: renamed from: μ */
    public void mo1957() {
            r2 = this;
            r0 = 0
            androidx.recyclerview.widget.RecyclerView r2 = r2.f9954
            r2.setScrollState(r0)
            nm1 r0 = r2.f1171
            androidx.recyclerview.widget.RecyclerView r1 = r0.f7684
            r1.removeCallbacks(r0)
            android.widget.OverScroller r0 = r0.f7680
            r0.abortAnimation()
            zl1 r2 = r2.f1160
            if (r2 == 0) goto L1d
            ds0 r2 = r2.f13156
            if (r2 == 0) goto L1d
            r2.m1798()
        L1d:
            return
    }
}
