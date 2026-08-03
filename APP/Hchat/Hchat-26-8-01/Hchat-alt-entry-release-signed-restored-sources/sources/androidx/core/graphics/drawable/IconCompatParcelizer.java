package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import bsh.org.objectweb.asm.Opcodes;
import java.nio.charset.Charset;
import p136j8.C2104o;
import p375z3.AbstractC6084b;
import p375z3.C6085c;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC6084b abstractC6084b) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f263a = -1;
        byte[] bArr = null;
        iconCompat.f265c = null;
        iconCompat.f266d = null;
        iconCompat.f267e = 0;
        iconCompat.f268f = 0;
        iconCompat.f269g = null;
        iconCompat.f270h = IconCompat.f262k;
        iconCompat.f271i = null;
        iconCompat.f263a = !abstractC6084b.mo10820e(1) ? -1 : ((C6085c) abstractC6084b).f24582e.readInt();
        byte[] bArr2 = iconCompat.f265c;
        if (abstractC6084b.mo10820e(2)) {
            Parcel parcel = ((C6085c) abstractC6084b).f24582e;
            int i9 = parcel.readInt();
            if (i9 >= 0) {
                bArr = new byte[i9];
                parcel.readByteArray(bArr);
            }
        } else {
            bArr = bArr2;
        }
        iconCompat.f265c = bArr;
        iconCompat.f266d = abstractC6084b.m10821f(iconCompat.f266d, 3);
        int i10 = iconCompat.f267e;
        if (abstractC6084b.mo10820e(4)) {
            i10 = ((C6085c) abstractC6084b).f24582e.readInt();
        }
        iconCompat.f267e = i10;
        int i11 = iconCompat.f268f;
        if (abstractC6084b.mo10820e(5)) {
            i11 = ((C6085c) abstractC6084b).f24582e.readInt();
        }
        iconCompat.f268f = i11;
        iconCompat.f269g = (ColorStateList) abstractC6084b.m10821f(iconCompat.f269g, 6);
        String string = iconCompat.f271i;
        if (abstractC6084b.mo10820e(7)) {
            string = ((C6085c) abstractC6084b).f24582e.readString();
        }
        iconCompat.f271i = string;
        String string2 = iconCompat.f272j;
        if (abstractC6084b.mo10820e(8)) {
            string2 = ((C6085c) abstractC6084b).f24582e.readString();
        }
        iconCompat.f272j = string2;
        iconCompat.f270h = PorterDuff.Mode.valueOf(iconCompat.f271i);
        switch (iconCompat.f263a) {
            case Opcodes.F_NEW /* -1 */:
                Parcelable parcelable = iconCompat.f266d;
                if (parcelable != null) {
                    iconCompat.f264b = parcelable;
                    return iconCompat;
                }
                C2104o.m5294t("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f266d;
                if (parcelable2 != null) {
                    iconCompat.f264b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f265c;
                iconCompat.f264b = bArr3;
                iconCompat.f263a = 3;
                iconCompat.f267e = 0;
                iconCompat.f268f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f265c, Charset.forName("UTF-16"));
                iconCompat.f264b = str;
                if (iconCompat.f263a == 2 && iconCompat.f272j == null) {
                    iconCompat.f272j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f264b = iconCompat.f265c;
                return iconCompat;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void write(IconCompat iconCompat, AbstractC6084b abstractC6084b) {
        abstractC6084b.getClass();
        iconCompat.f271i = iconCompat.f270h.name();
        switch (iconCompat.f263a) {
            case Opcodes.F_NEW /* -1 */:
                iconCompat.f266d = (Parcelable) iconCompat.f264b;
                break;
            case 1:
            case 5:
                iconCompat.f266d = (Parcelable) iconCompat.f264b;
                break;
            case 2:
                iconCompat.f265c = ((String) iconCompat.f264b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f265c = (byte[]) iconCompat.f264b;
                break;
            case 4:
            case 6:
                iconCompat.f265c = iconCompat.f264b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i9 = iconCompat.f263a;
        if (-1 != i9) {
            abstractC6084b.mo10823h(1);
            ((C6085c) abstractC6084b).f24582e.writeInt(i9);
        }
        byte[] bArr = iconCompat.f265c;
        if (bArr != null) {
            abstractC6084b.mo10823h(2);
            Parcel parcel = ((C6085c) abstractC6084b).f24582e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f266d;
        if (parcelable != null) {
            abstractC6084b.mo10823h(3);
            ((C6085c) abstractC6084b).f24582e.writeParcelable(parcelable, 0);
        }
        int i10 = iconCompat.f267e;
        if (i10 != 0) {
            abstractC6084b.mo10823h(4);
            ((C6085c) abstractC6084b).f24582e.writeInt(i10);
        }
        int i11 = iconCompat.f268f;
        if (i11 != 0) {
            abstractC6084b.mo10823h(5);
            ((C6085c) abstractC6084b).f24582e.writeInt(i11);
        }
        ColorStateList colorStateList = iconCompat.f269g;
        if (colorStateList != null) {
            abstractC6084b.mo10823h(6);
            ((C6085c) abstractC6084b).f24582e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f271i;
        if (str != null) {
            abstractC6084b.mo10823h(7);
            ((C6085c) abstractC6084b).f24582e.writeString(str);
        }
        String str2 = iconCompat.f272j;
        if (str2 != null) {
            abstractC6084b.mo10823h(8);
            ((C6085c) abstractC6084b).f24582e.writeString(str2);
        }
    }
}
