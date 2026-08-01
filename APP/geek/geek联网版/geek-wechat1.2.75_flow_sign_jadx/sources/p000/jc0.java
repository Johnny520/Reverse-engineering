package p000;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: classes.dex */
public final class jc0 extends kc0 {

    /* JADX INFO: renamed from: e */
    public final WindowInsetsAnimation f2711e;

    public jc0(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f2711e = windowInsetsAnimation;
    }

    @Override // p000.kc0
    /* JADX INFO: renamed from: a */
    public final long mo1598a() {
        return this.f2711e.getDurationMillis();
    }

    @Override // p000.kc0
    /* JADX INFO: renamed from: b */
    public final float mo1599b() {
        return this.f2711e.getInterpolatedFraction();
    }

    @Override // p000.kc0
    /* JADX INFO: renamed from: c */
    public final int mo1600c() {
        return this.f2711e.getTypeMask();
    }

    @Override // p000.kc0
    /* JADX INFO: renamed from: d */
    public final void mo1601d(float f) {
        this.f2711e.setFraction(f);
    }
}
