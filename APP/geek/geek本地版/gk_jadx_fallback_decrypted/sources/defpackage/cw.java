package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cw {
    public long a;
    public long b;
    public android.animation.TimeInterpolator c;
    public int d;
    public int e;

    public final android.animation.TimeInterpolator a() {
            r1 = this;
            android.animation.TimeInterpolator r0 = r1.c
            if (r0 == 0) goto L5
            return r0
        L5:
            tj r0 = defpackage.q2.b
            return r0
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L4
            r7 = 1
            return r7
        L4:
            boolean r0 = r7 instanceof defpackage.cw
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            cw r7 = (defpackage.cw) r7
            long r2 = r6.a
            long r4 = r7.a
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L15
            return r1
        L15:
            long r2 = r6.b
            long r4 = r7.b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1e
            return r1
        L1e:
            int r0 = r6.d
            int r2 = r7.d
            if (r0 == r2) goto L25
            return r1
        L25:
            int r0 = r6.e
            int r2 = r7.e
            if (r0 == r2) goto L2c
            return r1
        L2c:
            android.animation.TimeInterpolator r0 = r6.a()
            java.lang.Class r0 = r0.getClass()
            android.animation.TimeInterpolator r7 = r7.a()
            java.lang.Class r7 = r7.getClass()
            boolean r7 = r0.equals(r7)
            return r7
    }

    public final int hashCode() {
            r5 = this;
            long r0 = r5.a
            r2 = 32
            long r3 = r0 >>> r2
            long r0 = r0 ^ r3
            int r0 = (int) r0
            int r0 = r0 * 31
            long r3 = r5.b
            long r1 = r3 >>> r2
            long r1 = r1 ^ r3
            int r1 = (int) r1
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.animation.TimeInterpolator r1 = r5.a()
            java.lang.Class r1 = r1.getClass()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r5.d
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r5.e
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n"
            r0.<init>(r1)
            java.lang.Class<cw> r1 = defpackage.cw.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " delay: "
            r0.append(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = " duration: "
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = " interpolator: "
            r0.append(r1)
            android.animation.TimeInterpolator r1 = r3.a()
            java.lang.Class r1 = r1.getClass()
            r0.append(r1)
            java.lang.String r1 = " repeatCount: "
            r0.append(r1)
            int r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = " repeatMode: "
            r0.append(r1)
            int r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = "}\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
