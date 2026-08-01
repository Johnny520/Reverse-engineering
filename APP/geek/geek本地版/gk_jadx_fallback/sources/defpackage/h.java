package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements defpackage.ee {
    public final defpackage.fe a;

    public h(defpackage.fe r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.ge
    public defpackage.ee b(defpackage.fe r2) {
            r1 = this;
            java.lang.String r0 = "key"
            defpackage.ip.o(r0, r2)
            fe r0 = r1.getKey()
            boolean r2 = defpackage.ip.i(r0, r2)
            if (r2 == 0) goto L10
            return r1
        L10:
            r2 = 0
            return r2
    }

    @Override // defpackage.ge
    public defpackage.ge g(defpackage.fe r1) {
            r0 = this;
            ge r1 = defpackage.ff.B(r0, r1)
            return r1
    }

    @Override // defpackage.ee
    public final defpackage.fe getKey() {
            r1 = this;
            fe r0 = r1.a
            return r0
    }

    @Override // defpackage.ge
    public final java.lang.Object h(java.lang.Object r1, defpackage.wm r2) {
            r0 = this;
            java.lang.Object r1 = r2.e(r1, r0)
            return r1
    }

    @Override // defpackage.ge
    public final defpackage.ge i(defpackage.ge r1) {
            r0 = this;
            ge r1 = defpackage.ff.E(r0, r1)
            return r1
    }
}
