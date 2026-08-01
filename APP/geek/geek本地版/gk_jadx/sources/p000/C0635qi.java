package p000;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: renamed from: qi */
/* JADX INFO: loaded from: classes.dex */
public final class C0635qi extends a80 {

    /* JADX INFO: renamed from: w */
    public final C0598pi f4088w;

    public C0635qi(TextView textView) {
        this.f4088w = new C0598pi(textView);
    }

    @Override // p000.a80
    /* JADX INFO: renamed from: C */
    public final void mo62C(boolean z) {
        if (C0188ei.f1777j != null) {
            this.f4088w.mo62C(z);
        }
    }

    @Override // p000.a80
    /* JADX INFO: renamed from: D */
    public final void mo63D(boolean z) {
        C0598pi c0598pi = this.f4088w;
        if (C0188ei.f1777j != null) {
            c0598pi.mo63D(z);
        } else {
            c0598pi.f3907y = z;
        }
    }

    @Override // p000.a80
    /* JADX INFO: renamed from: l */
    public final InputFilter[] mo64l(InputFilter[] inputFilterArr) {
        return !(C0188ei.f1777j != null) ? inputFilterArr : this.f4088w.mo64l(inputFilterArr);
    }
}
