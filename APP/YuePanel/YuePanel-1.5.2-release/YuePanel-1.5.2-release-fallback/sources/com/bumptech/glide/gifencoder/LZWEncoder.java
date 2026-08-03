package com.bumptech.glide.gifencoder;

/* JADX INFO: loaded from: classes.dex */
class LZWEncoder {
    static final int BITS = 12;
    private static final int EOF = -1;
    static final int HSIZE = 5003;
    int ClearCode;
    int EOFCode;
    int a_count;
    byte[] accum;
    boolean clear_flg;
    int[] codetab;
    private int curPixel;
    int cur_accum;
    int cur_bits;
    int free_ent;
    int g_init_bits;
    int hsize;
    int[] htab;
    private int imgH;
    private int imgW;
    private int initCodeSize;
    int[] masks;
    int maxbits;
    int maxcode;
    int maxmaxcode;
    int n_bits;
    private byte[] pixAry;
    private int remaining;

    public LZWEncoder(int r3, int r4, byte[] r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = 12
            r2.maxbits = r0
            r0 = 4096(0x1000, float:5.74E-42)
            r2.maxmaxcode = r0
            r0 = 5003(0x138b, float:7.01E-42)
            int[] r1 = new int[r0]
            r2.htab = r1
            int[] r1 = new int[r0]
            r2.codetab = r1
            r2.hsize = r0
            r0 = 0
            r2.free_ent = r0
            r2.clear_flg = r0
            r2.cur_accum = r0
            r2.cur_bits = r0
            r0 = 17
            int[] r0 = new int[r0]
            r0 = {x003e: FILL_ARRAY_DATA , data: [0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535} // fill-array
            r2.masks = r0
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            r2.accum = r0
            r2.imgW = r3
            r2.imgH = r4
            r2.pixAry = r5
            r3 = 2
            int r3 = java.lang.Math.max(r3, r6)
            r2.initCodeSize = r3
            return
    }

    private int nextPixel() {
            r3 = this;
            int r0 = r3.remaining
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int r0 = r0 + (-1)
            r3.remaining = r0
            byte[] r0 = r3.pixAry
            int r1 = r3.curPixel
            int r2 = r1 + 1
            r3.curPixel = r2
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    public final int MAXCODE(int r2) {
            r1 = this;
            r0 = 1
            int r2 = r0 << r2
            int r2 = r2 - r0
            return r2
    }

    public void char_out(byte r4, java.io.OutputStream r5) throws java.io.IOException {
            r3 = this;
            byte[] r0 = r3.accum
            int r1 = r3.a_count
            int r2 = r1 + 1
            r3.a_count = r2
            r0[r1] = r4
            r4 = 254(0xfe, float:3.56E-43)
            if (r2 < r4) goto L11
            r3.flush_char(r5)
        L11:
            return
    }

    public void cl_block(java.io.OutputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.hsize
            r2.cl_hash(r0)
            int r0 = r2.ClearCode
            int r1 = r0 + 2
            r2.free_ent = r1
            r1 = 1
            r2.clear_flg = r1
            r2.output(r0, r3)
            return
    }

    public void cl_hash(int r4) {
            r3 = this;
            r0 = 0
        L1:
            if (r0 >= r4) goto Lb
            int[] r1 = r3.htab
            r2 = -1
            r1[r0] = r2
            int r0 = r0 + 1
            goto L1
        Lb:
            return
    }

    public void compress(int r9, java.io.OutputStream r10) throws java.io.IOException {
            r8 = this;
            r8.g_init_bits = r9
            r0 = 0
            r8.clear_flg = r0
            r8.n_bits = r9
            int r1 = r8.MAXCODE(r9)
            r8.maxcode = r1
            r1 = 1
            int r9 = r9 - r1
            int r9 = r1 << r9
            r8.ClearCode = r9
            int r2 = r9 + 1
            r8.EOFCode = r2
            int r9 = r9 + 2
            r8.free_ent = r9
            r8.a_count = r0
            int r9 = r8.nextPixel()
            int r2 = r8.hsize
        L23:
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r2 >= r3) goto L2c
            int r0 = r0 + 1
            int r2 = r2 * 2
            goto L23
        L2c:
            int r0 = 8 - r0
            int r2 = r8.hsize
            r8.cl_hash(r2)
            int r3 = r8.ClearCode
            r8.output(r3, r10)
        L38:
            int r3 = r8.nextPixel()
            r4 = -1
            if (r3 == r4) goto L85
            int r4 = r8.maxbits
            int r4 = r3 << r4
            int r4 = r4 + r9
            int r5 = r3 << r0
            r5 = r5 ^ r9
            int[] r6 = r8.htab
            r6 = r6[r5]
            if (r6 != r4) goto L52
            int[] r9 = r8.codetab
            r9 = r9[r5]
            goto L38
        L52:
            if (r6 < 0) goto L6a
            int r6 = r2 - r5
            if (r5 != 0) goto L59
            r6 = r1
        L59:
            int r5 = r5 - r6
            if (r5 >= 0) goto L5d
            int r5 = r5 + r2
        L5d:
            int[] r7 = r8.htab
            r7 = r7[r5]
            if (r7 != r4) goto L68
            int[] r9 = r8.codetab
            r9 = r9[r5]
            goto L38
        L68:
            if (r7 >= 0) goto L59
        L6a:
            r8.output(r9, r10)
            int r9 = r8.free_ent
            int r6 = r8.maxmaxcode
            if (r9 >= r6) goto L80
            int[] r6 = r8.codetab
            int r7 = r9 + 1
            r8.free_ent = r7
            r6[r5] = r9
            int[] r9 = r8.htab
            r9[r5] = r4
            goto L83
        L80:
            r8.cl_block(r10)
        L83:
            r9 = r3
            goto L38
        L85:
            r8.output(r9, r10)
            int r9 = r8.EOFCode
            r8.output(r9, r10)
            return
    }

    public void encode(java.io.OutputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.initCodeSize
            r3.write(r0)
            int r0 = r2.imgW
            int r1 = r2.imgH
            int r0 = r0 * r1
            r2.remaining = r0
            r0 = 0
            r2.curPixel = r0
            int r1 = r2.initCodeSize
            int r1 = r1 + 1
            r2.compress(r1, r3)
            r3.write(r0)
            return
    }

    public void flush_char(java.io.OutputStream r4) throws java.io.IOException {
            r3 = this;
            int r0 = r3.a_count
            if (r0 <= 0) goto L11
            r4.write(r0)
            byte[] r0 = r3.accum
            int r1 = r3.a_count
            r2 = 0
            r4.write(r0, r2, r1)
            r3.a_count = r2
        L11:
            return
    }

    public void output(int r4, java.io.OutputStream r5) throws java.io.IOException {
            r3 = this;
            int r0 = r3.cur_accum
            int[] r1 = r3.masks
            int r2 = r3.cur_bits
            r1 = r1[r2]
            r0 = r0 & r1
            r3.cur_accum = r0
            if (r2 <= 0) goto L13
            int r1 = r4 << r2
            r0 = r0 | r1
            r3.cur_accum = r0
            goto L15
        L13:
            r3.cur_accum = r4
        L15:
            int r0 = r3.n_bits
            int r2 = r2 + r0
            r3.cur_bits = r2
        L1a:
            int r0 = r3.cur_bits
            r1 = 8
            if (r0 < r1) goto L33
            int r0 = r3.cur_accum
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r3.char_out(r0, r5)
            int r0 = r3.cur_accum
            int r0 = r0 >> r1
            r3.cur_accum = r0
            int r0 = r3.cur_bits
            int r0 = r0 - r1
            r3.cur_bits = r0
            goto L1a
        L33:
            int r0 = r3.free_ent
            int r2 = r3.maxcode
            if (r0 > r2) goto L3d
            boolean r0 = r3.clear_flg
            if (r0 == 0) goto L64
        L3d:
            boolean r0 = r3.clear_flg
            if (r0 == 0) goto L4f
            int r0 = r3.g_init_bits
            r3.n_bits = r0
            int r0 = r3.MAXCODE(r0)
            r3.maxcode = r0
            r0 = 0
            r3.clear_flg = r0
            goto L64
        L4f:
            int r0 = r3.n_bits
            int r0 = r0 + 1
            r3.n_bits = r0
            int r2 = r3.maxbits
            if (r0 != r2) goto L5e
            int r0 = r3.maxmaxcode
            r3.maxcode = r0
            goto L64
        L5e:
            int r0 = r3.MAXCODE(r0)
            r3.maxcode = r0
        L64:
            int r0 = r3.EOFCode
            if (r4 != r0) goto L82
        L68:
            int r4 = r3.cur_bits
            if (r4 <= 0) goto L7f
            int r4 = r3.cur_accum
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r3.char_out(r4, r5)
            int r4 = r3.cur_accum
            int r4 = r4 >> r1
            r3.cur_accum = r4
            int r4 = r3.cur_bits
            int r4 = r4 - r1
            r3.cur_bits = r4
            goto L68
        L7f:
            r3.flush_char(r5)
        L82:
            return
    }
}
