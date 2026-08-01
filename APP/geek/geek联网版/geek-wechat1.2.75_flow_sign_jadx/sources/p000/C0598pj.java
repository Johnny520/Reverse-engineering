package p000;

import android.view.View;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: pj */
/* JADX INFO: loaded from: classes.dex */
public final class C0598pj extends y70 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3715a;

    /* JADX INFO: renamed from: b */
    public Object f3716b;

    public /* synthetic */ C0598pj() {
        this.f3715a = 2;
    }

    @Override // p000.y70, p000.w70
    /* JADX INFO: renamed from: b */
    public void mo2014b() {
        switch (this.f3715a) {
            case Base64.NO_WRAP /* 2 */:
                C0364j7 c0364j7 = (C0364j7) this.f3716b;
                if (!c0364j7.f2674z) {
                    c0364j7.m2642D();
                    c0364j7.f2674z = true;
                }
                break;
        }
    }

    @Override // p000.w70
    /* JADX INFO: renamed from: e */
    public final void mo1670e(x70 x70Var) {
        switch (this.f3715a) {
            case Base64.DEFAULT /* 0 */:
                View view = (View) this.f3716b;
                ib0 ib0Var = gb0.f1949a;
                ib0Var.mo1324I(view, 1.0f);
                ib0Var.getClass();
                x70Var.m2651u(this);
                break;
            case Base64.NO_PADDING /* 1 */:
                ((x70) this.f3716b).mo1588w();
                x70Var.m2651u(this);
                break;
            default:
                C0364j7 c0364j7 = (C0364j7) this.f3716b;
                int i = c0364j7.f2673y - 1;
                c0364j7.f2673y = i;
                if (i == 0) {
                    c0364j7.f2674z = false;
                    c0364j7.m2647l();
                }
                x70Var.m2651u(this);
                break;
        }
    }

    public /* synthetic */ C0598pj(int i, Object obj) {
        this.f3715a = i;
        this.f3716b = obj;
    }
}
