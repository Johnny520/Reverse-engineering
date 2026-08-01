package p000;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: n4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0498n4 implements InterfaceC0519no {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4176a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4177b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f4178c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0498n4(int i, Object obj, Object obj2) {
        this.f4176a = i;
        this.f4177b = obj;
        this.f4178c = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0519no
    /* JADX INFO: renamed from: a */
    public final void mo35a() {
        int i = this.f4176a;
        Object obj = this.f4178c;
        Object obj2 = this.f4177b;
        switch (i) {
            case 0:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C0602p4) obj);
                break;
            case 1:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C0639q4) obj);
                break;
            case 2:
                ((f90) obj2).f1633f.m1900k(obj);
                break;
            case 3:
                ((b91) obj2).f468j.remove((b91) obj);
                break;
            case 4:
                b91 b91Var = (b91) obj2;
                v81 v81Var = (v81) ((w81) obj).f7047b.getValue();
                if (v81Var != null) {
                    b91Var.f467i.remove(v81Var.f6462d);
                }
                break;
            default:
                de1 de1Var = (de1) obj2;
                View view = (View) obj;
                int i2 = de1Var.f1082t - 1;
                de1Var.f1082t = i2;
                if (i2 == 0) {
                    int i3 = kc1.f3078a;
                    gc1.m1236a(view, null);
                    view.setWindowInsetsAnimationCallback(null);
                    view.removeOnAttachStateChangeListener(de1Var.f1083u);
                }
                break;
        }
    }
}
