package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p149.AbstractC7575;
import p149.C7574;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC7575 abstractC7575) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f6438;
        if (abstractC7575.mo12769(1)) {
            i = ((C7574) abstractC7575).f20504.readInt();
        }
        iconCompat.f6438 = i;
        byte[] bArr = iconCompat.f6436;
        if (abstractC7575.mo12769(2)) {
            Parcel parcel = ((C7574) abstractC7575).f20504;
            int i2 = parcel.readInt();
            if (i2 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i2];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f6436 = bArr;
        iconCompat.f6435 = abstractC7575.m12772(iconCompat.f6435, 3);
        int i3 = iconCompat.f6434;
        if (abstractC7575.mo12769(4)) {
            i3 = ((C7574) abstractC7575).f20504.readInt();
        }
        iconCompat.f6434 = i3;
        int i4 = iconCompat.f6433;
        if (abstractC7575.mo12769(5)) {
            i4 = ((C7574) abstractC7575).f20504.readInt();
        }
        iconCompat.f6433 = i4;
        iconCompat.f6440 = (ColorStateList) abstractC7575.m12772(iconCompat.f6440, 6);
        String string = iconCompat.f6441;
        if (abstractC7575.mo12769(7)) {
            string = ((C7574) abstractC7575).f20504.readString();
        }
        iconCompat.f6441 = string;
        String string2 = iconCompat.f6442;
        if (abstractC7575.mo12769(8)) {
            string2 = ((C7574) abstractC7575).f20504.readString();
        }
        iconCompat.f6442 = string2;
        iconCompat.f6439 = PorterDuff.Mode.valueOf(iconCompat.f6441);
        switch (iconCompat.f6438) {
            case -1:
                Parcelable parcelable = iconCompat.f6435;
                if (parcelable != null) {
                    iconCompat.f6437 = parcelable;
                    return iconCompat;
                }
                C5919.m11249("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f6435;
                if (parcelable2 != null) {
                    iconCompat.f6437 = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f6436;
                iconCompat.f6437 = bArr3;
                iconCompat.f6438 = 3;
                iconCompat.f6434 = 0;
                iconCompat.f6433 = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f6436, Charset.forName("UTF-16"));
                iconCompat.f6437 = str;
                if (iconCompat.f6438 == 2 && iconCompat.f6442 == null) {
                    iconCompat.f6442 = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f6437 = iconCompat.f6436;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC7575 abstractC7575) {
        abstractC7575.getClass();
        iconCompat.f6441 = iconCompat.f6439.name();
        switch (iconCompat.f6438) {
            case -1:
                iconCompat.f6435 = (Parcelable) iconCompat.f6437;
                break;
            case 1:
            case 5:
                iconCompat.f6435 = (Parcelable) iconCompat.f6437;
                break;
            case 2:
                iconCompat.f6436 = ((String) iconCompat.f6437).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f6436 = (byte[]) iconCompat.f6437;
                break;
            case 4:
            case 6:
                iconCompat.f6436 = iconCompat.f6437.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f6438;
        if (-1 != i) {
            abstractC7575.mo12771(1);
            ((C7574) abstractC7575).f20504.writeInt(i);
        }
        byte[] bArr = iconCompat.f6436;
        if (bArr != null) {
            abstractC7575.mo12771(2);
            Parcel parcel = ((C7574) abstractC7575).f20504;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f6435;
        if (parcelable != null) {
            abstractC7575.mo12771(3);
            ((C7574) abstractC7575).f20504.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f6434;
        if (i2 != 0) {
            abstractC7575.mo12771(4);
            ((C7574) abstractC7575).f20504.writeInt(i2);
        }
        int i3 = iconCompat.f6433;
        if (i3 != 0) {
            abstractC7575.mo12771(5);
            ((C7574) abstractC7575).f20504.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f6440;
        if (colorStateList != null) {
            abstractC7575.mo12771(6);
            ((C7574) abstractC7575).f20504.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f6441;
        if (str != null) {
            abstractC7575.mo12771(7);
            ((C7574) abstractC7575).f20504.writeString(str);
        }
        String str2 = iconCompat.f6442;
        if (str2 != null) {
            abstractC7575.mo12771(8);
            ((C7574) abstractC7575).f20504.writeString(str2);
        }
    }
}
