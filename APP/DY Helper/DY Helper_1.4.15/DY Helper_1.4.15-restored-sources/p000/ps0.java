package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ps0 {

    /* JADX INFO: renamed from: ζ */
    public static final p000.ps0 f8686 = null;

    /* JADX INFO: renamed from: α */
    public final java.util.List f8687;

    /* JADX INFO: renamed from: β */
    public final android.graphics.Bitmap f8688;

    /* JADX INFO: renamed from: γ */
    public final int f8689;

    /* JADX INFO: renamed from: δ */
    public final boolean f8690;

    /* JADX INFO: renamed from: ε */
    public final float f8691;

    static {
            ps0 r0 = new ps0
            r4 = 1
            r5 = 1065353216(0x3f800000, float:1.0)
            jz r1 = p000.C0450jz.f5672
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            p000.ps0.f8686 = r0
            return
    }

    public ps0(java.util.List r1, android.graphics.Bitmap r2, int r3, boolean r4, float r5) {
            r0 = this;
            r0.<init>()
            r0.f8687 = r1
            r0.f8688 = r2
            r0.f8689 = r3
            r0.f8690 = r4
            r0.f8691 = r5
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.ps0 m4587(p000.ps0 r6, java.util.ArrayList r7, android.graphics.Bitmap r8, int r9, boolean r10, float r11, int r12) {
            r0 = r12 & 1
            if (r0 == 0) goto L6
            java.util.List r7 = r6.f8687
        L6:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto Ld
            android.graphics.Bitmap r8 = r6.f8688
        Ld:
            r2 = r8
            r7 = r12 & 4
            if (r7 == 0) goto L14
            int r9 = r6.f8689
        L14:
            r3 = r9
            r7 = r12 & 8
            if (r7 == 0) goto L1b
            boolean r10 = r6.f8690
        L1b:
            r4 = r10
            r7 = r12 & 16
            if (r7 == 0) goto L22
            float r11 = r6.f8691
        L22:
            r5 = r11
            r6.getClass()
            ps0 r0 = new ps0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3a
        L3:
            boolean r0 = r3 instanceof p000.ps0
            if (r0 != 0) goto L8
            goto L38
        L8:
            ps0 r3 = (p000.ps0) r3
            java.util.List r0 = r2.f8687
            java.util.List r1 = r3.f8687
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L38
        L15:
            android.graphics.Bitmap r0 = r2.f8688
            android.graphics.Bitmap r1 = r3.f8688
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L38
        L20:
            int r0 = r2.f8689
            int r1 = r3.f8689
            if (r0 == r1) goto L27
            goto L38
        L27:
            boolean r0 = r2.f8690
            boolean r1 = r3.f8690
            if (r0 == r1) goto L2e
            goto L38
        L2e:
            float r2 = r2.f8691
            float r3 = r3.f8691
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L3a
        L38:
            r2 = 0
            return r2
        L3a:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.util.List r0 = r3.f8687
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            android.graphics.Bitmap r2 = r3.f8688
            if (r2 != 0) goto Lf
            r2 = 0
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r3.f8689
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r2 = r3.f8690
            int r0 = p000.lz1.m3678(r0, r1, r2)
            float r3 = r3.f8691
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LiquidGlassBarUiState(tabs="
            r0.<init>(r1)
            java.util.List r1 = r2.f8687
            r0.append(r1)
            java.lang.String r1 = ", backdropBitmap="
            r0.append(r1)
            android.graphics.Bitmap r1 = r2.f8688
            r0.append(r1)
            java.lang.String r1 = ", backdropGeneration="
            r0.append(r1)
            int r1 = r2.f8689
            r0.append(r1)
            java.lang.String r1 = ", darkTheme="
            r0.append(r1)
            boolean r1 = r2.f8690
            r0.append(r1)
            java.lang.String r1 = ", scale="
            r0.append(r1)
            float r2 = r2.f8691
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
