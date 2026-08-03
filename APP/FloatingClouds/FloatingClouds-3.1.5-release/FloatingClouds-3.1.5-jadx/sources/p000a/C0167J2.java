package p000a;

import android.graphics.Typeface;

/* JADX INFO: renamed from: a.J2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0167J2 extends AbstractC0472a2 {

    /* JADX INFO: renamed from: a */
    public final Typeface f593a;

    /* JADX INFO: renamed from: b */
    public final C0308R0 f594b;

    /* JADX INFO: renamed from: c */
    public boolean f595c;

    public C0167J2(C0308R0 c0308r0, Typeface typeface) {
        this.f593a = typeface;
        this.f594b = c0308r0;
    }

    @Override // p000a.AbstractC0472a2
    /* JADX INFO: renamed from: d */
    public final void mo456d(int i) {
        if (this.f595c) {
            return;
        }
        C0720n3 c0720n3 = (C0720n3) this.f594b.f1108a;
        if (c0720n3.m1649j(this.f593a)) {
            c0720n3.m1647h(false);
        }
    }

    @Override // p000a.AbstractC0472a2
    /* JADX INFO: renamed from: e */
    public final void mo457e(Typeface typeface, boolean z) {
        if (this.f595c) {
            return;
        }
        C0720n3 c0720n3 = (C0720n3) this.f594b.f1108a;
        if (c0720n3.m1649j(typeface)) {
            c0720n3.m1647h(false);
        }
    }
}
