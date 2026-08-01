package defpackage;

/* JADX INFO: renamed from: ᛳᛴᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0462 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final /* synthetic */ long f2336 = 0;
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.AbstractRunnableC0422[] f2337;

    static {
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            java.lang.Class<ᛳᛴᲀᲁ> r1 = defpackage.AbstractC0462.class
            java.lang.String r2 = "_size$volatile"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)
            long r0 = r0.objectFieldOffset(r1)
            defpackage.AbstractC0462.f2336 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m1240(int r3, int r4) {
            r2 = this;
            ᛳᛲᛷᛳ[] r2 = r2.f2337
            r0 = r2[r4]
            r1 = r2[r3]
            r2[r3] = r0
            r2[r4] = r1
            r0.f2111 = r3
            r1.f2111 = r4
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.AbstractRunnableC0422 m1241(int r8) {
            r7 = this;
            ᛳᛲᛷᛳ[] r0 = r7.f2337
            int r1 = r7.m1243()
            r2 = -1
            int r1 = r1 + r2
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r4 = defpackage.AbstractC0462.f2336
            r3.putIntVolatile(r7, r4, r1)
            int r1 = r7.m1243()
            if (r8 >= r1) goto L79
            int r1 = r7.m1243()
            r7.m1240(r8, r1)
            int r1 = r8 + (-1)
            int r1 = r1 / 2
            if (r8 <= 0) goto L48
            r3 = r0[r8]
            r4 = r0[r1]
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L48
            r7.m1240(r8, r1)
        L2f:
            if (r1 > 0) goto L32
            goto L79
        L32:
            ᛳᛲᛷᛳ[] r8 = r7.f2337
            int r3 = r1 + (-1)
            int r3 = r3 / 2
            r4 = r8[r3]
            r8 = r8[r1]
            int r8 = r4.compareTo(r8)
            if (r8 > 0) goto L43
            goto L79
        L43:
            r7.m1240(r1, r3)
            r1 = r3
            goto L2f
        L48:
            int r1 = r8 * 2
            int r3 = r1 + 1
            int r4 = r7.m1243()
            if (r3 < r4) goto L53
            goto L79
        L53:
            ᛳᛲᛷᛳ[] r4 = r7.f2337
            int r1 = r1 + 2
            int r5 = r7.m1243()
            if (r1 >= r5) goto L68
            r5 = r4[r1]
            r6 = r4[r3]
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L68
            goto L69
        L68:
            r1 = r3
        L69:
            r3 = r4[r8]
            r4 = r4[r1]
            int r3 = r3.compareTo(r4)
            if (r3 > 0) goto L74
            goto L79
        L74:
            r7.m1240(r8, r1)
            r8 = r1
            goto L48
        L79:
            int r8 = r7.m1243()
            r8 = r0[r8]
            r1 = 0
            r8.m1180(r1)
            r8.f2111 = r2
            int r7 = r7.m1243()
            r0[r7] = r1
            return r8
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m1242(defpackage.AbstractRunnableC0422 r7) {
            r6 = this;
            r0 = r6
            ᛵᛵᛵᛸ r0 = (defpackage.C0888) r0
            r7.m1180(r0)
            ᛳᛲᛷᛳ[] r0 = r6.f2337
            if (r0 != 0) goto L10
            r0 = 4
            ᛳᛲᛷᛳ[] r0 = new defpackage.AbstractRunnableC0422[r0]
            r6.f2337 = r0
            goto L25
        L10:
            int r1 = r6.m1243()
            int r2 = r0.length
            if (r1 < r2) goto L25
            int r1 = r6.m1243()
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            ᛳᛲᛷᛳ[] r0 = (defpackage.AbstractRunnableC0422[]) r0
            r6.f2337 = r0
        L25:
            int r1 = r6.m1243()
            int r2 = r1 + 1
            sun.misc.Unsafe r3 = defpackage.AbstractC0051.f569
            long r4 = defpackage.AbstractC0462.f2336
            r3.putIntVolatile(r6, r4, r2)
            r0[r1] = r7
            r7.f2111 = r1
        L36:
            if (r1 > 0) goto L39
            goto L49
        L39:
            ᛳᛲᛷᛳ[] r7 = r6.f2337
            int r0 = r1 + (-1)
            int r0 = r0 / 2
            r2 = r7[r0]
            r7 = r7[r1]
            int r7 = r2.compareTo(r7)
            if (r7 > 0) goto L4a
        L49:
            return
        L4a:
            r6.m1240(r1, r0)
            r1 = r0
            goto L36
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int m1243() {
            r3 = this;
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r1 = defpackage.AbstractC0462.f2336
            int r3 = r0.getIntVolatile(r3, r1)
            return r3
    }
}
