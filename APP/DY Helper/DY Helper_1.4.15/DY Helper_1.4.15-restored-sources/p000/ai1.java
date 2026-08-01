package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ai1 {

    /* JADX INFO: renamed from: α */
    public final long f259;

    /* JADX INFO: renamed from: β */
    public final long f260;

    /* JADX INFO: renamed from: γ */
    public final long f261;

    /* JADX INFO: renamed from: δ */
    public final boolean f262;

    /* JADX INFO: renamed from: ε */
    public final float f263;

    /* JADX INFO: renamed from: ζ */
    public final long f264;

    /* JADX INFO: renamed from: η */
    public final long f265;

    /* JADX INFO: renamed from: θ */
    public final boolean f266;

    /* JADX INFO: renamed from: ι */
    public final int f267;

    /* JADX INFO: renamed from: κ */
    public final long f268;

    /* JADX INFO: renamed from: λ */
    public final float f269;

    /* JADX INFO: renamed from: μ */
    public final long f270;

    /* JADX INFO: renamed from: ν */
    public final java.util.ArrayList f271;

    /* JADX INFO: renamed from: ξ */
    public final long f272;

    /* JADX INFO: renamed from: ο */
    public boolean f273;

    /* JADX INFO: renamed from: π */
    public boolean f274;

    /* JADX INFO: renamed from: ρ */
    public p000.ai1 f275;

    public ai1(long r22, long r24, long r26, boolean r28, float r29, long r30, long r32, boolean r34, int r35, java.util.ArrayList r36, long r37, float r39, long r40, long r42) {
            r21 = this;
            r14 = 0
            r0 = r21
            r1 = r22
            r3 = r24
            r5 = r26
            r7 = r28
            r8 = r29
            r9 = r30
            r11 = r32
            r13 = r34
            r15 = r35
            r16 = r37
            r18 = r39
            r19 = r40
            r0.<init>(r1, r3, r5, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19)
            r1 = r36
            r0.f271 = r1
            r1 = r42
            r0.f272 = r1
            return
    }

    public ai1(long r1, long r3, long r5, boolean r7, float r8, long r9, long r11, boolean r13, boolean r14, int r15, long r16, float r18, long r19) {
            r0 = this;
            r0.<init>()
            r0.f259 = r1
            r0.f260 = r3
            r0.f261 = r5
            r0.f262 = r7
            r0.f263 = r8
            r0.f264 = r9
            r0.f265 = r11
            r0.f266 = r13
            r1 = r15
            r0.f267 = r1
            r1 = r16
            r0.f268 = r1
            r1 = r18
            r0.f269 = r1
            r1 = r19
            r0.f270 = r1
            r1 = 0
            r0.f272 = r1
            r0.f273 = r14
            r0.f274 = r14
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PointerInputChange(id="
            r0.<init>(r1)
            long r1 = r3.f259
            java.lang.String r1 = p000.u81.m5818(r1)
            r0.append(r1)
            java.lang.String r1 = ", uptimeMillis="
            r0.append(r1)
            long r1 = r3.f260
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.f261
            java.lang.String r1 = p000.o41.m4206(r1)
            r0.append(r1)
            java.lang.String r1 = ", pressed="
            r0.append(r1)
            boolean r1 = r3.f262
            r0.append(r1)
            java.lang.String r1 = ", pressure="
            r0.append(r1)
            float r1 = r3.f263
            r0.append(r1)
            java.lang.String r1 = ", previousUptimeMillis="
            r0.append(r1)
            long r1 = r3.f264
            r0.append(r1)
            java.lang.String r1 = ", previousPosition="
            r0.append(r1)
            long r1 = r3.f265
            java.lang.String r1 = p000.o41.m4206(r1)
            r0.append(r1)
            java.lang.String r1 = ", previousPressed="
            r0.append(r1)
            boolean r1 = r3.f266
            r0.append(r1)
            java.lang.String r1 = ", isConsumed="
            r0.append(r1)
            boolean r1 = r3.m170()
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            r1 = 1
            int r2 = r3.f267
            if (r2 == r1) goto L89
            r1 = 2
            if (r2 == r1) goto L86
            r1 = 3
            if (r2 == r1) goto L83
            r1 = 4
            if (r2 == r1) goto L80
            java.lang.String r1 = "Unknown"
            goto L8b
        L80:
            java.lang.String r1 = "Eraser"
            goto L8b
        L83:
            java.lang.String r1 = "Stylus"
            goto L8b
        L86:
            java.lang.String r1 = "Mouse"
            goto L8b
        L89:
            java.lang.String r1 = "Touch"
        L8b:
            r0.append(r1)
            java.lang.String r1 = ", historical="
            r0.append(r1)
            java.util.ArrayList r1 = r3.f271
            if (r1 != 0) goto L99
            jz r1 = p000.C0450jz.f5672
        L99:
            r0.append(r1)
            java.lang.String r1 = ", scrollDelta="
            r0.append(r1)
            long r1 = r3.f268
            java.lang.String r1 = p000.o41.m4206(r1)
            r0.append(r1)
            java.lang.String r1 = ", scaleFactor="
            r0.append(r1)
            float r1 = r3.f269
            r0.append(r1)
            java.lang.String r1 = ", panOffset="
            r0.append(r1)
            long r1 = r3.f270
            java.lang.String r3 = p000.o41.m4206(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    /* JADX INFO: renamed from: α */
    public final void m169() {
            r1 = this;
            ai1 r0 = r1.f275
            if (r0 != 0) goto La
            r0 = 1
            r1.f273 = r0
            r1.f274 = r0
            return
        La:
            if (r0 == 0) goto Lf
            r0.m169()
        Lf:
            return
    }

    /* JADX INFO: renamed from: β */
    public final boolean m170() {
            r1 = this;
            ai1 r0 = r1.f275
            if (r0 == 0) goto L9
            boolean r1 = r0.m170()
            return r1
        L9:
            boolean r0 = r1.f273
            if (r0 != 0) goto L14
            boolean r1 = r1.f274
            if (r1 == 0) goto L12
            goto L14
        L12:
            r1 = 0
            return r1
        L14:
            r1 = 1
            return r1
    }
}
