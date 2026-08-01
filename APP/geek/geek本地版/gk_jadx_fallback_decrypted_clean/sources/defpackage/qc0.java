package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class qc0 extends defpackage.oc0 {
    public qc0(defpackage.wc0 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.tc0
    public defpackage.wc0 a() {
            r2 = this;
            android.view.WindowInsets r0 = r2.c
            android.view.WindowInsets r0 = defpackage.pc0.b(r0)
            r1 = 0
            wc0 r0 = defpackage.wc0.g(r1, r0)
            return r0
    }

    @Override // defpackage.tc0
    public defpackage.yg e() {
            r2 = this;
            android.view.WindowInsets r0 = r2.c
            android.view.DisplayCutout r0 = defpackage.pc0.a(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            yg r1 = new yg
            r1.<init>(r0)
            return r1
    }

    @Override // defpackage.nc0, defpackage.tc0
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.qc0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qc0 r5 = (defpackage.qc0) r5
            android.view.WindowInsets r1 = r4.c
            android.view.WindowInsets r3 = r5.c
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L21
            ep r1 = r4.g
            ep r5 = r5.g
            boolean r5 = java.util.Objects.equals(r1, r5)
            if (r5 == 0) goto L21
            return r0
        L21:
            return r2
    }

    @Override // defpackage.tc0
    public int hashCode() {
            r1 = this;
            android.view.WindowInsets r0 = r1.c
            int r0 = r0.hashCode()
            return r0
    }
}
