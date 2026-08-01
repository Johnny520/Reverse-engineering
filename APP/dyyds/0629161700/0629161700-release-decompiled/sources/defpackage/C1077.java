package defpackage;

/* JADX INFO: renamed from: ᛶᛵᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1077 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C0567 f4838 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public long f4839;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public boolean f4840;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public long f4841;

    static {
            ᛳᲇᛲ r0 = new ᛳᲇᛲ
            r0.<init>()
            defpackage.C1077.f4838 = r0
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public boolean mo1798() {
            r0 = this;
            boolean r0 = r0.f4840
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public defpackage.C1077 mo1363(long r2) {
            r1 = this;
            r0 = 1
            r1.f4840 = r0
            r1.f4841 = r2
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public long mo1799() {
            r2 = this;
            boolean r0 = r2.f4840
            if (r0 == 0) goto L7
            long r0 = r2.f4841
            return r0
        L7:
            java.lang.String r2 = "No deadline"
            defpackage.C2264.m3676(r2)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public defpackage.C1077 mo1800() {
            r1 = this;
            r0 = 0
            r1.f4840 = r0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public defpackage.C1077 mo1801() {
            r2 = this;
            r0 = 0
            r2.f4839 = r0
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public void mo1364() {
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L25
            boolean r0 = r4.f4840
            if (r0 == 0) goto L24
            long r0 = r4.f4841
            long r2 = java.lang.System.nanoTime()
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1c
            goto L24
        L1c:
            java.io.InterruptedIOException r4 = new java.io.InterruptedIOException
            java.lang.String r0 = "deadline reached"
            r4.<init>(r0)
            throw r4
        L24:
            return
        L25:
            java.io.InterruptedIOException r4 = new java.io.InterruptedIOException
            java.lang.String r0 = "interrupted"
            r4.<init>(r0)
            throw r4
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public defpackage.C1077 mo1365(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Lf
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = r0.toNanos(r3)
            r2.f4839 = r3
            return r2
        Lf:
            java.lang.String r2 = "timeout < 0: "
            defpackage.C2264.m3672(r2, r3)
            r2 = 0
            return r2
    }
}
