package p095T;

import me.dartcv.nuke.BuildConfig;
import p023E0.AbstractC0278b;

/* JADX INFO: renamed from: T.K */
/* JADX INFO: loaded from: classes.dex */
public final class C1321K extends AbstractC0278b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1321K(int i5) {
        super("rememberCoroutineScope left the composition", 1);
        switch (i5) {
            case BuildConfig.VERSION_CODE /* 1 */:
                super("The coroutine scope left the composition", 1);
                break;
            default:
                break;
        }
    }
}
