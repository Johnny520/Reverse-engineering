package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ForwardingTimeout extends Timeout {
    private Timeout delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ForwardingTimeout(Timeout timeout) {
        timeout.getClass();
        this.delegate = timeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Timeout
    public Timeout clearDeadline() {
        return this.delegate.clearDeadline();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Timeout
    public Timeout clearTimeout() {
        return this.delegate.clearTimeout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Timeout
    public long deadlineNanoTime() {
        return this.delegate.deadlineNanoTime();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Timeout delegate() {
        return this.delegate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Timeout
    public boolean hasDeadline() {
        return this.delegate.hasDeadline();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: setDelegate, reason: collision with other method in class */
    public final /* synthetic */ void m11079setDelegate(Timeout timeout) {
        timeout.getClass();
        this.delegate = timeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Timeout
    public void throwIfReached() throws InterruptedIOException {
        this.delegate.throwIfReached();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Timeout
    public Timeout timeout(long j3, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.delegate.timeout(j3, timeUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.Timeout
    public long timeoutNanos() {
        return this.delegate.timeoutNanos();
    }

    public final ForwardingTimeout setDelegate(Timeout timeout) {
        timeout.getClass();
        this.delegate = timeout;
        return this;
    }

    @Override // okio.Timeout
    public Timeout deadlineNanoTime(long j3) {
        return this.delegate.deadlineNanoTime(j3);
    }
}
