package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1406 extends Yue.C1405 {
    public C1406() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final <T> T m7000(T r1, T r2, T r3, @Yue.InterfaceC4418 java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r4, r0)
            java.lang.Object r2 = m7001(r2, r3, r4)
            java.lang.Object r1 = m7001(r1, r2, r4)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final <T> T m7001(T r1, T r2, @Yue.InterfaceC4418 java.util.Comparator<? super T> r3) {
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r3, r0)
            int r3 = r3.compare(r1, r2)
            if (r3 < 0) goto Lc
            goto Ld
        Lc:
            r1 = r2
        Ld:
            return r1
    }

    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final <T> T m7002(T r4, @Yue.InterfaceC4418 T[] r5, @Yue.InterfaceC4418 java.util.Comparator<? super T> r6) {
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r6, r0)
            int r0 = r5.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L1a
            r2 = r5[r1]
            int r3 = r6.compare(r4, r2)
            if (r3 >= 0) goto L17
            r4 = r2
        L17:
            int r1 = r1 + 1
            goto Lc
        L1a:
            return r4
    }

    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final <T> T m7003(T r1, T r2, T r3, @Yue.InterfaceC4418 java.util.Comparator<? super T> r4) {
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r4, r0)
            java.lang.Object r2 = m7004(r2, r3, r4)
            java.lang.Object r1 = m7004(r1, r2, r4)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final <T> T m7004(T r1, T r2, @Yue.InterfaceC4418 java.util.Comparator<? super T> r3) {
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r3, r0)
            int r3 = r3.compare(r1, r2)
            if (r3 > 0) goto Lc
            goto Ld
        Lc:
            r1 = r2
        Ld:
            return r1
    }

    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final <T> T m7005(T r4, @Yue.InterfaceC4418 T[] r5, @Yue.InterfaceC4418 java.util.Comparator<? super T> r6) {
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "comparator"
            Yue.C3329.m13906(r6, r0)
            int r0 = r5.length
            r1 = 0
        Lc:
            if (r1 >= r0) goto L1a
            r2 = r5[r1]
            int r3 = r6.compare(r4, r2)
            if (r3 <= 0) goto L17
            r4 = r2
        L17:
            int r1 = r1 + 1
            goto Lc
        L1a:
            return r4
    }
}
