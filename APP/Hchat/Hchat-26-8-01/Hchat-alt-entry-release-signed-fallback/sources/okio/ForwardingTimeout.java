package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ForwardingTimeout extends okio.Timeout {
    private okio.Timeout delegate;

    public ForwardingTimeout(okio.Timeout r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.delegate = r1
            return
    }

    @Override // okio.Timeout
    public okio.Timeout clearDeadline() {
            r1 = this;
            okio.Timeout r0 = r1.delegate
            okio.Timeout r0 = r0.clearDeadline()
            return r0
    }

    @Override // okio.Timeout
    public okio.Timeout clearTimeout() {
            r1 = this;
            okio.Timeout r0 = r1.delegate
            okio.Timeout r0 = r0.clearTimeout()
            return r0
    }

    @Override // okio.Timeout
    public long deadlineNanoTime() {
            r2 = this;
            okio.Timeout r0 = r2.delegate
            long r0 = r0.deadlineNanoTime()
            return r0
    }

    @Override // okio.Timeout
    public okio.Timeout deadlineNanoTime(long r2) {
            r1 = this;
            okio.Timeout r0 = r1.delegate
            okio.Timeout r2 = r0.deadlineNanoTime(r2)
            return r2
    }

    public final okio.Timeout delegate() {
            r1 = this;
            okio.Timeout r0 = r1.delegate
            return r0
    }

    @Override // okio.Timeout
    public boolean hasDeadline() {
            r1 = this;
            okio.Timeout r0 = r1.delegate
            boolean r0 = r0.hasDeadline()
            return r0
    }

    public final okio.ForwardingTimeout setDelegate(okio.Timeout r1) {
            r0 = this;
            r1.getClass()
            r0.delegate = r1
            return r0
    }

    /* JADX INFO: renamed from: setDelegate, reason: collision with other method in class */
    public final /* synthetic */ void m169setDelegate(okio.Timeout r1) {
            r0 = this;
            r1.getClass()
            r0.delegate = r1
            return
    }

    @Override // okio.Timeout
    public void throwIfReached() {
            r1 = this;
            okio.Timeout r0 = r1.delegate
            r0.throwIfReached()
            return
    }

    @Override // okio.Timeout
    public okio.Timeout timeout(long r2, java.util.concurrent.TimeUnit r4) {
            r1 = this;
            r4.getClass()
            okio.Timeout r0 = r1.delegate
            okio.Timeout r2 = r0.timeout(r2, r4)
            return r2
    }

    @Override // okio.Timeout
    public long timeoutNanos() {
            r2 = this;
            okio.Timeout r0 = r2.delegate
            long r0 = r0.timeoutNanos()
            return r0
    }
}
