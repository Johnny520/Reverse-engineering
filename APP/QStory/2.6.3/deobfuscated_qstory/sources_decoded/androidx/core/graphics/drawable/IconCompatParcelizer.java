package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p149.AbstractC7576;
import p149.C7575;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC7576 abstractC7576) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f6439;
        if (abstractC7576.mo12798(1)) {
            i = ((C7575) abstractC7576).f20499.readInt();
        }
        iconCompat.f6439 = i;
        byte[] bArr = iconCompat.f6437;
        if (abstractC7576.mo12798(2)) {
            Parcel parcel = ((C7575) abstractC7576).f20499;
            int i2 = parcel.readInt();
            if (i2 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i2];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f6437 = bArr;
        iconCompat.f6436 = abstractC7576.m12801(iconCompat.f6436, 3);
        int i3 = iconCompat.f6435;
        if (abstractC7576.mo12798(4)) {
            i3 = ((C7575) abstractC7576).f20499.readInt();
        }
        iconCompat.f6435 = i3;
        int i4 = iconCompat.f6434;
        if (abstractC7576.mo12798(5)) {
            i4 = ((C7575) abstractC7576).f20499.readInt();
        }
        iconCompat.f6434 = i4;
        iconCompat.f6441 = (ColorStateList) abstractC7576.m12801(iconCompat.f6441, 6);
        String string = iconCompat.f6442;
        if (abstractC7576.mo12798(7)) {
            string = ((C7575) abstractC7576).f20499.readString();
        }
        iconCompat.f6442 = string;
        String string2 = iconCompat.f6443;
        if (abstractC7576.mo12798(8)) {
            string2 = ((C7575) abstractC7576).f20499.readString();
        }
        iconCompat.f6443 = string2;
        iconCompat.f6440 = PorterDuff.Mode.valueOf(iconCompat.f6442);
        switch (iconCompat.f6439) {
            case -1:
                Parcelable parcelable = iconCompat.f6436;
                if (parcelable != null) {
                    iconCompat.f6438 = parcelable;
                    return iconCompat;
                }
                C5925.m11310("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f6436;
                if (parcelable2 != null) {
                    iconCompat.f6438 = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f6437;
                iconCompat.f6438 = bArr3;
                iconCompat.f6439 = 3;
                iconCompat.f6435 = 0;
                iconCompat.f6434 = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f6437, Charset.forName("UTF-16"));
                iconCompat.f6438 = str;
                if (iconCompat.f6439 == 2 && iconCompat.f6443 == null) {
                    iconCompat.f6443 = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f6438 = iconCompat.f6437;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC7576 abstractC7576) {
        abstractC7576.getClass();
        iconCompat.f6442 = iconCompat.f6440.name();
        switch (iconCompat.f6439) {
            case -1:
                iconCompat.f6436 = (Parcelable) iconCompat.f6438;
                break;
            case 1:
            case 5:
                iconCompat.f6436 = (Parcelable) iconCompat.f6438;
                break;
            case 2:
                iconCompat.f6437 = ((String) iconCompat.f6438).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f6437 = (byte[]) iconCompat.f6438;
                break;
            case 4:
            case 6:
                iconCompat.f6437 = iconCompat.f6438.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f6439;
        if (-1 != i) {
            abstractC7576.mo12800(1);
            ((C7575) abstractC7576).f20499.writeInt(i);
        }
        byte[] bArr = iconCompat.f6437;
        if (bArr != null) {
            abstractC7576.mo12800(2);
            Parcel parcel = ((C7575) abstractC7576).f20499;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f6436;
        if (parcelable != null) {
            abstractC7576.mo12800(3);
            ((C7575) abstractC7576).f20499.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f6435;
        if (i2 != 0) {
            abstractC7576.mo12800(4);
            ((C7575) abstractC7576).f20499.writeInt(i2);
        }
        int i3 = iconCompat.f6434;
        if (i3 != 0) {
            abstractC7576.mo12800(5);
            ((C7575) abstractC7576).f20499.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f6441;
        if (colorStateList != null) {
            abstractC7576.mo12800(6);
            ((C7575) abstractC7576).f20499.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f6442;
        if (str != null) {
            abstractC7576.mo12800(7);
            ((C7575) abstractC7576).f20499.writeString(str);
        }
        String str2 = iconCompat.f6443;
        if (str2 != null) {
            abstractC7576.mo12800(8);
            ((C7575) abstractC7576).f20499.writeString(str2);
        }
    }
}
