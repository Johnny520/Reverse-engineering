package p000;

/* JADX INFO: loaded from: classes.dex */
public final class g4 extends p000.e4 {

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final p000.g4 f395 = null;

    static {
            ۟.g4 r0 = new ۟.g4
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2)
            p000.g4.f395 = r0
            return
    }

    public g4(int r2, int r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.g4
            if (r0 == 0) goto L23
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            ۟.g4 r0 = (p000.g4) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
        L13:
            int r0 = r2.f299
            ۟.g4 r3 = (p000.g4) r3
            int r1 = r3.f299
            if (r0 != r1) goto L23
            int r0 = r2.f300
            int r3 = r3.f300
            if (r0 != r3) goto L23
        L21:
            r3 = 1
            goto L24
        L23:
            r3 = 0
        L24:
            return r3
    }

    public final int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            goto Lf
        L8:
            int r0 = r2.f299
            int r0 = r0 * 31
            int r1 = r2.f300
            int r0 = r0 + r1
        Lf:
            return r0
    }

    public final boolean isEmpty() {
            r2 = this;
            int r0 = r2.f299
            int r1 = r2.f300
            if (r0 <= r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.f299
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            int r1 = r2.f300
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
