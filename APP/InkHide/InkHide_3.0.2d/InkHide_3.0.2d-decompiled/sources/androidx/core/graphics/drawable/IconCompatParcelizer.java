package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p032Q.AbstractC0238a;
import p032Q.C0239b;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0238a abstractC0238a) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f1123a;
        if (abstractC0238a.mo453e(1)) {
            i2 = ((C0239b) abstractC0238a).f576e.readInt();
        }
        iconCompat.f1123a = i2;
        byte[] bArr = iconCompat.f1125c;
        if (abstractC0238a.mo453e(2)) {
            Parcel parcel = ((C0239b) abstractC0238a).f576e;
            int i3 = parcel.readInt();
            if (i3 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i3];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1125c = bArr;
        iconCompat.f1126d = abstractC0238a.m454f(iconCompat.f1126d, 3);
        int i4 = iconCompat.f1127e;
        if (abstractC0238a.mo453e(4)) {
            i4 = ((C0239b) abstractC0238a).f576e.readInt();
        }
        iconCompat.f1127e = i4;
        int i5 = iconCompat.f1128f;
        if (abstractC0238a.mo453e(5)) {
            i5 = ((C0239b) abstractC0238a).f576e.readInt();
        }
        iconCompat.f1128f = i5;
        iconCompat.f1129g = (ColorStateList) abstractC0238a.m454f(iconCompat.f1129g, 6);
        String string = iconCompat.f1131i;
        if (abstractC0238a.mo453e(7)) {
            string = ((C0239b) abstractC0238a).f576e.readString();
        }
        iconCompat.f1131i = string;
        String string2 = iconCompat.f1132j;
        if (abstractC0238a.mo453e(8)) {
            string2 = ((C0239b) abstractC0238a).f576e.readString();
        }
        iconCompat.f1132j = string2;
        iconCompat.f1130h = PorterDuff.Mode.valueOf(iconCompat.f1131i);
        switch (iconCompat.f1123a) {
            case -1:
                Parcelable parcelable = iconCompat.f1126d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1124b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1126d;
                if (parcelable2 != null) {
                    iconCompat.f1124b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f1125c;
                iconCompat.f1124b = bArr3;
                iconCompat.f1123a = 3;
                iconCompat.f1127e = 0;
                iconCompat.f1128f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f1125c, Charset.forName("UTF-16"));
                iconCompat.f1124b = str;
                if (iconCompat.f1123a == 2 && iconCompat.f1132j == null) {
                    iconCompat.f1132j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1124b = iconCompat.f1125c;
                return iconCompat;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void write(IconCompat iconCompat, AbstractC0238a abstractC0238a) {
        abstractC0238a.getClass();
        iconCompat.f1131i = iconCompat.f1130h.name();
        switch (iconCompat.f1123a) {
            case -1:
                iconCompat.f1126d = (Parcelable) iconCompat.f1124b;
                break;
            case 1:
            case 5:
                iconCompat.f1126d = (Parcelable) iconCompat.f1124b;
                break;
            case 2:
                iconCompat.f1125c = ((String) iconCompat.f1124b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1125c = (byte[]) iconCompat.f1124b;
                break;
            case 4:
            case 6:
                iconCompat.f1125c = iconCompat.f1124b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f1123a;
        if (-1 != i2) {
            abstractC0238a.mo456h(1);
            ((C0239b) abstractC0238a).f576e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f1125c;
        if (bArr != null) {
            abstractC0238a.mo456h(2);
            int length = bArr.length;
            Parcel parcel = ((C0239b) abstractC0238a).f576e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1126d;
        if (parcelable != null) {
            abstractC0238a.mo456h(3);
            ((C0239b) abstractC0238a).f576e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f1127e;
        if (i3 != 0) {
            abstractC0238a.mo456h(4);
            ((C0239b) abstractC0238a).f576e.writeInt(i3);
        }
        int i4 = iconCompat.f1128f;
        if (i4 != 0) {
            abstractC0238a.mo456h(5);
            ((C0239b) abstractC0238a).f576e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f1129g;
        if (colorStateList != null) {
            abstractC0238a.mo456h(6);
            ((C0239b) abstractC0238a).f576e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1131i;
        if (str != null) {
            abstractC0238a.mo456h(7);
            ((C0239b) abstractC0238a).f576e.writeString(str);
        }
        String str2 = iconCompat.f1132j;
        if (str2 != null) {
            abstractC0238a.mo456h(8);
            ((C0239b) abstractC0238a).f576e.writeString(str2);
        }
    }
}
