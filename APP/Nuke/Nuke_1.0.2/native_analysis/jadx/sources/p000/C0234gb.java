package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: renamed from: gb */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0234gb implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3380h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0492nb f3381i;

    public /* synthetic */ C0234gb(C0492nb c0492nb, int i) {
        this.f3380h = i;
        this.f3381i = c0492nb;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f3380h;
        int i2 = 2;
        a83 a83Var = a83.f116a;
        C0492nb c0492nb = this.f3381i;
        switch (i) {
            case 0:
                xm0 xm0Var = (xm0) obj;
                View view = c0492nb.f7091a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    xm0Var.mo6a();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0413l6(xm0Var, 2));
                    }
                }
                return a83Var;
            case 1:
                ActionMode actionMode = c0492nb.f7098h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return a83Var;
            case 2:
                ActionMode actionMode2 = c0492nb.f7098h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return a83Var;
            default:
                c0492nb.f7095e.m5437d();
                return new C0194f8(i2, c0492nb);
        }
    }
}
