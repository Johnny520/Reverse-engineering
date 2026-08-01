package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class di0 {

    /* JADX INFO: renamed from: α */
    public final android.view.View f3170;

    /* JADX INFO: renamed from: β */
    public final android.widget.CheckBox f3171;

    /* JADX INFO: renamed from: γ */
    public final android.widget.TextView f3172;

    /* JADX INFO: renamed from: δ */
    public final android.widget.TextView f3173;

    /* JADX INFO: renamed from: ε */
    public final android.widget.TextView f3174;

    public di0(android.view.View r1, android.widget.CheckBox r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5) {
            r0 = this;
            r0.<init>()
            r0.f3170 = r1
            r0.f3171 = r2
            r0.f3172 = r3
            r0.f3173 = r4
            r0.f3174 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L42
        L3:
            boolean r0 = r3 instanceof p000.di0
            if (r0 != 0) goto L8
            goto L40
        L8:
            di0 r3 = (p000.di0) r3
            android.view.View r0 = r2.f3170
            android.view.View r1 = r3.f3170
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L40
        L15:
            android.widget.CheckBox r0 = r2.f3171
            android.widget.CheckBox r1 = r3.f3171
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            android.widget.TextView r0 = r2.f3172
            android.widget.TextView r1 = r3.f3172
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            android.widget.TextView r0 = r2.f3173
            android.widget.TextView r1 = r3.f3173
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L40
        L36:
            android.widget.TextView r2 = r2.f3174
            android.widget.TextView r3 = r3.f3174
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
            android.view.View r0 = r2.f3170
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.widget.CheckBox r1 = r2.f3171
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            android.widget.TextView r0 = r2.f3172
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.widget.TextView r1 = r2.f3173
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            android.widget.TextView r2 = r2.f3174
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Holder(root="
            r0.<init>(r1)
            android.view.View r1 = r2.f3170
            r0.append(r1)
            java.lang.String r1 = ", checkbox="
            r0.append(r1)
            android.widget.CheckBox r1 = r2.f3171
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            android.widget.TextView r1 = r2.f3172
            r0.append(r1)
            java.lang.String r1 = ", relation="
            r0.append(r1)
            android.widget.TextView r1 = r2.f3173
            r0.append(r1)
            java.lang.String r1 = ", info="
            r0.append(r1)
            android.widget.TextView r2 = r2.f3174
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
