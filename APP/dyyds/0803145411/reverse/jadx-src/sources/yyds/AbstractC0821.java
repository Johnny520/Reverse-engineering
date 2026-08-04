package yyds;

import android.view.WindowInsets;

/* JADX INFO: renamed from: yyds.ᛴᛳᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0821 extends AbstractC1976 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final WindowInsets.Builder f3757;

    public AbstractC0821(C2693 c2693) {
        super(c2693);
        WindowInsets windowInsetsM4784 = c2693.m4784();
        this.f3757 = windowInsetsM4784 != null ? new WindowInsets.Builder(windowInsetsM4784) : new WindowInsets.Builder();
    }

    @Override // yyds.AbstractC1976
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public C2693 mo1889() {
        m3808();
        C2693 c2693M4783 = C2693.m4783(null, this.f3757.build());
        C2610 c2610 = c2693M4783.f13242;
        c2610.mo4547(null);
        c2610.mo4548(null);
        c2610.mo4550(this.f9906);
        c2610.mo4549(this.f9907);
        return c2693M4783;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public void m1890(C1870 c1870) {
        this.f3757.setSystemWindowInsets(c1870.m3656());
    }

    public AbstractC0821() {
        this.f3757 = new WindowInsets.Builder();
    }
}
