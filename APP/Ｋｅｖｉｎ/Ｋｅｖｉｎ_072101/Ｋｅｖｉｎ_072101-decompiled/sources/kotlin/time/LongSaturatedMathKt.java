package kotlin.time;

/* JADX INFO: compiled from: longSaturatedMath.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a*\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a(\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a(\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a(\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, m115d2 = {"checkInfiniteSumDefined", "", "value", "duration", "Lkotlin/time/Duration;", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "infinityOfSign", "(J)J", "saturatingAdd", "unit", "Lkotlin/time/DurationUnit;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingFiniteDiff", "value1", "value2", "saturatingOriginsDiff", "origin1", "origin2", "isSaturated", "", "kotlin-stdlib"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class LongSaturatedMathKt {
    /* JADX INFO: renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m10122checkInfiniteSumDefinedPjuGub4(long r4, long r6, long r8) {
            boolean r0 = kotlin.time.Duration.m10026isInfiniteimpl(r6)
            if (r0 == 0) goto L17
            long r0 = r4 ^ r8
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto Lf
            goto L17
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Summing infinities of different signs"
            r0.<init>(r1)
            throw r0
        L17:
            return r4
    }

    private static final long infinityOfSign(long r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto Ld
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
            long r0 = r0.m10096getNEG_INFINITEUwyO8pc$kotlin_stdlib()
            goto L13
        Ld:
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
            long r0 = r0.m10095getINFINITEUwyO8pc()
        L13:
            return r0
    }

    public static final boolean isSaturated(long r5) {
            r0 = 0
            r1 = 1
            long r3 = r5 - r1
            long r1 = r1 | r3
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    /* JADX INFO: renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m10123saturatingAddNuflL3o(long r17, kotlin.time.DurationUnit r19, long r20) {
            r6 = r19
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r7 = r20
            long r9 = kotlin.time.Duration.m10040toLongimpl(r7, r6)
            r0 = r17
            r2 = 0
            r3 = 1
            long r11 = r0 - r3
            long r11 = r11 | r3
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r11 = 1
            r12 = 0
            if (r5 != 0) goto L22
            r0 = r11
            goto L23
        L22:
            r0 = r12
        L23:
            if (r0 == 0) goto L2f
            r0 = r17
            r2 = r20
            r4 = r9
            long r0 = m10122checkInfiniteSumDefinedPjuGub4(r0, r2, r4)
            return r0
        L2f:
            r0 = r9
            r2 = 0
            long r15 = r0 - r3
            long r3 = r3 | r15
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 != 0) goto L39
            goto L3a
        L39:
            r11 = r12
        L3a:
            if (r11 == 0) goto L41
            long r0 = m10124saturatingAddInHalvesNuflL3o(r17, r19, r20)
            return r0
        L41:
            long r0 = r17 + r9
            long r2 = r17 ^ r0
            long r4 = r9 ^ r0
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L55
            int r2 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r2 >= 0) goto L54
            r13 = -9223372036854775808
        L54:
            return r13
        L55:
            return r0
    }

    /* JADX INFO: renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m10124saturatingAddInHalvesNuflL3o(long r11, kotlin.time.DurationUnit r13, long r14) {
            r0 = 2
            long r0 = kotlin.time.Duration.m9997divUwyO8pc(r14, r0)
            long r2 = kotlin.time.Duration.m10040toLongimpl(r0, r13)
            r4 = r2
            r6 = 0
            r7 = 1
            long r9 = r4 - r7
            long r7 = r7 | r9
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L1b
            r7 = 1
            goto L1c
        L1b:
            r7 = 0
        L1c:
            if (r7 == 0) goto L1f
            return r2
        L1f:
            long r4 = m10123saturatingAddNuflL3o(r11, r13, r0)
            long r6 = kotlin.time.Duration.m10029minusLRDsOJo(r14, r0)
            long r4 = m10123saturatingAddNuflL3o(r4, r13, r6)
            return r4
    }

    public static final long saturatingDiff(long r7, long r9, kotlin.time.DurationUnit r11) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = r9
            r2 = 0
            r3 = 1
            long r5 = r0 - r3
            long r3 = r3 | r5
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = 0
        L18:
            if (r3 == 0) goto L23
            long r0 = infinityOfSign(r9)
            long r0 = kotlin.time.Duration.m10047unaryMinusUwyO8pc(r0)
            return r0
        L23:
            long r0 = saturatingFiniteDiff(r7, r9, r11)
            return r0
    }

    private static final long saturatingFiniteDiff(long r13, long r15, kotlin.time.DurationUnit r17) {
            r0 = r17
            long r1 = r13 - r15
            long r3 = r1 ^ r13
            long r5 = r1 ^ r15
            long r5 = ~r5
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L46
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.MILLISECONDS
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r3 = r0.compareTo(r3)
            if (r3 >= 0) goto L3d
            r3 = 1
            kotlin.time.DurationUnit r5 = kotlin.time.DurationUnit.MILLISECONDS
            long r3 = kotlin.time.DurationUnitKt.convertDurationUnit(r3, r5, r0)
            long r5 = r13 / r3
            long r7 = r15 / r3
            long r5 = r5 - r7
            long r7 = r13 % r3
            long r9 = r15 % r3
            long r7 = r7 - r9
            kotlin.time.Duration$Companion r9 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r9 = kotlin.time.DurationUnit.MILLISECONDS
            long r9 = kotlin.time.DurationKt.toDuration(r5, r9)
            long r11 = kotlin.time.DurationKt.toDuration(r7, r0)
            long r9 = kotlin.time.Duration.m10030plusLRDsOJo(r9, r11)
            return r9
        L3d:
            long r3 = infinityOfSign(r1)
            long r3 = kotlin.time.Duration.m10047unaryMinusUwyO8pc(r3)
            return r3
        L46:
            long r3 = kotlin.time.DurationKt.toDuration(r1, r0)
            return r3
    }

    public static final long saturatingOriginsDiff(long r13, long r15, kotlin.time.DurationUnit r17) {
            java.lang.String r0 = "unit"
            r1 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r2 = r15
            r0 = 0
            r4 = 1
            long r6 = r2 - r4
            long r6 = r6 | r4
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r7 = 1
            r10 = 0
            if (r6 != 0) goto L1b
            r0 = r7
            goto L1c
        L1b:
            r0 = r10
        L1c:
            if (r0 == 0) goto L32
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 != 0) goto L29
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
            long r2 = r0.m10097getZEROUwyO8pc()
            return r2
        L29:
            long r2 = infinityOfSign(r15)
            long r2 = kotlin.time.Duration.m10047unaryMinusUwyO8pc(r2)
            return r2
        L32:
            r2 = r13
            r0 = 0
            long r11 = r2 - r4
            long r4 = r4 | r11
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L3c
            goto L3d
        L3c:
            r7 = r10
        L3d:
            if (r7 == 0) goto L44
            long r2 = infinityOfSign(r13)
            return r2
        L44:
            long r2 = saturatingFiniteDiff(r13, r15, r17)
            return r2
    }
}
