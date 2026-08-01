package p000;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: renamed from: si */
/* JADX INFO: loaded from: classes.dex */
public final class C0708si extends AbstractC0493mp {

    /* JADX INFO: renamed from: A */
    public final C0671ri f4319A;

    public C0708si(TextView textView) {
        this.f4319A = new C0671ri(textView);
    }

    @Override // p000.AbstractC0493mp
    /* JADX INFO: renamed from: N */
    public final void mo1876N(boolean z) {
        if (C0262gi.f1988j != null) {
            this.f4319A.mo1876N(z);
        }
    }

    @Override // p000.AbstractC0493mp
    /* JADX INFO: renamed from: O */
    public final void mo1877O(boolean z) {
        C0671ri c0671ri = this.f4319A;
        if (C0262gi.f1988j != null) {
            c0671ri.mo1877O(z);
        } else {
            c0671ri.f4146C = z;
        }
    }

    @Override // p000.AbstractC0493mp
    /* JADX INFO: renamed from: r */
    public final InputFilter[] mo1878r(InputFilter[] inputFilterArr) {
        return !(C0262gi.f1988j != null) ? inputFilterArr : this.f4319A.mo1878r(inputFilterArr);
    }
}
