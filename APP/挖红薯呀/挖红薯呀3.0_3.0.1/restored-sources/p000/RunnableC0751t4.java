package p000;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.LongSparseArray;
import android.widget.ImageView;
import p000.C0439lp;
import p000.n90;
import top.anjao2024.xp1whs.MainActivity;

/* JADX INFO: renamed from: t4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0751t4 implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5906d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f5907e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f5908f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0751t4(int i, Object obj, Object obj2) {
        this.f5906d = i;
        this.f5907e = obj;
        this.f5908f = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5906d;
        Object obj = this.f5908f;
        Object obj2 = this.f5907e;
        switch (i) {
            case 0:
                s91.m4057v((ViewOnAttachStateChangeListenerC0827v4) obj2, (LongSparseArray) obj);
                break;
            case 1:
                MainActivity mainActivity = (MainActivity) obj2;
                mainActivity.getLifecycle().mo4014a(new C0851vg(0, (bl0) obj, mainActivity));
                break;
            case 2:
                DialogC0402kp.m1953l((DialogC0402kp) obj2, (C0439lp.a) obj);
                break;
            case 3:
                C0870vz.m4814p((String) obj2, (InterfaceC0742sw) obj);
                break;
            case 4:
                m00.m2331y2((ImageView) obj2, (Bitmap) obj);
                break;
            case 5:
                m00.m2171Q2((m00) obj2, (Bitmap) obj);
                break;
            case 6:
                m90.m2469n((m90) obj2, (n90.C0504a) obj);
                break;
            case 7:
                m90.m2468m((m90) obj2, (String) obj);
                break;
            case 8:
                ob0.m2839Y((Dialog) obj2, (Context) obj);
                break;
            case 9:
                hk0.m1370z((InterfaceC0298hw) obj2, (Context) obj);
                break;
            default:
                wb1.m4940E((Context) obj2, (InterfaceC0742sw) obj);
                break;
        }
    }
}
