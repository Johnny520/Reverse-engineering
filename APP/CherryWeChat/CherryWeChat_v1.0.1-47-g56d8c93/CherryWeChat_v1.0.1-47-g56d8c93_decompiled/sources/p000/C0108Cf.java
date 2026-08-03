package p000;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: renamed from: Cf */
/* JADX INFO: loaded from: classes.dex */
public final class C0108Cf extends AbstractC0828TB {

    /* JADX INFO: renamed from: l */
    public final C0065Bf f253l;

    public C0108Cf(TextView textView) {
        this.f253l = new C0065Bf(textView);
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: B */
    public final void mo101B(boolean z) {
        if (C2372pf.f8342k != null) {
            this.f253l.mo101B(z);
        }
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: C */
    public final void mo102C(boolean z) {
        C0065Bf c0065Bf = this.f253l;
        if (C2372pf.f8342k != null) {
            c0065Bf.mo102C(z);
        } else {
            c0065Bf.f156n = z;
        }
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: L */
    public final TransformationMethod mo103L(TransformationMethod transformationMethod) {
        return !(C2372pf.f8342k != null) ? transformationMethod : this.f253l.mo103L(transformationMethod);
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: m */
    public final InputFilter[] mo104m(InputFilter[] inputFilterArr) {
        return !(C2372pf.f8342k != null) ? inputFilterArr : this.f253l.mo104m(inputFilterArr);
    }

    @Override // p000.AbstractC0828TB
    /* JADX INFO: renamed from: s */
    public final boolean mo105s() {
        return this.f253l.f156n;
    }
}
