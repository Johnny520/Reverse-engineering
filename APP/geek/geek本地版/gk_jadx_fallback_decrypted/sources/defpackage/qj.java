package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qj extends defpackage.m {
    public final defpackage.h9 b;

    public qj() {
            r2 = this;
            r2.<init>()
            h9 r0 = new h9
            r1 = 1
            r0.<init>(r1)
            r2.b = r0
            return
    }

    @Override // defpackage.m
    public final java.util.Random d() {
            r2 = this;
            h9 r0 = r2.b
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = "get(...)"
            defpackage.ip.n(r1, r0)
            java.util.Random r0 = (java.util.Random) r0
            return r0
    }
}
