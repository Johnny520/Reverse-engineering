package yyds;

import android.text.TextUtils;

/* JADX INFO: renamed from: yyds.ᲀᲇᲇᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2120 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C0805 f10466 = new C0805(21);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object f10467;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC0132 f10468;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f10469;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public volatile byte[] f10470;

    public C2120(String str, Object obj, InterfaceC0132 interfaceC0132) {
        if (TextUtils.isEmpty(str)) {
            C0188.m798("Must not be null or empty");
            throw null;
        }
        this.f10469 = str;
        this.f10467 = obj;
        this.f10468 = interfaceC0132;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C2120 m4039(Object obj, String str) {
        return new C2120(str, obj, f10466);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2120) {
            return this.f10469.equals(((C2120) obj).f10469);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10469.hashCode();
    }

    public final String toString() {
        return AbstractC2104.m4015(new StringBuilder("Option{key='"), this.f10469, "'}");
    }
}
