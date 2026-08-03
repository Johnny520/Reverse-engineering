package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4720 {

    /* JADX INFO: renamed from: Yue.ۥۡۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C4721 {
        public C4721() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static float[] m18754(android.graphics.Path r0, float r1) {
                float[] r0 = r0.approximate(r1)
                return r0
        }
    }

    public C4720() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(26)
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.util.Collection<Yue.C4715> m18752(@Yue.InterfaceC4410 android.graphics.Path r1) {
            r0 = 1056964608(0x3f000000, float:0.5)
            java.util.Collection r1 = m18753(r1, r0)
            return r1
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(26)
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.util.Collection<Yue.C4715> m18753(@Yue.InterfaceC4410 android.graphics.Path r10, @Yue.InterfaceC2458(from = 0.0d) float r11) {
            float[] r10 = Yue.C4720.C4721.m18754(r10, r11)
            int r11 = r10.length
            int r11 = r11 / 3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r11)
            r1 = 1
        Ld:
            if (r1 >= r11) goto L4a
            int r2 = r1 * 3
            int r3 = r1 + (-1)
            int r3 = r3 * 3
            r4 = r10[r2]
            int r5 = r2 + 1
            r5 = r10[r5]
            int r2 = r2 + 2
            r2 = r10[r2]
            r6 = r10[r3]
            int r7 = r3 + 1
            r7 = r10[r7]
            int r3 = r3 + 2
            r3 = r10[r3]
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L47
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r8 != 0) goto L35
            int r8 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r8 == 0) goto L47
        L35:
            Yue.ۥۣۡۨۦ r8 = new Yue.ۥۣۡۨۦ
            android.graphics.PointF r9 = new android.graphics.PointF
            r9.<init>(r7, r3)
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r5, r2)
            r8.<init>(r9, r6, r3, r4)
            r0.add(r8)
        L47:
            int r1 = r1 + 1
            goto Ld
        L4a:
            return r0
    }
}
