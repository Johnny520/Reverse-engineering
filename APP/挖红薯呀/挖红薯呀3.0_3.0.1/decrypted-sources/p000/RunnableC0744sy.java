package p000;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: sy */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0744sy implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5857d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f5858e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ View f5859f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0744sy(Context context, View view, int i) {
        this.f5857d = i;
        this.f5858e = context;
        this.f5859f = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5857d;
        View view = this.f5859f;
        Context context = this.f5858e;
        switch (i) {
            case 0:
                C0906wy.m5058y(context, view);
                break;
            default:
                C0906wy.m5053r(context, view);
                break;
        }
    }
}
