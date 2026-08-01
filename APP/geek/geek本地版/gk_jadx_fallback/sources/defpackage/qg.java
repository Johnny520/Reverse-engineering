package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qg extends defpackage.ip {
    public final /* synthetic */ defpackage.kl C;
    public final /* synthetic */ defpackage.rg D;

    public qg(defpackage.rg r1, defpackage.kl r2) {
            r0 = this;
            r0.<init>()
            r0.D = r1
            r0.C = r2
            return
    }

    @Override // defpackage.ip
    public final android.view.View G(int r3) {
            r2 = this;
            kl r0 = r2.C
            boolean r1 = r0.H()
            if (r1 == 0) goto Ld
            android.view.View r3 = r0.G(r3)
            return r3
        Ld:
            rg r0 = r2.D
            android.app.Dialog r0 = r0.a0
            if (r0 == 0) goto L18
            android.view.View r3 = r0.findViewById(r3)
            return r3
        L18:
            r3 = 0
            return r3
    }

    @Override // defpackage.ip
    public final boolean H() {
            r1 = this;
            kl r0 = r1.C
            boolean r0 = r0.H()
            if (r0 != 0) goto L11
            rg r0 = r1.D
            boolean r0 = r0.d0
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            return r0
        L11:
            r0 = 1
            return r0
    }
}
