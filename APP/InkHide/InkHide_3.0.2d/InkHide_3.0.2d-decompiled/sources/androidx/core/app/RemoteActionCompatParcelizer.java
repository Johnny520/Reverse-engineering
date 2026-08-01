package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p032Q.AbstractC0238a;
import p032Q.C0239b;
import p032Q.InterfaceC0240c;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static RemoteActionCompat read(AbstractC0238a abstractC0238a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0240c interfaceC0240cM455g = remoteActionCompat.f1116a;
        boolean z2 = true;
        if (abstractC0238a.mo453e(1)) {
            interfaceC0240cM455g = abstractC0238a.m455g();
        }
        remoteActionCompat.f1116a = (IconCompat) interfaceC0240cM455g;
        CharSequence charSequence = remoteActionCompat.f1117b;
        if (abstractC0238a.mo453e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0239b) abstractC0238a).f576e);
        }
        remoteActionCompat.f1117b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1118c;
        if (abstractC0238a.mo453e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0239b) abstractC0238a).f576e);
        }
        remoteActionCompat.f1118c = charSequence2;
        remoteActionCompat.f1119d = (PendingIntent) abstractC0238a.m454f(remoteActionCompat.f1119d, 4);
        boolean z3 = remoteActionCompat.f1120e;
        if (abstractC0238a.mo453e(5)) {
            z3 = ((C0239b) abstractC0238a).f576e.readInt() != 0;
        }
        remoteActionCompat.f1120e = z3;
        boolean z4 = remoteActionCompat.f1121f;
        if (!abstractC0238a.mo453e(6)) {
            z2 = z4;
        } else if (((C0239b) abstractC0238a).f576e.readInt() == 0) {
            z2 = false;
        }
        remoteActionCompat.f1121f = z2;
        return remoteActionCompat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0238a abstractC0238a) {
        abstractC0238a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1116a;
        abstractC0238a.mo456h(1);
        abstractC0238a.m457i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1117b;
        abstractC0238a.mo456h(2);
        Parcel parcel = ((C0239b) abstractC0238a).f576e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1118c;
        abstractC0238a.mo456h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1119d;
        abstractC0238a.mo456h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1120e;
        abstractC0238a.mo456h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1121f;
        abstractC0238a.mo456h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
