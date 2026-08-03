package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p000.AbstractC0702QD;
import p000.C0744RD;
import p000.InterfaceC0787SD;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public RemoteActionCompatParcelizer() {
    }

    public static RemoteActionCompat read(AbstractC0702QD r5) {
        RemoteActionCompat r0 = new RemoteActionCompat();
        InterfaceC0787SD r1 = r0.f3911a;
        boolean r2 = true;
        if (r5.mo1441e(1) == false) goto L6;
        r1 = r5.m1444h();
    L6:
        r0.f3911a = (IconCompat) r1;
        CharSequence r12 = r0.f3912b;
        if (r5.mo1441e(2) == false) goto L10;
        r12 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0744RD) r5).f2375e);
    L10:
        r0.f3912b = r12;
        CharSequence r13 = r0.f3913c;
        if (r5.mo1441e(3) == false) goto L14;
        r13 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0744RD) r5).f2375e);
    L14:
        r0.f3913c = r13;
        r0.f3914d = (PendingIntent) r5.m1443g(r0.f3914d, 4);
        boolean r14 = r0.f3915e;
        if (r5.mo1441e(5) == true) goto L18;
    L21:
        r0.f3915e = r14;
        boolean r15 = r0.f3916f;
        if (r5.mo1441e(6) == true) goto L25;
        r2 = r15;
    L28:
        r0.f3916f = r2;
        return r0;
    L25:
        if (((C0744RD) r5).f2375e.readInt() != 0) goto L28;
        r2 = false;
        goto L28
    L18:
        if (((C0744RD) r5).f2375e.readInt() == 0) goto L20;
        r14 = true;
        goto L21
    L20:
        r14 = false;
        goto L21
    }

    public static void write(RemoteActionCompat r4, AbstractC0702QD r5) {
        r5.getClass();
        IconCompat r0 = r4.f3911a;
        r5.mo1445i(1);
        r5.m1448l(r0);
        CharSequence r02 = r4.f3912b;
        r5.mo1445i(2);
        Parcel r1 = ((C0744RD) r5).f2375e;
        TextUtils.writeToParcel(r02, r1, 0);
        CharSequence r03 = r4.f3913c;
        r5.mo1445i(3);
        TextUtils.writeToParcel(r03, r1, 0);
        r5.m1447k(r4.f3914d, 4);
        boolean r04 = r4.f3915e;
        r5.mo1445i(5);
        r1.writeInt(r04 ? 1 : 0);
        boolean r42 = r4.f3916f;
        r5.mo1445i(6);
        r1.writeInt(r42 ? 1 : 0);
    }
}
