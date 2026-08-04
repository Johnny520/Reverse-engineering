package yyds;

/* JADX INFO: renamed from: yyds.ᛵᲀᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1191 extends RuntimeException {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f5459;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Throwable f5460;

    public C1191(int i, Throwable th) {
        super(th);
        this.f5459 = i;
        this.f5460 = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f5460;
    }
}
