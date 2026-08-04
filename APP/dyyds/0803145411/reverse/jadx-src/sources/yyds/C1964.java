package yyds;

/* JADX INFO: renamed from: yyds.ᲀᛳᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1964 extends C1135 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final Object f9859;

    public C1964(int i) {
        super(i);
        this.f9859 = new Object();
    }

    @Override // yyds.C1135, yyds.InterfaceC0942
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final Object mo1548() {
        Object objMo1548;
        synchronized (this.f9859) {
            objMo1548 = super.mo1548();
        }
        return objMo1548;
    }

    @Override // yyds.C1135, yyds.InterfaceC0942
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo1557(Object obj) {
        boolean zMo1557;
        synchronized (this.f9859) {
            zMo1557 = super.mo1557(obj);
        }
        return zMo1557;
    }
}
