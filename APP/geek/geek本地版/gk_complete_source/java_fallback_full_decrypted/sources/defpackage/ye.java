package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ye extends defpackage.fj {
    public final /* synthetic */ int e;

    public /* synthetic */ ye(defpackage.ej r1, int r2) {
            r0 = this;
            r0.e = r2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.fj
    public void q() {
            r2 = this;
            int r0 = r2.e
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            ej r0 = r2.b
            r1 = 0
            r0.o = r1
            com.google.android.material.internal.CheckableImageButton r0 = r0.g
            r0.setOnLongClickListener(r1)
            defpackage.ff.M(r0, r1)
            return
    }
}
