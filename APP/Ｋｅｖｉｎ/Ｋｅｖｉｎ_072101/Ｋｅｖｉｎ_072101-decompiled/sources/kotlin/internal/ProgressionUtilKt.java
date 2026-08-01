package kotlin.internal;

/* JADX INFO: compiled from: progressionUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a \u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0001\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0001\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, m115d2 = {"differenceModulo", "", "a", "b", "c", "", "getProgressionLastElement", "start", "end", "step", "mod", "kotlin-stdlib"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class ProgressionUtilKt {
    private static final int differenceModulo(int r2, int r3, int r4) {
            int r0 = mod(r2, r4)
            int r1 = mod(r3, r4)
            int r0 = r0 - r1
            int r0 = mod(r0, r4)
            return r0
    }

    private static final long differenceModulo(long r4, long r6, long r8) {
            long r0 = mod(r4, r8)
            long r2 = mod(r6, r8)
            long r0 = r0 - r2
            long r0 = mod(r0, r8)
            return r0
    }

    public static final int getProgressionLastElement(int r2, int r3, int r4) {
            if (r4 <= 0) goto Ld
            if (r2 < r3) goto L6
            goto L11
        L6:
            int r0 = differenceModulo(r3, r2, r4)
            int r0 = r3 - r0
            goto L19
        Ld:
            if (r4 >= 0) goto L1a
            if (r2 > r3) goto L13
        L11:
            r0 = r3
            goto L19
        L13:
            int r0 = -r4
            int r0 = differenceModulo(r2, r3, r0)
            int r0 = r0 + r3
        L19:
            return r0
        L1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Step is zero."
            r0.<init>(r1)
            throw r0
    }

    public static final long getProgressionLastElement(long r7, long r9, long r11) {
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 <= 0) goto L16
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto Lc
            goto L1e
        Lc:
            r0 = r9
            r2 = r7
            r4 = r11
            long r0 = differenceModulo(r0, r2, r4)
            long r0 = r9 - r0
            goto L28
        L16:
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 >= 0) goto L29
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 > 0) goto L20
        L1e:
            r0 = r9
            goto L28
        L20:
            long r5 = -r11
            r1 = r7
            r3 = r9
            long r0 = differenceModulo(r1, r3, r5)
            long r0 = r0 + r9
        L28:
            return r0
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Step is zero."
            r0.<init>(r1)
            throw r0
    }

    private static final int mod(int r2, int r3) {
            int r0 = r2 % r3
            if (r0 < 0) goto L6
            r1 = r0
            goto L8
        L6:
            int r1 = r0 + r3
        L8:
            return r1
    }

    private static final long mod(long r4, long r6) {
            long r0 = r4 % r6
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto La
            r2 = r0
            goto Lc
        La:
            long r2 = r0 + r6
        Lc:
            return r2
    }
}
