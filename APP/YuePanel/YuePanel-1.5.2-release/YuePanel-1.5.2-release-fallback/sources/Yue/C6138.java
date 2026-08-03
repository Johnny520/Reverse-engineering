package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2312.class})
@Yue.InterfaceC5792(version = "1.9")
@Yue.InterfaceC5840({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n80#2:201\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n173#1:200\n180#1:201\n*E\n"})
public final class C6138 extends Yue.AbstractC0057 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public long f22100;

    public C6138() {
            r1 = this;
            Yue.ۥۣ۠۠ r0 = Yue.EnumC2050.f6543
            r1.<init>(r0)
            r1.mo382()
            return
    }

    @Override // Yue.AbstractC0057
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public long mo410() {
            r2 = this;
            long r0 = r2.f22100
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m23000(long r5) {
            r4 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "TestTimeSource will overflow if its reading "
            r1.append(r2)
            long r2 = r4.f22100
            r1.append(r2)
            Yue.ۥۣ۠۠ r2 = r4.m408()
            java.lang.String r2 = Yue.C2054.m9663(r2)
            r1.append(r2)
            java.lang.String r2 = " is advanced by "
            r1.append(r2)
            java.lang.String r5 = Yue.C2045.m9503(r5)
            r1.append(r5)
            r5 = 46
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m23001(long r9) {
            r8 = this;
            Yue.ۥۣ۠۠ r0 = r8.m408()
            long r0 = Yue.C2045.m9500(r9, r0)
            r2 = 1
            long r4 = r0 - r2
            long r4 = r4 | r2
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L3e
            r0 = 2
            long r0 = Yue.C2045.m9446(r9, r0)
            Yue.ۥۣ۠۠ r4 = r8.m408()
            long r4 = Yue.C2045.m9500(r0, r4)
            long r4 = r4 - r2
            long r2 = r2 | r4
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 != 0) goto L2d
            r8.m23000(r9)
            goto L54
        L2d:
            long r2 = r8.f22100
            r8.m23001(r0)     // Catch: java.lang.IllegalStateException -> L3a
            long r9 = Yue.C2045.m9489(r9, r0)     // Catch: java.lang.IllegalStateException -> L3a
            r8.m23001(r9)     // Catch: java.lang.IllegalStateException -> L3a
            goto L54
        L3a:
            r9 = move-exception
            r8.f22100 = r2
            throw r9
        L3e:
            long r2 = r8.f22100
            long r4 = r2 + r0
            long r0 = r0 ^ r2
            r6 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 < 0) goto L52
            long r0 = r2 ^ r4
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L52
            r8.m23000(r9)
        L52:
            r8.f22100 = r4
        L54:
            return
    }
}
