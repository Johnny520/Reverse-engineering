package defpackage;

/* JADX INFO: renamed from: ᲇᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C2027 extends defpackage.C1077 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final defpackage.C2073 f8733 = null;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final java.util.concurrent.locks.Condition f8734 = null;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static final long f8735 = 0;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static defpackage.C2027 f8736;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static final long f8737 = 0;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final java.util.concurrent.locks.ReentrantLock f8738 = null;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f8739;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f8740;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public long f8741;

    static {
            ᲇᛶᲀᛸ r0 = new ᲇᛶᲀᛸ
            r1 = 7
            r2 = 0
            r0.<init>(r2, r1)
            r1 = 8
            ᲇᛳᲇ[] r1 = new defpackage.C2027[r1]
            r0.f8900 = r1
            defpackage.C2027.f8733 = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            defpackage.C2027.f8738 = r0
            java.util.concurrent.locks.Condition r0 = r0.newCondition()
            defpackage.C2027.f8734 = r0
            r0 = 60000(0xea60, double:2.9644E-319)
            defpackage.C2027.f8735 = r0
            r0 = 60000000000(0xdf8475800, double:2.96439387505E-313)
            defpackage.C2027.f8737 = r0
            return
    }

    public C2027() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f8740 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void m3418() {
            r5 = this;
            long r0 = r5.f4839
            boolean r2 = r5.f4840
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto Ld
            if (r2 != 0) goto Ld
            return
        Ld:
            java.util.concurrent.locks.ReentrantLock r0 = defpackage.C2027.f8738
            r0.lock()
            int r1 = r5.f8739     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L22
            r1 = 1
            r5.f8739 = r1     // Catch: java.lang.Throwable -> L20
            defpackage.AbstractC0425.m1194(r5)     // Catch: java.lang.Throwable -> L20
            r0.unlock()
            return
        L20:
            r5 = move-exception
            goto L2a
        L22:
            java.lang.String r5 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L20
        L2a:
            r0.unlock()
            throw r5
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final boolean m3419() {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = defpackage.C2027.f8738
            r0.lock()
            int r1 = r4.f8739     // Catch: java.lang.Throwable -> L16
            r2 = 0
            r4.f8739 = r2     // Catch: java.lang.Throwable -> L16
            r3 = 1
            if (r1 != r3) goto L18
            ᲇᛶᲀᛸ r1 = defpackage.C2027.f8733     // Catch: java.lang.Throwable -> L16
            r1.m3499(r4)     // Catch: java.lang.Throwable -> L16
            r0.unlock()
            return r2
        L16:
            r4 = move-exception
            goto L20
        L18:
            r4 = 2
            if (r1 != r4) goto L1c
            r2 = r3
        L1c:
            r0.unlock()
            return r2
        L20:
            r0.unlock()
            throw r4
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public void mo1864() {
            r0 = this;
            return
    }
}
