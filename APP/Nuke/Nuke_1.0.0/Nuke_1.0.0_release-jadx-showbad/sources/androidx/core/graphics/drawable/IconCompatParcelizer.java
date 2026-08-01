package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import me.dartcv.nuke.BuildConfig;
import p064M1.AbstractC0995b;
import p064M1.C0996c;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0995b abstractC0995b) {
        IconCompat iconCompat = new IconCompat();
        int i5 = iconCompat.f6179a;
        if (abstractC0995b.mo2044e(1)) {
            i5 = ((C0996c) abstractC0995b).f3075e.readInt();
        }
        iconCompat.f6179a = i5;
        byte[] bArr = iconCompat.f6181c;
        if (abstractC0995b.mo2044e(2)) {
            Parcel parcel = ((C0996c) abstractC0995b).f3075e;
            int i6 = parcel.readInt();
            if (i6 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i6];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f6181c = bArr;
        iconCompat.f6182d = abstractC0995b.m2045f(iconCompat.f6182d, 3);
        int i7 = iconCompat.f6183e;
        if (abstractC0995b.mo2044e(4)) {
            i7 = ((C0996c) abstractC0995b).f3075e.readInt();
        }
        iconCompat.f6183e = i7;
        int i8 = iconCompat.f6184f;
        if (abstractC0995b.mo2044e(5)) {
            i8 = ((C0996c) abstractC0995b).f3075e.readInt();
        }
        iconCompat.f6184f = i8;
        iconCompat.f6185g = (ColorStateList) abstractC0995b.m2045f(iconCompat.f6185g, 6);
        String string = iconCompat.f6187i;
        if (abstractC0995b.mo2044e(7)) {
            string = ((C0996c) abstractC0995b).f3075e.readString();
        }
        iconCompat.f6187i = string;
        String string2 = iconCompat.f6188j;
        if (abstractC0995b.mo2044e(8)) {
            string2 = ((C0996c) abstractC0995b).f3075e.readString();
        }
        iconCompat.f6188j = string2;
        iconCompat.f6186h = PorterDuff.Mode.valueOf(iconCompat.f6187i);
        switch (iconCompat.f6179a) {
            case -1:
                Parcelable parcelable = iconCompat.f6182d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f6180b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case BuildConfig.VERSION_CODE /* 1 */:
            case 5:
                Parcelable parcelable2 = iconCompat.f6182d;
                if (parcelable2 != null) {
                    iconCompat.f6180b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f6181c;
                iconCompat.f6180b = bArr3;
                iconCompat.f6179a = 3;
                iconCompat.f6183e = 0;
                iconCompat.f6184f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f6181c, Charset.forName("UTF-16"));
                iconCompat.f6180b = str;
                if (iconCompat.f6179a == 2 && iconCompat.f6188j == null) {
                    iconCompat.f6188j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f6180b = iconCompat.f6181c;
                return iconCompat;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void write(IconCompat iconCompat, AbstractC0995b abstractC0995b) {
        abstractC0995b.getClass();
        iconCompat.f6187i = iconCompat.f6186h.name();
        switch (iconCompat.f6179a) {
            case -1:
                iconCompat.f6182d = (Parcelable) iconCompat.f6180b;
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
            case 5:
                iconCompat.f6182d = (Parcelable) iconCompat.f6180b;
                break;
            case 2:
                iconCompat.f6181c = ((String) iconCompat.f6180b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f6181c = (byte[]) iconCompat.f6180b;
                break;
            case 4:
            case 6:
                iconCompat.f6181c = iconCompat.f6180b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i5 = iconCompat.f6179a;
        if (-1 != i5) {
            abstractC0995b.mo2047h(1);
            ((C0996c) abstractC0995b).f3075e.writeInt(i5);
        }
        byte[] bArr = iconCompat.f6181c;
        if (bArr != null) {
            abstractC0995b.mo2047h(2);
            Parcel parcel = ((C0996c) abstractC0995b).f3075e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f6182d;
        if (parcelable != null) {
            abstractC0995b.mo2047h(3);
            ((C0996c) abstractC0995b).f3075e.writeParcelable(parcelable, 0);
        }
        int i6 = iconCompat.f6183e;
        if (i6 != 0) {
            abstractC0995b.mo2047h(4);
            ((C0996c) abstractC0995b).f3075e.writeInt(i6);
        }
        int i7 = iconCompat.f6184f;
        if (i7 != 0) {
            abstractC0995b.mo2047h(5);
            ((C0996c) abstractC0995b).f3075e.writeInt(i7);
        }
        ColorStateList colorStateList = iconCompat.f6185g;
        if (colorStateList != null) {
            abstractC0995b.mo2047h(6);
            ((C0996c) abstractC0995b).f3075e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f6187i;
        if (str != null) {
            abstractC0995b.mo2047h(7);
            ((C0996c) abstractC0995b).f3075e.writeString(str);
        }
        String str2 = iconCompat.f6188j;
        if (str2 != null) {
            abstractC0995b.mo2047h(8);
            ((C0996c) abstractC0995b).f3075e.writeString(str2);
        }
    }
}
