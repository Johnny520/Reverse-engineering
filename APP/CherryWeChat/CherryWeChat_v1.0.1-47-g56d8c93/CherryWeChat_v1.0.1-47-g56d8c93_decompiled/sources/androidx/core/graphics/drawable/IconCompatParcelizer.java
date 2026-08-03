package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p000.AbstractC0702QD;
import p000.C0744RD;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0702QD abstractC0702QD) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3918a = abstractC0702QD.m1442f(iconCompat.f3918a, 1);
        byte[] bArr = iconCompat.f3920c;
        if (abstractC0702QD.mo1441e(2)) {
            Parcel parcel = ((C0744RD) abstractC0702QD).f2375e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f3920c = bArr;
        iconCompat.f3921d = abstractC0702QD.m1443g(iconCompat.f3921d, 3);
        iconCompat.f3922e = abstractC0702QD.m1442f(iconCompat.f3922e, 4);
        iconCompat.f3923f = abstractC0702QD.m1442f(iconCompat.f3923f, 5);
        iconCompat.f3924g = (ColorStateList) abstractC0702QD.m1443g(iconCompat.f3924g, 6);
        String string = iconCompat.f3926i;
        if (abstractC0702QD.mo1441e(7)) {
            string = ((C0744RD) abstractC0702QD).f2375e.readString();
        }
        iconCompat.f3926i = string;
        String string2 = iconCompat.f3927j;
        if (abstractC0702QD.mo1441e(8)) {
            string2 = ((C0744RD) abstractC0702QD).f2375e.readString();
        }
        iconCompat.f3927j = string2;
        iconCompat.f3925h = PorterDuff.Mode.valueOf(iconCompat.f3926i);
        switch (iconCompat.f3918a) {
            case -1:
                Parcelable parcelable = iconCompat.f3921d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f3919b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f3921d;
                if (parcelable2 != null) {
                    iconCompat.f3919b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f3920c;
                iconCompat.f3919b = bArr3;
                iconCompat.f3918a = 3;
                iconCompat.f3922e = 0;
                iconCompat.f3923f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f3920c, Charset.forName("UTF-16"));
                iconCompat.f3919b = str;
                if (iconCompat.f3918a == 2 && iconCompat.f3927j == null) {
                    iconCompat.f3927j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f3919b = iconCompat.f3920c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0702QD abstractC0702QD) {
        abstractC0702QD.getClass();
        iconCompat.f3926i = iconCompat.f3925h.name();
        switch (iconCompat.f3918a) {
            case -1:
                iconCompat.f3921d = (Parcelable) iconCompat.f3919b;
                break;
            case 1:
            case 5:
                iconCompat.f3921d = (Parcelable) iconCompat.f3919b;
                break;
            case 2:
                iconCompat.f3920c = ((String) iconCompat.f3919b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f3920c = (byte[]) iconCompat.f3919b;
                break;
            case 4:
            case 6:
                iconCompat.f3920c = iconCompat.f3919b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f3918a;
        if (-1 != i) {
            abstractC0702QD.m1446j(i, 1);
        }
        byte[] bArr = iconCompat.f3920c;
        if (bArr != null) {
            abstractC0702QD.mo1445i(2);
            Parcel parcel = ((C0744RD) abstractC0702QD).f2375e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f3921d;
        if (parcelable != null) {
            abstractC0702QD.m1447k(parcelable, 3);
        }
        int i2 = iconCompat.f3922e;
        if (i2 != 0) {
            abstractC0702QD.m1446j(i2, 4);
        }
        int i3 = iconCompat.f3923f;
        if (i3 != 0) {
            abstractC0702QD.m1446j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f3924g;
        if (colorStateList != null) {
            abstractC0702QD.m1447k(colorStateList, 6);
        }
        String str = iconCompat.f3926i;
        if (str != null) {
            abstractC0702QD.mo1445i(7);
            ((C0744RD) abstractC0702QD).f2375e.writeString(str);
        }
        String str2 = iconCompat.f3927j;
        if (str2 != null) {
            abstractC0702QD.mo1445i(8);
            ((C0744RD) abstractC0702QD).f2375e.writeString(str2);
        }
    }
}
