package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.ia3;
import defpackage.ja3;
import defpackage.ka3;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static RemoteActionCompat read(ia3 ia3Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        ka3 ka3VarG = remoteActionCompat.a;
        boolean z = true;
        if (ia3Var.e(1)) {
            ka3VarG = ia3Var.g();
        }
        remoteActionCompat.a = (IconCompat) ka3VarG;
        CharSequence charSequence = remoteActionCompat.b;
        if (ia3Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((ja3) ia3Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (ia3Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((ja3) ia3Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) ia3Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (ia3Var.e(5)) {
            z2 = ((ja3) ia3Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!ia3Var.e(6)) {
            z = z3;
        } else if (((ja3) ia3Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void write(RemoteActionCompat remoteActionCompat, ia3 ia3Var) {
        ia3Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        ia3Var.h(1);
        ia3Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        ia3Var.h(2);
        Parcel parcel = ((ja3) ia3Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        ia3Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        ia3Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        ia3Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        ia3Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
