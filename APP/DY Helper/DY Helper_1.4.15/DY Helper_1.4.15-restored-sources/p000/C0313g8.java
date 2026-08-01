package p000;

/* JADX INFO: renamed from: g8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0313g8 {

    /* JADX INFO: renamed from: α */
    public final int f4267;

    /* JADX INFO: renamed from: β */
    public final int f4268;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Integer f4269;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Integer f4270;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Integer f4271;

    /* JADX INFO: renamed from: ζ */
    public final java.util.List f4272;

    /* JADX INFO: renamed from: η */
    public final java.util.List f4273;

    /* JADX INFO: renamed from: θ */
    public final java.util.List f4274;

    /* JADX INFO: renamed from: ι */
    public final p000.C0387i8 f4275;

    public C0313g8(int r1, int r2, java.lang.Integer r3, java.lang.Integer r4, java.lang.Integer r5, java.util.List r6, java.util.List r7, java.util.List r8, p000.C0387i8 r9) {
            r0 = this;
            r0.<init>()
            r0.f4267 = r1
            r0.f4268 = r2
            r0.f4269 = r3
            r0.f4270 = r4
            r0.f4271 = r5
            r0.f4272 = r6
            r0.f4273 = r7
            r0.f4274 = r8
            r0.f4275 = r9
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.C0313g8 m2266(p000.C0313g8 r10, java.util.List r11, java.util.List r12, java.util.List r13) {
            int r1 = r10.f4267
            int r2 = r10.f4268
            java.lang.Integer r3 = r10.f4269
            java.lang.Integer r4 = r10.f4270
            java.lang.Integer r5 = r10.f4271
            i8 r9 = r10.f4275
            g8 r0 = new g8
            r6 = r11
            r7 = r12
            r8 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0313g8
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            g8 r5 = (p000.C0313g8) r5
            int r1 = r4.f4267
            int r3 = r5.f4267
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f4268
            int r3 = r5.f4268
            if (r1 == r3) goto L1a
            return r2
        L1a:
            java.lang.Integer r1 = r4.f4269
            java.lang.Integer r3 = r5.f4269
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L25
            return r2
        L25:
            java.lang.Integer r1 = r4.f4270
            java.lang.Integer r3 = r5.f4270
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L30
            return r2
        L30:
            java.lang.Integer r1 = r4.f4271
            java.lang.Integer r3 = r5.f4271
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L3b
            return r2
        L3b:
            java.util.List r1 = r4.f4272
            java.util.List r3 = r5.f4272
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L46
            return r2
        L46:
            java.util.List r1 = r4.f4273
            java.util.List r3 = r5.f4273
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L51
            return r2
        L51:
            java.util.List r1 = r4.f4274
            java.util.List r3 = r5.f4274
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L5c
            return r2
        L5c:
            i8 r4 = r4.f4275
            i8 r5 = r5.f4275
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L67
            return r2
        L67:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f4267
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f4268
            int r0 = p000.a12.m14(r2, r0, r1)
            r2 = 0
            java.lang.Integer r3 = r4.f4269
            if (r3 != 0) goto L16
            r3 = r2
            goto L1a
        L16:
            int r3 = r3.hashCode()
        L1a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f4270
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f4271
            if (r3 != 0) goto L2e
            r3 = r2
            goto L32
        L2e:
            int r3 = r3.hashCode()
        L32:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.util.List r3 = r4.f4272
            if (r3 != 0) goto L3a
            r3 = r2
            goto L3e
        L3a:
            int r3 = r3.hashCode()
        L3e:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.util.List r3 = r4.f4273
            if (r3 != 0) goto L46
            r3 = r2
            goto L4a
        L46:
            int r3 = r3.hashCode()
        L4a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.util.List r3 = r4.f4274
            if (r3 != 0) goto L52
            r3 = r2
            goto L56
        L52:
            int r3 = r3.hashCode()
        L56:
            int r0 = r0 + r3
            int r0 = r0 * r1
            i8 r4 = r4.f4275
            if (r4 != 0) goto L5d
            goto L61
        L5d:
            int r2 = r4.hashCode()
        L61:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", imageIndex="
            java.lang.String r1 = ", clipType="
            java.lang.String r2 = "AwemePageMediaItem(pageIndex="
            int r3 = r5.f4267
            int r4 = r5.f4268
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.Integer r1 = r5.f4269
            r0.append(r1)
            java.lang.String r1 = ", imageType="
            r0.append(r1)
            java.lang.Integer r1 = r5.f4270
            r0.append(r1)
            java.lang.String r1 = ", livePhotoType="
            r0.append(r1)
            java.lang.Integer r1 = r5.f4271
            r0.append(r1)
            java.lang.String r1 = ", previewUrls="
            r0.append(r1)
            java.util.List r1 = r5.f4272
            r0.append(r1)
            java.lang.String r1 = ", downloadUrls="
            r0.append(r1)
            java.util.List r1 = r5.f4273
            r0.append(r1)
            java.lang.String r1 = ", watermarkFreeUrls="
            r0.append(r1)
            java.util.List r1 = r5.f4274
            r0.append(r1)
            java.lang.String r1 = ", embeddedVideo="
            r0.append(r1)
            i8 r5 = r5.f4275
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.String m2267() {
            r7 = this;
            r0 = 0
            i8 r7 = r7.f4275
            if (r7 == 0) goto L8
            java.util.List r1 = r7.f4955
            goto L9
        L8:
            r1 = r0
        L9:
            jz r2 = p000.C0450jz.f5672
            if (r1 != 0) goto Le
            r1 = r2
        Le:
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r3 = r1.hasNext()
            r4 = 0
            java.lang.String r5 = "http"
            if (r3 == 0) goto L29
            java.lang.Object r3 = r1.next()
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = p000.x02.m6485(r6, r5, r4)
            if (r6 == 0) goto L12
            goto L2a
        L29:
            r3 = r0
        L2a:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L79
            if (r7 == 0) goto L33
            java.util.List r1 = r7.f4957
            goto L34
        L33:
            r1 = r0
        L34:
            if (r1 != 0) goto L37
            r1 = r2
        L37:
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r1.next()
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = p000.x02.m6485(r6, r5, r4)
            if (r6 == 0) goto L3b
            goto L50
        L4f:
            r3 = r0
        L50:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L79
            if (r7 == 0) goto L59
            java.util.List r7 = r7.f4956
            goto L5a
        L59:
            r7 = r0
        L5a:
            if (r7 != 0) goto L5d
            goto L5e
        L5d:
            r2 = r7
        L5e:
            java.util.Iterator r7 = r2.iterator()
        L62:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r7.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = p000.x02.m6485(r2, r5, r4)
            if (r2 == 0) goto L62
            r0 = r1
        L76:
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L79:
            return r3
    }

    /* JADX INFO: renamed from: γ */
    public final java.lang.String m2268() {
            r7 = this;
            jz r0 = p000.C0450jz.f5672
            java.util.List r1 = r7.f4274
            if (r1 != 0) goto L7
            r1 = r0
        L7:
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            r3 = 0
            java.lang.String r4 = "http"
            r5 = 0
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = p000.x02.m6485(r6, r4, r3)
            if (r6 == 0) goto Lb
            goto L24
        L23:
            r2 = r5
        L24:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L6b
            java.util.List r1 = r7.f4273
            if (r1 != 0) goto L2d
            r1 = r0
        L2d:
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r1.next()
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = p000.x02.m6485(r6, r4, r3)
            if (r6 == 0) goto L31
            goto L46
        L45:
            r2 = r5
        L46:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L6b
            java.util.List r7 = r7.f4272
            if (r7 != 0) goto L4f
            goto L50
        L4f:
            r0 = r7
        L50:
            java.util.Iterator r7 = r0.iterator()
        L54:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r7.next()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = p000.x02.m6485(r1, r4, r3)
            if (r1 == 0) goto L54
            r5 = r0
        L68:
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L6b:
            return r2
    }
}
