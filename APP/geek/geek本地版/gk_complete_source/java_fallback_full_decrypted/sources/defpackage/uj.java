package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uj extends defpackage.o10 {
    public final java.util.HashMap e;

    public uj() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.e = r0
            return
    }

    @Override // defpackage.o10
    public final defpackage.l10 a(java.lang.Object r2) {
            r1 = this;
            java.util.HashMap r0 = r1.e
            java.lang.Object r2 = r0.get(r2)
            l10 r2 = (defpackage.l10) r2
            return r2
    }

    @Override // defpackage.o10
    public final java.lang.Object b(java.lang.Object r3) {
            r2 = this;
            java.lang.Object r0 = super.b(r3)
            java.util.HashMap r1 = r2.e
            r1.remove(r3)
            return r0
    }
}
