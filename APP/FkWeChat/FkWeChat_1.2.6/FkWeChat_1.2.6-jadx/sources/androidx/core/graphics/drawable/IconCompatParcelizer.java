package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import p253r4.AbstractC6484a;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC6484a abstractC6484a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1836a = abstractC6484a.m25715p(iconCompat.f1836a, 1);
        iconCompat.f1838c = abstractC6484a.m25709j(iconCompat.f1838c, 2);
        iconCompat.f1839d = abstractC6484a.m25717r(iconCompat.f1839d, 3);
        iconCompat.f1840e = abstractC6484a.m25715p(iconCompat.f1840e, 4);
        iconCompat.f1841f = abstractC6484a.m25715p(iconCompat.f1841f, 5);
        iconCompat.f1842g = (ColorStateList) abstractC6484a.m25717r(iconCompat.f1842g, 6);
        iconCompat.f1844i = abstractC6484a.m25719t(iconCompat.f1844i, 7);
        iconCompat.f1845j = abstractC6484a.m25719t(iconCompat.f1845j, 8);
        iconCompat.m2485b();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC6484a abstractC6484a) {
        abstractC6484a.m25723x(true, true);
        iconCompat.m2486c(abstractC6484a.m25705f());
        int i10 = iconCompat.f1836a;
        if (-1 != i10) {
            abstractC6484a.m25691F(i10, 1);
        }
        byte[] bArr = iconCompat.f1838c;
        if (bArr != null) {
            abstractC6484a.m25687B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1839d;
        if (parcelable != null) {
            abstractC6484a.m25693H(parcelable, 3);
        }
        int i11 = iconCompat.f1840e;
        if (i11 != 0) {
            abstractC6484a.m25691F(i11, 4);
        }
        int i12 = iconCompat.f1841f;
        if (i12 != 0) {
            abstractC6484a.m25691F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f1842g;
        if (colorStateList != null) {
            abstractC6484a.m25693H(colorStateList, 6);
        }
        String str = iconCompat.f1844i;
        if (str != null) {
            abstractC6484a.m25695J(str, 7);
        }
        String str2 = iconCompat.f1845j;
        if (str2 != null) {
            abstractC6484a.m25695J(str2, 8);
        }
    }
}
