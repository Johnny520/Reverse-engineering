package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.j90;
import defpackage.k90;
import defpackage.l90;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public RemoteActionCompatParcelizer() {
    }

    public static RemoteActionCompat read(j90 r5) {
        RemoteActionCompat r0 = new RemoteActionCompat();
        l90 r1 = r0.a;
        boolean r2 = true;
        if (r5.e(1) == false) goto L6;
        r1 = r5.g();
    L6:
        r0.a = (IconCompat) r1;
        CharSequence r12 = r0.b;
        if (r5.e(2) == false) goto L10;
        r12 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((k90) r5).e);
    L10:
        r0.b = r12;
        CharSequence r13 = r0.c;
        if (r5.e(3) == false) goto L14;
        r13 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((k90) r5).e);
    L14:
        r0.c = r13;
        r0.d = (PendingIntent) r5.f(r0.d, 4);
        boolean r14 = r0.e;
        if (r5.e(5) == true) goto L18;
    L21:
        r0.e = r14;
        boolean r15 = r0.f;
        if (r5.e(6) == true) goto L25;
        r2 = r15;
    L28:
        r0.f = r2;
        return r0;
    L25:
        if (((k90) r5).e.readInt() != 0) goto L28;
        r2 = false;
        goto L28
    L18:
        if (((k90) r5).e.readInt() == 0) goto L20;
        r14 = true;
        goto L21
    L20:
        r14 = false;
        goto L21
    }

    public static void write(RemoteActionCompat r4, j90 r5) {
        r5.getClass();
        IconCompat r0 = r4.a;
        r5.h(1);
        r5.i(r0);
        CharSequence r02 = r4.b;
        r5.h(2);
        Parcel r1 = ((k90) r5).e;
        TextUtils.writeToParcel(r02, r1, 0);
        CharSequence r03 = r4.c;
        r5.h(3);
        TextUtils.writeToParcel(r03, r1, 0);
        PendingIntent r04 = r4.d;
        r5.h(4);
        r1.writeParcelable(r04, 0);
        boolean r05 = r4.e;
        r5.h(5);
        r1.writeInt(r05 ? 1 : 0);
        boolean r42 = r4.f;
        r5.h(6);
        r1.writeInt(r42 ? 1 : 0);
    }
}
