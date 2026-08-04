package yyds;

import java.io.File;

/* JADX INFO: renamed from: yyds.ᛸᛳᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1739 implements InterfaceC0894 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C1739 f8787 = new C1739(0);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8788;

    public /* synthetic */ C1739(int i) {
        this.f8788 = i;
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final C1199 mo940(Object obj, int i, int i2, C0822 c0822) {
        switch (this.f8788) {
            case 0:
                return new C1199(new C1818(obj), new C2224(1, obj));
            case 1:
                File file = (File) obj;
                return new C1199(new C1818(file), new C2224(0, file));
            default:
                return null;
        }
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo941(Object obj) {
        switch (this.f8788) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }
}
