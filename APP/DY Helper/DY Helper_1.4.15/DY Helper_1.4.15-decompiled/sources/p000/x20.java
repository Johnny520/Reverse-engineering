package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class x20 {

    /* JADX INFO: renamed from: α */
    public final android.view.ViewGroup f12002;

    /* JADX INFO: renamed from: β */
    public final android.widget.LinearLayout f12003;

    /* JADX INFO: renamed from: γ */
    public final android.widget.ImageView f12004;

    /* JADX INFO: renamed from: δ */
    public final android.widget.TextView f12005;

    /* JADX INFO: renamed from: ε */
    public final android.view.View f12006;

    public x20(android.view.ViewGroup r1, android.widget.LinearLayout r2, android.widget.ImageView r3, android.widget.TextView r4, android.view.View r5) {
            r0 = this;
            r0.<init>()
            r0.f12002 = r1
            r0.f12003 = r2
            r0.f12004 = r3
            r0.f12005 = r4
            r0.f12006 = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L42
        L3:
            boolean r0 = r3 instanceof p000.x20
            if (r0 != 0) goto L8
            goto L40
        L8:
            x20 r3 = (p000.x20) r3
            android.view.ViewGroup r0 = r2.f12002
            android.view.ViewGroup r1 = r3.f12002
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L40
        L15:
            android.widget.LinearLayout r0 = r2.f12003
            android.widget.LinearLayout r1 = r3.f12003
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L40
        L20:
            android.widget.ImageView r0 = r2.f12004
            android.widget.ImageView r1 = r3.f12004
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L40
        L2b:
            android.widget.TextView r0 = r2.f12005
            android.widget.TextView r1 = r3.f12005
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L40
        L36:
            android.view.View r2 = r2.f12006
            android.view.View r3 = r3.f12006
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L42
        L40:
            r2 = 0
            return r2
        L42:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            android.view.ViewGroup r0 = r3.f12002
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.widget.LinearLayout r1 = r3.f12003
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            r0 = 0
            android.widget.ImageView r2 = r3.f12004
            if (r2 != 0) goto L18
            r2 = r0
            goto L1c
        L18:
            int r2 = r2.hashCode()
        L1c:
            int r1 = r1 + r2
            int r1 = r1 * 31
            android.widget.TextView r2 = r3.f12005
            if (r2 != 0) goto L25
            r2 = r0
            goto L29
        L25:
            int r2 = r2.hashCode()
        L29:
            int r1 = r1 + r2
            int r1 = r1 * 31
            android.view.View r3 = r3.f12006
            if (r3 != 0) goto L31
            goto L35
        L31:
            int r0 = r3.hashCode()
        L35:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RightActionTemplate(outer="
            r0.<init>(r1)
            android.view.ViewGroup r1 = r2.f12002
            r0.append(r1)
            java.lang.String r1 = ", inner="
            r0.append(r1)
            android.widget.LinearLayout r1 = r2.f12003
            r0.append(r1)
            java.lang.String r1 = ", icon="
            r0.append(r1)
            android.widget.ImageView r1 = r2.f12004
            r0.append(r1)
            java.lang.String r1 = ", text="
            r0.append(r1)
            android.widget.TextView r1 = r2.f12005
            r0.append(r1)
            java.lang.String r1 = ", textContainer="
            r0.append(r1)
            android.view.View r2 = r2.f12006
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
