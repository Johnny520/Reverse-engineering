package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.megatronking.stringfog.Base64;
import java.nio.charset.Charset;
import p000.j90;
import p000.k90;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(j90 j90Var) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f454a;
        if (j90Var.mo1559e(1)) {
            i = ((k90) j90Var).f2739e.readInt();
        }
        iconCompat.f454a = i;
        byte[] bArr = iconCompat.f456c;
        if (j90Var.mo1559e(2)) {
            Parcel parcel = ((k90) j90Var).f2739e;
            int i2 = parcel.readInt();
            if (i2 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i2];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f456c = bArr;
        iconCompat.f457d = j90Var.m1560f(iconCompat.f457d, 3);
        int i3 = iconCompat.f458e;
        if (j90Var.mo1559e(4)) {
            i3 = ((k90) j90Var).f2739e.readInt();
        }
        iconCompat.f458e = i3;
        int i4 = iconCompat.f459f;
        if (j90Var.mo1559e(5)) {
            i4 = ((k90) j90Var).f2739e.readInt();
        }
        iconCompat.f459f = i4;
        iconCompat.f460g = (ColorStateList) j90Var.m1560f(iconCompat.f460g, 6);
        String string = iconCompat.f462i;
        if (j90Var.mo1559e(7)) {
            string = ((k90) j90Var).f2739e.readString();
        }
        iconCompat.f462i = string;
        String string2 = iconCompat.f463j;
        if (j90Var.mo1559e(8)) {
            string2 = ((k90) j90Var).f2739e.readString();
        }
        iconCompat.f463j = string2;
        iconCompat.f461h = PorterDuff.Mode.valueOf(iconCompat.f462i);
        switch (iconCompat.f454a) {
            case -1:
                Parcelable parcelable = iconCompat.f457d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f455b = parcelable;
                return iconCompat;
            case Base64.DEFAULT /* 0 */:
            default:
                return iconCompat;
            case Base64.NO_PADDING /* 1 */:
            case 5:
                Parcelable parcelable2 = iconCompat.f457d;
                if (parcelable2 != null) {
                    iconCompat.f455b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f456c;
                iconCompat.f455b = bArr3;
                iconCompat.f454a = 3;
                iconCompat.f458e = 0;
                iconCompat.f459f = bArr3.length;
                return iconCompat;
            case Base64.NO_WRAP /* 2 */:
            case 4:
            case 6:
                String str = new String(iconCompat.f456c, Charset.forName("UTF-16"));
                iconCompat.f455b = str;
                if (iconCompat.f454a == 2 && iconCompat.f463j == null) {
                    iconCompat.f463j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f455b = iconCompat.f456c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, j90 j90Var) {
        j90Var.getClass();
        iconCompat.f462i = iconCompat.f461h.name();
        switch (iconCompat.f454a) {
            case -1:
                iconCompat.f457d = (Parcelable) iconCompat.f455b;
                break;
            case Base64.NO_PADDING /* 1 */:
            case 5:
                iconCompat.f457d = (Parcelable) iconCompat.f455b;
                break;
            case Base64.NO_WRAP /* 2 */:
                iconCompat.f456c = ((String) iconCompat.f455b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f456c = (byte[]) iconCompat.f455b;
                break;
            case 4:
            case 6:
                iconCompat.f456c = iconCompat.f455b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f454a;
        if (-1 != i) {
            j90Var.mo1562h(1);
            ((k90) j90Var).f2739e.writeInt(i);
        }
        byte[] bArr = iconCompat.f456c;
        if (bArr != null) {
            j90Var.mo1562h(2);
            Parcel parcel = ((k90) j90Var).f2739e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f457d;
        if (parcelable != null) {
            j90Var.mo1562h(3);
            ((k90) j90Var).f2739e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f458e;
        if (i2 != 0) {
            j90Var.mo1562h(4);
            ((k90) j90Var).f2739e.writeInt(i2);
        }
        int i3 = iconCompat.f459f;
        if (i3 != 0) {
            j90Var.mo1562h(5);
            ((k90) j90Var).f2739e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f460g;
        if (colorStateList != null) {
            j90Var.mo1562h(6);
            ((k90) j90Var).f2739e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f462i;
        if (str != null) {
            j90Var.mo1562h(7);
            ((k90) j90Var).f2739e.writeString(str);
        }
        String str2 = iconCompat.f463j;
        if (str2 != null) {
            j90Var.mo1562h(8);
            ((k90) j90Var).f2739e.writeString(str2);
        }
    }
}
