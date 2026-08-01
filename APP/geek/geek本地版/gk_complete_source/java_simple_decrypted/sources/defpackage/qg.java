package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class qg extends ip {
    public final /* synthetic */ kl C;
    public final /* synthetic */ rg D;

    public qg(rg r1, kl r2) {
        this.D = r1;
        this.C = r2;
    }

    @Override // defpackage.ip
    public final View G(int r3) {
        kl r0 = this.C;
        if (r0.H() == true) goto L5;
        Dialog r02 = this.D.a0;
        if (r02 != null) goto L9;
        return null;
    L9:
        return r02.findViewById(r3);
    L5:
        return r0.G(r3);
    }

    @Override // defpackage.ip
    public final boolean H() {
        if (this.C.H() == false) goto L5;
        return true;
    L5:
        if (this.D.d0 == true) goto L11;
        return false;
    L11:
        return true;
    }
}
