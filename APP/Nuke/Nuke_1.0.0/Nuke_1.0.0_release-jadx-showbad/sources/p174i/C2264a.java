package p174i;

import java.util.concurrent.Executors;
import me.dartcv.nuke.BuildConfig;
import p049I2.AbstractC0797o;

/* JADX INFO: renamed from: i.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2264a extends AbstractC0797o {

    /* JADX INFO: renamed from: d */
    public static volatile C2264a f7406d;

    /* JADX INFO: renamed from: c */
    public final Object f7407c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2264a(int i5) {
        switch (i5) {
            case BuildConfig.VERSION_CODE /* 1 */:
                this.f7407c = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC2265b());
                break;
            default:
                this.f7407c = new C2264a(1);
                break;
        }
    }
}
