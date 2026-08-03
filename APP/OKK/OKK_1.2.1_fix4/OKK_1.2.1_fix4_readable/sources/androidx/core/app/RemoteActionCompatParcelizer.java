package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p047a0.AbstractC0471a;
import p047a0.C0472b;
import p047a0.InterfaceC0473c;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0471a abstractC0471a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0473c interfaceC0473cM1108g = remoteActionCompat.f1297a;
        if (abstractC0471a.mo1106e(1)) {
            interfaceC0473cM1108g = abstractC0471a.m1108g();
        }
        remoteActionCompat.f1297a = (IconCompat) interfaceC0473cM1108g;
        CharSequence charSequence = remoteActionCompat.f1298b;
        if (abstractC0471a.mo1106e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0472b) abstractC0471a).f1054e);
        }
        remoteActionCompat.f1298b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1299c;
        if (abstractC0471a.mo1106e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0472b) abstractC0471a).f1054e);
        }
        remoteActionCompat.f1299c = charSequence2;
        remoteActionCompat.f1300d = (PendingIntent) abstractC0471a.m1107f(remoteActionCompat.f1300d, 4);
        boolean z2 = remoteActionCompat.f1301e;
        if (abstractC0471a.mo1106e(5)) {
            z2 = ((C0472b) abstractC0471a).f1054e.readInt() != 0;
        }
        remoteActionCompat.f1301e = z2;
        boolean z3 = remoteActionCompat.f1302f;
        if (abstractC0471a.mo1106e(6)) {
            z3 = ((C0472b) abstractC0471a).f1054e.readInt() != 0;
        }
        remoteActionCompat.f1302f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0471a abstractC0471a) {
        abstractC0471a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1297a;
        abstractC0471a.mo1109h(1);
        abstractC0471a.m1110i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1298b;
        abstractC0471a.mo1109h(2);
        Parcel parcel = ((C0472b) abstractC0471a).f1054e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1299c;
        abstractC0471a.mo1109h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1300d;
        abstractC0471a.mo1109h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1301e;
        abstractC0471a.mo1109h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1302f;
        abstractC0471a.mo1109h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
