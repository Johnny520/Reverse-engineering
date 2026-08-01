package p086r0;

import android.app.Activity;
import android.view.View;
import p088s0.C0976J;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.O0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC0862O0 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2969b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2970c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnLongClickListenerC0862O0(int i2, Object obj) {
        this.f2969b = i2;
        this.f2970c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Object obj = this.f2970c;
        switch (this.f2969b) {
            case 0:
                boolean z2 = AbstractC1126i.f3786a;
                if (!C1124g.m2417H() && C1124g.m2410A()) {
                    C0881Y0 c0881y0 = (C0881Y0) obj;
                    C0864P0 c0864p0 = (C0864P0) c0881y0.f3044h.get(view);
                    if (c0864p0 != null && c0881y0.m1792C(c0864p0.f2972a)) {
                        c0881y0.m1796M(c0864p0);
                    }
                }
                break;
            default:
                new C0976J((Activity) obj).m2209g();
                break;
        }
        return true;
    }
}
