package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p047a0.AbstractC0471a;
import p047a0.C0472b;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0471a abstractC0471a) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f1304a;
        if (abstractC0471a.mo1106e(1)) {
            i2 = ((C0472b) abstractC0471a).f1054e.readInt();
        }
        iconCompat.f1304a = i2;
        byte[] bArr = iconCompat.f1306c;
        if (abstractC0471a.mo1106e(2)) {
            Parcel parcel = ((C0472b) abstractC0471a).f1054e;
            int i3 = parcel.readInt();
            if (i3 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i3];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1306c = bArr;
        iconCompat.f1307d = abstractC0471a.m1107f(iconCompat.f1307d, 3);
        int i4 = iconCompat.f1308e;
        if (abstractC0471a.mo1106e(4)) {
            i4 = ((C0472b) abstractC0471a).f1054e.readInt();
        }
        iconCompat.f1308e = i4;
        int i5 = iconCompat.f1309f;
        if (abstractC0471a.mo1106e(5)) {
            i5 = ((C0472b) abstractC0471a).f1054e.readInt();
        }
        iconCompat.f1309f = i5;
        iconCompat.f1310g = (ColorStateList) abstractC0471a.m1107f(iconCompat.f1310g, 6);
        String string = iconCompat.f1312i;
        if (abstractC0471a.mo1106e(7)) {
            string = ((C0472b) abstractC0471a).f1054e.readString();
        }
        iconCompat.f1312i = string;
        String string2 = iconCompat.f1313j;
        if (abstractC0471a.mo1106e(8)) {
            string2 = ((C0472b) abstractC0471a).f1054e.readString();
        }
        iconCompat.f1313j = string2;
        iconCompat.f1311h = PorterDuff.Mode.valueOf(iconCompat.f1312i);
        switch (iconCompat.f1304a) {
            case -1:
                Parcelable parcelable = iconCompat.f1307d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1305b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1307d;
                if (parcelable2 != null) {
                    iconCompat.f1305b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1306c;
                    iconCompat.f1305b = bArr3;
                    iconCompat.f1304a = 3;
                    iconCompat.f1308e = 0;
                    iconCompat.f1309f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f1306c, Charset.forName("UTF-16"));
                iconCompat.f1305b = str;
                if (iconCompat.f1304a == 2 && iconCompat.f1313j == null) {
                    iconCompat.f1313j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1305b = iconCompat.f1306c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0471a abstractC0471a) {
        abstractC0471a.getClass();
        iconCompat.f1312i = iconCompat.f1311h.name();
        switch (iconCompat.f1304a) {
            case -1:
                iconCompat.f1307d = (Parcelable) iconCompat.f1305b;
                break;
            case 1:
            case 5:
                iconCompat.f1307d = (Parcelable) iconCompat.f1305b;
                break;
            case 2:
                iconCompat.f1306c = ((String) iconCompat.f1305b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1306c = (byte[]) iconCompat.f1305b;
                break;
            case 4:
            case 6:
                iconCompat.f1306c = iconCompat.f1305b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f1304a;
        if (-1 != i2) {
            abstractC0471a.mo1109h(1);
            ((C0472b) abstractC0471a).f1054e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f1306c;
        if (bArr != null) {
            abstractC0471a.mo1109h(2);
            int length = bArr.length;
            Parcel parcel = ((C0472b) abstractC0471a).f1054e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1307d;
        if (parcelable != null) {
            abstractC0471a.mo1109h(3);
            ((C0472b) abstractC0471a).f1054e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f1308e;
        if (i3 != 0) {
            abstractC0471a.mo1109h(4);
            ((C0472b) abstractC0471a).f1054e.writeInt(i3);
        }
        int i4 = iconCompat.f1309f;
        if (i4 != 0) {
            abstractC0471a.mo1109h(5);
            ((C0472b) abstractC0471a).f1054e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f1310g;
        if (colorStateList != null) {
            abstractC0471a.mo1109h(6);
            ((C0472b) abstractC0471a).f1054e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1312i;
        if (str != null) {
            abstractC0471a.mo1109h(7);
            ((C0472b) abstractC0471a).f1054e.writeString(str);
        }
        String str2 = iconCompat.f1313j;
        if (str2 != null) {
            abstractC0471a.mo1109h(8);
            ((C0472b) abstractC0471a).f1054e.writeString(str2);
        }
    }
}
