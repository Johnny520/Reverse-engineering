package com.bumptech.glide.gifencoder;

/* JADX INFO: loaded from: classes.dex */
class NeuQuant {
    protected static final int alphabiasshift = 10;
    protected static final int alpharadbias = 262144;
    protected static final int alpharadbshift = 18;
    protected static final int beta = 64;
    protected static final int betagamma = 65536;
    protected static final int betashift = 10;
    protected static final int gamma = 1024;
    protected static final int gammashift = 10;
    protected static final int initalpha = 1024;
    protected static final int initrad = 32;
    protected static final int initradius = 2048;
    protected static final int intbias = 65536;
    protected static final int intbiasshift = 16;
    protected static final int maxnetpos = 255;
    protected static final int minpicturebytes = 1509;
    protected static final int ncycles = 100;
    protected static final int netbiasshift = 4;
    protected static final int netsize = 256;
    protected static final int prime1 = 499;
    protected static final int prime2 = 491;
    protected static final int prime3 = 487;
    protected static final int prime4 = 503;
    protected static final int radbias = 256;
    protected static final int radbiasshift = 8;
    protected static final int radiusbias = 64;
    protected static final int radiusbiasshift = 6;
    protected static final int radiusdec = 30;
    protected int alphadec;
    protected int[] bias;
    protected int[] freq;
    protected int lengthcount;
    protected int[] netindex;
    protected int[][] network;
    protected int[] radpower;
    protected int samplefac;
    protected byte[] thepicture;

    public NeuQuant(byte[] r4, int r5, int r6) {
            r3 = this;
            r3.<init>()
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            r3.netindex = r1
            int[] r1 = new int[r0]
            r3.bias = r1
            int[] r1 = new int[r0]
            r3.freq = r1
            r1 = 32
            int[] r1 = new int[r1]
            r3.radpower = r1
            r3.thepicture = r4
            r3.lengthcount = r5
            r3.samplefac = r6
            int[][] r4 = new int[r0][]
            r3.network = r4
            r4 = 0
            r5 = r4
        L23:
            if (r5 >= r0) goto L42
            int[][] r6 = r3.network
            r1 = 4
            int[] r1 = new int[r1]
            r6[r5] = r1
            int r6 = r5 << 12
            int r6 = r6 / r0
            r2 = 2
            r1[r2] = r6
            r2 = 1
            r1[r2] = r6
            r1[r4] = r6
            int[] r6 = r3.freq
            r6[r5] = r0
            int[] r6 = r3.bias
            r6[r5] = r4
            int r5 = r5 + 1
            goto L23
        L42:
            return
    }

    public void alterneigh(int r15, int r16, int r17, int r18, int r19) {
            r14 = this;
            r0 = r14
            int r1 = r16 - r15
            r2 = -1
            if (r1 >= r2) goto L7
            r1 = r2
        L7:
            int r2 = r16 + r15
            r3 = 256(0x100, float:3.59E-43)
            if (r2 <= r3) goto Le
            r2 = r3
        Le:
            int r3 = r16 + 1
            r4 = 1
            int r5 = r16 + (-1)
            r6 = r4
        L14:
            if (r3 < r2) goto L1a
            if (r5 <= r1) goto L19
            goto L1a
        L19:
            return
        L1a:
            int[] r7 = r0.radpower
            int r8 = r6 + 1
            r6 = r7[r6]
            r7 = 2
            r9 = 0
            r10 = 262144(0x40000, float:3.67342E-40)
            if (r3 >= r2) goto L48
            int[][] r11 = r0.network
            int r12 = r3 + 1
            r3 = r11[r3]
            r11 = r3[r9]     // Catch: java.lang.Exception -> L47
            int r13 = r11 - r17
            int r13 = r13 * r6
            int r13 = r13 / r10
            int r11 = r11 - r13
            r3[r9] = r11     // Catch: java.lang.Exception -> L47
            r11 = r3[r4]     // Catch: java.lang.Exception -> L47
            int r13 = r11 - r18
            int r13 = r13 * r6
            int r13 = r13 / r10
            int r11 = r11 - r13
            r3[r4] = r11     // Catch: java.lang.Exception -> L47
            r11 = r3[r7]     // Catch: java.lang.Exception -> L47
            int r13 = r11 - r19
            int r13 = r13 * r6
            int r13 = r13 / r10
            int r11 = r11 - r13
            r3[r7] = r11     // Catch: java.lang.Exception -> L47
        L47:
            r3 = r12
        L48:
            if (r5 <= r1) goto L6e
            int[][] r11 = r0.network
            int r12 = r5 + (-1)
            r5 = r11[r5]
            r11 = r5[r9]     // Catch: java.lang.Exception -> L6b
            int r13 = r11 - r17
            int r13 = r13 * r6
            int r13 = r13 / r10
            int r11 = r11 - r13
            r5[r9] = r11     // Catch: java.lang.Exception -> L6b
            r9 = r5[r4]     // Catch: java.lang.Exception -> L6b
            int r11 = r9 - r18
            int r11 = r11 * r6
            int r11 = r11 / r10
            int r9 = r9 - r11
            r5[r4] = r9     // Catch: java.lang.Exception -> L6b
            r9 = r5[r7]     // Catch: java.lang.Exception -> L6b
            int r11 = r9 - r19
            int r6 = r6 * r11
            int r6 = r6 / r10
            int r9 = r9 - r6
            r5[r7] = r9     // Catch: java.lang.Exception -> L6b
        L6b:
            r6 = r8
            r5 = r12
            goto L14
        L6e:
            r6 = r8
            goto L14
    }

