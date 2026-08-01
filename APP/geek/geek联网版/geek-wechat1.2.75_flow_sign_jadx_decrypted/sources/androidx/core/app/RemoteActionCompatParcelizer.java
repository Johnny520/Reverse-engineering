package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p000.o90;
import p000.p90;
import p000.q90;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(o90 o90Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        q90 q90VarM1998g = remoteActionCompat.f405a;
        boolean z = true;
        if (o90Var.mo1996e(1)) {
            q90VarM1998g = o90Var.m1998g();
        }
        remoteActionCompat.f405a = (IconCompat) q90VarM1998g;
        CharSequence charSequence = remoteActionCompat.f406b;
        if (o90Var.mo1996e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((p90) o90Var).f3626e);
        }
        remoteActionCompat.f406b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f407c;
        if (o90Var.mo1996e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((p90) o90Var).f3626e);
        }
        remoteActionCompat.f407c = charSequence2;
        remoteActionCompat.f408d = (PendingIntent) o90Var.m1997f(remoteActionCompat.f408d, 4);
        boolean z2 = remoteActionCompat.f409e;
        if (o90Var.mo1996e(5)) {
            z2 = ((p90) o90Var).f3626e.readInt() != 0;
        }
        remoteActionCompat.f409e = z2;
        boolean z3 = remoteActionCompat.f410f;
        if (!o90Var.mo1996e(6)) {
            z = z3;
        } else if (((p90) o90Var).f3626e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f410f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, o90 o90Var) {
        o90Var.getClass();
        IconCompat iconCompat = remoteActionCompat.f405a;
        o90Var.mo1999h(1);
        o90Var.m2000i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f406b;
        o90Var.mo1999h(2);
        Parcel parcel = ((p90) o90Var).f3626e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f407c;
        o90Var.mo1999h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f408d;
        o90Var.mo1999h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f409e;
        o90Var.mo1999h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f410f;
        o90Var.mo1999h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
