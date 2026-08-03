package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p000a.AbstractC0695lg;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0695lg abstractC0695lg) {
        IconCompat iconCompat = new IconCompat();
        int iMo1572i = iconCompat.f4436a;
        if (abstractC0695lg.mo1571h(1)) {
            iMo1572i = abstractC0695lg.mo1572i();
        }
        iconCompat.f4436a = iMo1572i;
        byte[] bArrMo1569f = iconCompat.f4438c;
        if (abstractC0695lg.mo1571h(2)) {
            bArrMo1569f = abstractC0695lg.mo1569f();
        }
        iconCompat.f4438c = bArrMo1569f;
        Parcelable parcelableMo1573j = iconCompat.f4439d;
        if (abstractC0695lg.mo1571h(3)) {
            parcelableMo1573j = abstractC0695lg.mo1573j();
        }
        iconCompat.f4439d = parcelableMo1573j;
        int iMo1572i2 = iconCompat.f4440e;
        if (abstractC0695lg.mo1571h(4)) {
            iMo1572i2 = abstractC0695lg.mo1572i();
        }
        iconCompat.f4440e = iMo1572i2;
        int iMo1572i3 = iconCompat.f4441f;
        if (abstractC0695lg.mo1571h(5)) {
            iMo1572i3 = abstractC0695lg.mo1572i();
        }
        iconCompat.f4441f = iMo1572i3;
        Parcelable parcelableMo1573j2 = iconCompat.f4442g;
        if (abstractC0695lg.mo1571h(6)) {
            parcelableMo1573j2 = abstractC0695lg.mo1573j();
        }
        iconCompat.f4442g = (ColorStateList) parcelableMo1573j2;
        String strMo1574k = iconCompat.f4444i;
        if (abstractC0695lg.mo1571h(7)) {
            strMo1574k = abstractC0695lg.mo1574k();
        }
        iconCompat.f4444i = strMo1574k;
        String strMo1574k2 = iconCompat.f4445j;
        if (abstractC0695lg.mo1571h(8)) {
            strMo1574k2 = abstractC0695lg.mo1574k();
        }
        iconCompat.f4445j = strMo1574k2;
        iconCompat.f4443h = PorterDuff.Mode.valueOf(iconCompat.f4444i);
        switch (iconCompat.f4436a) {
            case -1:
                Parcelable parcelable = iconCompat.f4439d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f4437b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f4439d;
                if (parcelable2 != null) {
                    iconCompat.f4437b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr = iconCompat.f4438c;
                iconCompat.f4437b = bArr;
                iconCompat.f4436a = 3;
                iconCompat.f4440e = 0;
                iconCompat.f4441f = bArr.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f4438c, Charset.forName("UTF-16"));
                iconCompat.f4437b = str;
                if (iconCompat.f4436a == 2 && iconCompat.f4445j == null) {
                    iconCompat.f4445j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f4437b = iconCompat.f4438c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0695lg abstractC0695lg) {
        abstractC0695lg.getClass();
        iconCompat.f4444i = iconCompat.f4443h.name();
        switch (iconCompat.f4436a) {
            case -1:
                iconCompat.f4439d = (Parcelable) iconCompat.f4437b;
                break;
            case 1:
            case 5:
                iconCompat.f4439d = (Parcelable) iconCompat.f4437b;
                break;
            case 2:
                iconCompat.f4438c = ((String) iconCompat.f4437b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f4438c = (byte[]) iconCompat.f4437b;
                break;
            case 4:
            case 6:
                iconCompat.f4438c = iconCompat.f4437b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f4436a;
        if (-1 != i) {
            abstractC0695lg.mo1576m(1);
            abstractC0695lg.mo1580q(i);
        }
        byte[] bArr = iconCompat.f4438c;
        if (bArr != null) {
            abstractC0695lg.mo1576m(2);
            abstractC0695lg.mo1578o(bArr);
        }
        Parcelable parcelable = iconCompat.f4439d;
        if (parcelable != null) {
            abstractC0695lg.mo1576m(3);
            abstractC0695lg.mo1581r(parcelable);
        }
        int i2 = iconCompat.f4440e;
        if (i2 != 0) {
            abstractC0695lg.mo1576m(4);
            abstractC0695lg.mo1580q(i2);
        }
        int i3 = iconCompat.f4441f;
        if (i3 != 0) {
            abstractC0695lg.mo1576m(5);
            abstractC0695lg.mo1580q(i3);
        }
        ColorStateList colorStateList = iconCompat.f4442g;
        if (colorStateList != null) {
            abstractC0695lg.mo1576m(6);
            abstractC0695lg.mo1581r(colorStateList);
        }
        String str = iconCompat.f4444i;
        if (str != null) {
            abstractC0695lg.mo1576m(7);
            abstractC0695lg.mo1582s(str);
        }
        String str2 = iconCompat.f4445j;
        if (str2 != null) {
            abstractC0695lg.mo1576m(8);
            abstractC0695lg.mo1582s(str2);
        }
    }
}
