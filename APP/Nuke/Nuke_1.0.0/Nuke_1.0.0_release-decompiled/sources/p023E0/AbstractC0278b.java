package p023E0;

import java.util.concurrent.CancellationException;
import me.dartcv.nuke.BuildConfig;
import p136b0.AbstractC1848j;
import p238t.AbstractC3205c;

/* JADX INFO: renamed from: E0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0278b extends CancellationException {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC0278b(String str, int i5) {
        super(str);
        this.f900d = i5;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f900d) {
            case 0:
                setStackTrace(AbstractC0279c.f901a);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                setStackTrace(AbstractC1848j.f6256a);
                break;
            default:
                setStackTrace(AbstractC3205c.f9977a);
                break;
        }
        return this;
    }
}
