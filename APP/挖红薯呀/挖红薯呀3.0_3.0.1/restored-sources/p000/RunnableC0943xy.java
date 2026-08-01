package p000;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: renamed from: xy */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0943xy implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7459d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7460e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f7461f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0943xy(int i, int i2, Object obj) {
        this.f7459d = i2;
        this.f7461f = obj;
        this.f7460e = i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: yy.e(android.view.ViewGroup, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7459d;
        int i2 = this.f7460e;
        Object obj = this.f7461f;
        switch (i) {
            case 0:
                C0980yy.m5314R((ViewGroup) obj, i2);
                break;
            default:
                ob0.m2820E((Context) obj, i2);
                break;
        }
    }
}
