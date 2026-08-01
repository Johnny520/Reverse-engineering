package p000;

import android.view.View;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class j70 extends AbstractC0126ct {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2587d;

    /* JADX INFO: renamed from: e */
    public boolean f2588e;

    /* JADX INFO: renamed from: f */
    public int f2589f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f2590g;

    public j70(k70 k70Var, int i) {
        this.f2587d = 0;
        this.f2590g = k70Var;
        this.f2589f = i;
        this.f2588e = false;
    }

    @Override // p000.ya0
    /* JADX INFO: renamed from: a */
    public final void mo0a() {
        switch (this.f2587d) {
            case Base64.DEFAULT /* 0 */:
                if (!this.f2588e) {
                    ((k70) this.f2590g).f2717a.setVisibility(this.f2589f);
                }
                break;
            default:
                int i = this.f2589f + 1;
                this.f2589f = i;
                xa0 xa0Var = (xa0) this.f2590g;
                if (i == xa0Var.f5145a.size()) {
                    ya0 ya0Var = xa0Var.f5148d;
                    if (ya0Var != null) {
                        ya0Var.mo0a();
                    }
                    this.f2589f = 0;
                    this.f2588e = false;
                    xa0Var.f5149e = false;
                }
                break;
        }
    }

    @Override // p000.AbstractC0126ct, p000.ya0
    /* JADX INFO: renamed from: b */
    public void mo1b(View view) {
        switch (this.f2587d) {
            case Base64.DEFAULT /* 0 */:
                this.f2588e = true;
                break;
        }
    }

    @Override // p000.AbstractC0126ct, p000.ya0
    /* JADX INFO: renamed from: c */
    public final void mo2c() {
        switch (this.f2587d) {
            case Base64.DEFAULT /* 0 */:
                ((k70) this.f2590g).f2717a.setVisibility(0);
                break;
            default:
                if (!this.f2588e) {
                    this.f2588e = true;
                    ya0 ya0Var = ((xa0) this.f2590g).f5148d;
                    if (ya0Var != null) {
                        ya0Var.mo2c();
                    }
                    break;
                }
                break;
        }
    }

    public j70(xa0 xa0Var) {
        this.f2587d = 1;
        this.f2590g = xa0Var;
        this.f2588e = false;
        this.f2589f = 0;
    }
}
