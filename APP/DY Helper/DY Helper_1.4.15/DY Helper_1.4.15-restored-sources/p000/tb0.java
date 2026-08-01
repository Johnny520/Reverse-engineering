package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class tb0 {

    /* JADX INFO: renamed from: α */
    public final android.view.View f10270;

    /* JADX INFO: renamed from: β */
    public final android.widget.TextView f10271;

    /* JADX INFO: renamed from: γ */
    public final android.widget.TextView f10272;

    /* JADX INFO: renamed from: δ */
    public final android.widget.TextView f10273;

    /* JADX INFO: renamed from: ε */
    public final android.widget.TextView f10274;

    public tb0(android.view.View r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5) {
            r0 = this;
            r0.<init>()
            r0.f10270 = r1
            r0.f10271 = r2
            r0.f10272 = r3
            r0.f10273 = r4
            r0.f10274 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L42
        L3:
            boolean r0 = r3 instanceof p000.tb0
            if (r0 != 0) goto L8
            goto L40
        L8:
            tb0 r3 = (p000.tb0) r3
            android.view.View r0 = r2.f10270
            android.view.View r1 = r3.f10270
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L40
        L15:
            android.widget.TextView r0 = r2.f10271
            android.widget.TextView r1 = r3.f10271
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            android.widget.TextView r0 = r2.f10272
            android.widget.TextView r1 = r3.f10272
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            android.widget.TextView r0 = r2.f10273
            android.widget.TextView r1 = r3.f10273
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L40
        L36:
            android.widget.TextView r2 = r2.f10274
            android.widget.TextView r3 = r3.f10274
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L42
        L40:
            r2 = 0
            return r2
        L42:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            android.view.View r0 = r2.f10270
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.widget.TextView r1 = r2.f10271
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            android.widget.TextView r0 = r2.f10272
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.widget.TextView r1 = r2.f10273
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            android.widget.TextView r2 = r2.f10274
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Holder(root="
            r0.<init>(r1)
            android.view.View r1 = r2.f10270
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            android.widget.TextView r1 = r2.f10271
            r0.append(r1)
            java.lang.String r1 = ", meta="
            r0.append(r1)
            android.widget.TextView r1 = r2.f10272
            r0.append(r1)
            java.lang.String r1 = ", detail="
            r0.append(r1)
            android.widget.TextView r1 = r2.f10273
            r0.append(r1)
            java.lang.String r1 = ", approve="
            r0.append(r1)
            android.widget.TextView r2 = r2.f10274
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
