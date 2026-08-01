package p000;

import android.content.Context;

/* JADX INFO: renamed from: bp */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0063bp implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f554d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f555e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f556f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0063bp(Context context, String str, int i) {
        this.f554d = i;
        this.f555e = context;
        this.f556f = str;
    }

    /* JADX DEBUG: Class process forced to load method for inline: hk0.b(android.content.Context, java.lang.String):void */
    /* JADX DEBUG: Class process forced to load method for inline: hp.k(android.content.Context, java.lang.String):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f554d) {
            case 0:
                C0291hp.m1461b0(this.f555e, this.f556f);
                break;
            default:
                hk0.m1346R(this.f555e, this.f556f);
                break;
        }
    }
}