    public void altersingle(int r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int[][] r0 = r2.network
            r4 = r0[r4]
            r0 = 0
            r1 = r4[r0]
            int r5 = r1 - r5
            int r5 = r5 * r3
            int r5 = r5 / 1024
            int r1 = r1 - r5
            r4[r0] = r1
            r5 = 1
            r0 = r4[r5]
            int r6 = r0 - r6
            int r6 = r6 * r3
            int r6 = r6 / 1024
            int r0 = r0 - r6
            r4[r5] = r0
            r5 = 2
            r6 = r4[r5]
            int r7 = r6 - r7
            int r3 = r3 * r7
            int r3 = r3 / 1024
            int r6 = r6 - r3
            r4[r5] = r6
            return
    }

    public byte[] colorMap() {
            r11 = this;
            r0 = 768(0x300, float:1.076E-42)
            byte[] r0 = new byte[r0]
            r1 = 256(0x100, float:3.59E-43)
            int[] r2 = new int[r1]
            r3 = 0
            r4 = r3
        La:
            r5 = 3
            if (r4 >= r1) goto L18
            int[][] r6 = r11.network
            r6 = r6[r4]
            r5 = r6[r5]
            r2[r5] = r4
            int r4 = r4 + 1
            goto La
        L18:
            r4 = r3
            r6 = r4
        L1a:
            if (r4 >= r1) goto L3b
            r7 = r2[r4]
            int r8 = r6 + 1
            int[][] r9 = r11.network
            r7 = r9[r7]
            r9 = r7[r3]
            byte r9 = (byte) r9
            r0[r6] = r9
            int r9 = r6 + 2
            r10 = 1
            r10 = r7[r10]
            byte r10 = (byte) r10
            r0[r8] = r10
            int r6 = r6 + r5
            r8 = 2
            r7 = r7[r8]
            byte r7 = (byte) r7
            r0[r9] = r7
            int r4 = r4 + 1
            goto L1a
        L3b:
            return r0
    }

    public int contest(int r11, int r12, int r13) {
            r10 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = -1
            r2 = 0
            r3 = r1
            r4 = r3
            r5 = r2
            r1 = r0
        L9:
            r6 = 256(0x100, float:3.59E-43)
            if (r5 >= r6) goto L49
            int[][] r6 = r10.network
            r6 = r6[r5]
            r7 = r6[r2]
            int r7 = r7 - r11
            if (r7 >= 0) goto L17
            int r7 = -r7
        L17:
            r8 = 1
            r8 = r6[r8]
            int r8 = r8 - r12
            if (r8 >= 0) goto L1e
            int r8 = -r8
        L1e:
            int r7 = r7 + r8
            r8 = 2
            r6 = r6[r8]
            int r6 = r6 - r13
            if (r6 >= 0) goto L26
            int r6 = -r6
        L26:
            int r7 = r7 + r6
            if (r7 >= r0) goto L2b
            r3 = r5
            r0 = r7
        L2b:
            int[] r6 = r10.bias
            r8 = r6[r5]
            int r8 = r8 >> 12
            int r7 = r7 - r8
            if (r7 >= r1) goto L36
            r4 = r5
            r1 = r7
        L36:
            int[] r7 = r10.freq
            r8 = r7[r5]
            int r9 = r8 >> 10
            int r8 = r8 - r9
            r7[r5] = r8
            r7 = r6[r5]
            int r8 = r9 << 10
            int r7 = r7 + r8
            r6[r5] = r7
            int r5 = r5 + 1
            goto L9
        L49:
            int[] r11 = r10.freq
            r12 = r11[r3]
            int r12 = r12 + 64
            r11[r3] = r12
            int[] r11 = r10.bias
            r12 = r11[r3]
            r13 = 65536(0x10000, float:9.1835E-41)
            int r12 = r12 - r13
            r11[r3] = r12
            return r4
    }

