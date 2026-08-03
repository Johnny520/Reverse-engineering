package com.bumptech.glide.gifencoder;

/* JADX INFO: loaded from: classes.dex */
public class AnimatedGifEncoder {
    private static final double MIN_TRANSPARENT_PERCENTAGE = 4.0d;
    private static final java.lang.String TAG = "AnimatedGifEncoder";
    private boolean closeStream;
    private int colorDepth;
    private byte[] colorTab;
    private int delay;
    private int dispose;
    private boolean firstFrame;
    private int fixedHeight;
    private int fixedWidth;
    private boolean hasTransparentPixels;
    private int height;
    private android.graphics.Bitmap image;
    private byte[] indexedPixels;
    private java.io.OutputStream out;
    private int palSize;
    private byte[] pixels;
    private int repeat;
    private int sample;
    private boolean sizeSet;
    private boolean started;
    private int transIndex;
    private java.lang.Integer transparent;
    private boolean[] usedEntry;
    private int width;

    public AnimatedGifEncoder() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.transparent = r0
            r0 = -1
            r3.repeat = r0
            r1 = 0
            r3.delay = r1
            r3.started = r1
            r2 = 256(0x100, float:3.59E-43)
            boolean[] r2 = new boolean[r2]
            r3.usedEntry = r2
            r2 = 7
            r3.palSize = r2
            r3.dispose = r0
            r3.closeStream = r1
            r0 = 1
            r3.firstFrame = r0
            r3.sizeSet = r1
            r0 = 10
            r3.sample = r0
            return
    }

    private void analyzePixels() {
            r9 = this;
            byte[] r0 = r9.pixels
            int r1 = r0.length
            int r2 = r1 / 3
            byte[] r3 = new byte[r2]
            r9.indexedPixels = r3
            com.bumptech.glide.gifencoder.NeuQuant r3 = new com.bumptech.glide.gifencoder.NeuQuant
            int r4 = r9.sample
            r3.<init>(r0, r1, r4)
            byte[] r0 = r3.process()
            r9.colorTab = r0
            r0 = 0
            r1 = r0
        L18:
            byte[] r4 = r9.colorTab
            int r5 = r4.length
            if (r1 >= r5) goto L30
            r5 = r4[r1]
            int r6 = r1 + 2
            r7 = r4[r6]
            r4[r1] = r7
            r4[r6] = r5
            boolean[] r4 = r9.usedEntry
            int r5 = r1 / 3
            r4[r5] = r0
            int r1 = r1 + 3
            goto L18
        L30:
            r1 = r0
            r4 = r1
        L32:
            if (r1 >= r2) goto L59
            byte[] r5 = r9.pixels
            int r6 = r4 + 1
            r7 = r5[r4]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r4 + 2
            r6 = r5[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r4 = r4 + 3
            r5 = r5[r8]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r3.map(r7, r6, r5)
            boolean[] r6 = r9.usedEntry
            r7 = 1
            r6[r5] = r7
            byte[] r6 = r9.indexedPixels
            byte r5 = (byte) r5
            r6[r1] = r5
            int r1 = r1 + 1
            goto L32
        L59:
            r1 = 0
            r9.pixels = r1
            r1 = 8
            r9.colorDepth = r1
            r1 = 7
            r9.palSize = r1
            java.lang.Integer r1 = r9.transparent
            if (r1 == 0) goto L72
            int r0 = r1.intValue()
            int r0 = r9.findClosest(r0)
            r9.transIndex = r0
            goto L7c
        L72:
            boolean r1 = r9.hasTransparentPixels
            if (r1 == 0) goto L7c
            int r0 = r9.findClosest(r0)
            r9.transIndex = r0
        L7c:
            return
    }

    private int findClosest(int r11) {
            r10 = this;
            byte[] r0 = r10.colorTab
            if (r0 != 0) goto L6
            r11 = -1
            return r11
        L6:
            int r0 = android.graphics.Color.red(r11)
            int r1 = android.graphics.Color.green(r11)
            int r11 = android.graphics.Color.blue(r11)
            byte[] r2 = r10.colorTab
            int r2 = r2.length
            r3 = 0
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            r5 = r4
            r4 = r3
        L1a:
            if (r3 >= r2) goto L48
            byte[] r6 = r10.colorTab
            int r7 = r3 + 1
            r8 = r6[r3]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r0 - r8
            int r9 = r3 + 2
            r7 = r6[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r1 - r7
            r6 = r6[r9]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r11 - r6
            int r8 = r8 * r8
            int r7 = r7 * r7
            int r8 = r8 + r7
            int r6 = r6 * r6
            int r8 = r8 + r6
            int r9 = r9 / 3
            boolean[] r6 = r10.usedEntry
            boolean r6 = r6[r9]
            if (r6 == 0) goto L45
            if (r8 >= r5) goto L45
            r5 = r8
            r4 = r9
        L45:
            int r3 = r3 + 3
            goto L1a
        L48:
            return r4
    }

    private void getImagePixels() {
            r12 = this;
            android.graphics.Bitmap r0 = r12.image
            int r7 = r0.getWidth()
            android.graphics.Bitmap r0 = r12.image
            int r8 = r0.getHeight()
            int r0 = r12.width
            if (r7 != r0) goto L14
            int r1 = r12.height
            if (r8 == r1) goto L28
        L14:
            int r1 = r12.height
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            r2 = 0
            r3 = 0
            r1.drawBitmap(r0, r3, r3, r2)
            r12.image = r0
        L28:
            int r0 = r7 * r8
            int[] r9 = new int[r0]
            android.graphics.Bitmap r1 = r12.image
            r5 = 0
            r6 = 0
            r3 = 0
            r2 = r9
            r4 = r7
            r1.getPixels(r2, r3, r4, r5, r6, r7, r8)
            int r1 = r0 * 3
            byte[] r1 = new byte[r1]
            r12.pixels = r1
            r1 = 0
            r12.hasTransparentPixels = r1
            r2 = r1
            r3 = r2
            r4 = r3
        L42:
            r5 = 3
            if (r2 >= r0) goto L68
            r6 = r9[r2]
            if (r6 != 0) goto L4b
            int r3 = r3 + 1
        L4b:
            byte[] r7 = r12.pixels
            int r8 = r4 + 1
            r10 = r6 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r7[r4] = r10
            int r10 = r4 + 2
            int r11 = r6 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            r7[r8] = r11
            int r4 = r4 + r5
            int r5 = r6 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r7[r10] = r5
            int r2 = r2 + 1
            goto L42
        L68:
            int r3 = r3 * 100
            double r2 = (double) r3
            double r6 = (double) r0
            double r2 = r2 / r6
            r6 = 4616189618054758400(0x4010000000000000, double:4.0)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L74
            r1 = 1
        L74:
            r12.hasTransparentPixels = r1
            java.lang.String r0 = "AnimatedGifEncoder"
            boolean r1 = android.util.Log.isLoggable(r0, r5)
            if (r1 == 0) goto L97
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "got pixels for frame with "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = "% transparent pixels"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L97:
            return
    }

    private void setFrameSize(int r1, int r2) {
            r0 = this;
            r0.width = r1
            r0.height = r2
            return
    }

    private void writeGraphicCtrlExt() throws java.io.IOException {
            r5 = this;
            java.io.OutputStream r0 = r5.out
            r1 = 33
            r0.write(r1)
            java.io.OutputStream r0 = r5.out
            r1 = 249(0xf9, float:3.49E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r5.out
            r1 = 4
            r0.write(r1)
            java.lang.Integer r0 = r5.transparent
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L21
            boolean r0 = r5.hasTransparentPixels
            if (r0 != 0) goto L21
            r0 = r2
            r3 = r0
            goto L23
        L21:
            r0 = 1
            r3 = r1
        L23:
            int r4 = r5.dispose
            if (r4 < 0) goto L29
            r3 = r4 & 7
        L29:
            int r1 = r3 << 2
            java.io.OutputStream r3 = r5.out
            r0 = r0 | r1
            r3.write(r0)
            int r0 = r5.delay
            r5.writeShort(r0)
            java.io.OutputStream r0 = r5.out
            int r1 = r5.transIndex
            r0.write(r1)
            java.io.OutputStream r0 = r5.out
            r0.write(r2)
            return
    }

    private void writeImageDesc(int r3, int r4) throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            r1 = 44
            r0.write(r1)
            r2.writeShort(r3)
            r2.writeShort(r4)
            int r3 = r2.width
            r2.writeShort(r3)
            int r3 = r2.height
            r2.writeShort(r3)
            boolean r3 = r2.firstFrame
            if (r3 == 0) goto L22
            java.io.OutputStream r3 = r2.out
            r4 = 0
            r3.write(r4)
            goto L2b
        L22:
            java.io.OutputStream r3 = r2.out
            int r4 = r2.palSize
            r4 = r4 | 128(0x80, float:1.8E-43)
            r3.write(r4)
        L2b:
            return
    }

    private void writeLSD() throws java.io.IOException {
            r2 = this;
            int r0 = r2.width
            r2.writeShort(r0)
            int r0 = r2.height
            r2.writeShort(r0)
            java.io.OutputStream r0 = r2.out
            int r1 = r2.palSize
            r1 = r1 | 240(0xf0, float:3.36E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            r1 = 0
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            r0.write(r1)
            return
    }

    private void writeNetscapeExt() throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            r1 = 33
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            r1 = 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            r1 = 11
            r0.write(r1)
            java.lang.String r0 = "NETSCAPE2.0"
            r2.writeString(r0)
            java.io.OutputStream r0 = r2.out
            r1 = 3
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            r1 = 1
            r0.write(r1)
            int r0 = r2.repeat
            r2.writeShort(r0)
            java.io.OutputStream r0 = r2.out
            r1 = 0
            r0.write(r1)
            return
    }

    private void writePalette() throws java.io.IOException {
            r4 = this;
            java.io.OutputStream r0 = r4.out
            byte[] r1 = r4.colorTab
            int r2 = r1.length
            r3 = 0
            r0.write(r1, r3, r2)
            byte[] r0 = r4.colorTab
            int r0 = r0.length
            int r0 = 768 - r0
            r1 = r3
        Lf:
            if (r1 >= r0) goto L19
            java.io.OutputStream r2 = r4.out
            r2.write(r3)
            int r1 = r1 + 1
            goto Lf
        L19:
            return
    }

    private void writePixels() throws java.io.IOException {
            r5 = this;
            com.bumptech.glide.gifencoder.LZWEncoder r0 = new com.bumptech.glide.gifencoder.LZWEncoder
            int r1 = r5.width
            int r2 = r5.height
            byte[] r3 = r5.indexedPixels
            int r4 = r5.colorDepth
            r0.<init>(r1, r2, r3, r4)
            java.io.OutputStream r1 = r5.out
            r0.encode(r1)
            return
    }

    private void writeShort(int r3) throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            r1 = r3 & 255(0xff, float:3.57E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r2.out
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.write(r3)
            return
    }

    private void writeString(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r4.length()
            if (r0 >= r1) goto L14
            java.io.OutputStream r1 = r3.out
            char r2 = r4.charAt(r0)
            byte r2 = (byte) r2
            r1.write(r2)
            int r0 = r0 + 1
            goto L1
        L14:
            return
    }

    public boolean addFrame(@Yue.InterfaceC4544 android.graphics.Bitmap r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.addFrame(r2, r0, r0)
            return r2
    }

    public boolean addFrame(@Yue.InterfaceC4544 android.graphics.Bitmap r4, int r5, int r6) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L4b
            boolean r1 = r3.started
            if (r1 != 0) goto L8
            goto L4b
        L8:
            boolean r1 = r3.sizeSet     // Catch: java.io.IOException -> L4b
            if (r1 == 0) goto L14
            int r1 = r3.fixedWidth     // Catch: java.io.IOException -> L4b
            int r2 = r3.fixedHeight     // Catch: java.io.IOException -> L4b
            r3.setFrameSize(r1, r2)     // Catch: java.io.IOException -> L4b
            goto L1f
        L14:
            int r1 = r4.getWidth()     // Catch: java.io.IOException -> L4b
            int r2 = r4.getHeight()     // Catch: java.io.IOException -> L4b
            r3.setFrameSize(r1, r2)     // Catch: java.io.IOException -> L4b
        L1f:
            r3.image = r4     // Catch: java.io.IOException -> L4b
            r3.getImagePixels()     // Catch: java.io.IOException -> L4b
            r3.analyzePixels()     // Catch: java.io.IOException -> L4b
            boolean r4 = r3.firstFrame     // Catch: java.io.IOException -> L4b
            if (r4 == 0) goto L38
            r3.writeLSD()     // Catch: java.io.IOException -> L4b
            r3.writePalette()     // Catch: java.io.IOException -> L4b
            int r4 = r3.repeat     // Catch: java.io.IOException -> L4b
            if (r4 < 0) goto L38
            r3.writeNetscapeExt()     // Catch: java.io.IOException -> L4b
        L38:
            r3.writeGraphicCtrlExt()     // Catch: java.io.IOException -> L4b
            r3.writeImageDesc(r5, r6)     // Catch: java.io.IOException -> L4b
            boolean r4 = r3.firstFrame     // Catch: java.io.IOException -> L4b
            if (r4 != 0) goto L45
            r3.writePalette()     // Catch: java.io.IOException -> L4b
        L45:
            r3.writePixels()     // Catch: java.io.IOException -> L4b
            r3.firstFrame = r0     // Catch: java.io.IOException -> L4b
            r0 = 1
        L4b:
            return r0
    }

    public boolean finish() {
            r4 = this;
            boolean r0 = r4.started
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r4.started = r1
            r0 = 1
            java.io.OutputStream r2 = r4.out     // Catch: java.io.IOException -> L20
            r3 = 59
            r2.write(r3)     // Catch: java.io.IOException -> L20
            java.io.OutputStream r2 = r4.out     // Catch: java.io.IOException -> L20
            r2.flush()     // Catch: java.io.IOException -> L20
            boolean r2 = r4.closeStream     // Catch: java.io.IOException -> L20
            if (r2 == 0) goto L1e
            java.io.OutputStream r2 = r4.out     // Catch: java.io.IOException -> L20
            r2.close()     // Catch: java.io.IOException -> L20
        L1e:
            r2 = r0
            goto L21
        L20:
            r2 = r1
        L21:
            r4.transIndex = r1
            r3 = 0
            r4.out = r3
            r4.image = r3
            r4.pixels = r3
            r4.indexedPixels = r3
            r4.colorTab = r3
            r4.closeStream = r1
            r4.firstFrame = r0
            return r2
    }

    public void setDelay(int r2) {
            r1 = this;
            float r2 = (float) r2
            r0 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r0
            int r2 = java.lang.Math.round(r2)
            r1.delay = r2
            return
    }

    public void setDispose(int r1) {
            r0 = this;
            if (r1 < 0) goto L4
            r0.dispose = r1
        L4:
            return
    }

    public void setFrameRate(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Le
            r0 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r2
            int r2 = java.lang.Math.round(r0)
            r1.delay = r2
        Le:
            return
    }

    public void setQuality(int r2) {
            r1 = this;
            r0 = 1
            if (r2 >= r0) goto L4
            r2 = r0
        L4:
            r1.sample = r2
            return
    }

    public void setRepeat(int r1) {
            r0 = this;
            if (r1 < 0) goto L4
            r0.repeat = r1
        L4:
            return
    }

    public void setSize(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.started
            if (r0 == 0) goto L5
            return
        L5:
            r1.fixedWidth = r2
            r1.fixedHeight = r3
            r0 = 1
            if (r2 >= r0) goto L10
            r2 = 320(0x140, float:4.48E-43)
            r1.fixedWidth = r2
        L10:
            if (r3 >= r0) goto L16
            r2 = 240(0xf0, float:3.36E-43)
            r1.fixedHeight = r2
        L16:
            r1.sizeSet = r0
            return
    }

    public void setTransparent(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.transparent = r1
            return
    }

    public boolean start(@Yue.InterfaceC4544 java.io.OutputStream r2) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            r1.closeStream = r0
            r1.out = r2
            java.lang.String r2 = "GIF89a"
            r1.writeString(r2)     // Catch: java.io.IOException -> Le
            r0 = 1
        Le:
            r1.started = r0
            return r0
    }

    public boolean start(@Yue.InterfaceC4410 java.lang.String r3) {
            r2 = this;
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch: java.io.IOException -> L14
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L14
            r1.<init>(r3)     // Catch: java.io.IOException -> L14
            r0.<init>(r1)     // Catch: java.io.IOException -> L14
            r2.out = r0     // Catch: java.io.IOException -> L14
            boolean r3 = r2.start(r0)     // Catch: java.io.IOException -> L14
            r0 = 1
            r2.closeStream = r0     // Catch: java.io.IOException -> L14
            goto L15
        L14:
            r3 = 0
        L15:
            r2.started = r3
            return r3
    }
}
