package p025N;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.C0485j;
import p001A0.AbstractC0040p;

/* JADX INFO: renamed from: N.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0256g extends AbstractC0040p {

    /* JADX INFO: renamed from: a */
    public final C0255f f540a;

    public C0256g(TextView textView) {
        this.f540a = new C0255f(textView);
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: D */
    public final boolean mo121D() {
        return this.f540a.f539c;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: Q */
    public final void mo127Q(boolean z2) {
        if (!(C0485j.f1354k != null)) {
            return;
        }
        this.f540a.mo127Q(z2);
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: R */
    public final void mo128R(boolean z2) {
        boolean z3 = !(C0485j.f1354k != null);
        C0255f c0255f = this.f540a;
        if (z3) {
            c0255f.f539c = z2;
        } else {
            c0255f.mo128R(z2);
        }
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: f0 */
    public final TransformationMethod mo132f0(TransformationMethod transformationMethod) {
        return (C0485j.f1354k != null) ^ true ? transformationMethod : this.f540a.mo132f0(transformationMethod);
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: w */
    public final InputFilter[] mo135w(InputFilter[] inputFilterArr) {
        return (C0485j.f1354k != null) ^ true ? inputFilterArr : this.f540a.mo135w(inputFilterArr);
    }
}
