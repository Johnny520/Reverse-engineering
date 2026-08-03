package p000;

/* JADX INFO: loaded from: classes.dex */
public class e4 implements java.lang.Iterable<java.lang.Integer>, p000.n4 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f299;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int f300;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final int f301;

    public e4(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            if (r5 == 0) goto L50
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r0) goto L48
            r2.f299 = r3
            if (r5 <= 0) goto L23
            if (r3 < r4) goto L10
            goto L3b
        L10:
            int r0 = r4 % r5
            if (r0 < 0) goto L15
            goto L16
        L15:
            int r0 = r0 + r5
        L16:
            int r3 = r3 % r5
            if (r3 < 0) goto L1a
            goto L1b
        L1a:
            int r3 = r3 + r5
        L1b:
            int r0 = r0 - r3
            int r0 = r0 % r5
            if (r0 < 0) goto L20
            goto L21
        L20:
            int r0 = r0 + r5
        L21:
            int r4 = r4 - r0
            goto L3b
        L23:
            if (r5 >= 0) goto L40
            if (r3 > r4) goto L28
            goto L3b
        L28:
            int r0 = -r5
            int r3 = r3 % r0
            if (r3 < 0) goto L2d
            goto L2e
        L2d:
            int r3 = r3 + r0
        L2e:
            int r1 = r4 % r0
            if (r1 < 0) goto L33
            goto L34
        L33:
            int r1 = r1 + r0
        L34:
            int r3 = r3 - r1
            int r3 = r3 % r0
            if (r3 < 0) goto L39
            goto L3a
        L39:
            int r3 = r3 + r0
        L3a:
            int r4 = r4 + r3
        L3b:
            r2.f300 = r4
            r2.f301 = r5
            return
        L40:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Step is zero."
            r3.<init>(r4)
            throw r3
        L48:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."
            r3.<init>(r4)
            throw r3
        L50:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Step must be non-zero."
            r3.<init>(r4)
            throw r3
    }

    /* JADX DEBUG: Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public final java.util.Iterator<java.lang.Integer> iterator() {
            r4 = this;
            ۟.f4 r0 = new ۟.f4
            int r1 = r4.f299
            int r2 = r4.f300
            int r3 = r4.f301
            r0.<init>(r1, r2, r3)
            return r0
    }
}
