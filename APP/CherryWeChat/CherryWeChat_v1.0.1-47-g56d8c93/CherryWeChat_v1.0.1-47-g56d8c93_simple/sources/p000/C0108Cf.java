package p000;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: renamed from: Cf */
/* JADX INFO: loaded from: classes.dex */
public final class C0108Cf extends AbstractC0828TB {

    /* JADX INFO: renamed from: l */
    public final C0065Bf f253l;

    public C0108Cf(TextView r2) {
        this.f253l = new C0065Bf(r2);
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: B */
    public final void mo101B(boolean r2) {
        if (C2372pf.f8342k == null) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L8;
        return;
    L8:
        this.f253l.mo101B(r2);
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: C */
    public final void mo102C(boolean r3) {
        C0065Bf r0 = this.f253l;
        if (C2372pf.f8342k == null) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == true) goto L9;
        r0.f156n = r3;
        return;
    L9:
        r0.mo102C(r3);
        return;
    L5:
        r1 = false;
        goto L6
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: L */
    public final TransformationMethod mo103L(TransformationMethod r2) {
        if (C2372pf.f8342k == null) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        return r2;
    L9:
        return this.f253l.mo103L(r2);
    L5:
        r0 = false;
        goto L6
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: m */
    public final InputFilter[] mo104m(InputFilter[] r2) {
        if (C2372pf.f8342k == null) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        return r2;
    L9:
        return this.f253l.mo104m(r2);
    L5:
        r0 = false;
        goto L6
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: s */
    public final boolean mo105s() {
        return this.f253l.f156n;
    }
}
