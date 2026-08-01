package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p000.xb1;
import p000.yb1;
import p000.zb1;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static RemoteActionCompat read(xb1 xb1Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        zb1 zb1VarM5120g = remoteActionCompat.f199a;
        boolean z = true;
        if (xb1Var.mo5118e(1)) {
            zb1VarM5120g = xb1Var.m5120g();
        }
        remoteActionCompat.f199a = (IconCompat) zb1VarM5120g;
        CharSequence charSequence = remoteActionCompat.f200b;
        if (xb1Var.mo5118e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((yb1) xb1Var).f7602e);
        }
        remoteActionCompat.f200b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f201c;
        if (xb1Var.mo5118e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((yb1) xb1Var).f7602e);
        }
        remoteActionCompat.f201c = charSequence2;
        remoteActionCompat.f202d = (PendingIntent) xb1Var.m5119f(remoteActionCompat.f202d, 4);
        boolean z2 = remoteActionCompat.f203e;
        if (xb1Var.mo5118e(5)) {
            z2 = ((yb1) xb1Var).f7602e.readInt() != 0;
        }
        remoteActionCompat.f203e = z2;
        boolean z3 = remoteActionCompat.f204f;
        if (!xb1Var.mo5118e(6)) {
            z = z3;
        } else if (((yb1) xb1Var).f7602e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f204f = z;
        return remoteActionCompat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void write(RemoteActionCompat remoteActionCompat, xb1 xb1Var) {
        xb1Var.getClass();
        IconCompat iconCompat = remoteActionCompat.f199a;
        xb1Var.mo5121h(1);
        xb1Var.m5122i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f200b;
        xb1Var.mo5121h(2);
        Parcel parcel = ((yb1) xb1Var).f7602e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f201c;
        xb1Var.mo5121h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f202d;
        xb1Var.mo5121h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f203e;
        xb1Var.mo5121h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f204f;
        xb1Var.mo5121h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
