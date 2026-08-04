package yyds;

/* JADX INFO: renamed from: yyds.ᛵᲁᛸᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1206 extends AbstractC0428 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C1206 f5492;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public ExecutorC0400 f5493;

    static {
        int i = AbstractC2546.f12551;
        int i2 = AbstractC2546.f12553;
        long j = AbstractC2546.f12548;
        String str = AbstractC2546.f12549;
        C1206 c1206 = new C1206();
        c1206.f5493 = new ExecutorC0400(j, str, i, i2);
        f5492 = c1206;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // yyds.AbstractC0974
    public final String toString() {
        return "Dispatchers.Default";
    }

    @Override // yyds.AbstractC0974
    /* JADX INFO: renamed from: ᛷᲇᛲᛱ */
    public final void mo1251(InterfaceC2213 interfaceC2213, Runnable runnable) {
        this.f5493.m1161(runnable, false);
    }
}
