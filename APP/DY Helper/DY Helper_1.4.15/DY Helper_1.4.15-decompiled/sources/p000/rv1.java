package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class rv1 {

    /* JADX INFO: renamed from: α */
    public final android.view.View f9527;

    /* JADX INFO: renamed from: β */
    public final android.widget.TextView f9528;

    /* JADX INFO: renamed from: γ */
    public final android.view.View f9529;

    /* JADX INFO: renamed from: δ */
    public final android.widget.CheckBox f9530;

    /* JADX INFO: renamed from: ε */
    public final android.widget.TextView f9531;

    /* JADX INFO: renamed from: ζ */
    public final android.widget.TextView f9532;

    public rv1(android.view.View r1, android.widget.TextView r2, android.view.View r3, android.widget.CheckBox r4, android.widget.TextView r5, android.widget.TextView r6) {
            r0 = this;
            r0.<init>()
            r0.f9527 = r1
            r0.f9528 = r2
            r0.f9529 = r3
            r0.f9530 = r4
            r0.f9531 = r5
            r0.f9532 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4d
        L3:
            boolean r0 = r3 instanceof p000.rv1
            if (r0 != 0) goto L8
            goto L4b
        L8:
            rv1 r3 = (p000.rv1) r3
            android.view.View r0 = r2.f9527
            android.view.View r1 = r3.f9527
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L4b
        L15:
            android.widget.TextView r0 = r2.f9528
            android.widget.TextView r1 = r3.f9528
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            android.view.View r0 = r2.f9529
            android.view.View r1 = r3.f9529
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L4b
        L2b:
            android.widget.CheckBox r0 = r2.f9530
            android.widget.CheckBox r1 = r3.f9530
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L4b
        L36:
            android.widget.TextView r0 = r2.f9531
            android.widget.TextView r1 = r3.f9531
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L4b
        L41:
            android.widget.TextView r2 = r2.f9532
            android.widget.TextView r3 = r3.f9532
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4d
        L4b:
            r2 = 0
            return r2
        L4d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            android.view.View r0 = r2.f9527
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.widget.TextView r1 = r2.f9528
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            android.view.View r0 = r2.f9529
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.widget.CheckBox r1 = r2.f9530
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            android.widget.TextView r0 = r2.f9531
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.widget.TextView r2 = r2.f9532
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Holder(root="
            r0.<init>(r1)
            android.view.View r1 = r2.f9527
            r0.append(r1)
            java.lang.String r1 = ", category="
            r0.append(r1)
            android.widget.TextView r1 = r2.f9528
            r0.append(r1)
            java.lang.String r1 = ", actionRow="
            r0.append(r1)
            android.view.View r1 = r2.f9529
            r0.append(r1)
            java.lang.String r1 = ", checkBox="
            r0.append(r1)
            android.widget.CheckBox r1 = r2.f9530
            r0.append(r1)
            java.lang.String r1 = ", title="
            r0.append(r1)
            android.widget.TextView r1 = r2.f9531
            r0.append(r1)
            java.lang.String r1 = ", subtitle="
            r0.append(r1)
            android.widget.TextView r2 = r2.f9532
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
