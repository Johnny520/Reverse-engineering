package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1061a;
    public final java.util.List<com.google.android.material.carousel.b.C0029b> b;
    public final int c;
    public final int d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f1062a;
        public final float b;
        public final java.util.ArrayList c;
        public com.google.android.material.carousel.b.C0029b d;
        public com.google.android.material.carousel.b.C0029b e;
        public int f;
        public int g;
        public float h;
        public int i;

        public a(float r3, float r4) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.c = r0
                r0 = -1
                r2.f = r0
                r2.g = r0
                r1 = 0
                r2.h = r1
                r2.i = r0
                r2.f1062a = r3
                r2.b = r4
                return
        }

        public final void a(float r11, float r12, float r13, boolean r14, boolean r15) {
                r10 = this;
                r0 = 1073741824(0x40000000, float:2.0)
                float r0 = r13 / r0
                float r1 = r11 - r0
                float r0 = r0 + r11
                float r2 = r10.b
                int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r3 <= 0) goto L1a
                float r1 = r0 - r13
                float r1 = java.lang.Math.max(r1, r2)
                float r0 = r0 - r1
                float r0 = java.lang.Math.abs(r0)
            L18:
                r7 = r0
                goto L2b
            L1a:
                r0 = 0
                int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r2 >= 0) goto L18
                float r2 = r1 + r13
                float r0 = java.lang.Math.min(r2, r0)
                float r1 = r1 - r0
                float r0 = java.lang.Math.abs(r1)
                goto L18
            L2b:
                r8 = 0
                r9 = 0
                r1 = r10
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r6 = r15
                r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }

        public final void b(float r12, float r13, float r14, boolean r15, boolean r16, float r17, float r18, float r19) {
                r11 = this;
                r0 = 0
                int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
                if (r0 > 0) goto L6
                return
            L6:
                java.util.ArrayList r0 = r11.c
                r1 = -1
                if (r16 == 0) goto L2b
                if (r15 != 0) goto L23
                int r2 = r11.i
                if (r2 == r1) goto L1c
                if (r2 != 0) goto L14
                goto L1c
            L14:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = "Anchor keylines must be either the first or last keyline."
                r12.<init>(r13)
                throw r12
            L1c:
                int r2 = r0.size()
                r11.i = r2
                goto L2b
            L23:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = "Anchor keylines cannot be focal."
                r12.<init>(r13)
                throw r12
            L2b:
                com.google.android.material.carousel.b$b r2 = new com.google.android.material.carousel.b$b
                r3 = 1
                r4 = r12
                r5 = r13
                r6 = r14
                r7 = r16
                r8 = r17
                r9 = r18
                r10 = r19
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r15 == 0) goto L7a
                com.google.android.material.carousel.b$b r12 = r11.d
                if (r12 != 0) goto L4a
                r11.d = r2
                int r12 = r0.size()
                r11.f = r12
            L4a:
                int r12 = r11.g
                if (r12 == r1) goto L61
                int r12 = r0.size()
                int r13 = r11.g
                int r12 = r12 - r13
                r13 = 1
                if (r12 > r13) goto L59
                goto L61
            L59:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = "Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines."
                r12.<init>(r13)
                throw r12
            L61:
                com.google.android.material.carousel.b$b r12 = r11.d
                float r12 = r12.d
                int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
                if (r12 != 0) goto L72
                r11.e = r2
                int r12 = r0.size()
                r11.g = r12
                goto La0
            L72:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = "Keylines that are marked as focal must all have the same masked item size."
                r12.<init>(r13)
                throw r12
            L7a:
                com.google.android.material.carousel.b$b r12 = r11.d
                if (r12 != 0) goto L8d
                float r12 = r11.h
                int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
                if (r12 < 0) goto L85
                goto L8d
            L85:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = "Keylines before the first focal keyline must be ordered by incrementing masked item size."
                r12.<init>(r13)
                throw r12
            L8d:
                com.google.android.material.carousel.b$b r12 = r11.e
                if (r12 == 0) goto La0
                float r12 = r11.h
                int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
                if (r12 > 0) goto L98
                goto La0
            L98:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = "Keylines after the last focal keyline must be ordered by decreasing masked item size."
                r12.<init>(r13)
                throw r12
            La0:
                r11.h = r14
                r0.add(r2)
                return
        }

        public final void c(float r9, float r10, float r11, int r12, boolean r13) {
                r8 = this;
                if (r12 <= 0) goto L1d
                r0 = 0
                int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
                if (r0 > 0) goto L8
                goto L1d
            L8:
                r0 = 0
            L9:
                if (r0 >= r12) goto L1d
                float r1 = (float) r0
                float r1 = r1 * r11
                float r3 = r1 + r9
                r7 = 0
                r2 = r8
                r4 = r10
                r5 = r11
                r6 = r13
                r2.a(r3, r4, r5, r6, r7)
                int r0 = r0 + 1
                r10 = r4
                r11 = r5
                r13 = r6
                goto L9
            L1d:
                return
        }

        public final com.google.android.material.carousel.b d() {
                r14 = this;
                com.google.android.material.carousel.b$b r0 = r14.d
                if (r0 == 0) goto L49
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1 = 0
            La:
                java.util.ArrayList r2 = r14.c
                int r3 = r2.size()
                float r4 = r14.f1062a
                if (r1 >= r3) goto L3f
                java.lang.Object r2 = r2.get(r1)
                com.google.android.material.carousel.b$b r2 = (com.google.android.material.carousel.b.C0029b) r2
                com.google.android.material.carousel.b$b r5 = new com.google.android.material.carousel.b$b
                com.google.android.material.carousel.b$b r3 = r14.d
                float r3 = r3.b
                int r6 = r14.f
                float r6 = (float) r6
                float r6 = r6 * r4
                float r3 = r3 - r6
                float r6 = (float) r1
                float r6 = r6 * r4
                float r6 = r6 + r3
                float r7 = r2.b
                boolean r10 = r2.e
                float r11 = r2.f
                float r8 = r2.c
                float r9 = r2.d
                float r12 = r2.g
                float r13 = r2.h
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
                r0.add(r5)
                int r1 = r1 + 1
                goto La
            L3f:
                com.google.android.material.carousel.b r1 = new com.google.android.material.carousel.b
                int r2 = r14.f
                int r3 = r14.g
                r1.<init>(r4, r0, r2, r3)
                return r1
            L49:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "There must be a keyline marked as focal."
                r0.<init>(r1)
                throw r0
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    public static final class C0029b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f1063a;
        public final float b;
        public final float c;
        public final float d;
        public final boolean e;
        public final float f;
        public final float g;
        public final float h;

        public C0029b(float r1, float r2, float r3, float r4, boolean r5, float r6, float r7, float r8) {
                r0 = this;
                r0.<init>()
                r0.f1063a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.e = r5
                r0.f = r6
                r0.g = r7
                r0.h = r8
                return
        }
    }

    public b(float r1, java.util.ArrayList r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f1061a = r1
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            r0.b = r1
            r0.c = r3
            r0.d = r4
            return
    }

    public final com.google.android.material.carousel.b.C0029b a() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.b$b> r0 = r2.b
            int r1 = r2.c
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.b$b r0 = (com.google.android.material.carousel.b.C0029b) r0
            return r0
    }

    public final com.google.android.material.carousel.b.C0029b b() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.b$b> r0 = r2.b
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.b$b r0 = (com.google.android.material.carousel.b.C0029b) r0
            return r0
    }

    public final com.google.android.material.carousel.b.C0029b c() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.b$b> r0 = r2.b
            int r1 = r2.d
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.b$b r0 = (com.google.android.material.carousel.b.C0029b) r0
            return r0
    }

    public final com.google.android.material.carousel.b.C0029b d() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.b$b> r0 = r2.b
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.b$b r0 = (com.google.android.material.carousel.b.C0029b) r0
            return r0
    }
}