    public void inxbuild() {
            r12 = this;
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            r4 = 256(0x100, float:3.59E-43)
            r5 = 1
            if (r1 >= r4) goto L5f
            int[][] r6 = r12.network
            r6 = r6[r1]
            r7 = r6[r5]
            int r8 = r1 + 1
            r10 = r1
            r9 = r8
        L13:
            if (r9 >= r4) goto L22
            int[][] r11 = r12.network
            r11 = r11[r9]
            r11 = r11[r5]
            if (r11 >= r7) goto L1f
            r10 = r9
            r7 = r11
        L1f:
            int r9 = r9 + 1
            goto L13
        L22:
            int[][] r4 = r12.network
            r4 = r4[r10]
            if (r1 == r10) goto L4a
            r9 = r4[r0]
            r10 = r6[r0]
            r4[r0] = r10
            r6[r0] = r9
            r9 = r4[r5]
            r10 = r6[r5]
            r4[r5] = r10
            r6[r5] = r9
            r9 = 2
            r10 = r4[r9]
            r11 = r6[r9]
            r4[r9] = r11
            r6[r9] = r10
            r9 = 3
            r10 = r4[r9]
            r11 = r6[r9]
            r4[r9] = r11
            r6[r9] = r10
        L4a:
            if (r7 == r2) goto L5d
            int[] r4 = r12.netindex
            int r3 = r3 + r1
            int r3 = r3 >> r5
            r4[r2] = r3
        L52:
            int r2 = r2 + 1
            if (r2 >= r7) goto L5b
            int[] r3 = r12.netindex
            r3[r2] = r1
            goto L52
        L5b:
            r3 = r1
            r2 = r7
        L5d:
            r1 = r8
            goto L4
        L5f:
            int[] r0 = r12.netindex
            r1 = 255(0xff, float:3.57E-43)
            int r3 = r3 + r1
            int r3 = r3 >> r5
            r0[r2] = r3
            int r2 = r2 + r5
        L68:
            if (r2 >= r4) goto L71
            int[] r0 = r12.netindex
            r0[r2] = r1
            int r2 = r2 + 1
            goto L68
        L71:
            return
    }

