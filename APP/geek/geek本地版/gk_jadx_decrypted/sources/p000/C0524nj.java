package p000;

import android.view.View;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: nj */
/* JADX INFO: loaded from: classes.dex */
public final class C0524nj extends s70 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3418a;

    /* JADX INFO: renamed from: b */
    public Object f3419b;

    public /* synthetic */ C0524nj() {
        this.f3418a = 2;
    }

    @Override // p000.s70, p000.q70
    /* JADX INFO: renamed from: b */
    public void mo1582b() {
        switch (this.f3418a) {
            case Base64.NO_WRAP /* 2 */:
                C0956z6 c0956z6 = (C0956z6) this.f3419b;
                if (!c0956z6.f5464z) {
                    c0956z6.m2259D();
                    c0956z6.f5464z = true;
                }
                break;
        }
    }

    @Override // p000.q70
    /* JADX INFO: renamed from: e */
    public final void mo1431e(r70 r70Var) {
        switch (this.f3418a) {
            case Base64.DEFAULT /* 0 */:
                View view = (View) this.f3419b;
                db0 db0Var = bb0.f804a;
                db0Var.mo1007N(view, 1.0f);
                db0Var.getClass();
                r70Var.m2273u(this);
                break;
            case Base64.NO_PADDING /* 1 */:
                ((r70) this.f3419b).mo2275w();
                r70Var.m2273u(this);
                break;
            default:
                C0956z6 c0956z6 = (C0956z6) this.f3419b;
                int i = c0956z6.f5463y - 1;
                c0956z6.f5463y = i;
                if (i == 0) {
                    c0956z6.f5464z = false;
                    c0956z6.m2268l();
                }
                r70Var.m2273u(this);
                break;
        }
    }

    public /* synthetic */ C0524nj(int i, Object obj) {
        this.f3418a = i;
        this.f3419b = obj;
    }
}
