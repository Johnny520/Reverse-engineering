package p000;

import android.content.Context;
import java.util.List;

/* JADX INFO: renamed from: gp */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0254gp implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2028d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f2029e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Context f2030f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0254gp(List list, Context context, int i) {
        this.f2028d = i;
        this.f2029e = list;
        this.f2030f = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2028d;
        Context context = this.f2030f;
        List list = this.f2029e;
        switch (i) {
            case 0:
                C0291hp.m1483w(list, context);
                break;
            case 1:
                C0291hp.m1484x(list, context);
                break;
            case 2:
                C0291hp.m1435A(list, context);
                break;
            default:
                C0291hp.m1436B(list, context);
                break;
        }
    }
}
