package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import nuke.module.wechat.p002ai.AIChatConfig;
import p000.C0676s;
import p000.ia3;
import p000.ja3;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(ia3 ia3Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f300a = -1;
        iconCompat.f302c = null;
        iconCompat.f303d = null;
        iconCompat.f304e = 0;
        iconCompat.f305f = 0;
        iconCompat.f306g = null;
        iconCompat.f307h = IconCompat.f299k;
        iconCompat.f308i = null;
        iconCompat.f300a = !ia3Var.mo2312e(1) ? -1 : ((ja3) ia3Var).f4938e.readInt();
        byte[] bArr = iconCompat.f302c;
        if (ia3Var.mo2312e(2)) {
            Parcel parcel = ((ja3) ia3Var).f4938e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f302c = bArr;
        iconCompat.f303d = ia3Var.m2313f(iconCompat.f303d, 3);
        int i2 = iconCompat.f304e;
        if (ia3Var.mo2312e(4)) {
            i2 = ((ja3) ia3Var).f4938e.readInt();
        }
        iconCompat.f304e = i2;
        int i3 = iconCompat.f305f;
        if (ia3Var.mo2312e(5)) {
            i3 = ((ja3) ia3Var).f4938e.readInt();
        }
        iconCompat.f305f = i3;
        iconCompat.f306g = (ColorStateList) ia3Var.m2313f(iconCompat.f306g, 6);
        String string = iconCompat.f308i;
        if (ia3Var.mo2312e(7)) {
            string = ((ja3) ia3Var).f4938e.readString();
        }
        iconCompat.f308i = string;
        String string2 = iconCompat.f309j;
        if (ia3Var.mo2312e(8)) {
            string2 = ((ja3) ia3Var).f4938e.readString();
        }
        iconCompat.f309j = string2;
        iconCompat.f307h = PorterDuff.Mode.valueOf(iconCompat.f308i);
        switch (iconCompat.f300a) {
            case -1:
                Parcelable parcelable = iconCompat.f303d;
                if (parcelable != null) {
                    iconCompat.f301b = parcelable;
                    return iconCompat;
                }
                C0676s.m4651j("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f303d;
                if (parcelable2 != null) {
                    iconCompat.f301b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f302c;
                iconCompat.f301b = bArr3;
                iconCompat.f300a = 3;
                iconCompat.f304e = 0;
                iconCompat.f305f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case AIChatConfig.DefaultContextRounds /* 6 */:
                String str = new String(iconCompat.f302c, Charset.forName("UTF-16"));
                iconCompat.f301b = str;
                if (iconCompat.f300a == 2 && iconCompat.f309j == null) {
                    iconCompat.f309j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f301b = iconCompat.f302c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, ia3 ia3Var) {
        ia3Var.getClass();
        iconCompat.f308i = iconCompat.f307h.name();
        switch (iconCompat.f300a) {
            case -1:
                iconCompat.f303d = (Parcelable) iconCompat.f301b;
                break;
            case 1:
            case 5:
                iconCompat.f303d = (Parcelable) iconCompat.f301b;
                break;
            case 2:
                iconCompat.f302c = ((String) iconCompat.f301b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f302c = (byte[]) iconCompat.f301b;
                break;
            case 4:
            case AIChatConfig.DefaultContextRounds /* 6 */:
                iconCompat.f302c = iconCompat.f301b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f300a;
        if (-1 != i) {
            ia3Var.mo2315h(1);
            ((ja3) ia3Var).f4938e.writeInt(i);
        }
        byte[] bArr = iconCompat.f302c;
        if (bArr != null) {
            ia3Var.mo2315h(2);
            Parcel parcel = ((ja3) ia3Var).f4938e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f303d;
        if (parcelable != null) {
            ia3Var.mo2315h(3);
            ((ja3) ia3Var).f4938e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f304e;
        if (i2 != 0) {
            ia3Var.mo2315h(4);
            ((ja3) ia3Var).f4938e.writeInt(i2);
        }
        int i3 = iconCompat.f305f;
        if (i3 != 0) {
            ia3Var.mo2315h(5);
            ((ja3) ia3Var).f4938e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f306g;
        if (colorStateList != null) {
            ia3Var.mo2315h(6);
            ((ja3) ia3Var).f4938e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f308i;
        if (str != null) {
            ia3Var.mo2315h(7);
            ((ja3) ia3Var).f4938e.writeString(str);
        }
        String str2 = iconCompat.f309j;
        if (str2 != null) {
            ia3Var.mo2315h(8);
            ((ja3) ia3Var).f4938e.writeString(str2);
        }
    }
}
