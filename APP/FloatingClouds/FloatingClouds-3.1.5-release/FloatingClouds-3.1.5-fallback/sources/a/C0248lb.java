package a;

/* JADX INFO: renamed from: a.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0248lb extends a.X1 {
    public final int b;
    public final int c;
    public final java.lang.String d;
    public final int e;
    public final java.util.ArrayList f;
    public final a.Me g;
    public final a.Me h;
    public final a.Me i;

    /* JADX INFO: renamed from: a.lb$a */
    public static final class a {
        public static a.C0248lb a(org.luckypray.dexkit.DexKitBridge r17, a.C0308p r18) {
                r0 = r18
                r1 = 4
                java.lang.String r2 = "bridge"
                r4 = r17
                a.C0193i9.e(r4, r2)
                r2 = 10
                int r2 = r0.b(r2)
                r3 = 0
                if (r2 == 0) goto L1d
                java.nio.ByteBuffer r5 = r0.b
                int r6 = r0.f212a
                int r2 = r2 + r6
                int r2 = r5.getInt(r2)
                goto L1e
            L1d:
                r2 = r3
            L1e:
                r5 = 131072(0x20000, float:1.83671E-40)
                r6 = r2 & r5
                if (r6 <= 0) goto L27
                r2 = r2 ^ r5
                r2 = r2 | 32
            L27:
                r8 = r2
                int r2 = r0.b(r1)
                if (r2 == 0) goto L39
                java.nio.ByteBuffer r5 = r0.b
                int r6 = r0.f212a
                int r2 = r2 + r6
                int r2 = r5.getInt(r2)
                r5 = r2
                goto L3a
            L39:
                r5 = r3
            L3a:
                r2 = 6
                int r2 = r0.b(r2)
                if (r2 == 0) goto L4c
                java.nio.ByteBuffer r6 = r0.b
                int r7 = r0.f212a
                int r2 = r2 + r7
                int r2 = r6.getInt(r2)
                r6 = r2
                goto L4d
            L4c:
                r6 = r3
            L4d:
                r2 = 8
                int r2 = r0.b(r2)
                if (r2 == 0) goto L60
                java.nio.ByteBuffer r7 = r0.b
                int r9 = r0.f212a
                int r2 = r2 + r9
                int r2 = r7.getInt(r2)
                r7 = r2
                goto L61
            L60:
                r7 = r3
            L61:
                r2 = 12
                int r2 = r0.b(r2)
                if (r2 == 0) goto L71
                int r9 = r0.f212a
                int r2 = r2 + r9
                java.lang.String r2 = r0.d(r2)
                goto L72
            L71:
                r2 = 0
            L72:
                if (r2 != 0) goto L76
                java.lang.String r2 = ""
            L76:
                r9 = r2
                r2 = 14
                int r2 = r0.b(r2)
                if (r2 == 0) goto L8a
                java.nio.ByteBuffer r10 = r0.b
                int r11 = r0.f212a
                int r2 = r2 + r11
                int r2 = r10.getInt(r2)
                r10 = r2
                goto L8b
            L8a:
                r10 = r3
            L8b:
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                r2 = 16
                int r12 = r0.b(r2)
                if (r12 == 0) goto L9d
                int r12 = r0.f(r12)
                goto L9e
            L9d:
                r12 = r3
            L9e:
                r13 = r3
            L9f:
                if (r13 >= r12) goto Lc1
                int r14 = r0.b(r2)
                if (r14 == 0) goto Lb6
                java.nio.ByteBuffer r15 = r0.b
                int r14 = r0.e(r14)
                int r16 = r13 * 4
                int r14 = r16 + r14
                int r14 = r15.getInt(r14)
                goto Lb7
            Lb6:
                r14 = r3
            Lb7:
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r11.add(r14)
                int r13 = r13 + 1
                goto L9f
            Lc1:
                a.Wf r0 = a.Wf.f330a
                a.lb r3 = new a.lb
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return r3
        }
    }

    public C0248lb() {
            r0 = this;
            r0 = 0
            throw r0
    }

    public C0248lb(org.luckypray.dexkit.DexKitBridge r7, int r8, int r9, int r10, int r11, java.lang.String r12, int r13, java.util.ArrayList r14) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            r6.b = r10
            r6.c = r11
            r6.d = r12
            r6.e = r13
            r6.f = r14
            a.y0 r10 = new a.y0
            r11 = 2
            r10.<init>(r6, r11)
            a.Me r11 = new a.Me
            r11.<init>(r10)
            r6.g = r11
            a.nb r10 = new a.nb
            r11 = 0
            r10.<init>(r7, r6, r9, r11)
            a.Me r11 = new a.Me
            r11.<init>(r10)
            a.nb r10 = new a.nb
            r11 = 2
            r10.<init>(r7, r6, r9, r11)
            a.Me r11 = new a.Me
            r11.<init>(r10)
            a.nb r10 = new a.nb
            r11 = 1
            r10.<init>(r7, r6, r9, r11)
            a.Me r11 = new a.Me
            r11.<init>(r10)
            a.mb r0 = new a.mb
            r5 = 5
            r2 = r6
            r1 = r7
            r4 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r8 = r1
            r10 = r3
            r11 = r4
            a.Me r7 = new a.Me
            r7.<init>(r0)
            a.mb r7 = new a.mb
            r12 = 0
            r9 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            a.Me r9 = new a.Me
            r9.<init>(r7)
            a.mb r7 = new a.mb
            r12 = 4
            r9 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            a.Me r9 = new a.Me
            r9.<init>(r7)
            a.mb r7 = new a.mb
            r12 = 3
            r9 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            a.Me r9 = new a.Me
            r9.<init>(r7)
            a.mb r7 = new a.mb
            r12 = 1
            r9 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            a.Me r9 = new a.Me
            r9.<init>(r7)
            a.mb r7 = new a.mb
            r12 = 2
            r9 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            a.Me r9 = new a.Me
            r9.<init>(r7)
            a.mb r7 = new a.mb
            r12 = 7
            r9 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            a.Me r12 = new a.Me
            r12.<init>(r7)
            r9.h = r12
            a.mb r7 = new a.mb
            r12 = 6
            r7.<init>(r8, r9, r10, r11, r12)
            a.Me r8 = new a.Me
            r8.<init>(r7)
            r9.i = r8
            return
    }

    public final a.C0135f5 b() {
            r1 = this;
            a.Me r0 = r1.g
            java.lang.Object r0 = r0.a()
            a.f5 r0 = (a.C0135f5) r0
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof a.C0248lb
            if (r1 == 0) goto L15
            a.lb r3 = (a.C0248lb) r3
            java.lang.String r3 = r3.d
            java.lang.String r1 = r2.d
            boolean r3 = a.C0193i9.a(r3, r1)
            if (r3 == 0) goto L15
            return r0
        L15:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.d
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " "
            int r2 = r5.c
            if (r2 == 0) goto L21
            java.lang.String r2 = java.lang.reflect.Modifier.toString(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
        L21:
            a.f5 r2 = r5.b()
            java.lang.String r2 = r2.d
            r0.append(r2)
            r0.append(r1)
            a.f5 r1 = r5.b()
            java.lang.String r1 = r1.f469a
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            a.f5 r1 = r5.b()
            java.lang.String r1 = r1.b
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            a.f5 r1 = r5.b()
            java.util.ArrayList r1 = r1.c
            java.lang.String r2 = ", "
            r3 = 0
            r4 = 62
            java.lang.String r1 = a.C0383t3.p0(r1, r2, r3, r4)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            a.C0193i9.d(r0, r1)
            return r0
    }
}
