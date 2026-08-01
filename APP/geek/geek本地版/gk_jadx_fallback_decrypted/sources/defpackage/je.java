package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class je implements defpackage.fe {
    public final defpackage.cq a;
    public final defpackage.fe b;

    public je(defpackage.fe r2, defpackage.sm r3) {
            r1 = this;
            java.lang.String r0 = "baseKey"
            defpackage.ip.o(r0, r2)
            r1.<init>()
            cq r3 = (defpackage.cq) r3
            r1.a = r3
            boolean r3 = r2 instanceof defpackage.je
            if (r3 == 0) goto L14
            je r2 = (defpackage.je) r2
            fe r2 = r2.b
        L14:
            r1.b = r2
            return
    }
}
