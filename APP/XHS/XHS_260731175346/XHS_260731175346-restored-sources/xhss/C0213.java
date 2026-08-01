package xhss;

/* JADX INFO: renamed from: xhss.ᛲᲁᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0213 {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final xhss.C0318 f787 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public long f788;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public long f789;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public boolean f790;

    static {
            xhss.ᛳᲁᲁᛲ r0 = new xhss.ᛳᲁᲁᛲ
            r0.<init>()
            xhss.C0213.f787 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.C0213 mo477() {
            r2 = this;
            r0 = 0
            r2.f789 = r0
            return r2
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public long mo478() {
            r2 = this;
            boolean r0 = r2.f790
            if (r0 == 0) goto L7
            long r0 = r2.f788
            return r0
        L7:
            java.lang.String r2 = "No deadline"
            xhss.C0532.m950(r2)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public boolean mo479() {
            r0 = this;
            boolean r0 = r0.f790
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public xhss.C0213 mo480() {
            r1 = this;
            r0 = 0
            r1.f790 = r0
            return r1
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public xhss.C0213 mo481(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Lf
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r3 = r0.toNanos(r3)
            r2.f789 = r3
            return r2
        Lf:
            java.lang.String r2 = "timeout < 0: "
            xhss.C0532.m952(r2, r3)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public xhss.C0213 mo482(long r2) {
            r1 = this;
            r0 = 1
            r1.f790 = r0
            r1.f788 = r2
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public void mo483() {
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L25
            boolean r0 = r4.f790
            if (r0 == 0) goto L24
            long r0 = r4.f788
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
}
