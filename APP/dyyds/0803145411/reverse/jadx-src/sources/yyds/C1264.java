package yyds;

/* JADX INFO: renamed from: yyds.ᛶᛱᛵᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1264 implements InterfaceC2162, InterfaceC2054 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C0644 f5822 = AbstractC2217.m4205(20, new C0135(20));

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f5823;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1202 f5824 = new C1202();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f5825;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public InterfaceC2162 f5826;

    @Override // yyds.InterfaceC2162
    public final Object get() {
        return this.f5826.get();
    }

    @Override // yyds.InterfaceC2162
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final synchronized void mo1177() {
        this.f5824.m2395();
        this.f5825 = true;
        if (!this.f5823) {
            this.f5826.mo1177();
            this.f5826 = null;
            f5822.mo1557(this);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final synchronized void m2539() {
        this.f5824.m2395();
        if (!this.f5823) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f5823 = false;
        if (this.f5825) {
            mo1177();
        }
    }

    @Override // yyds.InterfaceC2162
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final int mo1178() {
        return this.f5826.mo1178();
    }

    @Override // yyds.InterfaceC2054
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1202 mo2540() {
        return this.f5824;
    }

    @Override // yyds.InterfaceC2162
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final Class mo1179() {
        return this.f5826.mo1179();
    }
}
