package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import yyds.AbstractC1172;
import yyds.C2664;
import yyds.InterfaceC2636;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1172 abstractC1172) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC2636 interfaceC2636M2365 = remoteActionCompat.f256;
        boolean z = true;
        if (abstractC1172.mo2362(1)) {
            interfaceC2636M2365 = abstractC1172.m2365();
        }
        remoteActionCompat.f256 = (IconCompat) interfaceC2636M2365;
        CharSequence charSequence = remoteActionCompat.f257;
        if (abstractC1172.mo2362(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C2664) abstractC1172).f13073);
        }
        remoteActionCompat.f257 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f258;
        if (abstractC1172.mo2362(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C2664) abstractC1172).f13073);
        }
        remoteActionCompat.f258 = charSequence2;
        remoteActionCompat.f260 = (PendingIntent) abstractC1172.m2367(remoteActionCompat.f260, 4);
        boolean z2 = remoteActionCompat.f255;
        if (abstractC1172.mo2362(5)) {
            z2 = ((C2664) abstractC1172).f13073.readInt() != 0;
        }
        remoteActionCompat.f255 = z2;
        boolean z3 = remoteActionCompat.f259;
        if (!abstractC1172.mo2362(6)) {
            z = z3;
        } else if (((C2664) abstractC1172).f13073.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f259 = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1172 abstractC1172) {
        abstractC1172.getClass();
        IconCompat iconCompat = remoteActionCompat.f256;
        abstractC1172.mo2360(1);
        abstractC1172.m2361(iconCompat);
        CharSequence charSequence = remoteActionCompat.f257;
        abstractC1172.mo2360(2);
        Parcel parcel = ((C2664) abstractC1172).f13073;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f258;
        abstractC1172.mo2360(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f260;
        abstractC1172.mo2360(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f255;
        abstractC1172.mo2360(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f259;
        abstractC1172.mo2360(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
