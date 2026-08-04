package yyds;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: yyds.ᛲᛵᛷᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0349 implements InterfaceC0894 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Context f1813;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC0894 f1814;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC0894 f1815;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Class f1816;

    public C0349(Context context, InterfaceC0894 interfaceC0894, InterfaceC0894 interfaceC08942, Class cls) {
        this.f1813 = context.getApplicationContext();
        this.f1814 = interfaceC0894;
        this.f1815 = interfaceC08942;
        this.f1816 = cls;
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final C1199 mo940(Object obj, int i, int i2, C0822 c0822) {
        Uri uri = (Uri) obj;
        return new C1199(new C1818(uri), new C1675(this.f1813, this.f1814, this.f1815, uri, i, i2, c0822, this.f1816));
    }

    @Override // yyds.InterfaceC0894
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo941(Object obj) {
        return AbstractC0598.m1481((Uri) obj);
    }
}
