package yyds;

/* JADX INFO: renamed from: yyds.ᛲᲈᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0500 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public EnumC1464 f2437;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public InterfaceC0657 f2438;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1349(InterfaceC2345 interfaceC2345, EnumC0637 enumC0637) {
        EnumC1464 enumC1464M1528 = enumC0637.m1528();
        EnumC1464 enumC1464 = this.f2437;
        if (enumC1464M1528.compareTo(enumC1464) < 0) {
            enumC1464 = enumC1464M1528;
        }
        this.f2437 = enumC1464;
        this.f2438.mo20(interfaceC2345, enumC0637);
        this.f2437 = enumC1464M1528;
    }
}
