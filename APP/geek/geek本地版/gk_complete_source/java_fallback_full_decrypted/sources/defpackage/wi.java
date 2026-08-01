package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wi implements defpackage.ge, java.io.Serializable {
    public static final defpackage.wi a = null;

    static {
            wi r0 = new wi
            r0.<init>()
            defpackage.wi.a = r0
            return
    }

    @Override // defpackage.ge
    public final defpackage.ee b(defpackage.fe r2) {
            r1 = this;
            java.lang.String r0 = "key"
            defpackage.ip.o(r0, r2)
            r2 = 0
            return r2
    }

    @Override // defpackage.ge
    public final defpackage.ge g(defpackage.fe r2) {
            r1 = this;
            java.lang.String r0 = "key"
            defpackage.ip.o(r0, r2)
            return r1
    }

    @Override // defpackage.ge
    public final java.lang.Object h(java.lang.Object r1, defpackage.wm r2) {
            r0 = this;
            return r1
    }

    public final int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.ge
    public final defpackage.ge i(defpackage.ge r2) {
            r1 = this;
            java.lang.String r0 = "context"
            defpackage.ip.o(r0, r2)
            return r2
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "EmptyCoroutineContext"
            return r0
    }
}
