package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x1 {
    public int a;
    public int b;
    public int c;

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            goto L33
        L4:
            if (r4 == 0) goto L43
            java.lang.Class<x1> r1 = defpackage.x1.class
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto Lf
            goto L43
        Lf:
            x1 r4 = (defpackage.x1) r4
            int r1 = r3.a
            int r2 = r4.a
            if (r1 == r2) goto L18
            goto L43
        L18:
            r2 = 8
            if (r1 != r2) goto L34
            int r1 = r3.c
            int r2 = r3.b
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            if (r1 != r0) goto L34
            int r1 = r3.c
            int r2 = r4.b
            if (r1 != r2) goto L34
            int r1 = r3.b
            int r2 = r4.c
            if (r1 != r2) goto L34
        L33:
            return r0
        L34:
            int r1 = r3.c
            int r2 = r4.c
            if (r1 == r2) goto L3b
            goto L43
        L3b:
            int r1 = r3.b
            int r4 = r4.b
            if (r1 == r4) goto L42
            goto L43
        L42:
            return r0
        L43:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.c
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "["
            r0.append(r1)
            int r1 = r3.a
            r2 = 1
            if (r1 == r2) goto L30
            r2 = 2
            if (r1 == r2) goto L2d
            r2 = 4
            if (r1 == r2) goto L2a
            r2 = 8
            if (r1 == r2) goto L27
            java.lang.String r1 = "??"
            goto L32
        L27:
            java.lang.String r1 = "mv"
            goto L32
        L2a:
            java.lang.String r1 = "up"
            goto L32
        L2d:
            java.lang.String r1 = "rm"
            goto L32
        L30:
            java.lang.String r1 = "add"
        L32:
            r0.append(r1)
            java.lang.String r1 = ",s:"
            r0.append(r1)
            int r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = "c:"
            r0.append(r1)
            int r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ",p:null]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
