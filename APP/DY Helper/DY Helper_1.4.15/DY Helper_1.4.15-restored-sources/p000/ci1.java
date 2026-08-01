package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ci1 {

    /* JADX INFO: renamed from: α */
    public final long f2141;

    /* JADX INFO: renamed from: β */
    public final long f2142;

    /* JADX INFO: renamed from: γ */
    public final long f2143;

    /* JADX INFO: renamed from: δ */
    public final long f2144;

    /* JADX INFO: renamed from: ε */
    public final boolean f2145;

    /* JADX INFO: renamed from: ζ */
    public final float f2146;

    /* JADX INFO: renamed from: η */
    public final int f2147;

    /* JADX INFO: renamed from: θ */
    public final boolean f2148;

    /* JADX INFO: renamed from: ι */
    public final java.util.ArrayList f2149;

    /* JADX INFO: renamed from: κ */
    public final long f2150;

    /* JADX INFO: renamed from: λ */
    public final float f2151;

    /* JADX INFO: renamed from: μ */
    public final long f2152;

    /* JADX INFO: renamed from: ν */
    public final long f2153;

    public ci1(long r1, long r3, long r5, long r7, boolean r9, float r10, int r11, boolean r12, java.util.ArrayList r13, long r14, float r16, long r17, long r19) {
            r0 = this;
            r0.<init>()
            r0.f2141 = r1
            r0.f2142 = r3
            r0.f2143 = r5
            r0.f2144 = r7
            r0.f2145 = r9
            r0.f2146 = r10
            r0.f2147 = r11
            r0.f2148 = r12
            r0.f2149 = r13
            r0.f2150 = r14
            r1 = r16
            r0.f2151 = r1
            r1 = r17
            r0.f2152 = r1
            r1 = r19
            r0.f2153 = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L8f
        L4:
            boolean r0 = r5 instanceof p000.ci1
            if (r0 != 0) goto La
            goto L91
        La:
            ci1 r5 = (p000.ci1) r5
            long r0 = r4.f2141
            long r2 = r5.f2141
            boolean r0 = p000.u81.m5805(r0, r2)
            if (r0 != 0) goto L18
            goto L91
        L18:
            long r0 = r4.f2142
            long r2 = r5.f2142
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L22
            goto L91
        L22:
            long r0 = r4.f2143
            long r2 = r5.f2143
            boolean r0 = p000.o41.m4203(r0, r2)
            if (r0 != 0) goto L2e
            goto L91
        L2e:
            long r0 = r4.f2144
            long r2 = r5.f2144
            boolean r0 = p000.o41.m4203(r0, r2)
            if (r0 != 0) goto L39
            goto L91
        L39:
            boolean r0 = r4.f2145
            boolean r1 = r5.f2145
            if (r0 == r1) goto L40
            goto L91
        L40:
            float r0 = r4.f2146
            float r1 = r5.f2146
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L4b
            goto L91
        L4b:
            int r0 = r4.f2147
            int r1 = r5.f2147
            if (r0 != r1) goto L91
            boolean r0 = r4.f2148
            boolean r1 = r5.f2148
            if (r0 == r1) goto L58
            goto L91
        L58:
            java.util.ArrayList r0 = r4.f2149
            java.util.ArrayList r1 = r5.f2149
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
            goto L91
        L63:
            long r0 = r4.f2150
            long r2 = r5.f2150
            boolean r0 = p000.o41.m4203(r0, r2)
            if (r0 != 0) goto L6e
            goto L91
        L6e:
            float r0 = r4.f2151
            float r1 = r5.f2151
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L79
            goto L91
        L79:
            long r0 = r4.f2152
            long r2 = r5.f2152
            boolean r0 = p000.o41.m4203(r0, r2)
            if (r0 != 0) goto L84
            goto L91
        L84:
            long r0 = r4.f2153
            long r4 = r5.f2153
            boolean r4 = p000.o41.m4203(r0, r4)
            if (r4 != 0) goto L8f
            goto L91
        L8f:
            r4 = 1
            return r4
        L91:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r5 = this;
            long r0 = r5.f2141
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r5.f2142
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r2 = r5.f2143
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r2 = r5.f2144
            int r0 = p000.lz1.m3677(r0, r1, r2)
            boolean r2 = r5.f2145
            int r0 = p000.lz1.m3678(r0, r1, r2)
            float r2 = r5.f2146
            int r0 = p000.lz1.m3676(r2, r0, r1)
            int r2 = r5.f2147
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r2 = r5.f2148
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.util.ArrayList r2 = r5.f2149
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r3 = r5.f2150
            int r0 = p000.lz1.m3677(r2, r1, r3)
            float r2 = r5.f2151
            int r0 = p000.lz1.m3676(r2, r0, r1)
            long r2 = r5.f2152
            int r0 = p000.lz1.m3677(r0, r1, r2)
            long r1 = r5.f2153
            int r5 = java.lang.Long.hashCode(r1)
            int r5 = r5 + r0
            return r5
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PointerInputEventData(id="
            r0.<init>(r1)
            long r1 = r3.f2141
            java.lang.String r1 = p000.u81.m5818(r1)
            r0.append(r1)
            java.lang.String r1 = ", uptime="
            r0.append(r1)
            long r1 = r3.f2142
            r0.append(r1)
            java.lang.String r1 = ", positionOnScreen="
            r0.append(r1)
            long r1 = r3.f2143
            java.lang.String r1 = p000.o41.m4206(r1)
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.f2144
            java.lang.String r1 = p000.o41.m4206(r1)
            r0.append(r1)
            java.lang.String r1 = ", down="
            r0.append(r1)
            boolean r1 = r3.f2145
            r0.append(r1)
            java.lang.String r1 = ", pressure="
            r0.append(r1)
            float r1 = r3.f2146
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            r1 = 1
            int r2 = r3.f2147
            if (r2 == r1) goto L69
            r1 = 2
            if (r2 == r1) goto L66
            r1 = 3
            if (r2 == r1) goto L63
            r1 = 4
            if (r2 == r1) goto L60
            java.lang.String r1 = "Unknown"
            goto L6b
        L60:
            java.lang.String r1 = "Eraser"
            goto L6b
        L63:
            java.lang.String r1 = "Stylus"
            goto L6b
        L66:
            java.lang.String r1 = "Mouse"
            goto L6b
        L69:
            java.lang.String r1 = "Touch"
        L6b:
            r0.append(r1)
            java.lang.String r1 = ", activeHover="
            r0.append(r1)
            boolean r1 = r3.f2148
            r0.append(r1)
            java.lang.String r1 = ", historical="
            r0.append(r1)
            java.util.ArrayList r1 = r3.f2149
            r0.append(r1)
            java.lang.String r1 = ", scrollDelta="
            r0.append(r1)
            long r1 = r3.f2150
            java.lang.String r1 = p000.o41.m4206(r1)
            r0.append(r1)
            java.lang.String r1 = ", scaleGestureFactor="
            r0.append(r1)
            float r1 = r3.f2151
            r0.append(r1)
            java.lang.String r1 = ", panGestureOffset="
            r0.append(r1)
            long r1 = r3.f2152
            java.lang.String r1 = p000.o41.m4206(r1)
            r0.append(r1)
            java.lang.String r1 = ", originalEventPosition="
            r0.append(r1)
            long r1 = r3.f2153
            java.lang.String r3 = p000.o41.m4206(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
