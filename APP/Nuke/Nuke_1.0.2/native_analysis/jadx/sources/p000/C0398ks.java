package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: ks */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0398ks extends CancellationException {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5740h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0398ks(String str, int i) {
        super(str);
        this.f5740h = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f5740h) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(AbstractC0691se.f10071d);
                break;
        }
        return this;
    }
}
