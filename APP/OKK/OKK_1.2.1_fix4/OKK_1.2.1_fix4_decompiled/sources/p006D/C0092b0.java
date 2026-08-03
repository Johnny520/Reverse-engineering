package p006D;

import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: D.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0092b0 extends AbstractC0094c0 {

    /* JADX INFO: renamed from: e */
    public final WindowInsetsAnimation f245e;

    public C0092b0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f245e = windowInsetsAnimation;
    }

    @Override // p006D.AbstractC0094c0
    /* JADX INFO: renamed from: a */
    public final long mo320a() {
        return this.f245e.getDurationMillis();
    }

    @Override // p006D.AbstractC0094c0
    /* JADX INFO: renamed from: b */
    public final float mo321b() {
        return this.f245e.getInterpolatedFraction();
    }

    @Override // p006D.AbstractC0094c0
    /* JADX INFO: renamed from: c */
    public final int mo322c() {
        return this.f245e.getTypeMask();
    }

    @Override // p006D.AbstractC0094c0
    /* JADX INFO: renamed from: d */
    public final void mo323d(float f2) {
        this.f245e.setFraction(f2);
    }
}
