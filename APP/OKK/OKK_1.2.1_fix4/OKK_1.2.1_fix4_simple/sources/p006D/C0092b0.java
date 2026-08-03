package p006D;

import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: D.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0092b0 extends AbstractC0094c0 {

    /* JADX INFO: renamed from: e */
    public final WindowInsetsAnimation f245e;

    public C0092b0(WindowInsetsAnimation r5) {
        super(0, null, 0);
        this.f245e = r5;
    }

    @Override // p006D.AbstractC0094c0
    /* JADX INFO: renamed from: a */
    public final long mo320a() {
        return AbstractC0130v.m439d(this.f245e);
    }

    @Override // p006D.AbstractC0094c0
    /* JADX INFO: renamed from: b */
    public final float mo321b() {
        return AbstractC0130v.m436a(this.f245e);
    }

    @Override // p006D.AbstractC0094c0
    /* JADX INFO: renamed from: c */
    public final int mo322c() {
        return AbstractC0130v.m438c(this.f245e);
    }

    @Override // p006D.AbstractC0094c0
    /* JADX INFO: renamed from: d */
    public final void mo323d(float r2) {
        AbstractC0130v.m453r(this.f245e, r2);
    }
}
