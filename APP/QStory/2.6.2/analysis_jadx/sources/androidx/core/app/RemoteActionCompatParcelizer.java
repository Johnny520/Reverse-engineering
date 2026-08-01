package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p149.AbstractC7575;
import p149.C7574;
import p149.InterfaceC7573;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC7575 abstractC7575) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC7573 interfaceC7573M12776 = remoteActionCompat.f6427;
        boolean z = true;
        if (abstractC7575.mo12769(1)) {
            interfaceC7573M12776 = abstractC7575.m12776();
        }
        remoteActionCompat.f6427 = (IconCompat) interfaceC7573M12776;
        CharSequence charSequence = remoteActionCompat.f6426;
        if (abstractC7575.mo12769(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C7574) abstractC7575).f20504);
        }
        remoteActionCompat.f6426 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f6425;
        if (abstractC7575.mo12769(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C7574) abstractC7575).f20504);
        }
        remoteActionCompat.f6425 = charSequence2;
        remoteActionCompat.f6424 = (PendingIntent) abstractC7575.m12772(remoteActionCompat.f6424, 4);
        boolean z2 = remoteActionCompat.f6423;
        if (abstractC7575.mo12769(5)) {
            z2 = ((C7574) abstractC7575).f20504.readInt() != 0;
        }
        remoteActionCompat.f6423 = z2;
        boolean z3 = remoteActionCompat.f6422;
        if (!abstractC7575.mo12769(6)) {
            z = z3;
        } else if (((C7574) abstractC7575).f20504.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f6422 = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC7575 abstractC7575) {
        abstractC7575.getClass();
        IconCompat iconCompat = remoteActionCompat.f6427;
        abstractC7575.mo12771(1);
        abstractC7575.m12777(iconCompat);
        CharSequence charSequence = remoteActionCompat.f6426;
        abstractC7575.mo12771(2);
        Parcel parcel = ((C7574) abstractC7575).f20504;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f6425;
        abstractC7575.mo12771(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f6424;
        abstractC7575.mo12771(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f6423;
        abstractC7575.mo12771(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f6422;
        abstractC7575.mo12771(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
