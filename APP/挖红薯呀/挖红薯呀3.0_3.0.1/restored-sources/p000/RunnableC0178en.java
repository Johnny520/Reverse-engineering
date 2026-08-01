package p000;

import android.app.Dialog;
import android.content.Context;

/* JADX INFO: renamed from: en */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0178en implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1483d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1484e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f1485f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f1486g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0178en(DialogC0402kp dialogC0402kp, Context context, int i) {
        this.f1483d = 1;
        this.f1485f = dialogC0402kp;
        this.f1486g = context;
        this.f1484e = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1483d;
        Object obj = this.f1486g;
        int i2 = this.f1484e;
        Object obj2 = this.f1485f;
        switch (i) {
            case 0:
                ((ss0) ((C0215fn) obj2).f1772c).mo1737f(i2, obj);
                break;
            case 1:
                ob0.m2817B((DialogC0402kp) obj2, (Context) obj, i2);
                break;
            default:
                vf0.m4476A1((Context) obj2, i2, (Dialog) obj);
                break;
        }
    }

    public /* synthetic */ RunnableC0178en(int i, int i2, Object obj, Object obj2) {
        this.f1483d = i2;
        this.f1485f = obj;
        this.f1484e = i;
        this.f1486g = obj2;
    }
}
