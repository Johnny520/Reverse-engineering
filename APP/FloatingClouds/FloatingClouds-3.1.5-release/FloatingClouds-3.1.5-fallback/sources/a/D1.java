package a;

/* JADX INFO: loaded from: classes.dex */
public final class D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53a;
    public final float b;
    public int c;
    public int d;
    public final float e;
    public final float f;
    public final int g;
    public final float h;

    public D1(int r4, float r5, float r6, float r7, int r8, float r9, int r10, float r11, int r12, float r13) {
            r3 = this;
            r3.<init>()
            r3.f53a = r4
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lb
            r5 = r6
            goto L10
        Lb:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L10
            r5 = r7
        L10:
            r3.b = r5
            r3.c = r8
            r3.e = r9
            r3.d = r10
            r3.f = r11
            r3.g = r12
            float r0 = (float) r12
            float r1 = r11 * r0
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r1
            float r10 = (float) r8
            float r1 = r5 * r10
            float r1 = r1 + r9
            float r9 = r13 - r1
            r1 = 0
            if (r8 <= 0) goto L39
            int r2 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r2 <= 0) goto L39
            float r9 = r9 / r10
            float r7 = r7 - r5
            float r6 = java.lang.Math.min(r9, r7)
            float r6 = r6 + r5
            r3.b = r6
            goto L48
        L39:
            if (r8 <= 0) goto L48
            int r7 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r7 >= 0) goto L48
            float r9 = r9 / r10
            float r6 = r6 - r5
            float r6 = java.lang.Math.max(r9, r6)
            float r6 = r6 + r5
            r3.b = r6
        L48:
            int r5 = r3.c
            if (r5 <= 0) goto L4f
            float r6 = r3.b
            goto L50
        L4f:
            r6 = r1
        L50:
            r3.b = r6
            int r7 = r3.d
            if (r5 <= 0) goto L58
            r8 = r6
            goto L59
        L58:
            r8 = r1
        L59:
            float r5 = (float) r5
            float r9 = (float) r7
            r10 = 1073741824(0x40000000, float:2.0)
            float r2 = r9 / r10
            float r5 = r5 + r2
            float r5 = r5 * r8
            float r13 = r13 - r5
            float r2 = r2 + r0
            float r13 = r13 / r2
            r3.f = r13
            float r6 = r6 + r13
            float r6 = r6 / r10
            r3.e = r6
            if (r7 <= 0) goto La5
            int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r5 == 0) goto La5
            float r5 = r11 - r13
            float r5 = r5 * r0
            r7 = 1036831949(0x3dcccccd, float:0.1)
            float r6 = r6 * r7
            float r6 = r6 * r9
            float r7 = java.lang.Math.abs(r5)
            float r6 = java.lang.Math.min(r7, r6)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 <= 0) goto L95
            float r5 = r3.e
            int r7 = r3.d
            float r7 = (float) r7
            float r7 = r6 / r7
            float r5 = r5 - r7
            r3.e = r5
            float r5 = r3.f
            float r6 = r6 / r0
            float r6 = r6 + r5
            r3.f = r6
            goto La5
        L95:
            float r5 = r3.e
            int r7 = r3.d
            float r7 = (float) r7
            float r7 = r6 / r7
            float r7 = r7 + r5
            r3.e = r7
            float r5 = r3.f
            float r6 = r6 / r0
            float r5 = r5 - r6
            r3.f = r5
        La5:
            if (r12 <= 0) goto Lbe
            int r5 = r3.c
            if (r5 <= 0) goto Lbe
            int r5 = r3.d
            if (r5 <= 0) goto Lbe
            float r5 = r3.f
            float r6 = r3.e
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto Lcd
            float r5 = r3.b
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto Lcd
            goto Ld1
        Lbe:
            if (r12 <= 0) goto Ld1
            int r5 = r3.c
            if (r5 <= 0) goto Ld1
            float r5 = r3.f
            float r6 = r3.b
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto Lcd
            goto Ld1
        Lcd:
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto Lda
        Ld1:
            float r5 = r3.f
            float r11 = r11 - r5
            float r5 = java.lang.Math.abs(r11)
            float r4 = (float) r4
            float r4 = r4 * r5
        Lda:
            r3.h = r4
            return
    }

    public static a.D1 a(float r22, float r23, float r24, float r25, int[] r26, float r27, int[] r28, float r29, int[] r30) {
            r0 = r26
            r1 = r28
            r2 = r30
            int r3 = r2.length
            r4 = 0
            r5 = 1
            r6 = 0
            r7 = r6
        Lb:
            if (r7 >= r3) goto L64
            r17 = r2[r7]
            int r8 = r1.length
            r9 = r6
        L11:
            if (r9 >= r8) goto L61
            r15 = r1[r9]
            int r10 = r0.length
            r11 = r6
        L17:
            if (r11 >= r10) goto L52
            r13 = r0[r11]
            r12 = r8
            a.D1 r8 = new a.D1
            r14 = r9
            r9 = r5
            r5 = r14
            r18 = r22
            r14 = r27
            r16 = r29
            r20 = r10
            r21 = r11
            r19 = r12
            r10 = r23
            r11 = r24
            r12 = r25
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            float r10 = r8.h
            if (r4 == 0) goto L40
            float r11 = r4.h
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L47
        L40:
            r4 = 0
            int r4 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r4 != 0) goto L46
            return r8
        L46:
            r4 = r8
        L47:
            int r8 = r9 + 1
            int r11 = r21 + 1
            r9 = r5
            r5 = r8
            r8 = r19
            r10 = r20
            goto L17
        L52:
            r19 = r9
            r9 = r5
            r5 = r19
            r19 = r8
            int r5 = r5 + 1
            r8 = r9
            r9 = r5
            r5 = r8
            r8 = r19
            goto L11
        L61:
            int r7 = r7 + 1
            goto Lb
        L64:
            return r4
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Arrangement [priority="
            r0.<init>(r1)
            int r1 = r2.f53a
            r0.append(r1)
            java.lang.String r1 = ", smallCount="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", smallSize="
            r0.append(r1)
            float r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", mediumCount="
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", mediumSize="
            r0.append(r1)
            float r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", largeCount="
            r0.append(r1)
            int r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", largeSize="
            r0.append(r1)
            float r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", cost="
            r0.append(r1)
            float r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
