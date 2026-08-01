package kotlin.internal;

/* JADX INFO: compiled from: UProgressionUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u001a*\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m115d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class UProgressionUtilKt {
    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m9874differenceModuloWZ9TVnA(int r3, int r4, int r5) {
            int r0 = java.lang.Integer.remainderUnsigned(r3, r5)
            int r1 = java.lang.Integer.remainderUnsigned(r4, r5)
            int r2 = java.lang.Integer.compareUnsigned(r0, r1)
            if (r2 < 0) goto L11
            int r2 = r0 - r1
            goto L18
        L11:
            int r2 = r0 - r1
            int r2 = kotlin.UInt.m8764constructorimpl(r2)
            int r2 = r2 + r5
        L18:
            int r2 = kotlin.UInt.m8764constructorimpl(r2)
            return r2
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m9875differenceModulosambcqE(long r6, long r8, long r10) {
            long r0 = java.lang.Long.remainderUnsigned(r6, r10)
            long r2 = java.lang.Long.remainderUnsigned(r8, r10)
            int r4 = java.lang.Long.compareUnsigned(r0, r2)
            if (r4 < 0) goto L11
            long r4 = r0 - r2
            goto L18
        L11:
            long r4 = r0 - r2
            long r4 = kotlin.ULong.m8843constructorimpl(r4)
            long r4 = r4 + r10
        L18:
            long r4 = kotlin.ULong.m8843constructorimpl(r4)
            return r4
    }

    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m9876getProgressionLastElement7ftBX0g(long r8, long r10, long r12) {
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1f
            int r0 = java.lang.Long.compareUnsigned(r8, r10)
            if (r0 < 0) goto Le
            goto L29
        Le:
            long r5 = kotlin.ULong.m8843constructorimpl(r12)
            r1 = r10
            r3 = r8
            long r0 = m9875differenceModulosambcqE(r1, r3, r5)
            long r0 = r10 - r0
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
            goto L3b
        L1f:
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto L3c
            int r0 = java.lang.Long.compareUnsigned(r8, r10)
            if (r0 > 0) goto L2b
        L29:
            r0 = r10
            goto L3b
        L2b:
            long r0 = -r12
            long r6 = kotlin.ULong.m8843constructorimpl(r0)
            r2 = r8
            r4 = r10
            long r0 = m9875differenceModulosambcqE(r2, r4, r6)
            long r0 = r0 + r10
            long r0 = kotlin.ULong.m8843constructorimpl(r0)
        L3b:
            return r0
        L3c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Step is zero."
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m9877getProgressionLastElementNkh28Cs(int r2, int r3, int r4) {
            if (r4 <= 0) goto L19
            int r0 = java.lang.Integer.compareUnsigned(r2, r3)
            if (r0 < 0) goto La
            goto L21
        La:
            int r0 = kotlin.UInt.m8764constructorimpl(r4)
            int r0 = m9874differenceModuloWZ9TVnA(r3, r2, r0)
            int r0 = r3 - r0
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            goto L31
        L19:
            if (r4 >= 0) goto L32
            int r0 = java.lang.Integer.compareUnsigned(r2, r3)
            if (r0 > 0) goto L23
        L21:
            r0 = r3
            goto L31
        L23:
            int r0 = -r4
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
            int r0 = m9874differenceModuloWZ9TVnA(r2, r3, r0)
            int r0 = r0 + r3
            int r0 = kotlin.UInt.m8764constructorimpl(r0)
        L31:
            return r0
        L32:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Step is zero."
            r0.<init>(r1)
            throw r0
    }
}
