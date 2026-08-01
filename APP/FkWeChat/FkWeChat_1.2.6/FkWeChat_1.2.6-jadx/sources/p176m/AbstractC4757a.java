package p176m;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: m.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4757a extends CancellationException {
    public AbstractC4757a(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(AbstractC4758b.f14090a);
        return this;
    }
}
