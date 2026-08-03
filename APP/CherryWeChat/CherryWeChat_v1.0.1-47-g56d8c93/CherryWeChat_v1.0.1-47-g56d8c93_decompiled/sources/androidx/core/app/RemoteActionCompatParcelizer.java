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
    public static RemoteActionCompat read(AbstractC0702QD abstractC0702QD) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0787SD interfaceC0787SDM1444h = remoteActionCompat.f3911a;
        boolean z = true;
        if (abstractC0702QD.mo1441e(1)) {
            interfaceC0787SDM1444h = abstractC0702QD.m1444h();
        }
        remoteActionCompat.f3911a = (IconCompat) interfaceC0787SDM1444h;
        CharSequence charSequence = remoteActionCompat.f3912b;
        if (abstractC0702QD.mo1441e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0744RD) abstractC0702QD).f2375e);
        }
        remoteActionCompat.f3912b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f3913c;
        if (abstractC0702QD.mo1441e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0744RD) abstractC0702QD).f2375e);
        }
        remoteActionCompat.f3913c = charSequence2;
        remoteActionCompat.f3914d = (PendingIntent) abstractC0702QD.m1443g(remoteActionCompat.f3914d, 4);
        boolean z2 = remoteActionCompat.f3915e;
        if (abstractC0702QD.mo1441e(5)) {
            z2 = ((C0744RD) abstractC0702QD).f2375e.readInt() != 0;
        }
        remoteActionCompat.f3915e = z2;
        boolean z3 = remoteActionCompat.f3916f;
        if (!abstractC0702QD.mo1441e(6)) {
            z = z3;
        } else if (((C0744RD) abstractC0702QD).f2375e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f3916f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0702QD abstractC0702QD) {
        abstractC0702QD.getClass();
        IconCompat iconCompat = remoteActionCompat.f3911a;
        abstractC0702QD.mo1445i(1);
        abstractC0702QD.m1448l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f3912b;
        abstractC0702QD.mo1445i(2);
        Parcel parcel = ((C0744RD) abstractC0702QD).f2375e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f3913c;
        abstractC0702QD.mo1445i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC0702QD.m1447k(remoteActionCompat.f3914d, 4);
        boolean z = remoteActionCompat.f3915e;
        abstractC0702QD.mo1445i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f3916f;
        abstractC0702QD.mo1445i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
