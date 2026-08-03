package p201o;

import java.util.concurrent.CancellationException;
import p266s0.AbstractC3879i;
import p292u1.AbstractC4230b;

/* JADX INFO: renamed from: o.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3027c extends CancellationException {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9831g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC3027c(String str, int i9) {
        super(str);
        this.f9831g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f9831g) {
            case 0:
                setStackTrace(AbstractC3028d.f9832a);
                break;
            case 1:
                setStackTrace(AbstractC3879i.f12734a);
                break;
            default:
                setStackTrace(AbstractC4230b.f13902a);
                break;
        }
        return this;
    }
}
