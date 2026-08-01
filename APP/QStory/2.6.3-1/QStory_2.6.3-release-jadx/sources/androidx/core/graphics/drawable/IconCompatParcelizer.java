package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p165.AbstractC8405;
import p165.C8404;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC8405 abstractC8405) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f6784;
        if (abstractC8405.mo13357(1)) {
            i = ((C8404) abstractC8405).f20844.readInt();
        }
        iconCompat.f6784 = i;
        byte[] bArr = iconCompat.f6782;
        if (abstractC8405.mo13357(2)) {
            Parcel parcel = ((C8404) abstractC8405).f20844;
            int i2 = parcel.readInt();
            if (i2 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i2];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f6782 = bArr;
        iconCompat.f6781 = abstractC8405.m13360(iconCompat.f6781, 3);
        int i3 = iconCompat.f6780;
        if (abstractC8405.mo13357(4)) {
            i3 = ((C8404) abstractC8405).f20844.readInt();
        }
        iconCompat.f6780 = i3;
        int i4 = iconCompat.f6779;
        if (abstractC8405.mo13357(5)) {
            i4 = ((C8404) abstractC8405).f20844.readInt();
        }
        iconCompat.f6779 = i4;
        iconCompat.f6786 = (ColorStateList) abstractC8405.m13360(iconCompat.f6786, 6);
        String string = iconCompat.f6787;
        if (abstractC8405.mo13357(7)) {
            string = ((C8404) abstractC8405).f20844.readString();
        }
        iconCompat.f6787 = string;
        String string2 = iconCompat.f6788;
        if (abstractC8405.mo13357(8)) {
            string2 = ((C8404) abstractC8405).f20844.readString();
        }
        iconCompat.f6788 = string2;
        iconCompat.f6785 = PorterDuff.Mode.valueOf(iconCompat.f6787);
        switch (iconCompat.f6784) {
            case -1:
                Parcelable parcelable = iconCompat.f6781;
                if (parcelable != null) {
                    iconCompat.f6783 = parcelable;
                    return iconCompat;
                }
                C6755.m11869("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f6781;
                if (parcelable2 != null) {
                    iconCompat.f6783 = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f6782;
                iconCompat.f6783 = bArr3;
                iconCompat.f6784 = 3;
                iconCompat.f6780 = 0;
                iconCompat.f6779 = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f6782, Charset.forName("UTF-16"));
                iconCompat.f6783 = str;
                if (iconCompat.f6784 == 2 && iconCompat.f6788 == null) {
                    iconCompat.f6788 = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f6783 = iconCompat.f6782;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC8405 abstractC8405) {
        abstractC8405.getClass();
        iconCompat.f6787 = iconCompat.f6785.name();
        switch (iconCompat.f6784) {
            case -1:
                iconCompat.f6781 = (Parcelable) iconCompat.f6783;
                break;
            case 1:
            case 5:
                iconCompat.f6781 = (Parcelable) iconCompat.f6783;
                break;
            case 2:
                iconCompat.f6782 = ((String) iconCompat.f6783).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f6782 = (byte[]) iconCompat.f6783;
                break;
            case 4:
            case 6:
                iconCompat.f6782 = iconCompat.f6783.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f6784;
        if (-1 != i) {
            abstractC8405.mo13359(1);
            ((C8404) abstractC8405).f20844.writeInt(i);
        }
        byte[] bArr = iconCompat.f6782;
        if (bArr != null) {
            abstractC8405.mo13359(2);
            Parcel parcel = ((C8404) abstractC8405).f20844;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f6781;
        if (parcelable != null) {
            abstractC8405.mo13359(3);
            ((C8404) abstractC8405).f20844.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f6780;
        if (i2 != 0) {
            abstractC8405.mo13359(4);
            ((C8404) abstractC8405).f20844.writeInt(i2);
        }
        int i3 = iconCompat.f6779;
        if (i3 != 0) {
            abstractC8405.mo13359(5);
            ((C8404) abstractC8405).f20844.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f6786;
        if (colorStateList != null) {
            abstractC8405.mo13359(6);
            ((C8404) abstractC8405).f20844.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f6787;
        if (str != null) {
            abstractC8405.mo13359(7);
            ((C8404) abstractC8405).f20844.writeString(str);
        }
        String str2 = iconCompat.f6788;
        if (str2 != null) {
            abstractC8405.mo13359(8);
            ((C8404) abstractC8405).f20844.writeString(str2);
        }
    }
}
