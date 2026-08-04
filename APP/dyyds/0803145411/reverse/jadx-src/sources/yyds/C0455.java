package yyds;

import java.io.File;

/* JADX INFO: renamed from: yyds.ᛲᲁᛴᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0455 implements InterfaceC0894 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2298;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f2299;

    public /* synthetic */ C0455(int i, Object obj) {
        this.f2298 = i;
        this.f2299 = obj;
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final C1199 mo940(Object obj, int i, int i2, C0822 c0822) {
        int i3 = this.f2298;
        Object obj2 = this.f2299;
        switch (i3) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C1199(new C1818(bArr), new C0887(bArr, 1, (InterfaceC2504) obj2));
            case 1:
                return new C1199(new C1818(obj), new C0887(obj.toString(), (C1985) obj2));
            default:
                File file = (File) obj;
                return new C1199(new C1818(file), new C1545(file, (InterfaceC0790) obj2, 0));
        }
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo941(Object obj) {
        switch (this.f2298) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }
}
