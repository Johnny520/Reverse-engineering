package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dr0 extends CancellationException {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1170d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dr0(String str, int i) {
        super(str);
        this.f1170d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f1170d) {
            case 0:
                setStackTrace(pf1.f4842h);
                break;
            case 1:
                setStackTrace(AbstractC0307i4.f2433n);
                break;
            default:
                setStackTrace(AbstractC0398kl.f3207r);
                break;
        }
        return this;
    }
}
