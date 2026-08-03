package a;

/* JADX INFO: renamed from: a.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0047a9 {
    public static final a.C0047a9 e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f399a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX INFO: renamed from: a.a9$a */
    public static class a {
        public static android.graphics.Insets a(int r0, int r1, int r2, int r3) {
                android.graphics.Insets r0 = android.graphics.Insets.of(r0, r1, r2, r3)
                return r0
        }
    }

    static {
            a.a9 r0 = new a.a9
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            a.C0047a9.e = r0
            return
    }

    public C0047a9(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f399a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public static a.C0047a9 a(a.C0047a9 r4, a.C0047a9 r5) {
            int r0 = r4.f399a
            int r1 = r5.f399a
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r4.b
            int r2 = r5.b
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r4.c
            int r3 = r5.c
            int r2 = java.lang.Math.max(r2, r3)
            int r4 = r4.d
            int r5 = r5.d
            int r4 = java.lang.Math.max(r4, r5)
            a.a9 r4 = b(r0, r1, r2, r4)
            return r4
    }

    public static a.C0047a9 b(int r1, int r2, int r3, int r4) {
            if (r1 != 0) goto Lb
            if (r2 != 0) goto Lb
            if (r3 != 0) goto Lb
            if (r4 != 0) goto Lb
            a.a9 r1 = a.C0047a9.e
            return r1
        Lb:
            a.a9 r0 = new a.a9
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static a.C0047a9 c(android.graphics.Insets r3) {
            int r0 = a.E.b(r3)
            int r1 = a.E.r(r3)
            int r2 = a.E.w(r3)
            int r3 = a.E.A(r3)
            a.a9 r3 = b(r0, r1, r2, r3)
            return r3
    }

    public final android.graphics.Insets d() {
            r4 = this;
            int r0 = r4.c
            int r1 = r4.d
            int r2 = r4.f399a
            int r3 = r4.b
            android.graphics.Insets r0 = a.C0047a9.a.a(r2, r3, r0, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2f
            java.lang.Class r2 = r5.getClass()
            java.lang.Class<a.a9> r3 = a.C0047a9.class
            if (r3 == r2) goto L10
            goto L2f
        L10:
            a.a9 r5 = (a.C0047a9) r5
            int r2 = r4.d
            int r3 = r5.d
            if (r2 == r3) goto L19
            return r1
        L19:
            int r2 = r4.f399a
            int r3 = r5.f399a
            if (r2 == r3) goto L20
            return r1
        L20:
            int r2 = r4.c
            int r3 = r5.c
            if (r2 == r3) goto L27
            return r1
        L27:
            int r2 = r4.b
            int r5 = r5.b
            if (r2 == r5) goto L2e
            return r1
        L2e:
            return r0
        L2f:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f399a
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.c
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.d
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Insets{left="
            r0.<init>(r1)
            int r1 = r2.f399a
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
