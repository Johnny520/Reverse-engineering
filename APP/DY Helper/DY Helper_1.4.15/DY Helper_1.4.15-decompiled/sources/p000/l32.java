package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class l32 {

    /* JADX INFO: renamed from: α */
    public final p000.C0309g4 f6402;

    /* JADX INFO: renamed from: β */
    public final p000.w32 f6403;

    /* JADX INFO: renamed from: γ */
    public final java.util.List f6404;

    /* JADX INFO: renamed from: δ */
    public final int f6405;

    /* JADX INFO: renamed from: ε */
    public final boolean f6406;

    /* JADX INFO: renamed from: ζ */
    public final int f6407;

    /* JADX INFO: renamed from: η */
    public final p000.InterfaceC1031yr f6408;

    /* JADX INFO: renamed from: θ */
    public final p000.np0 f6409;

    /* JADX INFO: renamed from: ι */
    public final p000.f50 f6410;

    /* JADX INFO: renamed from: κ */
    public final long f6411;

    public l32(p000.C0309g4 r1, p000.w32 r2, java.util.List r3, int r4, boolean r5, int r6, p000.InterfaceC1031yr r7, p000.np0 r8, p000.f50 r9, long r10) {
            r0 = this;
            r0.<init>()
            r0.f6402 = r1
            r0.f6403 = r2
            r0.f6404 = r3
            r0.f6405 = r4
            r0.f6406 = r5
            r0.f6407 = r6
            r0.f6408 = r7
            r0.f6409 = r8
            r0.f6410 = r9
            r0.f6411 = r10
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L69
        L4:
            boolean r0 = r3 instanceof p000.l32
            if (r0 != 0) goto La
            goto L6b
        La:
            l32 r3 = (p000.l32) r3
            g4 r0 = r3.f6402
            g4 r1 = r2.f6402
            boolean r0 = p000.ln0.m3626(r1, r0)
            if (r0 != 0) goto L17
            goto L6b
        L17:
            w32 r0 = r2.f6403
            w32 r1 = r3.f6403
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L22
            goto L6b
        L22:
            java.util.List r0 = r2.f6404
            java.util.List r1 = r3.f6404
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2d
            goto L6b
        L2d:
            int r0 = r2.f6405
            int r1 = r3.f6405
            if (r0 == r1) goto L34
            goto L6b
        L34:
            boolean r0 = r2.f6406
            boolean r1 = r3.f6406
            if (r0 == r1) goto L3b
            goto L6b
        L3b:
            int r0 = r2.f6407
            int r1 = r3.f6407
            if (r0 != r1) goto L6b
            yr r0 = r2.f6408
            yr r1 = r3.f6408
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L4c
            goto L6b
        L4c:
            np0 r0 = r2.f6409
            np0 r1 = r3.f6409
            if (r0 == r1) goto L53
            goto L6b
        L53:
            f50 r0 = r2.f6410
            f50 r1 = r3.f6410
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L5e
            goto L6b
        L5e:
            long r0 = r2.f6411
            long r2 = r3.f6411
            boolean r2 = p000.C1028yo.m6947(r0, r2)
            if (r2 != 0) goto L69
            goto L6b
        L69:
            r2 = 1
            return r2
        L6b:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            g4 r0 = r3.f6402
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            w32 r2 = r3.f6403
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.List r0 = r3.f6404
            int r0 = p000.a12.m16(r0, r2, r1)
            int r2 = r3.f6405
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r3.f6406
            int r0 = p000.lz1.m3678(r0, r1, r2)
            int r2 = r3.f6407
            int r0 = p000.a12.m14(r2, r0, r1)
            yr r2 = r3.f6408
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            np0 r0 = r3.f6409
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            f50 r2 = r3.f6410
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r0 = r3.f6411
            int r3 = java.lang.Long.hashCode(r0)
            int r3 = r3 + r2
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextLayoutInput(text="
            r0.<init>(r1)
            g4 r1 = r3.f6402
            r0.append(r1)
            java.lang.String r1 = ", style="
            r0.append(r1)
            w32 r1 = r3.f6403
            r0.append(r1)
            java.lang.String r1 = ", placeholders="
            r0.append(r1)
            java.util.List r1 = r3.f6404
            r0.append(r1)
            java.lang.String r1 = ", maxLines="
            r0.append(r1)
            int r1 = r3.f6405
            r0.append(r1)
            java.lang.String r1 = ", softWrap="
            r0.append(r1)
            boolean r1 = r3.f6406
            r0.append(r1)
            java.lang.String r1 = ", overflow="
            r0.append(r1)
            r1 = 1
            int r2 = r3.f6407
            if (r2 != r1) goto L41
            java.lang.String r1 = "Clip"
            goto L5b
        L41:
            r1 = 2
            if (r2 != r1) goto L47
            java.lang.String r1 = "Ellipsis"
            goto L5b
        L47:
            r1 = 5
            if (r2 != r1) goto L4d
            java.lang.String r1 = "MiddleEllipsis"
            goto L5b
        L4d:
            r1 = 3
            if (r2 != r1) goto L53
            java.lang.String r1 = "Visible"
            goto L5b
        L53:
            r1 = 4
            if (r2 != r1) goto L59
            java.lang.String r1 = "StartEllipsis"
            goto L5b
        L59:
            java.lang.String r1 = "Invalid"
        L5b:
            r0.append(r1)
            java.lang.String r1 = ", density="
            r0.append(r1)
            yr r1 = r3.f6408
            r0.append(r1)
            java.lang.String r1 = ", layoutDirection="
            r0.append(r1)
            np0 r1 = r3.f6409
            r0.append(r1)
            java.lang.String r1 = ", fontFamilyResolver="
            r0.append(r1)
            f50 r1 = r3.f6410
            r0.append(r1)
            java.lang.String r1 = ", constraints="
            r0.append(r1)
            long r1 = r3.f6411
            java.lang.String r3 = p000.C1028yo.m6956(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
