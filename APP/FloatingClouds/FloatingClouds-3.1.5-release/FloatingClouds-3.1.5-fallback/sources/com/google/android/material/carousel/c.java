package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.material.carousel.b f1064a;
    public final java.util.List<com.google.android.material.carousel.b> b;
    public final java.util.List<com.google.android.material.carousel.b> c;
    public final float[] d;
    public final float[] e;
    public final float f;
    public final float g;

    public c(com.google.android.material.carousel.b r4, java.util.ArrayList r5, java.util.ArrayList r6) {
            r3 = this;
            r3.<init>()
            r3.f1064a = r4
            java.util.List r0 = java.util.Collections.unmodifiableList(r5)
            r3.b = r0
            java.util.List r0 = java.util.Collections.unmodifiableList(r6)
            r3.c = r0
            int r0 = r5.size()
            r1 = 1
            int r0 = r0 - r1
            java.lang.Object r0 = r5.get(r0)
            com.google.android.material.carousel.b r0 = (com.google.android.material.carousel.b) r0
            com.google.android.material.carousel.b$b r0 = r0.b()
            float r0 = r0.f1063a
            com.google.android.material.carousel.b$b r2 = r4.b()
            float r2 = r2.f1063a
            float r0 = r0 - r2
            r3.f = r0
            com.google.android.material.carousel.b$b r4 = r4.d()
            float r4 = r4.f1063a
            int r2 = r6.size()
            int r2 = r2 - r1
            java.lang.Object r2 = r6.get(r2)
            com.google.android.material.carousel.b r2 = (com.google.android.material.carousel.b) r2
            com.google.android.material.carousel.b$b r2 = r2.d()
            float r2 = r2.f1063a
            float r4 = r4 - r2
            r3.g = r4
            float[] r5 = d(r0, r5, r1)
            r3.d = r5
            r5 = 0
            float[] r4 = d(r4, r6, r5)
            r3.e = r4
            return
    }

    public static float[] d(float r6, java.util.ArrayList r7, boolean r8) {
            int r0 = r7.size()
            float[] r1 = new float[r0]
            r2 = 1
        L7:
            if (r2 >= r0) goto L45
            int r3 = r2 + (-1)
            java.lang.Object r4 = r7.get(r3)
            com.google.android.material.carousel.b r4 = (com.google.android.material.carousel.b) r4
            java.lang.Object r5 = r7.get(r2)
            com.google.android.material.carousel.b r5 = (com.google.android.material.carousel.b) r5
            if (r8 == 0) goto L27
            com.google.android.material.carousel.b$b r5 = r5.b()
            float r5 = r5.f1063a
            com.google.android.material.carousel.b$b r4 = r4.b()
            float r4 = r4.f1063a
            float r5 = r5 - r4
            goto L35
        L27:
            com.google.android.material.carousel.b$b r4 = r4.d()
            float r4 = r4.f1063a
            com.google.android.material.carousel.b$b r5 = r5.d()
            float r5 = r5.f1063a
            float r5 = r4 - r5
        L35:
            float r5 = r5 / r6
            int r4 = r0 + (-1)
            if (r2 != r4) goto L3d
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L40
        L3d:
            r3 = r1[r3]
            float r3 = r3 + r5
        L40:
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L45:
            return r1
    }

    public static com.google.android.material.carousel.b e(com.google.android.material.carousel.b r16, int r17, int r18, float r19, int r20, int r21, float r22) {
            r0 = r16
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<com.google.android.material.carousel.b$b> r2 = r0.b
            r1.<init>(r2)
            r2 = r17
            java.lang.Object r2 = r1.remove(r2)
            com.google.android.material.carousel.b$b r2 = (com.google.android.material.carousel.b.C0029b) r2
            r3 = r18
            r1.add(r3, r2)
            com.google.android.material.carousel.b$a r3 = new com.google.android.material.carousel.b$a
            float r0 = r0.f1061a
            r2 = r22
            r3.<init>(r0, r2)
            r0 = 0
            r2 = r19
            r12 = r0
        L23:
            int r4 = r1.size()
            if (r12 >= r4) goto L54
            java.lang.Object r4 = r1.get(r12)
            r13 = r4
            com.google.android.material.carousel.b$b r13 = (com.google.android.material.carousel.b.C0029b) r13
            float r6 = r13.d
            r4 = 1073741824(0x40000000, float:2.0)
            float r4 = r6 / r4
            float r4 = r4 + r2
            r14 = r20
            r15 = r21
            if (r12 < r14) goto L42
            if (r12 > r15) goto L42
            r5 = 1
            r7 = r5
            goto L43
        L42:
            r7 = r0
        L43:
            r10 = 0
            r11 = 0
            float r5 = r13.c
            boolean r8 = r13.e
            float r9 = r13.f
            r3.b(r4, r5, r6, r7, r8, r9, r10, r11)
            float r4 = r13.d
            float r2 = r2 + r4
            int r12 = r12 + 1
            goto L23
        L54:
            com.google.android.material.carousel.b r0 = r3.d()
            return r0
    }

    public static com.google.android.material.carousel.b f(com.google.android.material.carousel.b r18, float r19, float r20, boolean r21, float r22) {
            r0 = r18
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<com.google.android.material.carousel.b$b> r2 = r0.b
            r1.<init>(r2)
            com.google.android.material.carousel.b$a r3 = new com.google.android.material.carousel.b$a
            float r12 = r0.f1061a
            r4 = r20
            r3.<init>(r12, r4)
            java.util.Iterator r4 = r2.iterator()
            r5 = 0
        L17:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L2a
            java.lang.Object r6 = r4.next()
            com.google.android.material.carousel.b$b r6 = (com.google.android.material.carousel.b.C0029b) r6
            boolean r6 = r6.e
            if (r6 == 0) goto L17
            int r5 = r5 + 1
            goto L17
        L2a:
            int r2 = r2.size()
            int r2 = r2 - r5
            float r2 = (float) r2
            float r2 = r19 / r2
            r14 = 0
            if (r21 == 0) goto L38
            r4 = r19
            goto L39
        L38:
            r4 = r14
        L39:
            r15 = r4
            r4 = 0
        L3b:
            int r5 = r1.size()
            if (r4 >= r5) goto L9e
            java.lang.Object r5 = r1.get(r4)
            com.google.android.material.carousel.b$b r5 = (com.google.android.material.carousel.b.C0029b) r5
            boolean r6 = r5.e
            if (r6 == 0) goto L66
            r10 = 0
            r11 = 0
            r6 = r4
            float r4 = r5.b
            float r7 = r5.c
            r8 = r6
            float r6 = r5.d
            r9 = r7
            r7 = 0
            r16 = r8
            r8 = 1
            r17 = r9
            float r9 = r5.f
            r13 = r16
            r5 = r17
            r3.b(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L9b
        L66:
            r13 = r4
            int r4 = r0.c
            if (r13 < r4) goto L72
            int r4 = r0.d
            if (r13 > r4) goto L72
            r4 = 1
            r7 = r4
            goto L73
        L72:
            r7 = 0
        L73:
            float r4 = r5.d
            float r6 = r4 - r2
            r4 = r22
            float r8 = a.R2.a(r6, r12, r4)
            r9 = 1073741824(0x40000000, float:2.0)
            float r9 = r6 / r9
            float r9 = r9 + r15
            float r10 = r5.b
            float r10 = r9 - r10
            r11 = r10
            if (r21 == 0) goto L8a
            goto L8b
        L8a:
            r10 = r14
        L8b:
            if (r21 == 0) goto L8e
            r11 = r14
        L8e:
            r16 = r8
            r8 = 0
            float r5 = r5.f
            r4 = r9
            r9 = r5
            r5 = r16
            r3.b(r4, r5, r6, r7, r8, r9, r10, r11)
            float r15 = r15 + r6
        L9b:
            int r4 = r13 + 1
            goto L3b
        L9e:
            com.google.android.material.carousel.b r0 = r3.d()
            return r0
    }

    public final com.google.android.material.carousel.b a() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.b> r0 = r2.c
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.b r0 = (com.google.android.material.carousel.b) r0
            return r0
    }

    public final com.google.android.material.carousel.b b(float r21, float r22, float r23) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = 2
            r5 = 3
            r6 = 0
            r7 = 1
            float r8 = r0.f
            float r9 = r2 + r8
            float r10 = r0.g
            float r11 = r3 - r10
            com.google.android.material.carousel.b r12 = r0.c()
            com.google.android.material.carousel.b$b r12 = r12.a()
            float r12 = r12.g
            com.google.android.material.carousel.b r13 = r0.a()
            com.google.android.material.carousel.b$b r13 = r13.c()
            float r13 = r13.h
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L2d
            float r9 = r9 + r12
        L2d:
            int r8 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r8 != 0) goto L32
            float r11 = r11 - r13
        L32:
            int r8 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            r10 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            if (r8 >= 0) goto L42
            float r1 = a.C0434w0.b(r10, r12, r2, r9, r1)
            java.util.List<com.google.android.material.carousel.b> r2 = r0.b
            float[] r3 = r0.d
            goto L4e
        L42:
            int r2 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r2 <= 0) goto L111
            float r1 = a.C0434w0.b(r12, r10, r11, r3, r1)
            java.util.List<com.google.android.material.carousel.b> r2 = r0.c
            float[] r3 = r0.e
        L4e:
            int r8 = r2.size()
            r9 = r3[r6]
            r11 = r7
        L55:
            if (r11 >= r8) goto L71
            r13 = r3[r11]
            int r14 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r14 > 0) goto L6e
            int r3 = r11 + (-1)
            float r1 = a.C0434w0.b(r12, r10, r9, r13, r1)
            float r3 = (float) r3
            float r8 = (float) r11
            float[] r5 = new float[r5]
            r5[r6] = r1
            r5[r7] = r3
            r5[r4] = r8
            goto L76
        L6e:
            int r11 = r11 + r7
            r9 = r13
            goto L55
        L71:
            float[] r5 = new float[r5]
            r5 = {x0114: FILL_ARRAY_DATA , data: [0, 0, 0} // fill-array
        L76:
            r1 = r5[r7]
            int r1 = (int) r1
            java.lang.Object r1 = r2.get(r1)
            com.google.android.material.carousel.b r1 = (com.google.android.material.carousel.b) r1
            r3 = r5[r4]
            int r3 = (int) r3
            java.lang.Object r2 = r2.get(r3)
            com.google.android.material.carousel.b r2 = (com.google.android.material.carousel.b) r2
            r3 = r5[r6]
            float r4 = r1.f1061a
            float r5 = r2.f1061a
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L109
            java.util.List<com.google.android.material.carousel.b$b> r4 = r1.b
            int r5 = r4.size()
            java.util.List<com.google.android.material.carousel.b$b> r8 = r2.b
            int r9 = r8.size()
            if (r5 != r9) goto L101
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        La5:
            int r9 = r4.size()
            if (r6 >= r9) goto Le9
            java.lang.Object r9 = r4.get(r6)
            com.google.android.material.carousel.b$b r9 = (com.google.android.material.carousel.b.C0029b) r9
            java.lang.Object r10 = r8.get(r6)
            com.google.android.material.carousel.b$b r10 = (com.google.android.material.carousel.b.C0029b) r10
            com.google.android.material.carousel.b$b r11 = new com.google.android.material.carousel.b$b
            float r12 = r9.f1063a
            float r13 = r10.f1063a
            float r12 = a.C0434w0.a(r12, r13, r3)
            float r13 = r9.b
            float r14 = r10.b
            float r13 = a.C0434w0.a(r13, r14, r3)
            float r14 = r9.c
            float r15 = r10.c
            float r14 = a.C0434w0.a(r14, r15, r3)
            float r9 = r9.d
            float r10 = r10.d
            float r15 = a.C0434w0.a(r9, r10, r3)
            r18 = 0
            r19 = 0
            r16 = 0
            r17 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r5.add(r11)
            int r6 = r6 + r7
            goto La5
        Le9:
            int r4 = r1.c
            int r6 = r2.c
            int r4 = a.C0434w0.c(r4, r6, r3)
            int r6 = r1.d
            int r2 = r2.d
            int r2 = a.C0434w0.c(r6, r2, r3)
            com.google.android.material.carousel.b r3 = new com.google.android.material.carousel.b
            float r1 = r1.f1061a
            r3.<init>(r1, r5, r4, r2)
            return r3
        L101:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Keylines being linearly interpolated must have the same number of keylines."
            r1.<init>(r2)
            throw r1
        L109:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Keylines being linearly interpolated must have the same item size."
            r1.<init>(r2)
            throw r1
        L111:
            com.google.android.material.carousel.b r1 = r0.f1064a
            return r1
    }

    public final com.google.android.material.carousel.b c() {
            r2 = this;
            java.util.List<com.google.android.material.carousel.b> r0 = r2.b
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.google.android.material.carousel.b r0 = (com.google.android.material.carousel.b) r0
            return r0
    }
}
