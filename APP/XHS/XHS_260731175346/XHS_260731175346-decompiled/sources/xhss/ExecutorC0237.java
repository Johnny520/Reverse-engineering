package xhss;

/* JADX INFO: renamed from: xhss.ᛳᛲᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0237 extends xhss.AbstractC0959 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final xhss.ExecutorC0237 f902 = null;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final xhss.AbstractC0180 f903 = null;

    static {
            xhss.ᛳᛲᛳᛲ r0 = new xhss.ᛳᛲᛳᛲ
            r0.<init>()
            xhss.ExecutorC0237.f902 = r0
            xhss.ᲈᛲᛱᲀ r0 = xhss.C1121.f3613
            int r1 = xhss.AbstractC0903.f2932
            r2 = 64
            if (r2 >= r1) goto L10
            goto L11
        L10:
            r1 = r2
        L11:
            r2 = 12
            java.lang.String r3 = "kotlinx.coroutines.io.parallelism"
            int r1 = xhss.AbstractC0473.m864(r3, r1, r2)
            xhss.ᛲᛶᲇᲇ r0 = r0.mo443(r1)
            xhss.ExecutorC0237.f903 = r0
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
            xhss.ᲇᛷᲁᛷ r0 = xhss.C1059.f3421
            r1.mo359(r0, r2)
            return
    }

    @Override // xhss.AbstractC0180
    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "Dispatchers.IO"
            return r0
    }

    @Override // xhss.AbstractC0180
    /* JADX INFO: renamed from: ᛷᲁᲁ */
    public final void mo359(xhss.InterfaceC0362 r1, java.lang.Runnable r2) {
            r0 = this;
            xhss.ᛲᛶᲇᲇ r0 = xhss.ExecutorC0237.f903
            r0.mo359(r1, r2)
            return
    }
}
