package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p047a0.AbstractC0471a;
import p047a0.C0472b;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public IconCompatParcelizer() {
    }

    public static IconCompat read(AbstractC0471a r5) {
        IconCompat r02 = new IconCompat();
        int r1 = r02.f1304a;
        if (r5.mo1106e(1) == false) goto L6;
        r1 = ((C0472b) r5).f1054e.readInt();
    L6:
        r02.f1304a = r1;
        byte[] r12 = r02.f1306c;
        if (r5.mo1106e(2) == false) goto L13;
        Parcel r13 = ((C0472b) r5).f1054e;
        int r3 = r13.readInt();
        if (r3 >= 0) goto L12;
        r12 = null;
        goto L13
    L12:
        byte[] r32 = new byte[r3];
        r13.readByteArray(r32);
        r12 = r32;
    L13:
        r02.f1306c = r12;
        r02.f1307d = r5.m1107f(r02.f1307d, 3);
        int r14 = r02.f1308e;
        if (r5.mo1106e(4) == false) goto L17;
        r14 = ((C0472b) r5).f1054e.readInt();
    L17:
        r02.f1308e = r14;
        int r15 = r02.f1309f;
        if (r5.mo1106e(5) == false) goto L21;
        r15 = ((C0472b) r5).f1054e.readInt();
    L21:
        r02.f1309f = r15;
        r02.f1310g = (ColorStateList) r5.m1107f(r02.f1310g, 6);
        String r16 = r02.f1312i;
        if (r5.mo1106e(7) == false) goto L25;
        r16 = ((C0472b) r5).f1054e.readString();
    L25:
        r02.f1312i = r16;
        String r17 = r02.f1313j;
        if (r5.mo1106e(8) == false) goto L29;
        r17 = ((C0472b) r5).f1054e.readString();
    L29:
        r02.f1313j = r17;
        r02.f1311h = PorterDuff.Mode.valueOf(r02.f1312i);
        switch(r02.f1304a) {
            case -1: goto L42;
            case 0: goto L45;
            case 1: goto L38;
            case 2: goto L33;
            case 3: goto L32;
            case 4: goto L33;
            case 5: goto L38;
            case 6: goto L33;
            default: goto L45;
        };
    L32:
        r02.f1305b = r02.f1306c;
        goto L45
    L33:
        String r52 = new String(r02.f1306c, Charset.forName("UTF-16"));
        r02.f1305b = r52;
        if (r02.f1304a != 2) goto L45;
        if (r02.f1313j != null) goto L45;
        r02.f1313j = r52.split(":", -1)[0];
        goto L45
    L38:
        Parcelable r53 = r02.f1307d;
        if (r53 == null) goto L41;
        r02.f1305b = r53;
        goto L45
    L41:
        byte[] r54 = r02.f1306c;
        r02.f1305b = r54;
        r02.f1304a = 3;
        r02.f1308e = 0;
        r02.f1309f = r54.length;
        goto L45
    L42:
        Parcelable r55 = r02.f1307d;
        if (r55 == null) goto L47;
        r02.f1305b = r55;
        goto L45
    L47:
        throw new IllegalArgumentException("Invalid icon");
    L45:
        return r02;
    }

    public static void write(IconCompat r3, AbstractC0471a r4) {
        r4.getClass();
        r3.f1312i = r3.f1311h.name();
        switch(r3.f1304a) {
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
        r3.f1306c = r3.f1305b.toString().getBytes(Charset.forName("UTF-16"));
        goto L10
    L6:
        r3.f1306c = (byte[]) r3.f1305b;
        goto L10
    L7:
        r3.f1306c = ((String) r3.f1305b).getBytes(Charset.forName("UTF-16"));
        goto L10
    L8:
        r3.f1307d = (Parcelable) r3.f1305b;
        goto L10
    L9:
        r3.f1307d = (Parcelable) r3.f1305b;
    L10:
        int r02 = r3.f1304a;
        if ((-1) == r02) goto L13;
        r4.mo1109h(1);
        ((C0472b) r4).f1054e.writeInt(r02);
    L13:
        byte[] r03 = r3.f1306c;
        if (r03 == null) goto L16;
        r4.mo1109h(2);
        int r2 = r03.length;
        Parcel r1 = ((C0472b) r4).f1054e;
        r1.writeInt(r2);
        r1.writeByteArray(r03);
    L16:
        Parcelable r04 = r3.f1307d;
        if (r04 == null) goto L19;
        r4.mo1109h(3);
        ((C0472b) r4).f1054e.writeParcelable(r04, 0);
    L19:
        int r05 = r3.f1308e;
        if (r05 == 0) goto L22;
        r4.mo1109h(4);
        ((C0472b) r4).f1054e.writeInt(r05);
    L22:
        int r06 = r3.f1309f;
        if (r06 == 0) goto L25;
        r4.mo1109h(5);
        ((C0472b) r4).f1054e.writeInt(r06);
    L25:
        ColorStateList r07 = r3.f1310g;
        if (r07 == null) goto L28;
        r4.mo1109h(6);
        ((C0472b) r4).f1054e.writeParcelable(r07, 0);
    L28:
        String r08 = r3.f1312i;
        if (r08 == null) goto L31;
        r4.mo1109h(7);
        ((C0472b) r4).f1054e.writeString(r08);
    L31:
        String r32 = r3.f1313j;
        if (r32 == null) goto L35;
        r4.mo1109h(8);
        ((C0472b) r4).f1054e.writeString(r32);
        return;
    }
}
