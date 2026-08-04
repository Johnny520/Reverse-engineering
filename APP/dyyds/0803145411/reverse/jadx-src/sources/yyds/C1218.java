package yyds;

/* JADX INFO: renamed from: yyds.ᛵᲇᛳᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1218 implements InterfaceC0230 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0292[] f5596;

    public C1218(C0292[] c0292Arr) {
        this.f5596 = c0292Arr;
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f5596 + ']';
    }

    @Override // yyds.InterfaceC0230
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo884(Throwable th) {
        m2477();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m2477() {
        for (C0292 c0292 : this.f5596) {
            InterfaceC0970 interfaceC0970 = c0292.f1555;
            if (interfaceC0970 == null) {
                interfaceC0970 = null;
            }
            interfaceC0970.mo1720();
        }
    }
}
