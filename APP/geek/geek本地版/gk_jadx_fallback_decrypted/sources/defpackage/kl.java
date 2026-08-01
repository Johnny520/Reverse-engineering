package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kl extends defpackage.ip {
    public final /* synthetic */ defpackage.ml C;

    public kl(defpackage.ml r1) {
            r0 = this;
            r0.<init>()
            r0.C = r1
            return
    }

    @Override // defpackage.ip
    public final android.view.View G(int r4) {
            r3 = this;
            ml r0 = r3.C
            android.view.View r1 = r0.E
            if (r1 == 0) goto Lb
            android.view.View r4 = r1.findViewById(r4)
            return r4
        Lb:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " does not have a view"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
    }

    @Override // defpackage.ip
    public final boolean H() {
            r1 = this;
            ml r0 = r1.C
            android.view.View r0 = r0.E
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
