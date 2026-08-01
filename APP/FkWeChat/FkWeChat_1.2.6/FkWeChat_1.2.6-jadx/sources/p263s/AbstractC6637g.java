package p263s;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: s.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6637g extends CancellationException {
    public AbstractC6637g(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(AbstractC6638h.f20783a);
        return this;
    }
}
