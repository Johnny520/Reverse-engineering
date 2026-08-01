package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p80 implements defpackage.ee, defpackage.fe {
    public static final defpackage.p80 a = null;

    static {
            p80 r0 = new p80
            r0.<init>()
            defpackage.p80.a = r0
            return
    }

    @Override // defpackage.ge
    public final defpackage.ee b(defpackage.fe r2) {
            r1 = this;
            java.lang.String r0 = "key"
            defpackage.ip.o(r0, r2)
            boolean r2 = defpackage.ip.i(r1, r2)
            if (r2 == 0) goto Lc
            return r1
        Lc:
            r2 = 0
            return r2
    }

    @Override // defpackage.ge
    public final defpackage.ge g(defpackage.fe r1) {
            r0 = this;
            ge r1 = defpackage.ff.B(r0, r1)
            return r1
    }

    @Override // defpackage.ee
    public final defpackage.fe getKey() {
            r0 = this;
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
