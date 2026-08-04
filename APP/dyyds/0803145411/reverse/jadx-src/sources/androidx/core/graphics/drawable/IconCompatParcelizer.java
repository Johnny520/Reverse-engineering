package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import yyds.AbstractC1172;
import yyds.C0188;
import yyds.C2664;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC1172 abstractC1172) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f265 = -1;
        iconCompat.f269 = null;
        iconCompat.f271 = null;
        iconCompat.f264 = 0;
        iconCompat.f270 = 0;
        iconCompat.f267 = null;
        iconCompat.f262 = IconCompat.f261;
        iconCompat.f263 = null;
        iconCompat.f265 = !abstractC1172.mo2362(1) ? -1 : ((C2664) abstractC1172).f13073.readInt();
        byte[] bArr = iconCompat.f269;
        if (abstractC1172.mo2362(2)) {
            Parcel parcel = ((C2664) abstractC1172).f13073;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f269 = bArr;
        iconCompat.f271 = abstractC1172.m2367(iconCompat.f271, 3);
        int i2 = iconCompat.f264;
        if (abstractC1172.mo2362(4)) {
            i2 = ((C2664) abstractC1172).f13073.readInt();
        }
        iconCompat.f264 = i2;
        int i3 = iconCompat.f270;
        if (abstractC1172.mo2362(5)) {
            i3 = ((C2664) abstractC1172).f13073.readInt();
        }
        iconCompat.f270 = i3;
        iconCompat.f267 = (ColorStateList) abstractC1172.m2367(iconCompat.f267, 6);
        String string = iconCompat.f263;
        if (abstractC1172.mo2362(7)) {
            string = ((C2664) abstractC1172).f13073.readString();
        }
        iconCompat.f263 = string;
        String string2 = iconCompat.f268;
        if (abstractC1172.mo2362(8)) {
            string2 = ((C2664) abstractC1172).f13073.readString();
        }
        iconCompat.f268 = string2;
        iconCompat.f262 = PorterDuff.Mode.valueOf(iconCompat.f263);
        switch (iconCompat.f265) {
            case -1:
                Parcelable parcelable = iconCompat.f271;
                if (parcelable != null) {
                    iconCompat.f266 = parcelable;
                    return iconCompat;
                }
                C0188.m798("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f271;
                if (parcelable2 != null) {
                    iconCompat.f266 = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f269;
                iconCompat.f266 = bArr3;
                iconCompat.f265 = 3;
                iconCompat.f264 = 0;
                iconCompat.f270 = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f269, Charset.forName("UTF-16"));
                iconCompat.f266 = str;
                if (iconCompat.f265 == 2 && iconCompat.f268 == null) {
                    iconCompat.f268 = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f266 = iconCompat.f269;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC1172 abstractC1172) {
        abstractC1172.getClass();
        iconCompat.f263 = iconCompat.f262.name();
        switch (iconCompat.f265) {
            case -1:
                iconCompat.f271 = (Parcelable) iconCompat.f266;
                break;
            case 1:
            case 5:
                iconCompat.f271 = (Parcelable) iconCompat.f266;
                break;
            case 2:
                iconCompat.f269 = ((String) iconCompat.f266).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f269 = (byte[]) iconCompat.f266;
                break;
            case 4:
            case 6:
                iconCompat.f269 = iconCompat.f266.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f265;
        if (-1 != i) {
            abstractC1172.mo2360(1);
            ((C2664) abstractC1172).f13073.writeInt(i);
        }
        byte[] bArr = iconCompat.f269;
        if (bArr != null) {
            abstractC1172.mo2360(2);
            Parcel parcel = ((C2664) abstractC1172).f13073;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f271;
        if (parcelable != null) {
            abstractC1172.mo2360(3);
            ((C2664) abstractC1172).f13073.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f264;
        if (i2 != 0) {
            abstractC1172.mo2360(4);
            ((C2664) abstractC1172).f13073.writeInt(i2);
        }
        int i3 = iconCompat.f270;
        if (i3 != 0) {
            abstractC1172.mo2360(5);
            ((C2664) abstractC1172).f13073.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f267;
        if (colorStateList != null) {
            abstractC1172.mo2360(6);
            ((C2664) abstractC1172).f13073.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f263;
        if (str != null) {
            abstractC1172.mo2360(7);
            ((C2664) abstractC1172).f13073.writeString(str);
        }
        String str2 = iconCompat.f268;
        if (str2 != null) {
            abstractC1172.mo2360(8);
            ((C2664) abstractC1172).f13073.writeString(str2);
        }
    }
}
