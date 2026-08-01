package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j90;
import defpackage.k90;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public IconCompatParcelizer() {
    }

    public static IconCompat read(j90 r5) {
        IconCompat r0 = new IconCompat();
        int r1 = r0.a;
        if (r5.e(1) == false) goto L6;
        r1 = ((k90) r5).e.readInt();
    L6:
        r0.a = r1;
        byte[] r12 = r0.c;
        if (r5.e(2) == false) goto L13;
        Parcel r13 = ((k90) r5).e;
        int r3 = r13.readInt();
        if (r3 >= 0) goto L12;
        r12 = null;
        goto L13
    L12:
        byte[] r32 = new byte[r3];
        r13.readByteArray(r32);
        r12 = r32;
    L13:
        r0.c = r12;
        r0.d = r5.f(r0.d, 3);
        int r14 = r0.e;
        if (r5.e(4) == false) goto L17;
        r14 = ((k90) r5).e.readInt();
    L17:
        r0.e = r14;
        int r15 = r0.f;
        if (r5.e(5) == false) goto L21;
        r15 = ((k90) r5).e.readInt();
    L21:
        r0.f = r15;
        r0.g = (ColorStateList) r5.f(r0.g, 6);
        String r16 = r0.i;
        if (r5.e(7) == false) goto L25;
        r16 = ((k90) r5).e.readString();
    L25:
        r0.i = r16;
        String r17 = r0.j;
        if (r5.e(8) == false) goto L29;
        r17 = ((k90) r5).e.readString();
    L29:
        r0.j = r17;
        r0.h = PorterDuff.Mode.valueOf(r0.i);
        switch(r0.a) {
            case -1: goto L46;
            case 0: goto L39;
            case 1: goto L40;
            case 2: goto L34;
            case 3: goto L32;
            case 4: goto L34;
            case 5: goto L40;
            case 6: goto L34;
            default: goto L39;
        };
    L32:
        r0.b = r0.c;
        return r0;
    L34:
        String r52 = new String(r0.c, Charset.forName("UTF-16"));
        r0.b = r52;
        if (r0.a != 2) goto L39;
        if (r0.j != null) goto L39;
        r0.j = r52.split(":", -1)[0];
        goto L39
    L40:
        Parcelable r53 = r0.d;
        if (r53 == null) goto L44;
        r0.b = r53;
        return r0;
    L44:
        byte[] r54 = r0.c;
        r0.b = r54;
        r0.a = 3;
        r0.e = 0;
        r0.f = r54.length;
        return r0;
    L46:
        Parcelable r55 = r0.d;
        if (r55 == null) goto L51;
        r0.b = r55;
        return r0;
    L51:
        throw new IllegalArgumentException("Invalid icon");
    L39:
        return r0;
    }

    public static void write(IconCompat r3, j90 r4) {
        r4.getClass();
        r3.i = r3.h.name();
        switch(r3.a) {
            case -1: goto L9;
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L7;
            case 3: goto L6;
            case 4: goto L5;
            case 5: goto L8;
            case 6: goto L5;
            default: goto L10;
        };
    L5:
        r3.c = r3.b.toString().getBytes(Charset.forName("UTF-16"));
        goto L10
    L6:
        r3.c = (byte[]) r3.b;
        goto L10
    L7:
        r3.c = ((String) r3.b).getBytes(Charset.forName("UTF-16"));
        goto L10
    L8:
        r3.d = (Parcelable) r3.b;
        goto L10
    L9:
        r3.d = (Parcelable) r3.b;
    L10:
        int r0 = r3.a;
        if ((-1) == r0) goto L13;
        r4.h(1);
        ((k90) r4).e.writeInt(r0);
    L13:
        byte[] r02 = r3.c;
        if (r02 == null) goto L16;
        r4.h(2);
        Parcel r1 = ((k90) r4).e;
        r1.writeInt(r02.length);
        r1.writeByteArray(r02);
    L16:
        Parcelable r03 = r3.d;
        if (r03 == null) goto L19;
        r4.h(3);
        ((k90) r4).e.writeParcelable(r03, 0);
    L19:
        int r04 = r3.e;
        if (r04 == 0) goto L22;
        r4.h(4);
        ((k90) r4).e.writeInt(r04);
    L22:
        int r05 = r3.f;
        if (r05 == 0) goto L25;
        r4.h(5);
        ((k90) r4).e.writeInt(r05);
    L25:
        ColorStateList r06 = r3.g;
        if (r06 == null) goto L28;
        r4.h(6);
        ((k90) r4).e.writeParcelable(r06, 0);
    L28:
        String r07 = r3.i;
        if (r07 == null) goto L31;
        r4.h(7);
        ((k90) r4).e.writeString(r07);
    L31:
        String r32 = r3.j;
        if (r32 == null) goto L35;
        r4.h(8);
        ((k90) r4).e.writeString(r32);
        return;
    }
}
