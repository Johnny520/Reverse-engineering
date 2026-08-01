package p057e1;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: e1.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1990r extends CancellationException {
    public AbstractC1990r(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(AbstractC1991s.f5526a);
        return this;
    }
}
