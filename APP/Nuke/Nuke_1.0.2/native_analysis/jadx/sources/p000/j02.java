package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j02 extends CancellationException {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4873h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j02(String str, int i) {
        super(str);
        this.f4873h = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f4873h) {
            case 0:
                setStackTrace(rg3.f9570l);
                break;
            case 1:
                setStackTrace(AbstractC0731te.f10692d);
                break;
            default:
                setStackTrace(AbstractC0570p7.f7996e);
                break;
        }
        return this;
    }
}
