package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: z8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0958z8 extends s70 {

    /* JADX INFO: renamed from: a */
    public boolean f5472a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewGroup f5473b;

    public C0958z8(ViewGroup viewGroup) {
        this.f5473b = viewGroup;
    }

    @Override // p000.s70, p000.q70
    /* JADX INFO: renamed from: a */
    public final void mo1581a() {
        AbstractC0979zt.m2821Q(this.f5473b, false);
        this.f5472a = true;
    }

    @Override // p000.s70, p000.q70
    /* JADX INFO: renamed from: c */
    public final void mo1429c() {
        AbstractC0979zt.m2821Q(this.f5473b, false);
    }

    @Override // p000.s70, p000.q70
    /* JADX INFO: renamed from: d */
    public final void mo1430d() {
        AbstractC0979zt.m2821Q(this.f5473b, true);
    }

    @Override // p000.q70
    /* JADX INFO: renamed from: e */
    public final void mo1431e(r70 r70Var) {
        if (!this.f5472a) {
            AbstractC0979zt.m2821Q(this.f5473b, false);
        }
        r70Var.m2273u(this);
    }
}
