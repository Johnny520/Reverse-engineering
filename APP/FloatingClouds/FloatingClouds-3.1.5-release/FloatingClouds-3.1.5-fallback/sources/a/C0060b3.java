package a;

/* JADX INFO: renamed from: a.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0060b3 extends a.X1 {
    public final int b;
    public final java.lang.String c;
    public final java.lang.Integer d;
    public final java.util.ArrayList e;
    public final java.util.ArrayList f;
    public final java.util.ArrayList g;
    public final a.Me h;
    public final a.Me i;
    public final a.Me j;

    /* JADX INFO: renamed from: a.b3$a */
    public static final class a {
        public static a.C0060b3 a(org.luckypray.dexkit.DexKitBridge r18, a.C0093d r19) {
                r0 = r19
                r1 = 4
                java.lang.String r2 = "bridge"
                r4 = r18
                a.C0193i9.e(r4, r2)
                int r2 = r0.b(r1)
                r3 = 0
                if (r2 == 0) goto L1c
                java.nio.ByteBuffer r5 = r0.b
                int r6 = r0.f212a
                int r2 = r2 + r6
                int r2 = r5.getInt(r2)
                r5 = r2
                goto L1d
            L1c:
                r5 = r3
            L1d:
                r2 = 6
                int r2 = r0.b(r2)
                if (r2 == 0) goto L2f
                java.nio.ByteBuffer r6 = r0.b
                int r7 = r0.f212a
                int r2 = r2 + r7
                int r2 = r6.getInt(r2)
                r6 = r2
                goto L30
            L2f:
                r6 = r3
            L30:
                r2 = 8
                int r2 = r0.b(r2)
                if (r2 == 0) goto L3e
                int r7 = r0.f212a
                int r2 = r2 + r7
                r0.d(r2)
            L3e:
                r2 = 10
                int r2 = r0.b(r2)
                if (r2 == 0) goto L51
                java.nio.ByteBuffer r7 = r0.b
                int r8 = r0.f212a
                int r2 = r2 + r8
                int r2 = r7.getInt(r2)
                r7 = r2
                goto L52
            L51:
                r7 = r3
            L52:
                r2 = 12
                int r2 = r0.b(r2)
                r8 = 0
                if (r2 == 0) goto L63
                int r9 = r0.f212a
                int r2 = r2 + r9
                java.lang.String r2 = r0.d(r2)
                goto L64
            L63:
                r2 = r8
            L64:
                if (r2 != 0) goto L68
                java.lang.String r2 = ""
            L68:
                r9 = 14
                int r9 = r0.b(r9)
                if (r9 == 0) goto L7a
                java.nio.ByteBuffer r10 = r0.b
                int r11 = r0.f212a
                int r9 = r9 + r11
                int r9 = r10.getInt(r9)
                goto L7b
            L7a:
                r9 = r3
            L7b:
                r10 = -1
                if (r9 != r10) goto L80
            L7e:
                r9 = r8
                goto L85
            L80:
                java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                goto L7e
            L85:
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                r8 = 16
                int r11 = r0.b(r8)
                if (r11 == 0) goto L97
                int r11 = r0.f(r11)
                goto L98
            L97:
                r11 = r3
            L98:
                r12 = r3
            L99:
                if (r12 >= r11) goto Lba
                int r13 = r0.b(r8)
                if (r13 == 0) goto Laf
                java.nio.ByteBuffer r14 = r0.b
                int r13 = r0.e(r13)
                int r15 = r12 * 4
                int r15 = r15 + r13
                int r13 = r14.getInt(r15)
                goto Lb0
            Laf:
                r13 = r3
            Lb0:
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r10.add(r13)
                int r12 = r12 + 1
                goto L99
            Lba:
                a.Wf r8 = a.Wf.f330a
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                r8 = 18
                int r12 = r0.b(r8)
                if (r12 == 0) goto Lce
                int r12 = r0.f(r12)
                goto Lcf
            Lce:
                r12 = r3
            Lcf:
                r13 = r3
            Ld0:
                if (r13 >= r12) goto Lf2
                int r14 = r0.b(r8)
                if (r14 == 0) goto Le7
                java.nio.ByteBuffer r15 = r0.b
                int r14 = r0.e(r14)
                int r16 = r13 * 4
                int r14 = r16 + r14
                int r14 = r15.getInt(r14)
                goto Le8
            Le7:
                r14 = r3
            Le8:
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r11.add(r14)
                int r13 = r13 + 1
                goto Ld0
            Lf2:
                a.Wf r8 = a.Wf.f330a
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                r8 = 20
                int r13 = r0.b(r8)
                if (r13 == 0) goto L106
                int r13 = r0.f(r13)
                goto L107
            L106:
                r13 = r3
            L107:
                r14 = r3
            L108:
                if (r14 >= r13) goto L12e
                int r15 = r0.b(r8)
                r16 = r1
                if (r15 == 0) goto L121
                java.nio.ByteBuffer r1 = r0.b
                int r15 = r0.e(r15)
                int r17 = r14 * 4
                int r15 = r17 + r15
                int r1 = r1.getInt(r15)
                goto L122
            L121:
                r1 = r3
            L122:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r12.add(r1)
                int r14 = r14 + 1
                r1 = r16
                goto L108
            L12e:
                a.Wf r0 = a.Wf.f330a
                a.b3 r3 = new a.b3
                r8 = r2
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r3
        }
    }

    /* JADX INFO: renamed from: a.b3$b */
    public static final class b extends a.AbstractC0407u9 implements a.D7<a.C0060b3, java.lang.CharSequence> {
        public static final a.C0060b3.b b = null;

        static {
                a.b3$b r0 = new a.b3$b
                r1 = 1
                r0.<init>(r1)
                a.C0060b3.b.b = r0
                return
        }

        @Override // a.D7
        public final java.lang.CharSequence f(a.C0060b3 r2) {
                r1 = this;
                a.b3 r2 = (a.C0060b3) r2
                java.lang.String r0 = "it"
                a.C0193i9.e(r2, r0)
                java.lang.String r2 = r2.b()
                return r2
        }
    }

    public C0060b3() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public C0060b3(org.luckypray.dexkit.DexKitBridge r7, int r8, int r9, int r10, java.lang.String r11, java.lang.Integer r12, java.util.ArrayList r13, java.util.ArrayList r14, java.util.ArrayList r15) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            r6.b = r10
            r6.c = r11
            r6.d = r12
            r6.e = r13
            r6.f = r14
            r6.g = r15
            a.y0 r10 = new a.y0
            r11 = 1
            r10.<init>(r6, r11)
            a.Me r11 = new a.Me
            r11.<init>(r10)
            r6.h = r11
            a.c3 r10 = new a.c3
            r10.<init>(r6, r7, r9)
            a.Me r11 = new a.Me
            r11.<init>(r10)
            r6.i = r11
            a.c3 r10 = new a.c3
            r11 = 1
            r10.<init>(r7, r6, r9, r11)
            a.Me r11 = new a.Me
            r11.<init>(r10)
            r6.j = r11
            a.c3 r10 = new a.c3
            r11 = 2
            r10.<init>(r7, r6, r9, r11)
            a.Me r11 = new a.Me
            r11.<init>(r10)
            a.c3 r10 = new a.c3
            r11 = 0
            r10.<init>(r7, r6, r9, r11)
            a.Me r11 = new a.Me
            r11.<init>(r10)
            a.mb r0 = new a.mb
            r5 = 8
            r2 = r6
            r1 = r7
            r4 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            a.Me r7 = new a.Me
            r7.<init>(r0)
            return
    }

    public final java.lang.String b() {
            r1 = this;
            a.Me r0 = r1.h
            java.lang.Object r0 = r0.a()
            a.X4 r0 = (a.X4) r0
            java.lang.String r0 = r0.f334a
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof a.C0060b3
            if (r1 == 0) goto L15
            a.b3 r3 = (a.C0060b3) r3
            java.lang.String r3 = r3.c
            java.lang.String r1 = r2.c
            boolean r3 = a.C0193i9.a(r1, r3)
            if (r3 == 0) goto L15
            return r0
        L15:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.c
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.b
            if (r1 <= 0) goto L21
            java.lang.String r1 = java.lang.reflect.Modifier.toString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
        L21:
            java.lang.String r1 = r5.b()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "class "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.append(r1)
            a.Me r1 = r5.i
            java.lang.Object r1 = r1.a()
            a.b3 r1 = (a.C0060b3) r1
            if (r1 == 0) goto L4c
            java.lang.String r2 = " extends "
            r0.append(r2)
            java.lang.String r1 = r1.b()
            r0.append(r1)
        L4c:
            java.util.ArrayList r1 = r5.e
            int r1 = r1.size()
            if (r1 <= 0) goto L6e
            java.lang.String r1 = " implements "
            r0.append(r1)
            a.Me r1 = r5.j
            java.lang.Object r1 = r1.a()
            a.d3 r1 = (a.C0097d3) r1
            a.b3$b r2 = a.C0060b3.b.b
            r3 = 30
            java.lang.String r4 = ", "
            java.lang.String r1 = a.C0383t3.p0(r1, r4, r2, r3)
            r0.append(r1)
        L6e:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            a.C0193i9.d(r0, r1)
            return r0
    }
}
