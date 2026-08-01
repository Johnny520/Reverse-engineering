package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zo0 {

    /* JADX INFO: renamed from: α */
    public byte[] f13213;

    /* JADX INFO: renamed from: β */
    public int f13214;

    /* JADX INFO: renamed from: γ */
    public int f13215;

    /* JADX INFO: renamed from: δ */
    public int f13216;

    /* JADX INFO: renamed from: ε */
    public int f13217;

    /* JADX INFO: renamed from: ζ */
    public int[] f13218;

    /* JADX INFO: renamed from: η */
    public int f13219;

    /* JADX INFO: renamed from: θ */
    public boolean f13220;

    /* JADX INFO: renamed from: ι */
    public int f13221;

    /* JADX INFO: renamed from: κ */
    public int f13222;

    /* JADX INFO: renamed from: λ */
    public int f13223;

    /* JADX INFO: renamed from: μ */
    public int f13224;

    /* JADX INFO: renamed from: ν */
    public int f13225;

    /* JADX INFO: renamed from: ξ */
    public int[] f13226;

    /* JADX INFO: renamed from: ο */
    public int f13227;

    /* JADX INFO: renamed from: π */
    public byte[] f13228;

    /* JADX INFO: renamed from: α */
    public final void m7216(int r8, java.io.OutputStream r9) {
            r7 = this;
            byte[] r0 = r7.f13228
            int r1 = r7.f13224
            int[] r2 = r7.f13226
            int r3 = r7.f13225
            r2 = r2[r3]
            r1 = r1 & r2
            r7.f13224 = r1
            if (r3 <= 0) goto L15
            int r2 = r8 << r3
            r1 = r1 | r2
            r7.f13224 = r1
            goto L17
        L15:
            r7.f13224 = r8
        L17:
            int r1 = r7.f13216
            int r3 = r3 + r1
            r7.f13225 = r3
        L1c:
            int r1 = r7.f13225
            r2 = 254(0xfe, float:3.56E-43)
            r3 = 0
            r4 = 8
            if (r1 < r4) goto L4b
            int r1 = r7.f13224
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            int r5 = r7.f13227
            int r6 = r5 + 1
            r7.f13227 = r6
            r0[r5] = r1
            if (r6 < r2) goto L40
            if (r6 <= 0) goto L40
            r9.write(r6)
            int r1 = r7.f13227
            r9.write(r0, r3, r1)
            r7.f13227 = r3
        L40:
            int r1 = r7.f13224
            int r1 = r1 >> r4
            r7.f13224 = r1
            int r1 = r7.f13225
            int r1 = r1 - r4
            r7.f13225 = r1
            goto L1c
        L4b:
            int r1 = r7.f13219
            int r5 = r7.f13217
            if (r1 > r5) goto L55
            boolean r1 = r7.f13220
            if (r1 == 0) goto L79
        L55:
            boolean r1 = r7.f13220
            r5 = 1
            if (r1 == 0) goto L66
            int r1 = r7.f13221
            r7.f13216 = r1
            int r1 = r5 << r1
            int r1 = r1 - r5
            r7.f13217 = r1
            r7.f13220 = r3
            goto L79
        L66:
            int r1 = r7.f13216
            int r1 = r1 + r5
            r7.f13216 = r1
            r6 = 12
            if (r1 != r6) goto L74
            r1 = 4096(0x1000, float:5.74E-42)
            r7.f13217 = r1
            goto L79
        L74:
            int r1 = r5 << r1
            int r1 = r1 - r5
            r7.f13217 = r1
        L79:
            int r1 = r7.f13223
            if (r8 != r1) goto Lb5
        L7d:
            int r8 = r7.f13225
            if (r8 <= 0) goto La7
            int r8 = r7.f13224
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            int r1 = r7.f13227
            int r5 = r1 + 1
            r7.f13227 = r5
            r0[r1] = r8
            if (r5 < r2) goto L9c
            if (r5 <= 0) goto L9c
            r9.write(r5)
            int r8 = r7.f13227
            r9.write(r0, r3, r8)
            r7.f13227 = r3
        L9c:
            int r8 = r7.f13224
            int r8 = r8 >> r4
            r7.f13224 = r8
            int r8 = r7.f13225
            int r8 = r8 - r4
            r7.f13225 = r8
            goto L7d
        La7:
            int r8 = r7.f13227
            if (r8 <= 0) goto Lb5
            r9.write(r8)
            int r8 = r7.f13227
            r9.write(r0, r3, r8)
            r7.f13227 = r3
        Lb5:
            return
    }
}
