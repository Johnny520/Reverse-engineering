package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p375z3.AbstractC6084b;
import p375z3.C6085c;
import p375z3.InterfaceC6086d;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static RemoteActionCompat read(AbstractC6084b abstractC6084b) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC6086d interfaceC6086dM10822g = remoteActionCompat.f256a;
        boolean z9 = true;
        if (abstractC6084b.mo10820e(1)) {
            interfaceC6086dM10822g = abstractC6084b.m10822g();
        }
        remoteActionCompat.f256a = (IconCompat) interfaceC6086dM10822g;
        CharSequence charSequence = remoteActionCompat.f257b;
        if (abstractC6084b.mo10820e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C6085c) abstractC6084b).f24582e);
        }
        remoteActionCompat.f257b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f258c;
        if (abstractC6084b.mo10820e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C6085c) abstractC6084b).f24582e);
        }
        remoteActionCompat.f258c = charSequence2;
        remoteActionCompat.f259d = (PendingIntent) abstractC6084b.m10821f(remoteActionCompat.f259d, 4);
        boolean z10 = remoteActionCompat.f260e;
        if (abstractC6084b.mo10820e(5)) {
            z10 = ((C6085c) abstractC6084b).f24582e.readInt() != 0;
        }
        remoteActionCompat.f260e = z10;
        boolean z11 = remoteActionCompat.f261f;
        if (!abstractC6084b.mo10820e(6)) {
            z9 = z11;
        } else if (((C6085c) abstractC6084b).f24582e.readInt() == 0) {
            z9 = false;
        }
        remoteActionCompat.f261f = z9;
        return remoteActionCompat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void write(RemoteActionCompat remoteActionCompat, AbstractC6084b abstractC6084b) {
        abstractC6084b.getClass();
        IconCompat iconCompat = remoteActionCompat.f256a;
        abstractC6084b.mo10823h(1);
        abstractC6084b.m10824i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f257b;
        abstractC6084b.mo10823h(2);
        Parcel parcel = ((C6085c) abstractC6084b).f24582e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f258c;
        abstractC6084b.mo10823h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f259d;
        abstractC6084b.mo10823h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z9 = remoteActionCompat.f260e;
        abstractC6084b.mo10823h(5);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = remoteActionCompat.f261f;
        abstractC6084b.mo10823h(6);
        parcel.writeInt(z10 ? 1 : 0);
    }
}
