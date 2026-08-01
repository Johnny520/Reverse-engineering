package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: be */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0052be extends CancellationException {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f499d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0052be(String str, int i) {
        super(str);
        this.f499d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f499d) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(o30.f4443m);
                break;
        }
        return this;
    }
}
