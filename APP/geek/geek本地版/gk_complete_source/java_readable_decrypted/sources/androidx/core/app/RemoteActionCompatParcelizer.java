package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p000.j90;
import p000.k90;
import p000.l90;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(j90 j90Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        l90 l90VarM1561g = remoteActionCompat.f442a;
        boolean z = true;
        if (j90Var.mo1559e(1)) {
            l90VarM1561g = j90Var.m1561g();
        }
        remoteActionCompat.f442a = (IconCompat) l90VarM1561g;
        CharSequence charSequence = remoteActionCompat.f443b;
        if (j90Var.mo1559e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((k90) j90Var).f2739e);
        }
        remoteActionCompat.f443b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f444c;
        if (j90Var.mo1559e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((k90) j90Var).f2739e);
        }
        remoteActionCompat.f444c = charSequence2;
        remoteActionCompat.f445d = (PendingIntent) j90Var.m1560f(remoteActionCompat.f445d, 4);
        boolean z2 = remoteActionCompat.f446e;
        if (j90Var.mo1559e(5)) {
            z2 = ((k90) j90Var).f2739e.readInt() != 0;
        }
        remoteActionCompat.f446e = z2;
        boolean z3 = remoteActionCompat.f447f;
        if (!j90Var.mo1559e(6)) {
            z = z3;
        } else if (((k90) j90Var).f2739e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f447f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, j90 j90Var) {
        j90Var.getClass();
        IconCompat iconCompat = remoteActionCompat.f442a;
        j90Var.mo1562h(1);
        j90Var.m1563i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f443b;
        j90Var.mo1562h(2);
        Parcel parcel = ((k90) j90Var).f2739e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f444c;
        j90Var.mo1562h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f445d;
        j90Var.mo1562h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f446e;
        j90Var.mo1562h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f447f;
        j90Var.mo1562h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
