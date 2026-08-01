package defpackage;

/* JADX INFO: renamed from: ᛵᛶᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0919 implements android.graphics.ImageDecoder.OnHeaderDecodedListener {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C0521 f4166;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.EnumC0308 f4167;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f4168;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0082 f4169;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int f4170;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final boolean f4171;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.EnumC1492 f4172;

    public C0919(int r2, int r3, defpackage.C0533 r4) {
            r1 = this;
            r1.<init>()
            ᛱᛴᲁᛴ r0 = defpackage.C0082.m543()
            r1.f4169 = r0
            r1.f4170 = r2
            r1.f4168 = r3
            ᛵᲇᛳᲇ r2 = defpackage.C1459.f6410
            java.lang.Object r2 = r4.m1326(r2)
            ᛲᛶᛶᲁ r2 = (defpackage.EnumC0308) r2
            r1.f4167 = r2
            ᛵᲇᛳᲇ r2 = defpackage.C0521.f2575
            java.lang.Object r2 = r4.m1326(r2)
            ᛳᛸᛲᛲ r2 = (defpackage.C0521) r2
            r1.f4166 = r2
            ᛵᲇᛳᲇ r2 = defpackage.C1459.f6408
            java.lang.Object r3 = r4.m1326(r2)
            if (r3 == 0) goto L37
            java.lang.Object r2 = r4.m1326(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L37
            r2 = 1
            goto L38
        L37:
            r2 = 0
        L38:
            r1.f4171 = r2
            ᛵᲇᛳᲇ r2 = defpackage.C1459.f6411
            java.lang.Object r2 = r4.m1326(r2)
            ᛸᛵᛷᛳ r2 = (defpackage.EnumC1492) r2
            r1.f4172 = r2
            return
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(android.graphics.ImageDecoder r7, android.graphics.ImageDecoder.ImageInfo r8, android.graphics.ImageDecoder.Source r9) {
            r6 = this;
            ᛱᛴᲁᛴ r9 = r6.f4169
            int r0 = r6.f4170
            int r1 = r6.f4168
            boolean r2 = r6.f4171
            r3 = 0
            boolean r9 = r9.m544(r0, r1, r2, r3)
            if (r9 == 0) goto L14
            r9 = 3
            r7.setAllocator(r9)
            goto L18
        L14:
            r9 = 1
            r7.setAllocator(r9)
        L18:
            ᛲᛶᛶᲁ r9 = r6.f4167
            ᛲᛶᛶᲁ r2 = defpackage.EnumC0308.f1636
            if (r9 != r2) goto L21
            r7.setMemorySizePolicy(r3)
        L21:
            ᛲᛱᲇᛳ r9 = new ᛲᛱᲇᛳ
            r9.<init>()
            r7.setOnPartialImageListener(r9)
            android.util.Size r9 = r8.getSize()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L35
            int r0 = r9.getWidth()
        L35:
            if (r1 != r2) goto L3b
            int r1 = r9.getHeight()
        L3b:
            int r2 = r9.getWidth()
            int r3 = r9.getHeight()
            ᛳᛸᛲᛲ r4 = r6.f4166
            float r0 = r4.m1313(r2, r3, r0, r1)
            int r1 = r9.getWidth()
            float r1 = (float) r1
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            int r2 = r9.getHeight()
            float r2 = (float) r2
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            r3 = 2
            java.lang.String r4 = "ImageDecoder"
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            if (r3 == 0) goto L9d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Resizing from ["
            r3.<init>(r5)
            int r5 = r9.getWidth()
            r3.append(r5)
            java.lang.String r5 = "x"
            r3.append(r5)
            int r9 = r9.getHeight()
            r3.append(r9)
            java.lang.String r9 = "] to ["
            r3.append(r9)
            r3.append(r1)
            r3.append(r5)
            r3.append(r2)
            java.lang.String r9 = "] scaleFactor: "
            r3.append(r9)
            r3.append(r0)
            java.lang.String r9 = r3.toString()
            android.util.Log.v(r4, r9)
        L9d:
            r7.setTargetSize(r1, r2)
            ᛸᛵᛷᛳ r6 = r6.f4172
            if (r6 == 0) goto Lc4
            ᛸᛵᛷᛳ r9 = defpackage.EnumC1492.f6587
            if (r6 != r9) goto Lbb
            android.graphics.ColorSpace r6 = r8.getColorSpace()
            if (r6 == 0) goto Lbb
            android.graphics.ColorSpace r6 = r8.getColorSpace()
            boolean r6 = r6.isWideGamut()
            if (r6 == 0) goto Lbb
            android.graphics.ColorSpace$Named r6 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto Lbd
        Lbb:
            android.graphics.ColorSpace$Named r6 = android.graphics.ColorSpace.Named.SRGB
        Lbd:
            android.graphics.ColorSpace r6 = android.graphics.ColorSpace.get(r6)
            r7.setTargetColorSpace(r6)
        Lc4:
            return
    }
}
