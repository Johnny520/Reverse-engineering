package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p149.AbstractC7576;
import p149.C7575;
import p149.InterfaceC7574;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC7576 abstractC7576) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC7574 interfaceC7574M12805 = remoteActionCompat.f6428;
        boolean z = true;
        if (abstractC7576.mo12798(1)) {
            interfaceC7574M12805 = abstractC7576.m12805();
        }
        remoteActionCompat.f6428 = (IconCompat) interfaceC7574M12805;
        CharSequence charSequence = remoteActionCompat.f6427;
        if (abstractC7576.mo12798(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C7575) abstractC7576).f20499);
        }
        remoteActionCompat.f6427 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f6426;
        if (abstractC7576.mo12798(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C7575) abstractC7576).f20499);
        }
        remoteActionCompat.f6426 = charSequence2;
        remoteActionCompat.f6425 = (PendingIntent) abstractC7576.m12801(remoteActionCompat.f6425, 4);
        boolean z2 = remoteActionCompat.f6424;
        if (abstractC7576.mo12798(5)) {
            z2 = ((C7575) abstractC7576).f20499.readInt() != 0;
        }
        remoteActionCompat.f6424 = z2;
        boolean z3 = remoteActionCompat.f6423;
        if (!abstractC7576.mo12798(6)) {
            z = z3;
        } else if (((C7575) abstractC7576).f20499.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f6423 = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC7576 abstractC7576) {
        abstractC7576.getClass();
        IconCompat iconCompat = remoteActionCompat.f6428;
        abstractC7576.mo12800(1);
        abstractC7576.m12806(iconCompat);
        CharSequence charSequence = remoteActionCompat.f6427;
        abstractC7576.mo12800(2);
        Parcel parcel = ((C7575) abstractC7576).f20499;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f6426;
        abstractC7576.mo12800(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f6425;
        abstractC7576.mo12800(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f6424;
        abstractC7576.mo12800(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f6423;
        abstractC7576.mo12800(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
