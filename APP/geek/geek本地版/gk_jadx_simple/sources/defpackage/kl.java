package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class kl extends ip {
    public final /* synthetic */ ml C;

    public kl(ml r1) {
        this.C = r1;
    }

    @Override // defpackage.ip
    public final View G(int r4) {
        ml r0 = this.C;
        View r1 = r0.E;
        if (r1 == null) goto L7;
        return r1.findViewById(r4);
    L7:
        throw new IllegalStateException("Fragment " + r0 + " does not have a view");
    }

    @Override // defpackage.ip
    public final boolean H() {
        if (this.C.E == null) goto L6;
        return true;
    L6:
        return false;
    }
}
