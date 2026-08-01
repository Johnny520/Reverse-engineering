package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.megatronking.stringfog.Base64;
import java.nio.charset.Charset;
import p000.o90;
import p000.p90;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(o90 o90Var) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f417a;
        if (o90Var.mo1996e(1)) {
            i = ((p90) o90Var).f3626e.readInt();
        }
        iconCompat.f417a = i;
        byte[] bArr = iconCompat.f419c;
        if (o90Var.mo1996e(2)) {
            Parcel parcel = ((p90) o90Var).f3626e;
            int i2 = parcel.readInt();
            if (i2 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i2];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f419c = bArr;
        iconCompat.f420d = o90Var.m1997f(iconCompat.f420d, 3);
        int i3 = iconCompat.f421e;
        if (o90Var.mo1996e(4)) {
            i3 = ((p90) o90Var).f3626e.readInt();
        }
        iconCompat.f421e = i3;
        int i4 = iconCompat.f422f;
        if (o90Var.mo1996e(5)) {
            i4 = ((p90) o90Var).f3626e.readInt();
        }
        iconCompat.f422f = i4;
        iconCompat.f423g = (ColorStateList) o90Var.m1997f(iconCompat.f423g, 6);
        String string = iconCompat.f425i;
        if (o90Var.mo1996e(7)) {
            string = ((p90) o90Var).f3626e.readString();
        }
        iconCompat.f425i = string;
        String string2 = iconCompat.f426j;
        if (o90Var.mo1996e(8)) {
            string2 = ((p90) o90Var).f3626e.readString();
        }
        iconCompat.f426j = string2;
        iconCompat.f424h = PorterDuff.Mode.valueOf(iconCompat.f425i);
        switch (iconCompat.f417a) {
            case -1:
                Parcelable parcelable = iconCompat.f420d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f418b = parcelable;
                return iconCompat;
            case Base64.DEFAULT /* 0 */:
            default:
                return iconCompat;
            case Base64.NO_PADDING /* 1 */:
            case 5:
                Parcelable parcelable2 = iconCompat.f420d;
                if (parcelable2 != null) {
                    iconCompat.f418b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f419c;
                iconCompat.f418b = bArr3;
                iconCompat.f417a = 3;
                iconCompat.f421e = 0;
                iconCompat.f422f = bArr3.length;
                return iconCompat;
            case Base64.NO_WRAP /* 2 */:
            case 4:
            case 6:
                String str = new String(iconCompat.f419c, Charset.forName("UTF-16"));
                iconCompat.f418b = str;
                if (iconCompat.f417a == 2 && iconCompat.f426j == null) {
                    iconCompat.f426j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f418b = iconCompat.f419c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, o90 o90Var) {
        o90Var.getClass();
        iconCompat.f425i = iconCompat.f424h.name();
        switch (iconCompat.f417a) {
            case -1:
                iconCompat.f420d = (Parcelable) iconCompat.f418b;
                break;
            case Base64.NO_PADDING /* 1 */:
            case 5:
                iconCompat.f420d = (Parcelable) iconCompat.f418b;
                break;
            case Base64.NO_WRAP /* 2 */:
                iconCompat.f419c = ((String) iconCompat.f418b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f419c = (byte[]) iconCompat.f418b;
                break;
            case 4:
            case 6:
                iconCompat.f419c = iconCompat.f418b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f417a;
        if (-1 != i) {
            o90Var.mo1999h(1);
            ((p90) o90Var).f3626e.writeInt(i);
        }
        byte[] bArr = iconCompat.f419c;
        if (bArr != null) {
            o90Var.mo1999h(2);
            Parcel parcel = ((p90) o90Var).f3626e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f420d;
        if (parcelable != null) {
            o90Var.mo1999h(3);
            ((p90) o90Var).f3626e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f421e;
        if (i2 != 0) {
            o90Var.mo1999h(4);
            ((p90) o90Var).f3626e.writeInt(i2);
        }
        int i3 = iconCompat.f422f;
        if (i3 != 0) {
            o90Var.mo1999h(5);
            ((p90) o90Var).f3626e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f423g;
        if (colorStateList != null) {
            o90Var.mo1999h(6);
            ((p90) o90Var).f3626e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f425i;
        if (str != null) {
            o90Var.mo1999h(7);
            ((p90) o90Var).f3626e.writeString(str);
        }
        String str2 = iconCompat.f426j;
        if (str2 != null) {
            o90Var.mo1999h(8);
            ((p90) o90Var).f3626e.writeString(str2);
        }
    }
}
