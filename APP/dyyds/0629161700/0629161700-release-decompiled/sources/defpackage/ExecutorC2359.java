package defpackage;

/* JADX INFO: renamed from: ᲈᲇᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2359 implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.os.Handler f10202;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f10203;

    public ExecutorC2359() {
            r2 = this;
            r0 = 0
            r2.f10203 = r0
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.f10202 = r0
            return
    }

    public ExecutorC2359(android.os.Handler r2) {
            r1 = this;
            r0 = 1
            r1.f10203 = r0
            r1.<init>()
            r1.f10202 = r2
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            int r0 = r1.f10203
            android.os.Handler r1 = r1.f10202
            switch(r0) {
                case 0: goto L28;
                default: goto L7;
            }
        L7:
            r2.getClass()
            boolean r2 = r1.post(r2)
            if (r2 == 0) goto L11
            return
        L11:
            java.util.concurrent.RejectedExecutionException r2 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " is shutting down"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r2.<init>(r1)
            throw r2
        L28:
            r1.post(r2)
            return
    }
}
