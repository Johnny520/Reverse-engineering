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

    public C0256g(TextView r2) {
        this.f540a = new C0255f(r2);
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: D */
    public final boolean mo121D() {
        return this.f540a.f539c;
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: Q */
    public final void mo127Q(boolean r3) {
        if (C0485j.f1354k == null) goto L5;
        boolean r02 = true;
    L7:
        if ((!r02) == false) goto L9;
        return;
    L9:
        this.f540a.mo127Q(r3);
        return;
    L5:
        r02 = false;
        goto L7
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: R */
    public final void mo128R(boolean r3) {
        if (C0485j.f1354k == null) goto L5;
        boolean r02 = true;
    L6:
        boolean r03 = !r02;
        C0255f r1 = this.f540a;
        if (r03 == false) goto L9;
        r1.f539c = r3;
        return;
    L9:
        r1.mo128R(r3);
        return;
    L5:
        r02 = false;
        goto L6
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: f0 */
    public final TransformationMethod mo132f0(TransformationMethod r3) {
        if (C0485j.f1354k == null) goto L5;
        boolean r02 = true;
    L7:
        if ((!r02) == false) goto L10;
        return r3;
    L10:
        return this.f540a.mo132f0(r3);
    L5:
        r02 = false;
        goto L7
    }

    @Override // p001A0.AbstractC0040p
    /* JADX INFO: renamed from: w */
    public final InputFilter[] mo135w(InputFilter[] r3) {
        if (C0485j.f1354k == null) goto L5;
        boolean r02 = true;
    L7:
        if ((!r02) == false) goto L10;
        return r3;
    L10:
        return this.f540a.mo135w(r3);
    L5:
        r02 = false;
        goto L7
    }
}
