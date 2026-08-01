package p000;

import android.graphics.Typeface;

/* JADX INFO: renamed from: g8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0252g8 extends AbstractC0273gt {

    /* JADX INFO: renamed from: a */
    public final Typeface f2035a;

    /* JADX INFO: renamed from: b */
    public final C0431l0 f2036b;

    /* JADX INFO: renamed from: c */
    public boolean f2037c;

    public C0252g8(C0431l0 c0431l0, Typeface typeface) {
        this.f2035a = typeface;
        this.f2036b = c0431l0;
    }

    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: p */
    public final void mo1266p(int i) {
        if (this.f2037c) {
            return;
        }
        C0960za c0960za = (C0960za) this.f2036b.f2980b;
        if (c0960za.m2795j(this.f2035a)) {
            c0960za.m2793h(false);
        }
    }

    @Override // p000.AbstractC0273gt
    /* JADX INFO: renamed from: q */
    public final void mo1267q(Typeface typeface, boolean z) {
        if (this.f2037c) {
            return;
        }
        C0960za c0960za = (C0960za) this.f2036b.f2980b;
        if (c0960za.m2795j(typeface)) {
            c0960za.m2793h(false);
        }
    }
}
