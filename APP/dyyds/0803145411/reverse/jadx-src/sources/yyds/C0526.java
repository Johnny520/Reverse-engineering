package yyds;

import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛳᛱᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0526 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C1284 f2527;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1364(String str, byte[] bArr) throws C1185 {
        int length = bArr.length;
        AbstractC1429.m2917(bArr.length, 0L, length);
        C0610 c0610 = new C0610(null, length, bArr);
        String[] strArr = (String[]) new ArrayList(20).toArray(new String[0]);
        C1633 c1633 = new C1633();
        c1633.m3334(str);
        c1633.m3335("PUT", c0610);
        C2135 c2135 = new C2135(2);
        AbstractC1432.m2927(c2135.f10556, strArr);
        c1633.f8331 = c2135;
        C2098 c2098 = new C2098(c1633);
        C1284 c1284 = this.f2527;
        c1284.getClass();
        AbstractC0024.m3294(new C2729(c1284, c2098).m4863());
    }
}
