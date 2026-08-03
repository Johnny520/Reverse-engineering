package p000;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public static final java.lang.Object f171 = null;

    /* JADX INFO: renamed from: ۥ۠ۦ, reason: contains not printable characters */
    public static final ۟.c0.a f172 = null;

    /* JADX INFO: renamed from: ۥ۠ۧ, reason: contains not printable characters */
    public static final java.util.concurrent.atomic.AtomicInteger f173 = null;

    /* JADX INFO: renamed from: ۥ۠ۨ, reason: contains not printable characters */
    public static final ۟.c0.b f174 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f175;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final p000.z7 f176;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final p000.s1 f177;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final p000.e0 f178;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final p000.fa f179;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final java.lang.String f180;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final p000.w8 f181;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final int f182;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public int f183;

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final p000.y8 f184;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public p000.f f185;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public java.util.ArrayList f186;

    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public android.graphics.Bitmap f187;

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public java.util.concurrent.Future<?> f188;

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public ۟.z7.e f189;

    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    public java.lang.Exception f190;

    /* JADX INFO: renamed from: ۥ۠ۢ, reason: contains not printable characters */
    public int f191;

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public int f192;

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public int f193;

    public static class a extends java.lang.ThreadLocal<java.lang.StringBuilder> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final java.lang.StringBuilder initialValue() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Picasso-"
                r0.<init>(r1)
                return r0
        }
    }

    public static class b extends p000.y8 {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p000.y8
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final boolean mo94(p000.w8 r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // p000.y8
        /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
        public final ۟.y8.a mo95(p000.w8 r4) {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unrecognized type of request: "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }
    }

    public static class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.rb f194;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ java.lang.RuntimeException f195;

        public c(p000.rb r1, java.lang.RuntimeException r2) {
                r0 = this;
                r0.f194 = r1
                r0.f195 = r2
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Transformation "
                java.lang.StringBuilder r1 = p000.c4.m108(r1)
                ۟.rb r2 = r3.f194
                java.lang.String r2 = r2.m381()
                r1.append(r2)
                java.lang.String r2 = " crashed with exception."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.RuntimeException r2 = r3.f195
                r0.<init>(r1, r2)
                throw r0
        }
    }

    public static class d implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ java.lang.StringBuilder f196;

        public d(java.lang.StringBuilder r1) {
                r0 = this;
                r0.f196 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.StringBuilder r1 = r2.f196
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    public static class e implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.rb f197;

        public e(p000.rb r1) {
                r0 = this;
                r0.f197 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Transformation "
                java.lang.StringBuilder r1 = p000.c4.m108(r1)
                ۟.rb r2 = r3.f197
                java.lang.String r2 = r2.m381()
                r1.append(r2)
                java.lang.String r2 = " returned input Bitmap but recycled it."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    public static class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.rb f198;

        public f(p000.rb r1) {
                r0 = this;
                r0.f198 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Transformation "
                java.lang.StringBuilder r1 = p000.c4.m108(r1)
                ۟.rb r2 = r3.f198
                java.lang.String r2 = r2.m381()
                r1.append(r2)
                java.lang.String r2 = " mutated input Bitmap but failed to recycle the original."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.c0.f171 = r0
            ۟.c0$a r0 = new ۟.c0$a
            r0.<init>()
            p000.c0.f172 = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            p000.c0.f173 = r0
            ۟.c0$b r0 = new ۟.c0$b
            r0.<init>()
            p000.c0.f174 = r0
            return
    }

    public c0(p000.z7 r2, p000.s1 r3, p000.e0 r4, p000.fa r5, p000.f r6, p000.y8 r7) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = p000.c0.f173
            int r0 = r0.incrementAndGet()
            r1.f175 = r0
            r1.f176 = r2
            r1.f177 = r3
            r1.f178 = r4
            r1.f179 = r5
            r1.f185 = r6
            java.lang.String r2 = r6.f321
            r1.f180 = r2
            ۟.w8 r2 = r6.f314
            r1.f181 = r2
            int r2 = r2.f1143
            r1.f193 = r2
            int r2 = r6.f317
            r1.f182 = r2
            int r2 = r6.f318
            r1.f183 = r2
            r1.f184 = r7
            int r2 = r7.mo435()
            r1.f192 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.graphics.Bitmap m87(java.util.List<p000.rb> r6, android.graphics.Bitmap r7) {
            int r0 = r6.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L8c
            java.lang.Object r2 = r6.get(r1)
            ۟.rb r2 = (p000.rb) r2
            r3 = 0
            android.graphics.Bitmap r4 = r2.m382()     // Catch: java.lang.RuntimeException -> L80
            if (r4 != 0) goto L56
            java.lang.String r7 = "Transformation "
            java.lang.StringBuilder r7 = p000.c4.m108(r7)
            java.lang.String r0 = r2.m381()
            r7.append(r0)
            java.lang.String r0 = " returned null after "
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = " previous transformation(s).\n\nTransformation list:\n"
            r7.append(r0)
            java.util.Iterator r6 = r6.iterator()
        L32:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r6.next()
            ۟.rb r0 = (p000.rb) r0
            java.lang.String r0 = r0.m381()
            r7.append(r0)
            r0 = 10
            r7.append(r0)
            goto L32
        L4b:
            ۟.z7$a r6 = p000.z7.f1248
            ۟.c0$d r0 = new ۟.c0$d
            r0.<init>(r7)
            r6.post(r0)
            return r3
        L56:
            if (r4 != r7) goto L69
            boolean r5 = r7.isRecycled()
            if (r5 == 0) goto L69
            ۟.z7$a r6 = p000.z7.f1248
            ۟.c0$e r7 = new ۟.c0$e
            r7.<init>(r2)
            r6.post(r7)
            return r3
        L69:
            if (r4 == r7) goto L7c
            boolean r7 = r7.isRecycled()
            if (r7 != 0) goto L7c
            ۟.z7$a r6 = p000.z7.f1248
            ۟.c0$f r7 = new ۟.c0$f
            r7.<init>(r2)
            r6.post(r7)
            return r3
        L7c:
            int r1 = r1 + 1
            r7 = r4
            goto L5
        L80:
            r6 = move-exception
            ۟.z7$a r7 = p000.z7.f1248
            ۟.c0$c r0 = new ۟.c0$c
            r0.<init>(r2, r6)
            r7.post(r0)
            return r3
        L8c:
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.graphics.Bitmap m88(java.io.InputStream r11, p000.w8 r12) {
            ۟.p5 r0 = new ۟.p5
            r0.<init>(r11)
            r11 = 65536(0x10000, float:9.1835E-41)
            long r1 = r0.m335(r11)
            android.graphics.BitmapFactory$Options r11 = p000.y8.m478(r12)
            r3 = 1
            r9 = 0
            if (r11 == 0) goto L19
            boolean r4 = r11.inJustDecodeBounds
            if (r4 == 0) goto L19
            r4 = r3
            goto L1a
        L19:
            r4 = r9
        L1a:
            java.lang.StringBuilder r5 = p000.ic.f502
            r5 = 12
            byte[] r6 = new byte[r5]
            int r7 = r0.read(r6, r9, r5)
            if (r7 != r5) goto L46
            java.lang.String r5 = new java.lang.String
            r7 = 4
            java.lang.String r8 = "US-ASCII"
            r5.<init>(r6, r9, r7, r8)
            java.lang.String r10 = "RIFF"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L46
            java.lang.String r5 = new java.lang.String
            r10 = 8
            r5.<init>(r6, r10, r7, r8)
            java.lang.String r6 = "WEBP"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L46
            goto L47
        L46:
            r3 = r9
        L47:
            r0.m334(r1)
            if (r3 == 0) goto L7d
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]
        L55:
            r3 = -1
            int r5 = r0.read(r2)
            if (r3 == r5) goto L60
            r1.write(r2, r9, r5)
            goto L55
        L60:
            byte[] r0 = r1.toByteArray()
            if (r4 == 0) goto L77
            int r1 = r0.length
            android.graphics.BitmapFactory.decodeByteArray(r0, r9, r1, r11)
            int r3 = r12.f1133
            int r4 = r12.f1134
            int r5 = r11.outWidth
            int r6 = r11.outHeight
            r7 = r11
            r8 = r12
            p000.y8.m477(r3, r4, r5, r6, r7, r8)
        L77:
            int r12 = r0.length
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeByteArray(r0, r9, r12, r11)
            return r11
        L7d:
            r9 = 0
            if (r4 == 0) goto L93
            android.graphics.BitmapFactory.decodeStream(r0, r9, r11)
            int r3 = r12.f1133
            int r4 = r12.f1134
            int r5 = r11.outWidth
            int r6 = r11.outHeight
            r7 = r11
            r8 = r12
            p000.y8.m477(r3, r4, r5, r6, r7, r8)
            r0.m334(r1)
        L93:
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r0, r9, r11)
            if (r11 == 0) goto L9a
            return r11
        L9a:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r12 = "Failed to decode stream."
            r11.<init>(r12)
            throw r11
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static android.graphics.Bitmap m89(p000.w8 r16, android.graphics.Bitmap r17, int r18) {
            r0 = r16
            r1 = r18
            int r2 = r17.getWidth()
            int r3 = r17.getHeight()
            boolean r4 = r0.f1137
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            boolean r5 = r16.m455()
            r6 = 0
            if (r5 == 0) goto Lbf
            int r5 = r0.f1133
            int r7 = r0.f1134
            float r8 = r0.f1138
            r9 = 0
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 == 0) goto L34
            boolean r9 = r0.f1141
            if (r9 == 0) goto L31
            float r9 = r0.f1139
            float r11 = r0.f1140
            r10.setRotate(r8, r9, r11)
            goto L34
        L31:
            r10.setRotate(r8)
        L34:
            boolean r8 = r0.f1135
            r9 = 1
            if (r8 == 0) goto L7c
            float r0 = (float) r5
            float r8 = (float) r2
            float r11 = r0 / r8
            float r12 = (float) r7
            float r13 = (float) r3
            float r14 = r12 / r13
            int r15 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r15 <= 0) goto L58
            float r14 = r14 / r11
            float r14 = r14 * r13
            double r13 = (double) r14
            double r13 = java.lang.Math.ceil(r13)
            int r0 = (int) r13
            int r8 = r3 - r0
            int r8 = r8 / 2
            float r13 = (float) r0
            float r14 = r12 / r13
            r13 = r6
            r12 = r11
            r11 = r2
            goto L6b
        L58:
            float r11 = r11 / r14
            float r11 = r11 * r8
            double r11 = (double) r11
            double r11 = java.lang.Math.ceil(r11)
            int r8 = (int) r11
            int r11 = r2 - r8
            int r11 = r11 / 2
            float r12 = (float) r8
            float r0 = r0 / r12
            r12 = r0
            r0 = r3
            r13 = r11
            r11 = r8
            r8 = r6
        L6b:
            if (r4 == 0) goto L71
            if (r2 > r5) goto L71
            if (r3 <= r7) goto L72
        L71:
            r6 = r9
        L72:
            if (r6 == 0) goto L77
            r10.preScale(r12, r14)
        L77:
            r9 = r0
            r7 = r8
            r8 = r11
            r6 = r13
            goto Lc2
        L7c:
            boolean r0 = r0.f1136
            if (r0 == 0) goto L9a
            float r0 = (float) r5
            float r8 = (float) r2
            float r0 = r0 / r8
            float r8 = (float) r7
            float r11 = (float) r3
            float r8 = r8 / r11
            int r11 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r11 >= 0) goto L8b
            goto L8c
        L8b:
            r0 = r8
        L8c:
            if (r4 == 0) goto L94
            if (r2 > r5) goto L94
            if (r3 <= r7) goto L93
            goto L94
        L93:
            r9 = r6
        L94:
            if (r9 == 0) goto Lbf
            r10.preScale(r0, r0)
            goto Lbf
        L9a:
            if (r5 != 0) goto L9e
            if (r7 == 0) goto Lbf
        L9e:
            if (r5 != r2) goto La2
            if (r7 == r3) goto Lbf
        La2:
            if (r5 == 0) goto La7
            float r0 = (float) r5
            float r8 = (float) r2
            goto La9
        La7:
            float r0 = (float) r7
            float r8 = (float) r3
        La9:
            float r0 = r0 / r8
            if (r7 == 0) goto Laf
            float r8 = (float) r7
            float r11 = (float) r3
            goto Lb1
        Laf:
            float r8 = (float) r5
            float r11 = (float) r2
        Lb1:
            float r8 = r8 / r11
            if (r4 == 0) goto Lba
            if (r2 > r5) goto Lba
            if (r3 <= r7) goto Lb9
            goto Lba
        Lb9:
            r9 = r6
        Lba:
            if (r9 == 0) goto Lbf
            r10.preScale(r0, r8)
        Lbf:
            r8 = r2
            r9 = r3
            r7 = r6
        Lc2:
            if (r1 == 0) goto Lc8
            float r0 = (float) r1
            r10.preRotate(r0)
        Lc8:
            r11 = 1
            r5 = r17
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            r1 = r17
            if (r0 == r1) goto Ld7
            r17.recycle()
            goto Ld8
        Ld7:
            r0 = r1
        Ld8:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static void m90(p000.w8 r3) {
            android.net.Uri r0 = r3.f1130
            if (r0 == 0) goto Ld
            java.lang.String r3 = r0.getPath()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L13
        Ld:
            int r3 = r3.f1131
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
        L13:
            ۟.c0$a r0 = p000.c0.f172
            java.lang.Object r0 = r0.get()
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            int r1 = r3.length()
            r2 = 8
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
            int r1 = r0.length()
            r0.replace(r2, r1, r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.toString()
            r3.setName(r0)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            java.lang.String r0 = "Picasso-Idle"
            ۟.w8 r1 = r5.f181     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26 java.lang.OutOfMemoryError -> L2f java.io.IOException -> L51 ۟.v6.a -> L5a ۟.x1.b -> L68
            m90(r1)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26 java.lang.OutOfMemoryError -> L2f java.io.IOException -> L51 ۟.v6.a -> L5a ۟.x1.b -> L68
            ۟.z7 r1 = r5.f176     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26 java.lang.OutOfMemoryError -> L2f java.io.IOException -> L51 ۟.v6.a -> L5a ۟.x1.b -> L68
            boolean r1 = r1.f1261     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26 java.lang.OutOfMemoryError -> L2f java.io.IOException -> L51 ۟.v6.a -> L5a ۟.x1.b -> L68
            if (r1 == 0) goto L10
            p000.ic.m202(r5)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26 java.lang.OutOfMemoryError -> L2f java.io.IOException -> L51 ۟.v6.a -> L5a ۟.x1.b -> L68
        L10:
            android.graphics.Bitmap r1 = r5.m93()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26 java.lang.OutOfMemoryError -> L2f java.io.IOException -> L51 ۟.v6.a -> L5a ۟.x1.b -> L68
            r5.f187 = r1     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26 java.lang.OutOfMemoryError -> L2f java.io.IOException -> L51 ۟.v6.a -> L5a ۟.x1.b -> L68
            if (r1 != 0) goto L1e
            ۟.s1 r1 = r5.f177     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26 java.lang.OutOfMemoryError -> L2f java.io.IOException -> L51 ۟.v6.a -> L5a ۟.x1.b -> L68
            r1.m388(r5)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26 java.lang.OutOfMemoryError -> L2f java.io.IOException -> L51 ۟.v6.a -> L5a ۟.x1.b -> L68
            goto L60
        L1e:
            ۟.s1 r1 = r5.f177     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26 java.lang.OutOfMemoryError -> L2f java.io.IOException -> L51 ۟.v6.a -> L5a ۟.x1.b -> L68
            r1.m387(r5)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L26 java.lang.OutOfMemoryError -> L2f java.io.IOException -> L51 ۟.v6.a -> L5a ۟.x1.b -> L68
            goto L60
        L24:
            r1 = move-exception
            goto L79
        L26:
            r1 = move-exception
            r5.f190 = r1     // Catch: java.lang.Throwable -> L24
            ۟.s1 r1 = r5.f177     // Catch: java.lang.Throwable -> L24
        L2b:
            r1.m388(r5)     // Catch: java.lang.Throwable -> L24
            goto L60
        L2f:
            r1 = move-exception
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L24
            r2.<init>()     // Catch: java.lang.Throwable -> L24
            ۟.fa r3 = r5.f179     // Catch: java.lang.Throwable -> L24
            ۟.ga r3 = r3.m162()     // Catch: java.lang.Throwable -> L24
            java.io.PrintWriter r4 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L24
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L24
            r3.m167(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L24
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L24
            r5.f190 = r3     // Catch: java.lang.Throwable -> L24
            ۟.s1 r1 = r5.f177     // Catch: java.lang.Throwable -> L24
            goto L2b
        L51:
            r1 = move-exception
            r5.f190 = r1     // Catch: java.lang.Throwable -> L24
            ۟.s1 r1 = r5.f177     // Catch: java.lang.Throwable -> L24
        L56:
            r1.m389(r5)     // Catch: java.lang.Throwable -> L24
            goto L60
        L5a:
            r1 = move-exception
            r5.f190 = r1     // Catch: java.lang.Throwable -> L24
            ۟.s1 r1 = r5.f177     // Catch: java.lang.Throwable -> L24
            goto L56
        L60:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.setName(r0)
            goto L78
        L68:
            r1 = move-exception
            boolean r2 = r1.f1165     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L73
            int r2 = r1.f1166     // Catch: java.lang.Throwable -> L24
            r3 = 504(0x1f8, float:7.06E-43)
            if (r2 == r3) goto L75
        L73:
            r5.f190 = r1     // Catch: java.lang.Throwable -> L24
        L75:
            ۟.s1 r1 = r5.f177     // Catch: java.lang.Throwable -> L24
            goto L2b
        L78:
            return
        L79:
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r2.setName(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m91() {
            r2 = this;
            ۟.f r0 = r2.f185
            r1 = 0
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = r2.f186
            if (r0 == 0) goto Lf
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
        Lf:
            java.util.concurrent.Future<?> r0 = r2.f188
            if (r0 == 0) goto L1a
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L1a
            r1 = 1
        L1a:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final void m92(p000.f r7) {
            r6 = this;
            ۟.f r0 = r6.f185
            r1 = 1
            r2 = 0
            if (r0 != r7) goto Lb
            r0 = 0
            r6.f185 = r0
            r0 = r1
            goto L15
        Lb:
            java.util.ArrayList r0 = r6.f186
            if (r0 == 0) goto L14
            boolean r0 = r0.remove(r7)
            goto L15
        L14:
            r0 = r2
        L15:
            if (r0 == 0) goto L65
            ۟.w8 r0 = r7.f314
            int r0 = r0.f1143
            int r3 = r6.f193
            if (r0 != r3) goto L65
            java.util.ArrayList r0 = r6.f186
            if (r0 == 0) goto L2b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2b
            r0 = r1
            goto L2c
        L2b:
            r0 = r2
        L2c:
            ۟.f r3 = r6.f185
            if (r3 != 0) goto L35
            if (r0 == 0) goto L33
            goto L35
        L33:
            r4 = r2
            goto L36
        L35:
            r4 = r1
        L36:
            if (r4 != 0) goto L39
            goto L63
        L39:
            if (r3 == 0) goto L3f
            ۟.w8 r1 = r3.f314
            int r1 = r1.f1143
        L3f:
            if (r0 == 0) goto L63
            java.util.ArrayList r0 = r6.f186
            int r0 = r0.size()
        L47:
            if (r2 >= r0) goto L63
            java.util.ArrayList r3 = r6.f186
            java.lang.Object r3 = r3.get(r2)
            ۟.f r3 = (p000.f) r3
            ۟.w8 r3 = r3.f314
            int r3 = r3.f1143
            int r4 = p000.c4.m109(r3)
            int r5 = p000.c4.m109(r1)
            if (r4 <= r5) goto L60
            r1 = r3
        L60:
            int r2 = r2 + 1
            goto L47
        L63:
            r6.f193 = r1
        L65:
            ۟.z7 r0 = r6.f176
            boolean r0 = r0.f1261
            if (r0 == 0) goto L75
            ۟.w8 r7 = r7.f314
            r7.m454()
            java.lang.String r7 = "from "
            p000.ic.m203(r6, r7)
        L75:
            return
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final android.graphics.Bitmap m93() {
            r6 = this;
            int r0 = r6.f182
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 != 0) goto L9
            r0 = r1
            goto La
        L9:
            r0 = r2
        La:
            if (r0 == 0) goto L31
            ۟.e0 r0 = r6.f178
            java.lang.String r3 = r6.f180
            ۟.h5 r0 = (p000.h5) r0
            android.graphics.Bitmap r0 = r0.m192(r3)
            if (r0 == 0) goto L32
            ۟.fa r1 = r6.f179
            ۟.fa$a r1 = r1.f365
            r1.sendEmptyMessage(r2)
            ۟.z7$e r1 = ۟.z7.e.f1270
            r6.f189 = r1
            ۟.z7 r1 = r6.f176
            boolean r1 = r1.f1261
            if (r1 == 0) goto L30
            ۟.w8 r1 = r6.f181
            r1.m454()
            java.lang.StringBuilder r1 = p000.ic.f502
        L30:
            return r0
        L31:
            r0 = 0
        L32:
            ۟.w8 r3 = r6.f181
            int r4 = r6.f192
            if (r4 != 0) goto L3a
            r4 = 4
            goto L3c
        L3a:
            int r4 = r6.f183
        L3c:
            r3.f1129 = r4
            ۟.y8 r4 = r6.f184
            ۟.y8$a r3 = r4.mo95(r3)
            if (r3 == 0) goto L6e
            ۟.z7$e r0 = r3.f1202
            r6.f189 = r0
            int r0 = r3.f1205
            r6.f191 = r0
            android.graphics.Bitmap r0 = r3.f1203
            if (r0 != 0) goto L6e
            java.io.InputStream r0 = r3.f1204
            ۟.w8 r3 = r6.f181     // Catch: java.lang.Throwable -> L64
            android.graphics.Bitmap r3 = m88(r0, r3)     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r4 = p000.ic.f502
            if (r0 != 0) goto L5f
            goto L62
        L5f:
            r0.close()     // Catch: java.io.IOException -> L62
        L62:
            r0 = r3
            goto L6e
        L64:
            r1 = move-exception
            java.lang.StringBuilder r2 = p000.ic.f502
            if (r0 != 0) goto L6a
            goto L6d
        L6a:
            r0.close()     // Catch: java.io.IOException -> L6d
        L6d:
            throw r1
        L6e:
            if (r0 == 0) goto L100
            ۟.z7 r3 = r6.f176
            boolean r3 = r3.f1261
            if (r3 == 0) goto L7d
            ۟.w8 r3 = r6.f181
            r3.m454()
            java.lang.StringBuilder r3 = p000.ic.f502
        L7d:
            ۟.fa r3 = r6.f179
            r4 = 2
            r3.getClass()
            int r5 = p000.ic.m201(r0)
            ۟.fa$a r3 = r3.f365
            android.os.Message r4 = r3.obtainMessage(r4, r5, r2)
            r3.sendMessage(r4)
            ۟.w8 r3 = r6.f181
            boolean r4 = r3.m455()
            if (r4 != 0) goto La4
            java.util.List<۟.rb> r3 = r3.f1132
            if (r3 == 0) goto L9e
            r3 = r1
            goto L9f
        L9e:
            r3 = r2
        L9f:
            if (r3 == 0) goto La2
            goto La4
        La2:
            r3 = r2
            goto La5
        La4:
            r3 = r1
        La5:
            if (r3 != 0) goto Lab
            int r3 = r6.f191
            if (r3 == 0) goto L100
        Lab:
            java.lang.Object r3 = p000.c0.f171
            monitor-enter(r3)
            ۟.w8 r4 = r6.f181     // Catch: java.lang.Throwable -> Lfd
            boolean r4 = r4.m455()     // Catch: java.lang.Throwable -> Lfd
            if (r4 != 0) goto Lba
            int r4 = r6.f191     // Catch: java.lang.Throwable -> Lfd
            if (r4 == 0) goto Lcd
        Lba:
            ۟.w8 r4 = r6.f181     // Catch: java.lang.Throwable -> Lfd
            int r5 = r6.f191     // Catch: java.lang.Throwable -> Lfd
            android.graphics.Bitmap r0 = m89(r4, r0, r5)     // Catch: java.lang.Throwable -> Lfd
            ۟.z7 r4 = r6.f176     // Catch: java.lang.Throwable -> Lfd
            boolean r4 = r4.f1261     // Catch: java.lang.Throwable -> Lfd
            if (r4 == 0) goto Lcd
            ۟.w8 r4 = r6.f181     // Catch: java.lang.Throwable -> Lfd
            r4.m454()     // Catch: java.lang.Throwable -> Lfd
        Lcd:
            ۟.w8 r4 = r6.f181     // Catch: java.lang.Throwable -> Lfd
            java.util.List<۟.rb> r4 = r4.f1132     // Catch: java.lang.Throwable -> Lfd
            if (r4 == 0) goto Ld4
            goto Ld5
        Ld4:
            r1 = r2
        Ld5:
            if (r1 == 0) goto Le6
            android.graphics.Bitmap r0 = m87(r4, r0)     // Catch: java.lang.Throwable -> Lfd
            ۟.z7 r1 = r6.f176     // Catch: java.lang.Throwable -> Lfd
            boolean r1 = r1.f1261     // Catch: java.lang.Throwable -> Lfd
            if (r1 == 0) goto Le6
            ۟.w8 r1 = r6.f181     // Catch: java.lang.Throwable -> Lfd
            r1.m454()     // Catch: java.lang.Throwable -> Lfd
        Le6:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lfd
            if (r0 == 0) goto L100
            ۟.fa r1 = r6.f179
            r3 = 3
            r1.getClass()
            int r4 = p000.ic.m201(r0)
            ۟.fa$a r1 = r1.f365
            android.os.Message r2 = r1.obtainMessage(r3, r4, r2)
            r1.sendMessage(r2)
            goto L100
        Lfd:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lfd
            throw r0
        L100:
            return r0
    }
}
