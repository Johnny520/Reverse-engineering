package p000;

import android.graphics.Typeface;

/* JADX INFO: renamed from: q8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0624q8 extends AbstractC0387ju {

    /* JADX INFO: renamed from: c */
    public final Typeface f3864c;

    /* JADX INFO: renamed from: d */
    public final C0431l0 f3865d;

    /* JADX INFO: renamed from: e */
    public boolean f3866e;

    public C0624q8(C0431l0 c0431l0, Typeface typeface) {
        this.f3864c = typeface;
        this.f3865d = c0431l0;
    }

    @Override // p000.AbstractC0387ju
    /* JADX INFO: renamed from: r */
    public final void mo1073r(int i) {
        if (this.f3866e) {
            return;
        }
        C0292hb c0292hb = (C0292hb) this.f3865d.f2886b;
        if (c0292hb.m1381j(this.f3864c)) {
            c0292hb.m1379h(false);
        }
    }

    @Override // p000.AbstractC0387ju
    /* JADX INFO: renamed from: s */
    public final void mo1074s(Typeface typeface, boolean z) {
        if (this.f3866e) {
            return;
        }
        C0292hb c0292hb = (C0292hb) this.f3865d.f2886b;
        if (c0292hb.m1381j(typeface)) {
            c0292hb.m1379h(false);
        }
    }
}
