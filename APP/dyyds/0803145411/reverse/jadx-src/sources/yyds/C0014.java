package yyds;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᛱᛸ */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0014 extends AbstractC0427 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2596 f1044;

    public C0014(TextView textView) {
        this.f1044 = new C2596(textView);
    }

    @Override // yyds.AbstractC0427
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final void mo758(boolean z) {
        boolean z2 = C0331.f1745 != null;
        C2596 c2596 = this.f1044;
        if (z2) {
            c2596.mo758(z);
        } else {
            c2596.f12789 = z;
        }
    }

    @Override // yyds.AbstractC0427
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void mo759(boolean z) {
        if (C0331.f1745 != null) {
            this.f1044.mo759(z);
        }
    }

    @Override // yyds.AbstractC0427
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final InputFilter[] mo760(InputFilter[] inputFilterArr) {
        return !(C0331.f1745 != null) ? inputFilterArr : this.f1044.mo760(inputFilterArr);
    }
}
