package yyds;

/* JADX INFO: renamed from: yyds.ᛴᛵᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0850 implements InterfaceC1212 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f3912;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0574 f3913;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String f3914;

    public AbstractC0850(C0574 c0574, String str) {
        this.f3913 = c0574;
        this.f3914 = str;
    }

    @Override // yyds.InterfaceC1212
    public void reset() {
        m1931();
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public void mo431() {
        m1931();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1931() {
        if (this.f3912) {
            AbstractC2328.m4346(21, "statement is closed");
            throw null;
        }
    }
}
