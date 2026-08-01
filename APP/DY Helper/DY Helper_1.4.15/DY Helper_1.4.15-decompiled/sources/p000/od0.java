package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class od0 {

    /* JADX INFO: renamed from: α */
    public final android.view.View f8038;

    /* JADX INFO: renamed from: β */
    public final android.widget.TextView f8039;

    /* JADX INFO: renamed from: γ */
    public final android.widget.TextView f8040;

    /* JADX INFO: renamed from: δ */
    public final android.widget.TextView f8041;

    public od0(android.view.View r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4) {
            r0 = this;
            r0.<init>()
            r0.f8038 = r1
            r0.f8039 = r2
            r0.f8040 = r3
            r0.f8041 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof p000.od0
            if (r0 != 0) goto L8
            goto L35
        L8:
            od0 r3 = (p000.od0) r3
            android.view.View r0 = r2.f8038
            android.view.View r1 = r3.f8038
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            android.widget.TextView r0 = r2.f8039
            android.widget.TextView r1 = r3.f8039
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            android.widget.TextView r0 = r2.f8040
            android.widget.TextView r1 = r3.f8040
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            android.widget.TextView r2 = r2.f8041
            android.widget.TextView r3 = r3.f8041
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
        L35:
            r2 = 0
            return r2
        L37:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            android.view.View r0 = r2.f8038
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.widget.TextView r1 = r2.f8039
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            android.widget.TextView r0 = r2.f8040
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.widget.TextView r2 = r2.f8041
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ViewHolder(root="
            r0.<init>(r1)
            android.view.View r1 = r2.f8038
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            android.widget.TextView r1 = r2.f8039
            r0.append(r1)
            java.lang.String r1 = ", identity="
            r0.append(r1)
            android.widget.TextView r1 = r2.f8040
            r0.append(r1)
            java.lang.String r1 = ", action="
            r0.append(r1)
            android.widget.TextView r2 = r2.f8041
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
