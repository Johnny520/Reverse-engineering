package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zy0 {

    /* JADX INFO: renamed from: α */
    public final p000.az0 f13351;

    /* JADX INFO: renamed from: β */
    public final int f13352;

    /* JADX INFO: renamed from: γ */
    public final int f13353;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f13354;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f13355;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f13356;

    /* JADX INFO: renamed from: η */
    public final java.lang.String f13357;

    /* JADX INFO: renamed from: θ */
    public final java.lang.String f13358;

    /* JADX INFO: renamed from: ι */
    public final java.util.List f13359;

    /* JADX INFO: renamed from: κ */
    public final java.lang.Object f13360;

    public zy0(p000.az0 r1, int r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.util.List r9, java.lang.Object r10) {
            r0 = this;
            r9.getClass()
            r0.<init>()
            r0.f13351 = r1
            r0.f13352 = r2
            r0.f13353 = r3
            r0.f13354 = r4
            r0.f13355 = r5
            r0.f13356 = r6
            r0.f13357 = r7
            r0.f13358 = r8
            r0.f13359 = r9
            r0.f13360 = r10
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.zy0 m7251(p000.zy0 r11, p000.az0 r12, java.lang.String r13, int r14) {
            int r2 = r11.f13352
            int r3 = r11.f13353
            java.lang.String r4 = r11.f13354
            java.lang.String r5 = r11.f13355
            java.lang.String r6 = r11.f13356
            r14 = r14 & 64
            if (r14 == 0) goto L10
            java.lang.String r13 = r11.f13357
        L10:
            r7 = r13
            java.lang.String r8 = r11.f13358
            java.util.List r9 = r11.f13359
            java.lang.Object r10 = r11.f13360
            r9.getClass()
            zy0 r0 = new zy0
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L6f
        L4:
            boolean r0 = r3 instanceof p000.zy0
            if (r0 != 0) goto La
            goto L6d
        La:
            zy0 r3 = (p000.zy0) r3
            az0 r0 = r2.f13351
            az0 r1 = r3.f13351
            if (r0 == r1) goto L13
            goto L6d
        L13:
            int r0 = r2.f13352
            int r1 = r3.f13352
            if (r0 == r1) goto L1a
            goto L6d
        L1a:
            int r0 = r2.f13353
            int r1 = r3.f13353
            if (r0 == r1) goto L21
            goto L6d
        L21:
            java.lang.String r0 = r2.f13354
            java.lang.String r1 = r3.f13354
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
            goto L6d
        L2c:
            java.lang.String r0 = r2.f13355
            java.lang.String r1 = r3.f13355
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L37
            goto L6d
        L37:
            java.lang.String r0 = r2.f13356
            java.lang.String r1 = r3.f13356
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L42
            goto L6d
        L42:
            java.lang.String r0 = r2.f13357
            java.lang.String r1 = r3.f13357
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L4d
            goto L6d
        L4d:
            java.lang.String r0 = r2.f13358
            java.lang.String r1 = r3.f13358
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L58
            goto L6d
        L58:
            java.util.List r0 = r2.f13359
            java.util.List r1 = r3.f13359
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L63
            goto L6d
        L63:
            java.lang.Object r2 = r2.f13360
            java.lang.Object r3 = r3.f13360
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L6f
        L6d:
            r2 = 0
            return r2
        L6f:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r4 = this;
            az0 r0 = r4.f13351
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f13352
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r4.f13353
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r2 = r4.f13354
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r4.f13355
            int r0 = p000.a12.m15(r0, r1, r2)
            r2 = 0
            java.lang.String r3 = r4.f13356
            if (r3 != 0) goto L28
            r3 = r2
            goto L2c
        L28:
            int r3 = r3.hashCode()
        L2c:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f13357
            if (r3 != 0) goto L34
            r3 = r2
            goto L38
        L34:
            int r3 = r3.hashCode()
        L38:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.String r3 = r4.f13358
            if (r3 != 0) goto L40
            r3 = r2
            goto L44
        L40:
            int r3 = r3.hashCode()
        L44:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.util.List r3 = r4.f13359
            int r0 = p000.a12.m16(r3, r0, r1)
            java.lang.Object r4 = r4.f13360
            if (r4 != 0) goto L51
            goto L55
        L51:
            int r2 = r4.hashCode()
        L55:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MediaItem(kind="
            r0.<init>(r1)
            az0 r1 = r5.f13351
            r0.append(r1)
            java.lang.String r1 = ", pageIndex="
            r0.append(r1)
            int r1 = r5.f13352
            r0.append(r1)
            java.lang.String r1 = ", displayIndex="
            r0.append(r1)
            java.lang.String r1 = ", title="
            java.lang.String r2 = ", typeText="
            int r3 = r5.f13353
            java.lang.String r4 = r5.f13354
            p000.lz1.m3671(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", previewUrl="
            java.lang.String r2 = ", imageUrl="
            java.lang.String r3 = r5.f13355
            java.lang.String r4 = r5.f13356
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", animatedUrl="
            java.lang.String r2 = ", videoCandidates="
            java.lang.String r3 = r5.f13357
            java.lang.String r4 = r5.f13358
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.util.List r1 = r5.f13359
            r0.append(r1)
            java.lang.String r1 = ", payload="
            r0.append(r1)
            java.lang.Object r5 = r5.f13360
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
