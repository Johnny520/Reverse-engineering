package defpackage;

/* JADX INFO: renamed from: ᛱᛲᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0031 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f518;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f519;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public byte[] f520;

    public C0031() {
            r1 = this;
            r0 = 0
            r1.f519 = r0
            r1.<init>()
            r0 = 64
            byte[] r0 = new byte[r0]
            r1.f520 = r0
            return
    }

    public C0031(int r2, byte[] r3) {
            r1 = this;
            r0 = 1
            r1.f519 = r0
            r1.<init>()
            r1.f520 = r3
            r1.f518 = r2
            return
    }

    public /* synthetic */ C0031(boolean r1) {
            r0 = this;
            r1 = 0
            r0.f519 = r1
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r8 = this;
            int r0 = r8.f519
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r8 = super.toString()
            return r8
        La:
            byte[] r0 = r8.f520
            int r8 = r8.f518
            r1 = r0[r8]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r1 * 2
            r2.<init>(r3)
            r3 = 0
        L18:
            if (r3 >= r1) goto L53
            int r4 = r3 * 2
            int r5 = r4 + r8
            r6 = 1
            int r5 = r5 + r6
            r5 = r0[r5]
            if (r5 == 0) goto L4b
            if (r5 == r6) goto L45
            r6 = 2
            if (r5 == r6) goto L3f
            r7 = 3
            if (r5 != r7) goto L39
            int r4 = r4 + r8
            int r4 = r4 + r6
            r4 = r0[r4]
            r2.append(r4)
            r4 = 59
            r2.append(r4)
            goto L50
        L39:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L3f:
            r4 = 42
            r2.append(r4)
            goto L50
        L45:
            r4 = 46
            r2.append(r4)
            goto L50
        L4b:
            r4 = 91
            r2.append(r4)
        L50:
            int r3 = r3 + 1
            goto L18
        L53:
            java.lang.String r8 = r2.toString()
            return r8
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public void m338(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.f518
            int r0 = r0 + r5
            byte[] r1 = r2.f520
            int r1 = r1.length
            if (r0 <= r1) goto Lb
            r2.m345(r5)
        Lb:
            if (r3 == 0) goto L14
            byte[] r0 = r2.f520
            int r1 = r2.f518
            java.lang.System.arraycopy(r3, r4, r0, r1, r5)
        L14:
            int r3 = r2.f518
            int r3 = r3 + r5
            r2.f518 = r3
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public void m339(int r7) {
            r6 = this;
            int r0 = r6.f518
            int r1 = r0 + 4
            byte[] r2 = r6.f520
            int r2 = r2.length
            if (r1 <= r2) goto Ld
            r2 = 4
            r6.m345(r2)
        Ld:
            byte[] r2 = r6.f520
            int r3 = r0 + 1
            int r4 = r7 >>> 24
            byte r4 = (byte) r4
            r2[r0] = r4
            int r4 = r0 + 2
            int r5 = r7 >>> 16
            byte r5 = (byte) r5
            r2[r3] = r5
            int r0 = r0 + 3
            int r3 = r7 >>> 8
            byte r3 = (byte) r3
            r2[r4] = r3
            byte r7 = (byte) r7
            r2[r0] = r7
            r6.f518 = r1
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public void m340(int r5, int r6) {
            r4 = this;
            int r0 = r4.f518
            int r1 = r0 + 3
            byte[] r2 = r4.f520
            int r2 = r2.length
            if (r1 <= r2) goto Ld
            r2 = 3
            r4.m345(r2)
        Ld:
            byte[] r2 = r4.f520
            int r3 = r0 + 1
            byte r5 = (byte) r5
            r2[r0] = r5
            int r0 = r0 + 2
            int r5 = r6 >>> 8
            byte r5 = (byte) r5
            r2[r3] = r5
            byte r5 = (byte) r6
            r2[r0] = r5
            r4.f518 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public void m341(int r6, int r7) {
            r5 = this;
            int r0 = r5.f518
            int r1 = r0 + 4
            byte[] r2 = r5.f520
            int r2 = r2.length
            if (r1 <= r2) goto Ld
            r2 = 4
            r5.m345(r2)
        Ld:
            byte[] r2 = r5.f520
            int r3 = r0 + 1
            r4 = 15
            r2[r0] = r4
            int r4 = r0 + 2
            byte r6 = (byte) r6
            r2[r3] = r6
            int r0 = r0 + 3
            int r6 = r7 >>> 8
            byte r6 = (byte) r6
            r2[r4] = r6
            byte r6 = (byte) r7
            r2[r0] = r6
            r5.f518 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public void m342(int r5, int r6) {
            r4 = this;
            int r0 = r4.f518
            int r1 = r0 + 2
            byte[] r2 = r4.f520
            int r2 = r2.length
            if (r1 <= r2) goto Ld
            r2 = 2
            r4.m345(r2)
        Ld:
            byte[] r2 = r4.f520
            int r3 = r0 + 1
            byte r5 = (byte) r5
            r2[r0] = r5
            byte r5 = (byte) r6
            r2[r3] = r5
            r4.f518 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public void m343(java.lang.String r10, int r11, int r12) {
            r9 = this;
            int r0 = r10.length()
            r1 = r11
            r2 = r1
        L6:
            r3 = 2047(0x7ff, float:2.868E-42)
            r4 = 127(0x7f, float:1.78E-43)
            r5 = 1
            if (r1 >= r0) goto L22
            char r6 = r10.charAt(r1)
            if (r6 < r5) goto L18
            if (r6 > r4) goto L18
            int r2 = r2 + 1
            goto L1f
        L18:
            if (r6 > r3) goto L1d
            int r2 = r2 + 2
            goto L1f
        L1d:
            int r2 = r2 + 3
        L1f:
            int r1 = r1 + 1
            goto L6
        L22:
            if (r2 > r12) goto L95
            int r12 = r9.f518
            int r1 = r12 - r11
            int r6 = r1 + (-2)
            if (r6 < 0) goto L37
            byte[] r7 = r9.f520
            int r8 = r2 >>> 8
            byte r8 = (byte) r8
            r7[r6] = r8
            int r1 = r1 - r5
            byte r6 = (byte) r2
            r7[r1] = r6
        L37:
            int r12 = r12 + r2
            int r12 = r12 - r11
            byte[] r1 = r9.f520
            int r1 = r1.length
            if (r12 <= r1) goto L42
            int r2 = r2 - r11
            r9.m345(r2)
        L42:
            int r12 = r9.f518
        L44:
            if (r11 >= r0) goto L92
            char r1 = r10.charAt(r11)
            if (r1 < r5) goto L57
            if (r1 > r4) goto L57
            byte[] r2 = r9.f520
            int r6 = r12 + 1
            byte r1 = (byte) r1
            r2[r12] = r1
            r12 = r6
            goto L8f
        L57:
            byte[] r2 = r9.f520
            if (r1 > r3) goto L70
            int r6 = r12 + 1
            int r7 = r1 >> 6
            r7 = r7 & 31
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            r2[r12] = r7
            int r12 = r12 + 2
            r1 = r1 & 63
            r1 = r1 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r2[r6] = r1
            goto L8f
        L70:
            int r6 = r12 + 1
            int r7 = r1 >> 12
            r7 = r7 & 15
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            r2[r12] = r7
            int r7 = r12 + 2
            int r8 = r1 >> 6
            r8 = r8 & 63
            r8 = r8 | 128(0x80, float:1.8E-43)
            byte r8 = (byte) r8
            r2[r6] = r8
            int r12 = r12 + 3
            r1 = r1 & 63
            r1 = r1 | 128(0x80, float:1.8E-43)
            byte r1 = (byte) r1
            r2[r7] = r1
        L8f:
            int r11 = r11 + 1
            goto L44
        L92:
            r9.f518 = r12
            return
        L95:
            java.lang.String r9 = "UTF8 string too large"
            defpackage.C2264.m3684(r9)
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public void m344(int r6) {
            r5 = this;
            int r0 = r5.f518
            int r1 = r0 + 2
            byte[] r2 = r5.f520
            int r2 = r2.length
            if (r1 <= r2) goto Ld
            r2 = 2
            r5.m345(r2)
        Ld:
            byte[] r2 = r5.f520
            int r3 = r0 + 1
            int r4 = r6 >>> 8
            byte r4 = (byte) r4
            r2[r0] = r4
            byte r6 = (byte) r6
            r2[r3] = r6
            r5.f518 = r1
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void m345(int r4) {
            r3 = this;
            int r0 = r3.f518
            byte[] r1 = r3.f520
            int r2 = r1.length
            if (r0 > r2) goto L18
            int r2 = r1.length
            int r2 = r2 * 2
            int r4 = r4 + r0
            if (r2 <= r4) goto Le
            goto Lf
        Le:
            r2 = r4
        Lf:
            byte[] r4 = new byte[r2]
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r4, r2, r0)
            r3.f520 = r4
            return
        L18:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.String r4 = "Internal error"
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public void m346(int r6, int r7, int r8) {
            r5 = this;
            int r0 = r5.f518
            int r1 = r0 + 5
            byte[] r2 = r5.f520
            int r2 = r2.length
            if (r1 <= r2) goto Ld
            r2 = 5
            r5.m345(r2)
        Ld:
            byte[] r2 = r5.f520
            int r3 = r0 + 1
            byte r6 = (byte) r6
            r2[r0] = r6
            int r6 = r0 + 2
            int r4 = r7 >>> 8
            byte r4 = (byte) r4
            r2[r3] = r4
            int r3 = r0 + 3
            byte r7 = (byte) r7
            r2[r6] = r7
            int r0 = r0 + 4
            int r6 = r8 >>> 8
            byte r6 = (byte) r6
            r2[r3] = r6
            byte r6 = (byte) r8
            r2[r0] = r6
            r5.f518 = r1
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public void m347(int r4) {
            r3 = this;
            int r0 = r3.f518
            int r1 = r0 + 1
            byte[] r2 = r3.f520
            int r2 = r2.length
            if (r1 <= r2) goto Ld
            r2 = 1
            r3.m345(r2)
        Ld:
            byte[] r2 = r3.f520
            byte r4 = (byte) r4
            r2[r0] = r4
            r3.f518 = r1
            return
    }
}
