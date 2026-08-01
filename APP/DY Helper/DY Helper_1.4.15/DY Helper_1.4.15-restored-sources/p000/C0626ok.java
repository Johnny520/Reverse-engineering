package p000;

/* JADX INFO: renamed from: ok */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0626ok {

    /* JADX INFO: renamed from: α */
    public final p000.C0552mk f8123;

    /* JADX INFO: renamed from: β */
    public final android.widget.FrameLayout f8124;

    /* JADX INFO: renamed from: γ */
    public final android.widget.TextView f8125;

    /* JADX INFO: renamed from: δ */
    public final android.widget.ImageView f8126;

    /* JADX INFO: renamed from: ε */
    public final int f8127;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f8128;

    public C0626ok(p000.C0552mk r1, android.widget.FrameLayout r2, android.widget.TextView r3, android.widget.ImageView r4, int r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.f8123 = r1
            r0.f8124 = r2
            r0.f8125 = r3
            r0.f8126 = r4
            r0.f8127 = r5
            r0.f8128 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L49
        L3:
            boolean r0 = r3 instanceof p000.C0626ok
            if (r0 != 0) goto L8
            goto L47
        L8:
            ok r3 = (p000.C0626ok) r3
            mk r0 = r2.f8123
            mk r1 = r3.f8123
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L47
        L15:
            android.widget.FrameLayout r0 = r2.f8124
            android.widget.FrameLayout r1 = r3.f8124
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L47
        L20:
            android.widget.TextView r0 = r2.f8125
            android.widget.TextView r1 = r3.f8125
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L47
        L2b:
            android.widget.ImageView r0 = r2.f8126
            android.widget.ImageView r1 = r3.f8126
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L47
        L36:
            int r0 = r2.f8127
            int r1 = r3.f8127
            if (r0 == r1) goto L3d
            goto L47
        L3d:
            java.lang.String r2 = r2.f8128
            java.lang.String r3 = r3.f8128
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L49
        L47:
            r2 = 0
            return r2
        L49:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            mk r0 = r4.f8123
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            android.widget.FrameLayout r2 = r4.f8124
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            r0 = 0
            android.widget.TextView r3 = r4.f8125
            if (r3 != 0) goto L18
            r3 = r0
            goto L1c
        L18:
            int r3 = r3.hashCode()
        L1c:
            int r2 = r2 + r3
            int r2 = r2 * r1
            android.widget.ImageView r3 = r4.f8126
            if (r3 != 0) goto L24
            r3 = r0
            goto L28
        L24:
            int r3 = r3.hashCode()
        L28:
            int r2 = r2 + r3
            int r2 = r2 * r1
            int r3 = r4.f8127
            int r1 = p000.a12.m14(r3, r2, r1)
            java.lang.String r4 = r4.f8128
            if (r4 != 0) goto L35
            goto L39
        L35:
            int r0 = r4.hashCode()
        L39:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PreviewBinding(control="
            r0.<init>(r1)
            mk r1 = r2.f8123
            r0.append(r1)
            java.lang.String r1 = ", root="
            r0.append(r1)
            android.widget.FrameLayout r1 = r2.f8124
            r0.append(r1)
            java.lang.String r1 = ", colorView="
            r0.append(r1)
            android.widget.TextView r1 = r2.f8125
            r0.append(r1)
            java.lang.String r1 = ", tintView="
            r0.append(r1)
            android.widget.ImageView r1 = r2.f8126
            r0.append(r1)
            java.lang.String r1 = ", defaultColor="
            r0.append(r1)
            int r1 = r2.f8127
            r0.append(r1)
            java.lang.String r1 = ", contentText="
            r0.append(r1)
            java.lang.String r2 = r2.f8128
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
