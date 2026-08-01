package p000;

/* JADX INFO: renamed from: el */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0252el {

    /* JADX INFO: renamed from: α */
    public final int f3584;

    /* JADX INFO: renamed from: β */
    public final float f3585;

    /* JADX INFO: renamed from: γ */
    public final android.content.res.ColorStateList f3586;

    /* JADX INFO: renamed from: δ */
    public final java.lang.CharSequence f3587;

    /* JADX INFO: renamed from: ε */
    public final android.graphics.ColorFilter f3588;

    public C0252el(int r1, float r2, android.content.res.ColorStateList r3, java.lang.CharSequence r4, android.graphics.ColorFilter r5) {
            r0 = this;
            r0.<init>()
            r0.f3584 = r1
            r0.f3585 = r2
            r0.f3586 = r3
            r0.f3587 = r4
            r0.f3588 = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0252el
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            el r5 = (p000.C0252el) r5
            int r1 = r4.f3584
            int r3 = r5.f3584
            if (r1 == r3) goto L13
            return r2
        L13:
            float r1 = r4.f3585
            float r3 = r5.f3585
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L1e
            return r2
        L1e:
            android.content.res.ColorStateList r1 = r4.f3586
            android.content.res.ColorStateList r3 = r5.f3586
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.CharSequence r1 = r4.f3587
            java.lang.CharSequence r3 = r5.f3587
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            android.graphics.ColorFilter r4 = r4.f3588
            android.graphics.ColorFilter r5 = r5.f3588
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L3f
            return r2
        L3f:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f3584
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r4.f3585
            int r0 = p000.lz1.m3676(r2, r0, r1)
            r2 = 0
            android.content.res.ColorStateList r3 = r4.f3586
            if (r3 != 0) goto L16
            r3 = r2
            goto L1a
        L16:
            int r3 = r3.hashCode()
        L1a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.CharSequence r3 = r4.f3587
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            android.graphics.ColorFilter r4 = r4.f3588
            if (r4 != 0) goto L2d
            goto L31
        L2d:
            int r2 = r4.hashCode()
        L31:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Baseline(visibility="
            r0.<init>(r1)
            int r1 = r2.f3584
            r0.append(r1)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            float r1 = r2.f3585
            r0.append(r1)
            java.lang.String r1 = ", textColors="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r2.f3586
            r0.append(r1)
            java.lang.String r1 = ", text="
            r0.append(r1)
            java.lang.CharSequence r1 = r2.f3587
            r0.append(r1)
            java.lang.String r1 = ", imageColorFilter="
            r0.append(r1)
            android.graphics.ColorFilter r2 = r2.f3588
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
