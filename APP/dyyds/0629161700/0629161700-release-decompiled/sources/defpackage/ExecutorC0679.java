package defpackage;

/* JADX INFO: renamed from: ᛴᛵᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0679 extends defpackage.AbstractC0767 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final defpackage.AbstractC1805 f3268 = null;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.ExecutorC0679 f3269 = null;

    static {
            ᛴᛵᲁᛳ r0 = new ᛴᛵᲁᛳ
            r0.<init>()
            defpackage.ExecutorC0679.f3269 = r0
            ᲁᛵᛵᲈ r0 = defpackage.C1859.f8106
            int r1 = defpackage.AbstractC1249.f5578
            r2 = 64
            if (r2 >= r1) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            r2 = 12
            java.lang.String r3 = "kotlinx.coroutines.io.parallelism"
            int r1 = defpackage.AbstractC0397.m1147(r3, r1, r2)
            ᲁᛲᛱᛵ r0 = r0.mo3200(r1)
            defpackage.ExecutorC0679.f3268 = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot be invoked on Dispatchers.IO"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            ᛲᛶᛳᛱ r0 = defpackage.C0303.f1620
            r1.mo572(r0, r2)
            return
    }

    @Override // defpackage.AbstractC1805
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "Dispatchers.IO"
            return r0
    }

    @Override // defpackage.AbstractC1805
    /* JADX INFO: renamed from: ᛲᛲᛸᲈ */
    public final void mo572(defpackage.InterfaceC0493 r1, java.lang.Runnable r2) {
            r0 = this;
            ᲁᛲᛱᛵ r0 = defpackage.ExecutorC0679.f3268
            r0.mo572(r1, r2)
            return
    }
}
