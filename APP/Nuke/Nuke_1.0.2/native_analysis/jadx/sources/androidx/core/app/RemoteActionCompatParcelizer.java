package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p000.ia3;
import p000.ja3;
import p000.ka3;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(ia3 ia3Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        ka3 ka3VarM2314g = remoteActionCompat.f293a;
        boolean z = true;
        if (ia3Var.mo2312e(1)) {
            ka3VarM2314g = ia3Var.m2314g();
        }
        remoteActionCompat.f293a = (IconCompat) ka3VarM2314g;
        CharSequence charSequence = remoteActionCompat.f294b;
        if (ia3Var.mo2312e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((ja3) ia3Var).f4938e);
        }
        remoteActionCompat.f294b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f295c;
        if (ia3Var.mo2312e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((ja3) ia3Var).f4938e);
        }
        remoteActionCompat.f295c = charSequence2;
        remoteActionCompat.f296d = (PendingIntent) ia3Var.m2313f(remoteActionCompat.f296d, 4);
        boolean z2 = remoteActionCompat.f297e;
        if (ia3Var.mo2312e(5)) {
            z2 = ((ja3) ia3Var).f4938e.readInt() != 0;
        }
        remoteActionCompat.f297e = z2;
        boolean z3 = remoteActionCompat.f298f;
        if (!ia3Var.mo2312e(6)) {
            z = z3;
        } else if (((ja3) ia3Var).f4938e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f298f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, ia3 ia3Var) {
        ia3Var.getClass();
        IconCompat iconCompat = remoteActionCompat.f293a;
        ia3Var.mo2315h(1);
        ia3Var.m2316i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f294b;
        ia3Var.mo2315h(2);
        Parcel parcel = ((ja3) ia3Var).f4938e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f295c;
        ia3Var.mo2315h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f296d;
        ia3Var.mo2315h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f297e;
        ia3Var.mo2315h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f298f;
        ia3Var.mo2315h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
