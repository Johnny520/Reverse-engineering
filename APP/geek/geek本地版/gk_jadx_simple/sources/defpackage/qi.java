package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class qi extends a80 {
    public final pi w;

    public qi(TextView r2) {
        this.w = new pi(r2);
    }

    @Override // defpackage.a80
    public final void C(boolean r2) {
        if (ei.j == null) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L8;
        return;
    L8:
        this.w.C(r2);
        return;
    L5:
        r0 = false;
        goto L6
    }

    @Override // defpackage.a80
    public final void D(boolean r3) {
        pi r0 = this.w;
        if (ei.j == null) goto L5;
        boolean r1 = true;
    L6:
        if (r1 == true) goto L9;
        r0.y = r3;
        return;
    L9:
        r0.D(r3);
        return;
    L5:
        r1 = false;
        goto L6
    }

    @Override // defpackage.a80
    public final InputFilter[] l(InputFilter[] r2) {
        if (ei.j == null) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == true) goto L9;
        return r2;
    L9:
        return this.w.l(r2);
    L5:
        r0 = false;
        goto L6
    }
}
