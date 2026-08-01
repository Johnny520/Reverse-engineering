package p014H;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.C0396k;
import p006D.AbstractC0079h;

/* JADX INFO: renamed from: H.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0149h extends AbstractC0079h {

    /* JADX INFO: renamed from: d */
    public final C0148g f459d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0149h(TextView textView) {
        this.f459d = new C0148g(textView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: P */
    public final void mo205P(boolean z2) {
        if (C0396k.f1174j != null) {
            this.f459d.mo205P(z2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: Q */
    public final void mo206Q(boolean z2) {
        boolean z3 = C0396k.f1174j != null;
        C0148g c0148g = this.f459d;
        if (z3) {
            c0148g.mo206Q(z2);
        } else {
            c0148g.f458f = z2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: t */
    public final InputFilter[] mo209t(InputFilter[] inputFilterArr) {
        return !(C0396k.f1174j != null) ? inputFilterArr : this.f459d.mo209t(inputFilterArr);
    }
}
