package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lb {
    public final java.lang.Object a;
    public final defpackage.ah b;
    public final defpackage.sm c;
    public final java.lang.Object d;
    public final java.lang.Throwable e;

    public /* synthetic */ lb(java.lang.Object r9, defpackage.ah r10, java.util.concurrent.CancellationException r11, int r12) {
            r8 = this;
            r0 = r12 & 2
            r1 = 0
            if (r0 == 0) goto L7
            r4 = r1
            goto L8
        L7:
            r4 = r10
        L8:
            r10 = r12 & 16
            if (r10 == 0) goto Le
            r7 = r1
            goto Lf
        Le:
            r7 = r11
        Lf:
            r5 = 0
            r6 = 0
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return
    }

    public lb(java.lang.Object r1, defpackage.ah r2, defpackage.sm r3, java.lang.Object r4, java.lang.Throwable r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public static defpackage.lb a(defpackage.lb r6, defpackage.ah r7, java.util.concurrent.CancellationException r8, int r9) {
            java.lang.Object r1 = r6.a
            r0 = r9 & 2
            if (r0 == 0) goto L8
            ah r7 = r6.b
        L8:
            r2 = r7
            sm r3 = r6.c
            java.lang.Object r4 = r6.d
            r7 = r9 & 16
            if (r7 == 0) goto L13
            java.lang.Throwable r8 = r6.e
        L13:
            r5 = r8
            lb r0 = new lb
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.lb
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            lb r5 = (defpackage.lb) r5
            java.lang.Object r1 = r4.a
            java.lang.Object r3 = r5.a
            boolean r1 = defpackage.ip.i(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            ah r1 = r4.b
            ah r3 = r5.b
            boolean r1 = defpackage.ip.i(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            sm r1 = r4.c
            sm r3 = r5.c
            boolean r1 = defpackage.ip.i(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Object r1 = r4.d
            java.lang.Object r3 = r5.d
            boolean r1 = defpackage.ip.i(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.Throwable r1 = r4.e
            java.lang.Throwable r5 = r5.e
            boolean r5 = defpackage.ip.i(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.Object r1 = r3.a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            ah r2 = r3.b
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            sm r2 = r3.c
            if (r2 != 0) goto L20
            r2 = r0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Object r2 = r3.d
            if (r2 != 0) goto L2d
            r2 = r0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Throwable r2 = r3.e
            if (r2 != 0) goto L39
            goto L3d
        L39:
            int r0 = r2.hashCode()
        L3d:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CompletedContinuation(result="
            r0.<init>(r1)
            java.lang.Object r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", cancelHandler="
            r0.append(r1)
            ah r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", onCancellation="
            r0.append(r1)
            sm r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", idempotentResume="
            r0.append(r1)
            java.lang.Object r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", cancelCause="
            r0.append(r1)
            java.lang.Throwable r1 = r2.e
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
