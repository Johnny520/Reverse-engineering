package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p064M1.AbstractC0995b;
import p064M1.C0996c;
import p064M1.InterfaceC0997d;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0995b abstractC0995b) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0997d interfaceC0997dM2046g = remoteActionCompat.f6172a;
        boolean z5 = true;
        if (abstractC0995b.mo2044e(1)) {
            interfaceC0997dM2046g = abstractC0995b.m2046g();
        }
        remoteActionCompat.f6172a = (IconCompat) interfaceC0997dM2046g;
        CharSequence charSequence = remoteActionCompat.f6173b;
        if (abstractC0995b.mo2044e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0996c) abstractC0995b).f3075e);
        }
        remoteActionCompat.f6173b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f6174c;
        if (abstractC0995b.mo2044e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0996c) abstractC0995b).f3075e);
        }
        remoteActionCompat.f6174c = charSequence2;
        remoteActionCompat.f6175d = (PendingIntent) abstractC0995b.m2045f(remoteActionCompat.f6175d, 4);
        boolean z6 = remoteActionCompat.f6176e;
        if (abstractC0995b.mo2044e(5)) {
            z6 = ((C0996c) abstractC0995b).f3075e.readInt() != 0;
        }
        remoteActionCompat.f6176e = z6;
        boolean z7 = remoteActionCompat.f6177f;
        if (!abstractC0995b.mo2044e(6)) {
            z5 = z7;
        } else if (((C0996c) abstractC0995b).f3075e.readInt() == 0) {
            z5 = false;
        }
        remoteActionCompat.f6177f = z5;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0995b abstractC0995b) {
        abstractC0995b.getClass();
        IconCompat iconCompat = remoteActionCompat.f6172a;
        abstractC0995b.mo2047h(1);
        abstractC0995b.m2048i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f6173b;
        abstractC0995b.mo2047h(2);
        Parcel parcel = ((C0996c) abstractC0995b).f3075e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f6174c;
        abstractC0995b.mo2047h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f6175d;
        abstractC0995b.mo2047h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z5 = remoteActionCompat.f6176e;
        abstractC0995b.mo2047h(5);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = remoteActionCompat.f6177f;
        abstractC0995b.mo2047h(6);
        parcel.writeInt(z6 ? 1 : 0);
    }
}
