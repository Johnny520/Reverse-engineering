package p000;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nb0 implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4231d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f4232e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ nb0(Context context, int i) {
        this.f4231d = i;
        this.f4232e = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4231d;
        Context context = this.f4232e;
        switch (i) {
            case 0:
                ob0.m2818C(context);
                break;
            case 1:
                hk0.m1368w(context);
                break;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new nb0(context, 3));
                break;
            default:
                p30.m2990Z(context, new rs0(), p30.f4739f, false);
                break;
        }
    }
}
