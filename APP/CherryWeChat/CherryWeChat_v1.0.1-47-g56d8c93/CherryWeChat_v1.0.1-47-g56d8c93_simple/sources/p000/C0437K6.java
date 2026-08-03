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

    public C0437K6(C0132D2 r1, Typeface r2) {
        this.f1434n = r2;
        this.f1435o = r1;
    }

    @Override // p000.AbstractC0295Gu
    /* JADX INFO: renamed from: y */
    public final void mo632y(int r2) {
        if (this.f1436p == true) goto L8;
        C2359pa r22 = (C2359pa) this.f1435o.f328b;
        if (r22.m4791l(this.f1434n) == false) goto L9;
        r22.m4789j(false);
        return;
    L9:
        return;
    }

    @Override // p000.AbstractC0295Gu
    /* JADX INFO: renamed from: z */
    public final void mo633z(Typeface r1, boolean r2) {
        if (this.f1436p == true) goto L8;
        C2359pa r22 = (C2359pa) this.f1435o.f328b;
        if (r22.m4791l(r1) == false) goto L9;
        r22.m4789j(false);
        return;
    L9:
        return;
    }
}
