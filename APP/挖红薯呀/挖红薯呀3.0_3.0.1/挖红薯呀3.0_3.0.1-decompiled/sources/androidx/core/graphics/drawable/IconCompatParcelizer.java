package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p000.C0921xc;
import p000.xb1;
import p000.yb1;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(xb1 xb1Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f206a = -1;
        iconCompat.f208c = null;
        iconCompat.f209d = null;
        iconCompat.f210e = 0;
        iconCompat.f211f = 0;
        iconCompat.f212g = null;
        iconCompat.f213h = IconCompat.f205k;
        iconCompat.f214i = null;
        iconCompat.f206a = !xb1Var.mo5118e(1) ? -1 : ((yb1) xb1Var).f7602e.readInt();
        byte[] bArr = iconCompat.f208c;
        if (xb1Var.mo5118e(2)) {
            Parcel parcel = ((yb1) xb1Var).f7602e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f208c = bArr;
        iconCompat.f209d = xb1Var.m5119f(iconCompat.f209d, 3);
        int i2 = iconCompat.f210e;
        if (xb1Var.mo5118e(4)) {
            i2 = ((yb1) xb1Var).f7602e.readInt();
        }
        iconCompat.f210e = i2;
        int i3 = iconCompat.f211f;
        if (xb1Var.mo5118e(5)) {
            i3 = ((yb1) xb1Var).f7602e.readInt();
        }
        iconCompat.f211f = i3;
        iconCompat.f212g = (ColorStateList) xb1Var.m5119f(iconCompat.f212g, 6);
        String string = iconCompat.f214i;
        if (xb1Var.mo5118e(7)) {
            string = ((yb1) xb1Var).f7602e.readString();
        }
        iconCompat.f214i = string;
        String string2 = iconCompat.f215j;
        if (xb1Var.mo5118e(8)) {
            string2 = ((yb1) xb1Var).f7602e.readString();
        }
        iconCompat.f215j = string2;
        iconCompat.f213h = PorterDuff.Mode.valueOf(iconCompat.f214i);
        switch (iconCompat.f206a) {
            case -1:
                Parcelable parcelable = iconCompat.f209d;
                if (parcelable != null) {
                    iconCompat.f207b = parcelable;
                    return iconCompat;
                }
                C0921xc.m5131l("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f209d;
                if (parcelable2 != null) {
                    iconCompat.f207b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f208c;
                iconCompat.f207b = bArr3;
                iconCompat.f206a = 3;
                iconCompat.f210e = 0;
                iconCompat.f211f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f208c, Charset.forName("UTF-16"));
                iconCompat.f207b = str;
                if (iconCompat.f206a == 2 && iconCompat.f215j == null) {
                    iconCompat.f215j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f207b = iconCompat.f208c;
                return iconCompat;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void write(IconCompat iconCompat, xb1 xb1Var) {
        xb1Var.getClass();
        iconCompat.f214i = iconCompat.f213h.name();
        switch (iconCompat.f206a) {
            case -1:
                iconCompat.f209d = (Parcelable) iconCompat.f207b;
                break;
            case 1:
            case 5:
                iconCompat.f209d = (Parcelable) iconCompat.f207b;
                break;
            case 2:
                iconCompat.f208c = ((String) iconCompat.f207b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f208c = (byte[]) iconCompat.f207b;
                break;
            case 4:
            case 6:
                iconCompat.f208c = iconCompat.f207b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f206a;
        if (-1 != i) {
            xb1Var.mo5121h(1);
            ((yb1) xb1Var).f7602e.writeInt(i);
        }
        byte[] bArr = iconCompat.f208c;
        if (bArr != null) {
            xb1Var.mo5121h(2);
            Parcel parcel = ((yb1) xb1Var).f7602e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f209d;
        if (parcelable != null) {
            xb1Var.mo5121h(3);
            ((yb1) xb1Var).f7602e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f210e;
        if (i2 != 0) {
            xb1Var.mo5121h(4);
            ((yb1) xb1Var).f7602e.writeInt(i2);
        }
        int i3 = iconCompat.f211f;
        if (i3 != 0) {
            xb1Var.mo5121h(5);
            ((yb1) xb1Var).f7602e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f212g;
        if (colorStateList != null) {
            xb1Var.mo5121h(6);
            ((yb1) xb1Var).f7602e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f214i;
        if (str != null) {
            xb1Var.mo5121h(7);
            ((yb1) xb1Var).f7602e.writeString(str);
        }
        String str2 = iconCompat.f215j;
        if (str2 != null) {
            xb1Var.mo5121h(8);
            ((yb1) xb1Var).f7602e.writeString(str2);
        }
    }
}
