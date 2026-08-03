package p116i;

import java.util.concurrent.CancellationException;
import p130j.AbstractC2044a;

/* JADX INFO: renamed from: i.l0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1767l0 extends CancellationException {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5906g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1767l0(String str, int i9) {
        super(str);
        this.f5906g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f5906g) {
            case 0:
                setStackTrace(AbstractC2044a.f6889a);
                break;
            default:
                setStackTrace(new StackTraceElement[0]);
                break;
        }
        return this;
    }
}
