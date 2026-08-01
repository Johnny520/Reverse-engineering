package p120i2;

import java.util.concurrent.CancellationException;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: i2.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3168b extends CancellationException {
    public /* synthetic */ AbstractC3168b(String str, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? null : str);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(AbstractC3169c.f8447a);
        return this;
    }

    public AbstractC3168b(String str) {
        super(str);
    }
}
