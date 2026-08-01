package p000;

import android.view.View;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class p70 extends AbstractC0387ju {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3605c;

    /* JADX INFO: renamed from: d */
    public boolean f3606d;

    /* JADX INFO: renamed from: e */
    public int f3607e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f3608f;

    public p70(q70 q70Var, int i) {
        this.f3605c = 0;
        this.f3608f = q70Var;
        this.f3607e = i;
        this.f3606d = false;
    }

    @Override // p000.db0
    /* JADX INFO: renamed from: a */
    public final void mo0a() {
        switch (this.f3605c) {
            case Base64.DEFAULT /* 0 */:
                if (!this.f3606d) {
                    ((q70) this.f3608f).f3849a.setVisibility(this.f3607e);
                }
                break;
            default:
                int i = this.f3607e + 1;
                this.f3607e = i;
                cb0 cb0Var = (cb0) this.f3608f;
                if (i == cb0Var.f870a.size()) {
                    db0 db0Var = cb0Var.f873d;
                    if (db0Var != null) {
                        db0Var.mo0a();
                    }
                    this.f3607e = 0;
                    this.f3606d = false;
                    cb0Var.f874e = false;
                }
                break;
        }
    }

    @Override // p000.AbstractC0387ju, p000.db0
    /* JADX INFO: renamed from: b */
    public void mo1b(View view) {
        switch (this.f3605c) {
            case Base64.DEFAULT /* 0 */:
                this.f3606d = true;
                break;
        }
    }

    @Override // p000.AbstractC0387ju, p000.db0
    /* JADX INFO: renamed from: c */
    public final void mo2c() {
        switch (this.f3605c) {
            case Base64.DEFAULT /* 0 */:
                ((q70) this.f3608f).f3849a.setVisibility(0);
                break;
            default:
                if (!this.f3606d) {
                    this.f3606d = true;
                    db0 db0Var = ((cb0) this.f3608f).f873d;
                    if (db0Var != null) {
                        db0Var.mo2c();
                    }
                    break;
                }
                break;
        }
    }

    public p70(cb0 cb0Var) {
        this.f3605c = 1;
        this.f3608f = cb0Var;
        this.f3606d = false;
        this.f3607e = 0;
    }
}
