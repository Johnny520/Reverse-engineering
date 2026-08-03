package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p000.AbstractC0702QD;
import p000.C0744RD;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public IconCompatParcelizer() {
    }

    public static IconCompat read(AbstractC0702QD r5) {
        IconCompat r0 = new IconCompat();
        r0.f3918a = r5.m1442f(r0.f3918a, 1);
        byte[] r1 = r0.f3920c;
        if (r5.mo1441e(2) == false) goto L9;
        Parcel r12 = ((C0744RD) r5).f2375e;
        int r3 = r12.readInt();
        if (r3 >= 0) goto L8;
        r1 = null;
        goto L9
    L8:
        byte[] r32 = new byte[r3];
        r12.readByteArray(r32);
        r1 = r32;
    L9:
        r0.f3920c = r1;
        r0.f3921d = r5.m1443g(r0.f3921d, 3);
        r0.f3922e = r5.m1442f(r0.f3922e, 4);
        r0.f3923f = r5.m1442f(r0.f3923f, 5);
        r0.f3924g = (ColorStateList) r5.m1443g(r0.f3924g, 6);
        String r13 = r0.f3926i;
        if (r5.mo1441e(7) == false) goto L13;
        r13 = ((C0744RD) r5).f2375e.readString();
    L13:
        r0.f3926i = r13;
        String r14 = r0.f3927j;
        if (r5.mo1441e(8) == false) goto L17;
        r14 = ((C0744RD) r5).f2375e.readString();
    L17:
        r0.f3927j = r14;
        r0.f3925h = PorterDuff.Mode.valueOf(r0.f3926i);
        switch(r0.f3918a) {
            case -1: goto L34;
            case 0: goto L27;
            case 1: goto L28;
            case 2: goto L22;
            case 3: goto L20;
            case 4: goto L22;
            case 5: goto L28;
            case 6: goto L22;
            default: goto L27;
        };
    L20:
        r0.f3919b = r0.f3920c;
        return r0;
    L22:
        String r52 = new String(r0.f3920c, Charset.forName("UTF-16"));
        r0.f3919b = r52;
        if (r0.f3918a != 2) goto L27;
        if (r0.f3927j != null) goto L27;
        r0.f3927j = r52.split(":", -1)[0];
        goto L27
    L28:
        Parcelable r53 = r0.f3921d;
        if (r53 == null) goto L32;
        r0.f3919b = r53;
        return r0;
    L32:
        byte[] r54 = r0.f3920c;
        r0.f3919b = r54;
        r0.f3918a = 3;
        r0.f3922e = 0;
        r0.f3923f = r54.length;
        return r0;
    L34:
        Parcelable r55 = r0.f3921d;
        if (r55 == null) goto L39;
        r0.f3919b = r55;
        return r0;
    L39:
        throw new IllegalArgumentException("Invalid icon");
    L27:
        return r0;
    }

    public static void write(IconCompat r3, AbstractC0702QD r4) {
        r4.getClass();
        r3.f3926i = r3.f3925h.name();
        switch(r3.f3918a) {
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
        r3.f3920c = r3.f3919b.toString().getBytes(Charset.forName("UTF-16"));
        goto L10
    L6:
        r3.f3920c = (byte[]) r3.f3919b;
        goto L10
    L7:
        r3.f3920c = ((String) r3.f3919b).getBytes(Charset.forName("UTF-16"));
        goto L10
    L8:
        r3.f3921d = (Parcelable) r3.f3919b;
        goto L10
    L9:
        r3.f3921d = (Parcelable) r3.f3919b;
    L10:
        int r0 = r3.f3918a;
        if ((-1) == r0) goto L13;
        r4.m1446j(r0, 1);
    L13:
        byte[] r02 = r3.f3920c;
        if (r02 == null) goto L16;
        r4.mo1445i(2);
        Parcel r1 = ((C0744RD) r4).f2375e;
        r1.writeInt(r02.length);
        r1.writeByteArray(r02);
    L16:
        Parcelable r03 = r3.f3921d;
        if (r03 == null) goto L19;
        r4.m1447k(r03, 3);
    L19:
        int r04 = r3.f3922e;
        if (r04 == 0) goto L22;
        r4.m1446j(r04, 4);
    L22:
        int r05 = r3.f3923f;
        if (r05 == 0) goto L25;
        r4.m1446j(r05, 5);
    L25:
        ColorStateList r06 = r3.f3924g;
        if (r06 == null) goto L28;
        r4.m1447k(r06, 6);
    L28:
        String r07 = r3.f3926i;
        if (r07 == null) goto L31;
        r4.mo1445i(7);
        ((C0744RD) r4).f2375e.writeString(r07);
    L31:
        String r32 = r3.f3927j;
        if (r32 == null) goto L35;
        r4.mo1445i(8);
        ((C0744RD) r4).f2375e.writeString(r32);
        return;
    }
}
