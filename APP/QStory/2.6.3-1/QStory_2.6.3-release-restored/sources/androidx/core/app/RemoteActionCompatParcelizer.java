package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p165.AbstractC8405;
import p165.C8404;
import p165.InterfaceC8403;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC8405 abstractC8405) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC8403 interfaceC8403M13364 = remoteActionCompat.f6773;
        boolean z = true;
        if (abstractC8405.mo13357(1)) {
            interfaceC8403M13364 = abstractC8405.m13364();
        }
        remoteActionCompat.f6773 = (IconCompat) interfaceC8403M13364;
        CharSequence charSequence = remoteActionCompat.f6772;
        if (abstractC8405.mo13357(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C8404) abstractC8405).f20844);
        }
        remoteActionCompat.f6772 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f6771;
        if (abstractC8405.mo13357(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C8404) abstractC8405).f20844);
        }
        remoteActionCompat.f6771 = charSequence2;
        remoteActionCompat.f6770 = (PendingIntent) abstractC8405.m13360(remoteActionCompat.f6770, 4);
        boolean z2 = remoteActionCompat.f6769;
        if (abstractC8405.mo13357(5)) {
            z2 = ((C8404) abstractC8405).f20844.readInt() != 0;
        }
        remoteActionCompat.f6769 = z2;
        boolean z3 = remoteActionCompat.f6768;
        if (!abstractC8405.mo13357(6)) {
            z = z3;
        } else if (((C8404) abstractC8405).f20844.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f6768 = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC8405 abstractC8405) {
        abstractC8405.getClass();
        IconCompat iconCompat = remoteActionCompat.f6773;
        abstractC8405.mo13359(1);
        abstractC8405.m13365(iconCompat);
        CharSequence charSequence = remoteActionCompat.f6772;
        abstractC8405.mo13359(2);
        Parcel parcel = ((C8404) abstractC8405).f20844;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f6771;
        abstractC8405.mo13359(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f6770;
        abstractC8405.mo13359(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f6769;
        abstractC8405.mo13359(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f6768;
        abstractC8405.mo13359(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