    public void learn() {
            r23 = this;
            r6 = r23
            int r7 = r6.lengthcount
            r8 = 1
            r0 = 1509(0x5e5, float:2.115E-42)
            if (r7 >= r0) goto Lb
            r6.samplefac = r8
        Lb:
            int r1 = r6.samplefac
            int r2 = r1 + (-1)
            r3 = 3
            int r2 = r2 / r3
            int r2 = r2 + 30
            r6.alphadec = r2
            byte[] r9 = r6.thepicture
            int r1 = r1 * r3
            int r10 = r7 / r1
            int r1 = r10 / 100
            r11 = 0
            r2 = r11
        L1e:
            r4 = 1024(0x400, float:1.435E-42)
            r5 = 32
            if (r2 >= r5) goto L33
            int[] r5 = r6.radpower
            int r12 = r2 * r2
            int r12 = 1024 - r12
            int r12 = r12 * 256
            int r12 = r12 / r4
            int r4 = r4 * r12
            r5[r2] = r4
            int r2 = r2 + 1
            goto L1e
        L33:
            int r2 = r6.lengthcount
            if (r2 >= r0) goto L39
            r12 = r3
            goto L4f
        L39:
            int r3 = r2 % 499
            if (r3 == 0) goto L41
            r0 = 1497(0x5d9, float:2.098E-42)
        L3f:
            r12 = r0
            goto L4f
        L41:
            int r3 = r2 % 491
            if (r3 == 0) goto L48
            r0 = 1473(0x5c1, float:2.064E-42)
            goto L3f
        L48:
            int r2 = r2 % 487
            if (r2 == 0) goto L3f
            r0 = 1461(0x5b5, float:2.047E-42)
            goto L3f
        L4f:
            r0 = 2048(0x800, float:2.87E-42)
            r13 = r0
            r14 = r1
            r15 = r4
            r16 = r5
            r5 = r11
            r17 = r5
        L59:
            if (r5 >= r10) goto Ld1
            r0 = r9[r17]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r0 << 4
            int r0 = r17 + 1
            r0 = r9[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r0 << 4
            int r0 = r17 + 2
            r0 = r9[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r0 << 4
            int r18 = r6.contest(r4, r3, r2)
            r0 = r23
            r1 = r15
            r19 = r2
            r2 = r18
            r20 = r3
            r3 = r4
            r21 = r4
            r4 = r20
            r22 = r5
            r5 = r19
            r0.altersingle(r1, r2, r3, r4, r5)
            if (r16 == 0) goto L9b
            r0 = r23
            r1 = r16
            r2 = r18
            r3 = r21
            r4 = r20
            r5 = r19
            r0.alterneigh(r1, r2, r3, r4, r5)
        L9b:
            int r0 = r17 + r12
            if (r0 < r7) goto La2
            int r1 = r6.lengthcount
            int r0 = r0 - r1
        La2:
            r17 = r0
            int r5 = r22 + 1
            if (r14 != 0) goto La9
            r14 = r8
        La9:
            int r0 = r5 % r14
            if (r0 != 0) goto L59
            int r0 = r6.alphadec
            int r0 = r15 / r0
            int r15 = r15 - r0
            int r0 = r13 / 30
            int r13 = r13 - r0
            int r0 = r13 >> 6
            if (r0 > r8) goto Lba
            r0 = r11
        Lba:
            r1 = r11
        Lbb:
            if (r1 >= r0) goto Lce
            int[] r2 = r6.radpower
            int r3 = r0 * r0
            int r4 = r1 * r1
            int r4 = r3 - r4
            int r4 = r4 * 256
            int r4 = r4 / r3
            int r4 = r4 * r15
            r2[r1] = r4
            int r1 = r1 + 1
            goto Lbb
        Lce:
            r16 = r0
            goto L59
        Ld1:
            return
    }

    public int map(int r13, int r14, int r15) {
            r12 = this;
            int[] r0 = r12.netindex
            r0 = r0[r14]
            int r1 = r0 + (-1)
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = -1
            r4 = r3
        La:
            r5 = 256(0x100, float:3.59E-43)
            if (r0 < r5) goto L12
            if (r1 < 0) goto L11
            goto L12
        L11:
            return r4
        L12:
            r6 = 3
            r7 = 2
            r8 = 0
            r9 = 1
            if (r0 >= r5) goto L3d
            int[][] r10 = r12.network
            r10 = r10[r0]
            r11 = r10[r9]
            int r11 = r11 - r14
            if (r11 < r2) goto L23
            r0 = r5
            goto L3d
        L23:
            int r0 = r0 + 1
            if (r11 >= 0) goto L28
            int r11 = -r11
        L28:
            r5 = r10[r8]
            int r5 = r5 - r13
            if (r5 >= 0) goto L2e
            int r5 = -r5
        L2e:
            int r11 = r11 + r5
            if (r11 >= r2) goto L3d
            r5 = r10[r7]
            int r5 = r5 - r15
            if (r5 >= 0) goto L37
            int r5 = -r5
        L37:
            int r11 = r11 + r5
            if (r11 >= r2) goto L3d
            r4 = r10[r6]
            r2 = r11
        L3d:
            if (r1 < 0) goto La
            int[][] r5 = r12.network
            r5 = r5[r1]
            r9 = r5[r9]
            int r9 = r14 - r9
            if (r9 < r2) goto L4b
            r1 = r3
            goto La
        L4b:
            int r1 = r1 + (-1)
            if (r9 >= 0) goto L50
            int r9 = -r9
        L50:
            r8 = r5[r8]
            int r8 = r8 - r13
            if (r8 >= 0) goto L56
            int r8 = -r8
        L56:
            int r9 = r9 + r8
            if (r9 >= r2) goto La
            r7 = r5[r7]
            int r7 = r7 - r15
            if (r7 >= 0) goto L5f
            int r7 = -r7
        L5f:
            int r7 = r7 + r9
            if (r7 >= r2) goto La
            r4 = r5[r6]
            r2 = r7
            goto La
    }

    public byte[] process() {
            r1 = this;
            r1.learn()
            r1.unbiasnet()
            r1.inxbuild()
            byte[] r0 = r1.colorMap()
            return r0
    }

    public void unbiasnet() {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 256(0x100, float:3.59E-43)
            if (r1 >= r2) goto L24
            int[][] r2 = r5.network
            r2 = r2[r1]
            r3 = r2[r0]
            int r3 = r3 >> 4
            r2[r0] = r3
            r3 = 1
            r4 = r2[r3]
            int r4 = r4 >> 4
            r2[r3] = r4
            r3 = 2
            r4 = r2[r3]
            int r4 = r4 >> 4
            r2[r3] = r4
            r3 = 3
            r2[r3] = r1
            int r1 = r1 + 1
            goto L2
        L24:
            return
    }
}
