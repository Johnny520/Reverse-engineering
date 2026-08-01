package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mb implements defpackage.ld {
    public static final defpackage.mb a = null;

    static {
            mb r0 = new mb
            r0.<init>()
            defpackage.mb.a = r0
            return
    }

    @Override // defpackage.ld
    public final defpackage.ge d() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This continuation is already complete"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.ld
    public final void f(java.lang.Object r2) {
            r1 = this;
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "This continuation is already complete"
            r2.<init>(r0)
            throw r2
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "This continuation is already complete"
            return r0
    }
}
