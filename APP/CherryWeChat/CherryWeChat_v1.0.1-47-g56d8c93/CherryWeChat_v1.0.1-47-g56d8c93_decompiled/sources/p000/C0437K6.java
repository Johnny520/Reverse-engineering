package p000;

import android.graphics.Typeface;

/* JADX INFO: renamed from: K6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0437K6 extends AbstractC0295Gu {

    /* JADX INFO: renamed from: n */
    public final Typeface f1434n;

    /* JADX INFO: renamed from: o */
    public final C0132D2 f1435o;

    /* JADX INFO: renamed from: p */
    public boolean f1436p;

    public C0437K6(C0132D2 c0132d2, Typeface typeface) {
        this.f1434n = typeface;
        this.f1435o = c0132d2;
    }

    @Override // p000.AbstractC0295Gu
    /* JADX INFO: renamed from: y */
    public final void mo632y(int i) {
        if (this.f1436p) {
            return;
        }
        C2359pa c2359pa = (C2359pa) this.f1435o.f328b;
        if (c2359pa.m4791l(this.f1434n)) {
            c2359pa.m4789j(false);
        }
    }

    @Override // p000.AbstractC0295Gu
    /* JADX INFO: renamed from: z */
    public final void mo633z(Typeface typeface, boolean z) {
        if (this.f1436p) {
            return;
        }
        C2359pa c2359pa = (C2359pa) this.f1435o.f328b;
        if (c2359pa.m4791l(typeface)) {
            c2359pa.m4789j(false);
        }
    }
}
