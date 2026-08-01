package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fa0 {

    /* JADX INFO: renamed from: α */
    public final android.widget.LinearLayout f3836;

    /* JADX INFO: renamed from: β */
    public final android.widget.TextView f3837;

    /* JADX INFO: renamed from: γ */
    public final android.widget.SeekBar f3838;

    public fa0(android.widget.LinearLayout r1, android.widget.TextView r2, android.widget.SeekBar r3) {
            r0 = this;
            r0.<init>()
            r0.f3836 = r1
            r0.f3837 = r2
            r0.f3838 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof p000.fa0
            if (r0 != 0) goto L8
            goto L2a
        L8:
            fa0 r3 = (p000.fa0) r3
            android.widget.LinearLayout r0 = r2.f3836
            android.widget.LinearLayout r1 = r3.f3836
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            android.widget.TextView r0 = r2.f3837
            android.widget.TextView r1 = r3.f3837
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            android.widget.SeekBar r2 = r2.f3838
            android.widget.SeekBar r3 = r3.f3838
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            android.widget.LinearLayout r0 = r2.f3836
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.widget.TextView r1 = r2.f3837
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            android.widget.SeekBar r2 = r2.f3838
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SpeedOptionControlViews(root="
            r0.<init>(r1)
            android.widget.LinearLayout r1 = r2.f3836
            r0.append(r1)
            java.lang.String r1 = ", valueView="
            r0.append(r1)
            android.widget.TextView r1 = r2.f3837
            r0.append(r1)
            java.lang.String r1 = ", seekBar="
            r0.append(r1)
            android.widget.SeekBar r2 = r2.f3838
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
